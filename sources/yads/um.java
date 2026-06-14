package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tm f116711a;

    public um(tm tmVar) {
        this.f116711a = tmVar;
    }

    public final void a(zt0 zt0Var, jm jmVar) {
        Object next;
        RelativeLayout.LayoutParams layoutParams;
        tm tmVar = this.f116711a;
        hd1 hd1Var = tmVar.f116298c;
        Context context = tmVar.f116296a;
        Iterator it = hd1Var.f111554a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((dd1) next).f109888d.a(context)) {
                    break;
                }
            }
        }
        dd1 dd1Var = (dd1) next;
        if (dd1Var != null) {
            fd1 fd1Var = tmVar.f116299d;
            ViewGroup viewGroup = tmVar.f116297b;
            fd1Var.getClass();
            Context context2 = viewGroup.getContext();
            int i10 = dd1Var.f109885a;
            Class cls = dd1Var.f109886b;
            fd1Var.f110691a.getClass();
            ViewGroup viewGroup2 = (ViewGroup) zp2.a(context2, cls, i10, viewGroup);
            if (viewGroup2 != null) {
                sm smVar = tmVar.f116300e;
                ViewGroup viewGroup3 = tmVar.f116297b;
                gk2 gk2Var = smVar.f115874c;
                KProperty kProperty = sm.f115871d[0];
                gk2Var.getClass();
                gk2Var.f111244a = new WeakReference(viewGroup2);
                viewGroup3.setVisibility(0);
                viewGroup3.removeAllViews();
                Context context3 = viewGroup3.getContext();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = smVar.f115872a;
                Lazy lazy = sh3.f115813a;
                if (viewGroup3.indexOfChild(viewGroup2) == -1) {
                    if (zt0Var != null) {
                        layoutParams = new RelativeLayout.LayoutParams(qi3.a(context3, zt0Var.c(context3)), zf.a.d(TypedValue.applyDimension(1, zt0Var.a(context3), context3.getResources().getDisplayMetrics())));
                    } else {
                        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    }
                    layoutParams.addRule(13);
                    viewGroup3.setVisibility(0);
                    viewGroup2.setVisibility(0);
                    viewGroup3.addView(viewGroup2, layoutParams);
                    if (onPreDrawListener != null) {
                        cj3 cj3Var = qi3.f115019a;
                        viewGroup2.getViewTreeObserver().addOnPreDrawListener(new pi3(viewGroup2, onPreDrawListener));
                    }
                }
                hf0 hf0Var = dd1Var.f109887c;
                smVar.f115873b = hf0Var;
                if (hf0Var != null) {
                    hf0Var.a(viewGroup2);
                }
                jmVar.a();
                return;
            }
        }
        jmVar.a(f9.f110645f);
    }
}
