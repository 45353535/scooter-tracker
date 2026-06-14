package com.my.target;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.C4424m2;
import com.my.target.dc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes11.dex */
public final class bc implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f59297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9 f59298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f59299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59300d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f59304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference f59305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f59306j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59302f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59303g = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f59301e = new Runnable() { // from class: k5.m
        @Override // java.lang.Runnable
        public final void run() {
            this.f86084b.b();
        }
    };

    public static abstract class a {
        public void a() {
        }

        public void a(boolean z10) {
        }
    }

    public bc(xb xbVar, za zaVar, boolean z10) {
        float fB = xbVar.b();
        if (fB == 1.0f) {
            this.f59298b = u9.f60904d;
        } else {
            this.f59298b = u9.a((int) (fB * 1000.0f));
        }
        this.f59297a = new ArrayList();
        a(xbVar, zaVar);
        this.f59299c = xbVar.c() * 100.0f;
        this.f59300d = z10;
    }

    public static bc a(xb xbVar, za zaVar, boolean z10) {
        return new bc(xbVar, zaVar, z10);
    }

    public static bc b(xb xbVar, za zaVar) {
        return new bc(xbVar, zaVar, true);
    }

    public boolean c() {
        return this.f59302f;
    }

    public void d() {
        WeakReference weakReference = this.f59305i;
        dc dcVar = weakReference == null ? null : (dc) weakReference.get();
        this.f59305i = null;
        if (dcVar == null) {
            return;
        }
        dcVar.setStateChangedListener(null);
        ViewParent parent = dcVar.getParent();
        if (parent == null) {
            return;
        }
        ((ViewGroup) parent).removeView(dcVar);
        gb.b("ViewabilityTracker", "help view removed");
    }

    public void e() {
        if (this.f59302f) {
            this.f59302f = false;
            gb.b("ViewabilityTracker", "stop tracking");
            d();
            this.f59298b.b(this.f59301e);
            this.f59303g = false;
            this.f59304h = null;
            for (int size = this.f59297a.size() - 1; size >= 0; size--) {
                ((cb) this.f59297a.get(size)).c();
            }
        }
    }

    public static float a(View view) {
        if (view != null && view.getParent() != null && view.getWindowVisibility() == 0 && view.getVisibility() == 0 && view.getAlpha() >= 0.5f) {
            int width = view.getWidth();
            if (view.getHeight() > 0 && width > 0) {
                if (view.getGlobalVisibleRect(new Rect())) {
                    return (r3.width() * r3.height()) / ((width * r2) / 100.0f);
                }
            }
        }
        return 0.0f;
    }

    public void b(View view) {
        if (this.f59302f) {
            this.f59304h = new WeakReference(view);
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
    }

    public void c(View view) {
        if (this.f59302f) {
            return;
        }
        if (this.f59297a.isEmpty() && this.f59300d) {
            return;
        }
        gb.b("ViewabilityTracker", "start tracking");
        this.f59302f = true;
        this.f59304h = new WeakReference(view);
        for (int size = this.f59297a.size() - 1; size >= 0; size--) {
            ((cb) this.f59297a.get(size)).a(view);
        }
        b();
        if (this.f59302f) {
            this.f59298b.a(this.f59301e);
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
    }

    public void b() {
        WeakReference weakReference = this.f59304h;
        View view = weakReference == null ? null : (View) weakReference.get();
        if (view == null) {
            gb.b("ViewabilityTracker", "Tracking view disappeared");
            e();
            return;
        }
        float fA = a(view);
        boolean z10 = e2.a(fA, this.f59299c) != -1;
        gb.b("ViewabilityTracker", "View visibility " + fA + "% (isVisible = " + z10 + ")");
        a(z10, fA, view);
    }

    @Override // com.my.target.w2
    public a a() {
        return this.f59306j;
    }

    public void a(a aVar) {
        this.f59306j = aVar;
    }

    @Override // com.my.target.w2
    public void a(cb cbVar) {
        int size = this.f59297a.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (this.f59297a.get(size) == cbVar) {
                this.f59297a.remove(size);
                break;
            }
            size--;
        }
        if (this.f59297a.isEmpty() && this.f59300d) {
            gb.b("ViewabilityTracker", "statTrackers are empty and shouldStopOnShow = true, stop tracking");
            e();
        }
    }

    public void a(ViewGroup viewGroup) {
        d();
        try {
            dc dcVar = new dc(viewGroup.getContext());
            kb.b(dcVar, "viewability_view");
            viewGroup.addView(dcVar);
            gb.b("ViewabilityTracker", "help view added");
            dcVar.setStateChangedListener(new dc.a() { // from class: k5.n
                @Override // com.my.target.dc.a
                public final void a(boolean z10) {
                    this.f86093a.a(z10);
                }
            });
            this.f59305i = new WeakReference(dcVar);
        } catch (Throwable th2) {
            gb.c("ViewabilityTracker", "Unable to add Viewability View - " + th2.getMessage());
            this.f59305i = null;
        }
    }

    public void a(boolean z10, float f10, View view) {
        boolean z11 = this.f59303g;
        for (int size = this.f59297a.size() - 1; size >= 0; size--) {
            ((cb) this.f59297a.get(size)).a(z10, f10, view);
        }
        if (z11 == z10) {
            return;
        }
        this.f59303g = this.f59302f && z10;
        a aVar = this.f59306j;
        if (aVar != null) {
            aVar.a(z10);
        }
    }

    public void a(boolean z10) {
        WeakReference weakReference = this.f59305i;
        dc dcVar = weakReference == null ? null : (dc) weakReference.get();
        if (dcVar == null) {
            gb.b("ViewabilityTracker", "help view is null");
            this.f59305i = null;
            return;
        }
        ViewParent parent = dcVar.getParent();
        WeakReference weakReference2 = this.f59304h;
        View view = weakReference2 == null ? null : (View) weakReference2.get();
        if (parent != null && parent == view) {
            gb.b("ViewabilityTracker", "onViewVisibilityChanged = " + z10);
            if (z10) {
                b();
                if (this.f59302f) {
                    this.f59298b.a(this.f59301e);
                    return;
                }
                return;
            }
            this.f59298b.b(this.f59301e);
            a(false, 0.0f, view);
            return;
        }
        gb.b("ViewabilityTracker", "onStateChanged viewParent is null or not equals to rootView");
        dcVar.setStateChangedListener(null);
        this.f59305i.clear();
        this.f59305i = null;
    }

    public final void a(xb xbVar, za zaVar) {
        long jA = (long) (xbVar.a() * 1000.0f);
        ab abVarB = zaVar.b("viewabilityDuration");
        gb.b("ViewabilityTracker", "ViewabilityDuration stats count = " + abVarB.f59176a.size());
        if (!abVarB.f59176a.isEmpty()) {
            this.f59297a.add(zb.a(this, abVarB, jA));
        }
        ab abVarB2 = zaVar.b(C4424m2.f43623v);
        gb.b("ViewabilityTracker", "Show stats count = " + abVarB2.f59176a.size());
        this.f59297a.add(ka.a(this, abVarB2, jA, zaVar));
        ab abVarB3 = zaVar.b("viewin");
        gb.b("ViewabilityTracker", "View In stats count = " + abVarB3.f59176a.size());
        this.f59297a.add(wb.a(this, abVarB3));
        ab abVarB4 = zaVar.b(Reporting.EventType.RENDER);
        gb.b("ViewabilityTracker", "Render stats count = " + abVarB4.f59176a.size());
        ab abVarB5 = zaVar.b("viewabilityMeasurable");
        gb.b("ViewabilityTracker", "ViewabilityMeasurable stats count = " + abVarB5.f59176a.size());
        this.f59297a.add(t9.a(this, abVarB4, abVarB5));
    }
}
