package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.Views;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseDivTabbedCardUi<TAB_DATA extends Input.TabBase<ACTION>, TAB_VIEW, ACTION> {

    @NonNull
    private final AbstractTabBar<ACTION> mAbstractTabBar;

    @NonNull
    private final ActiveTabClickListener<ACTION> mActiveTabClickListener;

    @NonNull
    private HeightCalculatorFactory mHeightCalculatorFactory;

    @NonNull
    protected final ScrollableViewPager mPager;

    @NonNull
    private final String mTabHeaderTag;

    @NonNull
    private final String mTabItemTag;

    @NonNull
    private final BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.BaseTabTitleBarHost mTabTitleBarHost;

    @NonNull
    private final View mView;

    @Nullable
    private final ViewPagerFixedSizeLayout mViewPagerFixedSizeLayout;

    @Nullable
    private ViewPagerFixedSizeLayout.HeightCalculator mViewPagerHeightCalculator;

    @NonNull
    private final ViewPool mViewPool;

    @NonNull
    private final Map<ViewGroup, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> mBindings = new ArrayMap();

    @NonNull
    private final Map<Integer, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> mBindingByPosition = new ArrayMap();
    private final PagerAdapter mPagerAdapter = new PagerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.1

        @Nullable
        private SparseArray<Parcelable> mChildStates;

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            if (ViewsKt.isLayoutRtl(BaseDivTabbedCardUi.this.mPager)) {
                i10 = (getCount() - i10) - 1;
            }
            ViewGroup viewGroup2 = (ViewGroup) obj;
            ((Binding) BaseDivTabbedCardUi.this.mBindings.remove(viewGroup2)).unbind();
            BaseDivTabbedCardUi.this.mBindingByPosition.remove(Integer.valueOf(i10));
            Log.d("BaseDivTabbedCardUi", "destroyItem pos " + i10);
            viewGroup.removeView(viewGroup2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (BaseDivTabbedCardUi.this.mCurrentData == null) {
                return 0;
            }
            return BaseDivTabbedCardUi.this.mCurrentData.getTabs().size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            ViewGroup viewGroup2;
            if (ViewsKt.isLayoutRtl(BaseDivTabbedCardUi.this.mPager)) {
                i10 = (getCount() - i10) - 1;
            }
            int i11 = i10;
            Log.d("BaseDivTabbedCardUi", "instantiateItem pos " + i11);
            Binding binding = (Binding) BaseDivTabbedCardUi.this.mBindingByPosition.get(Integer.valueOf(i11));
            if (binding != null) {
                viewGroup2 = binding.mContainer;
                Assert.assertNull(binding.mContainer.getParent());
            } else {
                ViewGroup viewGroup3 = (ViewGroup) BaseDivTabbedCardUi.this.mViewPool.obtain(BaseDivTabbedCardUi.this.mTabItemTag);
                Binding binding2 = new Binding(viewGroup3, (Input.TabBase) BaseDivTabbedCardUi.this.mCurrentData.getTabs().get(i11), i11);
                BaseDivTabbedCardUi.this.mBindingByPosition.put(Integer.valueOf(i11), binding2);
                binding = binding2;
                viewGroup2 = viewGroup3;
            }
            viewGroup.addView(viewGroup2);
            BaseDivTabbedCardUi.this.mBindings.put(viewGroup2, binding);
            if (i11 == BaseDivTabbedCardUi.this.mPager.getCurrentItem()) {
                binding.bind();
            }
            SparseArray<Parcelable> sparseArray = this.mChildStates;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return obj == view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
            if (!(parcelable instanceof Bundle)) {
                this.mChildStates = null;
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(getClass().getClassLoader());
            this.mChildStates = bundle.getSparseParcelableArray("div_tabs_child_states");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Parcelable saveState() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>(BaseDivTabbedCardUi.this.mBindings.size());
            Iterator it = BaseDivTabbedCardUi.this.mBindings.keySet().iterator();
            while (it.hasNext()) {
                ((ViewGroup) it.next()).saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    };
    private boolean mTabTitleBarIgnoreScrollEvents = false;
    private Input<TAB_DATA> mCurrentData = null;
    private boolean mInSetData = false;

    public interface AbstractTabBar<ACTION> {

        public interface Host<ACTION> {
            void onActiveTabClicked(@NonNull ACTION action, int i10);

            void setCurrentPage(int i10, boolean z10);
        }

        void fixScrollPosition(int i10);

        @Nullable
        ViewPager.OnPageChangeListener getCustomPageChangeListener();

        void manuallyScroll(int i10);

        void setData(@NonNull List<? extends Input.TabBase<ACTION>> list, int i10, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber);

        void setHost(@NonNull Host<ACTION> host);

        void setIntermediateState(int i10, float f10);

        void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider);

        void setViewPool(@NonNull ViewPool viewPool, @NonNull String str);
    }

    public interface ActiveTabClickListener<ACTION> {
        void onActiveTabClicked(@NonNull ACTION action, int i10);
    }

    private class BaseTabTitleBarHost implements AbstractTabBar.Host<ACTION> {
        private BaseTabTitleBarHost() {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        public void onActiveTabClicked(@NonNull ACTION action, int i10) {
            BaseDivTabbedCardUi.this.mActiveTabClickListener.onActiveTabClicked(action, i10);
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        public void setCurrentPage(int i10, boolean z10) {
            if (z10) {
                BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents = true;
            }
            BaseDivTabbedCardUi.this.mPager.setCurrentItem(i10);
        }
    }

    private class Binding {

        @NonNull
        private final ViewGroup mContainer;

        @NonNull
        private final TAB_DATA mData;
        private final int mPosition;

        @Nullable
        private TAB_VIEW mView;

        void bind() {
            if (this.mView != null) {
                return;
            }
            this.mView = (TAB_VIEW) BaseDivTabbedCardUi.this.bindTabData(this.mContainer, this.mData, this.mPosition);
        }

        void unbind() {
            TAB_VIEW tab_view = this.mView;
            if (tab_view == null) {
                return;
            }
            BaseDivTabbedCardUi.this.unbindTabData(tab_view);
            this.mView = null;
        }

        private Binding(@NonNull ViewGroup viewGroup, @NonNull TAB_DATA tab_data, int i10) {
            this.mContainer = viewGroup;
            this.mData = tab_data;
            this.mPosition = i10;
        }
    }

    private class DataBindingTransformer implements ViewPager.PageTransformer {
        private DataBindingTransformer() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f10) {
            Binding binding;
            if (!BaseDivTabbedCardUi.this.mInSetData && f10 > -1.0f && f10 < 1.0f && (binding = (Binding) BaseDivTabbedCardUi.this.mBindings.get(view)) != null) {
                binding.bind();
            }
        }
    }

    public interface Input<TAB extends TabBase> {

        public interface TabBase<ACTION> {
            @Nullable
            ACTION getActionable();

            @Nullable
            Integer getTabHeight();

            Integer getTabHeightLayoutParam();

            String getTitle();
        }

        @NonNull
        List<? extends TAB> getTabs();
    }

    private class PagerChangeListener implements ViewPager.OnPageChangeListener {
        int mCurrentState;

        private PagerChangeListener() {
            this.mCurrentState = 0;
        }

        private void fixViewPagerHeightOnScrollEnd(int i10) {
            if (BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null || BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout == null) {
                return;
            }
            BaseDivTabbedCardUi.this.mViewPagerHeightCalculator.setPositionAndOffsetForMeasure(i10, 0.0f);
            BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.requestLayout();
        }

        private void updateViewPagerHeightOnScroll(int i10, float f10) {
            if (BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout == null || BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null) {
                return;
            }
            BaseDivTabbedCardUi.this.mViewPagerHeightCalculator.setPositionAndOffsetForMeasure(i10, f10);
            if (BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.shouldRequestLayoutOnScroll(i10, f10)) {
                if (!BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.isInLayout()) {
                    BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.requestLayout();
                    return;
                }
                ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout;
                final ViewPagerFixedSizeLayout viewPagerFixedSizeLayout2 = BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout;
                Objects.requireNonNull(viewPagerFixedSizeLayout2);
                viewPagerFixedSizeLayout.post(new Runnable() { // from class: com.yandex.div.internal.widget.tabs.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewPagerFixedSizeLayout2.requestLayout();
                    }
                });
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            this.mCurrentState = i10;
            if (i10 == 0) {
                int currentItem = BaseDivTabbedCardUi.this.mPager.getCurrentItem();
                fixViewPagerHeightOnScrollEnd(currentItem);
                if (!BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents) {
                    BaseDivTabbedCardUi.this.mAbstractTabBar.fixScrollPosition(currentItem);
                }
                BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            if (this.mCurrentState != 0) {
                updateViewPagerHeightOnScroll(i10, f10);
            }
            if (BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents) {
                return;
            }
            BaseDivTabbedCardUi.this.mAbstractTabBar.setIntermediateState(i10, f10);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            if (BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null) {
                BaseDivTabbedCardUi.this.mPager.requestLayout();
            } else if (this.mCurrentState == 0) {
                fixViewPagerHeightOnScrollEnd(i10);
            }
        }
    }

    public static class TabbedCardConfig {

        @IdRes
        private final int mCardPagerContainerHelperId;

        @IdRes
        private final int mCardPagerContainerId;

        @IdRes
        private final int mCardTitleContainerScrollerId;
        private final boolean mIsViewPagerEdgeScrollable;
        private final boolean mIsViewPagerScrollable;

        @NonNull
        private final String mTabHeaderTag;

        @NonNull
        private final String mTabItemTag;

        public TabbedCardConfig(@IdRes int i10, @IdRes int i11, @IdRes int i12, boolean z10, boolean z11, @NonNull String str, @NonNull String str2) {
            this.mCardTitleContainerScrollerId = i10;
            this.mCardPagerContainerId = i11;
            this.mCardPagerContainerHelperId = i12;
            this.mIsViewPagerScrollable = z10;
            this.mIsViewPagerEdgeScrollable = z11;
            this.mTabHeaderTag = str;
            this.mTabItemTag = str2;
        }

        @IdRes
        int getCardPagerContainerHelperId() {
            return this.mCardPagerContainerHelperId;
        }

        @IdRes
        int getCardPagerContainerId() {
            return this.mCardPagerContainerId;
        }

        @IdRes
        int getCardTitleContainerScrollerId() {
            return this.mCardTitleContainerScrollerId;
        }

        @NonNull
        String getTabHeaderTag() {
            return this.mTabHeaderTag;
        }

        @NonNull
        String getTabItemTag() {
            return this.mTabItemTag;
        }

        boolean isViewPagerEdgeScrollable() {
            return this.mIsViewPagerEdgeScrollable;
        }

        boolean isViewPagerScrollable() {
            return this.mIsViewPagerScrollable;
        }
    }

    public BaseDivTabbedCardUi(@NonNull ViewPool viewPool, @NonNull View view, @NonNull TabbedCardConfig tabbedCardConfig, @NonNull HeightCalculatorFactory heightCalculatorFactory, @NonNull TabTextStyleProvider tabTextStyleProvider, @Nullable ViewPager.OnPageChangeListener onPageChangeListener, @NonNull ActiveTabClickListener<ACTION> activeTabClickListener, @NonNull ViewPager.OnPageChangeListener onPageChangeListener2) {
        this.mViewPool = viewPool;
        this.mView = view;
        this.mHeightCalculatorFactory = heightCalculatorFactory;
        this.mActiveTabClickListener = activeTabClickListener;
        BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.BaseTabTitleBarHost baseTabTitleBarHost = new BaseTabTitleBarHost();
        this.mTabTitleBarHost = baseTabTitleBarHost;
        String tabHeaderTag = tabbedCardConfig.getTabHeaderTag();
        this.mTabHeaderTag = tabHeaderTag;
        this.mTabItemTag = tabbedCardConfig.getTabItemTag();
        AbstractTabBar<ACTION> abstractTabBar = (AbstractTabBar) Views.findViewAndCast(view, tabbedCardConfig.getCardTitleContainerScrollerId());
        this.mAbstractTabBar = abstractTabBar;
        abstractTabBar.setHost(baseTabTitleBarHost);
        abstractTabBar.setTypefaceProvider(tabTextStyleProvider.getTypefaceProvider());
        abstractTabBar.setViewPool(viewPool, tabHeaderTag);
        ScrollableViewPager scrollableViewPager = (ScrollableViewPager) Views.findViewAndCast(view, tabbedCardConfig.getCardPagerContainerId());
        this.mPager = scrollableViewPager;
        ViewCompat.setLayoutDirection(scrollableViewPager, scrollableViewPager.getResources().getConfiguration().getLayoutDirection());
        scrollableViewPager.setAdapter(null);
        scrollableViewPager.clearOnPageChangeListeners();
        scrollableViewPager.addOnPageChangeListener(new PagerChangeListener());
        ViewPager.OnPageChangeListener customPageChangeListener = abstractTabBar.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            scrollableViewPager.addOnPageChangeListener(customPageChangeListener);
        }
        if (onPageChangeListener != null) {
            scrollableViewPager.addOnPageChangeListener(onPageChangeListener);
        }
        scrollableViewPager.addOnPageChangeListener(onPageChangeListener2);
        scrollableViewPager.setScrollEnabled(tabbedCardConfig.isViewPagerScrollable());
        scrollableViewPager.setEdgeScrollEnabled(tabbedCardConfig.isViewPagerEdgeScrollable());
        scrollableViewPager.setPageTransformer(false, new DataBindingTransformer());
        this.mViewPagerFixedSizeLayout = (ViewPagerFixedSizeLayout) Views.findViewAndCast(view, tabbedCardConfig.getCardPagerContainerHelperId());
        initializeViewPagerFixedSizeLayout();
    }

    private int findCorrespondingTab(int i10, Input<TAB_DATA> input) {
        if (input == null) {
            return -1;
        }
        return Math.min(i10, input.getTabs().size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabCount() {
        Input<TAB_DATA> input = this.mCurrentData;
        if (input == null) {
            return 0;
        }
        return input.getTabs().size();
    }

    private void initializeViewPagerFixedSizeLayout() {
        if (this.mViewPagerFixedSizeLayout == null) {
            return;
        }
        ViewPagerFixedSizeLayout.HeightCalculator cardHeightCalculator = this.mHeightCalculatorFactory.getCardHeightCalculator((ViewGroup) this.mViewPool.obtain(this.mTabItemTag), new HeightCalculatorFactory.MeasureTabHeightFn() { // from class: com.yandex.div.internal.widget.tabs.b
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory.MeasureTabHeightFn
            public final int apply(ViewGroup viewGroup, int i10, int i11, int i12) {
                return this.f68152a.measureTabHeight(viewGroup, i10, i11, i12);
            }
        }, new HeightCalculatorFactory.GetTabCountFn() { // from class: com.yandex.div.internal.widget.tabs.c
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory.GetTabCountFn
            public final int apply() {
                return this.f68153a.getTabCount();
            }
        });
        this.mViewPagerHeightCalculator = cardHeightCalculator;
        this.mViewPagerFixedSizeLayout.setHeightCalculator(cardHeightCalculator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int measureTabHeight(@NonNull ViewGroup viewGroup, int i10, int i11, int i12) {
        ViewGroup viewGroup2;
        int measuredHeight;
        if (this.mCurrentData == null) {
            return -1;
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.mViewPagerFixedSizeLayout;
        boolean z10 = false;
        int i13 = viewPagerFixedSizeLayout != null ? viewPagerFixedSizeLayout.get_collapsiblePaddingBottom() : 0;
        List<? extends TAB> tabs = this.mCurrentData.getTabs();
        if (i12 >= 0 && i12 < tabs.size()) {
            z10 = true;
        }
        Assert.assertTrue("Tab index is out ouf bounds!", z10);
        Input.TabBase tabBase = (Input.TabBase) tabs.get(i12);
        Integer tabHeight = tabBase.getTabHeight();
        if (tabHeight != null) {
            measuredHeight = tabHeight.intValue();
        } else {
            BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding = this.mBindingByPosition.get(Integer.valueOf(i12));
            if (binding == null) {
                viewGroup2 = (ViewGroup) this.mViewPool.obtain(this.mTabItemTag);
                BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding2 = new Binding(viewGroup2, tabBase, i12);
                this.mBindingByPosition.put(Integer.valueOf(i12), binding2);
                binding = binding2;
            } else {
                viewGroup2 = ((Binding) binding).mContainer;
            }
            binding.bind();
            viewGroup2.forceLayout();
            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), resolveHeightMeasureSpec(i11, tabBase));
            measuredHeight = viewGroup2.getMeasuredHeight();
        }
        return measuredHeight + i13;
    }

    private int resolveHeightMeasureSpec(int i10, TAB_DATA tab_data) {
        return tab_data.getTabHeightLayoutParam().intValue() == -1 ? i10 : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @NonNull
    protected abstract TAB_VIEW bindTabData(@NonNull ViewGroup viewGroup, @NonNull TAB_DATA tab_data, int i10);

    public void requestViewPagerLayout() {
        Log.d("BaseDivTabbedCardUi", "requestViewPagerLayout");
        ViewPagerFixedSizeLayout.HeightCalculator heightCalculator = this.mViewPagerHeightCalculator;
        if (heightCalculator != null) {
            heightCalculator.dropMeasureCache();
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.mViewPagerFixedSizeLayout;
        if (viewPagerFixedSizeLayout != null) {
            viewPagerFixedSizeLayout.requestLayout();
        }
    }

    public void setData(@Nullable Input<TAB_DATA> input, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        int iFindCorrespondingTab = findCorrespondingTab(this.mPager.getCurrentItem(), input);
        this.mBindingByPosition.clear();
        this.mCurrentData = input;
        if (this.mPager.getAdapter() != null) {
            this.mInSetData = true;
            try {
                this.mPagerAdapter.notifyDataSetChanged();
            } finally {
                this.mInSetData = false;
            }
        }
        List<? extends Input.TabBase<ACTION>> tabs = input == null ? Collections.EMPTY_LIST : input.getTabs();
        this.mAbstractTabBar.setData(tabs, iFindCorrespondingTab, expressionResolver, expressionSubscriber);
        if (this.mPager.getAdapter() == null) {
            this.mPager.setAdapter(this.mPagerAdapter);
        } else if (!tabs.isEmpty() && iFindCorrespondingTab != -1) {
            this.mPager.setCurrentItem(iFindCorrespondingTab);
            this.mAbstractTabBar.manuallyScroll(iFindCorrespondingTab);
        }
        requestViewPagerLayout();
    }

    public void setDisabledScrollPages(@NonNull Set<Integer> set) {
        this.mPager.setDisabledScrollPages(set);
    }

    protected abstract void unbindTabData(@NonNull TAB_VIEW tab_view);
}
