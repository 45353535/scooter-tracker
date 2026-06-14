package ee;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f69084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f69085d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f69086a = new ScheduledThreadPoolExecutor(f69085d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f69087b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ee.a$a, reason: collision with other inner class name */
    private class RunnableC0869a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f69088b;

        public RunnableC0869a(Runnable runnable) {
            this.f69088b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c(this.f69088b);
            this.f69088b.run();
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f69084c = iAvailableProcessors;
        f69085d = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Future c(Runnable runnable) {
        try {
            return (Future) this.f69087b.remove(runnable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b(b bVar) {
        try {
            bVar.d(true);
            Future futureC = c(bVar);
            if (futureC == null) {
                return;
            }
            futureC.cancel(false);
        } catch (Throwable unused) {
        }
    }

    public void d(b bVar, long j10, TimeUnit timeUnit) {
        try {
            bVar.d(false);
            this.f69087b.put(bVar, this.f69086a.schedule(new RunnableC0869a(bVar), j10, timeUnit));
        } catch (Throwable unused) {
        }
    }

    @Override // ee.c
    public void execute(Runnable runnable) {
        try {
            this.f69086a.execute(runnable);
        } catch (Throwable unused) {
        }
    }
}
