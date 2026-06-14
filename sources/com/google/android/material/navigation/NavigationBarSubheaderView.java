package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarSubheaderView extends FrameLayout implements NavigationBarMenuItemView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f27057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f27059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MenuItemImpl f27060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f27061f;

    NavigationBarSubheaderView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f27057b = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    private void a() {
        MenuItemImpl menuItemImpl = this.f27060e;
        if (menuItemImpl != null) {
            setVisibility((!menuItemImpl.isVisible() || (!this.f27058c && this.f27059d)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.f27060e;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i10) {
        this.f27060e = menuItemImpl;
        menuItemImpl.setCheckable(false);
        this.f27057b.setText(menuItemImpl.getTitle());
        a();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isExpanded() {
        return this.f27058c;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isOnlyVisibleWhenExpanded() {
        return this.f27059d;
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

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z10) {
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z10) {
        this.f27058c = z10;
        a();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f27059d = z10;
        a();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearance(@StyleRes int i10) {
        TextViewCompat.setTextAppearance(this.f27057b, i10);
        ColorStateList colorStateList = this.f27061f;
        if (colorStateList != null) {
            this.f27057b.setTextColor(colorStateList);
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.f27061f = colorStateList;
        if (colorStateList != null) {
            this.f27057b.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return false;
    }
}
