package yads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class id1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f111964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hd1 f111965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd1 f111966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ed1 f111967e;

    public id1(Context context, ViewGroup viewGroup, hd1 hd1Var, fd1 fd1Var, ed1 ed1Var) {
        this.f111963a = context;
        this.f111964b = viewGroup;
        this.f111965c = hd1Var;
        this.f111966d = fd1Var;
        this.f111967e = ed1Var;
    }

    public final boolean a() {
        Object next;
        hd1 hd1Var = this.f111965c;
        Context context = this.f111963a;
        Iterator it = hd1Var.f111554a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((dd1) next).f109888d.a(context)) {
                break;
            }
        }
        dd1 dd1Var = (dd1) next;
        if (dd1Var == null) {
            return false;
        }
        fd1 fd1Var = this.f111966d;
        ViewGroup viewGroup = this.f111964b;
        fd1Var.getClass();
        Context context2 = viewGroup.getContext();
        int i10 = dd1Var.f109885a;
        Class cls = dd1Var.f109886b;
        fd1Var.f110691a.getClass();
        ViewGroup viewGroup2 = (ViewGroup) zp2.a(context2, cls, i10, viewGroup);
        if (viewGroup2 == null) {
            return false;
        }
        ed1 ed1Var = this.f111967e;
        ViewGroup viewGroup3 = this.f111964b;
        ed1Var.getClass();
        try {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            viewGroup3.removeAllViews();
            viewGroup3.addView(viewGroup2, layoutParams);
        } catch (Throwable unused) {
        }
        hf0 hf0Var = dd1Var.f109887c;
        ed1Var.f110345a = hf0Var;
        if (hf0Var == null) {
            return true;
        }
        hf0Var.a(viewGroup2);
        return true;
    }

    public final void b() {
        ed1 ed1Var = this.f111967e;
        ViewGroup viewGroup = this.f111964b;
        ed1Var.getClass();
        try {
            viewGroup.removeAllViews();
            hf0 hf0Var = ed1Var.f110345a;
            if (hf0Var != null) {
                hf0Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
