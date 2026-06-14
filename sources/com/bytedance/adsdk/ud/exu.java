package com.bytedance.adsdk.ud;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes6.dex */
public class exu<T> {
    public static Executor qdl = Executors.newCachedThreadPool();
    private final Set<rq<Throwable>> lnr;
    private final Handler mml;
    private volatile fs<T> mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Set<rq<T>> f15983ud;

    private class qdl extends FutureTask<fs<T>> {
        qdl(Callable<fs<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                exu.this.qdl((fs) get());
            } catch (InterruptedException | ExecutionException e10) {
                exu.this.qdl(new fs(e10));
            }
        }
    }

    public exu(Callable<fs<T>> callable) {
        this(callable, false);
    }

    public synchronized exu<T> lnr(rq<Throwable> rqVar) {
        try {
            fs<T> fsVar = this.mzz;
            if (fsVar != null && fsVar.ud() != null) {
                rqVar.qdl(fsVar.ud());
            }
            this.lnr.add(rqVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized exu<T> mml(rq<Throwable> rqVar) {
        this.lnr.remove(rqVar);
        return this;
    }

    public synchronized exu<T> ud(rq<T> rqVar) {
        this.f15983ud.remove(rqVar);
        return this;
    }

    exu(Callable<fs<T>> callable, boolean z10) {
        this.f15983ud = new LinkedHashSet(1);
        this.lnr = new LinkedHashSet(1);
        this.mml = new Handler(Looper.getMainLooper());
        this.mzz = null;
        if (!z10) {
            qdl.execute(new qdl(callable));
            return;
        }
        try {
            qdl((fs) callable.call());
        } catch (Throwable th2) {
            qdl((fs) new fs<>(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(fs<T> fsVar) {
        if (this.mzz == null) {
            this.mzz = fsVar;
            qdl();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized exu<T> qdl(rq<T> rqVar) {
        try {
            fs<T> fsVar = this.mzz;
            if (fsVar != null && fsVar.qdl() != null) {
                rqVar.qdl(fsVar.qdl());
            }
            this.f15983ud.add(rqVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    private void qdl() {
        this.mml.post(new Runnable() { // from class: com.bytedance.adsdk.ud.exu.1
            @Override // java.lang.Runnable
            public void run() {
                fs fsVar = exu.this.mzz;
                if (fsVar == null) {
                    return;
                }
                if (fsVar.qdl() != null) {
                    exu.this.qdl(fsVar.qdl());
                } else {
                    exu.this.qdl(fsVar.ud());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(T t10) {
        Iterator it = new ArrayList(this.f15983ud).iterator();
        while (it.hasNext()) {
            ((rq) it.next()).qdl(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.lnr);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rq) it.next()).qdl(th2);
        }
    }
}
