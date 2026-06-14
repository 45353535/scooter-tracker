package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$id;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.a7;
import k8.bd;
import k8.dv;
import k8.ea;
import k8.f7;
import k8.gx;
import k8.j1;
import k8.tr;
import k8.y0;
import k8.y5;
import k8.yf;
import k8.z5;
import k8.zh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010(\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b&\u0010'J-\u0010*\u001a\u00020\u0015*\u00020\u00102\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b*\u0010+J-\u0010\u001f\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\u001f\u0010,J'\u00100\u001a\u00020\u0015*\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J5\u00102\u001a\u00020\u0015*\u00020\u00102\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b2\u00103J5\u00106\u001a\u00020\u0015*\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b6\u00107J5\u00108\u001a\u00020\u0015*\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b8\u00107J-\u00109\u001a\u00020\u0015*\u00020\u00102\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b9\u0010+JY\u0010C\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\b\u0010<\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020.2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bC\u0010DJ\u0013\u0010E\u001a\u00020\u0015*\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010FJ5\u0010G\u001a\u00020\u0015*\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bG\u00107J5\u0010H\u001a\u00020\u0015*\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bH\u00107J5\u0010I\u001a\u00020\u0015*\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bI\u00107J\u001b\u0010L\u001a\u00020\u0015*\u00020\u00102\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ#\u0010N\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bN\u0010OJA\u0010(\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b(\u0010PJ=\u0010Q\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bQ\u0010RJ;\u0010W\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010S2\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010SH\u0002¢\u0006\u0004\bW\u0010XJ=\u0010Y\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bY\u0010RJ3\u0010\\\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u00105\u001a\u0002042\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J5\u0010^\u001a\u00020\u0015*\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b^\u00107J\u001b\u0010_\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0013\u001a\u00020 H\u0002¢\u0006\u0004\b_\u0010`R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010e¨\u0006f"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;", "divBackgroundBinder", "Lcom/yandex/div/core/tooltip/DivTooltipController;", "tooltipController", "Lcom/yandex/div/core/view2/divs/DivFocusBinder;", "divFocusBinder", "Lcom/yandex/div/core/view2/DivAccessibilityBinder;", "divAccessibilityBinder", "Lcom/yandex/div/core/view2/divs/DivLayoutParamsBinder;", "layoutParamsBinder", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;Lcom/yandex/div/core/tooltip/DivTooltipController;Lcom/yandex/div/core/view2/divs/DivFocusBinder;Lcom/yandex/div/core/view2/DivAccessibilityBinder;Lcom/yandex/div/core/view2/divs/DivLayoutParamsBinder;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/y0;", "div", "oldDiv", "", "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0;Lk8/y0;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", TypedValues.AttributesType.S_TARGET, "", "id", "bindId$div_release", "(Lcom/yandex/div/core/view2/Div2View;Landroid/view/View;Ljava/lang/String;)V", "bindId", "Lk8/f7;", "newDiv", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "Landroid/graphics/drawable/Drawable;", "additionalLayer", "bindBackground$div_release", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/f7;Lk8/f7;Lcom/yandex/div/internal/core/ExpressionSubscriber;Landroid/graphics/drawable/Drawable;)V", "bindBackground", "bindingContext", "bind", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/f7;Lk8/f7;)V", "(Landroid/view/View;Lcom/yandex/div/core/view2/Div2View;Lk8/f7;Lk8/f7;)V", "divId", "", "viewId", "applyId", "(Landroid/view/View;Ljava/lang/String;I)V", "bindLayoutParams", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/f7;Lk8/f7;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "bindMargins", "(Landroid/view/View;Lk8/f7;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "bindAlignment", "bindLayoutProvider", "Landroid/util/DisplayMetrics;", "metrics", "variableName", "Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;", "variablesHolder", "start", "end", "oldStart", "oldEnd", "updateSizeVariable", "(Lcom/yandex/div/core/view2/Div2View;Landroid/util/DisplayMetrics;Ljava/lang/String;Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;IIIILcom/yandex/div/json/expressions/ExpressionResolver;)V", "clearLayoutProviderVariables", "(Landroid/view/View;)V", "bindPaddings", "bindAccessibility", "bindAlpha", "", "alpha", "applyAlpha", "(Landroid/view/View;D)V", "bindBorder", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/f7;)V", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/f7;Lk8/f7;Lcom/yandex/div/internal/core/ExpressionSubscriber;Landroid/graphics/drawable/Drawable;)V", "bindNextFocus", "(Landroid/view/View;Lcom/yandex/div/core/view2/Div2View;Lk8/f7;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "", "Lk8/j1;", "onFocus", "onBlur", "bindFocusActions", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Ljava/util/List;Ljava/util/List;)V", "bindVisibility", "", "firstApply", "applyVisibility", "(Landroid/view/View;Lcom/yandex/div/core/view2/Div2View;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Z)V", "bindTransform", "applyFocusableState", "(Landroid/view/View;Lk8/f7;)V", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;", "Lcom/yandex/div/core/tooltip/DivTooltipController;", "Lcom/yandex/div/core/view2/divs/DivFocusBinder;", "Lcom/yandex/div/core/view2/DivAccessibilityBinder;", "Lcom/yandex/div/core/view2/divs/DivLayoutParamsBinder;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivBaseBinder {

    @NotNull
    private final DivAccessibilityBinder divAccessibilityBinder;

    @NotNull
    private final DivBackgroundBinder divBackgroundBinder;

    @NotNull
    private final DivFocusBinder divFocusBinder;

    @NotNull
    private final DivLayoutParamsBinder layoutParamsBinder;

    @NotNull
    private final DivTooltipController tooltipController;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gx.values().length];
            try {
                iArr[gx.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gx.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gx.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivBaseBinder(@NotNull DivBackgroundBinder divBackgroundBinder, @NotNull DivTooltipController divTooltipController, @NotNull DivFocusBinder divFocusBinder, @NotNull DivAccessibilityBinder divAccessibilityBinder, @NotNull DivLayoutParamsBinder divLayoutParamsBinder) {
        this.divBackgroundBinder = divBackgroundBinder;
        this.tooltipController = divTooltipController;
        this.divFocusBinder = divFocusBinder;
        this.divAccessibilityBinder = divAccessibilityBinder;
        this.layoutParamsBinder = divLayoutParamsBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applyAlpha(View view, double d10) {
        view.setAlpha((float) d10);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports != null) {
            divBorderSupports.invalidateBorder();
        }
    }

    private final void applyFocusableState(View view, f7 f7Var) {
        if ((f7Var instanceof yf) || (f7Var instanceof tr)) {
            return;
        }
        view.setFocusable(f7Var.n() != null);
    }

    private final void applyId(View view, String str, int i10) {
        view.setTag(str);
        view.setId(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyVisibility(View view, Div2View div2View, f7 f7Var, ExpressionResolver expressionResolver, boolean z10) {
        int i10;
        DivTransitionHandler divTransitionHandler = div2View.getDivTransitionHandler();
        int i11 = WhenMappings.$EnumSwitchMapping$0[((gx) f7Var.getVisibility().evaluate(expressionResolver)).ordinal()];
        if (i11 == 1) {
            i10 = 0;
        } else if (i11 == 2) {
            i10 = 4;
        } else {
            if (i11 != 3) {
                throw new m();
            }
            i10 = 8;
        }
        if (i10 != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List listL = f7Var.l();
        Transition transitionCreateAndroidTransition = null;
        if (listL == null || DivTransitionsKt.allowsTransitionsOnVisibilityChange(listL)) {
            DivTransitionHandler.ChangeType.Visibility lastChange = divTransitionHandler.getLastChange(view);
            if (lastChange != null) {
                visibility = lastChange.getNew();
            }
            DivTransitionBuilder transitionBuilder = div2View.getViewComponent().getTransitionBuilder();
            if ((visibility == 4 || visibility == 8) && i10 == 0) {
                transitionCreateAndroidTransition = transitionBuilder.createAndroidTransition(f7Var.v(), 1, expressionResolver);
            } else if ((i10 == 4 || i10 == 8) && visibility == 0 && !z10) {
                transitionCreateAndroidTransition = transitionBuilder.createAndroidTransition(f7Var.i(), 2, expressionResolver);
            } else if (lastChange != null) {
                TransitionManager.endTransitions(div2View);
            }
            if (transitionCreateAndroidTransition != null) {
                transitionCreateAndroidTransition.addTarget(view);
            }
        }
        if (transitionCreateAndroidTransition != null) {
            divTransitionHandler.putTransition(transitionCreateAndroidTransition, view, new DivTransitionHandler.ChangeType.Visibility(i10));
        } else {
            view.setVisibility(i10);
        }
        div2View.trackChildrenVisibility();
    }

    private final void bind(View view, BindingContext bindingContext, f7 f7Var, f7 f7Var2) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Div2View divView = bindingContext.getDivView();
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(view);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
        bindId(view, divView, f7Var, f7Var2);
        bindLayoutParams(view, bindingContext, f7Var, f7Var2, expressionSubscriber);
        bindMargins(view, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        bindAlignment(view, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        bindLayoutProvider(view, bindingContext, f7Var, f7Var2);
        bindAccessibility(view, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        bindAlpha(view, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        bindBackground$default(this, view, bindingContext, f7Var, f7Var2, expressionSubscriber, null, 16, null);
        bindBorder(view, bindingContext, f7Var);
        bindPaddings(view, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        bindNextFocus(view, divView, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        bd bdVarN = f7Var.n();
        List<j1> list = bdVarN != null ? bdVarN.f86509e : null;
        bd bdVarN2 = f7Var.n();
        bindFocusActions(view, bindingContext, list, bdVarN2 != null ? bdVarN2.f86508d : null);
        bindVisibility(view, divView, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        bindTransform(view, f7Var, f7Var2, expressionResolver, expressionSubscriber);
        List<dv> listH = f7Var.h();
        if (listH != null) {
            this.tooltipController.mapTooltip(view, listH);
        }
        applyFocusableState(view, f7Var);
    }

    private final void bindAccessibility(View view, f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        this.divAccessibilityBinder.bind(view, f7Var, f7Var2, expressionResolver, expressionSubscriber);
    }

    private final void bindAlignment(final View view, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(f7Var.g(), f7Var2 != null ? f7Var2.g() : null)) {
            if (ExpressionsKt.equalsToConstant(f7Var.m(), f7Var2 != null ? f7Var2.m() : null)) {
                return;
            }
        }
        Expression expressionG = f7Var.g();
        y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
        Expression expressionM = f7Var.m();
        BaseDivViewExtensionsKt.applyAlignment(view, y5Var, expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(f7Var.g()) && ExpressionsKt.isConstantOrNull(f7Var.m())) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                View view2 = view;
                Expression expressionG2 = f7Var.g();
                y5 y5Var2 = expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver) : null;
                Expression expressionM2 = f7Var.m();
                BaseDivViewExtensionsKt.applyAlignment(view2, y5Var2, expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver) : null);
            }
        };
        Expression expressionG2 = f7Var.g();
        expressionSubscriber.addSubscription(expressionG2 != null ? expressionG2.observe(expressionResolver, function1) : null);
        Expression expressionM2 = f7Var.m();
        expressionSubscriber.addSubscription(expressionM2 != null ? expressionM2.observe(expressionResolver, function1) : null);
    }

    private final void bindAlpha(final View view, f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(f7Var.getAlpha(), f7Var2 != null ? f7Var2.getAlpha() : null)) {
            return;
        }
        applyAlpha(view, ((Number) f7Var.getAlpha().evaluate(expressionResolver)).doubleValue());
        if (ExpressionsKt.isConstant(f7Var.getAlpha())) {
            return;
        }
        expressionSubscriber.addSubscription(f7Var.getAlpha().observe(expressionResolver, new Function1<Double, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindAlpha.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Double d10) {
                invoke(d10.doubleValue());
                return Unit.f93236a;
            }

            public final void invoke(double d10) {
                DivBaseBinder.this.applyAlpha(view, d10);
            }
        }));
    }

    private final void bindBackground(View view, BindingContext bindingContext, f7 f7Var, f7 f7Var2, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        bd bdVarN;
        DivBackgroundBinder divBackgroundBinder = this.divBackgroundBinder;
        List<? extends a7> background = f7Var.getBackground();
        List<? extends a7> list = null;
        List<? extends a7> background2 = f7Var2 != null ? f7Var2.getBackground() : null;
        bd bdVarN2 = f7Var.n();
        List<? extends a7> list2 = bdVarN2 != null ? bdVarN2.f86505a : null;
        if (f7Var2 != null && (bdVarN = f7Var2.n()) != null) {
            list = bdVarN.f86505a;
        }
        divBackgroundBinder.bindBackground(bindingContext, view, background, background2, list2, list, expressionSubscriber, drawable);
    }

    static /* synthetic */ void bindBackground$default(DivBaseBinder divBaseBinder, View view, BindingContext bindingContext, f7 f7Var, f7 f7Var2, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            drawable = null;
        }
        divBaseBinder.bindBackground(view, bindingContext, f7Var, f7Var2, expressionSubscriber, drawable);
    }

    private final void bindBorder(View view, BindingContext bindingContext, f7 f7Var) {
        DivFocusBinder divFocusBinder = this.divFocusBinder;
        bd bdVarN = f7Var.n();
        divFocusBinder.bindDivBorder(view, bindingContext, bdVarN != null ? bdVarN.f86506b : null, f7Var.x());
    }

    private final void bindFocusActions(View view, BindingContext bindingContext, List<j1> list, List<j1> list2) {
        this.divFocusBinder.bindDivFocusActions(view, bindingContext, list, list2);
    }

    private final void bindId(View view, Div2View div2View, f7 f7Var, f7 f7Var2) {
        if (Intrinsics.areEqual(f7Var.getId(), f7Var2 != null ? f7Var2.getId() : null)) {
            return;
        }
        applyId(view, f7Var.getId(), div2View.getViewComponent().getViewIdProvider().getViewId(f7Var.getId()));
    }

    private final void bindLayoutParams(View view, BindingContext bindingContext, f7 f7Var, f7 f7Var2, ExpressionSubscriber expressionSubscriber) {
        this.layoutParamsBinder.bindLayoutParams(bindingContext, view, f7Var, f7Var2, expressionSubscriber);
    }

    private final void bindLayoutProvider(final View view, final BindingContext bindingContext, f7 f7Var, f7 f7Var2) {
        zh zhVarR;
        zh zhVarR2;
        zh zhVarR3;
        final Div2View divView = bindingContext.getDivView();
        ea divData = divView.getDivData();
        if (divData == null || (zhVarR = f7Var.r()) == null) {
            return;
        }
        if (StringsKt.O(zhVarR.f92935b, (f7Var2 == null || (zhVarR3 = f7Var2.r()) == null) ? null : zhVarR3.f92935b, false, 2, null)) {
            if (StringsKt.O(zhVarR.f92934a, (f7Var2 == null || (zhVarR2 = f7Var2.r()) == null) ? null : zhVarR2.f92934a, false, 2, null)) {
                return;
            }
        }
        if ((f7Var2 != null ? f7Var2.r() : null) != null) {
            clearLayoutProviderVariables(view);
        }
        final String str = zhVarR.f92935b;
        final String str2 = zhVarR.f92934a;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            DivActionTypedUtilsKt.logError(divView, new Throwable("Neither width_variable_name nor height_variable_name found."));
            return;
        }
        DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder = divView.getVariablesHolders$div_release().get(divData);
        if (divLayoutProviderVariablesHolder == null) {
            divLayoutProviderVariablesHolder = new DivLayoutProviderVariablesHolder();
            divLayoutProviderVariablesHolder.observeDivData(divData, bindingContext);
            divView.getVariablesHolders$div_release().put(divData, divLayoutProviderVariablesHolder);
        }
        final DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder2 = divLayoutProviderVariablesHolder;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: n7.j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                DivBaseBinder.bindLayoutProvider$lambda$4(view, this, divView, str, divLayoutProviderVariablesHolder2, bindingContext, str2, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        if (view.getWidth() > 0 || view.getHeight() > 0) {
            onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
        }
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.setTag(R$id.div_layout_provider_listener_id, onLayoutChangeListener);
        if (divView.getClearVariablesListener() != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListenerOnPreDrawListener$default = OnPreDrawListeners.onPreDrawListener$default(null, new Function0<Boolean>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindLayoutProvider$clearVariablesListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                divLayoutProviderVariablesHolder2.clear();
                Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = divView.getLayoutSizes$div_release();
                Div2View div2View = divView;
                for (Map.Entry<ExpressionResolver, Map<String, Integer>> entry : layoutSizes$div_release.entrySet()) {
                    ExpressionResolver key = entry.getKey();
                    for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                        VariableMutationHandler.INSTANCE.setVariable(div2View, entry2.getKey(), String.valueOf(entry2.getValue().intValue()), key);
                    }
                }
                divView.getLayoutSizes$div_release().clear();
                return Boolean.TRUE;
            }
        }, 1, null);
        divView.setClearVariablesListener$div_release(onPreDrawListenerOnPreDrawListener$default);
        divView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListenerOnPreDrawListener$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLayoutProvider$lambda$4(View view, DivBaseBinder divBaseBinder, Div2View div2View, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, BindingContext bindingContext, String str2, View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str, divLayoutProviderVariablesHolder, i10, i12, i14, i16, bindingContext.getExpressionResolver());
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str2, divLayoutProviderVariablesHolder, i11, i13, i15, i17, bindingContext.getExpressionResolver());
    }

    private final void bindMargins(final View view, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(f7Var.d(), f7Var2 != null ? f7Var2.d() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyMargins(view, f7Var.d(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(f7Var.d())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, f7Var.d(), expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindMargins.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyMargins(view, f7Var.d(), expressionResolver);
            }
        });
    }

    private final void bindNextFocus(final View view, Div2View div2View, f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        bd bdVarN;
        bd.c cVar;
        bd.c cVar2;
        bd bdVarN2;
        bd.c cVar3;
        bd.c cVar4;
        bd bdVarN3;
        bd.c cVar5;
        bd.c cVar6;
        bd bdVarN4;
        bd.c cVar7;
        bd.c cVar8;
        bd bdVarN5;
        bd.c cVar9;
        bd.c cVar10;
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent().getViewIdProvider();
        bd bdVarN6 = f7Var.n();
        Expression expression = (bdVarN6 == null || (cVar10 = bdVarN6.f86507c) == null) ? null : cVar10.f86515b;
        if (!ExpressionsKt.equalsToConstant(expression, (f7Var2 == null || (bdVarN5 = f7Var2.n()) == null || (cVar9 = bdVarN5.f86507c) == null) ? null : cVar9.f86515b)) {
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            view.setNextFocusForwardId(viewIdProvider.getViewId(str));
            view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str));
            if (!ExpressionsKt.isConstantOrNull(expression)) {
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str2) {
                        view.setNextFocusForwardId(viewIdProvider.getViewId(str2));
                        view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str2));
                    }
                }) : null);
            }
        }
        bd bdVarN7 = f7Var.n();
        Expression expression2 = (bdVarN7 == null || (cVar8 = bdVarN7.f86507c) == null) ? null : cVar8.f86516c;
        if (!ExpressionsKt.equalsToConstant(expression2, (f7Var2 == null || (bdVarN4 = f7Var2.n()) == null || (cVar7 = bdVarN4.f86507c) == null) ? null : cVar7.f86516c)) {
            view.setNextFocusLeftId(viewIdProvider.getViewId(expression2 != null ? (String) expression2.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression2)) {
                expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str2) {
                        view.setNextFocusLeftId(viewIdProvider.getViewId(str2));
                    }
                }) : null);
            }
        }
        bd bdVarN8 = f7Var.n();
        Expression expression3 = (bdVarN8 == null || (cVar6 = bdVarN8.f86507c) == null) ? null : cVar6.f86517d;
        if (!ExpressionsKt.equalsToConstant(expression3, (f7Var2 == null || (bdVarN3 = f7Var2.n()) == null || (cVar5 = bdVarN3.f86507c) == null) ? null : cVar5.f86517d)) {
            view.setNextFocusRightId(viewIdProvider.getViewId(expression3 != null ? (String) expression3.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression3)) {
                expressionSubscriber.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str2) {
                        view.setNextFocusRightId(viewIdProvider.getViewId(str2));
                    }
                }) : null);
            }
        }
        bd bdVarN9 = f7Var.n();
        Expression expression4 = (bdVarN9 == null || (cVar4 = bdVarN9.f86507c) == null) ? null : cVar4.f86518e;
        if (!ExpressionsKt.equalsToConstant(expression4, (f7Var2 == null || (bdVarN2 = f7Var2.n()) == null || (cVar3 = bdVarN2.f86507c) == null) ? null : cVar3.f86518e)) {
            view.setNextFocusUpId(viewIdProvider.getViewId(expression4 != null ? (String) expression4.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression4)) {
                expressionSubscriber.addSubscription(expression4 != null ? expression4.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str2) {
                        view.setNextFocusUpId(viewIdProvider.getViewId(str2));
                    }
                }) : null);
            }
        }
        bd bdVarN10 = f7Var.n();
        Expression expression5 = (bdVarN10 == null || (cVar2 = bdVarN10.f86507c) == null) ? null : cVar2.f86514a;
        if (ExpressionsKt.equalsToConstant(expression5, (f7Var2 == null || (bdVarN = f7Var2.n()) == null || (cVar = bdVarN.f86507c) == null) ? null : cVar.f86514a)) {
            return;
        }
        view.setNextFocusDownId(viewIdProvider.getViewId(expression5 != null ? (String) expression5.evaluate(expressionResolver) : null));
        if (ExpressionsKt.isConstantOrNull(expression5)) {
            return;
        }
        expressionSubscriber.addSubscription(expression5 != null ? expression5.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                invoke2(str2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str2) {
                view.setNextFocusDownId(viewIdProvider.getViewId(str2));
            }
        }) : null);
    }

    private final void bindPaddings(final View view, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (view instanceof DivPagerView) {
            return;
        }
        if (DivDataExtensionsKt.equalsToConstant(f7Var.p(), f7Var2 != null ? f7Var2.p() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyPaddings(view, f7Var.p(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(f7Var.p())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, f7Var.p(), expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindPaddings.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(view, f7Var.p(), expressionResolver);
            }
        });
    }

    private final void bindTransform(final View view, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(f7Var.getTransform(), f7Var2 != null ? f7Var2.getTransform() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyTransform(view, f7Var, expressionResolver);
        if (DivDataExtensionsKt.isConstant(f7Var.getTransform())) {
            return;
        }
        ExpressionSubscribersKt.observeTransform(expressionSubscriber, f7Var.getTransform(), expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindTransform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyTransform(view, f7Var, expressionResolver);
            }
        });
    }

    private final void bindVisibility(final View view, final Div2View div2View, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(f7Var.getVisibility(), f7Var2 != null ? f7Var2.getVisibility() : null)) {
            return;
        }
        applyVisibility(view, div2View, f7Var, expressionResolver, f7Var2 == null);
        if (ExpressionsKt.isConstant(f7Var.getVisibility())) {
            return;
        }
        expressionSubscriber.addSubscription(f7Var.getVisibility().observe(expressionResolver, new Function1<gx, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindVisibility.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gx gxVar) {
                invoke2(gxVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull gx gxVar) {
                DivBaseBinder.this.applyVisibility(view, div2View, f7Var, expressionResolver, false);
            }
        }));
    }

    private final void clearLayoutProviderVariables(View view) {
        Object tag = view.getTag(R$id.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    private final void updateSizeVariable(Div2View divView, DisplayMetrics metrics, String variableName, DivLayoutProviderVariablesHolder variablesHolder, int start, int end, int oldStart, int oldEnd, ExpressionResolver resolver) {
        int i10;
        if (variableName == null || variableName.length() == 0 || (i10 = end - start) == oldEnd - oldStart) {
            return;
        }
        if (variablesHolder.contains(variableName)) {
            DivActionTypedUtilsKt.logError(divView, new Throwable("Size subscriber affects original view size. Relayout was prevented."));
            return;
        }
        Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = divView.getLayoutSizes$div_release();
        Map<String, Integer> linkedHashMap = layoutSizes$div_release.get(resolver);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            layoutSizes$div_release.put(resolver, linkedHashMap);
        }
        linkedHashMap.put(variableName, Integer.valueOf(BaseDivViewExtensionsKt.pxToDp(Integer.valueOf(i10), metrics)));
    }

    public final void bindBackground$div_release(@NotNull BindingContext context, @NotNull View target, @NotNull f7 newDiv, @Nullable f7 oldDiv, @NotNull ExpressionSubscriber subscriber, @Nullable Drawable additionalLayer) {
        bindBackground(target, context, newDiv, oldDiv, subscriber, additionalLayer);
        bindPaddings(target, newDiv, oldDiv, context.getExpressionResolver(), subscriber);
    }

    public final void bindId$div_release(@NotNull Div2View divView, @NotNull View target, @Nullable String id2) {
        applyId(target, id2, id2 == null ? -1 : divView.getViewComponent().getViewIdProvider().getViewId(id2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindView(@NotNull BindingContext context, @NotNull View view, @NotNull y0 div, @Nullable y0 oldDiv) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div>");
        DivHolderView divHolderView = (DivHolderView) view;
        divHolderView.closeAllSubscription();
        divHolderView.setDiv(div);
        divHolderView.setBindingContext(context);
        bind(view, context, div.c(), oldDiv != null ? oldDiv.c() : null);
    }
}
