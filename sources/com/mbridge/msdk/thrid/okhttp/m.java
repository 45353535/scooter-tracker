package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f51587h = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f51590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f51591d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51588a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51589b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<x.b> f51592e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque<x.b> f51593f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Deque<x> f51594g = new ArrayDeque();

    public m(ExecutorService executorService) {
        this.f51591d = executorService;
    }

    private int c(x.b bVar) {
        int i10 = 0;
        for (x.b bVar2 : this.f51593f) {
            if (!bVar2.c().f51698f && bVar2.d().equals(bVar.d())) {
                i10++;
            }
        }
        return i10;
    }

    public synchronized ExecutorService a() {
        try {
            if (this.f51591d == null) {
                this.f51591d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f51591d;
    }

    public void b(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f51589b = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    public synchronized int c() {
        return this.f51593f.size() + this.f51594g.size();
    }

    public void a(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f51588a = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    private boolean b() {
        int i10;
        boolean z10;
        if (!f51587h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<x.b> it = this.f51592e.iterator();
                while (it.hasNext()) {
                    x.b next = it.next();
                    if (this.f51593f.size() >= this.f51588a) {
                        break;
                    }
                    if (c(next) < this.f51589b) {
                        it.remove();
                        arrayList.add(next);
                        this.f51593f.add(next);
                    }
                }
                z10 = c() > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((x.b) arrayList.get(i10)).a(a());
        }
        return z10;
    }

    public m() {
    }

    void a(x.b bVar) {
        synchronized (this) {
            this.f51592e.add(bVar);
        }
        b();
    }

    synchronized void a(x xVar) {
        this.f51594g.add(xVar);
    }

    private <T> void a(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f51590c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    void b(x.b bVar) {
        a(this.f51593f, bVar);
    }

    void b(x xVar) {
        a(this.f51594g, xVar);
    }
}
