package ib;

import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f74167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f74169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f74170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f74171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f74172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f74173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f74174h;

    public w(t tVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        q9.a.a(iArr.length == jArr2.length);
        q9.a.a(jArr.length == jArr2.length);
        q9.a.a(iArr2.length == jArr2.length);
        this.f74167a = tVar;
        this.f74169c = jArr;
        this.f74170d = iArr;
        this.f74171e = i10;
        this.f74172f = jArr2;
        this.f74173g = iArr2;
        this.f74174h = j10;
        this.f74168b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iH = o0.h(this.f74172f, j10, true, false); iH >= 0; iH--) {
            if ((this.f74173g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iD = o0.d(this.f74172f, j10, true, false); iD < this.f74172f.length; iD++) {
            if ((this.f74173g[iD] & 1) != 0) {
                return iD;
            }
        }
        return -1;
    }
}
