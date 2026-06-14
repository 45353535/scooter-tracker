package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class jv1 extends us {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f112468g = {ub.a(jv1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vv1 f112469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nv1 f112470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk2 f112471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public iv1 f112472f = iv1.f112158b;

    public jv1(ViewPager2 viewPager2, vv1 vv1Var, nv1 nv1Var) {
        this.f112469c = vv1Var;
        this.f112470d = nv1Var;
        this.f112471e = hk2.a(viewPager2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        ViewPager2 viewPager2;
        gk2 gk2Var = this.f112471e;
        KProperty kProperty = f112468g[0];
        ViewPager2 viewPager22 = (ViewPager2) gk2Var.f111244a.get();
        if (viewPager22 != null) {
            if (qi3.f115019a.a(viewPager22).f109937a > 0) {
                RecyclerView.Adapter adapter = viewPager22.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager22.getCurrentItem();
                    if (currentItem == 0) {
                        this.f112472f = iv1.f112158b;
                    } else if (currentItem == itemCount - 1) {
                        this.f112472f = iv1.f112159c;
                    }
                } else {
                    this.f116750b = ts.f116351c;
                }
                int iOrdinal = this.f112472f.ordinal();
                if (iOrdinal == 0) {
                    ViewPager2 viewPager23 = (ViewPager2) this.f112469c.f117210a.get();
                    if (viewPager23 != null) {
                        viewPager23.setCurrentItem(viewPager23.getCurrentItem() + 1, true);
                    }
                } else if (iOrdinal == 1 && (viewPager2 = (ViewPager2) this.f112469c.f117210a.get()) != null) {
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
                }
                nv1 nv1Var = this.f112470d;
                if (nv1Var.f114060e) {
                    nv1Var.a("first_auto_swipe");
                    nv1Var.f114060e = false;
                }
            }
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f116750b = ts.f116351c;
        }
    }
}
