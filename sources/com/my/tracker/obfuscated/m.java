package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f61657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f61658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f61659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f61660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f61661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Executor f61662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Executor f61663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f61664h;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f61657a = handler;
        f61658b = Executors.newSingleThreadExecutor();
        f61659c = Executors.newSingleThreadExecutor();
        f61660d = Executors.newSingleThreadExecutor();
        f61661e = Executors.newSingleThreadExecutor();
        f61662f = Executors.newSingleThreadExecutor();
        f61663g = new androidx.emoji2.text.a(handler);
        f61664h = new a();
    }

    public static void a(Runnable runnable) {
        f61658b.execute(f61664h.a(runnable));
    }

    public static void b(Runnable runnable) {
        f61659c.execute(f61664h.a(runnable));
    }

    public static void c(Runnable runnable) {
        f61660d.execute(f61664h.a(runnable));
    }

    public static void d(Runnable runnable) {
        f61661e.execute(f61664h.a(runnable));
    }

    public static void e(Runnable runnable) {
        f61662f.execute(f61664h.a(runnable));
    }

    public static void f(Runnable runnable) {
        Runnable runnableA = f61664h.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnableA.run();
        } else {
            f61663g.execute(runnableA);
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque f61665a = new ArrayDeque();

        /* JADX INFO: renamed from: com.my.tracker.obfuscated.m$a$a, reason: collision with other inner class name */
        static final class RunnableC0785a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a f61666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            volatile Runnable f61667b;

            RunnableC0785a(a aVar) {
                this.f61666a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.f61667b;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th2) {
                    try {
                        x2.b("RunnableThrowableDecorator: exception has been caught", th2);
                        a aVar = this.f61666a;
                        if (aVar != null) {
                            aVar.a(this);
                        }
                    } finally {
                        a aVar2 = this.f61666a;
                        if (aVar2 != null) {
                            aVar2.a(this);
                        }
                    }
                }
            }
        }

        a() {
            for (int i10 = 0; i10 < 64; i10++) {
                this.f61665a.add(new RunnableC0785a(this));
            }
        }

        public Runnable a(Runnable runnable) {
            RunnableC0785a runnableC0785a;
            synchronized (this) {
                runnableC0785a = (RunnableC0785a) this.f61665a.pollFirst();
            }
            if (runnableC0785a == null) {
                runnableC0785a = new RunnableC0785a(null);
            }
            runnableC0785a.f61667b = runnable;
            return runnableC0785a;
        }

        void a(RunnableC0785a runnableC0785a) {
            synchronized (this) {
                runnableC0785a.f61667b = null;
                this.f61665a.add(runnableC0785a);
            }
        }
    }
}
