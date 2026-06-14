package qa;

import q9.d0;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f98930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f98931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f98932g;

    private d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f98926a = i10;
        this.f98927b = i11;
        this.f98928c = i12;
        this.f98929d = i13;
        this.f98930e = i14;
        this.f98931f = i15;
        this.f98932g = i16;
    }

    public static d c(d0 d0Var) {
        int iU = d0Var.u();
        d0Var.X(12);
        int iU2 = d0Var.u();
        int iU3 = d0Var.u();
        int iU4 = d0Var.u();
        d0Var.X(4);
        int iU5 = d0Var.u();
        int iU6 = d0Var.u();
        d0Var.X(4);
        return new d(iU, iU2, iU3, iU4, iU5, iU6, d0Var.u());
    }

    public long a() {
        return o0.c1(this.f98930e, ((long) this.f98928c) * 1000000, this.f98929d);
    }

    public int b() {
        int i10 = this.f98926a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        u.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f98926a));
        return -1;
    }

    @Override // qa.a
    public int getType() {
        return 1752331379;
    }
}
