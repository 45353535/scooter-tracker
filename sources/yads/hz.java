package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public final class hz extends jz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vv1 f111805c;

    public hz(vv1 vv1Var, nv1 nv1Var, hv1 hv1Var) {
        super(nv1Var, hv1Var, 0);
        this.f111805c = vv1Var;
    }

    @Override // yads.jz, android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager2 viewPager2 = (ViewPager2) this.f111805c.f117210a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        }
        super.onClick(view);
    }
}
