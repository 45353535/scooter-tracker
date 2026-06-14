package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.BillingClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher;
import com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewPager2Wrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.l7;
import k8.y0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b#*\u0001q\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0004\u0091\u0001\u0092\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J*\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u0013J/\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J)\u00108\u001a\u0002072\u0006\u00101\u001a\u0002002\b\u00104\u001a\u0004\u0018\u00010\"2\u0006\u00106\u001a\u000205H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010\u0013J\u0017\u0010B\u001a\u0002072\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u0004\u0018\u00010\"2\u0006\u0010D\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u0004\u0018\u00010\"2\u0006\u00104\u001a\u00020\"H\u0012¢\u0006\u0004\bG\u0010HR.\u0010J\u001a\u0004\u0018\u00010:2\b\u0010I\u001a\u0004\u0018\u00010:8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010=R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020:0O8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bP\u0010QR.\u0010R\u001a\u0004\u0018\u00010:2\b\u0010I\u001a\u0004\u0018\u00010:8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bR\u0010K\u001a\u0004\bS\u0010M\"\u0004\bT\u0010=R.\u0010V\u001a\u0004\u0018\u00010U2\b\u0010I\u001a\u0004\u0018\u00010U8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R.\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010I\u001a\u0004\u0018\u00010\\8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010k\u001a\u0004\u0018\u00010j8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001d\u0010v\u001a\u0004\u0018\u00010q8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u0002078\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0085\u0001\u001a\u0002078\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0082\u0001\u0010\u0081\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\r0O8\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u008b\u0001\u001a\u0002072\u0006\u0010I\u001a\u0002078P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u0081\u0001\"\u0006\b\u008a\u0001\u0010\u0084\u0001R)\u0010\u0090\u0001\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t8P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lcom/yandex/div/core/widget/ViewPager2Wrapper;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lk8/y0$k;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "enableAccessibility", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "callback", "addChangePageCallbackForIndicators", "(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V", "removeChangePageCallbackForIndicators", "clearChangePageCallbackForIndicators", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", FirebaseAnalytics.Param.INDEX, "getPageView", "(I)Landroid/view/View;", "getWrapperFor", "(Landroid/view/View;)Landroid/view/View;", "value", "changePageCallbackForState", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "getChangePageCallbackForState$div_release", "()Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "setChangePageCallbackForState$div_release", "", "changePageCallbacksForIndicators", "Ljava/util/List;", "changePageCallbackForLogger", "getChangePageCallbackForLogger$div_release", "setChangePageCallbackForLogger$div_release", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "changePageCallbackForOffScreenPages", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "getChangePageCallbackForOffScreenPages$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "setChangePageCallbackForOffScreenPages$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;)V", "Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;", "pagerSelectedActionsDispatcher", "Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;", "getPagerSelectedActionsDispatcher$div_release", "()Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;", "setPagerSelectedActionsDispatcher$div_release", "(Lcom/yandex/div/core/view2/divs/pager/PagerSelectedActionsDispatcher;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;", "pagerOnItemsCountChange", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;", "getPagerOnItemsCountChange$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;", "setPagerOnItemsCountChange$div_release", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;)V", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "onInterceptTouchEventListener", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;)V", "com/yandex/div/core/view2/divs/widgets/DivPagerView$accessibilityDelegate$2$1", "accessibilityDelegate$delegate", "Lkotlin/Lazy;", "getAccessibilityDelegate", "()Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$accessibilityDelegate$2$1;", "accessibilityDelegate", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Lk8/y0$k;", "setDiv", "(Lk8/y0$k;)V", "div", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "getSubscriptions", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, "getClipToPage$div_release", "setClipToPage$div_release", "clipToPage", "getCurrentItem$div_release", "()I", "setCurrentItem$div_release", "(I)V", "currentItem", "OffScreenPagesUpdateCallback", "OnItemsUpdatedCallback", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivPagerView extends ViewPager2Wrapper implements DivHolderView<y0.k> {
    private final /* synthetic */ DivHolderViewMixin<y0.k> $$delegate_0;

    /* JADX INFO: renamed from: accessibilityDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy accessibilityDelegate;

    @Nullable
    private ViewPager2.OnPageChangeCallback changePageCallbackForLogger;

    @Nullable
    private OffScreenPagesUpdateCallback changePageCallbackForOffScreenPages;

    @Nullable
    private ViewPager2.OnPageChangeCallback changePageCallbackForState;

    @NotNull
    private final List<ViewPager2.OnPageChangeCallback> changePageCallbacksForIndicators;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @Nullable
    private OnItemsUpdatedCallback pagerOnItemsCountChange;

    @Nullable
    private PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OffScreenPagesUpdateCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "Landroid/view/View$OnLayoutChangeListener;", "()V", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class OffScreenPagesUpdateCallback extends ViewPager2.OnPageChangeCallback implements View.OnLayoutChangeListener {
        public void onLayoutChange(@Nullable View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView$OnItemsUpdatedCallback;", "", "onItemsUpdated", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnItemsUpdatedCallback {
        void onItemsUpdated();
    }

    public /* synthetic */ DivPagerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private DivPagerView$accessibilityDelegate$2.AnonymousClass1 getAccessibilityDelegate() {
        return (DivPagerView$accessibilityDelegate$2.AnonymousClass1) this.accessibilityDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrapperFor(View child) {
        while (!Intrinsics.areEqual(child, getRecyclerView())) {
            if (child instanceof DivViewWrapper) {
                return child;
            }
            Object parent = child.getParent();
            child = parent instanceof View ? (View) parent : null;
            if (child == null) {
                break;
            }
        }
        return null;
    }

    public void addChangePageCallbackForIndicators(@NotNull ViewPager2.OnPageChangeCallback callback) {
        this.changePageCallbacksForIndicators.add(callback);
        getViewPager().registerOnPageChangeCallback(callback);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    public void clearChangePageCallbackForIndicators() {
        Iterator<T> it = this.changePageCallbacksForIndicators.iterator();
        while (it.hasNext()) {
            getViewPager().unregisterOnPageChangeCallback((ViewPager2.OnPageChangeCallback) it.next());
        }
        this.changePageCallbacksForIndicators.clear();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    public void enableAccessibility() {
        RecyclerView recyclerView;
        DivPagerView$accessibilityDelegate$2.AnonymousClass1 accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Nullable
    /* JADX INFO: renamed from: getChangePageCallbackForLogger$div_release, reason: from getter */
    public ViewPager2.OnPageChangeCallback getChangePageCallbackForLogger() {
        return this.changePageCallbackForLogger;
    }

    @Nullable
    /* JADX INFO: renamed from: getChangePageCallbackForOffScreenPages$div_release, reason: from getter */
    public OffScreenPagesUpdateCallback getChangePageCallbackForOffScreenPages() {
        return this.changePageCallbackForOffScreenPages;
    }

    @Nullable
    /* JADX INFO: renamed from: getChangePageCallbackForState$div_release, reason: from getter */
    public ViewPager2.OnPageChangeCallback getChangePageCallbackForState() {
        return this.changePageCallbackForState;
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public y0.k getDiv() {
        return (y0.k) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Nullable
    public View getPageView(int index) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return null;
        }
        View childAt = recyclerView.getChildAt(index);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    @Nullable
    /* JADX INFO: renamed from: getPagerOnItemsCountChange$div_release, reason: from getter */
    public OnItemsUpdatedCallback getPagerOnItemsCountChange() {
        return this.pagerOnItemsCountChange;
    }

    @Nullable
    /* JADX INFO: renamed from: getPagerSelectedActionsDispatcher$div_release, reason: from getter */
    public PagerSelectedActionsDispatcher getPagerSelectedActionsDispatcher() {
        return this.pagerSelectedActionsDispatcher;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.onBoundsChanged(width, height);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        return (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, event) : false) || super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        onBoundsChanged(w10, h10);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeChangePageCallbackForIndicators(@NotNull ViewPager2.OnPageChangeCallback callback) {
        this.changePageCallbacksForIndicators.remove(callback);
        getViewPager().unregisterOnPageChangeCallback(callback);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable l7 border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    public void setChangePageCallbackForLogger$div_release(@Nullable ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.changePageCallbackForLogger;
        if (onPageChangeCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(onPageChangeCallback2);
        }
        if (onPageChangeCallback != null) {
            getViewPager().registerOnPageChangeCallback(onPageChangeCallback);
        }
        this.changePageCallbackForLogger = onPageChangeCallback;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(@Nullable OffScreenPagesUpdateCallback offScreenPagesUpdateCallback) {
        OffScreenPagesUpdateCallback offScreenPagesUpdateCallback2 = this.changePageCallbackForOffScreenPages;
        if (offScreenPagesUpdateCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(offScreenPagesUpdateCallback2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(offScreenPagesUpdateCallback2);
            }
        }
        if (offScreenPagesUpdateCallback != null) {
            getViewPager().registerOnPageChangeCallback(offScreenPagesUpdateCallback);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(offScreenPagesUpdateCallback);
            }
        }
        this.changePageCallbackForOffScreenPages = offScreenPagesUpdateCallback;
    }

    public void setChangePageCallbackForState$div_release(@Nullable ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.changePageCallbackForState;
        if (onPageChangeCallback2 != null) {
            getViewPager().unregisterOnPageChangeCallback(onPageChangeCallback2);
        }
        if (onPageChangeCallback != null) {
            getViewPager().registerOnPageChangeCallback(onPageChangeCallback);
        }
        this.changePageCallbackForState = onPageChangeCallback;
    }

    public void setClipToPage$div_release(boolean z10) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.setClipChildren(z10);
    }

    public void setCurrentItem$div_release(int i10) {
        getViewPager().setCurrentItem(i10, false);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable y0.k kVar) {
        this.$$delegate_0.setDiv(kVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerOnItemsCountChange$div_release(@Nullable OnItemsUpdatedCallback onItemsUpdatedCallback) {
        this.pagerOnItemsCountChange = onItemsUpdatedCallback;
    }

    public void setPagerSelectedActionsDispatcher$div_release(@Nullable PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher) {
        PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher2 = this.pagerSelectedActionsDispatcher;
        if (pagerSelectedActionsDispatcher2 != null) {
            pagerSelectedActionsDispatcher2.detach(getViewPager());
        }
        if (pagerSelectedActionsDispatcher != null) {
            pagerSelectedActionsDispatcher.attach(getViewPager());
        }
        this.pagerSelectedActionsDispatcher = pagerSelectedActionsDispatcher;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivPagerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.changePageCallbacksForIndicators = new ArrayList();
        this.accessibilityDelegate = i.b(l.f94211d, new Function0<DivPagerView$accessibilityDelegate$2.AnonymousClass1>() { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AnonymousClass1 invoke() {
                RecyclerView recyclerView = this.this$0.getRecyclerView();
                if (recyclerView == null) {
                    return null;
                }
                return new RecyclerViewAccessibilityDelegate(this.this$0) { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2.1
                    final /* synthetic */ DivPagerView this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this.$recycler);
                        this.this$0 = divPagerView;
                    }

                    private final void performActionIfNeeded(View child, AccessibilityEvent event) {
                        View wrapperFor;
                        int childAdapterPosition;
                        if (event.getEventType() != 32768 || (wrapperFor = this.this$0.getWrapperFor(child)) == null || this.this$0.getCurrentItem$div_release() == (childAdapterPosition = this.$recycler.getChildAdapterPosition(wrapperFor)) || childAdapterPosition == -1) {
                            return;
                        }
                        this.$recycler.performAccessibilityAction(childAdapterPosition > this.this$0.getCurrentItem$div_release() ? 4096 : 8192, null);
                    }

                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public boolean onRequestSendAccessibilityEvent(@NotNull ViewGroup host, @NotNull View child, @NotNull AccessibilityEvent event) {
                        performActionIfNeeded(child, event);
                        return super.onRequestSendAccessibilityEvent(host, child, event);
                    }
                };
            }
        });
    }
}
