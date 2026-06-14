package com.yandex.div.core.actions;

import android.net.Uri;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Locale;
import k8.m5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSetVariableHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/m5$r;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleSetVariable", "(Lk8/m5$r;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "scopeId", "Lk8/m5;", "", "handleAction", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedSetVariableHandler implements DivActionTypedHandler {
    private final void handleSetVariable(m5.r action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.c().f90308b.evaluate(resolver);
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(action.c().f90307a, resolver);
        VariableMutationHandler.INSTANCE.setVariable(view, str, resolver, new Function1<Variable, Variable>() { // from class: com.yandex.div.core.actions.DivActionTypedSetVariableHandler.handleSetVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Variable invoke(@NotNull Variable variable) {
                Object obj = objEvaluate;
                Div2View div2View = view;
                String str2 = str;
                String lowerCase = "array";
                if (variable instanceof Variable.ArrayVariable) {
                    boolean z10 = obj instanceof JSONArray;
                    JSONArray jSONArray = (JSONArray) (z10 ? obj : null);
                    if (jSONArray == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!z10) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (jSONArray != null) {
                        ((Variable.ArrayVariable) variable).set(jSONArray);
                        return variable;
                    }
                } else if (variable instanceof Variable.BooleanVariable) {
                    Boolean bool = (Boolean) (obj instanceof Boolean ? obj : null);
                    if (bool == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (bool != null) {
                        ((Variable.BooleanVariable) variable).set(bool.booleanValue());
                        return variable;
                    }
                } else if (variable instanceof Variable.ColorVariable) {
                    boolean z11 = obj instanceof Integer;
                    Integer num = (Integer) (z11 ? obj : null);
                    if (num == null) {
                        if (z11 ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (num != null) {
                        ((Variable.ColorVariable) variable).m7614setcIhhviA(Color.m7660constructorimpl(num.intValue()));
                        return variable;
                    }
                } else if (variable instanceof Variable.DictVariable) {
                    boolean z12 = obj instanceof JSONObject;
                    JSONObject jSONObject = (JSONObject) (z12 ? obj : null);
                    if (jSONObject == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (z12) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (jSONObject != null) {
                        ((Variable.DictVariable) variable).set(jSONObject);
                        return variable;
                    }
                } else if (variable instanceof Variable.DoubleVariable) {
                    boolean z13 = obj instanceof Double;
                    Double d10 = (Double) (z13 ? obj : null);
                    if (d10 == null) {
                        if (obj instanceof Integer ? true : z13) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (d10 != null) {
                        ((Variable.DoubleVariable) variable).set(d10.doubleValue());
                        return variable;
                    }
                } else if (variable instanceof Variable.IntegerVariable) {
                    Long l10 = (Long) (obj instanceof Long ? obj : null);
                    if (l10 == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (l10 != null) {
                        ((Variable.IntegerVariable) variable).set(l10.longValue());
                        return variable;
                    }
                } else if (variable instanceof Variable.StringVariable) {
                    String str3 = (String) (obj instanceof String ? obj : null);
                    if (str3 == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (str3 != null) {
                        variable.set(str3);
                        return variable;
                    }
                } else if (variable instanceof Variable.UrlVariable) {
                    Uri uri = (Uri) (obj instanceof Uri ? obj : null);
                    if (uri == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            lowerCase = "number";
                        } else if (obj instanceof JSONObject) {
                            lowerCase = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + str2));
                    }
                    if (uri != null) {
                        ((Variable.UrlVariable) variable).set(uri);
                    }
                }
                return variable;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof m5.r)) {
            return false;
        }
        handleSetVariable((m5.r) action, view, resolver);
        return true;
    }
}
