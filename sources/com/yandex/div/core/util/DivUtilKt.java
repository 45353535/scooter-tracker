package com.yandex.div.core.util;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k8.ar;
import k8.b6;
import k8.c6;
import k8.cb;
import k8.df;
import k8.dp;
import k8.e9;
import k8.ep;
import k8.f7;
import k8.f9;
import k8.g7;
import k8.g9;
import k8.hx;
import k8.jp;
import k8.l7;
import k8.lq;
import k8.ra;
import k8.te;
import k8.to;
import k8.u8;
import k8.uo;
import k8.w6;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001b\u0010 \u001a\u00020\u0004*\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!\u001a1\u0010%\u001a\u00020$*\u0004\u0018\u00010\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b%\u0010&\u001a#\u0010+\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u0010+\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b+\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0000¢\u0006\u0004\b6\u00107\u001a%\u0010:\u001a\u0004\u0018\u000109*\u0002082\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010;\u001a%\u0010:\u001a\u0004\u0018\u000109*\u00020<2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010=\u001a#\u0010?\u001a\u00020\r*\u00020>2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010A\u001a\u00020'*\u00020-H\u0000¢\u0006\u0004\bA\u0010B\u001a\u0013\u0010C\u001a\u00020)*\u00020.H\u0000¢\u0006\u0004\bC\u0010D\"\u0018\u0010H\u001a\u00020E*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u0018\u0010\n\u001a\u00020\t*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0018\u0010L\u001a\u00020\u0004*\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u0018\u0010N\u001a\u00020\u0004*\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010M\"\u0018\u0010O\u001a\u00020\u0004*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\"\u0018\u0010Q\u001a\u00020\u0004*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010P\"\u0018\u0010U\u001a\u00020\u0004*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0V*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\"\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00020[0V*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Y\"\u001e\u0010`\u001a\b\u0012\u0004\u0012\u00020^0V*\u00020R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010Y¨\u0006a"}, d2 = {"Lk8/y0;", "other", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "canBeReused", "(Lk8/y0;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/c6;", "reverse", "Landroid/view/animation/Interpolator;", "androidInterpolator", "(Lk8/c6;Z)Landroid/view/animation/Interpolator;", "Lk8/l7;", "", "widthPx", "heightPx", "Landroid/util/DisplayMetrics;", "metrics", "", "getCornerRadii", "(Lk8/l7;FFLandroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)[F", "containsStateInnerTransitions", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/lq;", "Lk8/lq$c;", "getDefaultState", "(Lk8/lq;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lk8/lq$c;", "Lk8/u8;", "isHorizontal", "(Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "isWrapContainer", "Lk8/ep;", "canWrap", "(Lk8/ep;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Landroid/view/ViewGroup$LayoutParams;", "lp", "", "toLayoutParamsSize", "(Lk8/ep;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/ViewGroup$LayoutParams;)I", "Lk8/y5;", "horizontal", "Lk8/z5;", "vertical", "evaluateGravity", "(Lk8/y5;Lk8/z5;)I", "Lk8/e9;", "Lk8/f9;", "(Lk8/e9;Lk8/f9;)I", "Lk8/g7;", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode", "(Lk8/g7;)Landroid/graphics/PorterDuff$Mode;", "Lk8/df;", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "toImageScale", "(Lk8/df;)Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "Lk8/cb;", "Landroid/graphics/drawable/Drawable;", "toDrawable", "(Lk8/cb;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/drawable/Drawable;", "Lk8/uo;", "(Lk8/uo;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/drawable/Drawable;", "Lk8/ar;", "getWidthPxF", "(Lk8/ar;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)F", "toAlignmentHorizontal", "(Lk8/e9;)Lk8/y5;", "toAlignmentVertical", "(Lk8/f9;)Lk8/z5;", "", "getType", "(Lk8/y0;)Ljava/lang/String;", "type", "getAndroidInterpolator", "(Lk8/c6;)Landroid/view/animation/Interpolator;", "Lk8/b6;", "isReversed", "(Lk8/b6;)Z", "isAlternated", "isBranch", "(Lk8/y0;)Z", "isLeaf", "Lk8/f7;", "getHasSightActions", "(Lk8/f7;)Z", "hasSightActions", "", "Lk8/hx;", "getAllAppearActions", "(Lk8/f7;)Ljava/util/List;", "allAppearActions", "Lk8/ra;", "getAllDisappearActions", "allDisappearActions", "Lk8/dp;", "getAllSightActions", "allSightActions", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivUtilKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[c6.values().length];
            try {
                iArr[c6.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c6.EASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c6.EASE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c6.EASE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c6.EASE_IN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c6.SPRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[b6.values().length];
            try {
                iArr2[b6.REVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b6.ALTERNATE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[b6.ALTERNATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[y5.values().length];
            try {
                iArr3[y5.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[y5.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[y5.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[y5.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[y5.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[z5.values().length];
            try {
                iArr4[z5.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[z5.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[z5.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[e9.values().length];
            try {
                iArr5[e9.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[e9.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[e9.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[e9.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[e9.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[e9.SPACE_AROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[e9.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[e9.SPACE_EVENLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[f9.values().length];
            try {
                iArr6[f9.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[f9.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[f9.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[f9.SPACE_AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[f9.SPACE_BETWEEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[f9.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[f9.BASELINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[g7.values().length];
            try {
                iArr7[g7.SOURCE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[g7.SOURCE_ATOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[g7.DARKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[g7.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr7[g7.MULTIPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr7[g7.SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[df.values().length];
            try {
                iArr8[df.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[df.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[df.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[df.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    @NotNull
    public static final Interpolator androidInterpolator(@NotNull c6 c6Var, boolean z10) {
        return z10 ? ReverseInterpolatorKt.reversed(getAndroidInterpolator(c6Var)) : getAndroidInterpolator(c6Var);
    }

    public static final boolean canBeReused(@NotNull y0 y0Var, @NotNull y0 y0Var2, @NotNull ExpressionResolver expressionResolver) {
        if (!Intrinsics.areEqual(getType(y0Var), getType(y0Var2))) {
            return false;
        }
        f7 f7VarC = y0Var.c();
        f7 f7VarC2 = y0Var2.c();
        return ((f7VarC instanceof te) && (f7VarC2 instanceof te)) ? Intrinsics.areEqual(((te) f7VarC).B.evaluate(expressionResolver), ((te) f7VarC2).B.evaluate(expressionResolver)) : f7VarC.getBackground() == f7VarC2.getBackground();
    }

    private static final boolean canWrap(ep epVar, ExpressionResolver expressionResolver) {
        Expression expression;
        return !(epVar instanceof ep.e) || ((expression = ((ep.e) epVar).c().f90108a) != null && ((Boolean) expression.evaluate(expressionResolver)).booleanValue());
    }

    public static final boolean containsStateInnerTransitions(@NotNull y0 y0Var, @NotNull ExpressionResolver expressionResolver) {
        f7 f7VarC = y0Var.c();
        if (f7VarC.v() != null || f7VarC.j() != null || f7VarC.i() != null) {
            return true;
        }
        if (y0Var instanceof y0.c) {
            List<DivItemBuilderResult> listBuildItems = DivCollectionExtensionsKt.buildItems(((y0.c) y0Var).d(), expressionResolver);
            if ((listBuildItems instanceof Collection) && listBuildItems.isEmpty()) {
                return false;
            }
            for (DivItemBuilderResult divItemBuilderResult : listBuildItems) {
                if (containsStateInnerTransitions(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                    return true;
                }
            }
            return false;
        }
        if (y0Var instanceof y0.g) {
            List<y0> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(((y0.g) y0Var).d());
            if ((nonNullItems instanceof Collection) && nonNullItems.isEmpty()) {
                return false;
            }
            Iterator<T> it = nonNullItems.iterator();
            while (it.hasNext()) {
                if (containsStateInnerTransitions((y0) it.next(), expressionResolver)) {
                    return true;
                }
            }
            return false;
        }
        if ((y0Var instanceof y0.r) || (y0Var instanceof y0.h) || (y0Var instanceof y0.f) || (y0Var instanceof y0.m) || (y0Var instanceof y0.i) || (y0Var instanceof y0.o) || (y0Var instanceof y0.e) || (y0Var instanceof y0.k) || (y0Var instanceof y0.q) || (y0Var instanceof y0.d) || (y0Var instanceof y0.l) || (y0Var instanceof y0.n) || (y0Var instanceof y0.s) || (y0Var instanceof y0.j) || (y0Var instanceof y0.p)) {
            return false;
        }
        throw new m();
    }

    public static final int evaluateGravity(@Nullable y5 y5Var, @Nullable z5 z5Var) {
        int i10;
        int i11 = y5Var == null ? -1 : WhenMappings.$EnumSwitchMapping$2[y5Var.ordinal()];
        if (i11 == 1) {
            i10 = 3;
        } else if (i11 != 2) {
            i10 = 5;
            if (i11 != 3) {
                i10 = (i11 == 4 || i11 != 5) ? 8388611 : GravityCompat.END;
            }
        } else {
            i10 = 1;
        }
        int i12 = z5Var != null ? WhenMappings.$EnumSwitchMapping$3[z5Var.ordinal()] : -1;
        int i13 = 48;
        if (i12 != 1) {
            if (i12 == 2) {
                i13 = 16;
            } else if (i12 == 3) {
                i13 = 80;
            }
        }
        return i13 | i10;
    }

    @NotNull
    public static final List<hx> getAllAppearActions(@NotNull f7 f7Var) {
        List<hx> listA = f7Var.a();
        if (listA != null) {
            return listA;
        }
        hx hxVarT = f7Var.t();
        List<hx> listListOf = hxVarT != null ? CollectionsKt.listOf(hxVarT) : null;
        return listListOf == null ? CollectionsKt.emptyList() : listListOf;
    }

    @NotNull
    public static final List<ra> getAllDisappearActions(@NotNull f7 f7Var) {
        List<ra> listK = f7Var.k();
        return listK == null ? CollectionsKt.emptyList() : listK;
    }

    @NotNull
    public static final List<dp> getAllSightActions(@NotNull f7 f7Var) {
        return CollectionsKt.plus((Collection) getAllDisappearActions(f7Var), (Iterable) getAllAppearActions(f7Var));
    }

    @NotNull
    public static final Interpolator getAndroidInterpolator(@NotNull c6 c6Var) {
        switch (WhenMappings.$EnumSwitchMapping$0[c6Var.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new EaseInterpolator();
            case 3:
                return new EaseInInterpolator();
            case 4:
                return new EaseOutInterpolator();
            case 5:
                return new EaseInOutInterpolator();
            case 6:
                return new SpringInterpolator();
            default:
                throw new m();
        }
    }

    @NotNull
    public static final float[] getCornerRadii(@NotNull l7 l7Var, float f10, float f11, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        g9 g9Var = l7Var.f88756b;
        if (g9Var == null || (expression = g9Var.f87782c) == null) {
            expression = l7Var.f88755a;
        }
        float fDpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics);
        g9 g9Var2 = l7Var.f88756b;
        if (g9Var2 == null || (expression2 = g9Var2.f87783d) == null) {
            expression2 = l7Var.f88755a;
        }
        float fDpToPx2 = BaseDivViewExtensionsKt.dpToPx(expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null, displayMetrics);
        g9 g9Var3 = l7Var.f88756b;
        if (g9Var3 == null || (expression3 = g9Var3.f87780a) == null) {
            expression3 = l7Var.f88755a;
        }
        float fDpToPx3 = BaseDivViewExtensionsKt.dpToPx(expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null, displayMetrics);
        g9 g9Var4 = l7Var.f88756b;
        if (g9Var4 == null || (expression4 = g9Var4.f87781b) == null) {
            expression4 = l7Var.f88755a;
        }
        float fDpToPx4 = BaseDivViewExtensionsKt.dpToPx(expression4 != null ? (Long) expression4.evaluate(expressionResolver) : null, displayMetrics);
        Float f12 = (Float) Collections.min(CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f10 / (fDpToPx + fDpToPx2)), Float.valueOf(f10 / (fDpToPx3 + fDpToPx4)), Float.valueOf(f11 / (fDpToPx + fDpToPx3)), Float.valueOf(f11 / (fDpToPx2 + fDpToPx4))}));
        if (f12.floatValue() > 0.0f && f12.floatValue() < 1.0f) {
            fDpToPx *= f12.floatValue();
            fDpToPx2 *= f12.floatValue();
            fDpToPx3 *= f12.floatValue();
            fDpToPx4 *= f12.floatValue();
        }
        return new float[]{fDpToPx, fDpToPx, fDpToPx2, fDpToPx2, fDpToPx4, fDpToPx4, fDpToPx3, fDpToPx3};
    }

    @Nullable
    public static final lq.c getDefaultState(@NotNull lq lqVar, @NotNull ExpressionResolver expressionResolver) {
        Object next;
        Expression expression = lqVar.f88871n;
        if (expression != null) {
            Iterator it = lqVar.I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((lq.c) next).f88890d, expression.evaluate(expressionResolver))) {
                    break;
                }
            }
            lq.c cVar = (lq.c) next;
            if (cVar != null) {
                return cVar;
            }
        }
        return (lq.c) CollectionsKt.firstOrNull(lqVar.I);
    }

    public static final boolean getHasSightActions(@NotNull f7 f7Var) {
        if (f7Var.t() != null) {
            return true;
        }
        List listA = f7Var.a();
        if (listA != null && !listA.isEmpty()) {
            return true;
        }
        List listK = f7Var.k();
        return (listK == null || listK.isEmpty()) ? false : true;
    }

    @NotNull
    public static final String getType(@NotNull y0 y0Var) {
        if (y0Var instanceof y0.r) {
            return "text";
        }
        if (y0Var instanceof y0.h) {
            return "image";
        }
        if (y0Var instanceof y0.f) {
            return "gif";
        }
        if (y0Var instanceof y0.m) {
            return "separator";
        }
        if (y0Var instanceof y0.i) {
            return "indicator";
        }
        if (y0Var instanceof y0.n) {
            return "slider";
        }
        if (y0Var instanceof y0.j) {
            return "input";
        }
        if (y0Var instanceof y0.s) {
            return "video";
        }
        if (y0Var instanceof y0.c) {
            return "container";
        }
        if (y0Var instanceof y0.g) {
            return "grid";
        }
        if (y0Var instanceof y0.o) {
            return "state";
        }
        if (y0Var instanceof y0.e) {
            return "gallery";
        }
        if (y0Var instanceof y0.k) {
            return "pager";
        }
        if (y0Var instanceof y0.q) {
            return "tabs";
        }
        if (y0Var instanceof y0.d) {
            return "custom";
        }
        if (y0Var instanceof y0.l) {
            return "select";
        }
        if (y0Var instanceof y0.p) {
            return "switch";
        }
        throw new m();
    }

    private static final float getWidthPxF(ar arVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.unitToPxF((Number) arVar.f86316d.evaluate(expressionResolver), displayMetrics, (jp) arVar.f86315c.evaluate(expressionResolver));
    }

    public static final boolean isAlternated(@NotNull b6 b6Var) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[b6Var.ordinal()];
        return i10 == 2 || i10 == 3;
    }

    public static final boolean isBranch(@NotNull y0 y0Var) {
        if ((y0Var instanceof y0.r) || (y0Var instanceof y0.h) || (y0Var instanceof y0.f) || (y0Var instanceof y0.m) || (y0Var instanceof y0.i) || (y0Var instanceof y0.n) || (y0Var instanceof y0.j) || (y0Var instanceof y0.d) || (y0Var instanceof y0.l) || (y0Var instanceof y0.s) || (y0Var instanceof y0.p)) {
            return false;
        }
        if ((y0Var instanceof y0.c) || (y0Var instanceof y0.g) || (y0Var instanceof y0.e) || (y0Var instanceof y0.k) || (y0Var instanceof y0.q) || (y0Var instanceof y0.o)) {
            return true;
        }
        throw new m();
    }

    public static final boolean isHorizontal(@NotNull u8 u8Var, @NotNull ExpressionResolver expressionResolver) {
        return u8Var.I.evaluate(expressionResolver) == u8.d.HORIZONTAL;
    }

    public static final boolean isLeaf(@NotNull y0 y0Var) {
        return !isBranch(y0Var);
    }

    public static final boolean isReversed(@NotNull b6 b6Var) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[b6Var.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public static final boolean isWrapContainer(@NotNull u8 u8Var, @NotNull ExpressionResolver expressionResolver) {
        if (u8Var.C.evaluate(expressionResolver) != u8.c.WRAP || u8Var.I.evaluate(expressionResolver) == u8.d.OVERLAP) {
            return false;
        }
        if (isHorizontal(u8Var, expressionResolver)) {
            return canWrap(u8Var.getWidth(), expressionResolver);
        }
        if (canWrap(u8Var.getHeight(), expressionResolver)) {
            return true;
        }
        w6 w6Var = u8Var.f91599i;
        if (w6Var != null) {
            return !(((float) ((Number) w6Var.f92110a.evaluate(expressionResolver)).doubleValue()) == 0.0f);
        }
        return false;
    }

    @NotNull
    public static final y5 toAlignmentHorizontal(@NotNull e9 e9Var) {
        int i10 = WhenMappings.$EnumSwitchMapping$4[e9Var.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? y5.START : y5.END : y5.START : y5.RIGHT : y5.CENTER : y5.LEFT;
    }

    @NotNull
    public static final z5 toAlignmentVertical(@NotNull f9 f9Var) {
        int i10 = WhenMappings.$EnumSwitchMapping$5[f9Var.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 7 ? z5.TOP : z5.BASELINE : z5.BOTTOM : z5.CENTER : z5.TOP;
    }

    @Nullable
    public static final Drawable toDrawable(@NotNull cb cbVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        if (cbVar instanceof cb.c) {
            return toDrawable(((cb.c) cbVar).c(), displayMetrics, expressionResolver);
        }
        throw new m();
    }

    @NotNull
    public static final AspectImageView.Scale toImageScale(@NotNull df dfVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$7[dfVar.ordinal()];
        if (i10 == 1) {
            return AspectImageView.Scale.NO_SCALE;
        }
        if (i10 == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (i10 == 3) {
            return AspectImageView.Scale.FILL;
        }
        if (i10 == 4) {
            return AspectImageView.Scale.STRETCH;
        }
        throw new m();
    }

    public static final int toLayoutParamsSize(@Nullable ep epVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (epVar == null) {
            return -2;
        }
        if (epVar instanceof ep.d) {
            return -1;
        }
        if (epVar instanceof ep.c) {
            return BaseDivViewExtensionsKt.toPx(((ep.c) epVar).c(), displayMetrics, expressionResolver);
        }
        if (!(epVar instanceof ep.e)) {
            throw new m();
        }
        Expression expression = ((ep.e) epVar).c().f90108a;
        return (expression != null && ((Boolean) expression.evaluate(expressionResolver)).booleanValue() && (layoutParams instanceof DivLayoutParams)) ? -3 : -2;
    }

    public static /* synthetic */ int toLayoutParamsSize$default(ep epVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        return toLayoutParamsSize(epVar, displayMetrics, expressionResolver, layoutParams);
    }

    @NotNull
    public static final PorterDuff.Mode toPorterDuffMode(@NotNull g7 g7Var) {
        switch (WhenMappings.$EnumSwitchMapping$6[g7Var.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new m();
        }
    }

    @Nullable
    public static final Drawable toDrawable(@NotNull uo uoVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        to toVar = uoVar.f91704b;
        if (toVar instanceof to.d) {
            to.d dVar = (to.d) toVar;
            float pxF = BaseDivViewExtensionsKt.toPxF(dVar.c().f87843d, displayMetrics, expressionResolver);
            float pxF2 = BaseDivViewExtensionsKt.toPxF(dVar.c().f87842c, displayMetrics, expressionResolver);
            Expression expression3 = dVar.c().f87840a;
            if (expression3 == null) {
                expression3 = uoVar.f91703a;
            }
            int iIntValue = ((Number) expression3.evaluate(expressionResolver)).intValue();
            float pxF3 = BaseDivViewExtensionsKt.toPxF(dVar.c().f87841b, displayMetrics, expressionResolver);
            ar arVar = dVar.c().f87844e;
            if (arVar == null) {
                arVar = uoVar.f91705c;
            }
            Integer num = (arVar == null || (expression2 = arVar.f86313a) == null) ? null : (Integer) expression2.evaluate(expressionResolver);
            ar arVar2 = dVar.c().f87844e;
            if (arVar2 == null) {
                arVar2 = uoVar.f91705c;
            }
            return new RoundedRectDrawable(new RoundedRectDrawable.Params(pxF, pxF2, iIntValue, pxF3, num, arVar2 != null ? Float.valueOf(getWidthPxF(arVar2, displayMetrics, expressionResolver)) : null));
        }
        if (!(toVar instanceof to.a)) {
            return null;
        }
        to.a aVar = (to.a) toVar;
        float pxF4 = BaseDivViewExtensionsKt.toPxF(aVar.c().f86907b, displayMetrics, expressionResolver);
        Expression expression4 = aVar.c().f86906a;
        if (expression4 == null) {
            expression4 = uoVar.f91703a;
        }
        int iIntValue2 = ((Number) expression4.evaluate(expressionResolver)).intValue();
        ar arVar3 = aVar.c().f86908c;
        if (arVar3 == null) {
            arVar3 = uoVar.f91705c;
        }
        Integer num2 = (arVar3 == null || (expression = arVar3.f86313a) == null) ? null : (Integer) expression.evaluate(expressionResolver);
        ar arVar4 = aVar.c().f86908c;
        if (arVar4 == null) {
            arVar4 = uoVar.f91705c;
        }
        return new CircleDrawable(new CircleDrawable.Params(pxF4, iIntValue2, num2, arVar4 != null ? Float.valueOf(getWidthPxF(arVar4, displayMetrics, expressionResolver)) : null));
    }

    public static final int evaluateGravity(@Nullable e9 e9Var, @Nullable f9 f9Var) {
        int i10 = e9Var == null ? -1 : WhenMappings.$EnumSwitchMapping$4[e9Var.ordinal()];
        int i11 = GravityCompat.START;
        switch (i10) {
            case 1:
                i11 = 3;
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 5;
                break;
            case 5:
                i11 = GravityCompat.END;
                break;
            case 6:
                i11 = 16777216;
                break;
            case 7:
                i11 = 33554432;
                break;
            case 8:
                i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                break;
        }
        int i12 = 48;
        switch (f9Var != null ? WhenMappings.$EnumSwitchMapping$5[f9Var.ordinal()] : -1) {
            case 2:
                i12 = 16;
                break;
            case 3:
                i12 = 80;
                break;
            case 4:
                i12 = 268435456;
                break;
            case 5:
                i12 = 536870912;
                break;
            case 6:
                i12 = 1073741824;
                break;
        }
        return i12 | i11;
    }
}
