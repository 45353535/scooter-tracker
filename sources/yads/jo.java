package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jo implements yc2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112407b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hl2 f112409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public wc2 f112411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public iq2 f112413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public yv0[] f112414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f112415j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f112417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f112418m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zv0 f112408c = new zv0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f112416k = Long.MIN_VALUE;

    public jo(int i10) {
        this.f112407b = i10;
    }

    public static int a(int i10) {
        return i10 & 128;
    }

    public static int b(int i10) {
        return i10 & 64;
    }

    public abstract int a(yv0 yv0Var);

    public abstract void a(long j10, long j11);

    public abstract void a(long j10, boolean z10);

    public abstract void a(yv0[] yv0VarArr, long j10, long j11);

    public li1 c() {
        return null;
    }

    public abstract String d();

    public final boolean e() {
        return this.f112416k == Long.MIN_VALUE;
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract void h();

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public int l() {
        return 0;
    }

    public static int a(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 128;
    }

    public final jo b() {
        return this;
    }

    public /* bridge */ /* synthetic */ void a(float f10, float f11) {
    }

    @Override // yads.yc2
    public void a(int i10, Object obj) {
    }

    public void a(boolean z10) {
    }

    public final lm0 a(int i10, yv0 yv0Var, Exception exc, boolean z10) {
        int iA;
        if (yv0Var == null || this.f112418m) {
            iA = 4;
        } else {
            this.f112418m = true;
            try {
                iA = a(yv0Var) & 7;
            } catch (lm0 unused) {
                iA = 4;
            } finally {
                this.f112418m = false;
            }
        }
        String strD = d();
        int i11 = this.f112410e;
        int i12 = yv0Var == null ? 4 : iA;
        return new lm0(lm0.a(1, null, strD, i11, yv0Var, i12), exc, i10, 1, strD, i11, yv0Var, i12, null, SystemClock.elapsedRealtime(), z10);
    }

    public final void a(int i10, wc2 wc2Var) {
        this.f112410e = i10;
        this.f112411f = wc2Var;
    }

    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        iq2 iq2Var = this.f112413h;
        iq2Var.getClass();
        int iA = iq2Var.a(zv0Var, fa0Var, i10);
        if (iA == -4) {
            if (fa0Var.b(4)) {
                this.f112416k = Long.MIN_VALUE;
                return this.f112417l ? -4 : -3;
            }
            long j10 = fa0Var.f110672f + this.f112415j;
            fa0Var.f110672f = j10;
            this.f112416k = Math.max(this.f112416k, j10);
            return iA;
        }
        if (iA == -5) {
            yv0 yv0Var = zv0Var.f118845b;
            yv0Var.getClass();
            if (yv0Var.f118402q != Long.MAX_VALUE) {
                xv0 xv0Var = new xv0(yv0Var);
                xv0Var.f117986o = yv0Var.f118402q + this.f112415j;
                zv0Var.f118845b = new yv0(xv0Var);
            }
        }
        return iA;
    }
}
