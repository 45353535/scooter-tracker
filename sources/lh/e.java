package lh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f94306h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f94307i = new e(new c(ih.d.N(ih.d.f74844i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f94308j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f94309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f94310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f94311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f94312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f94313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f94314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f94315g;

    public interface a {
        void a(e eVar, long j10);

        void b(e eVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return e.f94308j;
        }

        private b() {
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f94316a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f94316a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // lh.e.a
        public void a(e taskRunner, long j10) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // lh.e.a
        public void b(e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // lh.e.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f94316a.execute(runnable);
        }

        @Override // lh.e.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lh.a aVarD;
            long jNanoTime;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                lh.d dVarD = aVarD.d();
                Intrinsics.checkNotNull(dVarD);
                e eVar2 = e.this;
                boolean zIsLoggable = e.f94306h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = dVarD.h().g().nanoTime();
                    lh.b.c(aVarD, dVarD, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    try {
                        eVar2.j(aVarD);
                        Unit unit = Unit.f93236a;
                        if (zIsLoggable) {
                            lh.b.c(aVarD, dVarD, "finished run in " + lh.b.b(dVarD.h().g().nanoTime() - jNanoTime));
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        lh.b.c(aVarD, dVarD, "failed a run in " + lh.b.b(dVarD.h().g().nanoTime() - jNanoTime));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f94308j = logger;
    }

    public e(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f94309a = backend;
        this.f94310b = 10000;
        this.f94313e = new ArrayList();
        this.f94314f = new ArrayList();
        this.f94315g = new d();
    }

    private final void c(lh.a aVar, long j10) {
        if (ih.d.f74843h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        lh.d dVarD = aVar.d();
        Intrinsics.checkNotNull(dVarD);
        if (dVarD.c() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f94313e.remove(dVarD);
        if (j10 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j10, true);
        }
        if (dVarD.e().isEmpty()) {
            return;
        }
        this.f94314f.add(dVarD);
    }

    private final void e(lh.a aVar) {
        if (ih.d.f74843h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        lh.d dVarD = aVar.d();
        Intrinsics.checkNotNull(dVarD);
        dVarD.e().remove(aVar);
        this.f94314f.remove(dVarD);
        dVarD.l(aVar);
        this.f94313e.add(dVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(lh.a aVar) {
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                Unit unit = Unit.f93236a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                c(aVar, -1L);
                Unit unit2 = Unit.f93236a;
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    public final lh.a d() {
        boolean z10;
        if (ih.d.f74843h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f94314f.isEmpty()) {
            long jNanoTime = this.f94309a.nanoTime();
            Iterator it = this.f94314f.iterator();
            long jMin = Long.MAX_VALUE;
            lh.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                lh.a aVar2 = (lh.a) ((lh.d) it.next()).e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f94311c && !this.f94314f.isEmpty())) {
                    this.f94309a.execute(this.f94315g);
                }
                return aVar;
            }
            if (this.f94311c) {
                if (jMin < this.f94312d - jNanoTime) {
                    this.f94309a.b(this);
                }
                return null;
            }
            this.f94311c = true;
            this.f94312d = jNanoTime + jMin;
            try {
                try {
                    this.f94309a.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.f94311c = false;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f94313e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((lh.d) this.f94313e.get(size)).b();
            }
        }
        for (int size2 = this.f94314f.size() - 1; -1 < size2; size2--) {
            lh.d dVar = (lh.d) this.f94314f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f94314f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f94309a;
    }

    public final void h(lh.d taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (ih.d.f74843h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f94314f.remove(taskQueue);
            } else {
                ih.d.c(this.f94314f, taskQueue);
            }
        }
        if (this.f94311c) {
            this.f94309a.b(this);
        } else {
            this.f94309a.execute(this.f94315g);
        }
    }

    public final lh.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f94310b;
            this.f94310b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new lh.d(this, sb2.toString());
    }
}
