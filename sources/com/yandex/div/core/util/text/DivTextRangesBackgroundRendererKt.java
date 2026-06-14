package com.yandex.div.core.util.text;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.xt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk8/xt;", "Landroid/util/DisplayMetrics;", "metrics", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "getCornerRadii", "(Lk8/xt;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)[F", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTextRangesBackgroundRendererKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] getCornerRadii(xt xtVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression expression = xtVar.f92415a;
        float fDpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics);
        return new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
    }
}
