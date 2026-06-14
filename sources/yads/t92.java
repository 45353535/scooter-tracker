package yads;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public final class t92 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv1 f116134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv1 f116135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f116136c;

    public t92(nv1 nv1Var, hv1 hv1Var) {
        this.f116134a = nv1Var;
        this.f116135b = hv1Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i10) {
        if (i10 == 0) {
            this.f116136c = false;
            return;
        }
        if (i10 != 1) {
            return;
        }
        hv1 hv1Var = this.f116135b;
        if (hv1Var != null) {
            hv1Var.a();
            hv1Var.f111786f = false;
        }
        this.f116136c = true;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
        if (this.f116136c) {
            nv1 nv1Var = this.f116134a;
            if (nv1Var.f114059d) {
                nv1Var.a("first_user_swipe");
                nv1Var.f114059d = false;
            }
            this.f116136c = false;
        }
    }
}
