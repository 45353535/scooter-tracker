package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int[] A = {R.attr.state_checked};
    private static final int[] B = {-16842910};
    private static final int C = com.google.android.material.R.style.Widget_Design_NavigationView;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final NavigationMenu f27070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final NavigationMenuPresenter f27071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    OnNavigationItemSelectedListener f27072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f27073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f27074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MenuInflater f27075n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f27076o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f27077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f27078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f27082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f27083v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ShapeableDelegate f27084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final MaterialSideContainerBackHelper f27085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final MaterialBackOrchestrator f27086y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final DrawerLayout.DrawerListener f27087z;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList g(int i10) {
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
        int[] iArr = B;
        return new ColorStateList(new int[][]{iArr, A, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f27075n == null) {
            this.f27075n = new SupportMenuInflater(getContext());
        }
        return this.f27075n;
    }

    private Drawable h(TintTypedArray tintTypedArray) {
        return i(tintTypedArray, MaterialResources.getColorStateList(getContext(), tintTypedArray, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    private Drawable i(TintTypedArray tintTypedArray, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private boolean j(TintTypedArray tintTypedArray) {
        return tintTypedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || tintTypedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (!this.f27082u || this.f27081t == 0) {
            return;
        }
        this.f27081t = 0;
        l(getWidth(), getHeight());
    }

    private void l(int i10, int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.f27081t > 0 || this.f27082u) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z10 = Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).gravity, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.f27081t);
                if (z10) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                this.f27084w.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                this.f27084w.onMaskChanged(this, new RectF(0.0f, 0.0f, i10, i11));
                this.f27084w.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    private Pair m() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void n() {
        this.f27076o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.f27074m);
                boolean z10 = true;
                boolean z11 = NavigationView.this.f27074m[1] == 0;
                NavigationView.this.f27071j.setBehindStatusBar(z11);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z11 && navigationView2.isTopInsetScrimEnabled());
                boolean z12 = NavigationView.this.getLayoutDirection() == 1;
                boolean z13 = NavigationView.this.f27074m[0] == 0 || NavigationView.this.f27074m[0] + NavigationView.this.getWidth() == 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawLeftInsetForeground(z13 && (!z12 ? !navigationView3.isStartInsetScrimEnabled() : !navigationView3.isEndInsetScrimEnabled()));
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z14 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.f27074m[1];
                    boolean z15 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView4 = NavigationView.this;
                    navigationView4.setDrawBottomInsetForeground(z14 && z15 && navigationView4.isBottomInsetScrimEnabled());
                    boolean z16 = currentWindowBounds.width() == NavigationView.this.f27074m[0] || currentWindowBounds.width() - NavigationView.this.getWidth() == NavigationView.this.f27074m[0];
                    NavigationView navigationView5 = NavigationView.this;
                    if (!z16 || (!z12 ? !navigationView5.isEndInsetScrimEnabled() : !navigationView5.isStartInsetScrimEnabled())) {
                        z10 = false;
                    }
                    navigationView5.setDrawRightInsetForeground(z10);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.f27076o);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void a(WindowInsetsCompat windowInsetsCompat) {
        this.f27071j.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    public void addHeaderView(@NonNull View view) {
        this.f27071j.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        m();
        this.f27085x.cancelBackProgress();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f27084w.maybeClip(canvas, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.navigation.d
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                super/*android.widget.FrameLayout*/.dispatchDraw(canvas2);
            }
        });
    }

    @VisibleForTesting
    MaterialSideContainerBackHelper getBackHelper() {
        return this.f27085x;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f27071j.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f27071j.getDividerInsetEnd();
    }

    @Px
    public int getDividerInsetStart() {
        return this.f27071j.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.f27071j.getHeaderCount();
    }

    public View getHeaderView(int i10) {
        return this.f27071j.getHeaderView(i10);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f27071j.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f27071j.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f27071j.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f27071j.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.f27071j.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f27071j.getItemTextColor();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f27071j.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.f27070i;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.f27071j.getSubheaderInsetEnd();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f27071j.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair pairM = m();
        DrawerLayout drawerLayout = (DrawerLayout) pairM.first;
        BackEventCompat backEventCompatOnHandleBackInvoked = this.f27085x.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.closeDrawer(this);
            return;
        }
        this.f27085x.finishBackProgress(backEventCompatOnHandleBackInvoked, ((DrawerLayout.LayoutParams) pairM.second).gravity, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    public View inflateHeaderView(@LayoutRes int i10) {
        return this.f27071j.inflateHeaderView(i10);
    }

    public void inflateMenu(int i10) {
        this.f27071j.setUpdateSuspended(true);
        getMenuInflater().inflate(i10, this.f27070i);
        this.f27071j.setUpdateSuspended(false);
        this.f27071j.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.f27078q;
    }

    public boolean isEndInsetScrimEnabled() {
        return this.f27080s;
    }

    public boolean isStartInsetScrimEnabled() {
        return this.f27079r;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.f27077p;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f27086y.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.removeDrawerListener(this.f27087z);
            drawerLayout.addDrawerListener(this.f27087z);
            if (drawerLayout.isDrawerOpen(this)) {
                this.f27086y.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f27076o);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).removeDrawerListener(this.f27087z);
        }
        this.f27086y.stopListeningForBackCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f27073l), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f27073l, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f27070i.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.f27070i.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        l(i10, i11);
    }

    public void removeHeaderView(@NonNull View view) {
        this.f27071j.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f27078q = z10;
    }

    public void setCheckedItem(@IdRes int i10) {
        MenuItem menuItemFindItem = this.f27070i.findItem(i10);
        if (menuItemFindItem != null) {
            this.f27071j.setCheckedItem((MenuItemImpl) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f27071j.setDividerInsetEnd(i10);
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f27071j.setDividerInsetStart(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setEndInsetScrimEnabled(boolean z10) {
        this.f27080s = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z10) {
        this.f27084w.setForceCompatClippingEnabled(this, z10);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f27071j.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i10) {
        setItemBackground(getContext().getDrawable(i10));
    }

    public void setItemHorizontalPadding(@Dimension int i10) {
        this.f27071j.setItemHorizontalPadding(i10);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i10) {
        this.f27071j.setItemHorizontalPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(@Dimension int i10) {
        this.f27071j.setItemIconPadding(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f27071j.setItemIconPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(@Dimension int i10) {
        this.f27071j.setItemIconSize(i10);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f27071j.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f27071j.setItemMaxLines(i10);
    }

    public void setItemTextAppearance(@StyleRes int i10) {
        this.f27071j.setItemTextAppearance(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f27071j.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f27071j.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@Px int i10) {
        this.f27071j.setItemVerticalPadding(i10);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i10) {
        this.f27071j.setItemVerticalPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f27072k = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        NavigationMenuPresenter navigationMenuPresenter = this.f27071j;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i10);
        }
    }

    public void setStartInsetScrimEnabled(boolean z10) {
        this.f27079r = z10;
    }

    public void setSubheaderInsetEnd(@Px int i10) {
        this.f27071j.setSubheaderInsetEnd(i10);
    }

    public void setSubheaderInsetStart(@Px int i10) {
        this.f27071j.setSubheaderInsetStart(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f27077p = z10;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        m();
        this.f27085x.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        this.f27085x.updateBackProgress(backEventCompat, ((DrawerLayout.LayoutParams) m().second).gravity);
        if (this.f27082u) {
            this.f27081t = AnimationUtils.lerp(0, this.f27083v, this.f27085x.interpolateProgress(backEventCompat.getProgress()));
            l(getWidth(), getHeight());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        @Nullable
        public Bundle menuState;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListG;
        int i11;
        int i12 = C;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i12), attributeSet, i10);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.f27071j = navigationMenuPresenter;
        this.f27074m = new int[2];
        this.f27077p = true;
        this.f27078q = true;
        this.f27079r = true;
        this.f27080s = true;
        this.f27081t = 0;
        this.f27084w = ShapeableDelegate.create(this);
        this.f27085x = new MaterialSideContainerBackHelper(this);
        this.f27086y = new MaterialBackOrchestrator(this);
        this.f27087z = new DrawerLayout.SimpleDrawerListener() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerClosed(@NonNull View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.f27086y.stopListeningForBackCallbacks();
                    NavigationView.this.k();
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerOpened(@NonNull View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    final MaterialBackOrchestrator materialBackOrchestrator = navigationView.f27086y;
                    Objects.requireNonNull(materialBackOrchestrator);
                    view.post(new Runnable() { // from class: com.google.android.material.navigation.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            materialBackOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
                        }
                    });
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.f27070i = navigationMenu;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i10, i12, new int[0]);
        int i13 = com.google.android.material.R.styleable.NavigationView_android_background;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i13)) {
            setBackground(tintTypedArrayObtainTintedStyledAttributes.getDrawable(i13));
        }
        int dimensionPixelSize = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.f27081t = dimensionPixelSize;
        this.f27082u = dimensionPixelSize == 0;
        this.f27083v = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i10, i12).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.NavigationView_elevation)) {
            setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(r2, 0));
        }
        setFitsSystemWindows(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.f27073l = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        int i14 = com.google.android.material.R.styleable.NavigationView_subheaderColor;
        ColorStateList colorStateList = tintTypedArrayObtainTintedStyledAttributes.hasValue(i14) ? tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i14) : null;
        int i15 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance;
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.hasValue(i15) ? tintTypedArrayObtainTintedStyledAttributes.getResourceId(i15, 0) : 0;
        if (resourceId == 0 && colorStateList == null) {
            colorStateList = g(R.attr.textColorSecondary);
        }
        int i16 = com.google.android.material.R.styleable.NavigationView_itemIconTint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i16)) {
            colorStateListG = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i16);
        } else {
            colorStateListG = g(R.attr.textColorSecondary);
        }
        int i17 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance;
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.hasValue(i17) ? tintTypedArrayObtainTintedStyledAttributes.getResourceId(i17, 0) : 0;
        boolean z10 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        int i18 = com.google.android.material.R.styleable.NavigationView_itemIconSize;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
            setItemIconSize(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i18, 0));
        }
        int i19 = com.google.android.material.R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateList2 = tintTypedArrayObtainTintedStyledAttributes.hasValue(i19) ? tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i19) : null;
        if (resourceId2 == 0 && colorStateList2 == null) {
            colorStateList2 = g(R.attr.textColorPrimary);
        }
        Drawable drawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (drawable == null && j(tintTypedArrayObtainTintedStyledAttributes)) {
            drawable = h(tintTypedArrayObtainTintedStyledAttributes);
            ColorStateList colorStateList3 = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateList3 != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList3), null, i(tintTypedArrayObtainTintedStyledAttributes, null)));
            }
        }
        int i20 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i20)) {
            i11 = 0;
            setItemHorizontalPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i20, 0));
        } else {
            i11 = 0;
        }
        int i21 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i21)) {
            setItemVerticalPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i21, i11));
        }
        setDividerInsetStart(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i11));
        setDividerInsetEnd(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i11));
        setSubheaderInsetStart(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i11));
        setSubheaderInsetEnd(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i11));
        setTopInsetScrimEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.f27077p));
        setBottomInsetScrimEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.f27078q));
        setStartInsetScrimEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_startInsetScrimEnabled, this.f27079r));
        setEndInsetScrimEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.NavigationView_endInsetScrimEnabled, this.f27080s));
        int dimensionPixelSize2 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.f27072k;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(resourceId);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateList);
        navigationMenuPresenter.setItemIconTintList(colorStateListG);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (resourceId2 != 0) {
            navigationMenuPresenter.setItemTextAppearance(resourceId2);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z10);
        navigationMenuPresenter.setItemTextColor(colorStateList2);
        navigationMenuPresenter.setItemBackground(drawable);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize2);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i22 = com.google.android.material.R.styleable.NavigationView_menu;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i22)) {
            inflateMenu(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i22, 0));
        }
        int i23 = com.google.android.material.R.styleable.NavigationView_headerLayout;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i23)) {
            inflateHeaderView(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i23, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        n();
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f27070i.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f27071j.setCheckedItem((MenuItemImpl) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
