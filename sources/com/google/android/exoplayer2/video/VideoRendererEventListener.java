package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final VideoRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = videoRendererEventListener;
        }

        public static /* synthetic */ void c(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
            eventDispatcher.getClass();
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onVideoDisabled(decoderCounters);
        }

        public static /* synthetic */ void i(EventDispatcher eventDispatcher, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((VideoRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onVideoInputFormatChanged(format);
            ((VideoRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void decoderInitialized(final String str, final long j10, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25241b.listener)).onVideoDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25235b.listener)).onVideoDecoderReleased(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.c(this.f25237b, decoderCounters);
                    }
                });
            }
        }

        public void droppedFrames(final int i10, final long j10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25229b.listener)).onDroppedFrames(i10, j10);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25245b.listener)).onVideoEnabled(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.i(this.f25247b, format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.handler != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25232b.listener)).onRenderedFirstFrame(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long j10, final int i10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25250b.listener)).onVideoFrameProcessingOffset(j10, i10);
                    }
                });
            }
        }

        public void videoCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25239b.listener)).onVideoCodecError(exc);
                    }
                });
            }
        }

        public void videoSizeChanged(final VideoSize videoSize) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f25227b.listener)).onVideoSizeChanged(videoSize);
                    }
                });
            }
        }
    }

    void onDroppedFrames(int i10, long j10);

    void onRenderedFirstFrame(Object obj, long j10);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j10, int i10);

    @Deprecated
    void onVideoInputFormatChanged(Format format);

    void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(VideoSize videoSize);
}
