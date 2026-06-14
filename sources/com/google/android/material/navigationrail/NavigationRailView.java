package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes9.dex */
public class NavigationRailView extends NavigationBarView {
    private static final TimeInterpolator B = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    private NavigationRailFrameLayout A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f27100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f27102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f27103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f27104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f27106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f27107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f27108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f27109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f27118z;

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int iMax = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getNavigationRailMenuView().getChildAt(i10);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
        }
        return iMax;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void i() {
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.A = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(this.f27100h);
        this.A.setScrollingEnabled(this.f27104l);
        this.A.setClipChildren(false);
        this.A.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.A.addView(view);
        if (!this.f27104l) {
            addView(this.A);
            return;
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(this.A);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(scrollView);
    }

    private void j() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.n(navigationRailView.f27107o)) {
                    relativePadding.top += insets.top;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.n(navigationRailView2.f27108p)) {
                    relativePadding.bottom += insets.bottom;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (navigationRailView3.n(navigationRailView3.f27109q)) {
                    if (ViewUtils.isLayoutRtl(view)) {
                        relativePadding.start += Math.max(insets.right, insets2.right);
                    } else {
                        relativePadding.start += Math.max(insets.left, insets2.left);
                    }
                }
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
    }

    private int l(int i10, int i11) {
        int iMin = Math.min(this.f27102j, View.MeasureSpec.getSize(i10));
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            return i10;
        }
        int iMax = Math.max(i11, iMin);
        View view = this.f27106n;
        if (view != null) {
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax, this.f27103k)), 1073741824);
    }

    private int m(int i10) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    private void o() {
        if (isLaidOut()) {
            Transition interpolator = new ChangeBounds().setDuration(500L).setInterpolator(B);
            Transition duration = new Fade().setDuration(100L);
            Transition duration2 = new Fade().setDuration(100L);
            LabelMoveTransition labelMoveTransition = new LabelMoveTransition();
            Transition duration3 = new Fade().setDuration(100L);
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getNavigationRailMenuView().getChildAt(i10);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    interpolator.excludeTarget((View) navigationBarItemView.getLabelGroup(), true);
                    interpolator.excludeTarget((View) navigationBarItemView.getExpandedLabelGroup(), true);
                    if (this.f27110r) {
                        duration2.addTarget(navigationBarItemView.getExpandedLabelGroup());
                        duration.addTarget(navigationBarItemView.getLabelGroup());
                    } else {
                        duration2.addTarget(navigationBarItemView.getLabelGroup());
                        duration.addTarget(navigationBarItemView.getExpandedLabelGroup());
                    }
                    labelMoveTransition.addTarget(navigationBarItemView.getExpandedLabelGroup());
                }
                duration3.addTarget(childAt);
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(interpolator).addTransition(duration).addTransition(labelMoveTransition);
            if (!this.f27110r) {
                transitionSet.addTransition(duration3);
            }
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setOrdering(0);
            transitionSet2.addTransition(duration2);
            if (this.f27110r) {
                transitionSet2.addTransition(duration3);
            }
            TransitionSet transitionSet3 = new TransitionSet();
            transitionSet3.setOrdering(1);
            transitionSet3.addTransition(transitionSet2).addTransition(transitionSet);
            TransitionManager.beginDelayedTransition((ViewGroup) getParent(), transitionSet3);
        }
    }

    private void setExpanded(boolean z10) {
        if (this.f27110r == z10) {
            return;
        }
        o();
        this.f27110r = z10;
        int i10 = this.f27113u;
        int i11 = this.f27111s;
        int i12 = this.f27112t;
        int i13 = this.f27114v;
        if (z10) {
            i10 = this.f27116x;
            i11 = this.f27118z;
            i12 = this.f27115w;
            i13 = this.f27117y;
        }
        getNavigationRailMenuView().setItemGravity(i13);
        super.setItemIconGravity(i10);
        getNavigationRailMenuView().setItemSpacing(i11);
        getNavigationRailMenuView().setItemMinimumHeight(i12);
        getNavigationRailMenuView().setExpanded(z10);
    }

    public void addHeaderView(@LayoutRes int i10) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this, false));
    }

    public void collapse() {
        if (this.f27110r) {
            setExpanded(false);
            announceForAccessibility(getResources().getString(R.string.nav_rail_collapsed_a11y_label));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected boolean d() {
        return true;
    }

    public void expand() {
        if (this.f27110r) {
            return;
        }
        setExpanded(true);
        announceForAccessibility(getResources().getString(R.string.nav_rail_expanded_a11y_label));
    }

    public int getCollapsedItemMinimumHeight() {
        return this.f27112t;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.f27115w;
    }

    @Nullable
    public View getHeaderView() {
        return this.f27106n;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.f27105m;
    }

    public boolean isExpanded() {
        return this.f27110r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.NavigationBarView
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public NavigationRailMenuView c(Context context) {
        return new NavigationRailMenuView(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iM = m(i10);
        if (this.f27110r) {
            measureChild(getNavigationRailMenuView(), i10, i11);
            View view = this.f27106n;
            if (view != null) {
                measureChild(view, i10, i11);
            }
            iM = l(i10, getMaxChildWidth());
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                getNavigationRailMenuView().updateActiveIndicator(View.MeasureSpec.getSize(iM));
            }
        }
        super.onMeasure(iM, i11);
        if (this.A.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.A, iM, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void removeHeaderView() {
        View view = this.f27106n;
        if (view != null) {
            this.A.removeView(view);
            this.f27106n = null;
        }
    }

    public void setCollapsedItemMinimumHeight(@Px int i10) {
        this.f27112t = i10;
        if (this.f27110r) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setCollapsedItemSpacing(@Px int i10) {
        this.f27111s = i10;
        if (this.f27110r) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i10);
    }

    public void setExpandedItemMinimumHeight(@Px int i10) {
        this.f27115w = i10;
        if (this.f27110r) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i10) {
        this.f27114v = i10;
        this.f27117y = i10;
        super.setItemGravity(i10);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i10) {
        this.f27113u = i10;
        this.f27116x = i10;
        super.setItemIconGravity(i10);
    }

    public void setItemMinimumHeight(@Px int i10) {
        this.f27112t = i10;
        this.f27115w = i10;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setItemSpacing(@Px int i10) {
        this.f27111s = i10;
        this.f27118z = i10;
        getNavigationRailMenuView().setItemSpacing(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.f27105m == z10) {
            return;
        }
        this.f27105m = z10;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z10);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldAddMenuView() {
        return true;
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public void addHeaderView(@NonNull View view) {
        removeHeaderView();
        this.f27106n = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = this.f27101i;
        this.A.addView(view, 0, layoutParams);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f27107o = null;
        this.f27108p = null;
        this.f27109q = null;
        this.f27110r = false;
        this.f27112t = -1;
        this.f27113u = 0;
        this.f27114v = 49;
        Context context2 = getContext();
        this.f27118z = getContext().getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_expanded_item_spacing);
        this.f27117y = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        this.f27116x = 1;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationRailView, i10, i11, new int[0]);
        int i12 = R.styleable.NavigationRailView_contentMarginTop;
        Resources resources = getResources();
        int i13 = R.dimen.mtrl_navigation_rail_margin;
        this.f27100h = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i12, resources.getDimensionPixelSize(i13));
        this.f27101i = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationRailView_headerMarginBottom, getResources().getDimensionPixelSize(i13));
        this.f27104l = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationRailView_scrollingEnabled, false);
        setSubmenuDividersEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationRailView_submenuDividersEnabled, false));
        i();
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.NavigationRailView_menuGravity, 49));
        int i14 = R.styleable.NavigationRailView_itemMinHeight;
        int dimensionPixelSize = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i14, -1);
        int dimensionPixelSize2 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i14, -1);
        int i15 = R.styleable.NavigationRailView_collapsedItemMinHeight;
        dimensionPixelSize = tintTypedArrayObtainTintedStyledAttributes.hasValue(i15) ? tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i15, -1) : dimensionPixelSize;
        int i16 = R.styleable.NavigationRailView_expandedItemMinHeight;
        dimensionPixelSize2 = tintTypedArrayObtainTintedStyledAttributes.hasValue(i16) ? tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i16, -1) : dimensionPixelSize2;
        setCollapsedItemMinimumHeight(dimensionPixelSize);
        setExpandedItemMinimumHeight(dimensionPixelSize2);
        this.f27102j = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationRailView_expandedMinWidth, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_min_expanded_width));
        this.f27103k = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationRailView_expandedMaxWidth, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_max_expanded_width));
        int i17 = R.styleable.NavigationRailView_paddingTopSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i17)) {
            this.f27107o = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i17, false));
        }
        int i18 = R.styleable.NavigationRailView_paddingBottomSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
            this.f27108p = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i18, false));
        }
        int i19 = R.styleable.NavigationRailView_paddingStartSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i19)) {
            this.f27109q = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i19, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float fLerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, fLerp);
        float fLerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, fLerp);
        setItemPaddingTop(Math.round(fLerp2));
        setItemPaddingBottom(Math.round(fLerp3));
        setCollapsedItemSpacing(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationRailView_itemSpacing, 0));
        setExpanded(tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.NavigationRailView_expanded, false));
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        j();
    }
}
