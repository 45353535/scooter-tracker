package pg;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s, r, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f98319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f98320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98321d;

    private final Void W(long j10) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + s() + ", required: " + j10 + ')');
    }

    @Override // pg.r
    public void F(byte b10) {
        b0(1).x(b10);
        this.f98321d++;
    }

    @Override // pg.j
    public long L(a sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        if (s() == 0) {
            return -1L;
        }
        if (j10 > s()) {
            j10 = s();
        }
        sink.v0(this, j10);
        return j10;
    }

    public final /* synthetic */ void M() {
        m mVar = this.f98320c;
        Intrinsics.checkNotNull(mVar);
        m mVarG = mVar.g();
        this.f98320c = mVarG;
        if (mVarG == null) {
            this.f98319b = null;
        } else {
            mVarG.q(null);
        }
        mVar.s(null);
        p.d(mVar);
    }

    @Override // pg.s
    public long Q(i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long jS = s();
        if (jS > 0) {
            sink.v0(this, jS);
        }
        return jS;
    }

    public final /* synthetic */ void R(m mVar) {
        this.f98319b = mVar;
    }

    public final /* synthetic */ void U(long j10) {
        this.f98321d = j10;
    }

    public final /* synthetic */ void V(m mVar) {
        this.f98320c = mVar;
    }

    public final /* synthetic */ m b0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException(("unexpected capacity (" + i10 + "), should be in range [1, 8192]").toString());
        }
        m mVar = this.f98320c;
        if (mVar == null) {
            m mVarF = p.f();
            this.f98319b = mVarF;
            this.f98320c = mVarF;
            return mVarF;
        }
        Intrinsics.checkNotNull(mVar);
        if (mVar.d() + i10 <= 8192 && mVar.f98340e) {
            return mVar;
        }
        m mVarM = mVar.m(p.f());
        this.f98320c = mVarM;
        return mVarM;
    }

    @Override // pg.s
    public void c0(i sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        if (s() >= j10) {
            sink.v0(this, j10);
            return;
        }
        sink.v0(this, s());
        throw new EOFException("Buffer exhausted before writing " + j10 + " bytes. Only " + s() + " bytes were written.");
    }

    @Override // pg.s
    public boolean exhausted() {
        return s() == 0;
    }

    @Override // pg.r
    public long f0(j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jL = source.L(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jL == -1) {
                return j10;
            }
            j10 += jL;
        }
    }

    @Override // pg.s
    public int j0(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        v.a(sink.length, i10, i11);
        m mVar = this.f98319b;
        if (mVar == null) {
            return -1;
        }
        int iMin = Math.min(i11 - i10, mVar.j());
        mVar.o(sink, i10, i10 + iMin);
        this.f98321d -= (long) iMin;
        if (o.b(mVar)) {
            z();
        }
        return iMin;
    }

    public final void m() throws EOFException {
        skip(s());
    }

    public final long n() {
        long jS = s();
        if (jS == 0) {
            return 0L;
        }
        m mVar = this.f98320c;
        Intrinsics.checkNotNull(mVar);
        return (mVar.d() >= 8192 || !mVar.f98340e) ? jS : jS - ((long) (mVar.d() - mVar.f()));
    }

    public final void o(a out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        v.a(s(), j10, j11);
        if (j10 == j11) {
            return;
        }
        long jD = j11 - j10;
        out.f98321d += jD;
        m mVarE = this.f98319b;
        long jD2 = j10;
        while (true) {
            Intrinsics.checkNotNull(mVarE);
            if (jD2 < mVarE.d() - mVarE.f()) {
                break;
            }
            jD2 -= (long) (mVarE.d() - mVarE.f());
            mVarE = mVarE.e();
        }
        while (jD > 0) {
            Intrinsics.checkNotNull(mVarE);
            m mVarT = mVarE.t();
            mVarT.r(mVarT.f() + ((int) jD2));
            mVarT.p(Math.min(mVarT.f() + ((int) jD), mVarT.d()));
            if (out.q() == null) {
                out.R(mVarT);
                out.V(mVarT);
            } else {
                m mVarY = out.y();
                Intrinsics.checkNotNull(mVarY);
                out.V(mVarY.m(mVarT));
            }
            jD -= (long) (mVarT.d() - mVarT.f());
            mVarE = mVarE.e();
            jD2 = 0;
        }
    }

    public final byte p(long j10) {
        long j11 = 0;
        if (j10 < 0 || j10 >= s()) {
            throw new IndexOutOfBoundsException("position (" + j10 + ") is not within the range [0..size(" + s() + "))");
        }
        if (j10 == 0) {
            m mVar = this.f98319b;
            Intrinsics.checkNotNull(mVar);
            return mVar.k(0);
        }
        if (q() == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (s() - j10 >= j10) {
            m mVarQ = q();
            while (mVarQ != null) {
                long jD = ((long) (mVarQ.d() - mVarQ.f())) + j11;
                if (jD > j10) {
                    break;
                }
                mVarQ = mVarQ.e();
                j11 = jD;
            }
            Intrinsics.checkNotNull(mVarQ);
            return mVarQ.k((int) (j10 - j11));
        }
        m mVarY = y();
        long jS = s();
        while (mVarY != null && jS > j10) {
            jS -= (long) (mVarY.d() - mVarY.f());
            if (jS <= j10) {
                break;
            }
            mVarY = mVarY.g();
        }
        Intrinsics.checkNotNull(mVarY);
        return mVarY.k((int) (j10 - jS));
    }

    @Override // pg.s
    public s peek() {
        return e.a(new h(this));
    }

    public final /* synthetic */ m q() {
        return this.f98319b;
    }

    @Override // pg.s
    public byte readByte() throws EOFException {
        m mVar = this.f98319b;
        if (mVar == null) {
            W(1L);
            throw new lf.g();
        }
        int iJ = mVar.j();
        if (iJ == 0) {
            z();
            return readByte();
        }
        byte bN = mVar.n();
        this.f98321d--;
        if (iJ == 1) {
            z();
        }
        return bN;
    }

    @Override // pg.s
    public boolean request(long j10) {
        if (j10 >= 0) {
            return s() >= j10;
        }
        throw new IllegalArgumentException(("byteCount: " + j10 + " < 0").toString());
    }

    @Override // pg.s
    public void require(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (s() >= j10) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + s() + ", required: " + j10 + ')');
    }

    public final long s() {
        return this.f98321d;
    }

    public void skip(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        long j11 = j10;
        while (j11 > 0) {
            m mVar = this.f98319b;
            if (mVar == null) {
                throw new EOFException("Buffer exhausted before skipping " + j10 + " bytes.");
            }
            int iMin = (int) Math.min(j11, mVar.d() - mVar.f());
            long j12 = iMin;
            this.f98321d -= j12;
            j11 -= j12;
            mVar.r(mVar.f() + iMin);
            if (mVar.f() == mVar.d()) {
                z();
            }
        }
    }

    public String toString() {
        if (s() == 0) {
            return "Buffer(size=0)";
        }
        long j10 = 64;
        int iMin = (int) Math.min(j10, s());
        StringBuilder sb2 = new StringBuilder((iMin * 2) + (s() > j10 ? 1 : 0));
        tg.d dVar = tg.d.f105172a;
        int i10 = 0;
        for (m mVarQ = q(); mVarQ != null; mVarQ = mVarQ.e()) {
            tg.b bVar = tg.e.f105173a;
            int i11 = 0;
            while (i10 < iMin && i11 < mVarQ.j()) {
                int i12 = i11 + 1;
                byte bA = bVar.a(mVarQ, i11);
                i10++;
                sb2.append(v.c()[(bA >> 4) & 15]);
                sb2.append(v.c()[bA & Ascii.SI]);
                i11 = i12;
            }
        }
        if (s() > j10) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + s() + " hex=" + ((Object) sb2) + ')';
    }

    @Override // pg.i
    public void v0(a source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        v.b(source.f98321d, 0L, j10);
        while (j10 > 0) {
            Intrinsics.checkNotNull(source.f98319b);
            if (j10 < r0.j()) {
                m mVar = this.f98320c;
                if (mVar != null && mVar.f98340e) {
                    if ((((long) mVar.d()) + j10) - ((long) (mVar.i() ? 0 : mVar.f())) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        m mVar2 = source.f98319b;
                        Intrinsics.checkNotNull(mVar2);
                        mVar2.y(mVar, (int) j10);
                        source.f98321d -= j10;
                        this.f98321d += j10;
                        return;
                    }
                }
                m mVar3 = source.f98319b;
                Intrinsics.checkNotNull(mVar3);
                source.f98319b = mVar3.u((int) j10);
            }
            m mVar4 = source.f98319b;
            Intrinsics.checkNotNull(mVar4);
            long j11 = mVar4.j();
            m mVarL = mVar4.l();
            source.f98319b = mVarL;
            if (mVarL == null) {
                source.f98320c = null;
            }
            if (q() == null) {
                R(mVar4);
                V(mVar4);
            } else {
                m mVarY = y();
                Intrinsics.checkNotNull(mVarY);
                V(mVarY.m(mVar4).a());
                m mVarY2 = y();
                Intrinsics.checkNotNull(mVarY2);
                if (mVarY2.g() == null) {
                    R(y());
                }
            }
            source.f98321d -= j11;
            this.f98321d += j11;
            j10 -= j11;
        }
    }

    public final /* synthetic */ long w() {
        return this.f98321d;
    }

    @Override // pg.r
    public void write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        v.a(source.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            m mVarB0 = b0(1);
            int iMin = Math.min(i11 - i12, mVarB0.h()) + i12;
            mVarB0.v(source, i12, iMin);
            i12 = iMin;
        }
        this.f98321d += (long) (i11 - i10);
    }

    public final /* synthetic */ m y() {
        return this.f98320c;
    }

    public final void z() {
        m mVar = this.f98319b;
        Intrinsics.checkNotNull(mVar);
        m mVarE = mVar.e();
        this.f98319b = mVarE;
        if (mVarE == null) {
            this.f98320c = null;
        } else {
            mVarE.s(null);
        }
        mVar.q(null);
        p.d(mVar);
    }

    @Override // pg.j, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // pg.s, pg.r
    public a getBuffer() {
        return this;
    }
}
