package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
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

        public static /* synthetic */ void d(EventDispatcher eventDispatcher, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((AudioRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onAudioInputFormatChanged(format);
            ((AudioRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        public static /* synthetic */ void i(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
            eventDispatcher.getClass();
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onAudioDisabled(decoderCounters);
        }

        public void audioCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24804b.listener)).onAudioCodecError(exc);
                    }
                });
            }
        }

        public void audioSinkError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24815b.listener)).onAudioSinkError(exc);
                    }
                });
            }
        }

        public void decoderInitialized(final String str, final long j10, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24800b.listener)).onAudioDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24792b.listener)).onAudioDecoderReleased(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.i(this.f24810b, decoderCounters);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24808b.listener)).onAudioEnabled(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.d(this.f24812b, format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void positionAdvancing(final long j10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24806b.listener)).onAudioPositionAdvancing(j10);
                    }
                });
            }
        }

        public void skipSilenceEnabledChanged(final boolean z10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24798b.listener)).onSkipSilenceEnabledChanged(z10);
                    }
                });
            }
        }

        public void underrun(final int i10, final long j10, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((AudioRendererEventListener) Util.castNonNull(this.f24794b.listener)).onAudioUnderrun(i10, j10, j11);
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

    @Deprecated
    void onAudioInputFormatChanged(Format format);

    void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j10);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i10, long j10, long j11);

    void onSkipSilenceEnabledChanged(boolean z10);
}
