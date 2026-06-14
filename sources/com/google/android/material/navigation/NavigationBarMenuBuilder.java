package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarMenuBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MenuBuilder f27019a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27021c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27022d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27023e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27020b = new ArrayList();

    NavigationBarMenuBuilder(MenuBuilder menuBuilder) {
        this.f27019a = menuBuilder;
        refreshItems();
    }

    public int getContentItemCount() {
        return this.f27021c;
    }

    @NonNull
    public MenuItem getItemAt(int i10) {
        return (MenuItem) this.f27020b.get(i10);
    }

    public int getVisibleContentItemCount() {
        return this.f27022d;
    }

    public int getVisibleMainContentItemCount() {
        return this.f27023e;
    }

    public boolean performItemAction(@NonNull MenuItem menuItem, @NonNull MenuPresenter menuPresenter, int i10) {
        return this.f27019a.performItemAction(menuItem, menuPresenter, i10);
    }

    public void refreshItems() {
        this.f27020b.clear();
        this.f27021c = 0;
        this.f27022d = 0;
        this.f27023e = 0;
        for (int i10 = 0; i10 < this.f27019a.size(); i10++) {
            MenuItem item = this.f27019a.getItem(i10);
            if (item.hasSubMenu()) {
                if (!this.f27020b.isEmpty()) {
                    if (!(this.f27020b.get(r3.size() - 1) instanceof DividerMenuItem) && item.isVisible()) {
                        this.f27020b.add(new DividerMenuItem());
                    }
                }
                this.f27020b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i11 = 0; i11 < subMenu.size(); i11++) {
                    MenuItem item2 = subMenu.getItem(i11);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f27020b.add(item2);
                    this.f27021c++;
                    if (item2.isVisible()) {
                        this.f27022d++;
                    }
                }
                this.f27020b.add(new DividerMenuItem());
            } else {
                this.f27020b.add(item);
                this.f27021c++;
                if (item.isVisible()) {
                    this.f27022d++;
                    this.f27023e++;
                }
            }
        }
        if (this.f27020b.isEmpty()) {
            return;
        }
        if (this.f27020b.get(r0.size() - 1) instanceof DividerMenuItem) {
            this.f27020b.remove(r0.size() - 1);
        }
    }

    public int size() {
        return this.f27020b.size();
    }
}
