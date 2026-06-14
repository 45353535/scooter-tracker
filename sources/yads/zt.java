package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z43 f118800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f118803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f118804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f118807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f118808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f118809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f118810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f118811l;

    public zt(int i10, int i11, long j10, int i12, z43 z43Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        fi.a(z10);
        this.f118803d = j10;
        this.f118804e = i12;
        this.f118800a = z43Var;
        this.f118801b = a(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f118802c = i11 == 2 ? a(i10, 1650720768) : -1;
        this.f118810k = new long[512];
        this.f118811l = new int[512];
    }

    public final void a(long j10) {
        if (this.f118809j == this.f118811l.length) {
            long[] jArr = this.f118810k;
            this.f118810k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f118811l;
            this.f118811l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f118810k;
        int i10 = this.f118809j;
        jArr2[i10] = j10;
        this.f118811l[i10] = this.f118808i;
        this.f118809j = i10 + 1;
    }

    public final lu2 b(long j10) {
        long j11 = 1;
        int i10 = (int) (j10 / ((this.f118803d * j11) / ((long) this.f118804e)));
        int iA = w83.a(this.f118811l, i10, true, true);
        int[] iArr = this.f118811l;
        int i11 = iArr[iA];
        if (i11 == i10) {
            pu2 pu2Var = new pu2(((this.f118803d * j11) / ((long) this.f118804e)) * ((long) i11), this.f118810k[iA]);
            return new lu2(pu2Var, pu2Var);
        }
        long j12 = i11;
        long j13 = (this.f118803d * j11) / ((long) this.f118804e);
        long[] jArr = this.f118810k;
        pu2 pu2Var2 = new pu2(j12 * j13, jArr[iA]);
        int i12 = iA + 1;
        return i12 < jArr.length ? new lu2(pu2Var2, new pu2(j13 * ((long) iArr[i12]), jArr[i12])) : new lu2(pu2Var2, pu2Var2);
    }

    public final void a() {
        this.f118810k = Arrays.copyOf(this.f118810k, this.f118809j);
        this.f118811l = Arrays.copyOf(this.f118811l, this.f118809j);
    }

    public static int a(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }
}
