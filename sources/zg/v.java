package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b0 writer, boolean z10) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f119489c = z10;
    }

    @Override // zg.r
    public void e(byte b10) {
        boolean z10 = this.f119489c;
        String strF = lf.r.f(lf.r.c(b10));
        if (z10) {
            n(strF);
        } else {
            k(strF);
        }
    }

    @Override // zg.r
    public void i(int i10) {
        boolean z10 = this.f119489c;
        String string = Long.toString(((long) lf.t.c(i10)) & 4294967295L, 10);
        if (z10) {
            n(string);
        } else {
            k(string);
        }
    }

    @Override // zg.r
    public void j(long j10) {
        boolean z10 = this.f119489c;
        long jC = lf.v.c(j10);
        if (z10) {
            n(g.a(jC, 10));
        } else {
            k(g.a(jC, 10));
        }
    }

    @Override // zg.r
    public void l(short s10) {
        boolean z10 = this.f119489c;
        String strF = lf.y.f(lf.y.c(s10));
        if (z10) {
            n(strF);
        } else {
            k(strF);
        }
    }
}
