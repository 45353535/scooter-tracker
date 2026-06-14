package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes7.dex */
final class RtspClient implements Closeable, AutoCloseable {
    private static final long DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_MS = 30000;
    public static final int RTSP_STATE_INIT = 0;
    public static final int RTSP_STATE_PLAYING = 2;
    public static final int RTSP_STATE_READY = 1;
    public static final int RTSP_STATE_UNINITIALIZED = -1;
    private static final String TAG = "RtspClient";
    private final boolean debugLoggingEnabled;
    private boolean hasPendingPauseRequest;
    private boolean hasUpdatedTimelineAndTracks;

    @Nullable
    private KeepAliveMonitor keepAliveMonitor;
    private final PlaybackEventListener playbackEventListener;
    private boolean receivedAuthorizationRequest;

    @Nullable
    private RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo;

    @Nullable
    private RtspAuthenticationInfo rtspAuthenticationInfo;

    @Nullable
    private String sessionId;
    private final SessionInfoListener sessionInfoListener;
    private final SocketFactory socketFactory;
    private Uri uri;
    private final String userAgent;
    private final ArrayDeque<RtspMediaPeriod.RtpLoadInfo> pendingSetupRtpLoadInfos = new ArrayDeque<>();
    private final SparseArray<RtspRequest> pendingRequests = new SparseArray<>();
    private final MessageSender messageSender = new MessageSender();
    private RtspMessageChannel messageChannel = new RtspMessageChannel(new MessageListener());
    private long pendingSeekPositionUs = -9223372036854775807L;
    private int rtspState = -1;

    private final class KeepAliveMonitor implements Runnable, Closeable, AutoCloseable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler = Util.createHandlerForCurrentLooper();

        public KeepAliveMonitor(long j10) {
            this.intervalMs = j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.isStarted = false;
            this.keepAliveHandler.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            RtspClient.this.messageSender.sendOptionsRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }

