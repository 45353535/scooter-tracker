package jg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends CoroutineDispatcher implements kotlinx.coroutines.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f85882h = AtomicIntegerFieldUpdater.newUpdater(l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.k f85883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineDispatcher f85884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f85885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f85886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q f85887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f85888g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    private final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f85889b;

        public a(Runnable runnable) {
            this.f85889b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f85889b.run();
                } catch (Throwable th2) {
                    eg.d0.a(kotlin.coroutines.e.f93267b, th2);
                }
                Runnable runnableR = l.this.R();
                if (runnableR == null) {
                    return;
                }
                try {
                    this.f85889b = runnableR;
                    i10++;
                    if (i10 >= 16 && j.d(l.this.f85884c, l.this)) {
                        j.c(l.this.f85884c, l.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = l.this.f85888g;
                    l lVar = l.this;
                    synchronized (obj) {
                        l.z().decrementAndGet(lVar);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(CoroutineDispatcher coroutineDispatcher, int i10, String str) {
        kotlinx.coroutines.k kVar = coroutineDispatcher instanceof kotlinx.coroutines.k ? (kotlinx.coroutines.k) coroutineDispatcher : null;
        this.f85883b = kVar == null ? eg.i0.a() : kVar;
        this.f85884c = coroutineDispatcher;
        this.f85885d = i10;
        this.f85886e = str;
        this.f85887f = new q(false);
        this.f85888g = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable R() {
        while (true) {
            Runnable runnable = (Runnable) this.f85887f.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f85888g) {
                f85882h.decrementAndGet(this);
                if (this.f85887f.c() == 0) {
                    return null;
                }
                f85882h.incrementAndGet(this);
            }
        }
    }

    private final boolean n0() {
        synchronized (this.f85888g) {
            if (f85882h.get(this) >= this.f85885d) {
                return false;
            }
            f85882h.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater z() {
        return f85882h;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableR;
        this.f85887f.a(runnable);
        if (f85882h.get(this) >= this.f85885d || !n0() || (runnableR = R()) == null) {
            return;
        }
        try {
            j.c(this.f85884c, this, new a(runnableR));
        } catch (Throwable th2) {
            f85882h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableR;
        this.f85887f.a(runnable);
        if (f85882h.get(this) >= this.f85885d || !n0() || (runnableR = R()) == null) {
            return;
        }
        try {
            this.f85884c.dispatchYield(this, new a(runnableR));
        } catch (Throwable th2) {
            f85882h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.k
    public void e(long j10, CancellableContinuation cancellableContinuation) {
        this.f85883b.e(j10, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.k
    public eg.p0 f(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f85883b.f(j10, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        m.a(i10);
        return i10 >= this.f85885d ? m.b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str = this.f85886e;
        if (str != null) {
            return str;
        }
        return this.f85884c + ".limitedParallelism(" + this.f85885d + ')';
    }
}
