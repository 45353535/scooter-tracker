package com.yandex.div.json.expressions;

import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0004\u001a,\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a\u001c\u0010\b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0004\u001a\u001c\u0010\b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0006¨\u0006\t"}, d2 = {"equalsToConstant", "", "T", "", "Lcom/yandex/div/json/expressions/Expression;", "other", "Lcom/yandex/div/json/expressions/ExpressionList;", "isConstant", "isConstantOrNull", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ExpressionsKt {
    public static final <T> boolean equalsToConstant(@Nullable Expression<T> expression, @Nullable Expression<T> expression2) {
        if (expression == null && expression2 == null) {
            return true;
        }
        if (expression == null || !isConstant(expression) || expression2 == null || !isConstant(expression2)) {
            return false;
        }
        return ((expression.getRawValue() instanceof JSONObject) || (expression.getRawValue() instanceof JSONArray)) ? Intrinsics.areEqual(expression.getRawValue().toString(), expression2.getRawValue().toString()) : Intrinsics.areEqual(expression.getRawValue(), expression2.getRawValue());
    }

    public static final <T> boolean isConstant(@NotNull Expression<T> expression) {
        return expression instanceof Expression.ConstantExpression;
    }

    public static final <T> boolean isConstantOrNull(@Nullable Expression<T> expression) {
        return expression == null || isConstant(expression);
    }

    public static final <T> boolean isConstant(@NotNull ExpressionList<T> expressionList) {
        return expressionList instanceof ConstantExpressionList;
    }

    public static final <T> boolean isConstantOrNull(@Nullable ExpressionList<T> expressionList) {
        return expressionList == null || isConstant(expressionList);
    }

    public static final <T> boolean equalsToConstant(@Nullable ExpressionList<T> expressionList, @Nullable ExpressionList<T> expressionList2) {
        if (expressionList == null && expressionList2 == null) {
            return true;
        }
        return expressionList != null && (expressionList instanceof ConstantExpressionList) && expressionList2 != null && (expressionList2 instanceof ConstantExpressionList) && Intrinsics.areEqual(((ConstantExpressionList) expressionList).getValues$div_data_release(), ((ConstantExpressionList) expressionList2).getValues$div_data_release());
    }
}
