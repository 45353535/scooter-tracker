package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Arrays;
import k8.ep;
import k8.f7;
import k8.jp;
import k8.kp;
import k8.ni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0013\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J=\u0010\u001a\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u0015*\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\"*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\"*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010$J#\u0010&\u001a\u00020\"*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010$J\u001b\u0010(\u001a\u00020'*\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J=\u0010*\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u0012J+\u0010+\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010!J#\u0010,\u001a\u00020\"*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010$J#\u0010-\u001a\u00020\"*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010$J#\u0010.\u001a\u00020\"*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010$J7\u0010\u0011\u001a\u00020\u00102\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u001a\u00106\u001a\u0004\u0018\u00010\u001c*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u00108\u001a\u0004\u0018\u00010\u001c*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00069"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivLayoutParamsBinder;", "", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Landroid/view/View;", "Lk8/f7;", "newDiv", "oldDiv", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "", "bindLayoutParams", "(Landroid/view/View;Lk8/f7;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "bindWidth", "Lk8/ep;", "", "type", "id", "Landroid/util/DisplayMetrics;", "metrics", "checkConstraints", "(Lk8/ep;Ljava/lang/String;Ljava/lang/String;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "Lk8/kp;", "toString", "(Lk8/kp;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/String;", "div", "applyWidthProperties", "(Landroid/view/View;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "", "applyWidth", "(Landroid/view/View;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "applyHorizontalWeightValue", "applyWidthConstraints", "", "getWeight", "(Lk8/ep;Lcom/yandex/div/json/expressions/ExpressionResolver;)F", "bindHeight", "applyHeightProperties", "applyHeight", "applyVerticalWeightValue", "applyHeightConstraints", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, TypedValues.AttributesType.S_TARGET, "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/f7;Lk8/f7;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "getMinSize", "(Lk8/ep;)Lk8/kp;", "minSize", "getMaxSize", "maxSize", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivLayoutParamsBinder {

    @NotNull
    private final ErrorCollectors errorCollectors;

    public DivLayoutParamsBinder(@NotNull ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    private final boolean applyHeight(View view, f7 f7Var, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(f7Var.getHeight(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().height == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().height = layoutParamsSize;
        return true;
    }

    private final boolean applyHeightConstraints(View view, f7 f7Var, ExpressionResolver expressionResolver) {
        kp minSize = getMinSize(f7Var.getHeight());
        boolean z10 = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        kp maxSize = getMaxSize(f7Var.getHeight());
        int i10 = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i10 = px2;
        }
        if (view.getMinimumHeight() != px) {
            view.setMinimumHeight(px);
            z10 = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getMaxHeight() == i10) {
            return z10;
        }
        divLayoutParams.setMaxHeight(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHeightProperties(View view, f7 f7Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(f7Var.getHeight(), "height", f7Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean z10 = applyVerticalWeightValue(view, f7Var, expressionResolver) || applyHeight(view, f7Var, expressionResolver);
        if (applyHeightConstraints(view, f7Var, expressionResolver) || z10) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, f7Var, expressionResolver);
        }
    }

    private final boolean applyHorizontalWeightValue(View view, f7 f7Var, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(f7Var.getWidth(), expressionResolver);
        if (divLayoutParams.getHorizontalWeight() == weight) {
            return false;
        }
        divLayoutParams.setHorizontalWeight(weight);
        return true;
    }

    private final boolean applyVerticalWeightValue(View view, f7 f7Var, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(f7Var.getHeight(), expressionResolver);
        if (divLayoutParams.getVerticalWeight() == weight) {
            return false;
        }
        divLayoutParams.setVerticalWeight(weight);
        return true;
    }

    private final boolean applyWidth(View view, f7 f7Var, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(f7Var.getWidth(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().width == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().width = layoutParamsSize;
        return true;
    }

    private final boolean applyWidthConstraints(View view, f7 f7Var, ExpressionResolver expressionResolver) {
        kp minSize = getMinSize(f7Var.getWidth());
        boolean z10 = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        kp maxSize = getMaxSize(f7Var.getWidth());
        int i10 = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i10 = px2;
        }
        if (view.getMinimumWidth() != px) {
            view.setMinimumWidth(px);
            z10 = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getMaxWidth() == i10) {
            return z10;
        }
        divLayoutParams.setMaxWidth(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyWidthProperties(View view, f7 f7Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(f7Var.getWidth(), "width", f7Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean z10 = applyHorizontalWeightValue(view, f7Var, expressionResolver) || applyWidth(view, f7Var, expressionResolver);
        if (applyWidthConstraints(view, f7Var, expressionResolver) || z10) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, f7Var, expressionResolver);
        }
    }

    private final void bindHeight(final View view, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(f7Var.getHeight(), f7Var2 != null ? f7Var2.getHeight() : null)) {
            checkConstraints(f7Var.getHeight(), "height", f7Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyHeightProperties(view, f7Var, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(f7Var.getHeight())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, f7Var.getHeight(), expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder.bindHeight.1
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
                DivLayoutParamsBinder.this.applyHeightProperties(view, f7Var, expressionResolver, errorCollector);
            }
        });
    }

    private final void bindWidth(final View view, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(f7Var.getWidth(), f7Var2 != null ? f7Var2.getWidth() : null)) {
            checkConstraints(f7Var.getWidth(), "width", f7Var.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyWidthProperties(view, f7Var, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(f7Var.getWidth())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, f7Var.getWidth(), expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder.bindWidth.1
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
                DivLayoutParamsBinder.this.applyWidthProperties(view, f7Var, expressionResolver, errorCollector);
            }
        });
    }

    private final void checkConstraints(ep epVar, String str, String str2, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        kp maxSize;
        String str3;
        kp minSize = getMinSize(epVar);
        if (minSize == null || (maxSize = getMaxSize(epVar)) == null || BaseDivViewExtensionsKt.toPx(minSize, displayMetrics, expressionResolver) <= BaseDivViewExtensionsKt.toPx(maxSize, displayMetrics, expressionResolver)) {
            return;
        }
        if (str2 != null) {
            str3 = String.format("Id: '%s', ", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        } else {
            str3 = "";
        }
        String str4 = String.format("Element has incorrect %s constraints (min size is bigger than max size). %sminSize: %s, maxSize: %s.", Arrays.copyOf(new Object[]{str, str3, toString(minSize, expressionResolver), toString(maxSize, expressionResolver)}, 4));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        errorCollector.logError(new Throwable(str4));
    }

    private final kp getMaxSize(ep epVar) {
        if (epVar instanceof ep.e) {
            return ((ep.e) epVar).c().f90109b;
        }
        if (epVar instanceof ep.d) {
            return ((ep.d) epVar).c().f90042a;
        }
        return null;
    }

    private final kp getMinSize(ep epVar) {
        if (epVar instanceof ep.e) {
            return ((ep.e) epVar).c().f90110c;
        }
        if (epVar instanceof ep.d) {
            return ((ep.d) epVar).c().f90043b;
        }
        return null;
    }

    private final float getWeight(ep epVar, ExpressionResolver expressionResolver) {
        ni niVarC;
        Expression expression;
        ep.d dVar = epVar instanceof ep.d ? (ep.d) epVar : null;
        if (dVar == null || (niVarC = dVar.c()) == null || (expression = niVarC.f90044c) == null) {
            return 0.0f;
        }
        return (float) ((Number) expression.evaluate(expressionResolver)).doubleValue();
    }

    private final String toString(kp kpVar, ExpressionResolver expressionResolver) {
        return ((Number) kpVar.f88677b.evaluate(expressionResolver)).longValue() + jp.f88505c.b((jp) kpVar.f88676a.evaluate(expressionResolver));
    }

    public final void bindLayoutParams(@NotNull BindingContext context, @NotNull View target, @NotNull f7 newDiv, @Nullable f7 oldDiv, @NotNull ExpressionSubscriber subscriber) {
        bindLayoutParams(target, newDiv, oldDiv, context.getExpressionResolver(), subscriber, this.errorCollectors.getOrCreate(context.getDivView().getDataTag(), context.getDivView().getDivData()));
    }

    private final void bindLayoutParams(View view, f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, ErrorCollector errorCollector) {
        if (view.getLayoutParams() == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("LayoutParams should be initialized before view binding");
            }
            view.setLayoutParams(new DivLayoutParams(-1, -2));
        }
        bindWidth(view, f7Var, f7Var2, expressionResolver, expressionSubscriber, errorCollector);
        bindHeight(view, f7Var, f7Var2, expressionResolver, expressionSubscriber, errorCollector);
    }
}
