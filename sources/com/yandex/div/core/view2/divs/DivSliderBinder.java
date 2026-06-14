package com.yandex.div.core.view2.divs;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.core.view.OneShotPreDrawListener;
import com.taurusx.tax.f.y;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.c;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.cb;
import k8.hb;
import k8.jd;
import k8.jp;
import k8.oa;
import k8.tp;
import k8.y0;
import k8.zl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 S2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001SBC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001b\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010\"\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\u001a*\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010#J#\u0010(\u001a\u00020\u001a*\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b(\u0010&J%\u0010+\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J%\u0010.\u001a\u00020\u001a*\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b.\u0010/J%\u00100\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b0\u0010,J%\u00101\u001a\u00020\u001a*\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b1\u0010/J+\u00102\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b2\u0010\u001cJ+\u00105\u001a\u00020\u001a*\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b5\u00106J#\u00107\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00109\u001a\u00020 H\u0002¢\u0006\u0004\b:\u0010#J#\u0010;\u001a\u00020\u001a*\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00109\u001a\u00020 H\u0002¢\u0006\u0004\b;\u0010&J#\u0010<\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00109\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010#J#\u0010=\u001a\u00020\u001a*\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00109\u001a\u00020 H\u0002¢\u0006\u0004\b=\u0010&J#\u0010>\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b>\u00108J%\u0010@\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010?\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b@\u0010#J%\u0010A\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010?\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bA\u0010#J%\u0010B\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010?\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bB\u0010#J%\u0010C\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010?\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bC\u0010#J\u0013\u0010D\u001a\u00020\u001a*\u00020\u0004H\u0002¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bF\u00108J5\u0010H\u001a\u00020\u001a*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\bH\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$n;", "Lk8/tp;", "Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/Div2Logger;", "logger", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "typefaceResolver", "Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "variableBinder", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "", "horizontalInterceptionAngle", "", "visualErrorsEnabled", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;Lcom/yandex/div/core/view2/errors/ErrorCollectors;FZ)V", "div", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "setupThumb", "(Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;Lk8/tp;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "observeThumbValue", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lk8/cb;", "thumbStyle", "observeThumbStyle", "(Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/cb;)V", "Lcom/yandex/div/internal/widget/slider/SliderView;", "applyThumbStyle", "(Lcom/yandex/div/internal/widget/slider/SliderView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/cb;)V", "observeThumbSecondaryStyle", "applyThumbSecondaryStyle", "Lk8/tp$d;", "thumbTextStyle", "observeThumbTextStyle", "(Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/tp$d;)V", "textStyle", "applyThumbTextStyle", "(Lcom/yandex/div/internal/widget/slider/SliderView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/tp$d;)V", "observeThumbSecondaryTextStyle", "applyThumbSecondaryTextStyle", "setupSecondaryThumb", "", "variableName", "observeThumbSecondaryValue", "(Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;Ljava/lang/String;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "setupTrack", "(Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;Lk8/tp;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "trackStyle", "observeTrackActiveStyle", "applyTrackActiveStyle", "observeTrackInactiveStyle", "applyTrackInactiveStyle", "setupTickMarks", "tickMarkStyle", "observeTickMarkActiveStyle", "applyTickMarkActiveStyle", "observeTickMarkInactiveStyle", "applyTickMarkInactiveStyle", "checkSliderTicks", "(Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;)V", "setupRanges", "oldDiv", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;Lcom/yandex/div/core/view2/BindingContext;Lk8/tp;Lk8/tp;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "F", "Z", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivSliderBinder extends DivViewBinder<y0.n, tp, DivSliderView> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private ErrorCollector errorCollector;

    @NotNull
    private final ErrorCollectors errorCollectors;
    private final float horizontalInterceptionAngle;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayIntegerVariableBinder variableBinder;
    private final boolean visualErrorsEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSliderBinder$Companion;", "", "<init>", "()V", "Lk8/tp$d;", "Landroid/util/DisplayMetrics;", "metrics", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "typefaceResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "toSliderTextStyle", "(Lk8/tp$d;Landroid/util/DisplayMetrics;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "Lk8/hb;", "", "margin", "", "applyUnit", "(Lk8/hb;JLcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/DisplayMetrics;)I", "Lk8/jp;", "unit", "castToUnit", "(JLk8/jp;Landroid/util/DisplayMetrics;)I", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {

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

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int applyUnit(@NotNull hb hbVar, long j10, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics displayMetrics) {
            return castToUnit(j10, (jp) hbVar.f88006g.evaluate(expressionResolver), displayMetrics);
        }

        public final int castToUnit(long j10, @NotNull jp jpVar, @NotNull DisplayMetrics displayMetrics) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[jpVar.ordinal()];
            if (i10 == 1) {
                return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics);
            }
            if (i10 == 2) {
                return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j10), displayMetrics);
            }
            if (i10 != 3) {
                throw new m();
            }
            long j11 = j10 >> 31;
            if (j11 == 0 || j11 == -1) {
                return (int) j10;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + j10 + "' to Int");
            }
            return j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        @NotNull
        public final SliderTextStyle toSliderTextStyle(@NotNull tp.d dVar, @NotNull DisplayMetrics displayMetrics, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull ExpressionResolver expressionResolver) {
            oa oaVar;
            oa oaVar2;
            int i10;
            long jLongValue = ((Number) dVar.f91462b.evaluate(expressionResolver)).longValue();
            Expression expression = dVar.f91461a;
            Integer numValueOf = null;
            DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(expression != null ? (String) expression.evaluate(expressionResolver) : null);
            String fontVariations = typefaceProvider.isVariable() ? TextViewExtensionsKt.getFontVariations(dVar.f91465e, dVar.f91466f, dVar.f91464d, expressionResolver) : null;
            float fFontSizeToPx = BaseDivViewExtensionsKt.fontSizeToPx(jLongValue, (jp) dVar.f91463c.evaluate(expressionResolver), displayMetrics);
            float fDoubleValue = ((float) ((Number) dVar.f91467g.evaluate(expressionResolver)).doubleValue()) / jLongValue;
            Expression expression2 = dVar.f91465e;
            jd jdVar = expression2 != null ? (jd) expression2.evaluate(expressionResolver) : null;
            Expression expression3 = dVar.f91466f;
            if (expression3 != null) {
                long jLongValue2 = ((Number) expression3.evaluate(expressionResolver)).longValue();
                long j10 = jLongValue2 >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                    }
                    i10 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                numValueOf = Integer.valueOf(i10);
            }
            Typeface typeface = DivTypefaceResolverKt.getTypeface(jdVar, numValueOf, typefaceProvider);
            zl zlVar = dVar.f91468h;
            float px = 0.0f;
            float px2 = (zlVar == null || (oaVar2 = zlVar.f92958a) == null) ? 0.0f : BaseDivViewExtensionsKt.toPx(oaVar2, displayMetrics, expressionResolver);
            zl zlVar2 = dVar.f91468h;
            if (zlVar2 != null && (oaVar = zlVar2.f92959b) != null) {
                px = BaseDivViewExtensionsKt.toPx(oaVar, displayMetrics, expressionResolver);
            }
            return new SliderTextStyle(fFontSizeToPx, fDoubleValue, typeface, px2, px, ((Number) dVar.f91469i.evaluate(expressionResolver)).intValue(), fontVariations);
        }

        private Companion() {
        }
    }

    public DivSliderBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull Div2Logger div2Logger, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, @NotNull ErrorCollectors errorCollectors, float f10, boolean z10) {
        super(divBaseBinder);
        this.logger = div2Logger;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayIntegerVariableBinder;
        this.errorCollectors = errorCollectors;
        this.horizontalInterceptionAngle = f10;
        this.visualErrorsEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryStyle(SliderView sliderView, ExpressionResolver expressionResolver, cb cbVar) {
        sliderView.setThumbSecondaryDrawable(DivUtilKt.toDrawable(cbVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, tp.d dVar) {
        sliderView.setThumbSecondTextDrawable(dVar != null ? new TextDrawable(Companion.toSliderTextStyle(dVar, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbStyle(SliderView sliderView, ExpressionResolver expressionResolver, cb cbVar) {
        sliderView.setThumbDrawable(DivUtilKt.toDrawable(cbVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, tp.d dVar) {
        sliderView.setThumbTextDrawable(dVar != null ? new TextDrawable(Companion.toSliderTextStyle(dVar, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkActiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, cb cbVar) {
        divSliderView.setActiveTickMarkDrawable(cbVar != null ? DivUtilKt.toDrawable(cbVar, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkInactiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, cb cbVar) {
        divSliderView.setInactiveTickMarkDrawable(cbVar != null ? DivUtilKt.toDrawable(cbVar, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackActiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, cb cbVar) {
        sliderView.setActiveTrackDrawable(DivUtilKt.toDrawable(cbVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackInactiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, cb cbVar) {
        sliderView.setInactiveTrackDrawable(DivUtilKt.toDrawable(cbVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSliderTicks(final DivSliderView divSliderView) {
        if (!this.visualErrorsEnabled || this.errorCollector == null) {
            return;
        }
        OneShotPreDrawListener.add(divSliderView, new Runnable() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$checkSliderTicks$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                ErrorCollector errorCollector;
                if (divSliderView.getActiveTickMarkDrawable() == null && divSliderView.getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = divSliderView.getMaxValue() - divSliderView.getMinValue();
                Drawable activeTickMarkDrawable = divSliderView.getActiveTickMarkDrawable();
                boolean z10 = false;
                int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
                if (Math.max(intrinsicWidth, divSliderView.getInactiveTickMarkDrawable() != null ? r3.getIntrinsicWidth() : 0) * maxValue <= divSliderView.getWidth() || this.errorCollector == null) {
                    return;
                }
                ErrorCollector errorCollector2 = this.errorCollector;
                Intrinsics.checkNotNull(errorCollector2);
                Iterator<Throwable> warnings = errorCollector2.getWarnings();
                while (warnings.hasNext()) {
                    if (Intrinsics.areEqual(warnings.next().getMessage(), "Slider ticks overlap each other.")) {
                        z10 = true;
                    }
                }
                if (z10 || (errorCollector = this.errorCollector) == null) {
                    return;
                }
                errorCollector.logWarning(new Throwable("Slider ticks overlap each other."));
            }
        });
    }

    private final void observeThumbSecondaryStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final cb cbVar) {
        if (cbVar == null) {
            return;
        }
        applyThumbSecondaryStyle(divSliderView, expressionResolver, cbVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, cbVar, expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbSecondaryStyle.1
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
                DivSliderBinder.this.applyThumbSecondaryStyle(divSliderView, expressionResolver, cbVar);
            }
        });
    }

    private final void observeThumbSecondaryTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final tp.d dVar) {
        applyThumbSecondaryTextStyle(divSliderView, expressionResolver, dVar);
        if (dVar == null) {
            return;
        }
        divSliderView.addSubscription(dVar.f91469i.observe(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbSecondaryTextStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(int i10) {
                DivSliderBinder.this.applyThumbSecondaryTextStyle(divSliderView, expressionResolver, dVar);
            }
        }));
    }

    private final void observeThumbSecondaryValue(final DivSliderView divSliderView, String str, final BindingContext bindingContext, DivStatePath divStatePath) {
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1<? super Long, Unit> valueUpdater) {
                final DivSliderView divSliderView2 = divSliderView;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbSecondaryValueChanged(@Nullable Float value) {
                        divSliderBinder.logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, value);
                        valueUpdater.invoke(Long.valueOf(value != null ? zf.a.f(value.floatValue()) : 0L));
                    }

                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public /* synthetic */ void onThumbValueChanged(float f10) {
                        c.b(this, f10);
                    }
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long value) {
                divSliderView.setThumbSecondaryValue(value != null ? Float.valueOf(value.longValue()) : null, false);
            }
        }, divStatePath));
    }

    private final void observeThumbStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final cb cbVar) {
        applyThumbStyle(divSliderView, expressionResolver, cbVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, cbVar, expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbStyle.1
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
                DivSliderBinder.this.applyThumbStyle(divSliderView, expressionResolver, cbVar);
            }
        });
    }

    private final void observeThumbTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final tp.d dVar) {
        applyThumbTextStyle(divSliderView, expressionResolver, dVar);
        if (dVar == null) {
            return;
        }
        divSliderView.addSubscription(dVar.f91469i.observe(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbTextStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(int i10) {
                DivSliderBinder.this.applyThumbTextStyle(divSliderView, expressionResolver, dVar);
            }
        }));
    }

    private final void observeThumbValue(final DivSliderView divSliderView, tp tpVar, final BindingContext bindingContext, DivStatePath divStatePath) {
        String str = tpVar.E;
        if (str == null) {
            return;
        }
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1<? super Long, Unit> valueUpdater) {
                final DivSliderView divSliderView2 = divSliderView;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public /* synthetic */ void onThumbSecondaryValueChanged(Float f10) {
                        c.a(this, f10);
                    }

                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbValueChanged(float value) {
                        divSliderBinder.logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, Float.valueOf(value));
                        valueUpdater.invoke(Long.valueOf(zf.a.f(value)));
                    }
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long value) {
                divSliderView.setThumbValue(value != null ? value.longValue() : 0.0f, false);
            }
        }, divStatePath));
    }

    private final void observeTickMarkActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final cb cbVar) {
        applyTickMarkActiveStyle(divSliderView, expressionResolver, cbVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, cbVar, expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTickMarkActiveStyle.1
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
                DivSliderBinder.this.applyTickMarkActiveStyle(divSliderView, expressionResolver, cbVar);
            }
        });
    }

    private final void observeTickMarkInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final cb cbVar) {
        applyTickMarkInactiveStyle(divSliderView, expressionResolver, cbVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, cbVar, expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTickMarkInactiveStyle.1
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
                DivSliderBinder.this.applyTickMarkInactiveStyle(divSliderView, expressionResolver, cbVar);
            }
        });
    }

    private final void observeTrackActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final cb cbVar) {
        applyTrackActiveStyle(divSliderView, expressionResolver, cbVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, cbVar, expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTrackActiveStyle.1
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
                DivSliderBinder.this.applyTrackActiveStyle(divSliderView, expressionResolver, cbVar);
            }
        });
    }

    private final void observeTrackInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final cb cbVar) {
        applyTrackInactiveStyle(divSliderView, expressionResolver, cbVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, cbVar, expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTrackInactiveStyle.1
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
                DivSliderBinder.this.applyTrackInactiveStyle(divSliderView, expressionResolver, cbVar);
            }
        });
    }

    private final void setupRanges(final DivSliderView divSliderView, tp tpVar, ExpressionResolver expressionResolver) {
        final DivSliderView divSliderView2;
        final ExpressionResolver expressionResolver2;
        divSliderView.getRanges().clear();
        List<tp.c> list = tpVar.f91439u;
        if (list == null) {
            return;
        }
        final DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
        for (tp.c cVar : list) {
            final SliderView.Range range = new SliderView.Range();
            divSliderView.getRanges().add(range);
            Expression expression = cVar.f91450c;
            if (expression == null) {
                expression = tpVar.f91437s;
            }
            divSliderView.addSubscription(expression.observeAndGet(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                    invoke(l10.longValue());
                    return Unit.f93236a;
                }

                public final void invoke(long j10) {
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = divSliderView;
                    range.setStartValue(j10);
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            }));
            Expression expression2 = cVar.f91448a;
            if (expression2 == null) {
                expression2 = tpVar.f91436r;
            }
            divSliderView.addSubscription(expression2.observeAndGet(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                    invoke(l10.longValue());
                    return Unit.f93236a;
                }

                public final void invoke(long j10) {
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = divSliderView;
                    range.setEndValue(j10);
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            }));
            final hb hbVar = cVar.f91449b;
            if (hbVar == null) {
                range.setMarginStart(0);
                range.setMarginEnd(0);
                divSliderView2 = divSliderView;
                expressionResolver2 = expressionResolver;
            } else {
                Expression expression3 = hbVar.f88004e;
                boolean z10 = (expression3 == null && hbVar.f88001b == null) ? false : true;
                if (!z10) {
                    expression3 = hbVar.f88002c;
                }
                final Expression expression4 = expression3;
                final Expression expression5 = z10 ? hbVar.f88001b : hbVar.f88003d;
                if (expression4 != null) {
                    divSliderView2 = divSliderView;
                    final DisplayMetrics displayMetrics2 = displayMetrics;
                    final ExpressionResolver expressionResolver3 = expressionResolver;
                    Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                            invoke(l10.longValue());
                            return Unit.f93236a;
                        }

                        public final void invoke(long j10) {
                            DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView3 = divSliderView2;
                            range.setMarginStart(DivSliderBinder.Companion.applyUnit(hbVar, j10, expressionResolver3, displayMetrics2));
                            divSliderView3.requestLayout();
                            divSliderView3.invalidate();
                        }
                    };
                    expressionResolver2 = expressionResolver3;
                    displayMetrics = displayMetrics2;
                    divSliderView2.addSubscription(expression4.observe(expressionResolver2, function1));
                } else {
                    divSliderView2 = divSliderView;
                    expressionResolver2 = expressionResolver;
                }
                if (expression5 != null) {
                    final ExpressionResolver expressionResolver4 = expressionResolver2;
                    final DisplayMetrics displayMetrics3 = displayMetrics;
                    Function1<Long, Unit> function12 = new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                            invoke(l10.longValue());
                            return Unit.f93236a;
                        }

                        public final void invoke(long j10) {
                            DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView3 = divSliderView2;
                            range.setMarginEnd(DivSliderBinder.Companion.applyUnit(hbVar, j10, expressionResolver4, displayMetrics3));
                            divSliderView3.requestLayout();
                            divSliderView3.invalidate();
                        }
                    };
                    expressionResolver2 = expressionResolver4;
                    displayMetrics = displayMetrics3;
                    divSliderView2.addSubscription(expression5.observe(expressionResolver2, function12));
                }
                Expression expression6 = hbVar.f88006g;
                final DisplayMetrics displayMetrics4 = displayMetrics;
                Function1<jp, Unit> function13 = new Function1<jp, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(jp jpVar) {
                        invoke2(jpVar);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull jp jpVar) {
                        DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                        DivSliderView divSliderView3 = divSliderView2;
                        Expression<Long> expression7 = expression4;
                        Expression<Long> expression8 = expression5;
                        SliderView.Range range2 = range;
                        ExpressionResolver expressionResolver5 = expressionResolver2;
                        DisplayMetrics displayMetrics5 = displayMetrics4;
                        if (expression7 != null) {
                            range2.setMarginStart(DivSliderBinder.Companion.castToUnit(expression7.evaluate(expressionResolver5).longValue(), jpVar, displayMetrics5));
                        }
                        if (expression8 != null) {
                            range2.setMarginEnd(DivSliderBinder.Companion.castToUnit(expression8.evaluate(expressionResolver5).longValue(), jpVar, displayMetrics5));
                        }
                        divSliderView3.requestLayout();
                        divSliderView3.invalidate();
                    }
                };
                range = range;
                displayMetrics = displayMetrics4;
                expression6.observeAndGet(expressionResolver2, function13);
            }
            cb cbVar = cVar.f91451d;
            if (cbVar == null) {
                cbVar = tpVar.I;
            }
            final cb cbVar2 = cbVar;
            Function1<Object, Unit> function14 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1
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
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = divSliderView2;
                    range.setActiveTrackDrawable(DivUtilKt.toDrawable(cbVar2, displayMetrics, expressionResolver2));
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            };
            Unit unit = Unit.f93236a;
            function14.invoke(unit);
            ExpressionSubscribersKt.observeDrawable(divSliderView2, cbVar2, expressionResolver2, function14);
            cb cbVar3 = cVar.f91452e;
            if (cbVar3 == null) {
                cbVar3 = tpVar.J;
            }
            final cb cbVar4 = cbVar3;
            Function1<Object, Unit> function15 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyInactiveTrackStyle$1
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
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = divSliderView2;
                    range.setInactiveTrackDrawable(DivUtilKt.toDrawable(cbVar4, displayMetrics, expressionResolver2));
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            };
            function15.invoke(unit);
            ExpressionSubscribersKt.observeDrawable(divSliderView2, cbVar4, expressionResolver2, function15);
            divSliderView = divSliderView2;
            expressionResolver = expressionResolver2;
        }
    }

    private final void setupSecondaryThumb(DivSliderView divSliderView, tp tpVar, BindingContext bindingContext, DivStatePath divStatePath) {
        String str = tpVar.B;
        Unit unit = null;
        if (str == null) {
            divSliderView.setThumbSecondaryDrawable(null);
            divSliderView.setThumbSecondaryValue(null, false);
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        observeThumbSecondaryValue(divSliderView, str, bindingContext, divStatePath);
        cb cbVar = tpVar.f91444z;
        if (cbVar != null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, cbVar);
            unit = Unit.f93236a;
        }
        if (unit == null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, tpVar.C);
        }
        observeThumbSecondaryTextStyle(divSliderView, expressionResolver, tpVar.A);
    }

    private final void setupThumb(DivSliderView divSliderView, tp tpVar, BindingContext bindingContext, DivStatePath divStatePath) {
        observeThumbValue(divSliderView, tpVar, bindingContext, divStatePath);
        observeThumbStyle(divSliderView, bindingContext.getExpressionResolver(), tpVar.C);
        observeThumbTextStyle(divSliderView, bindingContext.getExpressionResolver(), tpVar.D);
    }

    private final void setupTickMarks(DivSliderView divSliderView, tp tpVar, ExpressionResolver expressionResolver) {
        observeTickMarkActiveStyle(divSliderView, expressionResolver, tpVar.F);
        observeTickMarkInactiveStyle(divSliderView, expressionResolver, tpVar.G);
    }

    private final void setupTrack(DivSliderView divSliderView, tp tpVar, ExpressionResolver expressionResolver) {
        observeTrackActiveStyle(divSliderView, expressionResolver, tpVar.I);
        observeTrackInactiveStyle(divSliderView, expressionResolver, tpVar.J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivSliderView divSliderView, @NotNull BindingContext bindingContext, @NotNull tp tpVar, @Nullable tp tpVar2, @NotNull DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.errorCollector = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSliderView.setInterceptionAngle(this.horizontalInterceptionAngle);
        divSliderView.addSubscription(tpVar.f91437s.observeAndGet(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.bind.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                divSliderView.setMinValue(j10);
                this.checkSliderTicks(divSliderView);
            }
        }));
        divSliderView.addSubscription(tpVar.f91436r.observeAndGet(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.bind.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                divSliderView.setMaxValue(j10);
                this.checkSliderTicks(divSliderView);
            }
        }));
        divSliderView.addSubscription(tpVar.f91433o.observeAndGet(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.bind.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                divSliderView.setInteractive(z10);
            }
        }));
        divSliderView.clearOnThumbChangedListener();
        setupThumb(divSliderView, tpVar, bindingContext, divStatePath);
        setupSecondaryThumb(divSliderView, tpVar, bindingContext, divStatePath);
        setupTrack(divSliderView, tpVar, expressionResolver);
        setupTickMarks(divSliderView, tpVar, expressionResolver);
        setupRanges(divSliderView, tpVar, expressionResolver);
    }
}
