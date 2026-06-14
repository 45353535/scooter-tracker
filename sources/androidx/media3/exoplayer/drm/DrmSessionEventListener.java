package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface DrmSessionEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        private static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void c(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i10) {
            drmSessionEventListener.onDrmSessionAcquired(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, i10);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void drmKeysLoaded() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f5012b;
                        drmSessionEventListener.onDrmKeysLoaded(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f5005b;
                        drmSessionEventListener.onDrmKeysRemoved(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f5007b;
                        drmSessionEventListener.onDrmKeysRestored(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int i10) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.c(this.f5009b, drmSessionEventListener, i10);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f5002b;
                        drmSessionEventListener.onDrmSessionManagerError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, exc);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f5014b;
                        drmSessionEventListener.onDrmSessionReleased(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
                    }
                });
            }
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
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
    }

    void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    @Deprecated
    void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i11);

    void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc);

    void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId);
}
