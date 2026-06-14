package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
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

        public static /* synthetic */ void d(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
            eventDispatcher.getClass();
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onVideoDisabled(decoderCounters);
        }

        public void decoderInitialized(final String str, final long j10, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5253b.listener)).onVideoDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5282b.listener)).onVideoDecoderReleased(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.d(this.f5280b, decoderCounters);
                    }
                });
            }
        }

        public void droppedFrames(final int i10, final long j10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5259b.listener)).onDroppedFrames(i10, j10);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5275b.listener)).onVideoEnabled(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5277b.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.handler != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5262b.listener)).onRenderedFirstFrame(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long j10, final int i10) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5265b.listener)).onVideoFrameProcessingOffset(j10, i10);
                    }
                });
            }
        }

        public void videoCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5268b.listener)).onVideoCodecError(exc);
                    }
                });
            }
        }

        public void videoSizeChanged(final VideoSize videoSize) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(this.f5257b.listener)).onVideoSizeChanged(videoSize);
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

    void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(VideoSize videoSize);
}
