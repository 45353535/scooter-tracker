package com.yandex.div.core.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import androidx.activity.s;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.b6;
import k8.bj;
import k8.c6;
import k8.fw;
import k8.h6;
import k8.i6;
import k8.j1;
import k8.k1;
import k8.n9;
import k8.p8;
import kotlin.Metadata;
import kotlin.ranges.g;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/core/animation/DivVariableAnimatorBuilder;", "", "<init>", "()V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lk8/bj;", "animator", "Lk8/k1;", "startAction", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroid/animation/Animator;", "buildNumberAnimator", "(Lcom/yandex/div/core/view2/Div2View;Lk8/bj;Lk8/k1;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/animation/Animator;", "Lcom/yandex/div/data/Variable$IntegerVariable;", "variable", "buildIntegerAnimator", "(Lcom/yandex/div/core/view2/Div2View;Lk8/bj;Lk8/k1;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/data/Variable$IntegerVariable;)Landroid/animation/Animator;", "Lcom/yandex/div/data/Variable$DoubleVariable;", "buildDoubleAnimator", "(Lcom/yandex/div/core/view2/Div2View;Lk8/bj;Lk8/k1;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/data/Variable$DoubleVariable;)Landroid/animation/Animator;", "Lk8/p8;", "buildColorAnimator", "(Lcom/yandex/div/core/view2/Div2View;Lk8/p8;Lk8/k1;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/animation/Animator;", "Landroid/animation/ObjectAnimator;", "Lk8/i6;", "configure", "(Landroid/animation/ObjectAnimator;Lcom/yandex/div/core/view2/Div2View;Lk8/i6;Lk8/k1;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/animation/ObjectAnimator;", "Lk8/h6;", "expressionResolver", "build", "(Lcom/yandex/div/core/view2/Div2View;Lk8/h6;Lk8/k1;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/animation/Animator;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivVariableAnimatorBuilder {

    @NotNull
    public static final DivVariableAnimatorBuilder INSTANCE = new DivVariableAnimatorBuilder();

    private DivVariableAnimatorBuilder() {
    }

    private final Animator buildColorAnimator(Div2View divView, p8 animator, k1 startAction, ExpressionResolver resolver) {
        Integer numColorIntValue;
        Integer numColorIntValue2;
        String strG = animator.g();
        VariableController variableController = UtilsKt.getVariableController(resolver);
        Integer num = null;
        Variable mutableVariable = variableController != null ? variableController.getMutableVariable(strG) : null;
        if (!(mutableVariable instanceof Variable.ColorVariable)) {
            mutableVariable = null;
        }
        Variable.ColorVariable colorVariable = (Variable.ColorVariable) mutableVariable;
        if (colorVariable == null) {
            DivActionTypedUtilsKt.logError(divView, new MissingVariableException("Unable to find color variable with name '" + animator.g() + '\'', null, 2, null));
            return null;
        }
        fw fwVar = startAction.f88554h;
        if (fwVar == null || (numColorIntValue2 = DivActionTypedUtilsKt.colorIntValue(fwVar, resolver)) == null) {
            Expression expression = animator.f90342j;
            if (expression != null) {
                num = (Integer) expression.evaluate(resolver);
            }
        } else {
            num = numColorIntValue2;
        }
        fw fwVar2 = startAction.f88550d;
        int iIntValue = (fwVar2 == null || (numColorIntValue = DivActionTypedUtilsKt.colorIntValue(fwVar2, resolver)) == null) ? ((Number) animator.f90337e.evaluate(resolver)).intValue() : numColorIntValue.intValue();
        if (num != null) {
            colorVariable.setValueDirectly(Color.m7659boximpl(Color.m7660constructorimpl(num.intValue())));
        }
        return configure(ObjectAnimator.ofArgb(colorVariable, ColorIntValueProperty.INSTANCE, iIntValue), divView, animator, startAction, resolver);
    }

    private final Animator buildDoubleAnimator(Div2View divView, bj animator, k1 startAction, ExpressionResolver resolver, Variable.DoubleVariable variable) {
        Double dDoubleValue;
        Double dDoubleValue2;
        fw fwVar = startAction.f88554h;
        if (fwVar == null || (dDoubleValue = DivActionTypedUtilsKt.doubleValue(fwVar, resolver)) == null) {
            Expression expression = animator.f86539j;
            dDoubleValue = expression != null ? (Double) expression.evaluate(resolver) : null;
        }
        fw fwVar2 = startAction.f88550d;
        double dDoubleValue3 = (fwVar2 == null || (dDoubleValue2 = DivActionTypedUtilsKt.doubleValue(fwVar2, resolver)) == null) ? ((Number) animator.f86534e.evaluate(resolver)).doubleValue() : dDoubleValue2.doubleValue();
        if (dDoubleValue != null) {
            variable.setValueDirectly(dDoubleValue);
        }
        return configure(ObjectAnimator.ofFloat(variable, NumberValueProperty.INSTANCE, (float) dDoubleValue3), divView, animator, startAction, resolver);
    }

    private final Animator buildIntegerAnimator(Div2View divView, bj animator, k1 startAction, ExpressionResolver resolver, Variable.IntegerVariable variable) {
        Object objEvaluate;
        Object objEvaluate2;
        fw fwVar = startAction.f88554h;
        if (fwVar == null || (objEvaluate = DivActionTypedUtilsKt.longValue(fwVar, resolver)) == null) {
            Expression expression = animator.f86539j;
            objEvaluate = expression != null ? expression.evaluate(resolver) : null;
        }
        fw fwVar2 = startAction.f88550d;
        if (fwVar2 == null || (objEvaluate2 = DivActionTypedUtilsKt.longValue(fwVar2, resolver)) == null) {
            objEvaluate2 = animator.f86534e.evaluate(resolver);
        }
        if (objEvaluate != null) {
            variable.setValueDirectly(objEvaluate);
        }
        return configure(ObjectAnimator.ofInt(variable, IntegerValueProperty.INSTANCE, ((Number) objEvaluate2).intValue()), divView, animator, startAction, resolver);
    }

    private final Animator buildNumberAnimator(Div2View divView, bj animator, k1 startAction, ExpressionResolver resolver) {
        String strG = animator.g();
        VariableController variableController = UtilsKt.getVariableController(resolver);
        Variable mutableVariable = variableController != null ? variableController.getMutableVariable(strG) : null;
        if (!s.a(mutableVariable)) {
            mutableVariable = null;
        }
        if (mutableVariable instanceof Variable.IntegerVariable) {
            return buildIntegerAnimator(divView, animator, startAction, resolver, (Variable.IntegerVariable) mutableVariable);
        }
        if (mutableVariable instanceof Variable.DoubleVariable) {
            return buildDoubleAnimator(divView, animator, startAction, resolver, (Variable.DoubleVariable) mutableVariable);
        }
        DivActionTypedUtilsKt.logError(divView, new MissingVariableException("Unable to find number variable with name '" + animator.g() + '\'', null, 2, null));
        return null;
    }

    private final ObjectAnimator configure(ObjectAnimator objectAnimator, final Div2View div2View, i6 i6Var, k1 k1Var, final ExpressionResolver expressionResolver) {
        b6 b6Var;
        c6 c6Var;
        int iE;
        Expression expression = k1Var.f88548b;
        if (expression == null || (b6Var = (b6) expression.evaluate(expressionResolver)) == null) {
            b6Var = (b6) i6Var.getDirection().evaluate(expressionResolver);
        }
        Expression duration = k1Var.f88549c;
        if (duration == null) {
            duration = i6Var.getDuration();
        }
        objectAnimator.setDuration(((Number) duration.evaluate(expressionResolver)).longValue());
        Expression expressionE = k1Var.f88553g;
        if (expressionE == null) {
            expressionE = i6Var.e();
        }
        objectAnimator.setStartDelay(((Number) expressionE.evaluate(expressionResolver)).longValue());
        Expression expression2 = k1Var.f88551e;
        if (expression2 == null || (c6Var = (c6) expression2.evaluate(expressionResolver)) == null) {
            c6Var = (c6) i6Var.c().evaluate(expressionResolver);
        }
        objectAnimator.setInterpolator(DivUtilKt.androidInterpolator(c6Var, DivUtilKt.isReversed(b6Var)));
        n9 n9VarB = k1Var.f88552f;
        if (n9VarB == null) {
            n9VarB = i6Var.b();
        }
        if (n9VarB instanceof n9.c) {
            iE = g.e(((int) ((Number) ((n9.c) n9VarB).c().f88983a.evaluate(expressionResolver)).longValue()) - 1, 0);
        } else {
            if (!(n9VarB instanceof n9.d)) {
                throw new m();
            }
            iE = -1;
        }
        objectAnimator.setRepeatCount(iE);
        objectAnimator.setRepeatMode(DivUtilKt.isAlternated(b6Var) ? 2 : 1);
        final List listD = i6Var.d();
        if (listD != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((j1) it.next(), "animation_end", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        final List listA = i6Var.a();
        if (listA != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$5$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((j1) it.next(), "animation_cancel", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        return objectAnimator;
    }

    @Nullable
    public final Animator build(@NotNull Div2View divView, @NotNull h6 animator, @NotNull k1 startAction, @NotNull ExpressionResolver expressionResolver) {
        if (animator instanceof h6.d) {
            return buildNumberAnimator(divView, ((h6.d) animator).c(), startAction, expressionResolver);
        }
        if (animator instanceof h6.a) {
            return buildColorAnimator(divView, ((h6.a) animator).c(), startAction, expressionResolver);
        }
        throw new m();
    }
}
