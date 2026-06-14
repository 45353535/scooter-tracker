package com.yandex.div.core.view2.divs.widgets;

import android.util.DisplayMetrics;
import androidx.annotation.Px;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.ar;
import k8.jp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk8/ar;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "Landroid/util/DisplayMetrics;", "metrics", "", "widthPx", "(Lk8/ar;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/DisplayMetrics;)F", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivBorderDrawerKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jp.values().length];
            try {
                iArr[jp.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jp.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jp.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Px
    public static final float widthPx(@Nullable ar arVar, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics displayMetrics) {
        Expression expression;
        Expression expression2;
        jp jpVar = (arVar == null || (expression2 = arVar.f86315c) == null) ? null : (jp) expression2.evaluate(expressionResolver);
        int i10 = jpVar == null ? -1 : WhenMappings.$EnumSwitchMapping$0[jpVar.ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF((Number) arVar.f86316d.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPxF((Number) arVar.f86316d.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            return (float) ((Number) arVar.f86316d.evaluate(expressionResolver)).doubleValue();
        }
        if (arVar == null || (expression = arVar.f86316d) == null) {
            return 0.0f;
        }
        return (float) ((Number) expression.evaluate(expressionResolver)).doubleValue();
    }
}
