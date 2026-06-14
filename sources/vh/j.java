package vh;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReentrantLock f106858e = p0.b();

    private static final class a implements j0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f106859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f106860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f106861d;

        public a(j fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f106859b = fileHandle;
            this.f106860c = j10;
        }

        @Override // vh.j0
        public void H(e source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f106861d) {
                throw new IllegalStateException("closed");
            }
            this.f106859b.U(this.f106860c, source, j10);
            this.f106860c += j10;
        }

        @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f106861d) {
                return;
            }
            this.f106861d = true;
            ReentrantLock reentrantLockM = this.f106859b.m();
            reentrantLockM.lock();
            try {
                j jVar = this.f106859b;
                jVar.f106857d--;
                if (this.f106859b.f106857d == 0 && this.f106859b.f106856c) {
                    Unit unit = Unit.f93236a;
                    reentrantLockM.unlock();
                    this.f106859b.n();
                }
            } finally {
                reentrantLockM.unlock();
            }
        }

        @Override // vh.j0, java.io.Flushable
        public void flush() {
            if (this.f106861d) {
                throw new IllegalStateException("closed");
            }
            this.f106859b.o();
        }

        @Override // vh.j0
        public m0 timeout() {
            return m0.f106880e;
        }
    }

    private static final class b implements l0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f106862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f106863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f106864d;

        public b(j fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f106862b = fileHandle;
            this.f106863c = j10;
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f106864d) {
                return;
            }
            this.f106864d = true;
            ReentrantLock reentrantLockM = this.f106862b.m();
            reentrantLockM.lock();
            try {
                j jVar = this.f106862b;
                jVar.f106857d--;
                if (this.f106862b.f106857d == 0 && this.f106862b.f106856c) {
                    Unit unit = Unit.f93236a;
                    reentrantLockM.unlock();
                    this.f106862b.n();
                }
            } finally {
                reentrantLockM.unlock();
            }
        }

        @Override // vh.l0
        public long read(e sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f106864d) {
                throw new IllegalStateException("closed");
            }
            long jW = this.f106862b.w(this.f106863c, sink, j10);
            if (jW != -1) {
                this.f106863c += jW;
            }
            return jW;
        }

        @Override // vh.l0
        public m0 timeout() {
            return m0.f106880e;
        }
    }

    public j(boolean z10) {
        this.f106855b = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long j10, e eVar, long j11) {
        vh.b.b(eVar.e0(), 0L, j11);
        long j12 = j10 + j11;
        long j13 = j10;
        while (j13 < j12) {
            g0 g0Var = eVar.f106814b;
            Intrinsics.checkNotNull(g0Var);
            int iMin = (int) Math.min(j12 - j13, g0Var.f106835c - g0Var.f106834b);
            s(j13, g0Var.f106833a, g0Var.f106834b, iMin);
            g0Var.f106834b += iMin;
            long j14 = iMin;
            j13 += j14;
            eVar.b0(eVar.e0() - j14);
            if (g0Var.f106834b == g0Var.f106835c) {
                eVar.f106814b = g0Var.b();
                h0.b(g0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long w(long j10, e eVar, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            g0 g0VarR0 = eVar.r0(1);
            int iP = p(j13, g0VarR0.f106833a, g0VarR0.f106835c, (int) Math.min(j12 - j13, 8192 - r7));
            if (iP == -1) {
                if (g0VarR0.f106834b == g0VarR0.f106835c) {
                    eVar.f106814b = g0VarR0.b();
                    h0.b(g0VarR0);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                g0VarR0.f106835c += iP;
                long j14 = iP;
                j13 += j14;
                eVar.b0(eVar.e0() + j14);
            }
        }
        return j13 - j10;
    }

    public static /* synthetic */ j0 z(j jVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return jVar.y(j10);
    }

    public final long M() {
        ReentrantLock reentrantLock = this.f106858e;
        reentrantLock.lock();
        try {
            if (this.f106856c) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f93236a;
            reentrantLock.unlock();
            return q();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final l0 R(long j10) {
        ReentrantLock reentrantLock = this.f106858e;
        reentrantLock.lock();
        try {
            if (this.f106856c) {
                throw new IllegalStateException("closed");
            }
            this.f106857d++;
            reentrantLock.unlock();
            return new b(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f106858e;
        reentrantLock.lock();
        try {
            if (this.f106856c) {
                return;
            }
            this.f106856c = true;
            if (this.f106857d != 0) {
                return;
            }
            Unit unit = Unit.f93236a;
            reentrantLock.unlock();
            n();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f106855b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f106858e;
        reentrantLock.lock();
        try {
            if (this.f106856c) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f93236a;
            reentrantLock.unlock();
            o();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final ReentrantLock m() {
        return this.f106858e;
    }

    protected abstract void n();

    protected abstract void o();

    protected abstract int p(long j10, byte[] bArr, int i10, int i11);

    protected abstract long q();

    protected abstract void s(long j10, byte[] bArr, int i10, int i11);

    public final j0 y(long j10) {
        if (!this.f106855b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f106858e;
        reentrantLock.lock();
        try {
            if (this.f106856c) {
                throw new IllegalStateException("closed");
            }
            this.f106857d++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
