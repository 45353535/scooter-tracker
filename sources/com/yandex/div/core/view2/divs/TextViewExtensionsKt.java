package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.Iterator;
import java.util.List;
import k8.f7;
import k8.jd;
import k8.jp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a×\u0002\u0010%\u001a\u00020$\"\u0010\b\u0000\u0010\u0003*\u00020\u0000*\u00020\u0001*\u00020\u0002*\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&\u001a_\u0010(\u001a\u00020$*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010)\u001a7\u0010,\u001a\u00020$*\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-\u001a_\u0010.\u001a\u00020$*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010)\u001a7\u00100\u001a\u00020$*\u00020\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u0010-\u001aG\u00101\u001a\u00020$\"\f\b\u0000\u0010\u0003*\u00020\u0000*\u00020\u0002*\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b1\u0010-\u001ao\u00102\u001a\u00020$\"\f\b\u0000\u0010\u0003*\u00020\u0000*\u00020\u0001*\u00028\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b2\u0010)\u001aG\u00105\u001a\u00020$\"\f\b\u0000\u0010\u0003*\u00020\u0000*\u00020\u0001*\u00028\u00002\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b5\u0010-\u001a»\u0001\u00106\u001a\u00020$\"\f\b\u0000\u0010\u0003*\u00020\u0000*\u00020\u0002*\u00028\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b6\u00107\u001ac\u0010<\u001a\u00020$*\u00020\u00002\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b<\u0010=\u001aq\u00106\u001a\u00020$\"\f\b\u0000\u0010\u0003*\u00020\u0000*\u00020\u0002*\u00028\u00002\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b6\u0010=\u001aY\u0010>\u001a\u00020$\"\f\b\u0000\u0010\u0003*\u00020\u0000*\u00020\u0002*\u00028\u00002\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b>\u0010?\u001aK\u0010@\u001a\u00020$*\u00020\u00002\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b@\u0010?\u001aI\u0010A\u001a\u0004\u0018\u00010\u000e2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\bA\u0010B\u001a/\u0010A\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010\u00102\b\u0010:\u001a\u0004\u0018\u00010\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\bA\u0010C\u001a\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010H\"\u0014\u0010L\u001a\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Landroid/widget/TextView;", "Lcom/yandex/div/core/widget/FixedLineHeightView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "T", "Lcom/yandex/div/json/expressions/Expression;", "", "newFontSize", "Lk8/jp;", "newFontSizeUnit", "", "newLetterSpacing", "", "newTextColor", "newLineHeight", "", "newFontFamily", "Lk8/jd;", "newFontWeight", "newFontWeightValue", "Lorg/json/JSONObject;", "newFontVariationSettings", "oldFontSize", "oldFontSizeUnit", "oldLetterSpacing", "oldTextColor", "oldLineHeight", "oldFontFamily", "oldFontWeight", "oldFontWeightValue", "oldFontVariationSettings", "Lk8/f7;", "oldDiv", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "typefaceResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "observeBaseTextProperties", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lk8/f7;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "subscriber", "observeFontSize", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "fontSizeExpr", "fontSizeUnitExpr", "applyFontSize", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeLetterSpacing", "letterSpacingExpr", "applyLetterSpacing", "observeTextColor", "observeLineHeight", "lineHeightExpr", "unitExpr", "applyLineHeight", "observeTypeface", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lk8/f7;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "fontFamily", "fontWeight", "fontWeightValue", "fontVariations", "applyTypeface", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeFontVariationSettings", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "applyFontVariationSettings", "getFontVariations", "(Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/String;", "(Lk8/jd;Ljava/lang/Integer;Lorg/json/JSONObject;)Ljava/lang/String;", "axis", "", "value", "getVariation", "(Ljava/lang/String;Ljava/lang/Number;)Ljava/lang/String;", "", "getSupportFontVariations", "()Z", "supportFontVariations", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TextViewExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFontSize(TextView textView, Expression<Long> expression, Expression<jp> expression2, ExpressionResolver expressionResolver) {
        textView.setTextSize(BaseDivViewExtensionsKt.toAndroidUnit(expression2.evaluate(expressionResolver)), expression.evaluate(expressionResolver).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(26)
    public static final void applyFontVariationSettings(TextView textView, Expression<jd> expression, Expression<Long> expression2, Expression<JSONObject> expression3, ExpressionResolver expressionResolver) {
        textView.setFontVariationSettings(getFontVariations(expression, expression2, expression3, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyLetterSpacing(TextView textView, Expression<Double> expression, Expression<Long> expression2, ExpressionResolver expressionResolver) {
        textView.setLetterSpacing(((float) expression.evaluate(expressionResolver).doubleValue()) / expression2.evaluate(expressionResolver).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends TextView & FixedLineHeightView> void applyLineHeight(T t10, Expression<Long> expression, Expression<jp> expression2, ExpressionResolver expressionResolver) {
        t10.setFixedLineHeight(expression != null ? BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression.evaluate(expressionResolver).longValue()), t10.getResources().getDisplayMetrics(), expression2.evaluate(expressionResolver)) : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTypeface(TextView textView, Expression<String> expression, Expression<jd> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        Integer numValueOf;
        int i10;
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(expression != null ? expression.evaluate(expressionResolver) : null);
        jd jdVarEvaluate = expression2 != null ? expression2.evaluate(expressionResolver) : null;
        if (expression3 != null) {
            long jLongValue = expression3.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        textView.setTypeface(DivTypefaceResolverKt.getTypeface(jdVarEvaluate, numValueOf, typefaceProvider));
        if (getSupportFontVariations() && typefaceProvider.isVariable()) {
            textView.setFontVariationSettings(null);
            applyFontVariationSettings(textView, expression2, expression3, expression4, expressionResolver);
        }
    }

    @Nullable
    public static final String getFontVariations(@Nullable Expression<jd> expression, @Nullable Expression<Long> expression2, @Nullable Expression<JSONObject> expression3, @NotNull ExpressionResolver expressionResolver) {
        Integer numValueOf;
        int i10;
        jd jdVarEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        if (expression2 != null) {
            long jLongValue = expression2.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return getFontVariations(jdVarEvaluate, numValueOf, expression3 != null ? expression3.evaluate(expressionResolver) : null);
    }

    public static final boolean getSupportFontVariations() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private static final String getVariation(String str, Number number) {
        return '\'' + str + "' " + number;
    }

    public static final <T extends TextView & FixedLineHeightView & ExpressionSubscriber> void observeBaseTextProperties(@NotNull T t10, @NotNull Expression<Long> expression, @NotNull Expression<jp> expression2, @NotNull Expression<Double> expression3, @NotNull Expression<Integer> expression4, @Nullable Expression<Long> expression5, @Nullable Expression<String> expression6, @Nullable Expression<jd> expression7, @Nullable Expression<Long> expression8, @Nullable Expression<JSONObject> expression9, @Nullable Expression<Long> expression10, @Nullable Expression<jp> expression11, @Nullable Expression<Double> expression12, @Nullable Expression<Integer> expression13, @Nullable Expression<Long> expression14, @Nullable Expression<String> expression15, @Nullable Expression<jd> expression16, @Nullable Expression<Long> expression17, @Nullable Expression<JSONObject> expression18, @Nullable f7 f7Var, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull ExpressionResolver expressionResolver) {
        T t11 = t10;
        observeFontSize(t10, expression, expression2, expression10, expression11, expressionResolver, t11);
        observeLetterSpacing(t10, expression3, expression, expression12, expression10, expressionResolver, t11);
        observeTextColor(t10, expression4, expression13, expressionResolver);
        observeLineHeight(t10, expression5, expression2, expression14, expression11, expressionResolver, t11);
        observeTypeface(t10, expression6, expression7, expression8, expression9, expression15, expression16, expression17, expression18, f7Var, divTypefaceResolver, expressionResolver);
    }

    public static final void observeFontSize(@NotNull final TextView textView, @NotNull final Expression<Long> expression, @NotNull final Expression<jp> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<jp> expression4, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyFontSize(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontSize$callback$1
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
                TextViewExtensionsKt.applyFontSize(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, function1));
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeFontVariationSettings(@NotNull final T t10, @Nullable final Expression<jd> expression, @Nullable final Expression<Long> expression2, @Nullable final Expression<JSONObject> expression3, @NotNull final ExpressionResolver expressionResolver) {
        if (!getSupportFontVariations() || ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        t10.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new Function1<JSONObject, Unit>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt.observeFontVariationSettings.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Lk8/jd;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull JSONObject jSONObject) {
                TextViewExtensionsKt.applyFontVariationSettings(t10, expression, expression2, expression3, expressionResolver);
            }
        }) : null);
    }

    public static final void observeLetterSpacing(@NotNull final TextView textView, @NotNull final Expression<Double> expression, @NotNull final Expression<Long> expression2, @Nullable Expression<Double> expression3, @Nullable Expression<Long> expression4, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLetterSpacing(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        Function1<? super Double, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLetterSpacing$callback$1
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
                TextViewExtensionsKt.applyLetterSpacing(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, function1));
    }

    public static final <T extends TextView & FixedLineHeightView> void observeLineHeight(@NotNull final T t10, @Nullable final Expression<Long> expression, @NotNull final Expression<jp> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<jp> expression4, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLineHeight(t10, expression, expression2, expressionResolver);
        if (expression != null) {
            if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
                return;
            }
            Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLineHeight$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lk8/jp;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
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
                    TextViewExtensionsKt.applyLineHeight(t10, expression, expression2, expressionResolver);
                }
            };
            expressionSubscriber.addSubscription(expression.observe(expressionResolver, function1));
            expressionSubscriber.addSubscription(expression2.observe(expressionResolver, function1));
        }
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTextColor(@NotNull final T t10, @NotNull Expression<Integer> expression, @Nullable Expression<Integer> expression2, @NotNull ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        t10.setTextColor(expression.evaluate(expressionResolver).intValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        t10.addSubscription(expression.observe(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt.observeTextColor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(int i10) {
                t10.setTextColor(i10);
            }
        }));
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTypeface(@NotNull T t10, @Nullable Expression<String> expression, @Nullable Expression<jd> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<JSONObject> expression4, @Nullable Expression<String> expression5, @Nullable Expression<jd> expression6, @Nullable Expression<Long> expression7, @Nullable Expression<JSONObject> expression8, @Nullable f7 f7Var, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull ExpressionResolver expressionResolver) {
        if (f7Var != null && ExpressionsKt.equalsToConstant(expression, expression5) && ExpressionsKt.equalsToConstant(expression2, expression6) && ExpressionsKt.equalsToConstant(expression3, expression7) && (!getSupportFontVariations() || ExpressionsKt.equalsToConstant(expression4, expression8))) {
            return;
        }
        applyTypeface(t10, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeTypeface(t10, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeFontVariationSettings(t10, expression2, expression3, expression4, expressionResolver);
    }

    private static final <T extends TextView & ExpressionSubscriber> void observeTypeface(final T t10, final Expression<String> expression, final Expression<jd> expression2, final Expression<Long> expression3, final Expression<JSONObject> expression4, final DivTypefaceResolver divTypefaceResolver, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        Function1<? super String, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTypeface$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/String;>;Lcom/yandex/div/json/expressions/Expression<Lk8/jd;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
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
                TextViewExtensionsKt.applyTypeface(t10, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
            }
        };
        if (expression != null) {
            t10.addSubscription(expression.observe(expressionResolver, function1));
        }
        if (expression2 != null) {
            t10.addSubscription(expression2.observe(expressionResolver, function1));
        }
        if (expression3 != null) {
            t10.addSubscription(expression3.observe(expressionResolver, function1));
        }
    }

    @Nullable
    public static final String getFontVariations(@Nullable jd jdVar, @Nullable Integer num, @Nullable JSONObject jSONObject) throws JSONException {
        boolean z10 = (jdVar == null && num == null) ? false : true;
        int typefaceValue = DivTypefaceResolverKt.getTypefaceValue(jdVar, num);
        if (jSONObject == null || JsonUtilsKt.isEmpty(jSONObject)) {
            if (z10) {
                return getVariation("wght", Integer.valueOf(typefaceValue));
            }
            return null;
        }
        if (z10 && !jSONObject.has("wght")) {
            jSONObject.put("wght", typefaceValue);
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Number) {
                listCreateListBuilder.add(getVariation(next, (Number) obj));
            }
        }
        return CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ", ", null, null, 0, null, null, 62, null);
    }
}
