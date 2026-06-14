package com.yandex.div.core.view2.animations;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.a6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010&\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010'\"\u001a\u0010)\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/transition/Transition;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/ViewGroup;", "sceneRoot", "Landroidx/transition/TransitionValues;", "values", "", "positionKey", "getViewForAnimate", "(Landroidx/transition/Transition;Landroid/view/View;Landroid/view/ViewGroup;Landroidx/transition/TransitionValues;Ljava/lang/String;)Landroid/view/View;", "transitionValues", "Lkotlin/Function1;", "", "", "savePosition", "capturePosition", "(Landroidx/transition/TransitionValues;Lkotlin/jvm/functions/Function1;)V", "Lk8/a6;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "asTouchListener", "(Lk8/a6;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;)Lkotlin/jvm/functions/Function2;", "resolver", "", "reverse", "Landroid/view/animation/Animation;", "toAnimation", "(Lk8/a6;Lcom/yandex/div/json/expressions/ExpressionResolver;ZLandroid/view/View;)Landroid/view/animation/Animation;", "", "startValue", "endValue", "Landroid/view/animation/ScaleAnimation;", "createScaleAnimation", "(FF)Landroid/view/animation/ScaleAnimation;", "", "alphaValue", "(Ljava/lang/Double;)Ljava/lang/Float;", "scaleValue", "DEFAULT_CLICK_ANIMATION", "Lk8/a6;", "getDEFAULT_CLICK_ANIMATION", "()Lk8/a6;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class UtilsKt {

    @NotNull
    private static final a6 DEFAULT_CLICK_ANIMATION;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a6.c.values().length];
            try {
                iArr[a6.c.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a6.c.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a6.c.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a6.c.NO_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DEFAULT_CLICK_ANIMATION = new a6(Expression.Companion.constant$default(companion, 100L, null, 2, null), Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null), null, null, Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null), null, null, Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null), 108, null);
    }

    private static final Float alphaValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(g.m((float) d10.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    @Nullable
    public static final Function2<View, MotionEvent, Unit> asTouchListener(@NotNull a6 a6Var, @NotNull ExpressionResolver expressionResolver, @NotNull View view) {
        final Animation animation$default = toAnimation$default(a6Var, expressionResolver, false, view, 2, null);
        final Animation animation$default2 = toAnimation$default(a6Var, expressionResolver, true, null, 4, null);
        if (animation$default == null && animation$default2 == null) {
            return null;
        }
        return new Function2<View, MotionEvent, Unit>() { // from class: com.yandex.div.core.view2.animations.UtilsKt.asTouchListener.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(View view2, MotionEvent motionEvent) {
                invoke2(view2, motionEvent);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view2, @NotNull MotionEvent motionEvent) {
                Animation animation;
                if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        Animation animation2 = animation$default;
                        if (animation2 != null) {
                            view2.startAnimation(animation2);
                            return;
                        }
                        return;
                    }
                    if ((action == 1 || action == 3) && (animation = animation$default2) != null) {
                        view2.startAnimation(animation);
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    public static final void capturePosition(@NotNull TransitionValues transitionValues, @NotNull Function1<? super int[], Unit> function1) {
        ?? r02 = new int[2];
        transitionValues.view.getLocationOnScreen(r02);
        function1.invoke(r02);
    }

    private static final ScaleAnimation createScaleAnimation(float f10, float f11) {
        return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
    }

    @NotNull
    public static final a6 getDEFAULT_CLICK_ANIMATION() {
        return DEFAULT_CLICK_ANIMATION;
    }

    @NotNull
    public static final View getViewForAnimate(@NotNull Transition transition, @NotNull View view, @NotNull ViewGroup viewGroup, @NotNull TransitionValues transitionValues, @NotNull String str) {
        if (Intrinsics.areEqual(transitionValues.view, view) || !ViewsKt.isActuallyLaidOut(view)) {
            return view;
        }
        Object obj = transitionValues.values.get(str);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, transition, (int[]) obj);
    }

    private static final Float scaleValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(g.d((float) d10.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable, kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.animation.Animation toAnimation(k8.a6 r9, com.yandex.div.json.expressions.ExpressionResolver r10, boolean r11, android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.animations.UtilsKt.toAnimation(k8.a6, com.yandex.div.json.expressions.ExpressionResolver, boolean, android.view.View):android.view.animation.Animation");
    }

    static /* synthetic */ Animation toAnimation$default(a6 a6Var, ExpressionResolver expressionResolver, boolean z10, View view, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            view = null;
        }
        return toAnimation(a6Var, expressionResolver, z10, view);
    }
}
