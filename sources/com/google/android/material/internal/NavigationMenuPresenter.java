package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuPresenter implements MenuPresenter {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private int A;
    private int B;
    int C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NavigationMenuView f26790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LinearLayout f26791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MenuPresenter.Callback f26792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    MenuBuilder f26793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    NavigationMenuAdapter f26795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    LayoutInflater f26796h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ColorStateList f26798j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f26801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ColorStateList f26802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f26803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    RippleDrawable f26804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f26805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f26806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f26807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f26808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f26809u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f26810v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f26811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f26812x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f26813y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f26797i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f26799k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f26800l = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f26814z = true;
    private int D = -1;
    final View.OnClickListener E = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean zPerformItemAction = navigationMenuPresenter.f26793e.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                NavigationMenuPresenter.this.f26795g.setCheckedItem(itemData);
            } else {
                z10 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z10) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    private static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    private class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayList f26816i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MenuItemImpl f26817j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f26818k;

        NavigationMenuAdapter() {
            h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (NavigationMenuPresenter.this.f26795g.getItemViewType(i12) == 2 || NavigationMenuPresenter.this.f26795g.getItemViewType(i12) == 3) {
                    i11--;
                }
            }
            return i11;
        }

        private void f(int i10, int i11) {
            while (i10 < i11) {
                ((NavigationMenuTextItem) this.f26816i.get(i10)).f26826b = true;
                i10++;
            }
        }

        private void h() {
            if (this.f26818k) {
                return;
            }
            this.f26818k = true;
            this.f26816i.clear();
            this.f26816i.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.f26793e.getVisibleItems().size();
            int i10 = -1;
            boolean z10 = false;
            int size2 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItemImpl menuItemImpl = NavigationMenuPresenter.this.f26793e.getVisibleItems().get(i11);
                if (menuItemImpl.isChecked()) {
                    setCheckedItem(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.setExclusiveCheckable(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.f26816i.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.C, 0));
                        }
                        this.f26816i.add(new NavigationMenuTextItem(menuItemImpl));
                        int size3 = this.f26816i.size();
                        int size4 = subMenu.size();
                        boolean z11 = false;
                        for (int i12 = 0; i12 < size4; i12++) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i12);
                            if (menuItemImpl2.isVisible()) {
                                if (!z11 && menuItemImpl2.getIcon() != null) {
                                    z11 = true;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.setExclusiveCheckable(false);
                                }
                                if (menuItemImpl2.isChecked()) {
                                    setCheckedItem(menuItemImpl2);
                                }
                                this.f26816i.add(new NavigationMenuTextItem(menuItemImpl2));
                            }
                        }
                        if (z11) {
                            f(size3, this.f26816i.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i10) {
                        size2 = this.f26816i.size();
                        z10 = menuItemImpl.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            ArrayList arrayList = this.f26816i;
                            int i13 = NavigationMenuPresenter.this.C;
                            arrayList.add(new NavigationMenuSeparatorItem(i13, i13));
                        }
                    } else if (!z10 && menuItemImpl.getIcon() != null) {
                        f(size2, this.f26816i.size());
                        z10 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(menuItemImpl);
                    navigationMenuTextItem.f26826b = z10;
                    this.f26816i.add(navigationMenuTextItem);
                    i10 = groupId;
                }
            }
            this.f26818k = false;
        }

        private void i(View view, final int i10, final boolean z10) {
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(@NonNull View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(NavigationMenuAdapter.this.e(i10), 1, 1, 1, z10, view2.isSelected()));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            for (int i10 = 0; i10 < this.f26816i.size(); i10++) {
                if (this.f26816i.get(i10) instanceof NavigationMenuSeparatorItem) {
                    notifyItemChanged(i10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            for (int i10 = 0; i10 < this.f26816i.size(); i10++) {
                if ((this.f26816i.get(i10) instanceof NavigationMenuTextItem) && getItemViewType(i10) == 1) {
                    notifyItemChanged(i10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l() {
            for (int i10 = 0; i10 < this.f26816i.size(); i10++) {
                if ((this.f26816i.get(i10) instanceof NavigationMenuTextItem) && getItemViewType(i10) == 0) {
                    notifyItemChanged(i10);
                }
            }
        }

        @NonNull
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.f26817j;
            if (menuItemImpl != null) {
                bundle.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f26816i.size();
            for (int i10 = 0; i10 < size; i10++) {
                NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.f26816i.get(i10);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    MenuItemImpl menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        int g() {
            int i10 = 0;
            for (int i11 = 0; i11 < NavigationMenuPresenter.this.f26795g.getItemCount(); i11++) {
                int itemViewType = NavigationMenuPresenter.this.f26795g.getItemViewType(i11);
                if (itemViewType == 0 || itemViewType == 1) {
                    i10++;
                }
            }
            return i10;
        }

        public MenuItemImpl getCheckedItem() {
            return this.f26817j;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f26816i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.f26816i.get(i10);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public void restoreInstanceState(@NonNull Bundle bundle) {
            MenuItemImpl menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl menuItem2;
            int i10 = bundle.getInt("android:menu:checked", 0);
            if (i10 != 0) {
                this.f26818k = true;
                int size = this.f26816i.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.f26816i.get(i11);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i10) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i11++;
                }
                this.f26818k = false;
                h();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f26816i.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    NavigationMenuItem navigationMenuItem2 = (NavigationMenuItem) this.f26816i.get(i12);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
            if (this.f26817j == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            MenuItemImpl menuItemImpl2 = this.f26817j;
            if (menuItemImpl2 != null) {
                menuItemImpl2.setChecked(false);
            }
            this.f26817j = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        public void setUpdateSuspended(boolean z10) {
            this.f26818k = z10;
        }

        public void update() {
            int size = this.f26816i.size();
            h();
            notifyDataSetChanged();
            if (size == this.f26816i.size()) {
                notifyItemRangeChanged(0, this.f26816i.size());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.f26816i.get(i10);
                    viewHolder.itemView.setPaddingRelative(NavigationMenuPresenter.this.f26809u, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.f26810v, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.f26816i.get(i10)).getMenuItem().getTitle());
                TextViewCompat.setTextAppearance(textView, NavigationMenuPresenter.this.f26797i);
                textView.setPaddingRelative(NavigationMenuPresenter.this.f26811w, textView.getPaddingTop(), NavigationMenuPresenter.this.f26812x, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.f26798j;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                i(textView, i10, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.f26802n);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.f26799k);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.f26801m;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.f26803o;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.f26804p;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.f26816i.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.f26826b);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i11 = navigationMenuPresenter.f26805q;
            int i12 = navigationMenuPresenter.f26806r;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.f26807s);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.f26813y) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.f26808t);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.A);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.f26800l);
            i(navigationMenuItemView, i10, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.f26796h, viewGroup, navigationMenuPresenter.E);
            }
            if (i10 == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.f26796h, viewGroup);
            }
            if (i10 == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.f26796h, viewGroup);
            }
            if (i10 != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.f26791c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }
    }

    private static class NavigationMenuHeaderItem implements NavigationMenuItem {
        NavigationMenuHeaderItem() {
        }
    }

    private interface NavigationMenuItem {
    }

    private static class NavigationMenuSeparatorItem implements NavigationMenuItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26824b;

        public NavigationMenuSeparatorItem(int i10, int i11) {
            this.f26823a = i10;
            this.f26824b = i11;
        }

        public int getPaddingBottom() {
            return this.f26824b;
        }

        public int getPaddingTop() {
            return this.f26823a;
        }
    }

    private static class NavigationMenuTextItem implements NavigationMenuItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItemImpl f26825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f26826b;

        NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
            this.f26825a = menuItemImpl;
        }

        public MenuItemImpl getMenuItem() {
            return this.f26825a;
        }
    }

    private class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(NavigationMenuPresenter.this.f26795g.g(), 1, false));
        }
    }

    private static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private boolean b() {
        return getHeaderCount() > 0;
    }

    private void c() {
        NavigationMenuAdapter navigationMenuAdapter = this.f26795g;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.j();
        }
    }

    private void d() {
        NavigationMenuAdapter navigationMenuAdapter = this.f26795g;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.k();
        }
    }

    private void e() {
        NavigationMenuAdapter navigationMenuAdapter = this.f26795g;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.l();
        }
    }

    private void f() {
        int i10 = (b() || !this.f26814z) ? 0 : this.B;
        NavigationMenuView navigationMenuView = this.f26790b;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(@NonNull View view) {
        this.f26791c.addView(view);
        NavigationMenuView navigationMenuView = this.f26790b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.B != systemWindowInsetTop) {
            this.B = systemWindowInsetTop;
            f();
        }
        NavigationMenuView navigationMenuView = this.f26790b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.f26791c, windowInsetsCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Nullable
    public MenuItemImpl getCheckedItem() {
        return this.f26795g.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f26810v;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f26809u;
    }

    public int getHeaderCount() {
        return this.f26791c.getChildCount();
    }

    public View getHeaderView(int i10) {
        return this.f26791c.getChildAt(i10);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f26794f;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f26803o;
    }

    public int getItemHorizontalPadding() {
        return this.f26805q;
    }

    public int getItemIconPadding() {
        return this.f26807s;
    }

    public int getItemMaxLines() {
        return this.A;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f26801m;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.f26802n;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f26806r;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f26790b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f26796h.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f26790b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.f26790b));
            if (this.f26795g == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.f26795g = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i10 = this.D;
            if (i10 != -1) {
                this.f26790b.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.f26796h.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f26790b, false);
            this.f26791c = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.f26790b.setAdapter(this.f26795g);
        }
        return this.f26790b;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.f26812x;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f26811w;
    }

    public View inflateHeaderView(@LayoutRes int i10) {
        View viewInflate = this.f26796h.inflate(i10, (ViewGroup) this.f26791c, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f26796h = LayoutInflater.from(context);
        this.f26793e = menuBuilder;
        this.C = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.f26814z;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        MenuPresenter.Callback callback = this.f26792d;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f26790b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f26795g.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f26791c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f26790b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f26790b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.f26795g;
        if (navigationMenuAdapter != null) {
            bundle.putBundle("android:menu:adapter", navigationMenuAdapter.createInstanceState());
        }
        if (this.f26791c != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f26791c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void removeHeaderView(@NonNull View view) {
        this.f26791c.removeView(view);
        if (b()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.f26790b;
        navigationMenuView.setPadding(0, this.B, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z10) {
        if (this.f26814z != z10) {
            this.f26814z = z10;
            f();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f26792d = callback;
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
        this.f26795g.setCheckedItem(menuItemImpl);
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f26810v = i10;
        c();
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f26809u = i10;
        c();
    }

    public void setId(int i10) {
        this.f26794f = i10;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f26803o = drawable;
        e();
    }

    public void setItemForeground(@Nullable RippleDrawable rippleDrawable) {
        this.f26804p = rippleDrawable;
        e();
    }

    public void setItemHorizontalPadding(int i10) {
        this.f26805q = i10;
        e();
    }

    public void setItemIconPadding(int i10) {
        this.f26807s = i10;
        e();
    }

    public void setItemIconSize(@Dimension int i10) {
        if (this.f26808t != i10) {
            this.f26808t = i10;
            this.f26813y = true;
            e();
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f26802n = colorStateList;
        e();
    }

    public void setItemMaxLines(int i10) {
        this.A = i10;
        e();
    }

    public void setItemTextAppearance(@StyleRes int i10) {
        this.f26799k = i10;
        e();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f26800l = z10;
        e();
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f26801m = colorStateList;
        e();
    }

    public void setItemVerticalPadding(@Px int i10) {
        this.f26806r = i10;
        e();
    }

    public void setOverScrollMode(int i10) {
        this.D = i10;
        NavigationMenuView navigationMenuView = this.f26790b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void setSubheaderColor(@Nullable ColorStateList colorStateList) {
        this.f26798j = colorStateList;
        d();
    }

    public void setSubheaderInsetEnd(@Px int i10) {
        this.f26812x = i10;
        d();
    }

    public void setSubheaderInsetStart(@Px int i10) {
        this.f26811w = i10;
        d();
    }

    public void setSubheaderTextAppearance(@StyleRes int i10) {
        this.f26797i = i10;
        d();
    }

    public void setUpdateSuspended(boolean z10) {
        NavigationMenuAdapter navigationMenuAdapter = this.f26795g;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z10);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z10) {
        NavigationMenuAdapter navigationMenuAdapter = this.f26795g;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
