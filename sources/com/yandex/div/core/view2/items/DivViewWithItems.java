package com.yandex.div.core.view2.items;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import k8.jp;
import k8.td;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 !2\u00020\u0001:\u0005!\"#$%B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001a\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0004&'()¨\u0006*"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems;", "", "<init>", "()V", "", "value", "Lk8/jp;", "sizeUnit", "", "animated", "", "scrollTo", "(ILk8/jp;Z)V", "scrollToTheEnd", "(Z)V", FirebaseAnalytics.Param.INDEX, "setCurrentItemNoAnimation", "(I)V", "scrollRange", "I", "getScrollRange", "()I", "scrollOffset", "getScrollOffset", "getCurrentItem", "setCurrentItem", "currentItem", "getItemCount", "itemCount", "Landroid/util/DisplayMetrics;", "getMetrics", "()Landroid/util/DisplayMetrics;", "metrics", y.f66058y, "Gallery", "Pager", "PagingGallery", "Tabs", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Gallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Pager;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$PagingGallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Tabs;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivViewWithItems {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static DivViewWithItems viewForTests;
    private final int scrollOffset;
    private final int scrollRange;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Companion;", "", "<init>", "()V", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "<set-?>", "viewForTests", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "getViewForTests$div_release", "()Lcom/yandex/div/core/view2/items/DivViewWithItems;", "setViewForTests$div_release", "(Lcom/yandex/div/core/view2/items/DivViewWithItems;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[td.e.values().length];
                try {
                    iArr[td.e.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[td.e.PAGING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final DivViewWithItems getViewForTests$div_release() {
            return DivViewWithItems.viewForTests;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\"\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0015R\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0014\u0010'\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001f¨\u0006("}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Gallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/items/Direction;", "direction", "<init>", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lcom/yandex/div/core/view2/items/Direction;)V", "", "value", "Lk8/jp;", "sizeUnit", "", "animated", "", "scrollTo", "(ILk8/jp;Z)V", "scrollToTheEnd", "(Z)V", FirebaseAnalytics.Param.INDEX, "setCurrentItemNoAnimation", "(I)V", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/items/Direction;", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "metrics", "Landroid/util/DisplayMetrics;", "getMetrics", "()Landroid/util/DisplayMetrics;", "getCurrentItem", "()I", "setCurrentItem", "currentItem", "getItemCount", "itemCount", "getScrollRange", "scrollRange", "getScrollOffset", "scrollOffset", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Gallery extends DivViewWithItems {

        @NotNull
        private final Direction direction;
        private final DisplayMetrics metrics;

        @NotNull
        private final DivRecyclerView view;

        public Gallery(@NotNull DivRecyclerView divRecyclerView, @NotNull Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return DivViewWithItemsKt.currentItem(this.view, this.direction);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            return DivViewWithItemsKt.getItemCount(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            return DivViewWithItemsKt.scrollOffset(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            return DivViewWithItemsKt.scrollRange(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int value, @NotNull jp sizeUnit, boolean animated) {
            DivViewWithItemsKt.scrollTo(this.view, value, sizeUnit, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                final Context context = this.view.getContext();
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) { // from class: com.yandex.div.core.view2.items.DivViewWithItems$Gallery$currentItem$1$smoothScroller$1
                    private final float MILLISECONDS_PER_INCH = 50.0f;

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
                        return this.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected int getHorizontalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected int getVerticalSnapPreference() {
                        return -1;
                    }
                };
                linearSmoothScroller.setTargetPosition(i10);
                RecyclerView.LayoutManager layoutManager = this.view.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(linearSmoothScroller);
                    return;
                }
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.scrollToPosition(index);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Pager;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)V", "value", "", "currentItem", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "itemCount", "getItemCount", "metrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getMetrics", "()Landroid/util/DisplayMetrics;", "scrollToTheEnd", "", "animated", "", "setCurrentItemNoAnimation", FirebaseAnalytics.Param.INDEX, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pager extends DivViewWithItems {
        private final DisplayMetrics metrics;

        @NotNull
        private final DivPagerView view;

        public Pager(@NotNull DivPagerView divPagerView) {
            super(null);
            this.view = divPagerView;
            this.metrics = divPagerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            RecyclerView.Adapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.getViewPager().setCurrentItem(i10, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.getViewPager().setCurrentItem(index, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\"\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0015R\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0014\u0010'\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001f¨\u0006("}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$PagingGallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/items/Direction;", "direction", "<init>", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lcom/yandex/div/core/view2/items/Direction;)V", "", "value", "Lk8/jp;", "sizeUnit", "", "animated", "", "scrollTo", "(ILk8/jp;Z)V", "scrollToTheEnd", "(Z)V", FirebaseAnalytics.Param.INDEX, "setCurrentItemNoAnimation", "(I)V", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/items/Direction;", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "metrics", "Landroid/util/DisplayMetrics;", "getMetrics", "()Landroid/util/DisplayMetrics;", "getCurrentItem", "()I", "setCurrentItem", "currentItem", "getItemCount", "itemCount", "getScrollRange", "scrollRange", "getScrollOffset", "scrollOffset", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PagingGallery extends DivViewWithItems {

        @NotNull
        private final Direction direction;
        private final DisplayMetrics metrics;

        @NotNull
        private final DivRecyclerView view;

        public PagingGallery(@NotNull DivRecyclerView divRecyclerView, @NotNull Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return DivViewWithItemsKt.currentItem(this.view, this.direction);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            return DivViewWithItemsKt.getItemCount(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            return DivViewWithItemsKt.scrollOffset(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            return DivViewWithItemsKt.scrollRange(this.view);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int value, @NotNull jp sizeUnit, boolean animated) {
            DivViewWithItemsKt.scrollTo(this.view, value, sizeUnit, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.smoothScrollToPosition(i10);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.scrollToPosition(index);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Tabs;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;", "(Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;)V", "value", "", "currentItem", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "itemCount", "getItemCount", "metrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getMetrics", "()Landroid/util/DisplayMetrics;", "scrollToTheEnd", "", "animated", "", "setCurrentItemNoAnimation", FirebaseAnalytics.Param.INDEX, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Tabs extends DivViewWithItems {
        private final DisplayMetrics metrics;

        @NotNull
        private final DivTabsLayout view;

        public Tabs(@NotNull DivTabsLayout divTabsLayout) {
            super(null);
            this.view = divTabsLayout;
            this.metrics = divTabsLayout.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            PagerAdapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i10) {
            int itemCount = getItemCount();
            if (i10 >= 0 && i10 < itemCount) {
                this.view.getViewPager().setCurrentItem(i10, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i10 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.getViewPager().setCurrentItem(index, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    public /* synthetic */ DivViewWithItems(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void scrollTo$default(DivViewWithItems divViewWithItems, int i10, jp jpVar, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollTo");
        }
        if ((i11 & 2) != 0) {
            jpVar = jp.PX;
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        divViewWithItems.scrollTo(i10, jpVar, z10);
    }

    public abstract int getCurrentItem();

    public abstract int getItemCount();

    @NotNull
    public abstract DisplayMetrics getMetrics();

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public int getScrollRange() {
        return this.scrollRange;
    }

    public abstract void scrollToTheEnd(boolean animated);

    public abstract void setCurrentItem(int i10);

    public abstract void setCurrentItemNoAnimation(int index);

    private DivViewWithItems() {
    }

    public void scrollTo(int value, @NotNull jp sizeUnit, boolean animated) {
    }
}
