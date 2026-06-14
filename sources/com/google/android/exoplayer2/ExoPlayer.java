package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ExoPlayer extends Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z10);

        @Deprecated
        void setAudioSessionId(int i10);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z10);

        @Deprecated
        void setVolume(float f10);
    }

    public interface AudioOffloadListener {
        void onExperimentalOffloadSchedulingEnabledChanged(boolean z10);

        void onExperimentalOffloadedPlayback(boolean z10);

        void onExperimentalSleepingForOffloadChanged(boolean z10);
    }

    public static final class Builder {
        Function<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        Supplier<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        Supplier<LoadControl> loadControlSupplier;
        Looper looper;
        Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        Looper playbackLooper;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        Supplier<RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        Supplier<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(final Context context) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.b(context);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: com.google.android.exoplayer2.x
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.j(context);
                }
            });
        }

        public static /* synthetic */ LoadControl a(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ RenderersFactory b(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ MediaSource.Factory c(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ TrackSelector d(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ MediaSource.Factory e(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory f(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ AnalyticsCollector g(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ RenderersFactory h(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ RenderersFactory i(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ MediaSource.Factory j(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ MediaSource.Factory l(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ MediaSource.Factory m(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ TrackSelector n(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ BandwidthMeter o(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ TrackSelector p(Context context) {
            return new DefaultTrackSelector(context);
        }

        public static /* synthetic */ RenderersFactory q(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ MediaSource.Factory r(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ BandwidthMeter s(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ AnalyticsCollector t(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ LoadControl u(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ RenderersFactory v(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        @CanIgnoreReturnValue
        public Builder experimentalSetForegroundModeTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new Function() { // from class: com.google.android.exoplayer2.u
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.g(analyticsCollector, (Clock) obj);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new Supplier() { // from class: com.google.android.exoplayer2.a0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.o(bandwidthMeter);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @VisibleForTesting
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDetachSurfaceTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHandleAudioBecomingNoisy(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new Supplier() { // from class: com.google.android.exoplayer2.g
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.u(loadControl);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new Supplier() { // from class: com.google.android.exoplayer2.w
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.c(factory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPauseAtEndOfMediaItems(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooper = looper;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setReleaseTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new Supplier() { // from class: com.google.android.exoplayer2.v
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.f(renderersFactory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long j10) {
            Assertions.checkArgument(j10 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long j10) {
            Assertions.checkArgument(j10 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSkipSilenceEnabled(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new Supplier() { // from class: com.google.android.exoplayer2.j
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.d(trackSelector);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUseLazyPreparation(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUsePlatformDiagnostics(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVideoChangeFrameRateStrategy(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVideoScalingMode(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWakeMode(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i10;
            return this;
        }

        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: com.google.android.exoplayer2.k
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.h(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: com.google.android.exoplayer2.l
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m(context);
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: com.google.android.exoplayer2.m
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.i(context);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: com.google.android.exoplayer2.n
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.r(factory);
                }
            });
            Assertions.checkNotNull(factory);
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: com.google.android.exoplayer2.y
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.v(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: com.google.android.exoplayer2.z
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.e(factory);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: com.google.android.exoplayer2.b0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.q(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: com.google.android.exoplayer2.c0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.l(factory);
                }
            }, (Supplier<TrackSelector>) new Supplier() { // from class: com.google.android.exoplayer2.d0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.n(trackSelector);
                }
            }, (Supplier<LoadControl>) new Supplier() { // from class: com.google.android.exoplayer2.e0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.a(loadControl);
                }
            }, (Supplier<BandwidthMeter>) new Supplier() { // from class: com.google.android.exoplayer2.h
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.s(bandwidthMeter);
                }
            }, (Function<Clock, AnalyticsCollector>) new Function() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.t(analyticsCollector, (Clock) obj);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2) {
            this(context, supplier, supplier2, (Supplier<TrackSelector>) new Supplier() { // from class: com.google.android.exoplayer2.o
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.p(context);
                }
            }, (Supplier<LoadControl>) new Supplier() { // from class: com.google.android.exoplayer2.p
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new DefaultLoadControl();
                }
            }, (Supplier<BandwidthMeter>) new Supplier() { // from class: com.google.android.exoplayer2.q
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, (Function<Clock, AnalyticsCollector>) new Function() { // from class: com.google.android.exoplayer2.t
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2, Supplier<TrackSelector> supplier3, Supplier<LoadControl> supplier4, Supplier<BandwidthMeter> supplier5, Function<Clock, AnalyticsCollector> function) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
        }
    }

    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z10);

        @Deprecated
        void setDeviceVolume(int i10);
    }

    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(@Nullable Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(@Nullable TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i10);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i10);

        @Deprecated
        void setVideoSurface(@Nullable Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i10, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i10, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z10);

    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @Deprecated
    AudioComponent getAudioComponent();

    @Nullable
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    Format getAudioFormat();

    int getAudioSessionId();

    Clock getClock();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Nullable
    @Deprecated
    DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* bridge */ /* synthetic */ PlaybackException getPlayerError();

    Renderer getRenderer(int i10);

    int getRendererCount();

    int getRendererType(int i10);

    SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @Nullable
    @Deprecated
    TextComponent getTextComponent();

    @Nullable
    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Nullable
    @Deprecated
    VideoComponent getVideoComponent();

    @Nullable
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    Format getVideoFormat();

    int getVideoScalingMode();

    boolean isTunnelingEnabled();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z10, boolean z11);

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Deprecated
    void retry();

    void setAudioAttributes(AudioAttributes audioAttributes, boolean z10);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    @Deprecated
    void setHandleWakeLock(boolean z10);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j10);

    void setMediaSource(MediaSource mediaSource, boolean z10);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i10, long j10);

    void setMediaSources(List<MediaSource> list, boolean z10);

    void setPauseAtEndOfMediaItems(boolean z10);

    @RequiresApi(23)
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    void setSeekParameters(@Nullable SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z10);

    void setVideoChangeFrameRateStrategy(int i10);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i10);

    void setWakeMode(int i10);
}
