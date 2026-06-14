package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final AudioRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = audioRendererEventListener;
        }

        public static /* synthetic */ void d(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
            eventDispatcher.getClass();
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onAudioDisabled(decoderCounters);
        }

        public void audioCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4956b.listener)).onAudioCodecError(exc);
                    }
                });
            }
        }

        public void audioSinkError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4958b.listener)).onAudioSinkError(exc);
                    }
                });
            }
        }

        public void audioTrackInitialized(final AudioSink.AudioTrackConfig audioTrackConfig) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4951b.listener)).onAudioTrackInitialized(audioTrackConfig);
                    }
                });
            }
        }

        public void audioTrackReleased(final AudioSink.AudioTrackConfig audioTrackConfig) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4954b.listener)).onAudioTrackReleased(audioTrackConfig);
                    }
                });
            }
        }

        public void decoderInitialized(final String str, final long j10, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4965b.listener)).onAudioDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4969b.listener)).onAudioDecoderReleased(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.d(this.f4943b, decoderCounters);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4941b.listener)).onAudioEnabled(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4960b.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void positionAdvancing(final long j10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4945b.listener)).onAudioPositionAdvancing(j10);
                    }
                });
            }
        }

        public void skipSilenceEnabledChanged(final boolean z10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4963b.listener)).onSkipSilenceEnabledChanged(z10);
                    }
                });
            }
        }

        public void underrun(final int i10, final long j10, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f4947b.listener)).onAudioUnderrun(i10, j10, j11);
                    }
                });
            }
        }
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j10);

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioUnderrun(int i10, long j10, long j11);

    void onSkipSilenceEnabledChanged(boolean z10);
}
