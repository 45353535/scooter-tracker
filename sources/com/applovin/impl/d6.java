package com.applovin.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class d6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ExecutorService f8624r = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8633i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ExecutorService f8635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutorService f8636l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f8639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f8641q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8634j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f8637m = new ArrayList(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f8638n = new Object();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8642a;

        static {
            int[] iArr = new int[b.values().length];
            f8642a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8642a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8642a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8642a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    private static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f8649f;

        public c(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar, long j10) {
            super(kVar, i5Var, bVar);
            this.f8649f = j10;
        }
    }

    private class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8650a;

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                com.applovin.impl.sdk.o unused = d6.this.f8626b;
                if (com.applovin.impl.sdk.o.a()) {
                    d6.this.f8626b.a("TaskManager", "Caught unhandled exception", th2);
                }
            }
        }

        d(String str) {
            this.f8650a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f8650a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) d6.this.f8625a.a(x4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f8653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f8655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final i5 f8656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final b f8657e;

        public e(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar) {
            this.f8653a = kVar;
            this.f8655c = kVar.O();
            this.f8654b = i5Var.c();
            this.f8656d = i5Var;
            this.f8657e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a();
                if (!this.f8653a.E0() || this.f8656d.d()) {
                    ScheduledFuture scheduledFutureB = this.f8656d.b(Thread.currentThread(), ((Long) this.f8653a.a(x4.f11439v)).longValue());
                    this.f8656d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8655c.d(this.f8654b, "Task re-scheduled...");
                    }
                    this.f8653a.q0().a(this.f8656d, this.f8657e, 2000L);
                }
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8655c.a(this.f8654b, "Task failed execution", th2);
                    }
                    this.f8656d.a(th2);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8655c.d(this.f8654b, this.f8657e + " queue finished task " + this.f8656d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8655c.d(this.f8654b, this.f8657e + " queue finished task " + this.f8656d.c());
                    }
                }
            }
        }
    }

    public d6(com.applovin.impl.sdk.k kVar) {
        this.f8625a = kVar;
        this.f8626b = kVar.O();
        this.f8640p = ((Boolean) kVar.a(x4.T)).booleanValue();
        this.f8641q = ((Boolean) kVar.a(x4.S6)).booleanValue();
        this.f8627c = b("auxiliary_operations", ((Integer) kVar.a(x4.O)).intValue());
        this.f8628d = b("shared_thread_pool", ((Integer) kVar.a(x4.N)).intValue());
        this.f8629e = b("core", ((Integer) kVar.a(x4.U)).intValue());
        this.f8631g = b("caching", ((Integer) kVar.a(x4.V)).intValue());
        this.f8632h = b("mediation", ((Integer) kVar.a(x4.W)).intValue());
        this.f8630f = b("timeout", ((Integer) kVar.a(x4.X)).intValue());
        this.f8633i = b("other", ((Integer) kVar.a(x4.Y)).intValue());
        if (((Boolean) kVar.a(x4.I0)).booleanValue() && ((Boolean) kVar.a(x4.J0)).booleanValue()) {
            this.f8635k = Executors.newFixedThreadPool(((Integer) kVar.a(x4.K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f8636l = Executors.newFixedThreadPool(((Integer) kVar.a(x4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public Executor c() {
        return this.f8640p ? this.f8629e : this.f8628d;
    }

    public ExecutorService d() {
        return this.f8636l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.f8639o;
    }

    public void g() {
        synchronized (this.f8638n) {
            try {
                this.f8639o = true;
                for (e eVar : this.f8637m) {
                    if (this.f8641q) {
                        c cVar = (c) eVar;
                        a(cVar.f8656d, cVar.f8657e, cVar.f8649f);
                    } else {
                        a(eVar.f8656d, eVar.f8657e);
                    }
                }
                this.f8637m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h() {
        synchronized (this.f8638n) {
            this.f8639o = false;
        }
    }

    public ExecutorService a() {
        return this.f8635k;
    }

    public ScheduledFuture b(i5 i5Var, b bVar, long j10) {
        if (this.f8640p) {
            return a(new e(this.f8625a, i5Var, bVar)).schedule(i5Var, j10, TimeUnit.MILLISECONDS);
        }
        return this.f8627c.schedule(i5Var, j10, TimeUnit.MILLISECONDS);
    }

    public void a(i5 i5Var, b bVar) {
        a(i5Var, bVar, 0L);
    }

    public void a(i5 i5Var, b bVar, long j10) {
        a(i5Var, bVar, j10, false);
    }

    public void a(i5 i5Var, b bVar, long j10, boolean z10) {
        i5 i5Var2;
        long j11;
        e eVar;
        if (i5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            if (this.f8641q) {
                i5Var2 = i5Var;
                j11 = j10;
                eVar = new c(this.f8625a, i5Var2, bVar, j11);
            } else {
                i5Var2 = i5Var;
                j11 = j10;
                eVar = new e(this.f8625a, i5Var2, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j11, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8626b.d(i5Var2.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
    }

    public ExecutorService b() {
        return this.f8640p ? this.f8631g : f8624r;
    }

    private boolean b(e eVar) {
        if (eVar.f8656d.d()) {
            return false;
        }
        synchronized (this.f8638n) {
            try {
                if (this.f8639o) {
                    return false;
                }
                this.f8637m.add(eVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f8640p) {
            com.applovin.impl.sdk.k kVar = this.f8625a;
            e eVar = new e(kVar, new r6(kVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f8627c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new d(str));
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.q9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f10246b.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new r6(this.f8625a, str, runnable));
    }

    public void a(i5 i5Var) {
        if (i5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f8640p ? this.f8629e : this.f8628d;
            try {
                if (n7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f8625a, i5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = i5Var.b(Thread.currentThread(), ((Long) this.f8625a.a(x4.f11439v)).longValue());
                i5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8626b.a(i5Var.c(), "Task failed execution", th2);
                }
                i5Var.a(th2);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(i5 i5Var, k3 k3Var) {
        String strB = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f8634j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f8634j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f8625a, i5Var, b.MEDIATION));
    }

    private void a(final e eVar, long j10, boolean z10) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f8640p ? a(eVar) : this.f8628d;
        if (j10 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z10) {
            g0.a(j10, this.f8625a, new Runnable() { // from class: com.applovin.impl.p9
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(eVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i10 = a.f8642a[eVar.f8657e.ordinal()];
        if (i10 == 1) {
            return this.f8629e;
        }
        if (i10 == 2) {
            return this.f8631g;
        }
        if (i10 == 3) {
            return this.f8632h;
        }
        if (i10 != 4) {
            return this.f8633i;
        }
        return this.f8630f;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8626b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f8626b.a("TaskManager", "Awaiting tasks were interrupted", th2);
            return null;
        }
    }
}
