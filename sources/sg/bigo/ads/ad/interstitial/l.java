package sg.bigo.ads.ad.interstitial;

import android.os.SystemClock;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f101417a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f101418b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f101419c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f101420d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f101421e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f101422f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f101423g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f101424h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f101425i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f101426j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f101427k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f101428l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f101429m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int[] f101430n = new int[10];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long[] f101431o = new long[10];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    long[] f101432p = new long[10];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean[][] f101433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean[][] f101434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f101435s;

    public l() {
        Class cls = Boolean.TYPE;
        this.f101433q = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.f101434r = (boolean[][]) Array.newInstance((Class<?>) cls, 10, 10);
        this.f101435s = false;
    }

    private int a() {
        return (this.f101427k == 0 || SystemClock.elapsedRealtime() - this.f101427k > 5000) ? this.f101426j : this.f101425i;
    }

    final void b(sg.bigo.ads.api.core.b bVar, int i10) {
        try {
            long[] jArr = this.f101431o;
            if (jArr[i10] == 0) {
                jArr[i10] = SystemClock.elapsedRealtime();
            }
            if (this.f101432p[i10] != 0) {
                int[] iArr = this.f101430n;
                int i11 = iArr[i10];
                iArr[i10] = 0;
                b(bVar, i10, i11);
            }
        } catch (Exception unused) {
        }
    }

    private void b(sg.bigo.ads.api.core.b bVar, int i10, int i11) {
        try {
            boolean[] zArr = this.f101434r[i11];
            if (zArr[i10]) {
                return;
            }
            zArr[i10] = true;
            sg.bigo.ads.core.d.b.a(bVar, i10, i11, SystemClock.elapsedRealtime() - this.f101432p[i10]);
        } catch (Exception unused) {
        }
    }

    final void a(int i10) {
        try {
            long[] jArr = this.f101431o;
            if (jArr[i10] == 0) {
                jArr[i10] = SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
    }

    final void a(sg.bigo.ads.api.core.b bVar, int i10) {
        try {
            this.f101432p[i10] = SystemClock.elapsedRealtime();
            this.f101430n[i10] = a();
            a(bVar, i10, this.f101430n[i10]);
        } catch (Exception unused) {
        }
    }

    private void a(sg.bigo.ads.api.core.b bVar, int i10, int i11) {
        try {
            if (this.f101435s) {
                return;
            }
            boolean[] zArr = this.f101433q[i11];
            if (zArr[i10]) {
                return;
            }
            zArr[i10] = true;
            sg.bigo.ads.core.d.b.a(bVar, i10, i11, SystemClock.elapsedRealtime() - this.f101431o[i10], i10 == this.f101417a ? SystemClock.elapsedRealtime() - this.f101431o[i10] : SystemClock.elapsedRealtime() - this.f101428l);
        } catch (Exception unused) {
        }
    }
}
