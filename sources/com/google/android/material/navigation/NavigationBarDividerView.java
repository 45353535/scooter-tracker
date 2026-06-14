package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarDividerView extends FrameLayout implements NavigationBarMenuItemView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f26972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26973d;

    NavigationBarDividerView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_divider, (ViewGroup) this, true);
        updateVisibility();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i10) {
        updateVisibility();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isExpanded() {
        return this.f26971b;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isOnlyVisibleWhenExpanded() {
        return this.f26972c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z10) {
    }

    public void setDividersEnabled(boolean z10) {
        this.f26973d = z10;
        updateVisibility();
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z10) {
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z10) {
        this.f26971b = z10;
        updateVisibility();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f26972c = z10;
        updateVisibility();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return false;
    }

    public void updateVisibility() {
        setVisibility((!this.f26973d || (!this.f26971b && this.f26972c)) ? 8 : 0);
    }
}
