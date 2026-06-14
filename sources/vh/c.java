package vh;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class c extends m0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f106792i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f106793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f106794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f106795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f106796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static c f106797n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f106798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f106799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106800h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(c cVar, long j10, boolean z10) {
            if (c.f106797n == null) {
                c.f106797n = new c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                cVar.f106800h = Math.min(j10, cVar.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                cVar.f106800h = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                cVar.f106800h = cVar.c();
            }
            long jY = cVar.y(jNanoTime);
            c cVar2 = c.f106797n;
            Intrinsics.checkNotNull(cVar2);
            while (cVar2.f106799g != null) {
                c cVar3 = cVar2.f106799g;
                Intrinsics.checkNotNull(cVar3);
                if (jY < cVar3.y(jNanoTime)) {
                    break;
                }
                cVar2 = cVar2.f106799g;
                Intrinsics.checkNotNull(cVar2);
            }
            cVar.f106799g = cVar2.f106799g;
            cVar2.f106799g = cVar;
            if (cVar2 == c.f106797n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(c cVar) {
            for (c cVar2 = c.f106797n; cVar2 != null; cVar2 = cVar2.f106799g) {
                if (cVar2.f106799g == cVar) {
                    cVar2.f106799g = cVar.f106799g;
                    cVar.f106799g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final c c() throws InterruptedException {
            c cVar = c.f106797n;
            Intrinsics.checkNotNull(cVar);
            c cVar2 = cVar.f106799g;
            if (cVar2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(c.f106795l, TimeUnit.MILLISECONDS);
                c cVar3 = c.f106797n;
                Intrinsics.checkNotNull(cVar3);
                if (cVar3.f106799g != null || System.nanoTime() - jNanoTime < c.f106796m) {
                    return null;
                }
                return c.f106797n;
            }
            long jY = cVar2.y(System.nanoTime());
            if (jY > 0) {
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.f106797n;
            Intrinsics.checkNotNull(cVar4);
            cVar4.f106799g = cVar2.f106799g;
            cVar2.f106799g = null;
            cVar2.f106798f = 2;
            return cVar2;
        }

        public final Condition d() {
            return c.f106794k;
        }

        public final ReentrantLock e() {
            return c.f106793j;
        }

        private a() {
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockE;
            c cVarC;
            while (true) {
                try {
                    reentrantLockE = c.f106792i.e();
                    reentrantLockE.lock();
                    try {
                        cVarC = c.f106792i.c();
                    } finally {
                        reentrantLockE.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (cVarC == c.f106797n) {
                    a unused2 = c.f106792i;
                    c.f106797n = null;
                    return;
                } else {
                    Unit unit = Unit.f93236a;
                    reentrantLockE.unlock();
                    if (cVarC != null) {
                        cVarC.B();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: vh.c$c, reason: collision with other inner class name */
    public static final class C1320c implements j0, AutoCloseable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f106802c;

        C1320c(j0 j0Var) {
            this.f106802c = j0Var;
        }

        @Override // vh.j0
        public void H(e source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            vh.b.b(source.e0(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                g0 g0Var = source.f106814b;
                Intrinsics.checkNotNull(g0Var);
                while (true) {
                    if (j11 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j11 += (long) (g0Var.f106835c - g0Var.f106834b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        g0Var = g0Var.f106838f;
                        Intrinsics.checkNotNull(g0Var);
                    }
                }
                c cVar = c.this;
                j0 j0Var = this.f106802c;
                cVar.v();
                try {
                    try {
                        j0Var.H(source, j11);
                        Unit unit = Unit.f93236a;
                        if (cVar.w()) {
                            throw cVar.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!cVar.w()) {
                            throw e10;
                        }
                        throw cVar.p(e10);
                    }
                } catch (Throwable th2) {
                    cVar.w();
                    throw th2;
                }
            }
        }

        @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            j0 j0Var = this.f106802c;
            cVar.v();
            try {
                j0Var.close();
                Unit unit = Unit.f93236a;
                if (cVar.w()) {
                    throw cVar.p(null);
                }
            } catch (IOException e10) {
                if (!cVar.w()) {
                    throw e10;
                }
                throw cVar.p(e10);
            } finally {
                cVar.w();
            }
        }

        @Override // vh.j0, java.io.Flushable
        public void flush() throws IOException {
            c cVar = c.this;
            j0 j0Var = this.f106802c;
            cVar.v();
            try {
                j0Var.flush();
                Unit unit = Unit.f93236a;
                if (cVar.w()) {
                    throw cVar.p(null);
                }
            } catch (IOException e10) {
                if (!cVar.w()) {
                    throw e10;
                }
                throw cVar.p(e10);
            } finally {
                cVar.w();
            }
        }

        @Override // vh.j0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public c timeout() {
            return c.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f106802c + ')';
        }
    }

    public static final class d implements l0, AutoCloseable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f106804c;

        d(l0 l0Var) {
            this.f106804c = l0Var;
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            l0 l0Var = this.f106804c;
            cVar.v();
            try {
                l0Var.close();
                Unit unit = Unit.f93236a;
                if (cVar.w()) {
                    throw cVar.p(null);
                }
            } catch (IOException e10) {
                if (!cVar.w()) {
                    throw e10;
                }
                throw cVar.p(e10);
            } finally {
                cVar.w();
            }
        }

        @Override // vh.l0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public c timeout() {
            return c.this;
        }

        @Override // vh.l0
        public long read(e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            c cVar = c.this;
            l0 l0Var = this.f106804c;
            cVar.v();
            try {
                long j11 = l0Var.read(sink, j10);
                if (cVar.w()) {
                    throw cVar.p(null);
                }
                return j11;
            } catch (IOException e10) {
                if (cVar.w()) {
                    throw cVar.p(e10);
                }
                throw e10;
            } finally {
                cVar.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f106804c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f106793j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f106794k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f106795l = millis;
        f106796m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j10) {
        return this.f106800h - j10;
    }

    public final l0 A(l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f106793j;
            reentrantLock.lock();
            try {
                if (this.f106798f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f106798f = 1;
                f106792i.f(this, jH, zE);
                Unit unit = Unit.f93236a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f106793j;
        reentrantLock.lock();
        try {
            int i10 = this.f106798f;
            this.f106798f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f106792i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final j0 z(j0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C1320c(sink);
    }

    protected void B() {
    }
}
