package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewGroupKt;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$id;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k8.dv;
import k8.y0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001.\b\u0011\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000ej\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015B9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0016J/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0012¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000fH\u0012¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020\u0019H\u0012¢\u0006\u0004\b&\u0010'J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020(H\u0012¢\u0006\u0004\b&\u0010)J/\u0010*\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0012¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,H\u0012¢\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u000fH\u0012¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00102\u001a\u000201H\u0012¢\u0006\u0004\b6\u00107J)\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u00109J\u001f\u0010<\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020,H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b\"\u0010>J'\u0010A\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000f2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u0004\u0018\u00010\u000f2\u0006\u0010:\u001a\u00020%H\u0016¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000ej\u0002`\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010KR \u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020(0L8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b@\u0010MR\u0014\u0010O\u001a\u00020N8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipController;", "", "Lcom/yandex/div/core/DivTooltipRestrictor;", "tooltipRestrictor", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "divVisibilityActionTracker", "Lcom/yandex/div/core/DivPreloader;", "divPreloader", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;", "divTooltipViewBuilder", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "Lkotlin/Function3;", "Landroid/view/View;", "", "Lcom/yandex/div/core/util/SafePopupWindow;", "Lcom/yandex/div/core/tooltip/CreatePopupCall;", "createPopup", "<init>", "(Lcom/yandex/div/core/DivTooltipRestrictor;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/DivPreloader;Lcom/yandex/div/core/view2/errors/ErrorCollectors;Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;Lcom/yandex/div/core/util/AccessibilityStateProvider;Lkotlin/jvm/functions/Function3;)V", "(Lcom/yandex/div/core/DivTooltipRestrictor;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/DivPreloader;Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;Lcom/yandex/div/core/util/AccessibilityStateProvider;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lk8/dv;", "divTooltip", "anchor", "", "multiple", "", "showTooltip", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/dv;Landroid/view/View;Z)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "cancelTooltips", "(Landroid/view/View;)V", "tooltip", "", "dismissTooltip", "(Lk8/dv;)Ljava/lang/String;", "Lcom/yandex/div/core/tooltip/TooltipData;", "(Lcom/yandex/div/core/tooltip/TooltipData;)Ljava/lang/String;", "tryShowTooltip", "(Landroid/view/View;Lk8/dv;Lcom/yandex/div/core/view2/BindingContext;Z)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "com/yandex/div/core/tooltip/DivTooltipController$createOnBackPressCallback$1", "createOnBackPressCallback", "(Lk8/dv;Lcom/yandex/div/core/view2/Div2View;)Lcom/yandex/div/core/tooltip/DivTooltipController$createOnBackPressCallback$1;", "Lk8/y0;", "div", "tooltipView", "startVisibilityTracking", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;Landroid/view/View;)V", "stopVisibilityTracking", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;)V", "tooltipId", "(Ljava/lang/String;Lcom/yandex/div/core/view2/BindingContext;Z)V", "id", "div2View", "hideTooltip", "(Ljava/lang/String;Lcom/yandex/div/core/view2/Div2View;)V", "(Lcom/yandex/div/core/view2/Div2View;)V", "", "tooltips", "mapTooltip", "(Landroid/view/View;Ljava/util/List;)V", "findViewWithTag", "(Ljava/lang/String;)Landroid/view/View;", "Lcom/yandex/div/core/DivTooltipRestrictor;", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "Lcom/yandex/div/core/DivPreloader;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "Lkotlin/jvm/functions/Function3;", "", "Ljava/util/Map;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivTooltipController {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final Function3<View, Integer, Integer, SafePopupWindow> createPopup;

    @NotNull
    private final DivPreloader divPreloader;

    @NotNull
    private final DivTooltipViewBuilder divTooltipViewBuilder;

    @NotNull
    private final DivVisibilityActionTracker divVisibilityActionTracker;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final Handler mainThreadHandler;

    @NotNull
    private final DivTooltipRestrictor tooltipRestrictor;

    @NotNull
    private final Map<String, TooltipData> tooltips;

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public DivTooltipController(@NotNull DivTooltipRestrictor divTooltipRestrictor, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPreloader divPreloader, @NotNull ErrorCollectors errorCollectors, @NotNull DivTooltipViewBuilder divTooltipViewBuilder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull Function3<? super View, ? super Integer, ? super Integer, ? extends SafePopupWindow> function3) {
        this.tooltipRestrictor = divTooltipRestrictor;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.divPreloader = divPreloader;
        this.errorCollectors = errorCollectors;
        this.divTooltipViewBuilder = divTooltipViewBuilder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.createPopup = function3;
        this.tooltips = new LinkedHashMap();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.activity.OnBackPressedCallback, com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1] */
    private C48761 createOnBackPressCallback(final dv divTooltip, final Div2View divView) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (!this.accessibilityStateProvider.isAccessibilityEnabled(divView.getContext())) {
            return null;
        }
        ?? r02 = new OnBackPressedCallback() { // from class: com.yandex.div.core.tooltip.DivTooltipController.createOnBackPressCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                DivTooltipController.this.hideTooltip(divTooltip.f87089g, divView);
            }
        };
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get(divView);
        if (onBackPressedDispatcherOwner != null && (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) != 0) {
            onBackPressedDispatcher.addCallback(r02);
            return r02;
        }
        DivActionTypedUtilsKt.logError(divView, new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
        Assert.fail("Can't find onBackPressedDispatcher to set on back press listener on tooltip.");
        Unit unit = Unit.f93236a;
        return r02;
    }

    private String dismissTooltip(dv tooltip) {
        TooltipData tooltipData = this.tooltips.get(tooltip.f87089g);
        if (tooltipData == null) {
            return null;
        }
        return dismissTooltip(tooltipData);
    }

    public static /* synthetic */ void showTooltip$default(DivTooltipController divTooltipController, String str, BindingContext bindingContext, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        divTooltipController.showTooltip(str, bindingContext, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVisibilityTracking(BindingContext context, y0 div, View tooltipView) {
        stopVisibilityTracking(context, div);
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, context.getDivView(), context.getExpressionResolver(), tooltipView, div, null, null, 48, null);
    }

    private void stopVisibilityTracking(BindingContext context, y0 div) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, context.getDivView(), context.getExpressionResolver(), null, div, null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryShowTooltip(final View anchor, final dv divTooltip, final BindingContext context, final boolean multiple) {
        final ExpressionResolver expressionResolver;
        final y0 y0Var;
        DisplayMetrics displayMetrics;
        int layoutParamsSize$default;
        int layoutParamsSize$default2;
        final DivTooltipContainer divTooltipContainerBuildTooltipView;
        final View tooltipView;
        final Div2View divView = context.getDivView();
        if (this.tooltipRestrictor.canShowTooltip(divView, anchor, divTooltip, multiple) && (tooltipView = (divTooltipContainerBuildTooltipView = this.divTooltipViewBuilder.buildTooltipView(context, (y0Var = divTooltip.f87087e), (layoutParamsSize$default = DivUtilKt.toLayoutParamsSize$default(divTooltip.f87087e.c().getWidth(), (displayMetrics = anchor.getResources().getDisplayMetrics()), (expressionResolver = context.getExpressionResolver()), null, 4, null)), (layoutParamsSize$default2 = DivUtilKt.toLayoutParamsSize$default(divTooltip.f87087e.c().getHeight(), displayMetrics, expressionResolver, null, 4, null)))).getTooltipView()) != null) {
            final SafePopupWindow safePopupWindowInvoke = this.createPopup.invoke(divTooltipContainerBuildTooltipView, Integer.valueOf(layoutParamsSize$default), Integer.valueOf(layoutParamsSize$default2));
            safePopupWindowInvoke.setTouchable(true);
            safePopupWindowInvoke.setOutsideTouchable(DivTooltipControllerKt.shouldDismissByOutsideTouch(divTooltip, expressionResolver));
            if (Build.VERSION.SDK_INT >= 29) {
                safePopupWindowInvoke.setFocusable(true);
                safePopupWindowInvoke.setTouchModal(DivTooltipControllerKt.isModal(divTooltip));
            } else {
                safePopupWindowInvoke.setFocusable(DivTooltipControllerKt.isModal(divTooltip));
            }
            safePopupWindowInvoke.setTouchInterceptor(new PopupWindowTouchListener(safePopupWindowInvoke, tooltipView, DivTooltipControllerKt.isModal(divTooltip), safePopupWindowInvoke.isOutsideTouchable(), divTooltip.f87093k, context));
            DivTooltipAnimationKt.setupAnimation(safePopupWindowInvoke, divTooltip, expressionResolver);
            final TooltipData tooltipData = new TooltipData(divTooltip.f87089g, context, y0Var, safePopupWindowInvoke, null, createOnBackPressCallback(divTooltip, divView), false, 64, null);
            safePopupWindowInvoke.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.yandex.div.core.tooltip.a
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    DivTooltipController.tryShowTooltip$lambda$15(this.f68108b, divTooltip, context, divTooltipContainerBuildTooltipView, divView, anchor, safePopupWindowInvoke, tooltipData);
                }
            });
            this.tooltips.put(divTooltip.f87089g, tooltipData);
            DivPreloader.Ticket ticketPreload = this.divPreloader.preload(y0Var, expressionResolver, new DivPreloader.Callback() { // from class: com.yandex.div.core.tooltip.b
                @Override // com.yandex.div.core.DivPreloader.Callback
                public final void finish(boolean z10) {
                    DivTooltipController.tryShowTooltip$lambda$18(tooltipData, anchor, this, divView, divTooltip, multiple, divTooltipContainerBuildTooltipView, safePopupWindowInvoke, tooltipView, expressionResolver, context, y0Var, z10);
                }
            });
            TooltipData tooltipData2 = this.tooltips.get(divTooltip.f87089g);
            if (tooltipData2 == null) {
                return;
            }
            tooltipData2.setTicket(ticketPreload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$15(DivTooltipController divTooltipController, dv dvVar, BindingContext bindingContext, DivTooltipContainer divTooltipContainer, Div2View div2View, View view, SafePopupWindow safePopupWindow, TooltipData tooltipData) {
        divTooltipController.tooltips.remove(dvVar.f87089g);
        divTooltipController.stopVisibilityTracking(bindingContext, dvVar.f87087e);
        y0 y0Var = divTooltipController.divVisibilityActionTracker.getDivWithWaitingDisappearActions().get(divTooltipContainer);
        if (y0Var != null) {
            divTooltipController.divVisibilityActionTracker.trackDetachedView(bindingContext, divTooltipContainer, y0Var);
        }
        divTooltipController.tooltipRestrictor.getTooltipShownCallback();
        DivTooltipControllerKt.removeBackPressedCallback(safePopupWindow, tooltipData, divTooltipController.accessibilityStateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$18(TooltipData tooltipData, final View view, final DivTooltipController divTooltipController, final Div2View div2View, final dv dvVar, boolean z10, final DivTooltipContainer divTooltipContainer, final SafePopupWindow safePopupWindow, final View view2, final ExpressionResolver expressionResolver, final BindingContext bindingContext, final y0 y0Var, boolean z11) {
        if (z11 || tooltipData.getDismissed() || !view.isAttachedToWindow() || !divTooltipController.tooltipRestrictor.canShowTooltip(div2View, view, dvVar, z10)) {
            return;
        }
        if (!ViewsKt.isActuallyLaidOut(divTooltipContainer) || divTooltipContainer.isLayoutRequested()) {
            divTooltipContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view3.removeOnLayoutChangeListener(this);
                    Rect windowFrame = DivTooltipControllerKt.getWindowFrame(div2View);
                    Point pointCalcPopupLocation = DivTooltipControllerKt.calcPopupLocation(view2, view, dvVar, expressionResolver);
                    int iMin = Math.min(view2.getWidth(), windowFrame.width());
                    int iMin2 = Math.min(view2.getHeight(), windowFrame.height());
                    if (iMin < view2.getWidth()) {
                        divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
                    }
                    if (iMin2 < view2.getHeight()) {
                        divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
                    }
                    safePopupWindow.update(pointCalcPopupLocation.x, pointCalcPopupLocation.y, iMin, iMin2);
                    divTooltipController.startVisibilityTracking(bindingContext, y0Var, divTooltipContainer);
                    divTooltipController.tooltipRestrictor.getTooltipShownCallback();
                }
            });
        } else {
            Rect windowFrame = DivTooltipControllerKt.getWindowFrame(div2View);
            Point pointCalcPopupLocation = DivTooltipControllerKt.calcPopupLocation(view2, view, dvVar, expressionResolver);
            int iMin = Math.min(view2.getWidth(), windowFrame.width());
            int iMin2 = Math.min(view2.getHeight(), windowFrame.height());
            if (iMin < view2.getWidth()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
            }
            if (iMin2 < view2.getHeight()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
            }
            safePopupWindow.update(pointCalcPopupLocation.x, pointCalcPopupLocation.y, iMin, iMin2);
            divTooltipController.startVisibilityTracking(bindingContext, y0Var, divTooltipContainer);
            divTooltipController.tooltipRestrictor.getTooltipShownCallback();
        }
        safePopupWindow.showAtLocation(view, 0, 0, 0);
        DivTooltipControllerKt.sendAccessibilityEventUnchecked(32, view2, divTooltipController.accessibilityStateProvider);
        if (((Number) dvVar.f87088f.evaluate(expressionResolver)).longValue() != 0) {
            divTooltipController.mainThreadHandler.postDelayed(new Runnable() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$postDelayed$default$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.hideTooltip(dvVar.f87089g, div2View);
                }
            }, ((Number) dvVar.f87088f.evaluate(expressionResolver)).longValue());
        }
    }

    public void cancelTooltips(@NotNull Div2View divView) {
        Intrinsics.checkNotNull(divView, "null cannot be cast to non-null type android.view.View");
        cancelTooltips((View) divView);
    }

    @Nullable
    public View findViewWithTag(@NotNull String id2) {
        Set<Map.Entry<String, TooltipData>> setEntrySet = this.tooltips.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            View contentView = ((TooltipData) ((Map.Entry) it.next()).getValue()).getPopupWindow().getContentView();
            if (contentView != null) {
                arrayList.add(contentView);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View viewFindViewWithTag = ((View) it2.next()).findViewWithTag(id2);
            if (viewFindViewWithTag != null) {
                return viewFindViewWithTag;
            }
        }
        return null;
    }

    public void hideTooltip(@NotNull String id2, @NotNull Div2View div2View) {
        SafePopupWindow popupWindow;
        TooltipData tooltipData = this.tooltips.get(id2);
        if (tooltipData == null || (popupWindow = tooltipData.getPopupWindow()) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public void mapTooltip(@NotNull View view, @Nullable List<dv> tooltips) {
        view.setTag(R$id.div_tooltips_tag, tooltips);
    }

    public void showTooltip(@NotNull String tooltipId, @NotNull BindingContext context, boolean multiple) {
        Unit unit;
        Pair pairFindChildWithTooltip = DivTooltipControllerKt.findChildWithTooltip(tooltipId, context.getDivView());
        if (pairFindChildWithTooltip != null) {
            showTooltip(context, (dv) pairFindChildWithTooltip.component1(), (View) pairFindChildWithTooltip.component2(), multiple);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            DivActionTypedUtilsKt.logError(context.getDivView(), new IllegalStateException("Unable to find view for tooltip '" + tooltipId + '\''));
        }
    }

    private void cancelTooltips(View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strDismissTooltip = dismissTooltip((dv) it.next());
                if (strDismissTooltip != null) {
                    arrayList.add(strDismissTooltip);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.tooltips.remove((String) it2.next());
            }
        }
        if (view instanceof ViewGroup) {
            Iterator it3 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it3.hasNext()) {
                cancelTooltips((View) it3.next());
            }
        }
    }

    private String dismissTooltip(TooltipData tooltip) {
        tooltip.setDismissed(true);
        DivPreloader.Ticket ticket = tooltip.getTicket();
        if (ticket != null) {
            ticket.cancel();
        }
        if (tooltip.getPopupWindow().isShowing()) {
            DivTooltipAnimationKt.clearAnimation(tooltip.getPopupWindow());
            tooltip.getPopupWindow().dismiss();
            return null;
        }
        stopVisibilityTracking(tooltip.getBindingContext(), tooltip.getDiv());
        return tooltip.getId();
    }

    private void showTooltip(final BindingContext context, final dv divTooltip, View anchor, final boolean multiple) {
        final View view;
        if (this.tooltips.containsKey(divTooltip.f87089g)) {
            return;
        }
        if (ViewsKt.isActuallyLaidOut(anchor) && !anchor.isLayoutRequested()) {
            tryShowTooltip(anchor, divTooltip, context, multiple);
            view = anchor;
        } else {
            view = anchor;
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$showTooltip$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    this.this$0.tryShowTooltip(view, divTooltip, context, multiple);
                }
            });
        }
        if (ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            return;
        }
        view.requestLayout();
    }

    public DivTooltipController(@NotNull DivTooltipRestrictor divTooltipRestrictor, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPreloader divPreloader, @NotNull DivTooltipViewBuilder divTooltipViewBuilder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull ErrorCollectors errorCollectors) {
        this(divTooltipRestrictor, divVisibilityActionTracker, divPreloader, errorCollectors, divTooltipViewBuilder, accessibilityStateProvider, new Function3<View, Integer, Integer, SafePopupWindow>() { // from class: com.yandex.div.core.tooltip.DivTooltipController.1
            @NotNull
            public final SafePopupWindow invoke(@NotNull View view, int i10, int i11) {
                return new DivTooltipWindow(view, i10, i11, false, 8, null);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SafePopupWindow invoke(View view, Integer num, Integer num2) {
                return invoke(view, num.intValue(), num2.intValue());
            }
        });
    }
}
