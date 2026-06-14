package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8921a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f8925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f8926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f8927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f8928h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f8932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f8933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f8934n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8922b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f8923c = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference f8929i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f8930j = new WeakReference(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f8935o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f8924d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public g8(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f8921a = kVar.O();
        this.f8928h = ((Long) kVar.a(x4.f11465y1)).longValue();
        this.f8927g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f8925e = new Runnable() { // from class: com.applovin.impl.ua
            @Override // java.lang.Runnable
            public final void run() {
                this.f11085b.a(weakReference);
            }
        };
        this.f8926f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.va
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f11144b.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = e8.b((View) this.f8927g.get());
        if (viewB == null) {
            viewB = e8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8921a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f8929i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f8926f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8921a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f8927g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f8930j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8921a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f8922b) {
            this.f8924d.removeMessages(0);
            b((View) this.f8927g.get());
            this.f8935o = Long.MIN_VALUE;
            this.f8930j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f8923c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8923c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8923c.height());
        if (jPxToDp < this.f8931k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f8932l) {
            return false;
        }
        return (((float) ((long) (this.f8923c.width() * this.f8923c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f8933m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(h3 h3Var) {
        View viewS0;
        if (h3Var instanceof b3) {
            viewS0 = h3Var.y();
        } else if (!(h3Var instanceof d3)) {
            return;
        } else {
            viewS0 = ((d3) h3Var).s0();
        }
        a(h3Var.k0(), h3Var.m0(), h3Var.n0(), h3Var.o0(), viewS0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f8929i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f8926f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f8926f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8921a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8921a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f8929i.clear();
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f8922b) {
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8921a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f8930j = weakReference;
                this.f8931k = i10;
                this.f8932l = f10;
                this.f8933m = f11;
                this.f8934n = j10;
                c((View) weakReference.get());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        this.f8924d.postDelayed(this.f8925e, this.f8928h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f8935o == Long.MIN_VALUE) {
                this.f8935o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f8935o >= this.f8934n) {
                return true;
            }
        }
        return false;
    }
}
