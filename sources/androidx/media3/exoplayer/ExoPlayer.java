package androidx.media3.exoplayer;

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
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @UnstableApi
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @UnstableApi
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

    @UnstableApi
    public interface AudioOffloadListener {
        void onOffloadedPlayback(boolean z10);

        void onSleepingForOffloadChanged(boolean z10);
    }

    public static final class Builder {
        Function<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        Supplier<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        Supplier<LoadControl> loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        Looper playbackLooper;
        String playerName;
        int priority;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        Supplier<RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        boolean suppressPlaybackOnUnsuitableOutput;
        Supplier<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(final Context context) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.q
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.b(context);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.s
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.e(context);
                }
            });
        }

        public static /* synthetic */ RenderersFactory a(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ RenderersFactory b(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ MediaSource.Factory c(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ MediaSource.Factory d(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ MediaSource.Factory e(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ RenderersFactory f(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ LoadControl g(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ MediaSource.Factory h(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ BandwidthMeter i(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ MediaSource.Factory j(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory k(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ TrackSelector m(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ RenderersFactory n(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ AnalyticsCollector o(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ MediaSource.Factory p(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory q(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ AnalyticsCollector r(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ TrackSelector s(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ BandwidthMeter t(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ TrackSelector u(Context context) {
            return new DefaultTrackSelector(context);
        }

        public static /* synthetic */ LoadControl v(LoadControl loadControl) {
            return loadControl;
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
        @UnstableApi
        public Builder experimentalSetDynamicSchedulingEnabled(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder experimentalSetForegroundModeTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new Function() { // from class: androidx.media3.exoplayer.p
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.r(analyticsCollector, (Clock) obj);
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
        @UnstableApi
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new Supplier() { // from class: androidx.media3.exoplayer.a0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.t(bandwidthMeter);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @VisibleForTesting
        @UnstableApi
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setDetachSurfaceTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setDeviceVolumeControlEnabled(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHandleAudioBecomingNoisy(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new Supplier() { // from class: androidx.media3.exoplayer.o
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.g(loadControl);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setMaxSeekToPreviousPositionMs(@IntRange(from = 0) long j10) {
            Assertions.checkArgument(j10 >= 0);
            Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new Supplier() { // from class: androidx.media3.exoplayer.m0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.h(factory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setName(String str) {
            Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPauseAtEndOfMediaItems(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooper = looper;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPriority(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.priority = i10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setReleaseTimeoutMs(long j10) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new Supplier() { // from class: androidx.media3.exoplayer.t
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.a(renderersFactory);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long j10) {
            Assertions.checkArgument(j10 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long j10) {
            Assertions.checkArgument(j10 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSkipSilenceEnabled(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new Supplier() { // from class: androidx.media3.exoplayer.l0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.m(trackSelector);
                }
            };
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setUseLazyPreparation(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setUsePlatformDiagnostics(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Builder setVideoChangeFrameRateStrategy(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i10;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
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

        @UnstableApi
        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.w
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.q(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.x
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.d(context);
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        @UnstableApi
        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.j0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.k(context);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.k0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.c(factory);
                }
            });
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.u
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.f(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.v
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.j(factory);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: androidx.media3.exoplayer.y
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.n(renderersFactory);
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: androidx.media3.exoplayer.z
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.p(factory);
                }
            }, (Supplier<TrackSelector>) new Supplier() { // from class: androidx.media3.exoplayer.b0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.s(trackSelector);
                }
            }, (Supplier<LoadControl>) new Supplier() { // from class: androidx.media3.exoplayer.c0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.v(loadControl);
                }
            }, (Supplier<BandwidthMeter>) new Supplier() { // from class: androidx.media3.exoplayer.d0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.i(bandwidthMeter);
                }
            }, (Function<Clock, AnalyticsCollector>) new Function() { // from class: androidx.media3.exoplayer.e0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.o(analyticsCollector, (Clock) obj);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2) {
            this(context, supplier, supplier2, (Supplier<TrackSelector>) new Supplier() { // from class: androidx.media3.exoplayer.f0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.Builder.u(context);
                }
            }, (Supplier<LoadControl>) new Supplier() { // from class: androidx.media3.exoplayer.g0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new DefaultLoadControl();
                }
            }, (Supplier<BandwidthMeter>) new Supplier() { // from class: androidx.media3.exoplayer.h0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, (Function<Clock, AnalyticsCollector>) new Function() { // from class: androidx.media3.exoplayer.i0
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
            this.maxSeekToPreviousPositionMs = 3000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
        }
    }

    @UnstableApi
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

    @UnstableApi
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(-9223372036854775807L);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j10) {
            this.targetPreloadDurationUs = j10;
        }
    }

    @UnstableApi
    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @UnstableApi
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

    @UnstableApi
    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @UnstableApi
    void addMediaSource(int i10, MediaSource mediaSource);

    @UnstableApi
    void addMediaSource(MediaSource mediaSource);

    @UnstableApi
    void addMediaSources(int i10, List<MediaSource> list);

    @UnstableApi
    void addMediaSources(List<MediaSource> list);

    @UnstableApi
    void clearAuxEffectInfo();

    @UnstableApi
    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    PlayerMessage createMessage(PlayerMessage.Target target);

    @UnstableApi
    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @UnstableApi
    @Deprecated
    AudioComponent getAudioComponent();

    @Nullable
    @UnstableApi
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    @UnstableApi
    Format getAudioFormat();

    @UnstableApi
    int getAudioSessionId();

    @UnstableApi
    Clock getClock();

    @UnstableApi
    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @UnstableApi
    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Nullable
    @UnstableApi
    @Deprecated
    DeviceComponent getDeviceComponent();

    @UnstableApi
    boolean getPauseAtEndOfMediaItems();

    @UnstableApi
    Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    @Nullable
    /* bridge */ /* synthetic */ PlaybackException getPlayerError();

    @Override // androidx.media3.common.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @UnstableApi
    PreloadConfiguration getPreloadConfiguration();

    @UnstableApi
    Renderer getRenderer(int i10);

    @UnstableApi
    int getRendererCount();

    @UnstableApi
    int getRendererType(int i10);

    @UnstableApi
    SeekParameters getSeekParameters();

    @UnstableApi
    boolean getSkipSilenceEnabled();

    @Nullable
    @UnstableApi
    @Deprecated
    TextComponent getTextComponent();

    @Nullable
    @UnstableApi
    TrackSelector getTrackSelector();

    @UnstableApi
    int getVideoChangeFrameRateStrategy();

    @Nullable
    @UnstableApi
    @Deprecated
    VideoComponent getVideoComponent();

    @Nullable
    @UnstableApi
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    @UnstableApi
    Format getVideoFormat();

    @UnstableApi
    int getVideoScalingMode();

    @UnstableApi
    boolean isReleased();

    @UnstableApi
    boolean isSleepingForOffload();

    @UnstableApi
    boolean isTunnelingEnabled();

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource);

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource, boolean z10, boolean z11);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i10, MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i10, int i11, List<MediaItem> list);

    @UnstableApi
    void setAudioSessionId(int i10);

    @UnstableApi
    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    @UnstableApi
    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, long j10);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, boolean z10);

    @UnstableApi
    void setMediaSources(List<MediaSource> list);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, int i10, long j10);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, boolean z10);

    @UnstableApi
    void setPauseAtEndOfMediaItems(boolean z10);

    @RequiresApi(23)
    @UnstableApi
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    @UnstableApi
    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    @UnstableApi
    void setPriority(int i10);

    @UnstableApi
    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @UnstableApi
    void setSeekParameters(@Nullable SeekParameters seekParameters);

    @UnstableApi
    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @UnstableApi
    void setSkipSilenceEnabled(boolean z10);

    @UnstableApi
    void setVideoChangeFrameRateStrategy(int i10);

    @UnstableApi
    void setVideoEffects(List<Effect> list);

    @UnstableApi
    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    void setVideoScalingMode(int i10);

    void setWakeMode(int i10);
}
