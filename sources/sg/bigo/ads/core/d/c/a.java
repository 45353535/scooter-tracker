package sg.bigo.ads.core.d.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f104049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f104050b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.c.a$a, reason: collision with other inner class name */
    static class C1290a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f104052c;

        C1290a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.d.c.a.b
        protected final void a() {
            Runnable runnable = this.f104053a;
            if (runnable != null) {
                this.f104052c = a.a(runnable);
            }
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f104053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f104054b = new AtomicBoolean(false);

        b(Runnable runnable) {
            this.f104053a = runnable;
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f104054b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        f104049a = new Handler(handlerThread.getLooper());
    }

    public static Future a(final Runnable runnable) {
        return f104050b.submit(new Runnable() { // from class: sg.bigo.ads.core.d.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("stat thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("stat thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j10) {
        C1290a c1290a = new C1290a(runnable);
        f104049a.postDelayed(c1290a, j10);
        return c1290a;
    }

    public static void a(b bVar) {
        Future future;
        if (bVar != null) {
            bVar.f104054b.set(true);
            if (bVar instanceof C1290a) {
                C1290a c1290a = (C1290a) bVar;
                if (c1290a.f104052c != null && (future = c1290a.f104052c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f104049a.removeCallbacks(bVar);
        }
    }
}
