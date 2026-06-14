package com.my.target;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab f59396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab f59397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f59398c;

    public cc(ab abVar, ab abVar2) {
        this.f59397b = abVar2;
        this.f59396a = abVar;
    }

    public static cc a(za zaVar) {
        return new cc(zaVar.b(2), zaVar.a(2));
    }

    public void a(View view) {
        WeakReference weakReference;
        if (view == null && (weakReference = this.f59398c) != null) {
            weakReference.clear();
        } else {
            this.f59398c = new WeakReference(view);
        }
    }

    public void a(float f10, float f11) {
        Context context;
        double dA;
        View view;
        WeakReference weakReference = this.f59398c;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            context = null;
            dA = 0.0d;
        } else {
            dA = bc.a(view);
            context = view.getContext();
        }
        a(dA, f10, f11, context);
    }

    public void a() {
        WeakReference weakReference = this.f59398c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f59397b.f59176a.clear();
        this.f59396a.f59176a.clear();
        this.f59398c = null;
    }

    public final void a(double d10, float f10, float f11, Context context) {
        if (this.f59396a.f59176a.isEmpty() && this.f59397b.f59176a.isEmpty()) {
            return;
        }
        if (context == null) {
            Iterator it = this.f59397b.f59176a.iterator();
            while (it.hasNext()) {
                ((t6) it.next()).a(-1.0f);
            }
            return;
        }
        ab abVarA = ab.a(new ArrayList(), this.f59396a.f59177b);
        while (true) {
            if (this.f59396a.f59176a.isEmpty()) {
                break;
            }
            int size = this.f59396a.f59176a.size() - 1;
            if (e2.a(((o8) this.f59396a.f59176a.get(size)).f(), f10) == 1) {
                break;
            }
            o8 o8Var = (o8) this.f59396a.f59176a.remove(size);
            int i10 = o8Var.f59178d;
            boolean zG = o8Var.g();
            boolean z10 = ((double) i10) <= d10;
            if ((z10 && zG) || (!z10 && !zG)) {
                abVarA.f59176a.add(o8Var);
            }
        }
        float f12 = f11 - f10;
        Iterator it2 = this.f59397b.f59176a.iterator();
        while (it2.hasNext()) {
            t6 t6Var = (t6) it2.next();
            int i11 = t6Var.f59178d;
            float fE = t6Var.e();
            boolean z11 = d10 < ((double) i11);
            boolean z12 = fE < 0.0f;
            if (e2.a(f12, t6Var.f60838f) == -1 && (z11 || z12)) {
                if (!t6Var.f60839g) {
                    abVarA.f59176a.add(t6Var);
                }
                it2.remove();
            } else if (z11) {
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
