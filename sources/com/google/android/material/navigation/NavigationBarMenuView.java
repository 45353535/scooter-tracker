package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int[] f27024a0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int[] f27025b0 = {-16842910};
    private int A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private ShapeAppearanceModel J;
    private boolean K;
    private ColorStateList L;
    private NavigationBarPresenter M;
    private NavigationBarMenuBuilder N;
    private boolean O;
    private boolean P;
    private int Q;
    private int R;
    private boolean S;
    private MenuItem T;
    private int U;
    private boolean V;
    private final Rect W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TransitionSet f27026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View.OnClickListener f27027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Pools.Pool f27028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f27029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private NavigationBarMenuItemView[] f27032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f27035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f27037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ColorStateList f27038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f27044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f27045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final SparseArray f27047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27049y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f27050z;

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f27029e = new SparseArray();
        this.f27033i = -1;
        this.f27034j = -1;
        this.f27047w = new SparseArray();
        this.f27048x = -1;
        this.f27049y = -1;
        this.f27050z = -1;
        this.A = -1;
        this.I = 49;
        this.K = false;
        this.Q = 1;
        this.R = 0;
        this.T = null;
        this.U = 7;
        this.V = false;
        this.W = new Rect();
        this.f27038n = createDefaultColorStateList(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f27026b = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f27026b = autoTransition;
            autoTransition.setOrdering(0);
            autoTransition.excludeTarget(TextView.class, true);
            autoTransition.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            autoTransition.addTransition(new TextScale());
        }
        this.f27027c = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                boolean zPerformItemAction = NavigationBarMenuView.this.N.performItemAction(itemData, NavigationBarMenuView.this.M, 0);
                if (itemData == null || !itemData.isCheckable()) {
                    return;
                }
                if (!zPerformItemAction || itemData.isChecked()) {
                    NavigationBarMenuView.this.setCheckedItem(itemData);
                }
            }
        };
        setImportantForAccessibility(1);
    }

    private Drawable c() {
        if (this.J == null || this.L == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.J);
        materialShapeDrawable.setFillColor(this.L);
        return materialShapeDrawable;
    }

    private NavigationBarItemView d(int i10, MenuItemImpl menuItemImpl, boolean z10, boolean z11) {
        this.M.setUpdateSuspended(true);
        menuItemImpl.setCheckable(true);
        this.M.setUpdateSuspended(false);
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z10);
        newItem.setLabelMaxLines(this.Q);
        newItem.setIconTintList(this.f27035k);
        newItem.setIconSize(this.f27036l);
        newItem.setTextColor(this.f27038n);
        newItem.setTextAppearanceInactive(this.f27039o);
        newItem.setTextAppearanceActive(this.f27040p);
        newItem.setHorizontalTextAppearanceInactive(this.f27041q);
        newItem.setHorizontalTextAppearanceActive(this.f27042r);
        newItem.setTextAppearanceActiveBoldEnabled(this.f27043s);
        newItem.setTextColor(this.f27037m);
        int i11 = this.f27048x;
        if (i11 != -1) {
            newItem.setItemPaddingTop(i11);
        }
        int i12 = this.f27049y;
        if (i12 != -1) {
            newItem.setItemPaddingBottom(i12);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.O);
        newItem.setLabelFontScalingEnabled(this.P);
        int i13 = this.f27050z;
        if (i13 != -1) {
            newItem.setActiveIndicatorLabelPadding(i13);
        }
        int i14 = this.A;
        if (i14 != -1) {
            newItem.setIconLabelHorizontalSpacing(i14);
        }
        newItem.setActiveIndicatorWidth(this.C);
        newItem.setActiveIndicatorHeight(this.D);
        newItem.setActiveIndicatorExpandedWidth(this.E);
        newItem.setActiveIndicatorExpandedHeight(this.F);
        newItem.setActiveIndicatorMarginHorizontal(this.G);
        newItem.setItemGravity(this.I);
        newItem.setActiveIndicatorExpandedPadding(this.W);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.H);
        newItem.setActiveIndicatorDrawable(c());
        newItem.setActiveIndicatorResizeable(this.K);
        newItem.setActiveIndicatorEnabled(this.B);
        Drawable drawable = this.f27044t;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f27046v);
        }
        newItem.setItemRippleColor(this.f27045u);
        newItem.setLabelVisibilityMode(this.f27030f);
        newItem.setItemIconGravity(this.f27031g);
        newItem.setOnlyShowWhenExpanded(z11);
        newItem.setExpanded(this.S);
        newItem.initialize(menuItemImpl, 0);
        newItem.setItemPosition(i10);
        int itemId = menuItemImpl.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f27029e.get(itemId));
        newItem.setOnClickListener(this.f27027c);
        int i15 = this.f27033i;
        if (i15 != 0 && itemId == i15) {
            this.f27034j = i10;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private boolean g() {
        NavigationBarMenuBuilder navigationBarMenuBuilder;
        if (this.f27032h == null || (navigationBarMenuBuilder = this.N) == null || navigationBarMenuBuilder.size() != this.f27032h.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f27032h.length) {
                return true;
            }
            if ((this.N.getItemAt(i10) instanceof DividerMenuItem) && !(this.f27032h[i10] instanceof NavigationBarDividerView)) {
                return false;
            }
            boolean z10 = this.N.getItemAt(i10).hasSubMenu() && !(this.f27032h[i10] instanceof NavigationBarSubheaderView);
            boolean z11 = (this.N.getItemAt(i10).hasSubMenu() || (this.f27032h[i10] instanceof NavigationBarItemView)) ? false : true;
            if (!(this.N.getItemAt(i10) instanceof DividerMenuItem) && (z10 || z11)) {
                break;
            }
            i10++;
        }
        return false;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.U, this.N.getVisibleMainContentItemCount());
    }

    private NavigationBarItemView getNewItem() {
        Pools.Pool pool = this.f27028d;
        NavigationBarItemView navigationBarItemView = pool != null ? (NavigationBarItemView) pool.acquire() : null;
        return navigationBarItemView == null ? e(getContext()) : navigationBarItemView;
    }

    private boolean i(int i10) {
        return i10 != -1;
    }

    private void j() {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr == null || this.f27028d == null) {
            return;
        }
        for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                this.f27028d.release(navigationBarItemView);
                navigationBarItemView.e();
            }
        }
    }

    private void l() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            hashSet.add(Integer.valueOf(this.N.getItemAt(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f27047w.size(); i11++) {
            int iKeyAt = this.f27047w.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f27047w.delete(iKeyAt);
            }
        }
    }

    private void o(int i10) {
        if (i(i10)) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = navigationBarItemView.getId();
        if (i(id2) && (badgeDrawable = (BadgeDrawable) this.f27047w.get(id2)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
        View viewD;
        removeAllViews();
        j();
        this.M.setUpdateSuspended(true);
        this.N.refreshItems();
        this.M.setUpdateSuspended(false);
        int contentItemCount = this.N.getContentItemCount();
        if (contentItemCount == 0) {
            this.f27033i = 0;
            this.f27034j = 0;
            this.f27032h = null;
            this.f27028d = null;
            return;
        }
        if (this.f27028d == null || this.R != contentItemCount) {
            this.R = contentItemCount;
            this.f27028d = new Pools.SynchronizedPool(contentItemCount);
        }
        l();
        int size = this.N.size();
        this.f27032h = new NavigationBarMenuItemView[size];
        boolean zH = h(this.f27030f, getCurrentVisibleContentItemCount());
        int size2 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem itemAt = this.N.getItemAt(i11);
            boolean z10 = itemAt instanceof DividerMenuItem;
            if (z10) {
                NavigationBarDividerView navigationBarDividerView = new NavigationBarDividerView(getContext());
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.V);
                viewD = navigationBarDividerView;
            } else if (itemAt.hasSubMenu()) {
                if (size2 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                int i12 = this.f27042r;
                if (i12 == 0) {
                    i12 = this.f27040p;
                }
                navigationBarSubheaderView.setTextAppearance(i12);
                navigationBarSubheaderView.setTextColor(this.f27037m);
                navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                navigationBarSubheaderView.initialize((MenuItemImpl) itemAt, 0);
                size2 = itemAt.getSubMenu().size();
                viewD = navigationBarSubheaderView;
            } else if (size2 > 0) {
                size2--;
                viewD = d(i11, (MenuItemImpl) itemAt, zH, true);
            } else {
                MenuItemImpl menuItemImpl = (MenuItemImpl) itemAt;
                boolean z11 = i10 >= this.U;
                i10++;
                viewD = d(i11, menuItemImpl, zH, z11);
            }
            if (!z10 && itemAt.isCheckable() && this.f27034j == -1) {
                this.f27034j = i11;
            }
            this.f27032h[i11] = viewD;
            addView(viewD);
        }
        int iMin = Math.min(size - 1, this.f27034j);
        this.f27034j = iMin;
        setCheckedItem(this.f27032h[iMin].getItemData());
    }

    @Nullable
    public ColorStateList createDefaultColorStateList(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f27025b0;
        return new ColorStateList(new int[][]{iArr, f27024a0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    protected abstract NavigationBarItemView e(Context context);

    BadgeDrawable f(int i10) {
        o(i10);
        BadgeDrawable badgeDrawableCreate = (BadgeDrawable) this.f27047w.get(i10);
        if (badgeDrawableCreate == null) {
            badgeDrawableCreate = BadgeDrawable.create(getContext());
            this.f27047w.put(i10, badgeDrawableCreate);
        }
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i10);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.setBadge(badgeDrawableCreate);
        }
        return badgeDrawableCreate;
    }

    @Nullable
    public NavigationBarItemView findItemView(int i10) {
        o(i10);
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr == null) {
            return null;
        }
        for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                if (navigationBarItemView.getId() == i10) {
                    return navigationBarItemView;
                }
            }
        }
        return null;
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.f27050z;
    }

    @Nullable
    public BadgeDrawable getBadge(int i10) {
        return (BadgeDrawable) this.f27047w.get(i10);
    }

    SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f27047w;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.S ? this.N.getVisibleContentItemCount() : getCollapsedVisibleItemCount();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceActive() {
        return this.f27042r;
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceInactive() {
        return this.f27041q;
    }

    @Px
    public int getIconLabelHorizontalSpacing() {
        return this.A;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f27035k;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.L;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.B;
    }

    @Px
    public int getItemActiveIndicatorExpandedHeight() {
        return this.F;
    }

    @Px
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.H;
    }

    @Px
    public int getItemActiveIndicatorExpandedWidth() {
        return this.E;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.D;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.G;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.J;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.C;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null && navigationBarMenuItemViewArr.length > 0) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) navigationBarMenuItemView).getBackground();
                }
            }
        }
        return this.f27044t;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f27046v;
    }

    public int getItemGravity() {
        return this.I;
    }

    public int getItemIconGravity() {
        return this.f27031g;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f27036l;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f27049y;
    }

    @Px
    public int getItemPaddingTop() {
        return this.f27048x;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f27045u;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f27040p;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f27039o;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f27037m;
    }

    public int getLabelMaxLines() {
        return this.Q;
    }

    public int getLabelVisibilityMode() {
        return this.f27030f;
    }

    @Nullable
    protected NavigationBarMenuBuilder getMenu() {
        return this.N;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.P;
    }

    public int getSelectedItemId() {
        return this.f27033i;
    }

    protected int getSelectedItemPosition() {
        return this.f27034j;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    protected boolean h(int i10, int i11) {
        return i10 == -1 ? i11 > 3 : i10 == 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@NonNull MenuBuilder menuBuilder) {
        this.N = new NavigationBarMenuBuilder(menuBuilder);
    }

    public boolean isExpanded() {
        return this.S;
    }

    void k(int i10) {
        o(i10);
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i10);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.m();
        }
        this.f27047w.put(i10, null);
    }

    void m(SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.f27047w.indexOfKey(iKeyAt) < 0) {
                this.f27047w.append(iKeyAt, (BadgeDrawable) sparseArray.get(iKeyAt));
            }
        }
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                    BadgeDrawable badgeDrawable = (BadgeDrawable) this.f27047w.get(navigationBarItemView.getId());
                    if (badgeDrawable != null) {
                        navigationBarItemView.setBadge(badgeDrawable);
                    }
                }
            }
        }
    }

    void n(int i10) {
        int size = this.N.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem itemAt = this.N.getItemAt(i11);
            if (i10 == itemAt.getItemId()) {
                this.f27033i = i10;
                this.f27034j = i11;
                setCheckedItem(itemAt);
                return;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(@Px int i10) {
        this.f27050z = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorLabelPadding(i10);
                }
            }
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        if (this.T == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.T;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.T.setChecked(false);
        }
        menuItem.setChecked(true);
        this.T = menuItem;
    }

    public void setCollapsedMaxItemCount(int i10) {
        this.U = i10;
    }

    public void setExpanded(boolean z10) {
        this.S = z10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                navigationBarMenuItemView.setExpanded(z10);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(@StyleRes int i10) {
        this.f27042r = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(@StyleRes int i10) {
        this.f27041q = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(@Px int i10) {
        this.A = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconLabelHorizontalSpacing(i10);
                }
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f27035k = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.L = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(c());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.B = z10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorEnabled(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(@Px int i10) {
        this.F = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@Px int i10) {
        this.H = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i10, int i11, int i12, int i13) {
        Rect rect = this.W;
        rect.left = i10;
        rect.top = i11;
        rect.right = i12;
        rect.bottom = i13;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedPadding(this.W);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(@Px int i10) {
        this.E = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedWidth(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i10) {
        this.D = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i10) {
        this.G = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorMarginHorizontal(i10);
                }
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.K = z10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorResizeable(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.J = shapeAppearanceModel;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(c());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i10) {
        this.C = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorWidth(i10);
                }
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f27044t = drawable;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f27046v = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(i10);
                }
            }
        }
    }

    public void setItemGravity(int i10) {
        this.I = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemGravity(i10);
                }
            }
        }
    }

    public void setItemIconGravity(int i10) {
        this.f27031g = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemIconGravity(i10);
                }
            }
        }
    }

    public void setItemIconSize(@Dimension int i10) {
        this.f27036l = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconSize(i10);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i10, @Nullable View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f27029e.remove(i10);
        } else {
            this.f27029e.put(i10, onTouchListener);
        }
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if ((navigationBarMenuItemView instanceof NavigationBarItemView) && navigationBarMenuItemView.getItemData() != null && navigationBarMenuItemView.getItemData().getItemId() == i10) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@Px int i10) {
        this.f27049y = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingBottom(this.f27049y);
                }
            }
        }
    }

    public void setItemPaddingTop(@Px int i10) {
        this.f27048x = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingTop(i10);
                }
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f27045u = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i10) {
        this.f27040p = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f27043s = z10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActiveBoldEnabled(z10);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i10) {
        this.f27039o = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f27037m = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.P = z10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelFontScalingEnabled(z10);
                }
            }
        }
    }

    public void setLabelMaxLines(int i10) {
        this.Q = i10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelMaxLines(i10);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f27030f = i10;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z10) {
        this.O = z10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setMeasureBottomPaddingFromLabelBaseline(z10);
                }
            }
        }
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.M = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) navigationBarMenuItemView).setDividersEnabled(z10);
                }
            }
        }
    }

    public void updateActiveIndicator(int i10) {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.f27032h;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).updateActiveIndicatorLayoutParams(i10);
                }
            }
        }
    }

    public void updateMenuView() {
        TransitionSet transitionSet;
        if (this.N == null || this.f27032h == null) {
            return;
        }
        this.M.setUpdateSuspended(true);
        this.N.refreshItems();
        this.M.setUpdateSuspended(false);
        if (!g()) {
            buildMenuView();
            return;
        }
        int i10 = this.f27033i;
        int size = this.N.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem itemAt = this.N.getItemAt(i11);
            if (itemAt.isChecked()) {
                setCheckedItem(itemAt);
                this.f27033i = itemAt.getItemId();
                this.f27034j = i11;
            }
        }
        if (i10 != this.f27033i && (transitionSet = this.f27026b) != null) {
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean zH = h(this.f27030f, getCurrentVisibleContentItemCount());
        for (int i12 = 0; i12 < size; i12++) {
            this.M.setUpdateSuspended(true);
            this.f27032h[i12].setExpanded(this.S);
            NavigationBarMenuItemView navigationBarMenuItemView = this.f27032h[i12];
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                navigationBarItemView.setLabelVisibilityMode(this.f27030f);
                navigationBarItemView.setItemIconGravity(this.f27031g);
                navigationBarItemView.setItemGravity(this.I);
                navigationBarItemView.setShifting(zH);
            }
            if (this.N.getItemAt(i12) instanceof MenuItemImpl) {
                this.f27032h[i12].initialize((MenuItemImpl) this.N.getItemAt(i12), 0);
            }
            this.M.setUpdateSuspended(false);
        }
    }
}
