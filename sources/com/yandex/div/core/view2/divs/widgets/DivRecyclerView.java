package com.yandex.div.core.view2.divs.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.R$style;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.PagerSnapStartHelper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.List;
import k8.l7;
import k8.td;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p7.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u0005\b\u0010\u0018\u0000 \u0086\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002\u0086\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J*\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b'\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u0010\u001bJ\u0017\u00105\u001a\u00020*2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u000103H\u0017¢\u0006\u0004\b8\u00106J/\u0010=\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ)\u0010F\u001a\u00020*2\u0006\u0010@\u001a\u00020?2\b\u0010C\u001a\u0004\u0018\u00010!2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0016¢\u0006\u0004\bH\u0010\u0013J\u0019\u0010J\u001a\u0004\u0018\u00010!2\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020*H\u0012¢\u0006\u0004\bL\u0010MJ\u0013\u0010O\u001a\u00020\t*\u00020NH\u0012¢\u0006\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bT\u0010RR*\u0010V\u001a\u00020N2\u0006\u0010U\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010]\u001a\u0004\u0018\u00010\\8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010k\u001a\u0004\u0018\u00010j8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020*8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bs\u0010RR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001e\u0010|\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b}\u0010MR\u001e\u0010\u0081\u0001\u001a\u00020*8\u0016@\u0016X\u0096\u000f¢\u0006\r\u001a\u0004\b~\u0010M\"\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0082\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lk8/y0$e;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "velocityX", "velocityY", "", "fling", "(II)Z", "state", "onScrollStateChanged", "(I)V", "dx", "dy", "onScrolled", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", EidRequestBuilder.REQUEST_FIELD_EMAIL, "onTouchEvent", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "release", FirebaseAnalytics.Param.INDEX, "getItemView", "(I)Landroid/view/View;", "canScroll", "()Z", "", "toTouchPoint", "(F)I", "scrollPointerId", "I", "pointTouchX", "pointTouchY", "value", "scrollInterceptionAngle", "F", "getScrollInterceptionAngle", "()F", "setScrollInterceptionAngle", "(F)V", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "onInterceptTouchEventListener", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;)V", "Lk8/td$e;", "scrollMode", "Lk8/td$e;", "getScrollMode", "()Lk8/td$e;", "setScrollMode", "(Lk8/td$e;)V", "Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;", "pagerSnapStartHelper", "Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;", "getPagerSnapStartHelper", "()Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;", "setPagerSnapStartHelper", "(Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;)V", "needFling", "Z", "beforeScrollFocusPosition", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Lk8/y0$e;", "setDiv", "(Lk8/y0$e;)V", "div", "isTransient", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivRecyclerView extends BackHandlingRecyclerView implements DivHolderView<y0.e> {
    private final /* synthetic */ DivHolderViewMixin<y0.e> $$delegate_0;
    private int beforeScrollFocusPosition;
    private boolean needFling;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @Nullable
    private PagerSnapStartHelper pagerSnapStartHelper;
    private int pointTouchX;
    private int pointTouchY;
    private float scrollInterceptionAngle;

    @NotNull
    private td.e scrollMode;
    private int scrollPointerId;

    public /* synthetic */ DivRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private boolean canScroll() {
        return canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1);
    }

    private int toTouchPoint(float f10) {
        return (int) Math.ceil(f10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getBorderDrawer();
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        boolean zFling = super.fling(velocityX, velocityY);
        if (getScrollMode() == td.e.PAGING) {
            this.needFling = !zFling;
        }
        return zFling;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public y0.e getDiv() {
        return (y0.e) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* JADX INFO: renamed from: getDivBorderDrawer */
    public DivBorderDrawer getBorderDrawer() {
        return this.$$delegate_0.getBorderDrawer();
    }

    @Nullable
    public View getItemView(int index) {
        View childAt = getChildAt(index);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
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
    public PagerSnapStartHelper getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    public float getScrollInterceptionAngle() {
        return this.scrollInterceptionAngle;
    }

    @NotNull
    public td.e getScrollMode() {
        return this.scrollMode;
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        int iFindPointerIndex;
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, event) : false) {
            return true;
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            return super.onInterceptTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            this.scrollPointerId = event.getPointerId(0);
            this.pointTouchX = toTouchPoint(event.getX());
            this.pointTouchY = toTouchPoint(event.getY());
            return super.onInterceptTouchEvent(event);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(event);
            }
            this.scrollPointerId = event.getPointerId(actionIndex);
            this.pointTouchX = toTouchPoint(event.getX(actionIndex));
            this.pointTouchY = toTouchPoint(event.getY(actionIndex));
            return super.onInterceptTouchEvent(event);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || (iFindPointerIndex = event.findPointerIndex(this.scrollPointerId)) < 0) {
            return false;
        }
        int touchPoint = toTouchPoint(event.getX(iFindPointerIndex));
        int touchPoint2 = toTouchPoint(event.getY(iFindPointerIndex));
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(event);
        }
        int iAbs = Math.abs(touchPoint - this.pointTouchX);
        int iAbs2 = Math.abs(touchPoint2 - this.pointTouchY);
        if (iAbs == 0 && iAbs2 == 0) {
            return false;
        }
        double dAtan = iAbs != 0 ? (Math.atan(((double) iAbs2) / ((double) iAbs)) * ((double) 180)) / 3.141592653589793d : 90.0d;
        return (layoutManager.canScrollHorizontally() && dAtan <= ((double) getScrollInterceptionAngle())) || (layoutManager.canScrollVertically() && dAtan > ((double) getScrollInterceptionAngle()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int state) {
        if (state == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.beforeScrollFocusPosition = -1;
                return;
            }
            this.beforeScrollFocusPosition = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.beforeScrollFocusPosition
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.getOrientation()
            goto L21
        L15:
            boolean r1 = r0 instanceof com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager
            if (r1 == 0) goto L20
            com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager r0 = (com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager) r0
            int r0 = r0.getOrientation()
            goto L21
        L20:
            r0 = 0
        L21:
            r1 = 1
            if (r0 != r1) goto L2a
            if (r5 <= 0) goto L2a
            int r0 = r3.beforeScrollFocusPosition
        L28:
            int r0 = r0 + r1
            goto L3a
        L2a:
            if (r0 != r1) goto L32
            if (r5 > 0) goto L32
            int r0 = r3.beforeScrollFocusPosition
        L30:
            int r0 = r0 - r1
            goto L3a
        L32:
            if (r4 <= 0) goto L37
            int r0 = r3.beforeScrollFocusPosition
            goto L28
        L37:
            int r0 = r3.beforeScrollFocusPosition
            goto L30
        L3a:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.findViewHolderForAdapterPosition(r0)
            r1 = 0
            if (r0 == 0) goto L44
            android.view.View r0 = r0.itemView
            goto L45
        L44:
            r0 = r1
        L45:
            boolean r2 = r0 instanceof com.yandex.div.core.widget.DivViewWrapper
            if (r2 == 0) goto L4c
            r1 = r0
            com.yandex.div.core.widget.DivViewWrapper r1 = (com.yandex.div.core.widget.DivViewWrapper) r1
        L4c:
            if (r1 == 0) goto L57
            android.view.View r0 = r1.getChild()
            if (r0 == 0) goto L57
            r0.requestFocus()
        L57:
            super.onScrolled(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivRecyclerView.onScrolled(int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        onBoundsChanged(w10, h10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent e10) {
        RecyclerView.LayoutManager layoutManager;
        PagerSnapStartHelper pagerSnapStartHelper;
        View viewFindSnapView;
        int i10;
        td.e scrollMode = getScrollMode();
        td.e eVar = td.e.PAGING;
        if (scrollMode == eVar) {
            this.needFling = true;
        }
        boolean z10 = super.onTouchEvent(e10) && canScroll();
        if (e10 != null && e10.getActionMasked() == 1 && getScrollMode() == eVar && this.needFling && (layoutManager = getLayoutManager()) != null && (pagerSnapStartHelper = getPagerSnapStartHelper()) != null && (viewFindSnapView = pagerSnapStartHelper.findSnapView(layoutManager)) != null) {
            int[] iArrCalculateDistanceToFinalSnap = pagerSnapStartHelper.calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
            if (iArrCalculateDistanceToFinalSnap.length >= 2 && ((i10 = iArrCalculateDistanceToFinalSnap[0]) != 0 || iArrCalculateDistanceToFinalSnap[1] != 0)) {
                smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
            }
        }
        return z10;
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        b.a(this);
        Object adapter = getAdapter();
        if (adapter instanceof Releasable) {
            ((Releasable) adapter).release();
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable l7 border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable y0.e eVar) {
        this.$$delegate_0.setDiv(eVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerSnapStartHelper(@Nullable PagerSnapStartHelper pagerSnapStartHelper) {
        this.pagerSnapStartHelper = pagerSnapStartHelper;
    }

    public void setScrollInterceptionAngle(float f10) {
        this.scrollInterceptionAngle = f10 != 0.0f ? Math.abs(f10) % 90 : 0.0f;
    }

    public void setScrollMode(@NotNull td.e eVar) {
        this.scrollMode = eVar;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(new ContextThemeWrapper(context, R$style.Div_Gallery), attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.scrollPointerId = -1;
        this.scrollMode = td.e.DEFAULT;
        this.beforeScrollFocusPosition = -1;
    }
}
