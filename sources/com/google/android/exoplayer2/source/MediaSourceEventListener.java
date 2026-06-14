package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
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
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private long adjustMediaTime(long j10) {
            long jUsToMs = Util.usToMs(j10);
            if (jUsToMs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.mediaTimeOffsetMs + jUsToMs;
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(int i10, @Nullable Format format, int i11, @Nullable Object obj, long j10) {
            downstreamFormatChanged(new MediaLoadData(1, i10, format, i11, obj, adjustMediaTime(j10), -9223372036854775807L));
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
            upstreamDiscarded(new MediaLoadData(1, i10, null, 3, null, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            return new EventDispatcher(this.listenerAndHandlers, i10, mediaPeriodId, j10);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i10;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaTimeOffsetMs = j10;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadCanceled(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadCompleted(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, IOException iOException, boolean z10) {
            loadError(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)), iOException, z10);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            loadStarted(loadEventInfo, new MediaLoadData(i10, i11, format, i12, obj, adjustMediaTime(j10), adjustMediaTime(j11)));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.source.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f25126b;
                        mediaSourceEventListener.onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.source.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        mediaSourceEventListener.onUpstreamDiscarded(this.f25110b.windowIndex, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.source.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f25102b;
                        mediaSourceEventListener.onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.source.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f25092b;
                        mediaSourceEventListener.onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z10) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.source.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f25096b;
                        mediaSourceEventListener.onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z10);
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.source.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f25106b;
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