        public void start() {
            if (this.isStarted) {
                return;
            }
            this.isStarted = true;
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class MessageListener implements RtspMessageChannel.MessageListener {
        private final Handler messageHandler = Util.createHandlerForCurrentLooper();

        public MessageListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleRtspMessage(List<String> list) {
            RtspClient.this.maybeLogMessage(list);
            if (RtspMessageUtil.isRtspResponse(list)) {
                handleRtspResponse(list);
            } else {
                handleRtspRequest(list);
            }
        }

        private void handleRtspRequest(List<String> list) {
            RtspClient.this.messageSender.sendMethodNotAllowedResponse(Integer.parseInt((String) Assertions.checkNotNull(RtspMessageUtil.parseRequest(list).headers.get(RtspHeaders.CSEQ))));
        }

        private void handleRtspResponse(List<String> list) {
            int i10;
            ImmutableList<RtspTrackTiming> immutableListOf;
            RtspResponse response = RtspMessageUtil.parseResponse(list);
            int i11 = Integer.parseInt((String) Assertions.checkNotNull(response.headers.get(RtspHeaders.CSEQ)));
            RtspRequest rtspRequest = (RtspRequest) RtspClient.this.pendingRequests.get(i11);
            if (rtspRequest == null) {
                return;
            }
            RtspClient.this.pendingRequests.remove(i11);
            int i12 = rtspRequest.method;
            try {
                i10 = response.status;
            } catch (ParserException e10) {
                RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e10));
                return;
            }
            if (i10 == 200) {
                switch (i12) {
                    case 1:
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                        return;
                    case 2:
                        onDescribeResponseReceived(new RtspDescribeResponse(i10, SessionDescriptionParser.parse(response.messageBody)));
                        return;
                    case 4:
                        onOptionsResponseReceived(new RtspOptionsResponse(i10, RtspMessageUtil.parsePublicHeader(response.headers.get(RtspHeaders.PUBLIC))));
                        return;
                    case 5:
                        onPauseResponseReceived();
                        return;
                    case 6:
                        String str = response.headers.get("Range");
                        RtspSessionTiming timing = str == null ? RtspSessionTiming.DEFAULT : RtspSessionTiming.parseTiming(str);
                        try {
                            String str2 = response.headers.get(RtspHeaders.RTP_INFO);
                            immutableListOf = str2 == null ? ImmutableList.of() : RtspTrackTiming.parseTrackTiming(str2, RtspClient.this.uri);
                        } catch (ParserException unused) {
                            immutableListOf = ImmutableList.of();
                        }
                        onPlayResponseReceived(new RtspPlayResponse(response.status, timing, immutableListOf));
                        return;
                    case 10:
                        String str3 = response.headers.get(RtspHeaders.SESSION);
                        String str4 = response.headers.get(RtspHeaders.TRANSPORT);
                        if (str3 == null || str4 == null) {
                            throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", null);
                        }
                        onSetupResponseReceived(new RtspSetupResponse(response.status, RtspMessageUtil.parseSessionHeader(str3), str4));
                        return;
                    default:
                        throw new IllegalStateException();
                }
                RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e10));
                return;
            }
            if (i10 != 401) {
                if (i10 == 301 || i10 == 302) {
                    if (RtspClient.this.rtspState != -1) {
                        RtspClient.this.rtspState = 0;
                    }
                    String str5 = response.headers.get("Location");
                    if (str5 == null) {
                        RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("Redirection without new location.", null);
                        return;
                    }
                    Uri uri = Uri.parse(str5);
                    RtspClient.this.uri = RtspMessageUtil.removeUserInfo(uri);
                    RtspClient.this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
                    RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
                    return;
                }
            } else if (RtspClient.this.rtspAuthUserInfo != null && !RtspClient.this.receivedAuthorizationRequest) {
                ImmutableList<String> immutableListValues = response.headers.values("WWW-Authenticate");
                if (immutableListValues.isEmpty()) {
                    throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", null);
                }
                for (int i13 = 0; i13 < immutableListValues.size(); i13++) {
                    RtspClient.this.rtspAuthenticationInfo = RtspMessageUtil.parseWwwAuthenticateHeader(immutableListValues.get(i13));
                    if (RtspClient.this.rtspAuthenticationInfo.authenticationMechanism == 2) {
                        break;
                    }
                }
                RtspClient.this.messageSender.retryLastRequest();
                RtspClient.this.receivedAuthorizationRequest = true;
                return;
            }
            RtspClient rtspClient = RtspClient.this;
            String methodString = RtspMessageUtil.toMethodString(i12);
            int i14 = response.status;
            StringBuilder sb2 = new StringBuilder(String.valueOf(methodString).length() + 12);
            sb2.append(methodString);
            sb2.append(" ");
            sb2.append(i14);
            rtspClient.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(sb2.toString()));
        }

        private void onDescribeResponseReceived(RtspDescribeResponse rtspDescribeResponse) {
            RtspSessionTiming timing = RtspSessionTiming.DEFAULT;
            String str = rtspDescribeResponse.sessionDescription.attributes.get(SessionDescription.ATTR_RANGE);
            if (str != null) {
                try {
                    timing = RtspSessionTiming.parseTiming(str);
                } catch (ParserException e10) {
                    RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("SDP format error.", e10);
                    return;
                }
            }
            ImmutableList<RtspMediaTrack> immutableListBuildTrackList = RtspClient.buildTrackList(rtspDescribeResponse.sessionDescription, RtspClient.this.uri);
            if (immutableListBuildTrackList.isEmpty()) {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("No playable track.", null);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineUpdated(timing, immutableListBuildTrackList);
                RtspClient.this.hasUpdatedTimelineAndTracks = true;
            }
        }

        private void onOptionsResponseReceived(RtspOptionsResponse rtspOptionsResponse) {
            if (RtspClient.this.keepAliveMonitor != null) {
                return;
            }
            if (RtspClient.serverSupportsDescribe(rtspOptionsResponse.supportedMethods)) {
                RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("DESCRIBE not supported.", null);
            }
        }

        private void onPauseResponseReceived() {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            RtspClient.this.rtspState = 1;
            RtspClient.this.hasPendingPauseRequest = false;
            if (RtspClient.this.pendingSeekPositionUs != -9223372036854775807L) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.startPlayback(Util.usToMs(rtspClient.pendingSeekPositionUs));
            }
        }

        private void onPlayResponseReceived(RtspPlayResponse rtspPlayResponse) {
            Assertions.checkState(RtspClient.this.rtspState == 1);
            RtspClient.this.rtspState = 2;
            if (RtspClient.this.keepAliveMonitor == null) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.keepAliveMonitor = rtspClient.new KeepAliveMonitor(30000L);
                RtspClient.this.keepAliveMonitor.start();
            }
            RtspClient.this.pendingSeekPositionUs = -9223372036854775807L;
            RtspClient.this.playbackEventListener.onPlaybackStarted(Util.msToUs(rtspPlayResponse.sessionTiming.startTimeMs), rtspPlayResponse.trackTimingList);
        }

        private void onSetupResponseReceived(RtspSetupResponse rtspSetupResponse) {
            Assertions.checkState(RtspClient.this.rtspState != -1);
            RtspClient.this.rtspState = 1;
            RtspClient.this.sessionId = rtspSetupResponse.sessionHeader.sessionId;
            RtspClient.this.continueSetupRtspTrack();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onReceivingFailed(Exception exc) {
            i.a(this, exc);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(final List<String> list) {
            this.messageHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25117b.handleRtspMessage(list);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onSendingFailed(List list, Exception exc) {
            i.b(this, list, exc);
        }
    }

    private final class MessageSender {
        private int cSeq;
        private RtspRequest lastRequest;

        private MessageSender() {
        }

        private RtspRequest getRequestWithCommonHeaders(int i10, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = RtspClient.this.userAgent;
            int i11 = this.cSeq;
            this.cSeq = i11 + 1;
            RtspHeaders.Builder builder = new RtspHeaders.Builder(str2, str, i11);
            if (RtspClient.this.rtspAuthenticationInfo != null) {
                Assertions.checkStateNotNull(RtspClient.this.rtspAuthUserInfo);
                try {
                    builder.add("Authorization", RtspClient.this.rtspAuthenticationInfo.getAuthorizationHeaderValue(RtspClient.this.rtspAuthUserInfo, uri, i10));
                } catch (ParserException e10) {
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e10));
                }
            }
            builder.addAll(map);
            return new RtspRequest(uri, i10, builder.build(), "");
        }

        private void sendRequest(RtspRequest rtspRequest) {
            int i10 = Integer.parseInt((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.CSEQ)));
            Assertions.checkState(RtspClient.this.pendingRequests.get(i10) == null);
            RtspClient.this.pendingRequests.append(i10, rtspRequest);
            ImmutableList<String> immutableListSerializeRequest = RtspMessageUtil.serializeRequest(rtspRequest);
            RtspClient.this.maybeLogMessage(immutableListSerializeRequest);
            RtspClient.this.messageChannel.send(immutableListSerializeRequest);
            this.lastRequest = rtspRequest;
        }

        private void sendResponse(RtspResponse rtspResponse) {
            ImmutableList<String> immutableListSerializeResponse = RtspMessageUtil.serializeResponse(rtspResponse);
            RtspClient.this.maybeLogMessage(immutableListSerializeResponse);
            RtspClient.this.messageChannel.send(immutableListSerializeResponse);
        }

        public void retryLastRequest() {
            Assertions.checkStateNotNull(this.lastRequest);
            ImmutableListMultimap<String, String> immutableListMultimapAsMultiMap = this.lastRequest.headers.asMultiMap();
            HashMap map = new HashMap();
            for (String str : immutableListMultimapAsMultiMap.keySet()) {
                if (!str.equals(RtspHeaders.CSEQ) && !str.equals("User-Agent") && !str.equals(RtspHeaders.SESSION) && !str.equals("Authorization")) {
                    map.put(str, (String) Iterables.getLast(immutableListMultimapAsMultiMap.get(str)));
                }
            }
            sendRequest(getRequestWithCommonHeaders(this.lastRequest.method, RtspClient.this.sessionId, map, this.lastRequest.uri));
        }

        public void sendDescribeRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(2, str, ImmutableMap.of(), uri));
        }

        public void sendMethodNotAllowedResponse(int i10) {
            sendResponse(new RtspResponse(405, new RtspHeaders.Builder(RtspClient.this.userAgent, RtspClient.this.sessionId, i10).build()));
            this.cSeq = Math.max(this.cSeq, i10 + 1);
        }

        public void sendOptionsRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(4, str, ImmutableMap.of(), uri));
        }

        public void sendPauseRequest(Uri uri, String str) {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            sendRequest(getRequestWithCommonHeaders(5, str, ImmutableMap.of(), uri));
            RtspClient.this.hasPendingPauseRequest = true;
        }

        public void sendPlayRequest(Uri uri, long j10, String str) {
            boolean z10 = true;
            if (RtspClient.this.rtspState != 1 && RtspClient.this.rtspState != 2) {
                z10 = false;
            }
            Assertions.checkState(z10);
            sendRequest(getRequestWithCommonHeaders(6, str, ImmutableMap.of("Range", RtspSessionTiming.getOffsetStartTimeTiming(j10)), uri));
        }

        public void sendSetupRequest(Uri uri, String str, @Nullable String str2) {
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(10, str2, ImmutableMap.of(RtspHeaders.TRANSPORT, str), uri));
        }

        public void sendTeardownRequest(Uri uri, String str) {
            if (RtspClient.this.rtspState == -1 || RtspClient.this.rtspState == 0) {
                return;
            }
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(12, str, ImmutableMap.of(), uri));
        }
    }

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void onPlaybackStarted(long j10, ImmutableList<RtspTrackTiming> immutableList);

        void onRtspSetupCompleted();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RtspState {
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String str, @Nullable Throwable th2);

        void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList);
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String str, Uri uri, SocketFactory socketFactory, boolean z10) {
        this.sessionInfoListener = sessionInfoListener;
        this.playbackEventListener = playbackEventListener;
        this.userAgent = str;
        this.socketFactory = socketFactory;
        this.debugLoggingEnabled = z10;
        this.uri = RtspMessageUtil.removeUserInfo(uri);
        this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<RtspMediaTrack> buildTrackList(SessionDescription sessionDescription, Uri uri) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i10 = 0; i10 < sessionDescription.mediaDescriptionList.size(); i10++) {
            MediaDescription mediaDescription = sessionDescription.mediaDescriptionList.get(i10);
            if (RtpPayloadFormat.isFormatSupported(mediaDescription)) {
                builder.add(new RtspMediaTrack(mediaDescription, uri));
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueSetupRtspTrack() {
        RtspMediaPeriod.RtpLoadInfo rtpLoadInfoPollFirst = this.pendingSetupRtpLoadInfos.pollFirst();
        if (rtpLoadInfoPollFirst == null) {
            this.playbackEventListener.onRtspSetupCompleted();
        } else {
            this.messageSender.sendSetupRequest(rtpLoadInfoPollFirst.getTrackUri(), rtpLoadInfoPollFirst.getTransport(), this.sessionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRtspError(Throwable th2) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th2 instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th2 : new RtspMediaSource.RtspPlaybackException(th2);
        if (this.hasUpdatedTimelineAndTracks) {
            this.playbackEventListener.onPlaybackError(rtspPlaybackException);
        } else {
            this.sessionInfoListener.onSessionTimelineRequestFailed(Strings.nullToEmpty(th2.getMessage()), th2);
        }
    }

    private Socket getSocket(Uri uri) throws IOException {
        Assertions.checkArgument(uri.getHost() != null);
        return this.socketFactory.createSocket((String) Assertions.checkNotNull(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : RtspMessageChannel.DEFAULT_RTSP_PORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeLogMessage(List<String> list) {
        if (this.debugLoggingEnabled) {
            Log.d(TAG, Joiner.on(IOUtils.LINE_SEPARATOR_UNIX).join(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean serverSupportsDescribe(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        KeepAliveMonitor keepAliveMonitor = this.keepAliveMonitor;
        if (keepAliveMonitor != null) {
            keepAliveMonitor.close();
            this.keepAliveMonitor = null;
            this.messageSender.sendTeardownRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.messageChannel.close();
    }

    public int getState() {
        return this.rtspState;
    }

    public void registerInterleavedDataChannel(int i10, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.messageChannel.registerInterleavedBinaryDataListener(i10, interleavedBinaryDataListener);
    }

    public void retryWithRtpTcp() {
        try {
            close();
            RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(new MessageListener());
            this.messageChannel = rtspMessageChannel;
            rtspMessageChannel.open(getSocket(this.uri));
            this.sessionId = null;
            this.receivedAuthorizationRequest = false;
            this.rtspAuthenticationInfo = null;
        } catch (IOException e10) {
            this.playbackEventListener.onPlaybackError(new RtspMediaSource.RtspPlaybackException(e10));
        }
    }

    public void seekToUs(long j10) {
        if (this.rtspState == 2 && !this.hasPendingPauseRequest) {
            this.messageSender.sendPauseRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.pendingSeekPositionUs = j10;
    }

    public void setupSelectedTracks(List<RtspMediaPeriod.RtpLoadInfo> list) {
        this.pendingSetupRtpLoadInfos.addAll(list);
        continueSetupRtspTrack();
    }

    public void start() throws IOException {
        try {
            this.messageChannel.open(getSocket(this.uri));
            this.messageSender.sendOptionsRequest(this.uri, this.sessionId);
        } catch (IOException e10) {
            Util.closeQuietly(this.messageChannel);
            throw e10;
        }
    }

    public void startPlayback(long j10) {
        this.messageSender.sendPlayRequest(this.uri, j10, (String) Assertions.checkNotNull(this.sessionId));
    }
}
