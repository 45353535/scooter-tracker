package com.yandex.div.core.actions;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.fw;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0003*\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0003*\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/view2/Div2View;", "", "throwable", "", "logError", "(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", "logWarning", "Lk8/fw;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "", "evaluate", "(Lk8/fw;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Object;", "", "longValue", "(Lk8/fw;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Long;", "", "doubleValue", "(Lk8/fw;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Double;", "", "colorIntValue", "(Lk8/fw;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/Integer;", "Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "openKeyboard", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;)V", "Landroid/view/View;", "closeKeyboard", "(Landroid/view/View;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivActionTypedUtilsKt {
    public static final void closeKeyboard(@NotNull View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    @Nullable
    public static final Integer colorIntValue(@NotNull fw fwVar, @NotNull ExpressionResolver expressionResolver) {
        if (fwVar instanceof fw.c) {
            return (Integer) ((fw.c) fwVar).c().f91540a.evaluate(expressionResolver);
        }
        return null;
    }

    @Nullable
    public static final Double doubleValue(@NotNull fw fwVar, @NotNull ExpressionResolver expressionResolver) {
        if (fwVar instanceof fw.g) {
            return Double.valueOf(((Number) ((fw.g) fwVar).c().f86858a.evaluate(expressionResolver)).longValue());
        }
        if (fwVar instanceof fw.h) {
            return (Double) ((fw.h) fwVar).c().f90115a.evaluate(expressionResolver);
        }
        return null;
    }

    @NotNull
    public static final Object evaluate(@NotNull fw fwVar, @NotNull ExpressionResolver expressionResolver) {
        if (fwVar instanceof fw.g) {
            return ((fw.g) fwVar).c().f86858a.evaluate(expressionResolver);
        }
        if (fwVar instanceof fw.i) {
            return ((fw.i) fwVar).c().f88738a.evaluate(expressionResolver);
        }
        if (fwVar instanceof fw.b) {
            return ((fw.b) fwVar).c().f88541a.evaluate(expressionResolver);
        }
        if (fwVar instanceof fw.c) {
            return ((fw.c) fwVar).c().f91540a.evaluate(expressionResolver);
        }
        if (fwVar instanceof fw.h) {
            return ((fw.h) fwVar).c().f90115a.evaluate(expressionResolver);
        }
        if (fwVar instanceof fw.j) {
            return ((fw.j) fwVar).c().f91871a.evaluate(expressionResolver);
        }
        if (fwVar instanceof fw.a) {
            return ((fw.a) fwVar).c().f86177a.evaluate(expressionResolver);
        }
        if (fwVar instanceof fw.f) {
            return ((fw.f) fwVar).c().f90125a.evaluate(expressionResolver);
        }
        throw new m();
    }

    public static final void logError(@NotNull Div2View div2View, @NotNull Throwable th2) {
        div2View.getViewComponent().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logError(th2);
    }

    public static final void logWarning(@NotNull Div2View div2View, @NotNull Throwable th2) {
        div2View.getViewComponent().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(th2);
    }

    @Nullable
    public static final Long longValue(@NotNull fw fwVar, @NotNull ExpressionResolver expressionResolver) {
        if (fwVar instanceof fw.g) {
            return (Long) ((fw.g) fwVar).c().f86858a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final void openKeyboard(@NotNull DivInputView divInputView) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(divInputView.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(divInputView, 1);
        }
    }
}
