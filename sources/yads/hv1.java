package yads;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class hv1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f111780g = {ub.a(hv1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vv1 f111781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nv1 f111782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eg1 f111783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gk2 f111784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dg1 f111785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f111786f = true;

    public hv1(ViewPager2 viewPager2, vv1 vv1Var, nv1 nv1Var, eg1 eg1Var) {
        this.f111781a = vv1Var;
        this.f111782b = nv1Var;
        this.f111783c = eg1Var;
        this.f111784d = hk2.a(viewPager2);
    }

    public final void a() {
        dg1 dg1Var = this.f111785e;
        if (dg1Var != null) {
            dg1Var.f109920a.removeCallbacksAndMessages(null);
        }
        this.f111785e = null;
    }
}
