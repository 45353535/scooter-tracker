package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f8963i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f8967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f8968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f8969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f8970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HandlerThread f8971q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f8973s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f8964j = new WeakReference(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f8972r = new Runnable() { // from class: com.applovin.impl.ya
        @Override // java.lang.Runnable
        public final void run() {
            this.f11563b.a();
        }
    };

    class b implements PixelCopy$OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f8975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f8976b;

        b(d dVar, Bitmap bitmap) {
            this.f8975a = dVar;
            this.f8976b = bitmap;
        }

        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f8975a.a(this.f8976b);
                return;
            }
            com.applovin.impl.sdk.o unused = h0.this.f8956b;
            if (com.applovin.impl.sdk.o.a()) {
                h0.this.f8956b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f8975a.a(true);
        }
    }

    public interface c {
        void a(int i10, int i11);

        void a(int i10, int i11, int i12);
    }

    private interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public h0(com.applovin.impl.sdk.k kVar) {
        this.f8955a = kVar;
        this.f8956b = kVar.O();
        this.f8957c = ((Long) kVar.a(x4.f11347j6)).longValue();
        this.f8958d = ((Long) kVar.a(x4.f11338i6)).longValue();
        this.f8961g = ((Integer) kVar.a(x4.f11356k6)).intValue();
        this.f8962h = ((Integer) kVar.a(x4.f11365l6)).intValue();
        this.f8963i = ((Integer) kVar.a(x4.f11374m6)).intValue();
        this.f8959e = ((Integer) kVar.a(x4.f11422s6)).intValue();
        this.f8960f = ((Integer) kVar.a(x4.f11430t6)).intValue();
    }

    static /* synthetic */ int a(h0 h0Var) {
        int i10 = h0Var.f8966l;
        h0Var.f8966l = i10 + 1;
        return i10;
    }

    static /* synthetic */ int f(h0 h0Var) {
        int i10 = h0Var.f8965k;
        h0Var.f8965k = i10 + 1;
        return i10;
    }

    private void c() {
        if (this.f8965k >= this.f8960f && !this.f8969o) {
            this.f8969o = true;
            h();
        }
        if (this.f8965k < this.f8959e || this.f8968n) {
            return;
        }
        this.f8968n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f8973s;
        if (cVar != null) {
            cVar.a(this.f8959e, this.f8965k, this.f8966l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f8973s;
        if (cVar != null) {
            cVar.a(this.f8965k, this.f8966l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f8973s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f8957c <= 0) {
            if (this.f8965k == 1) {
                if (!this.f8969o) {
                    this.f8969o = true;
                    h();
                }
                if (!this.f8968n) {
                    this.f8968n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f8970p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8956b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f8968n && this.f8969o) {
            k();
        } else {
            this.f8970p.postDelayed(this.f8972r, this.f8957c);
        }
    }

    private void h() {
        View view = (View) this.f8964j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8956b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.za
            @Override // java.lang.Runnable
            public final void run() {
                this.f11659b.d();
            }
        });
    }

    private void i() {
        View view = (View) this.f8964j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8956b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wa
            @Override // java.lang.Runnable
            public final void run() {
                this.f11234b.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f8965k = 0;
        this.f8967m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f8964j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8956b.a("BlackViewDetector", "Stopped monitoring view: " + this.f8964j.get());
            }
            this.f8964j.clear();
        }
        Handler handler = this.f8970p;
        if (handler != null) {
            handler.removeCallbacks(this.f8972r);
            this.f8970p = null;
        }
        if (this.f8973s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.xa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11486b.f();
                }
            });
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f8971q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f8971q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f8955a.a(x4.f11329h6)).booleanValue()) {
            View view2 = (View) this.f8964j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8956b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8956b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f8971q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f8971q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f8955a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f8973s = cVar;
                this.f8964j = new WeakReference(view);
                j();
                this.f8968n = false;
                this.f8969o = false;
                Handler handler = new Handler(this.f8971q.getLooper());
                this.f8970p = handler;
                handler.postDelayed(this.f8972r, this.f8958d);
            } catch (Throwable th2) {
                k();
                this.f8955a.D().a("BlackViewDetector", "maybeStartMonitoring", th2);
            }
        }
    }

    class a implements d {
        a() {
        }

        @Override // com.applovin.impl.h0.d
        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / h0.this.f8961g;
                int i11 = height / h0.this.f8961g;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (h0.this.a(pixel)) {
                            bitmap.recycle();
                            h0.this.j();
                            h0.this.g();
                            return;
                        }
                        if (h0.this.f8967m == null) {
                            h0.this.f8967m = Integer.valueOf(pixel);
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.this.g();
            } catch (Exception e10) {
                h0.this.f8955a.D().a("BlackViewDetector", "onScreenshotCaptured", e10);
                h0.this.k();
            }
        }

        @Override // com.applovin.impl.h0.d
        public void a(boolean z10) {
            if (z10) {
                h0.this.k();
            } else {
                h0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f8964j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8956b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l10 = (Long) this.f8955a.a(x4.f11406q6);
        if (l10.longValue() > 0 && (memoryInfoA = n7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8956b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f8955a.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8956b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8956b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8956b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.f8967m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f8967m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f8967m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f8963i
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f8963i
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f8963i
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.f8962h
            if (r0 > r5) goto L5c
            if (r1 > r5) goto L5c
            if (r9 > r5) goto L5c
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            return r4
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h0.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (o0.g()) {
            Activity activityA = this.f8955a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8956b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8956b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th2);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8956b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
