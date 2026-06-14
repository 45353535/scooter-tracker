package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$attr;
import com.yandex.div.R$color;
import com.yandex.div.R$dimen;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.divs.tabs.DivTabsAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0012J\b\u0010\u001f\u001a\u00020\u001eH\u0012J\b\u0010 \u001a\u00020!H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/yandex/div/internal/widget/tabs/TabsLayout;", "Landroid/widget/LinearLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "divTabsAdapter", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "getDivTabsAdapter", "()Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "setDivTabsAdapter", "(Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;)V", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "pagerLayout", "Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "getPagerLayout", "()Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "titleLayout", "Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "getTitleLayout", "()Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "viewPager", "Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "getViewPager", "()Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "createDividerLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "createTitleLayoutParams", "getAccessibilityClassName", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TabsLayout extends LinearLayout {

    @Nullable
    private DivTabsAdapter divTabsAdapter;

    @NotNull
    private final View divider;

    @NotNull
    private final ViewPagerFixedSizeLayout pagerLayout;

    @NotNull
    private final TabTitlesLayoutView<?> titleLayout;

    @NotNull
    private final ScrollableViewPager viewPager;

    public TabsLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(R$id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        TabTitlesLayoutView<?> tabTitlesLayoutView = new TabTitlesLayoutView<>(context, null, R$attr.divTabIndicatorLayoutStyle);
        tabTitlesLayoutView.setId(R$id.base_tabbed_title_container_scroller);
        tabTitlesLayoutView.setLayoutParams(createTitleLayoutParams());
        int dimensionPixelSize = tabTitlesLayoutView.getResources().getDimensionPixelSize(R$dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = tabTitlesLayoutView.getResources().getDimensionPixelSize(R$dimen.title_tab_title_margin_horizontal);
        tabTitlesLayoutView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        tabTitlesLayoutView.setClipToPadding(false);
        this.titleLayout = tabTitlesLayoutView;
        View view = new View(context);
        view.setId(R$id.div_tabs_divider);
        view.setLayoutParams(createDividerLayoutParams());
        view.setBackgroundResource(R$color.div_separator_color);
        this.divider = view;
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context);
        scrollableViewPager.setId(R$id.div_tabs_pager_container);
        scrollableViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollableViewPager.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(scrollableViewPager, true);
        this.viewPager = scrollableViewPager;
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = new ViewPagerFixedSizeLayout(context, null, 0, 6, null);
        viewPagerFixedSizeLayout.setId(R$id.div_tabs_container_helper);
        viewPagerFixedSizeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPagerFixedSizeLayout.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        viewPagerFixedSizeLayout.addView(getViewPager());
        viewPagerFixedSizeLayout.addView(frameLayout);
        this.pagerLayout = viewPagerFixedSizeLayout;
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }

    private LinearLayout.LayoutParams createDividerLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R$dimen.div_separator_delimiter_height));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.div_horizontal_padding);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.topMargin = getResources().getDimensionPixelSize(R$dimen.title_tab_title_separator_margin_top);
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(R$dimen.title_tab_title_margin_vertical);
        return layoutParams;
    }

    private LinearLayout.LayoutParams createTitleLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R$dimen.title_tab_title_height));
        layoutParams.gravity = GravityCompat.START;
        return layoutParams;
    }

    @Nullable
    public DivTabsAdapter getDivTabsAdapter() {
        return this.divTabsAdapter;
    }

    @NotNull
    public View getDivider() {
        return this.divider;
    }

    @NotNull
    public ViewPagerFixedSizeLayout getPagerLayout() {
        return this.pagerLayout;
    }

    @NotNull
    public TabTitlesLayoutView<?> getTitleLayout() {
        return this.titleLayout;
    }

    @NotNull
    public ScrollableViewPager getViewPager() {
        return this.viewPager;
    }

    public void setDivTabsAdapter(@Nullable DivTabsAdapter divTabsAdapter) {
        this.divTabsAdapter = divTabsAdapter;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return "android.widget.TabWidget";
    }
}
