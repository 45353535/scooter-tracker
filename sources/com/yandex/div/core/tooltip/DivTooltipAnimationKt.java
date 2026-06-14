package com.yandex.div.core.tooltip;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;
import com.ironsource.C4240b4;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.a6;
import k8.c6;
import k8.dv;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\t\u001a'\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroid/widget/PopupWindow;", "Lk8/dv;", "divTooltip", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "setupAnimation", "(Landroid/widget/PopupWindow;Lk8/dv;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "clearAnimation", "(Landroid/widget/PopupWindow;)V", "removeTransition", "Landroid/transition/TransitionSet;", "kotlin.jvm.PlatformType", "defaultTransition", "(Lk8/dv;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/transition/TransitionSet;", "Lk8/a6;", "Lk8/dv$c;", C4240b4.i.L, "", "incoming", "Landroid/transition/Transition;", "toTransition", "(Lk8/a6;Lk8/dv$c;ZLcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/transition/Transition;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTooltipAnimationKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a6.c.values().length];
            try {
                iArr[a6.c.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a6.c.TRANSLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a6.c.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a6.c.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a6.c.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a6.c.NO_ANIMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void clearAnimation(@NotNull PopupWindow popupWindow) {
        removeTransition(popupWindow);
    }

    private static final TransitionSet defaultTransition(dv dvVar, ExpressionResolver expressionResolver) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new TranslateAnimation((dv.c) dvVar.f87092j.evaluate(expressionResolver), null, 2, null)).setInterpolator((TimeInterpolator) new SpringInterpolator());
    }

    @RequiresApi(23)
    private static final void removeTransition(PopupWindow popupWindow) {
        popupWindow.setEnterTransition(null);
        popupWindow.setExitTransition(null);
    }

    public static final void setupAnimation(@NotNull PopupWindow popupWindow, @NotNull dv dvVar, @NotNull ExpressionResolver expressionResolver) {
        a6 a6Var = dvVar.f87083a;
        popupWindow.setEnterTransition(a6Var != null ? toTransition(a6Var, (dv.c) dvVar.f87092j.evaluate(expressionResolver), true, expressionResolver) : defaultTransition(dvVar, expressionResolver));
        a6 a6Var2 = dvVar.f87084b;
        popupWindow.setExitTransition(a6Var2 != null ? toTransition(a6Var2, (dv.c) dvVar.f87092j.evaluate(expressionResolver), false, expressionResolver) : defaultTransition(dvVar, expressionResolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.TranslateAnimation] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.Scale] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    private static final Transition toTransition(a6 a6Var, dv.c cVar, boolean z10, ExpressionResolver expressionResolver) {
        ?? fade;
        Transition duration;
        switch (WhenMappings.$EnumSwitchMapping$0[((a6.c) a6Var.f86196e.evaluate(expressionResolver)).ordinal()]) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                Expression expression = z10 ? a6Var.f86199h : a6Var.f86193b;
                fade = new TranslateAnimation(cVar, expression != null ? Float.valueOf((float) ((Number) expression.evaluate(expressionResolver)).doubleValue()) : null);
                break;
            case 3:
                Expression expression2 = z10 ? a6Var.f86199h : a6Var.f86193b;
                fade = new Scale(expression2 != null ? (float) ((Number) expression2.evaluate(expressionResolver)).doubleValue() : 1.0f);
                break;
            case 4:
                fade = new TransitionSet();
                List list = a6Var.f86195d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(toTransition((a6) it.next(), cVar, z10, expressionResolver));
                    }
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                throw new m();
        }
        if (fade == 0 || (duration = fade.setDuration(((Number) a6Var.f86192a.evaluate(expressionResolver)).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(DivUtilKt.getAndroidInterpolator((c6) a6Var.f86194c.evaluate(expressionResolver)));
    }
}
