package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends MenuBuilder {
    public static final int NO_MAX_ITEM_LIMIT = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f27016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27018c;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i10, boolean z10) {
        super(context);
        this.f27016a = cls;
        this.f27017b = i10;
        this.f27018c = z10;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    protected MenuItem addInternal(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.f27017b) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i10, i11, i12, charSequence);
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.f27016a.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f27017b + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i10, int i11, int i12, @NonNull CharSequence charSequence) {
        if (this.f27018c) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i10, i11, i12, charSequence);
            NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(getContext(), this, menuItemImpl);
            menuItemImpl.setSubMenu(navigationBarSubMenu);
            return navigationBarSubMenu;
        }
        throw new UnsupportedOperationException(this.f27016a.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.f27017b;
    }
}
