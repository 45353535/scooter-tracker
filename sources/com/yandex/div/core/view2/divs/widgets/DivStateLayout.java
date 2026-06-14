package com.yandex.div.core.view2.divs.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import java.util.List;
import k8.l7;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001yB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0012J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0012J*\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b'\u0010&J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J/\u00105\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J)\u0010>\u001a\u00020*2\u0006\u00108\u001a\u0002072\b\u0010;\u001a\u0004\u0018\u00010!2\u0006\u0010=\u001a\u00020<H\u0014¢\u0006\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010H\u001a\u00060GR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR0\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u000e\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001e\u0010k\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001c\u0010q\u001a\u00020*8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bn\u0010m\"\u0004\bo\u0010pR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\f0r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0013\u0010x\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006z"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lk8/y0$o;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "direction", "canScrollHorizontally", "(I)Z", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "getPath", "()Lcom/yandex/div/core/state/DivStatePath;", "setPath", "(Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "swipeListener", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "Landroidx/core/view/GestureDetectorCompat;", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "Lkotlin/Function0;", "swipeOutCallback", "Lkotlin/jvm/functions/Function0;", "getSwipeOutCallback", "()Lkotlin/jvm/functions/Function0;", "setSwipeOutCallback", "(Lkotlin/jvm/functions/Function0;)V", "Lk8/y0;", "activeStateDiv", "Lk8/y0;", "getActiveStateDiv$div_release", "()Lk8/y0;", "setActiveStateDiv$div_release", "(Lk8/y0;)V", "Lkotlin/Function1;", "", "variableUpdater", "Lkotlin/jvm/functions/Function1;", "getVariableUpdater", "()Lkotlin/jvm/functions/Function1;", "setVariableUpdater", "(Lkotlin/jvm/functions/Function1;)V", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Lk8/y0$o;", "setDiv", "(Lk8/y0$o;)V", "div", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, "getStateId", "()Ljava/lang/String;", "stateId", "SwipeListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivStateLayout extends FrameContainerLayout implements DivHolderView<y0.o> {
    private final /* synthetic */ DivHolderViewMixin<y0.o> $$delegate_0;

    @Nullable
    private y0 activeStateDiv;

    @NotNull
    private final GestureDetectorCompat gestureDetector;

    @Nullable
    private DivStatePath path;

    @NotNull
    private final SwipeListener swipeListener;

    @Nullable
    private Function0<Unit> swipeOutCallback;

    @Nullable
    private Function1<? super String, Unit> variableUpdater;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;)V", "inScroll", "", "getInScroll", "()Z", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "getView", "()Landroid/view/View;", "canScroll", "v", "x", "", "y", "dir", "", "finishSwipe", "", "onDown", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "distanceY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SwipeListener extends GestureDetector.SimpleOnGestureListener {
        public SwipeListener() {
        }

        private final boolean canScroll(View v10, float x10, float y10, int dir) {
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (x10 >= childAt.getLeft() && x10 < childAt.getRight() && y10 >= childAt.getTop() && y10 < childAt.getBottom() && canScroll(childAt, x10 - childAt.getLeft(), y10 - childAt.getTop(), dir)) {
                        return true;
                    }
                }
            }
            return v10.canScrollHorizontally(dir);
        }

        private final View getView() {
            if (DivStateLayout.this.getChildCount() > 0) {
                return DivStateLayout.this.getChildAt(0);
            }
            return null;
        }

        public final void finishSwipe() {
            float fAbs;
            AnimatorListenerAdapter animatorListenerAdapter;
            float fSignum;
            View view = getView();
            if (view == null) {
                return;
            }
            if (Math.abs(view.getTranslationX()) > view.getWidth() / 2) {
                fAbs = (Math.abs(view.getWidth() - view.getTranslationX()) * 300.0f) / view.getWidth();
                fSignum = Math.signum(view.getTranslationX()) * view.getWidth();
                final DivStateLayout divStateLayout = DivStateLayout.this;
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener$finishSwipe$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        Function0<Unit> swipeOutCallback = divStateLayout.getSwipeOutCallback();
                        if (swipeOutCallback != null) {
                            swipeOutCallback.invoke();
                        }
                    }
                };
            } else {
                fAbs = (Math.abs(view.getTranslationX()) * 300.0f) / view.getWidth();
                animatorListenerAdapter = null;
                fSignum = 0.0f;
            }
            view.animate().cancel();
            view.animate().setDuration((long) MathUtils.clamp(fAbs, 0.0f, 300.0f)).translationX(fSignum).setListener(animatorListenerAdapter).start();
        }

        public final boolean getInScroll() {
            View view = getView();
            return !((view != null ? view.getTranslationX() : 0.0f) == 0.0f);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent e10) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent e12, @NotNull MotionEvent e22, float distanceX, float distanceY) {
            View view = getView();
            if (view == null || e12 == null) {
                return false;
            }
            int iSignum = (int) Math.signum(distanceX);
            if (view.getTranslationX() == 0.0f && Math.abs(distanceX) > 2 * Math.abs(distanceY) && canScroll(view, e12.getX(), e12.getY(), iSignum)) {
                return false;
            }
            view.setTranslationX(MathUtils.clamp(view.getTranslationX() - distanceX, -view.getWidth(), view.getWidth()));
            return !(view.getTranslationX() == 0.0f);
        }
    }

    public /* synthetic */ DivStateLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        if (super.canScrollHorizontally(direction)) {
            return true;
        }
        if (getChildCount() < 1 || this.swipeOutCallback == null) {
            return super.canScrollHorizontally(direction);
        }
        View childAt = getChildAt(0);
        return direction < 0 ? childAt.getTranslationX() <= ((float) childAt.getWidth()) : (-childAt.getTranslationX()) <= ((float) childAt.getWidth());
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
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

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Nullable
    /* JADX INFO: renamed from: getActiveStateDiv$div_release, reason: from getter */
    public final y0 getActiveStateDiv() {
        return this.activeStateDiv;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public y0.o getDiv() {
        return (y0.o) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* JADX INFO: renamed from: getDivBorderDrawer */
    public DivBorderDrawer getBorderDrawer() {
        return this.$$delegate_0.getBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Nullable
    public final DivStatePath getPath() {
        return this.path;
    }

    @Nullable
    public final String getStateId() {
        DivStatePath divStatePath = this.path;
        if (divStatePath != null) {
            return divStatePath.getLastStateId();
        }
        return null;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Nullable
    public final Function0<Unit> getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    @Nullable
    public final Function1<String, Unit> getVariableUpdater() {
        return this.variableUpdater;
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
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.gestureDetector.onTouchEvent(event);
        requestDisallowInterceptTouchEvent(this.swipeListener.getInScroll());
        if (this.swipeListener.getInScroll()) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        onBoundsChanged(w10, h10);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            this.swipeListener.finishSwipe();
        }
        if (this.gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public final void setActiveStateDiv$div_release(@Nullable y0 y0Var) {
        this.activeStateDiv = y0Var;
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
    public void setDiv(@Nullable y0.o oVar) {
        this.$$delegate_0.setDiv(oVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public final void setPath(@Nullable DivStatePath divStatePath) {
        this.path = divStatePath;
    }

    public final void setSwipeOutCallback(@Nullable Function0<Unit> function0) {
        this.swipeOutCallback = function0;
    }

    public final void setVariableUpdater(@Nullable Function1<? super String, Unit> function1) {
        this.variableUpdater = function1;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivStateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        SwipeListener swipeListener = new SwipeListener();
        this.swipeListener = swipeListener;
        this.gestureDetector = new GestureDetectorCompat(context, swipeListener, new Handler(Looper.getMainLooper()));
    }
}
