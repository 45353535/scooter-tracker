package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class b02 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f108881d = {ub.a(b02.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c22 f108882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk2 f108883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f108884c;

    public b02(View view, c22 c22Var) {
        this.f108882a = c22Var;
        this.f108883b = hk2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        gk2 gk2Var = this.f108883b;
        KProperty kProperty = f108881d[0];
        View view = (View) gk2Var.f111244a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        gk2 gk2Var = this.f108883b;
        KProperty kProperty = f108881d[0];
        View view = (View) gk2Var.f111244a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.f108884c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.f108884c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.f108882a.f109182a.g();
            } else {
                this.f108882a.f109182a.h();
            }
        }
    }
}
