package com.my.target;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab f61182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f61183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f61184c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f61185d;

    public z9(za zaVar) {
        this.f61182a = ab.a(new ArrayList(), zaVar.a());
        for (t6 t6Var : zaVar.a(2).f59176a) {
            if (t6Var instanceof y9) {
                this.f61182a.f59176a.add((y9) t6Var);
            }
        }
    }

    public static z9 a(za zaVar) {
        return new z9(zaVar);
    }

    public void b(int i10) {
        Context context;
        double dA;
        View view;
        float f10 = i10;
        if (f10 == this.f61184c) {
            return;
        }
        if (!a(i10)) {
            a();
        }
        WeakReference weakReference = this.f61183b;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            context = null;
            dA = 0.0d;
        } else {
            dA = bc.a(view);
            context = view.getContext();
        }
        b(dA, i10, context);
        this.f61184c = f10;
        this.f61185d = System.currentTimeMillis();
    }

    public void a(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.f61183b) == null) {
            this.f61183b = new WeakReference(view);
        } else {
            weakReference.clear();
        }
    }

    public final void a() {
        Iterator it = this.f61182a.f59176a.iterator();
        while (it.hasNext()) {
            ((y9) it.next()).a(-1.0f);
        }
    }

    public final boolean a(int i10) {
        float f10 = i10;
        float f11 = this.f61184c;
        if (f10 < f11) {
            return false;
        }
        return this.f61185d <= 0 || (((long) (f10 - f11)) * 1000) - (System.currentTimeMillis() - this.f61185d) <= 1000;
    }

    public final void a(double d10, int i10, Context context) {
        ab abVarA = ab.a(new ArrayList(), this.f61182a.f59177b);
        Iterator it = this.f61182a.f59176a.iterator();
        while (it.hasNext()) {
            y9 y9Var = (y9) it.next();
            int iG = y9Var.g();
            int iF = y9Var.f();
            if (iG > i10 || (iF != 0 && iF < i10)) {
                y9Var.a(-1.0f);
            } else if (y9Var.f59178d > d10) {
                y9Var.a(-1.0f);
            } else {
                if (y9Var.e() >= 0.0f) {
                    float f10 = i10;
                    if (f10 > y9Var.e()) {
                        if (f10 - y9Var.e() >= y9Var.f60838f) {
                            abVarA.f59176a.add(y9Var);
                            it.remove();
                        }
                    }
                }
                y9Var.a(i10);
            }
        }
        bb.b(abVarA, 1, context);
    }

    public final void b(double d10, int i10, Context context) {
        if (this.f61182a.f59176a.isEmpty()) {
            return;
        }
        if (context == null) {
            Iterator it = this.f61182a.f59176a.iterator();
            while (it.hasNext()) {
                ((t6) it.next()).a(-1.0f);
            }
            return;
        }
        a(d10, i10, context);
    }
}
