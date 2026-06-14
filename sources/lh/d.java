package lh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f94300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f94302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f94303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f94304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f94305f;

    public d(e taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f94300a = taskRunner;
        this.f94301b = name;
        this.f94304e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f94300a) {
            try {
                if (b()) {
                    this.f94300a.h(this);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f94303d;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.a()) {
                this.f94305f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f94304e.size() - 1; -1 < size; size--) {
            if (((a) this.f94304e.get(size)).a()) {
                a aVar2 = (a) this.f94304e.get(size);
                if (e.f94306h.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.f94304e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f94303d;
    }

    public final boolean d() {
        return this.f94305f;
    }

    public final List e() {
        return this.f94304e;
    }

    public final String f() {
        return this.f94301b;
    }

    public final boolean g() {
        return this.f94302c;
    }

    public final e h() {
        return this.f94300a;
    }

    public final void i(a task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f94300a) {
            if (!this.f94302c) {
                if (k(task, j10, false)) {
                    this.f94300a.h(this);
                }
                Unit unit = Unit.f93236a;
            } else if (task.a()) {
                if (e.f94306h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f94306h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long j10, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        long jNanoTime = this.f94300a.g().nanoTime();
        long j11 = jNanoTime + j10;
        int iIndexOf = this.f94304e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                if (e.f94306h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f94304e.remove(iIndexOf);
        }
        task.g(j11);
        if (e.f94306h.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + b.b(j11 - jNanoTime);
            } else {
                str = "scheduled after " + b.b(j11 - jNanoTime);
            }
            b.c(task, this, str);
        }
        Iterator it = this.f94304e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).c() - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f94304e.size();
        }
        this.f94304e.add(size, task);
        return size == 0;
    }

    public final void l(a aVar) {
        this.f94303d = aVar;
    }

    public final void m(boolean z10) {
        this.f94305f = z10;
    }

    public final void n() {
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f94300a) {
            try {
                this.f94302c = true;
                if (b()) {
                    this.f94300a.h(this);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return this.f94301b;
    }
}
