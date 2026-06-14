package hh;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mh.e;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f73726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f73727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f73728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f73729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f73730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f73731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f73732g;

    public p() {
        this.f73726a = 64;
        this.f73727b = 5;
        this.f73730e = new ArrayDeque();
        this.f73731f = new ArrayDeque();
        this.f73732g = new ArrayDeque();
    }

    private final e.a d(String str) {
        for (e.a aVar : this.f73731f) {
            if (Intrinsics.areEqual(aVar.e(), str)) {
                return aVar;
            }
        }
        for (e.a aVar2 : this.f73730e) {
            if (Intrinsics.areEqual(aVar2.e(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f73728c;
            Unit unit = Unit.f93236a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i10;
        boolean z10;
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f73730e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a asyncCall = (e.a) it.next();
                    if (this.f73731f.size() >= this.f73726a) {
                        break;
                    }
                    if (asyncCall.d().get() < this.f73727b) {
                        it.remove();
                        asyncCall.d().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f73731f.add(asyncCall);
                    }
                }
                z10 = i() > 0;
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final void a(e.a call) {
        e.a aVarD;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f73730e.add(call);
                if (!call.b().q() && (aVarD = d(call.e())) != null) {
                    call.f(aVarD);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h();
    }

    public final synchronized void b(mh.e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f73732g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f73729d == null) {
                this.f73729d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ih.d.N(ih.d.f74844i + " Dispatcher", false));
            }
            executorService = this.f73729d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void f(e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.d().decrementAndGet();
        e(this.f73731f, call);
    }

    public final void g(mh.e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        e(this.f73732g, call);
    }

    public final synchronized int i() {
        return this.f73731f.size() + this.f73732g.size();
    }

    public final void j(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f73726a = i10;
            Unit unit = Unit.f93236a;
        }
        h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f73729d = executorService;
    }
}
