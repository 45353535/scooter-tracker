package com.yandex.div.core.actions;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.fw;
import k8.m5;
import k8.y2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedDictSetValueHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/y2;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleSetValue", "(Lk8/y2;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "scopeId", "Lk8/m5;", "", "handleAction", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedDictSetValueHandler implements DivActionTypedHandler {
    private final void handleSetValue(y2 action, final Div2View view, ExpressionResolver resolver) {
        String str = (String) action.f92598c.evaluate(resolver);
        final String str2 = (String) action.f92596a.evaluate(resolver);
        fw fwVar = action.f92597b;
        final Object objEvaluate = fwVar != null ? DivActionTypedUtilsKt.evaluate(fwVar, resolver) : null;
        VariableMutationHandler.INSTANCE.setVariable(view, str, resolver, new Function1<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedDictSetValueHandler.handleSetValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Variable invoke(@NotNull Variable variable) throws JSONException {
                if (!(variable instanceof Variable.DictVariable)) {
                    DivActionTypedUtilsKt.logError(view, new IllegalArgumentException("dict_set_value action requires dict variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONObject jSONObject = value instanceof JSONObject ? (JSONObject) value : null;
                if (jSONObject == null) {
                    DivActionTypedUtilsKt.logError(view, new IllegalArgumentException("Invalid variable value"));
                    return variable;
                }
                JSONObject jSONObjectClone = DivActionTypedDictSetValueHandlerKt.clone(jSONObject);
                Object obj = objEvaluate;
                if (obj != null) {
                    ((Variable.DictVariable) variable).set(jSONObjectClone.put(str2, obj));
                    return variable;
                }
                jSONObjectClone.remove(str2);
                ((Variable.DictVariable) variable).set(jSONObjectClone);
                return variable;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof m5.j)) {
            return false;
        }
        handleSetValue(((m5.j) action).c(), view, resolver);
        return true;
    }
}
