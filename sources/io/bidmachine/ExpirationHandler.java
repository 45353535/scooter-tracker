package io.bidmachine;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class ExpirationHandler {
    private final long expirationTimeMs;

    @NonNull
    private final c expiredTask;

    @NonNull
    private final AtomicBoolean isExpireTrackerSubscribed;

    @NonNull
    private final TaskScheduler taskScheduler;

    public interface Listener {
        void onExpired();
    }

    public interface TaskScheduler {
        void cancelTask(@NonNull ee.b bVar);

        void scheduleTask(@NonNull ee.b bVar, long j10);
    }

    private static class b implements TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(ee.b bVar) {
            bVar.d(true);
            io.bidmachine.core.h.f(bVar);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(ee.b bVar, long j10) {
            bVar.d(false);
            io.bidmachine.core.h.T(bVar, j10);
        }
    }

    private static class c extends ee.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference f79144c;

        public c(Listener listener) {
            this.f79144c = new WeakReference(listener);
        }

        @Override // ee.b
        public void b() {
            Listener listener = (Listener) this.f79144c.get();
            if (listener != null) {
                listener.onExpired();
            }
        }
    }

    public ExpirationHandler(long j10, @NonNull Listener listener) {
        this(j10, listener, new b());
    }

    @NonNull
    TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    public void start() {
        if (this.expirationTimeMs <= 0 || !this.isExpireTrackerSubscribed.compareAndSet(false, true)) {
            return;
        }
        this.taskScheduler.scheduleTask(this.expiredTask, this.expirationTimeMs);
    }

    public void stop() {
        this.isExpireTrackerSubscribed.set(false);
        this.taskScheduler.cancelTask(this.expiredTask);
    }

    public ExpirationHandler(long j10, @NonNull Listener listener, @NonNull TaskScheduler taskScheduler) {
        this.expiredTask = new c(listener);
        this.expirationTimeMs = j10;
        this.taskScheduler = taskScheduler;
        this.isExpireTrackerSubscribed = new AtomicBoolean(false);
    }
}
