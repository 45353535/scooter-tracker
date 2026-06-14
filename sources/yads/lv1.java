package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class lv1 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f113235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiBannerControlsContainer f113236b;

    public lv1(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
        this.f113235a = viewPager2;
        this.f113236b = multiBannerControlsContainer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i10) {
        RecyclerView.Adapter adapter = this.f113235a.getAdapter();
        this.f113236b.a(i10, adapter != null ? adapter.getItemCount() : 0);
    }
}
