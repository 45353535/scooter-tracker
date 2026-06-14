package com.yandex.div.core.view2;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.Slide;
import com.yandex.div.core.view2.animations.TransitionsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.c6;
import k8.oa;
import k8.op;
import k8.r6;
import k8.y7;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0012¢\u0006\u0004\b\u0011\u0010\u0010J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0012¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0014*\u00020\u0018H\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0016\u001a\u00020\u000e*\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000bH\u0012¢\u0006\u0004\b\u0016\u0010\u001cJ?\u0010\"\u001a\u00020!2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J+\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010+\u001a\u00020(8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/yandex/div/core/view2/DivTransitionBuilder;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/view2/DivViewIdProvider;", "viewIdProvider", "<init>", "(Landroid/content/Context;Lcom/yandex/div/core/view2/DivViewIdProvider;)V", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "itemSequence", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "Landroidx/transition/Transition;", "buildOutgoingTransitions", "(Lkotlin/sequences/Sequence;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "buildChangeTransitions", "buildIncomingTransitions", "Lk8/r6;", "", "transitionMode", "toAndroidTransition", "(Lk8/r6;ILcom/yandex/div/json/expressions/ExpressionResolver;)Landroidx/transition/Transition;", "Lk8/op$c;", "toGravity", "(Lk8/op$c;)I", "Lk8/y7;", "(Lk8/y7;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroidx/transition/Transition;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "fromResolver", "toResolver", "Landroidx/transition/TransitionSet;", "buildTransitions", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroidx/transition/TransitionSet;", "divAppearanceTransition", "createAndroidTransition", "Landroid/content/Context;", "Lcom/yandex/div/core/view2/DivViewIdProvider;", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayMetrics", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivTransitionBuilder {

    @NotNull
    private final Context context;

    @NotNull
    private final DivViewIdProvider viewIdProvider;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[op.c.values().length];
            try {
                iArr[op.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[op.c.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[op.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[op.c.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivTransitionBuilder(@NotNull Context context, @NotNull DivViewIdProvider divViewIdProvider) {
        this.context = context;
        this.viewIdProvider = divViewIdProvider;
    }

    private List<Transition> buildChangeTransitions(Sequence<DivItemBuilderResult> itemSequence, ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : itemSequence) {
            String id2 = divItemBuilderResult.getDiv().c().getId();
            y7 y7VarJ = divItemBuilderResult.getDiv().c().j();
            if (id2 != null && y7VarJ != null) {
                Transition androidTransition = toAndroidTransition(y7VarJ, resolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id2));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<Transition> buildIncomingTransitions(Sequence<DivItemBuilderResult> itemSequence, ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : itemSequence) {
            String id2 = divItemBuilderResult.getDiv().c().getId();
            r6 r6VarV = divItemBuilderResult.getDiv().c().v();
            if (id2 != null && r6VarV != null) {
                Transition androidTransition = toAndroidTransition(r6VarV, 1, resolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id2));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<Transition> buildOutgoingTransitions(Sequence<DivItemBuilderResult> itemSequence, ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : itemSequence) {
            String id2 = divItemBuilderResult.getDiv().c().getId();
            r6 r6VarI = divItemBuilderResult.getDiv().c().i();
            if (id2 != null && r6VarI != null) {
                Transition androidTransition = toAndroidTransition(r6VarI, 2, resolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id2));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    private Transition toAndroidTransition(r6 r6Var, int i10, ExpressionResolver expressionResolver) {
        if (r6Var instanceof r6.e) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator it = ((r6.e) r6Var).c().f90003a.iterator();
            while (it.hasNext()) {
                Transition androidTransition = toAndroidTransition((r6) it.next(), i10, expressionResolver);
                transitionSet.setDuration(Math.max(transitionSet.getDuration(), androidTransition.getStartDelay() + androidTransition.getDuration()));
                transitionSet.addTransition(androidTransition);
            }
            return transitionSet;
        }
        if (r6Var instanceof r6.c) {
            r6.c cVar = (r6.c) r6Var;
            Fade fade = new Fade((float) ((Number) cVar.c().f92147a.evaluate(expressionResolver)).doubleValue());
            fade.setMode(i10);
            fade.setDuration(((Number) cVar.c().b().evaluate(expressionResolver)).longValue());
            fade.setStartDelay(((Number) cVar.c().d().evaluate(expressionResolver)).longValue());
            fade.setInterpolator(DivUtilKt.getAndroidInterpolator((c6) cVar.c().c().evaluate(expressionResolver)));
            return fade;
        }
        if (r6Var instanceof r6.d) {
            r6.d dVar = (r6.d) r6Var;
            Scale scale = new Scale((float) ((Number) dVar.c().f88501e.evaluate(expressionResolver)).doubleValue(), (float) ((Number) dVar.c().f88499c.evaluate(expressionResolver)).doubleValue(), (float) ((Number) dVar.c().f88500d.evaluate(expressionResolver)).doubleValue());
            scale.setMode(i10);
            scale.setDuration(((Number) dVar.c().b().evaluate(expressionResolver)).longValue());
            scale.setStartDelay(((Number) dVar.c().d().evaluate(expressionResolver)).longValue());
            scale.setInterpolator(DivUtilKt.getAndroidInterpolator((c6) dVar.c().c().evaluate(expressionResolver)));
            return scale;
        }
        if (!(r6Var instanceof r6.f)) {
            throw new m();
        }
        r6.f fVar = (r6.f) r6Var;
        oa oaVar = fVar.c().f90245a;
        Slide slide = new Slide(oaVar != null ? BaseDivViewExtensionsKt.toPx(oaVar, getDisplayMetrics(), expressionResolver) : -1, toGravity((op.c) fVar.c().f90247c.evaluate(expressionResolver)));
        slide.setMode(i10);
        slide.setDuration(((Number) fVar.c().b().evaluate(expressionResolver)).longValue());
        slide.setStartDelay(((Number) fVar.c().d().evaluate(expressionResolver)).longValue());
        slide.setInterpolator(DivUtilKt.getAndroidInterpolator((c6) fVar.c().c().evaluate(expressionResolver)));
        return slide;
    }

    private int toGravity(op.c cVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 48;
        }
        if (i10 == 3) {
            return 5;
        }
        if (i10 == 4) {
            return 80;
        }
        throw new m();
    }

    @NotNull
    public TransitionSet buildTransitions(@Nullable Sequence<DivItemBuilderResult> from, @Nullable Sequence<DivItemBuilderResult> to, @NotNull ExpressionResolver fromResolver, @NotNull ExpressionResolver toResolver) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        if (from != null) {
            TransitionsKt.plusAssign(transitionSet, buildOutgoingTransitions(from, fromResolver));
        }
        if (from != null && to != null) {
            TransitionsKt.plusAssign(transitionSet, buildChangeTransitions(from, fromResolver));
        }
        if (to != null) {
            TransitionsKt.plusAssign(transitionSet, buildIncomingTransitions(to, toResolver));
        }
        return transitionSet;
    }

    @Nullable
    public Transition createAndroidTransition(@Nullable r6 divAppearanceTransition, int transitionMode, @NotNull ExpressionResolver resolver) {
        if (divAppearanceTransition == null) {
            return null;
        }
        return toAndroidTransition(divAppearanceTransition, transitionMode, resolver);
    }

    private Transition toAndroidTransition(y7 y7Var, ExpressionResolver expressionResolver) {
        if (y7Var instanceof y7.d) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator it = ((y7.d) y7Var).c().f91568a.iterator();
            while (it.hasNext()) {
                transitionSet.addTransition(toAndroidTransition((y7) it.next(), expressionResolver));
            }
            return transitionSet;
        }
        if (y7Var instanceof y7.a) {
            ChangeBounds changeBounds = new ChangeBounds();
            y7.a aVar = (y7.a) y7Var;
            changeBounds.setDuration(((Number) aVar.c().b().evaluate(expressionResolver)).longValue());
            changeBounds.setStartDelay(((Number) aVar.c().d().evaluate(expressionResolver)).longValue());
            changeBounds.setInterpolator(DivUtilKt.getAndroidInterpolator((c6) aVar.c().c().evaluate(expressionResolver)));
            return changeBounds;
        }
        throw new m();
    }
}
