package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3283lK implements InterfaceC2127Gw {
    public static String[] A02 = {"1Tt6ltc55g", "ops4n6D0RsDIbcNK2iFIW7Ay7S5Nano", "QFUbJLsUaFmSVLdjzr36RpAXorrqi07i", "7FxugF0ZmqBQk4dAnarwpNTfiaTe1g6g", "N3T7HRrxqFzk5rl0dpC6S3h47ocLp3rK", "Rq3uRmlvLOcLbWX3oXceNMTvaDTByq6j", "8TmLuftHICqYkzwVWbIwZIwFPzZSJxQj", "4hmJxBFNQAJLWam3xj85pvhcrB85xjeQ"};
    public final long A00;
    public final C2112Gh A01;

    public C3283lK(C2112Gh c2112Gh, long j10) {
        this.A01 = c2112Gh;
        this.A00 = j10;
    }

    private C2128Gx A00(long j10, long j11) {
        return new C2128Gx((1000000 * j10) / ((long) this.A01.A07), this.A00 + j11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final long A7l() {
        return this.A01.A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final C2126Gv A8t(long j10) {
        long j11;
        C3M.A02(this.A01.A0A);
        long[] jArr = this.A01.A0A.A01;
        long[] jArr2 = this.A01.A0A.A00;
        int iA0L = AbstractC18094a.A0L(jArr, this.A01.A07(j10), true, false);
        long j12 = 0;
        if (iA0L == -1) {
            j11 = 0;
        } else {
            j11 = jArr[iA0L];
        }
        if (iA0L != -1) {
            j12 = jArr2[iA0L];
        }
        C2128Gx c2128GxA00 = A00(j11, j12);
        if (c2128GxA00.A01 != j10) {
            int length = jArr.length - 1;
            String[] strArr = A02;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "o5tsTNyqew751hc5myqwVOdw8F1gICkG";
            strArr2[6] = "VidtQTuToVY7NImzxnJwSrK8bx75lEQY";
            if (iA0L != length) {
                C2128Gx secondSeekPoint = A00(jArr[iA0L + 1], jArr2[iA0L + 1]);
                return new C2126Gv(c2128GxA00, secondSeekPoint);
            }
        }
        return new C2126Gv(c2128GxA00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final boolean AAa() {
        return true;
    }
}
