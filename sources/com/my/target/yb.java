package com.my.target;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class yb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f61112b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ab f61114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ab f61115e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f61117g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f61111a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9 f61113c = u9.f60904d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f61116f = new Runnable() { // from class: k5.a3
        @Override // java.lang.Runnable
        public final void run() {
            this.f85989b.a();
        }
    };

    public yb(ab abVar, ab abVar2) {
        this.f61115e = abVar2;
        this.f61114d = abVar;
    }

    public static yb a(za zaVar) {
        return new yb(zaVar.b(1), zaVar.a(1));
    }

    public void b() {
        if (this.f61111a) {
            gb.b("ViewabilityBannerTracker", "banner viewability already tracking");
            return;
        }
        this.f61111a = true;
        this.f61112b = SystemClock.elapsedRealtime();
        this.f61113c.a(this.f61116f);
    }

    public void c() {
        this.f61113c.b(this.f61116f);
        WeakReference weakReference = this.f61117g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f61115e.f59176a.clear();
        this.f61114d.f59176a.clear();
        this.f61117g = null;
    }

    public final /* synthetic */ void a() {
        a((SystemClock.elapsedRealtime() - this.f61112b) / 1000.0f);
    }

    public void a(float f10) {
        Context context;
        double dA;
        View view;
        WeakReference weakReference = this.f61117g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            context = null;
            dA = 0.0d;
        } else {
            dA = bc.a(view);
            context = view.getContext();
        }
        a(dA, f10, context);
    }

    public void a(View view) {
        WeakReference weakReference;
        if (view == null && (weakReference = this.f61117g) != null) {
            weakReference.clear();
        } else {
            this.f61117g = new WeakReference(view);
        }
    }

    public final void a(double d10, float f10, Context context) {
        if (this.f61114d.f59176a.isEmpty() && this.f61115e.f59176a.isEmpty()) {
            return;
        }
        if (context == null) {
            Iterator it = this.f61115e.f59176a.iterator();
            while (it.hasNext()) {
                ((t6) it.next()).a(-1.0f);
            }
            return;
        }
        ab abVarA = ab.a(new ArrayList(), this.f61114d.f59177b);
        while (true) {
            if (this.f61114d.f59176a.isEmpty()) {
                break;
            }
            int size = this.f61114d.f59176a.size() - 1;
            if (e2.a(((o8) this.f61114d.f59176a.get(size)).f(), f10) == 1) {
                break;
            }
            o8 o8Var = (o8) this.f61114d.f59176a.remove(size);
            int i10 = o8Var.f59178d;
            boolean zG = o8Var.g();
            boolean z10 = ((double) i10) <= d10;
            if ((z10 && zG) || (!z10 && !zG)) {
                abVarA.f59176a.add(o8Var);
            }
        }
        Iterator it2 = this.f61115e.f59176a.iterator();
        while (it2.hasNext()) {
            t6 t6Var = (t6) it2.next();
            int i11 = t6Var.f59178d;
            float fE = t6Var.e();
            boolean z11 = d10 < ((double) i11);
            boolean z12 = fE < 0.0f;
            if (z11) {
                t6Var.a(-1.0f);
            } else if (z12) {
                t6Var.a(f10);
            } else if (e2.a(f10 - fE, t6Var.f60838f) != -1) {
                if (t6Var.f60839g) {
                    abVarA.f59176a.add(t6Var);
                }
                it2.remove();
            }
        }
        bb.b(abVarA, 1, context);
    }
}
