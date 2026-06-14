package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import d0.w;
import d0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f7351e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f7353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f7354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile z f7355d;

    private static class a extends FutureTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q f7356b;

        a(q qVar, Callable callable) {
            super(callable);
            this.f7356b = qVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f7356b.l((z) get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f7356b.l(new z(e10));
                }
            } finally {
                this.f7356b = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f7351e = new androidx.media3.exoplayer.hls.offline.a();
        } else {
            f7351e = Executors.newCachedThreadPool(new q0.h());
        }
    }

    public q(Callable callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f7353b);
        if (arrayList.isEmpty()) {
            q0.g.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((w) it.next()).onResult(th2);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f7354c.post(new Runnable() { // from class: d0.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68317b.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        z zVar = this.f7355d;
        if (zVar == null) {
            return;
        }
        if (zVar.b() != null) {
            i(zVar.b());
        } else {
            f(zVar.a());
        }
    }

    private synchronized void i(Object obj) {
        Iterator it = new ArrayList(this.f7352a).iterator();
        while (it.hasNext()) {
            ((w) it.next()).onResult(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(z zVar) {
        if (this.f7355d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f7355d = zVar;
        g();
    }

    public synchronized q c(w wVar) {
        try {
            z zVar = this.f7355d;
            if (zVar != null && zVar.a() != null) {
                wVar.onResult(zVar.a());
            }
            this.f7353b.add(wVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized q d(w wVar) {
        try {
            z zVar = this.f7355d;
            if (zVar != null && zVar.b() != null) {
                wVar.onResult(zVar.b());
            }
            this.f7352a.add(wVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public z e() {
        return this.f7355d;
    }

    public synchronized q j(w wVar) {
        this.f7353b.remove(wVar);
        return this;
    }

    public synchronized q k(w wVar) {
        this.f7352a.remove(wVar);
        return this;
    }

    public q(Object obj) {
        this.f7352a = new LinkedHashSet(1);
        this.f7353b = new LinkedHashSet(1);
        this.f7354c = new Handler(Looper.getMainLooper());
        this.f7355d = null;
        l(new z(obj));
    }

    q(Callable callable, boolean z10) {
        this.f7352a = new LinkedHashSet(1);
        this.f7353b = new LinkedHashSet(1);
        this.f7354c = new Handler(Looper.getMainLooper());
        this.f7355d = null;
        if (z10) {
            try {
                l((z) callable.call());
                return;
            } catch (Throwable th2) {
                l(new z(th2));
                return;
            }
        }
        f7351e.execute(new a(this, callable));
    }
}
