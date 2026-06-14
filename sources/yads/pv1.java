package yads;

import android.view.View;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public final class pv1 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewParent parent = view != null ? view.getParent() : null;
        ViewParent parent2 = parent != null ? parent.getParent() : null;
        ViewPager2 viewPager2 = parent2 instanceof ViewPager2 ? (ViewPager2) parent2 : null;
        if (viewPager2 != null) {
            viewPager2.callOnClick();
        }
    }
}
