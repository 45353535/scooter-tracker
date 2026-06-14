package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.SntpClient;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import com.google.common.math.LongMath;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private final DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private final MediaItem mediaItem;

    @Nullable
    private TransferListener mediaTransferListener;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    private static final class DashTimeline extends Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;

        @Nullable
        private final MediaItem.LiveConfiguration liveConfiguration;
        private final DashManifest manifest;
        private final MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        public DashTimeline(long j10, long j11, long j12, int i10, long j13, long j14, long j15, DashManifest dashManifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
            Assertions.checkState(dashManifest.dynamic == (liveConfiguration != null));
            this.presentationStartTimeMs = j10;
            this.windowStartTimeMs = j11;
            this.elapsedRealtimeEpochOffsetMs = j12;
            this.firstPeriodId = i10;
            this.offsetInFirstPeriodUs = j13;
            this.windowDurationUs = j14;
            this.windowDefaultStartPositionUs = j15;
            this.manifest = dashManifest;
            this.mediaItem = mediaItem;
            this.liveConfiguration = liveConfiguration;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j10) {
            DashSegmentIndex index;
            long j11 = this.windowDefaultStartPositionUs;
            if (!isMovingLiveWindow(this.manifest)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.windowDurationUs) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.offsetInFirstPeriodUs + j11;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i10 = 0;
            while (i10 < this.manifest.getPeriodCount() - 1 && j12 >= periodDurationUs) {
                j12 -= periodDurationUs;
                i10++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i10);
            }
            Period period = this.manifest.getPeriod(i10);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j11 : (j11 + index.getTimeUs(index.getSegmentNum(j12, periodDurationUs))) - j12;
        }

        private static boolean isMovingLiveWindow(DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != -9223372036854775807L && dashManifest.durationMs == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.firstPeriodId) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            Assertions.checkIndex(i10, 0, getPeriodCount());
            return period.set(z10 ? this.manifest.getPeriod(i10).f25077id : null, z10 ? Integer.valueOf(this.firstPeriodId + i10) : null, 0, this.manifest.getPeriodDurationUs(i10), Util.msToUs(this.manifest.getPeriod(i10).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i10) {
            Assertions.checkIndex(i10, 0, getPeriodCount());
            return Integer.valueOf(this.firstPeriodId + i10);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            Assertions.checkIndex(i10, 0, 1);
            long adjustedWindowDefaultStartPositionUs = getAdjustedWindowDefaultStartPositionUs(j10);
            Object obj = Timeline.Window.SINGLE_WINDOW_UID;
            MediaItem mediaItem = this.mediaItem;
            DashManifest dashManifest = this.manifest;
            return window.set(obj, mediaItem, dashManifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, true, isMovingLiveWindow(dashManifest), this.liveConfiguration, adjustedWindowDefaultStartPositionUs, this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    private final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j10) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }
    }

    public static final class Factory implements MediaSourceFactory {
        private final DashChunkSource.Factory chunkSourceFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @Nullable
        private final DataSource.Factory manifestDataSourceFactory;

        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;

        public Factory(DataSource.Factory factory) {
            this(new DefaultDashChunkSource.Factory(factory), factory);
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory setCompositeSequenceableLoaderFactory(@Nullable CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            if (compositeSequenceableLoaderFactory == null) {
                compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            }
            this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
            return this;
        }

        public Factory setFallbackTargetLiveOffsetMs(long j10) {
            this.fallbackTargetLiveOffsetMs = j10;
            return this;
        }

        public Factory setManifestParser(@Nullable ParsingLoadable.Parser<? extends DashManifest> parser) {
            this.manifestParser = parser;
            return this;
        }

        public Factory(DashChunkSource.Factory factory, @Nullable DataSource.Factory factory2) {
            this.chunkSourceFactory = (DashChunkSource.Factory) Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
            return createMediaSource(dashManifest, new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId("DashMediaSource").setMimeType("application/dash+xml").build());
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            if (drmSessionManagerProvider == null) {
                drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            }
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest, MediaItem mediaItem) {
            Assertions.checkArgument(!dashManifest.dynamic);
            MediaItem.Builder mimeType = mediaItem.buildUpon().setMimeType("application/dash+xml");
            if (mediaItem.localConfiguration == null) {
                mimeType.setUri(Uri.EMPTY);
            }
            MediaItem mediaItemBuild = mimeType.build();
            return new DashMediaSource(mediaItemBuild, dashManifest, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.drmSessionManagerProvider.get(mediaItemBuild), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs);
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public DashMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            ParsingLoadable.Parser dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            List<StreamKey> list = mediaItem.localConfiguration.streamKeys;
            return new DashMediaSource(mediaItem, null, this.manifestDataSourceFactory, !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs);
        }
    }

    static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        Iso8601Parser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8)).readLine();
            try {
                Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(line);
                if (!matcher.matches()) {
                    String strValueOf = String.valueOf(line);
                    throw ParserException.createForMalformedManifest(strValueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(strValueOf) : new String("Couldn't parse timestamp: "), null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw ParserException.createForMalformedManifest(null, e10);
            }
        }
    }

    private final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private ManifestCallback() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11, boolean z10) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j10, j11, iOException, i10);
        }
    }

    private final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        private UtcTimestampCallback() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j10, long j11, boolean z10) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j10, long j11) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j10, j11, iOException);
        }
    }

    private static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
    }

    private static long getAvailableEndTimeInManifestUs(Period period, long j10, long j11) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i10);
            List<Representation> list = adaptationSet.representations;
            if ((!zHasVideoOrAudioAdaptationSets || adaptationSet.type != 3) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs + j10;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j10, j11);
                if (availableSegmentCount == 0) {
                    return jMsToUs;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j10, j11) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, j10) + index.getTimeUs(firstAvailableSegmentNum) + jMsToUs);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(Period period, long j10, long j11) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMax = jMsToUs;
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i10);
            List<Representation> list = adaptationSet.representations;
            if ((!zHasVideoOrAudioAdaptationSets || adaptationSet.type != 3) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null || index.getAvailableSegmentCount(j10, j11) == 0) {
                    return jMsToUs;
                }
                jMax = Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(j10, j11)) + jMsToUs);
            }
        }
        return jMax;
    }

    private static long getIntervalUntilNextManifestRefreshMs(DashManifest dashManifest, long j10) {
        DashSegmentIndex index;
        int periodCount = dashManifest.getPeriodCount() - 1;
        Period period = dashManifest.getPeriod(periodCount);
        long jMsToUs = Util.msToUs(period.startMs);
        long periodDurationUs = dashManifest.getPeriodDurationUs(periodCount);
        long jMsToUs2 = Util.msToUs(j10);
        long jMsToUs3 = Util.msToUs(dashManifest.availabilityStartTimeMs);
        long jMsToUs4 = Util.msToUs(5000L);
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            List<Representation> list = period.adaptationSets.get(i10).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = ((jMsToUs3 + jMsToUs) + index.getNextSegmentAvailableTimeUs(periodDurationUs, jMsToUs2)) - jMsToUs2;
                if (nextSegmentAvailableTimeUs < jMsToUs4 - SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US || (nextSegmentAvailableTimeUs > jMsToUs4 && nextSegmentAvailableTimeUs < jMsToUs4 + SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) {
                    jMsToUs4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return LongMath.divide(jMsToUs4, 1000L, RoundingMode.CEILING);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private static boolean hasVideoOrAudioAdaptationSets(Period period) {
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            int i11 = period.adaptationSets.get(i10).type;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(Period period) {
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            DashSegmentIndex index = period.adaptationSets.get(i10).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    private void loadNtpTimeOffset() {
        SntpClient.initialize(this.loader, new SntpClient.InitializationCallback() { // from class: com.google.android.exoplayer2.source.dash.DashMediaSource.1
            @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
            public void onInitializationFailed(IOException iOException) {
                DashMediaSource.this.onUtcTimestampResolutionError(iOException);
            }

            @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
            public void onInitialized() {
                DashMediaSource.this.onUtcTimestampResolved(SntpClient.getElapsedRealtimeOffsetMs());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j10) {
        this.elapsedRealtimeOffsetMs = j10;
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processManifest(boolean z10) {
        long j10;
        long j11;
        long j12;
        for (int i10 = 0; i10 < this.periodsById.size(); i10++) {
            int iKeyAt = this.periodsById.keyAt(i10);
            if (iKeyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i10).updateManifest(this.manifest, iKeyAt - this.firstPeriodId);
            }
        }
        Period period = this.manifest.getPeriod(0);
        int periodCount = this.manifest.getPeriodCount() - 1;
        Period period2 = this.manifest.getPeriod(periodCount);
        long periodDurationUs = this.manifest.getPeriodDurationUs(periodCount);
        long jMsToUs = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(period, this.manifest.getPeriodDurationUs(0), jMsToUs);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(period2, periodDurationUs, jMsToUs);
        boolean z11 = this.manifest.dynamic && !isIndexExplicit(period2);
        if (z11) {
            long j13 = this.manifest.timeShiftBufferDepthMs;
            if (j13 != -9223372036854775807L) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - Util.msToUs(j13));
            }
        }
        long j14 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            Assertions.checkState(dashManifest.availabilityStartTimeMs != -9223372036854775807L);
            long jMsToUs2 = (jMsToUs - Util.msToUs(this.manifest.availabilityStartTimeMs)) - availableStartTimeInManifestUs;
            updateLiveConfiguration(jMsToUs2, j14);
            long jUsToMs = this.manifest.availabilityStartTimeMs + Util.usToMs(availableStartTimeInManifestUs);
            long jMsToUs3 = jMsToUs2 - Util.msToUs(this.liveConfiguration.targetOffsetMs);
            j10 = 0;
            long jMin = Math.min(MIN_LIVE_DEFAULT_START_POSITION_US, j14 / 2);
            j11 = jUsToMs;
            j12 = jMsToUs3 < jMin ? jMin : jMsToUs3;
        } else {
            j10 = 0;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long jMsToUs4 = availableStartTimeInManifestUs - Util.msToUs(period.startMs);
        DashManifest dashManifest2 = this.manifest;
        refreshSourceInfo(new DashTimeline(dashManifest2.availabilityStartTimeMs, j11, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jMsToUs4, j14, j12, dashManifest2, this.mediaItem, dashManifest2.dynamic ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z11) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z10) {
            DashManifest dashManifest3 = this.manifest;
            if (dashManifest3.dynamic) {
                long j15 = dashManifest3.minUpdatePeriodMs;
                if (j15 != -9223372036854775807L) {
                    if (j15 == j10) {
                        j15 = 5000;
                    }
                    scheduleManifestRefresh(Math.max(j10, (this.manifestLoadStartTimestampMs + j15) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new Iso8601Parser());
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new XsDateTimeParser());
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (ParserException e10) {
            onUtcTimestampResolutionError(e10);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new UtcTimestampCallback(), 1);
    }

    private void scheduleManifestRefresh(long j10) {
        this.handler.postDelayed(this.refreshManifestRunnable, j10);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i10) {
        this.manifestEventDispatcher.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.loader.startLoading(parsingLoadable, callback, i10)), parsingLoadable.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.hasFatalError()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateLiveConfiguration(long r18, long r20) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.updateLiveConfiguration(long, long):void");
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        int iIntValue = ((Integer) mediaPeriodId.periodUid).intValue() - this.firstPeriodId;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId, this.manifest.getPeriod(iIntValue).startMs);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(this.firstPeriodId + iIntValue, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(dashMediaPeriod.f25072id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    void onDashManifestPublishTimeExpired(long j10) {
        long j11 = this.expiredManifestPublishTimeUs;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.expiredManifestPublishTimeUs = j10;
        }
    }

    void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j10, long j11) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCanceled(loadEventInfo, parsingLoadable.type);
    }

    void onManifestLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        DashManifest result = parsingLoadable.getResult();
        DashManifest dashManifest = this.manifest;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j12 = result.getPeriod(0).startMs;
        int i10 = 0;
        while (i10 < periodCount && this.manifest.getPeriod(i10).startMs < j12) {
            i10++;
        }
        if (result.dynamic) {
            if (periodCount - i10 > result.getPeriodCount()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.expiredManifestPublishTimeUs;
                if (j13 != -9223372036854775807L) {
                    long j14 = result.publishTimeMs;
                    if (1000 * j14 <= j13) {
                        StringBuilder sb2 = new StringBuilder(73);
                        sb2.append("Loaded stale dynamic manifest: ");
                        sb2.append(j14);
                        sb2.append(", ");
                        sb2.append(j13);
                        Log.w("DashMediaSource", sb2.toString());
                    }
                }
                this.staleManifestReloadAttempt = 0;
            }
            int i11 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i11 + 1;
            if (i11 < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new DashManifestStaleException();
                return;
            }
        }
        this.manifest = result;
        this.manifestLoadPending = result.dynamic & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j10 - j11;
        this.manifestLoadEndTimestampMs = j10;
        synchronized (this.manifestUriLock) {
            try {
                if (parsingLoadable.dataSpec.uri == this.manifestUri) {
                    Uri uri = this.manifest.location;
                    if (uri == null) {
                        uri = parsingLoadable.getUri();
                    }
                    this.manifestUri = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (periodCount != 0) {
            this.firstPeriodId += i10;
            processManifest(true);
            return;
        }
        DashManifest dashManifest2 = this.manifest;
        if (!dashManifest2.dynamic) {
            processManifest(true);
            return;
        }
        UtcTimingElement utcTimingElement = dashManifest2.utcTiming;
        if (utcTimingElement != null) {
            resolveUtcTimingElement(utcTimingElement);
        } else {
            loadNtpTimeOffset();
        }
    }

    Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11, IOException iOException, int i10) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable.type), iOException, i10));
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == -9223372036854775807L ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.manifestEventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j10, long j11) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j10);
    }

    Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j10, long j11, IOException iOException) {
        this.manifestEventDispatcher.loadError(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded()), parsingLoadable.type, iOException, true);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        onUtcTimestampResolutionError(iOException);
        return Loader.DONT_RETRY;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.prepare();
        this.drmSessionManager.setPlayer(Looper.myLooper(), getPlayerId());
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new Loader("DashMediaSource");
        this.handler = Util.createHandlerForCurrentLooper();
        startLoadingManifest();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.f25072id);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifest = this.sideloadedManifest ? this.manifest : null;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.firstPeriodId = 0;
        this.periodsById.clear();
        this.baseUrlExclusionList.reset();
        this.drmSessionManager.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        ManifestLoadErrorThrower() {
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int i10) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i10);
            maybeThrowManifestError();
        }
    }

    private DashMediaSource(MediaItem mediaItem, @Nullable DashManifest dashManifest, @Nullable DataSource.Factory factory, @Nullable ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j10) {
        this.mediaItem = mediaItem;
        this.liveConfiguration = mediaItem.liveConfiguration;
        this.manifestUri = ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
        this.initialManifestUri = mediaItem.localConfiguration.uri;
        this.manifest = dashManifest;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.fallbackTargetLiveOffsetMs = j10;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.baseUrlExclusionList = new BaseUrlExclusionList();
        boolean z10 = dashManifest != null;
        this.sideloadedManifest = z10;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        if (!z10) {
            this.manifestCallback = new ManifestCallback();
            this.manifestLoadErrorThrower = new ManifestLoadErrorThrower();
            this.refreshManifestRunnable = new Runnable() { // from class: com.google.android.exoplayer2.source.dash.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25073b.startLoadingManifest();
                }
            };
            this.simulateManifestRefreshRunnable = new Runnable() { // from class: com.google.android.exoplayer2.source.dash.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25074b.processManifest(false);
                }
            };
            return;
        }
        Assertions.checkState(true ^ dashManifest.dynamic);
        this.manifestCallback = null;
        this.refreshManifestRunnable = null;
        this.simulateManifestRefreshRunnable = null;
        this.manifestLoadErrorThrower = new LoaderErrorThrower.Dummy();
    }
}
