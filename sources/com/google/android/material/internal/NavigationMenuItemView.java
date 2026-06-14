package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f26777s = {R.attr.state_checked};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f26780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f26781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CheckedTextView f26782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private FrameLayout f26783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MenuItemImpl f26784n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f26785o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f26786p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f26787q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AccessibilityDelegateCompat f26788r;

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        if (c()) {
            this.f26782l.setVisibility(8);
            FrameLayout frameLayout = this.f26783m;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f26783m.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f26782l.setVisibility(0);
        FrameLayout frameLayout2 = this.f26783m;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f26783m.setLayoutParams(layoutParams2);
        }
    }

    private StateListDrawable b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f26777s, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean c() {
        return this.f26784n.getTitle() == null && this.f26784n.getIcon() == null && this.f26784n.getActionView() != null;
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f26783m == null) {
                this.f26783m = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f26783m.removeAllViews();
            this.f26783m.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f26784n;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i10) {
        this.f26784n = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(b());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        MenuItemImpl menuItemImpl = this.f26784n;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f26784n.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26777s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.f26783m;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f26782l.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f26780j != z10) {
            this.f26780j = z10;
            this.f26788r.sendAccessibilityEvent(this.f26782l, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f26782l.setChecked(z10);
        CheckedTextView checkedTextView = this.f26782l;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f26781k) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f26786p) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                drawable.setTintList(this.f26785o);
            }
            int i10 = this.f26778h;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f26779i) {
            if (this.f26787q == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), com.google.android.material.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f26787q = drawable2;
                if (drawable2 != null) {
                    int i11 = this.f26778h;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f26787q;
        }
        this.f26782l.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f26782l.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(@Dimension int i10) {
        this.f26778h = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f26785o = colorStateList;
        this.f26786p = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f26784n;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f26782l.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f26779i = z10;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearance(int i10) {
        TextViewCompat.setTextAppearance(this.f26782l, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f26782l.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.f26782l.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26781k = true;
        AccessibilityDelegateCompat accessibilityDelegateCompat = new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.f26780j);
            }
        };
        this.f26788r = accessibilityDelegateCompat;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.f26782l = checkedTextView;
        ViewCompat.setAccessibilityDelegate(checkedTextView, accessibilityDelegateCompat);
    }

    public void initialize(@NonNull MenuItemImpl menuItemImpl, boolean z10) {
        this.f26781k = z10;
        initialize(menuItemImpl, 0);
    }
}
