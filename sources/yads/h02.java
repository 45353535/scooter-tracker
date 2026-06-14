package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class h02 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f111424e = {ub.a(h02.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c22 f111425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c02 f111426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b02 f111427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gk2 f111428d;

    public h02(View view, c22 c22Var, c02 c02Var) {
        this.f111425a = c22Var;
        this.f111426b = c02Var;
        this.f111428d = hk2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        gk2 gk2Var = this.f111428d;
        KProperty[] kPropertyArr = f111424e;
        KProperty kProperty = kPropertyArr[0];
        View view = (View) gk2Var.f111244a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        gk2 gk2Var2 = this.f111428d;
        KProperty kProperty2 = kPropertyArr[0];
        View view2 = (View) gk2Var2.f111244a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            c02 c02Var = this.f111426b;
            c22 c22Var = this.f111425a;
            c02Var.getClass();
            b02 b02Var = new b02(view2, c22Var);
            this.f111427c = b02Var;
            gk2 gk2Var3 = b02Var.f108883b;
            KProperty kProperty3 = b02.f108881d[0];
            View view3 = (View) gk2Var3.f111244a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(b02Var);
        }
    }

    public final void b() {
        b02 b02Var = this.f111427c;
        if (b02Var != null) {
            b02Var.a();
        }
        this.f111427c = null;
        gk2 gk2Var = this.f111428d;
        KProperty kProperty = f111424e[0];
        View view = (View) gk2Var.f111244a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.f111425a.f109182a.g();
        gk2 gk2Var = this.f111428d;
        KProperty kProperty = f111424e[0];
        View view2 = (View) gk2Var.f111244a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            c02 c02Var = this.f111426b;
            c22 c22Var = this.f111425a;
            c02Var.getClass();
            b02 b02Var = new b02(view2, c22Var);
            this.f111427c = b02Var;
            gk2 gk2Var2 = b02Var.f108883b;
            KProperty kProperty2 = b02.f108881d[0];
            View view3 = (View) gk2Var2.f111244a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(b02Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b02 b02Var = this.f111427c;
        if (b02Var != null) {
            b02Var.a();
        }
        this.f111427c = null;
        this.f111425a.f109182a.h();
    }
}
