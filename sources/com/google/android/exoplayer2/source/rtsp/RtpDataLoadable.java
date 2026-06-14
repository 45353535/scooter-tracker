package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class RtpDataLoadable implements Loader.Loadable {
    private final EventListener eventListener;
    private RtpExtractor extractor;
    private volatile boolean loadCancelled;
    private volatile long nextRtpTimestamp;
    private final ExtractorOutput output;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    public final RtspMediaTrack rtspMediaTrack;
    public final int trackId;
    private final Handler playbackThreadHandler = Util.createHandlerForCurrentLooper();
    private volatile long pendingSeekPositionUs = -9223372036854775807L;

    public interface EventListener {
        void onTransportReady(String str, RtpDataChannel rtpDataChannel);
    }

    public RtpDataLoadable(int i10, RtspMediaTrack rtspMediaTrack, EventListener eventListener, ExtractorOutput extractorOutput, RtpDataChannel.Factory factory) {
        this.trackId = i10;
        this.rtspMediaTrack = rtspMediaTrack;
        this.eventListener = eventListener;
        this.output = extractorOutput;
        this.rtpDataChannelFactory = factory;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCancelled = true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
        final RtpDataChannel rtpDataChannelCreateAndOpenDataChannel = null;
        try {
            rtpDataChannelCreateAndOpenDataChannel = this.rtpDataChannelFactory.createAndOpenDataChannel(this.trackId);
            final String transport = rtpDataChannelCreateAndOpenDataChannel.getTransport();
            this.playbackThreadHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25114b.eventListener.onTransportReady(transport, rtpDataChannelCreateAndOpenDataChannel);
                }
            });
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput((DataReader) Assertions.checkNotNull(rtpDataChannelCreateAndOpenDataChannel), 0L, -1L);
            RtpExtractor rtpExtractor = new RtpExtractor(this.rtspMediaTrack.payloadFormat, this.trackId);
            this.extractor = rtpExtractor;
            rtpExtractor.init(this.output);
            while (!this.loadCancelled) {
                if (this.pendingSeekPositionUs != -9223372036854775807L) {
                    this.extractor.seek(this.nextRtpTimestamp, this.pendingSeekPositionUs);
                    this.pendingSeekPositionUs = -9223372036854775807L;
                }
                if (this.extractor.read(defaultExtractorInput, new PositionHolder()) == -1) {
                    break;
                }
            }
            DataSourceUtil.closeQuietly(rtpDataChannelCreateAndOpenDataChannel);
        } catch (Throwable th2) {
            DataSourceUtil.closeQuietly(rtpDataChannelCreateAndOpenDataChannel);
            throw th2;
        }
    }

    public void resetForSeek() {
        ((RtpExtractor) Assertions.checkNotNull(this.extractor)).preSeek();
    }

    public void seekToUs(long j10, long j11) {
        this.pendingSeekPositionUs = j10;
        this.nextRtpTimestamp = j11;
    }

    public void setSequenceNumber(int i10) {
        if (((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            return;
        }
        this.extractor.setFirstSequenceNumber(i10);
    }

    public void setTimestamp(long j10) {
        if (j10 == -9223372036854775807L || ((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            return;
        }
        this.extractor.setFirstTimestamp(j10);
    }
}
