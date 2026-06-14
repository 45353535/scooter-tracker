package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile l0 f83688i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f83690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f83691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f83692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f83693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Callable f83694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f83695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f83686g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f83687h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final io.sentry.util.a f83689j = new io.sentry.util.a();

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f83696a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i10 = this.f83696a;
            this.f83696a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private l0() {
        this(f83686g);
    }

    public static /* synthetic */ Void b(l0 l0Var) {
        l0Var.getClass();
        try {
            l0Var.f83691b = ((InetAddress) l0Var.f83694e.call()).getCanonicalHostName();
            l0Var.f83692c = System.currentTimeMillis() + l0Var.f83690a;
            l0Var.f83693d.set(false);
            return null;
        } catch (Throwable th2) {
            l0Var.f83693d.set(false);
            throw th2;
        }
    }

    public static l0 e() {
        if (f83688i == null) {
            g1 g1VarD = f83689j.d();
            try {
                if (f83688i == null) {
                    f83688i = new l0();
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f83688i;
    }

    private void f() {
        this.f83692c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void g() {
        try {
            this.f83695f.submit(new Callable() { // from class: io.sentry.k0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return l0.b(this.f83658b);
                }
            }).get(f83687h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    void c() {
        this.f83695f.shutdown();
    }

    public String d() {
        if (this.f83692c < System.currentTimeMillis() && this.f83693d.compareAndSet(false, true)) {
            g();
        }
        return this.f83691b;
    }

    l0(long j10) {
        this(j10, new Callable() { // from class: io.sentry.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    l0(long j10, Callable callable) {
        this.f83693d = new AtomicBoolean(false);
        this.f83695f = Executors.newSingleThreadExecutor(new b());
        this.f83690a = j10;
        this.f83694e = (Callable) io.sentry.util.w.c(callable, "getLocalhost is required");
        g();
    }
}
