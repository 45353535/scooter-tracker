package sg.bigo.ads.core.b.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f103977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f103978b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));

    static class a extends AbstractRunnableC1287b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f103980c;

        a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.b.c.b.AbstractRunnableC1287b
        protected final void a() {
            Runnable runnable = this.f103981a;
            if (runnable != null) {
                this.f103980c = b.a(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.b.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC1287b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f103981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f103982b = new AtomicBoolean(false);

        AbstractRunnableC1287b(Runnable runnable) {
            this.f103981a = runnable;
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f103982b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        f103977a = new Handler(handlerThread.getLooper());
    }

    public static Future<?> a(final Runnable runnable) {
        return f103978b.submit(new Runnable() { // from class: sg.bigo.ads.core.b.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("callback thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("callback thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                }
            }
        });
    }

    public static AbstractRunnableC1287b a(Runnable runnable, long j10) {
        a aVar = new a(runnable);
        f103977a.postDelayed(aVar, j10);
        return aVar;
    }

    public static void a(AbstractRunnableC1287b abstractRunnableC1287b) {
        Future future;
        if (abstractRunnableC1287b != null) {
            abstractRunnableC1287b.f103982b.set(true);
            if (abstractRunnableC1287b instanceof a) {
                a aVar = (a) abstractRunnableC1287b;
                if (aVar.f103980c != null && (future = aVar.f103980c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f103977a.removeCallbacks(abstractRunnableC1287b);
        }
    }
}
