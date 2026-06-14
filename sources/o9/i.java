package o9;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f96407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f96408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f96409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f96410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f96411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f96412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f96413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f96414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f96415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f96416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f96417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f96418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f96419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f96420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f96421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f96422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f96423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f96424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f96425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f96426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f96427w;

    public i(int i10, int i11, float f10, float f11, int i12) {
        this.f96405a = i10;
        this.f96406b = i11;
        this.f96407c = f10;
        this.f96408d = f11;
        this.f96409e = i10 / i12;
        this.f96410f = i10 / 400;
        int i13 = i10 / 65;
        this.f96411g = i13;
        int i14 = i13 * 2;
        this.f96412h = i14;
        this.f96413i = new short[i14];
        this.f96414j = new short[i14 * i11];
        this.f96416l = new short[i14 * i11];
        this.f96418n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f96417m == i10) {
            return;
        }
        int i13 = this.f96405a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f96419o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f96420p;
                long j12 = ((long) (i11 + 1)) * j10;
                i12 = this.f96421q;
                if (j12 <= ((long) i12) * j11) {
                    break;
                }
                this.f96416l = f(this.f96416l, this.f96417m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f96406b;
                    if (i16 < i17) {
                        this.f96416l[(this.f96417m * i17) + i16] = n(this.f96418n, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f96421q++;
                this.f96417m++;
            }
            int i18 = i11 + 1;
            this.f96420p = i18;
            if (i18 == j11) {
                this.f96420p = 0;
                q9.a.g(((long) i12) == j10);
                this.f96421q = 0;
            }
            i14++;
        }
    }

    private void b(double d10) {
        i iVar;
        double d11;
        int i10 = this.f96415k;
        if (i10 < this.f96412h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f96422r > 0) {
                iM += c(iM);
                iVar = this;
                d11 = d10;
            } else {
                int iG = g(this.f96414j, iM);
                if (d10 > 1.0d) {
                    iVar = this;
                    d11 = d10;
                    iM += iG + iVar.w(this.f96414j, iM, d11, iG);
                } else {
                    iVar = this;
                    d11 = d10;
                    iM += iVar.m(iVar.f96414j, iM, d11, iG);
                }
            }
            if (iVar.f96412h + iM > i10) {
                v(iM);
                return;
            }
            d10 = d11;
        }
    }

    private int c(int i10) {
        int iMin = Math.min(this.f96412h, this.f96422r);
        d(this.f96414j, i10, iMin);
        this.f96422r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f96416l, this.f96417m, i11);
        this.f96416l = sArrF;
        int i12 = this.f96406b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f96417m * i12, i12 * i11);
        this.f96417m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f96412h / i11;
        int i13 = this.f96406b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f96413i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f96406b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f96405a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f96406b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f96410f, this.f96411g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f96413i, 0, this.f96410f / i12, this.f96411g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f96410f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f96411g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f96406b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f96413i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f96425u, this.f96426v) ? this.f96423s : iH;
        this.f96424t = this.f96425u;
        this.f96423s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f96406b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f96425u = i15 / i16;
        this.f96426v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((((double) i11) * d10) / (1.0d - d10)) + this.f96427w;
            int iRound = (int) Math.round(d11);
            this.f96427w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f96427w;
            int iRound2 = (int) Math.round(d12);
            this.f96422r = iRound2;
            this.f96427w = d12 - ((double) iRound2);
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f96416l, this.f96417m, i13);
        this.f96416l = sArrF;
        int i14 = this.f96406b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f96417m * i14, i14 * i11);
        p(i12, this.f96406b, this.f96416l, this.f96417m + i11, sArr, i10 + i11, sArr, i10);
        this.f96417m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f96406b];
        long j12 = ((long) this.f96421q) * j10;
        int i11 = this.f96420p;
        long j13 = ((long) i11) * j11;
        long j14 = ((long) (i11 + 1)) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((((long) s10) * j15) + ((j16 - j15) * ((long) s11))) / j16);
    }

    private void o(int i10) {
        int i11 = this.f96417m - i10;
        short[] sArrF = f(this.f96418n, this.f96419o, i11);
        this.f96418n = sArrF;
        short[] sArr = this.f96416l;
        int i12 = this.f96406b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f96419o * i12, i12 * i11);
        this.f96417m = i10;
        this.f96419o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f96423s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f96424t * 3;
    }

    private void r() {
        int i10 = this.f96417m;
        float f10 = this.f96407c;
        float f11 = this.f96408d;
        double d10 = f10 / f11;
        float f12 = this.f96409e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            b(d10);
        } else {
            d(this.f96414j, 0, this.f96415k);
            this.f96415k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f96418n;
        int i11 = this.f96406b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f96419o - i10) * i11);
        this.f96419o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f96415k - i10;
        short[] sArr = this.f96414j;
        int i12 = this.f96406b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f96415k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (((double) i11) / (d10 - 1.0d)) + this.f96427w;
            int iRound = (int) Math.round(d11);
            this.f96427w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * (2.0d - d10)) / (d10 - 1.0d)) + this.f96427w;
            int iRound2 = (int) Math.round(d12);
            this.f96422r = iRound2;
            this.f96427w = d12 - ((double) iRound2);
            i12 = i11;
        }
        short[] sArrF = f(this.f96416l, this.f96417m, i12);
        this.f96416l = sArrF;
        p(i12, this.f96406b, sArrF, this.f96417m, sArr, i10, sArr, i10 + i11);
        this.f96417m += i12;
        return i12;
    }

    public void i() {
        this.f96415k = 0;
        this.f96417m = 0;
        this.f96419o = 0;
        this.f96420p = 0;
        this.f96421q = 0;
        this.f96422r = 0;
        this.f96423s = 0;
        this.f96424t = 0;
        this.f96425u = 0;
        this.f96426v = 0;
        this.f96427w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        q9.a.g(this.f96417m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f96406b, this.f96417m);
        shortBuffer.put(this.f96416l, 0, this.f96406b * iMin);
        int i10 = this.f96417m - iMin;
        this.f96417m = i10;
        short[] sArr = this.f96416l;
        int i11 = this.f96406b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        q9.a.g(this.f96417m >= 0);
        return this.f96417m * this.f96406b * 2;
    }

    public int l() {
        return this.f96415k * this.f96406b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f96415k;
        float f10 = this.f96407c;
        float f11 = this.f96408d;
        double d10 = f10 / f11;
        double d11 = this.f96409e * f11;
        int i12 = this.f96422r;
        int i13 = this.f96417m + ((int) ((((((((double) (i11 - i12)) / d10) + ((double) i12)) + this.f96427w) + ((double) this.f96419o)) / d11) + 0.5d));
        this.f96427w = 0.0d;
        this.f96414j = f(this.f96414j, i11, (this.f96412h * 2) + i11);
        int i14 = 0;
        while (true) {
            i10 = this.f96412h;
            int i15 = this.f96406b;
            if (i14 >= i10 * 2 * i15) {
                break;
            }
            this.f96414j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f96415k += i10 * 2;
        r();
        if (this.f96417m > i13) {
            this.f96417m = Math.max(i13, 0);
        }
        this.f96415k = 0;
        this.f96422r = 0;
        this.f96419o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f96406b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f96414j, this.f96415k, i11);
        this.f96414j = sArrF;
        shortBuffer.get(sArrF, this.f96415k * this.f96406b, ((i10 * i11) * 2) / 2);
        this.f96415k += i11;
        r();
    }
}
