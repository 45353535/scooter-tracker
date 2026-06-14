package yads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
public final class if3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt0 f111972a = new wt0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef3 f111973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hf3 f111974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f111976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f111977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f111978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f111979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f111980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f111981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f111982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f111983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f111984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f111985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f111986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f111987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f111988q;

    public if3(Context context) {
        ef3 ef3VarA = a(context);
        this.f111973b = ef3VarA;
        this.f111974c = ef3VarA != null ? hf3.a() : null;
        this.f111982k = -9223372036854775807L;
        this.f111983l = -9223372036854775807L;
        this.f111977f = -1.0f;
        this.f111980i = 1.0f;
        this.f111981j = 0;
    }

    public static ef3 a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        gf3 gf3VarA = w83.f117341a >= 17 ? gf3.a(applicationContext) : null;
        if (gf3VarA != null) {
            return gf3VarA;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new ff3(windowManager);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r8 = this;
            int r0 = yads.w83.f117341a
            r1 = 30
            if (r0 < r1) goto L95
            android.view.Surface r0 = r8.f111976e
            if (r0 != 0) goto Lc
            goto L95
        Lc:
            yads.wt0 r0 = r8.f111972a
            yads.vt0 r0 = r0.f117561a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L3b
            yads.wt0 r0 = r8.f111972a
            yads.vt0 r3 = r0.f117561a
            boolean r3 = r3.a()
            if (r3 == 0) goto L39
            yads.vt0 r0 = r0.f117561a
            long r3 = r0.f117177e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2d
            goto L30
        L2d:
            long r5 = r0.f117178f
            long r5 = r5 / r3
        L30:
            double r3 = (double) r5
            r5 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r5 = r5 / r3
            float r0 = (float) r5
            goto L3d
        L39:
            r0 = r2
            goto L3d
        L3b:
            float r0 = r8.f111977f
        L3d:
            float r3 = r8.f111978g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L44
            goto L95
        L44:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L86
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L86
            yads.wt0 r1 = r8.f111972a
            yads.vt0 r1 = r1.f117561a
            boolean r1 = r1.a()
            if (r1 == 0) goto L77
            yads.wt0 r1 = r8.f111972a
            yads.vt0 r2 = r1.f117561a
            boolean r2 = r2.a()
            if (r2 == 0) goto L65
            yads.vt0 r1 = r1.f117561a
            long r1 = r1.f117178f
            goto L6a
        L65:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6a:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L77
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L79
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
        L79:
            float r2 = r8.f111978g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L95
            goto L8f
        L86:
            if (r4 == 0) goto L89
            goto L8f
        L89:
            yads.wt0 r2 = r8.f111972a
            int r2 = r2.f117565e
            if (r2 < r1) goto L95
        L8f:
            r8.f111978g = r0
            r0 = 0
            r8.a(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.if3.b():void");
    }

    public final void a() {
        this.f111975d = true;
        this.f111984m = 0L;
        this.f111987p = -1L;
        this.f111985n = -1L;
        if (this.f111973b != null) {
            hf3 hf3Var = this.f111974c;
            hf3Var.getClass();
            hf3Var.f111571c.sendEmptyMessage(1);
            this.f111973b.a(new df3() { // from class: yads.e8
                @Override // yads.df3
                public final void a(Display display) {
                    this.f110245a.a(display);
                }
            });
        }
        a(false);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f111982k = refreshRate;
            this.f111983l = (refreshRate * 80) / 100;
        } else {
            uf1.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f111982k = -9223372036854775807L;
            this.f111983l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r4) {
        /*
            r3 = this;
            int r0 = yads.w83.f117341a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f111976e
            if (r0 == 0) goto L30
            int r1 = r3.f111981j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f111975d
            if (r1 == 0) goto L21
            float r1 = r3.f111978g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f111980i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f111979h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f111979h = r1
            yads.cf3.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.if3.a(boolean):void");
    }
}
