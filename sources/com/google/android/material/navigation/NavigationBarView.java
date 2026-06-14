package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int ACTIVE_INDICATOR_WIDTH_MATCH_PARENT = -1;
    public static final int ACTIVE_INDICATOR_WIDTH_WRAP_CONTENT = -2;
    public static final int ITEM_GRAVITY_CENTER = 17;
    public static final int ITEM_GRAVITY_START_CENTER = 8388627;
    public static final int ITEM_GRAVITY_TOP_CENTER = 49;
    public static final int ITEM_ICON_GRAVITY_START = 1;
    public static final int ITEM_ICON_GRAVITY_TOP = 0;
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NavigationBarMenu f27062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NavigationBarMenuView f27063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NavigationBarPresenter f27064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MenuInflater f27065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnItemSelectedListener f27066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OnItemReselectedListener f27067g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ItemGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ItemIconGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
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

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Bundle f27069b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f27069b = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f27069b);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationBarView(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, @androidx.annotation.AttrRes int r13, @androidx.annotation.StyleRes int r14) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f27065e == null) {
            this.f27065e = new SupportMenuInflater(getContext());
        }
        return this.f27065e;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f27063c.setMeasurePaddingFromLabelBaseline(z10);
    }

    protected abstract NavigationBarMenuView c(Context context);

    protected boolean d() {
        return false;
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.f27063c.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public BadgeDrawable getBadge(int i10) {
        return this.f27063c.getBadge(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceActive() {
        return this.f27063c.getHorizontalItemTextAppearanceActive();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceInactive() {
        return this.f27063c.getHorizontalItemTextAppearanceInactive();
    }

    @Px
    public int getIconLabelHorizontalSpacing() {
        return this.f27063c.getIconLabelHorizontalSpacing();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f27063c.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorExpandedHeight() {
        return this.f27063c.getItemActiveIndicatorExpandedHeight();
    }

    @Px
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f27063c.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    @Px
    public int getItemActiveIndicatorExpandedWidth() {
        return this.f27063c.getItemActiveIndicatorExpandedWidth();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f27063c.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f27063c.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f27063c.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f27063c.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f27063c.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f27063c.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f27063c.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f27063c.getItemIconGravity();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f27063c.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f27063c.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f27063c.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.f27063c.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f27063c.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f27063c.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f27063c.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f27063c.getItemTextColor();
    }

    public int getLabelMaxLines(int i10) {
        return this.f27063c.getLabelMaxLines();
    }

    public int getLabelVisibilityMode() {
        return this.f27063c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f27062b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.f27063c;
    }

    @NonNull
    public ViewGroup getMenuViewGroup() {
        return this.f27063c;
    }

    @NonNull
    public BadgeDrawable getOrCreateBadge(int i10) {
        return this.f27063c.f(i10);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f27064d;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f27063c.getScaleLabelTextWithFont();
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f27063c.getSelectedItemId();
    }

    public void inflateMenu(int i10) {
        this.f27064d.setUpdateSuspended(true);
        getMenuInflater().inflate(i10, this.f27062b);
        this.f27064d.setUpdateSuspended(false);
        this.f27064d.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.f27063c.getItemActiveIndicatorEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f27062b.restorePresenterStates(savedState.f27069b);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f27069b = bundle;
        this.f27062b.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i10) {
        this.f27063c.k(i10);
    }

    public void setActiveIndicatorLabelPadding(@Px int i10) {
        this.f27063c.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(@StyleRes int i10) {
        this.f27063c.setHorizontalItemTextAppearanceActive(i10);
    }

    public void setHorizontalItemTextAppearanceInactive(@StyleRes int i10) {
        this.f27063c.setHorizontalItemTextAppearanceInactive(i10);
    }

    public void setIconLabelHorizontalSpacing(@Px int i10) {
        this.f27063c.setIconLabelHorizontalSpacing(i10);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f27063c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f27063c.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(@Px int i10) {
        this.f27063c.setItemActiveIndicatorExpandedHeight(i10);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@Px int i10) {
        this.f27063c.setItemActiveIndicatorExpandedMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorExpandedPadding(@Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        this.f27063c.setItemActiveIndicatorExpandedPadding(i10, i11, i12, i13);
    }

    public void setItemActiveIndicatorExpandedWidth(@Px int i10) {
        this.f27063c.setItemActiveIndicatorExpandedWidth(i10);
    }

    public void setItemActiveIndicatorHeight(@Px int i10) {
        this.f27063c.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i10) {
        this.f27063c.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f27063c.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@Px int i10) {
        this.f27063c.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f27063c.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i10) {
        this.f27063c.setItemBackgroundRes(i10);
    }

    public void setItemGravity(int i10) {
        if (this.f27063c.getItemGravity() != i10) {
            this.f27063c.setItemGravity(i10);
            this.f27064d.updateMenuView(false);
        }
    }

    public void setItemIconGravity(int i10) {
        if (this.f27063c.getItemIconGravity() != i10) {
            this.f27063c.setItemIconGravity(i10);
            this.f27064d.updateMenuView(false);
        }
    }

    public void setItemIconSize(@Dimension int i10) {
        this.f27063c.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(@DimenRes int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f27063c.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i10, @Nullable View.OnTouchListener onTouchListener) {
        this.f27063c.setItemOnTouchListener(i10, onTouchListener);
    }

    public void setItemPaddingBottom(@Px int i10) {
        this.f27063c.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(@Px int i10) {
        this.f27063c.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f27063c.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i10) {
        this.f27063c.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f27063c.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i10) {
        this.f27063c.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f27063c.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f27063c.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i10) {
        this.f27063c.setLabelMaxLines(i10);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f27063c.getLabelVisibilityMode() != i10) {
            this.f27063c.setLabelVisibilityMode(i10);
            this.f27064d.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.f27067g = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.f27066f = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i10) {
        MenuItem menuItemFindItem = this.f27062b.findItem(i10);
        if (menuItemFindItem != null) {
            boolean zPerformItemAction = this.f27062b.performItemAction(menuItemFindItem, this.f27064d, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zPerformItemAction || menuItemFindItem.isChecked()) {
                    this.f27063c.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldAddMenuView() {
        return false;
    }
}
