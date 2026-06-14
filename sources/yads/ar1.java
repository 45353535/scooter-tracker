package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ar1 extends bw0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f108757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f108758e;

    public ar1(f43 f43Var, HashMap map) {
        super(f43Var);
        int iB = f43Var.b();
        this.f108758e = new long[f43Var.b()];
        e43 e43Var = new e43();
        for (int i10 = 0; i10 < iB; i10++) {
            this.f108758e[i10] = f43Var.a(i10, e43Var).f110200o;
        }
        int iA = f43Var.a();
        this.f108757d = new long[iA];
        c43 c43Var = new c43();
        for (int i11 = 0; i11 < iA; i11++) {
            f43Var.a(i11, c43Var, true);
            long jLongValue = ((Long) fi.a((Long) map.get(c43Var.f109215c))).longValue();
            long[] jArr = this.f108757d;
            jLongValue = jLongValue == Long.MIN_VALUE ? c43Var.f109217e : jLongValue;
            jArr[i11] = jLongValue;
            long j10 = c43Var.f109217e;
            if (j10 != -9223372036854775807L) {
                long[] jArr2 = this.f108758e;
                int i12 = c43Var.f109216d;
                jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
            }
        }
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        this.f109134c.a(i10, c43Var, z10);
        c43Var.f109217e = this.f108757d[i10];
        return c43Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // yads.bw0, yads.f43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.e43 a(int r5, yads.e43 r6, long r7) {
        /*
            r4 = this;
            super.a(r5, r6, r7)
            long[] r7 = r4.f108758e
            r0 = r7[r5]
            r6.f110200o = r0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r2 = r6.f110199n
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 != 0) goto L19
            goto L1e
        L19:
            long r7 = java.lang.Math.min(r2, r0)
            goto L20
        L1e:
            long r7 = r6.f110199n
        L20:
            r6.f110199n = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ar1.a(int, yads.e43, long):yads.e43");
    }
}
