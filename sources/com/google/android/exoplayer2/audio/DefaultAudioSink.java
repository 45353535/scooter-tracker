package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.AudioTrackPositionTracker;
import com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.InlineMeValidationDisabled;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp = false;

    @GuardedBy("releaseExecutorLock")
    private static int pendingReleaseCount;

    @Nullable
    @GuardedBy("releaseExecutorLock")
    private static ExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private AudioProcessor[] activeAudioProcessors;

    @Nullable
    private MediaPositionParameters afterDrainParameters;
    private AudioAttributes audioAttributes;
    private final AudioCapabilities audioCapabilities;

    @Nullable
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;

    @Nullable
    private AudioTrack audioTrack;
    private final AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private PlaybackParameters audioTrackPlaybackParameters;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private AuxEffectInfo auxEffectInfo;

    @Nullable
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private Configuration configuration;
    private int drainingAudioProcessorIndex;
    private final boolean enableAudioTrackPlaybackParams;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;

    @Nullable
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;

    @Nullable
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private final int offloadMode;
    private StreamEventCallbackV29 offloadStreamEventCallbackV29;

    @Nullable
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;

    @Nullable
    private Configuration pendingConfiguration;

    @Nullable
    private PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;

    @Nullable
    private AudioDeviceInfoApi23 preferredDevice;
    private final ConditionVariable releasingConditionVariable;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    @RequiresApi(23)
    private static final class Api23 {
        private Api23() {
        }

        @DoNotInline
        public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.audioDeviceInfo);
        }
    }

    @RequiresApi(31)
    private static final class Api31 {
        private Api31() {
        }

        @DoNotInline
        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }

    @RequiresApi(23)
    private static final class AudioDeviceInfoApi23 {
        public final AudioDeviceInfo audioDeviceInfo;

        public AudioDeviceInfoApi23(AudioDeviceInfo audioDeviceInfo) {
            this.audioDeviceInfo = audioDeviceInfo;
        }
    }

    @Deprecated
    public interface AudioProcessorChain extends com.google.android.exoplayer2.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public static final class Builder {

        @Nullable
        ExoPlayer.AudioOffloadListener audioOffloadListener;

        @Nullable
        private com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;
        private AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        private int offloadMode = 0;
        AudioTrackBufferSizeProvider audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;

        public DefaultAudioSink build() {
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        @CanIgnoreReturnValue
        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain) {
            Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
        }

        @CanIgnoreReturnValue
        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setEnableAudioTrackPlaybackParams(boolean z10) {
            this.enableAudioTrackPlaybackParams = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setEnableFloatOutput(boolean z10) {
            this.enableFloatOutput = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setExperimentalAudioOffloadListener(@Nullable ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOffloadMode(int i10) {
            this.offloadMode = i10;
            return this;
        }
    }

    private static final class Configuration {
        public final AudioProcessor[] availableAudioProcessors;
        public final int bufferSize;
        public final Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;

        public Configuration(Format format, int i10, int i11, int i12, int i13, int i14, int i15, int i16, AudioProcessor[] audioProcessorArr) {
            this.inputFormat = format;
            this.inputPcmFrameSize = i10;
            this.outputMode = i11;
            this.outputPcmFrameSize = i12;
            this.outputSampleRate = i13;
            this.outputChannelConfig = i14;
            this.outputEncoding = i15;
            this.bufferSize = i16;
            this.availableAudioProcessors = audioProcessorArr;
        }

        private AudioTrack createAudioTrack(boolean z10, AudioAttributes audioAttributes, int i10) {
            int i11 = Util.SDK_INT;
            return i11 >= 29 ? createAudioTrackV29(z10, audioAttributes, i10) : i11 >= 21 ? createAudioTrackV21(z10, audioAttributes, i10) : createAudioTrackV9(audioAttributes, i10);
        }

        @RequiresApi(21)
        private AudioTrack createAudioTrackV21(boolean z10, AudioAttributes audioAttributes, int i10) {
            return new AudioTrack(getAudioTrackAttributesV21(audioAttributes, z10), DefaultAudioSink.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding), this.bufferSize, 1, i10);
        }

        @RequiresApi(29)
        private AudioTrack createAudioTrackV29(boolean z10, AudioAttributes audioAttributes, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, z10)).setAudioFormat(DefaultAudioSink.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding)).setTransferMode(1).setBufferSizeInBytes(this.bufferSize).setSessionId(i10).setOffloadedPlayback(this.outputMode == 1).build();
        }

        private AudioTrack createAudioTrackV9(AudioAttributes audioAttributes, int i10) {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            return i10 == 0 ? new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1) : new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, i10);
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackAttributesV21(AudioAttributes audioAttributes, boolean z10) {
            return z10 ? getAudioTrackTunnelingAttributesV21() : audioAttributes.getAudioAttributesV21().audioAttributes;
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack buildAudioTrack(boolean z10, AudioAttributes audioAttributes, int i10) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackCreateAudioTrack = createAudioTrack(z10, audioAttributes, i10);
                int state = audioTrackCreateAudioTrack.getState();
                if (state == 1) {
                    return audioTrackCreateAudioTrack;
                }
                try {
                    audioTrackCreateAudioTrack.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), e10);
            }
        }

        public boolean canReuseAudioTrack(Configuration configuration) {
            return configuration.outputMode == this.outputMode && configuration.outputEncoding == this.outputEncoding && configuration.outputSampleRate == this.outputSampleRate && configuration.outputChannelConfig == this.outputChannelConfig && configuration.outputPcmFrameSize == this.outputPcmFrameSize;
        }

        public Configuration copyWithBufferSize(int i10) {
            return new Configuration(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i10, this.availableAudioProcessors);
        }

        public long framesToDurationUs(long j10) {
            return (j10 * 1000000) / ((long) this.outputSampleRate);
        }

        public long inputFramesToDurationUs(long j10) {
            return (j10 * 1000000) / ((long) this.inputFormat.sampleRate);
        }

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z10) {
            this.silenceSkippingAudioProcessor.setEnabled(z10);
            return z10;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getMediaDuration(long j10) {
            return this.sonicAudioProcessor.getMediaDuration(j10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;
        public final boolean skipSilence;

        private MediaPositionParameters(PlaybackParameters playbackParameters, boolean z10, long j10, long j11) {
            this.playbackParameters = playbackParameters;
            this.skipSilence = z10;
            this.mediaTimeUs = j10;
            this.audioTrackPositionUs = j11;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    private static final class PendingExceptionHolder<T extends Exception> {

        @Nullable
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public PendingExceptionHolder(long j10) {
            this.throwDelayMs = j10;
        }

        public void clear() {
            this.pendingException = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t10;
                this.throwDeadlineMs = this.throwDelayMs + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.throwDeadlineMs) {
                T t11 = this.pendingException;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.pendingException;
                clear();
                throw t12;
            }
        }
    }

    private final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j10) {
            Log.w(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j10) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j10);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w(DefaultAudioSink.TAG, str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            Log.w(DefaultAudioSink.TAG, str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    @RequiresApi(29)
    private final class StreamEventCallbackV29 {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler = new Handler(Looper.myLooper());

        public StreamEventCallbackV29() {
            this.callback = new AudioTrack$StreamEventCallback() { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29.1
                public void onDataRequest(AudioTrack audioTrack, int i10) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }

                public void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }
            };
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.handler;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.a(handler), this.callback);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    public static /* synthetic */ void a(AudioTrack audioTrack, ConditionVariable conditionVariable) {
        try {
            audioTrack.flush();
            audioTrack.release();
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                try {
                    int i10 = pendingReleaseCount - 1;
                    pendingReleaseCount = i10;
                    if (i10 == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                try {
                    int i11 = pendingReleaseCount - 1;
                    pendingReleaseCount = i11;
                    if (i11 == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j10) {
        PlaybackParameters playbackParametersApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applyPlaybackParameters(getAudioProcessorPlaybackParameters()) : PlaybackParameters.DEFAULT;
        boolean zApplySkipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(getSkipSilenceEnabled()) : false;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(playbackParametersApplyPlaybackParameters, zApplySkipSilenceEnabled, Math.max(0L, j10), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(zApplySkipSilenceEnabled);
        }
    }

    private long applyMediaPositionParameters(long j10) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j10 >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j11 = j10 - mediaPositionParameters.audioTrackPositionUs;
        if (mediaPositionParameters.playbackParameters.equals(PlaybackParameters.DEFAULT)) {
            return this.mediaPositionParameters.mediaTimeUs + j11;
        }
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.mediaTimeUs + this.audioProcessorChain.getMediaDuration(j11);
        }
        MediaPositionParameters first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.mediaTimeUs - Util.getMediaDurationForPlayoutDuration(first.audioTrackPositionUs - j10, this.mediaPositionParameters.playbackParameters.speed);
    }

    private long applySkipping(long j10) {
        return j10 + this.configuration.framesToDurationUs(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    private AudioTrack buildAudioTrack(Configuration configuration) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackBuildAudioTrack = configuration.buildAudioTrack(this.tunneling, this.audioAttributes, this.audioSessionId);
            ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener == null) {
                return audioTrackBuildAudioTrack;
            }
            audioOffloadListener.onExperimentalOffloadedPlayback(isOffloadedPlayback(audioTrackBuildAudioTrack));
            return audioTrackBuildAudioTrack;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e10);
            }
            throw e10;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws AudioSink.InitializationException {
        try {
            return buildAudioTrack((Configuration) Assertions.checkNotNull(this.configuration));
        } catch (AudioSink.InitializationException e10) {
            Configuration configuration = this.configuration;
            if (configuration.bufferSize > 1000000) {
                Configuration configurationCopyWithBufferSize = configuration.copyWithBufferSize(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(configurationCopyWithBufferSize);
                    this.configuration = configurationCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    maybeDisableOffload();
                    throw e10;
                }
            }
            maybeDisableOffload();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean drainToEndOfStream() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.drainingAudioProcessorIndex
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.drainingAudioProcessorIndex = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.drainingAudioProcessorIndex
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.activeAudioProcessors
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.processBuffers(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.drainingAudioProcessorIndex
            int r0 = r0 + r1
            r9.drainingAudioProcessorIndex = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            r9.writeBuffer(r0, r7)
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.drainingAudioProcessorIndex = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.drainToEndOfStream():boolean");
    }

    private void flushAudioProcessors() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.outputBuffers[i10] = audioProcessor.getOutput();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    public static AudioFormat getAudioFormat(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private PlaybackParameters getAudioProcessorPlaybackParameters() {
        return getMediaPositionParameters().playbackParameters;
    }

    private static int getAudioTrackMinBufferSize(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        Assertions.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    private static int getFramesPerEncodedSample(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (mpegAudioFrameSampleCount != -1) {
                    return mpegAudioFrameSampleCount;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                if (iFindTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
            case 20:
                return OpusUtil.parsePacketAudioSampleCount(byteBuffer);
        }
    }

    private MediaPositionParameters getMediaPositionParameters() {
        MediaPositionParameters mediaPositionParameters = this.afterDrainParameters;
        return mediaPositionParameters != null ? mediaPositionParameters : !this.mediaPositionParametersCheckpoints.isEmpty() ? this.mediaPositionParametersCheckpoints.getLast() : this.mediaPositionParameters;
    }

    @RequiresApi(29)
    @SuppressLint({"InlinedApi"})
    private int getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes) {
        int i10 = Util.SDK_INT;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && Util.MODEL.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? this.submittedPcmBytes / ((long) configuration.inputPcmFrameSize) : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? this.writtenPcmBytes / ((long) configuration.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private boolean initializeAudioTrack() throws AudioSink.InitializationException {
        PlayerId playerId;
        if (!this.releasingConditionVariable.isOpen()) {
            return false;
        }
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            if (this.offloadMode != 3) {
                AudioTrack audioTrack = this.audioTrack;
                Format format = this.configuration.inputFormat;
                audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
        }
        int i10 = Util.SDK_INT;
        if (i10 >= 31 && (playerId = this.playerId) != null) {
            Api31.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
        AudioTrack audioTrack2 = this.audioTrack;
        Configuration configuration = this.configuration;
        audioTrackPositionTracker.setAudioTrack(audioTrack2, configuration.outputMode == 2, configuration.outputEncoding, configuration.outputPcmFrameSize, configuration.bufferSize);
        setVolumeInternal();
        int i11 = this.auxEffectInfo.effectId;
        if (i11 != 0) {
            this.audioTrack.attachAuxEffect(i11);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.preferredDevice;
        if (audioDeviceInfoApi23 != null && i10 >= 23) {
            Api23.setPreferredDeviceOnAudioTrack(this.audioTrack, audioDeviceInfoApi23);
        }
        this.startMediaTimeUsNeedsInit = true;
        return true;
    }

    private static boolean isAudioTrackDeadObject(int i10) {
        return (Util.SDK_INT >= 24 && i10 == -6) || i10 == ERROR_NATIVE_DEAD_OBJECT;
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private void processBuffers(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.outputBuffers[i10 - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i10 == length) {
                writeBuffer(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.activeAudioProcessors[i10];
                if (i10 > this.drainingAudioProcessorIndex) {
                    audioProcessor.queueInput(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i10] = output;
                if (output.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @RequiresApi(29)
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new StreamEventCallbackV29();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    private static void releaseAudioTrackAsync(final AudioTrack audioTrack, final ConditionVariable conditionVariable) {
        conditionVariable.close();
        synchronized (releaseExecutorLock) {
            try {
                if (releaseExecutor == null) {
                    releaseExecutor = Util.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
                }
                pendingReleaseCount++;
                releaseExecutor.execute(new Runnable() { // from class: com.google.android.exoplayer2.audio.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.a(audioTrack, conditionVariable);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new MediaPositionParameters(getAudioProcessorPlaybackParameters(), getSkipSilenceEnabled(), 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.drainingAudioProcessorIndex = -1;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        flushAudioProcessors();
    }

    private void setAudioProcessorPlaybackParametersAndSkipSilence(PlaybackParameters playbackParameters, boolean z10) {
        MediaPositionParameters mediaPositionParameters = getMediaPositionParameters();
        if (playbackParameters.equals(mediaPositionParameters.playbackParameters) && z10 == mediaPositionParameters.skipSilence) {
            return;
        }
        MediaPositionParameters mediaPositionParameters2 = new MediaPositionParameters(playbackParameters, z10, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = mediaPositionParameters2;
        } else {
            this.mediaPositionParameters = mediaPositionParameters2;
        }
    }

    @RequiresApi(23)
    private void setAudioTrackPlaybackParametersV23(PlaybackParameters playbackParameters) {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.speed).setPitch(playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                Log.w(TAG, "Failed to set playback params", e10);
            }
            playbackParameters = new PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(playbackParameters.speed);
        }
        this.audioTrackPlaybackParameters = playbackParameters;
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            if (Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    @RequiresApi(21)
    private static void setVolumeInternalV21(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void setupAudioProcessors() {
        AudioProcessor[] audioProcessorArr = this.configuration.availableAudioProcessors;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.outputBuffers = new ByteBuffer[size];
        flushAudioProcessors();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !"audio/raw".equals(this.configuration.inputFormat.sampleMimeType) || shouldUseFloatOutput(this.configuration.inputFormat.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i10) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i10);
    }

    private boolean useOffloadedPlayback(Format format, AudioAttributes audioAttributes) {
        int encoding;
        int audioTrackChannelConfig;
        int offloadedPlaybackSupport;
        if (Util.SDK_INT < 29 || this.offloadMode == 0 || (encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs)) == 0 || (audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount)) == 0 || (offloadedPlaybackSupport = getOffloadedPlaybackSupport(getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding), audioAttributes.getAudioAttributesV21().audioAttributes)) == 0) {
            return false;
        }
        if (offloadedPlaybackSupport == 1) {
            return ((format.encoderDelay != 0 || format.encoderPadding != 0) && (this.offloadMode == 1)) ? false : true;
        }
        if (offloadedPlaybackSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void writeBuffer(ByteBuffer byteBuffer, long j10) throws Exception {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iWriteNonBlockingV21;
        AudioSink.Listener listener;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.outputBuffer;
            if (byteBuffer3 != null) {
                Assertions.checkArgument(byteBuffer3 == byteBuffer);
            } else {
                this.outputBuffer = byteBuffer;
                if (Util.SDK_INT < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.preV21OutputBuffer = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Util.SDK_INT < 21) {
                int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
                if (availableBufferSize > 0) {
                    iWriteNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(iRemaining2, availableBufferSize));
                    if (iWriteNonBlockingV21 > 0) {
                        this.preV21OutputBufferOffset += iWriteNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                    }
                } else {
                    iWriteNonBlockingV21 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.tunneling) {
                Assertions.checkState(j10 != -9223372036854775807L);
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = defaultAudioSink.writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer2, iRemaining2, j10);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = writeNonBlockingV21(defaultAudioSink.audioTrack, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
            if (iWriteNonBlockingV21 < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWriteNonBlockingV21, defaultAudioSink.configuration.inputFormat, isAudioTrackDeadObject(iWriteNonBlockingV21) && defaultAudioSink.writtenEncodedFrames > 0);
                AudioSink.Listener listener2 = defaultAudioSink.listener;
                if (listener2 != null) {
                    listener2.onAudioSinkError(writeException);
                }
                if (writeException.isRecoverable) {
                    throw writeException;
                }
                defaultAudioSink.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
                return;
            }
            defaultAudioSink.writeExceptionPendingExceptionHolder.clear();
            if (isOffloadedPlayback(defaultAudioSink.audioTrack)) {
                if (defaultAudioSink.writtenEncodedFrames > 0) {
                    defaultAudioSink.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (defaultAudioSink.playing && (listener = defaultAudioSink.listener) != null && iWriteNonBlockingV21 < iRemaining2 && !defaultAudioSink.isWaitingForOffloadEndOfStreamHandled) {
                    listener.onOffloadBufferFull();
                }
            }
            int i10 = defaultAudioSink.configuration.outputMode;
            if (i10 == 0) {
                defaultAudioSink.writtenPcmBytes += (long) iWriteNonBlockingV21;
            }
            if (iWriteNonBlockingV21 == iRemaining2) {
                if (i10 != 0) {
                    Assertions.checkState(byteBuffer2 == defaultAudioSink.inputBuffer);
                    defaultAudioSink.writtenEncodedFrames += ((long) defaultAudioSink.framesPerEncodedSample) * ((long) defaultAudioSink.inputBufferAccessUnitCount);
                }
                defaultAudioSink.outputBuffer = null;
            }
        }
    }

    @RequiresApi(21)
    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @RequiresApi(21)
    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i10);
            this.avSyncHeader.putLong(8, j10 * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i10;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i10);
        if (iWriteNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(Format format, int i10, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessor[] audioProcessorArr;
        int i11;
        int iIntValue;
        int iIntValue2;
        int i12;
        int pcmFrameSize;
        int pcmFrameSize2;
        int i13;
        int bufferSizeInBytes;
        int[] iArr2;
        if ("audio/raw".equals(format.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            audioProcessorArr = shouldUseFloatOutput(format.pcmEncoding) ? this.toFloatPcmAvailableAudioProcessors : this.toIntPcmAvailableAudioProcessors;
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            if (Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.setChannelMap(iArr2);
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(format.sampleRate, format.channelCount, format.pcmEncoding);
            for (AudioProcessor audioProcessor : audioProcessorArr) {
                try {
                    AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
                    if (audioProcessor.isActive()) {
                        audioFormat = audioFormatConfigure;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                    throw new AudioSink.ConfigurationException(e10, format);
                }
            }
            iIntValue = audioFormat.encoding;
            i11 = audioFormat.sampleRate;
            iIntValue2 = Util.getAudioTrackChannelConfig(audioFormat.channelCount);
            pcmFrameSize2 = Util.getPcmFrameSize(iIntValue, audioFormat.channelCount);
            i12 = 0;
        } else {
            audioProcessorArr = new AudioProcessor[0];
            i11 = format.sampleRate;
            if (useOffloadedPlayback(format, this.audioAttributes)) {
                iIntValue = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                iIntValue2 = Util.getAudioTrackChannelConfig(format.channelCount);
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i12 = 1;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i12 = 2;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
            }
        }
        int i15 = iIntValue;
        int i16 = iIntValue2;
        if (i15 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + format, format);
        }
        if (i16 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + format, format);
        }
        if (i10 != 0) {
            bufferSizeInBytes = i10;
            i13 = i11;
        } else {
            i13 = i11;
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i11, i16, i15), i15, i12, pcmFrameSize2 != -1 ? pcmFrameSize2 : 1, i13, format.bitrate, this.enableAudioTrackPlaybackParams ? 8.0d : 1.0d);
        }
        this.offloadDisabledUntilNextConfiguration = false;
        Configuration configuration = new Configuration(format, pcmFrameSize, i12, pcmFrameSize2, i13, i16, i15, bufferSizeInBytes, audioProcessorArr);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = configuration;
        } else {
            this.configuration = configuration;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(Util.SDK_INT >= 21);
        Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        if (Util.SDK_INT < 25) {
            flush();
            return;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            this.audioTrack.flush();
            this.audioTrackPositionTracker.reset();
            AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
            AudioTrack audioTrack = this.audioTrack;
            Configuration configuration = this.configuration;
            audioTrackPositionTracker.setAudioTrack(audioTrack, configuration.outputMode == 2, configuration.outputEncoding, configuration.outputPcmFrameSize, configuration.bufferSize);
            this.startMediaTimeUsNeedsInit = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((StreamEventCallbackV29) Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister(this.audioTrack);
            }
            if (Util.SDK_INT < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            releaseAudioTrackAsync(this.audioTrack, this.releasingConditionVariable);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z10), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(Format format) {
        if (!"audio/raw".equals(format.sampleMimeType)) {
            return ((this.offloadDisabledUntilNextConfiguration || !useOffloadedPlayback(format, this.audioAttributes)) && !this.audioCapabilities.isPassthroughPlaybackSupported(format)) ? 0 : 2;
        }
        if (Util.isEncodingLinearPcm(format.pcmEncoding)) {
            int i10 = format.pcmEncoding;
            return (i10 == 2 || (this.enableFloatOutput && i10 == 4)) ? 2 : 1;
        }
        Log.w(TAG, "Invalid PCM encoding: " + format.pcmEncoding);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.enableAudioTrackPlaybackParams ? this.audioTrackPlaybackParameters : getAudioProcessorPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return getMediaPositionParameters().skipSilence;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                if (isOffloadedPlayback(this.audioTrack) && this.offloadMode != 3) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.audioTrack;
                    Format format = this.configuration.inputFormat;
                    audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.isRecoverable) {
                    throw e10;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e10);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j10);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (this.enableAudioTrackPlaybackParams && Util.SDK_INT >= 23) {
                setAudioTrackPlaybackParametersV23(this.audioTrackPlaybackParameters);
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            Assertions.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            Configuration configuration = this.configuration;
            if (configuration.outputMode != 0 && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(configuration.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
                this.afterDrainParameters = null;
            }
            long jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && Math.abs(jInputFramesToDurationUs - j10) > 200000) {
                AudioSink.Listener listener = this.listener;
                if (listener != null) {
                    listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j10, jInputFramesToDurationUs));
                }
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j11 = j10 - jInputFramesToDurationUs;
                this.startMediaTimeUs += j11;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j10);
                AudioSink.Listener listener2 = this.listener;
                if (listener2 != null && j11 != 0) {
                    listener2.onPositionDiscontinuity();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += ((long) this.framesPerEncodedSample) * ((long) i10);
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i10;
        }
        processBuffers(j10);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return false;
        }
        Log.w(TAG, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        if (isAudioTrackInitialized()) {
            return this.handledEndOfStream && !hasPendingData();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized() && this.audioTrackPositionTracker.pause()) {
            this.audioTrack.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.toIntPcmAvailableAudioProcessors) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.toFloatPcmAvailableAudioProcessors) {
            audioProcessor2.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i10) {
        if (this.audioSessionId != i10) {
            this.audioSessionId = i10;
            this.externalAudioSessionIdProvided = i10 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i10 = auxEffectInfo.effectId;
        float f10 = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            if (this.auxEffectInfo.effectId != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.audioTrack.setAuxEffectSendLevel(f10);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public /* synthetic */ void setOutputStreamOffsetUs(long j10) {
        m.a(this, j10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (!this.enableAudioTrackPlaybackParams || Util.SDK_INT < 23) {
            setAudioProcessorPlaybackParametersAndSkipSilence(playbackParameters2, getSkipSilenceEnabled());
        } else {
            setAudioTrackPlaybackParametersV23(playbackParameters2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = audioDeviceInfo == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo);
        this.preferredDevice = audioDeviceInfoApi23;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            Api23.setPreferredDeviceOnAudioTrack(audioTrack, audioDeviceInfoApi23);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z10) {
        setAudioProcessorPlaybackParametersAndSkipSilence(getAudioProcessorPlaybackParameters(), z10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f10) {
        if (this.volume != f10) {
            this.volume = f10;
            setVolumeInternal();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) != 0;
    }

    @InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessors(audioProcessors).build()")
    @InlineMeValidationDisabled("Migrate constructor to Builder")
    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) MoreObjects.firstNonNull(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr));
    }

    @InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessors(audioProcessors).setEnableFloatOutput(enableFloatOutput).build()")
    @InlineMeValidationDisabled("Migrate constructor to Builder")
    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr, boolean z10) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) MoreObjects.firstNonNull(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).setEnableFloatOutput(z10));
    }

    @InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(enableFloatOutput).setEnableAudioTrackPlaybackParams(enableAudioTrackPlaybackParams).setOffloadMode(offloadMode).build()")
    @InlineMeValidationDisabled("Migrate constructor to Builder")
    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean z10, boolean z11, int i10) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) MoreObjects.firstNonNull(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(z10).setEnableAudioTrackPlaybackParams(z11).setOffloadMode(i10));
    }

    private DefaultAudioSink(Builder builder) {
        this.audioCapabilities = builder.audioCapabilities;
        com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain = builder.audioProcessorChain;
        this.audioProcessorChain = audioProcessorChain;
        int i10 = Util.SDK_INT;
        this.enableFloatOutput = i10 >= 21 && builder.enableFloatOutput;
        this.enableAudioTrackPlaybackParams = i10 >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = i10 >= 29 ? builder.offloadMode : 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        ConditionVariable conditionVariable = new ConditionVariable(Clock.DEFAULT);
        this.releasingConditionVariable = conditionVariable;
        conditionVariable.open();
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.toFloatPcmAvailableAudioProcessors = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.volume = 1.0f;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new MediaPositionParameters(playbackParameters, false, 0L, 0L);
        this.audioTrackPlaybackParameters = playbackParameters;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new AudioProcessor[0];
        this.outputBuffers = new ByteBuffer[0];
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new PendingExceptionHolder<>(100L);
        this.writeExceptionPendingExceptionHolder = new PendingExceptionHolder<>(100L);
        this.audioOffloadListener = builder.audioOffloadListener;
    }
}
