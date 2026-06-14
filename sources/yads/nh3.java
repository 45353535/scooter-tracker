package yads;

import android.view.View;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f113911b = {ub.a(nh3.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk2 f113912a;

    public nh3(View view) {
        this.f113912a = hk2.a(view);
    }

    public void a() {
    }

    public abstract boolean a(View view, Object obj);

    public final View b() {
        gk2 gk2Var = this.f113912a;
        KProperty kProperty = f113911b[0];
        return (View) gk2Var.f111244a.get();
    }

    public abstract void b(View view, Object obj);

    public final boolean c() {
        View viewB = b();
        return viewB != null && !qi3.b(viewB) && viewB.getWidth() >= 1 && viewB.getHeight() >= 1;
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public void a(gi giVar, qh3 qh3Var, Object obj) {
        View viewB = b();
        if (viewB == null) {
            return;
        }
        qh3Var.a(viewB, giVar);
        qh3Var.a(giVar, new ph3(viewB));
    }
}
