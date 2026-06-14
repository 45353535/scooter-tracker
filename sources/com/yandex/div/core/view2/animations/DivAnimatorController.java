package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.animation.DivVariableAnimatorBuilder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.f7;
import k8.h6;
import k8.k1;
import k8.y0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR,\u0010!\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001f\u0012\u0004\u0012\u00020 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivAnimatorController;", "", "Lcom/yandex/div/core/view2/Div2View;", "divView", "<init>", "(Lcom/yandex/div/core/view2/Div2View;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "animatorId", "Lk8/h6;", "findAnimator", "(Landroid/view/View;Ljava/lang/String;)Lk8/h6;", "", "animators", "(Ljava/util/List;Ljava/lang/String;)Lk8/h6;", "scopeId", "targetView", "Lk8/k1;", "action", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "startAnimator", "(Ljava/lang/String;Landroid/view/View;Lk8/k1;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "stopAnimator", "(Ljava/lang/String;Ljava/lang/String;)V", "onDetachedFromWindow", "()V", "Lcom/yandex/div/core/view2/Div2View;", "", "Lkotlin/Pair;", "Landroid/animation/Animator;", "runningAnimators", "Ljava/util/Map;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivAnimatorController {

    @NotNull
    private final Div2View divView;

    @NotNull
    private final Map<Pair<String, String>, Animator> runningAnimators = new LinkedHashMap();

    public DivAnimatorController(@NotNull Div2View div2View) {
        this.divView = div2View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final h6 findAnimator(View view, String animatorId) {
        f7 f7VarC;
        if (view instanceof DivHolderView) {
            y0 div = ((DivHolderView) view).getDiv();
            h6 h6VarFindAnimator = findAnimator((List<? extends h6>) ((div == null || (f7VarC = div.c()) == null) ? null : f7VarC.w()), animatorId);
            if (h6VarFindAnimator != null) {
                return h6VarFindAnimator;
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return findAnimator(view2, animatorId);
            }
            return null;
        }
        if (!(view instanceof Div2View)) {
            Object parent2 = view.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            if (view3 != null) {
                return findAnimator(view3, animatorId);
            }
            return null;
        }
        DivActionTypedUtilsKt.logWarning(this.divView, new RuntimeException("Unable to find animator with id '" + animatorId + '\''));
        return null;
    }

    public final void onDetachedFromWindow() {
        Iterator it = new ArrayList(this.runningAnimators.values()).iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        this.runningAnimators.clear();
    }

    public final void startAnimator(@NotNull String scopeId, @NotNull View targetView, @NotNull k1 action, @NotNull ExpressionResolver resolver) {
        Animator animatorRemove;
        String str = action.f88547a;
        h6 h6VarFindAnimator = findAnimator(targetView, str);
        if (h6VarFindAnimator == null) {
            return;
        }
        final Pair<String, String> pair = TuplesKt.to(scopeId, str);
        if (this.runningAnimators.containsKey(pair) && (animatorRemove = this.runningAnimators.remove(pair)) != null) {
            animatorRemove.cancel();
        }
        Animator animatorBuild = DivVariableAnimatorBuilder.INSTANCE.build(this.divView, h6VarFindAnimator, action, resolver);
        if (animatorBuild == null) {
            return;
        }
        animatorBuild.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                this.this$0.runningAnimators.remove(pair);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorBuild.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                this.this$0.runningAnimators.remove(pair);
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
        this.runningAnimators.put(pair, animatorBuild);
        animatorBuild.start();
    }

    public final void stopAnimator(@NotNull String scopeId, @NotNull String animatorId) {
        Animator animatorRemove = this.runningAnimators.remove(TuplesKt.to(scopeId, animatorId));
        if (animatorRemove == null) {
            return;
        }
        animatorRemove.cancel();
    }

    private final h6 findAnimator(List<? extends h6> animators, String animatorId) {
        if (animators == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : animators) {
            if (Intrinsics.areEqual(((h6) obj).b().getId(), animatorId)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() <= 1) {
            return (h6) CollectionsKt.first((List) arrayList);
        }
        return null;
    }
}
