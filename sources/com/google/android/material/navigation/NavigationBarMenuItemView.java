package com.google.android.material.navigation;

import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface NavigationBarMenuItemView extends MenuView.ItemView {
    boolean isExpanded();

    boolean isOnlyVisibleWhenExpanded();

    void setExpanded(boolean z10);

    void setOnlyShowWhenExpanded(boolean z10);
}
