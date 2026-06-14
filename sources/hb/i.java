package hb;

import com.appodeal.ads.Appodeal;
import oa.i0;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.a f73103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f73104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f73108f;

    private i(i0.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f73103a = new i0.a(aVar);
        this.f73104b = j10;
        this.f73105c = j11;
        this.f73108f = jArr;
        this.f73106d = i10;
        this.f73107e = i11;
    }

    public static i b(i0.a aVar, d0 d0Var) {
        long[] jArr;
        int i10;
        int i11;
        int iQ = d0Var.q();
        int iL = (iQ & 1) != 0 ? d0Var.L() : -1;
        long J = (iQ & 2) != 0 ? d0Var.J() : -1L;
        if ((iQ & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = d0Var.H();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iQ & 8) != 0) {
            d0Var.X(4);
        }
        if (d0Var.a() >= 24) {
            d0Var.X(21);
            int iK = d0Var.K();
            i11 = iK & Appodeal.ALL;
            i10 = (16773120 & iK) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iL, J, jArr2, i10, i11);
    }

    public long a() {
        long j10 = this.f73104b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        i0.a aVar = this.f73103a;
        return o0.b1((j10 * ((long) aVar.f96575g)) - 1, aVar.f96572d);
    }
}
