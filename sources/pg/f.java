package pg;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class f implements j, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f98322b;

    public f(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f98322b = input;
    }

    @Override // pg.j
    public long L(a sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        try {
            tg.d dVar = tg.d.f105172a;
            m mVarB0 = sink.b0(1);
            int i10 = 0;
            byte[] bArrB = mVarB0.b(false);
            long j11 = this.f98322b.read(bArrB, mVarB0.d(), (int) Math.min(j10, bArrB.length - r4));
            if (j11 != -1) {
                i10 = (int) j11;
            }
            if (i10 == 1) {
                mVarB0.w(bArrB, i10);
                mVarB0.p(mVarB0.d() + i10);
                sink.U(sink.w() + ((long) i10));
                return j11;
            }
            if (i10 < 0 || i10 > mVarB0.h()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i10 + ". Should be in 0.." + mVarB0.h()).toString());
            }
            if (i10 == 0) {
                if (o.b(mVarB0)) {
                    sink.M();
                }
                return j11;
            }
            mVarB0.w(bArrB, i10);
            mVarB0.p(mVarB0.d() + i10);
            sink.U(sink.w() + ((long) i10));
            return j11;
        } catch (AssertionError e10) {
            if (g.b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // pg.j, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f98322b.close();
    }

    public String toString() {
        return "RawSource(" + this.f98322b + ')';
    }
}
