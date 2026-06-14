package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        private static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(int i10, @Nullable Format format, int i11, @Nullable Object obj, long j10) {
            downstreamFormatChanged(new MediaLoadData(1, i10, format, i11, obj, Util.usToMs(j10), -9223372036854775807L));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i10) {
            loadCanceled(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i10) {
            loadCompleted(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i10, IOException iOException, boolean z10) {
            loadError(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i10) {
            loadStarted(loadEventInfo, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void upstreamDiscarded(int i10, long j10, long j11) {
            upstreamDiscarded(new MediaLoadData(1, i10, null, 3, null, Util.usToMs(j10), Util.usToMs(j11)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i10, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadCanceled(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadCompleted(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, IOException iOException, boolean z10) {
            loadError(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)), iOException, z10);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadStarted(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, Util.usToMs(j10), Util.usToMs(j11)));
        }

        @CheckResult
        @Deprecated
        public EventDispatcher withParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            return new EventDispatcher(this.listenerAndHandlers, i10, mediaPeriodId);
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f5181b;
                        mediaSourceEventListener.onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        mediaSourceEventListener.onUpstreamDiscarded(this.f5202b.windowIndex, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f5198b;
                        mediaSourceEventListener.onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f5188b;
                        mediaSourceEventListener.onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z10) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f5192b;
                        mediaSourceEventListener.onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z10);
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f5184b;
                        mediaSourceEventListener.onLoadStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }
    }

    void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10);

    void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
