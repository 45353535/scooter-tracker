package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public final class TabLayoutMediator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TabLayout f27908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewPager2 f27909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f27911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TabConfigurationStrategy f27912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.Adapter f27913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TabLayoutOnPageChangeCallback f27915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TabLayout.OnTabSelectedListener f27916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f27917j;

    private class PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
        PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            TabLayoutMediator.this.a();
        }
    }

    public interface TabConfigurationStrategy {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i10);
    }

    private static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final WeakReference f27919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f27921f;

        TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.f27919d = new WeakReference(tabLayout);
            a();
        }

        void a() {
            this.f27921f = 0;
            this.f27920e = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            this.f27920e = this.f27921f;
            this.f27921f = i10;
            TabLayout tabLayout = (TabLayout) this.f27919d.get();
            if (tabLayout != null) {
                tabLayout.G(this.f27921f);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = (TabLayout) this.f27919d.get();
            if (tabLayout != null) {
                int i12 = this.f27921f;
                boolean z11 = true;
                if (i12 != 2 || this.f27920e == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f27920e == 0) {
                    z10 = false;
                }
                tabLayout.B(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            TabLayout tabLayout = (TabLayout) this.f27919d.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f27921f;
            tabLayout.selectTab(tabLayout.getTabAt(i10), i11 == 0 || (i11 == 2 && this.f27920e == 0));
        }
    }

    private static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager2 f27922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f27923b;

        ViewPagerOnTabSelectedListener(ViewPager2 viewPager2, boolean z10) {
            this.f27922a = viewPager2;
            this.f27923b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f27922a.setCurrentItem(tab.getPosition(), this.f27923b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabConfigurationStrategy);
    }

    void a() {
        this.f27908a.removeAllTabs();
        RecyclerView.Adapter adapter = this.f27913f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.Tab tabNewTab = this.f27908a.newTab();
                this.f27912e.onConfigureTab(tabNewTab, i10);
                this.f27908a.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f27909b.getCurrentItem(), this.f27908a.getTabCount() - 1);
                if (iMin != this.f27908a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f27908a;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    public void attach() {
        if (this.f27914g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter adapter = this.f27909b.getAdapter();
        this.f27913f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f27914g = true;
        TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.f27908a);
        this.f27915h = tabLayoutOnPageChangeCallback;
        this.f27909b.registerOnPageChangeCallback(tabLayoutOnPageChangeCallback);
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.f27909b, this.f27911d);
        this.f27916i = viewPagerOnTabSelectedListener;
        this.f27908a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
        if (this.f27910c) {
            PagerAdapterObserver pagerAdapterObserver = new PagerAdapterObserver();
            this.f27917j = pagerAdapterObserver;
            this.f27913f.registerAdapterDataObserver(pagerAdapterObserver);
        }
        a();
        this.f27908a.setScrollPosition(this.f27909b.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        RecyclerView.Adapter adapter;
        if (this.f27914g) {
            if (this.f27910c && (adapter = this.f27913f) != null) {
                adapter.unregisterAdapterDataObserver(this.f27917j);
                this.f27917j = null;
            }
            this.f27908a.removeOnTabSelectedListener(this.f27916i);
            this.f27909b.unregisterOnPageChangeCallback(this.f27915h);
            this.f27916i = null;
            this.f27915h = null;
            this.f27913f = null;
            this.f27914g = false;
        }
    }

    public boolean isAttached() {
        return this.f27914g;
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z10, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, z10, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z10, boolean z11, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this.f27908a = tabLayout;
        this.f27909b = viewPager2;
        this.f27910c = z10;
        this.f27911d = z11;
        this.f27912e = tabConfigurationStrategy;
    }
}
