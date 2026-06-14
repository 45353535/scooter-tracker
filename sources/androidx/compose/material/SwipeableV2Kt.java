package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SwipeableV2State;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import eg.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\u001aO\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001af\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aM\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010$\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010 \u001a\u00020\u001fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a)\u0010&\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010%\u001a\u00020\u0013H\u0001¢\u0006\u0004\b&\u0010#\u001a9\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130'2\b\b\u0002\u0010(\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+\u001a'\u0010,\u001a\u0004\u0018\u00010\u0013\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130'H\u0002¢\u0006\u0004\b,\u0010-\u001a'\u0010.\u001a\u0004\u0018\u00010\u0013\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130'H\u0002¢\u0006\u0004\b.\u0010-\u001a-\u00100\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130'2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/SwipeableV2State;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "swipeableV2", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableV2State;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "", "possibleValues", "Landroidx/compose/material/AnchorChangeHandler;", "anchorChangeHandler", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "", "calculateAnchor", "swipeAnchors", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableV2State;Ljava/util/Set;Landroidx/compose/material/AnchorChangeHandler;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "confirmValueChange", "rememberSwipeableV2State", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableV2State;", "Landroidx/compose/ui/unit/Dp;", "threshold", "Landroidx/compose/ui/unit/Density;", "fixedPositionalThreshold-0680j_4", "(F)Lkotlin/jvm/functions/Function2;", "fixedPositionalThreshold", "fraction", "fractionalPositionalThreshold", "", "offset", "searchUpwards", "closestAnchor", "(Ljava/util/Map;FZ)Ljava/lang/Object;", "minOrNull", "(Ljava/util/Map;)Ljava/lang/Float;", "maxOrNull", "value", "requireAnchor", "(Ljava/util/Map;Ljava/lang/Object;)F", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SwipeableV2Kt {

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2Kt$swipeableV2$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SwipeableV2Kt$swipeableV2$1", f = "SwipeableV2.kt", l = {}, m = "invokeSuspend")
    static final class C15481 extends k implements Function3<CoroutineScope, Float, Continuation, Object> {
        final /* synthetic */ SwipeableV2State<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2Kt$swipeableV2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.material.SwipeableV2Kt$swipeableV2$1$1", f = "SwipeableV2.kt", l = {86}, m = "invokeSuspend")
        static final class C00921 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ SwipeableV2State<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00921(SwipeableV2State<T> swipeableV2State, float f10, Continuation continuation) {
                super(2, continuation);
                this.$state = swipeableV2State;
                this.$velocity = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C00921(this.$state, this.$velocity, continuation);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    SwipeableV2State<T> swipeableV2State = this.$state;
                    float f10 = this.$velocity;
                    this.label = 1;
                    if (swipeableV2State.settle(f10, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((C00921) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15481(SwipeableV2State<T> swipeableV2State, Continuation continuation) {
            super(3, continuation);
            this.$state = swipeableV2State;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f10, Continuation continuation) {
            return invoke(coroutineScope, f10.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            i.d((CoroutineScope) this.L$0, null, null, new C00921(this.$state, this.F$0, null), 3, null);
            return Unit.f93236a;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, float f10, @Nullable Continuation continuation) {
            C15481 c15481 = new C15481(this.$state, continuation);
            c15481.L$0 = coroutineScope;
            c15481.F$0 = f10;
            return c15481.invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T closestAnchor(Map<T, Float> map, float f10, boolean z10) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor");
        }
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
            float f11 = z10 ? fFloatValue - f10 : f10 - fFloatValue;
            if (f11 < 0.0f) {
                f11 = Float.POSITIVE_INFINITY;
            }
            do {
                T next2 = it.next();
                float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                float f12 = z10 ? fFloatValue2 - f10 : f10 - fFloatValue2;
                if (f12 < 0.0f) {
                    f12 = Float.POSITIVE_INFINITY;
                }
                if (Float.compare(f11, f12) > 0) {
                    next = next2;
                    f11 = f12;
                }
            } while (it.hasNext());
        }
        return (T) ((Map.Entry) next).getKey();
    }

    static /* synthetic */ Object closestAnchor$default(Map map, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return closestAnchor(map, f10, z10);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: fixedPositionalThreshold-0680j_4, reason: not valid java name */
    public static final Function2<Density, Float, Float> m1138fixedPositionalThreshold0680j_4(final float f10) {
        return new Function2<Density, Float, Float>() { // from class: androidx.compose.material.SwipeableV2Kt$fixedPositionalThreshold$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Density density, Float f11) {
                return invoke(density, f11.floatValue());
            }

            @NotNull
            public final Float invoke(@NotNull Density density, float f11) {
                Intrinsics.checkNotNullParameter(density, "$this$null");
                return Float.valueOf(density.mo308toPx0680j_4(f10));
            }
        };
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Function2<Density, Float, Float> fractionalPositionalThreshold(final float f10) {
        return new Function2<Density, Float, Float>() { // from class: androidx.compose.material.SwipeableV2Kt.fractionalPositionalThreshold.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @NotNull
            public final Float invoke(@NotNull Density density, float f11) {
                Intrinsics.checkNotNullParameter(density, "$this$null");
                return Float.valueOf(f11 * f10);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Density density, Float f11) {
                return invoke(density, f11.floatValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float maxOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float minOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableV2State<T> rememberSwipeableV2State(@NotNull final T initialValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super T, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1791789117);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableV2Defaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableV2Kt.rememberSwipeableV2State.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1791789117, i10, -1, "androidx.compose.material.rememberSwipeableV2State (SwipeableV2.kt:477)");
        }
        SwipeableV2State.Companion companion = SwipeableV2State.INSTANCE;
        SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.m1261rememberSaveable(new Object[]{initialValue, animationSpec, function1}, (Saver) companion.m1141SavereqLRuRQ(animationSpec, function1, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m1137getVelocityThresholdD9Ej5fM()), (String) null, (Function0) new Function0<SwipeableV2State<T>>() { // from class: androidx.compose.material.SwipeableV2Kt.rememberSwipeableV2State.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SwipeableV2State<T> invoke() {
                T t10 = initialValue;
                AnimationSpec<Float> animationSpec2 = animationSpec;
                Function1<T, Boolean> function12 = function1;
                SwipeableV2Defaults swipeableV2Defaults2 = SwipeableV2Defaults.INSTANCE;
                return new SwipeableV2State<>(t10, animationSpec2, function12, swipeableV2Defaults2.getPositionalThreshold(), swipeableV2Defaults2.m1137getVelocityThresholdD9Ej5fM(), null);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableV2State;
    }

    private static final <T> float requireAnchor(Map<T, Float> map, T t10) {
        Float f10 = map.get(t10);
        if (f10 != null) {
            return f10.floatValue();
        }
        throw new IllegalArgumentException(("Required anchor " + t10 + " was not found in anchors. Current anchors: " + MapsKt.toMap(map)).toString());
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final <T> Modifier swipeAnchors(@NotNull Modifier modifier, @NotNull final SwipeableV2State<T> state, @NotNull final Set<? extends T> possibleValues, @Nullable final AnchorChangeHandler<T> anchorChangeHandler, @NotNull final Function2<? super T, ? super IntSize, Float> calculateAnchor) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(possibleValues, "possibleValues");
        Intrinsics.checkNotNullParameter(calculateAnchor, "calculateAnchor");
        return modifier.then(new SwipeAnchorsModifierImpl(new Function1<Density, Unit>() { // from class: androidx.compose.material.SwipeableV2Kt.swipeAnchors.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Density it) {
                Intrinsics.checkNotNullParameter(it, "it");
                state.setDensity$material_release(it);
            }
        }, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.SwipeableV2Kt.swipeAnchors.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m1139invokeozmzZPI(intSize.getPackedValue());
                return Unit.f93236a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m1139invokeozmzZPI(long j10) {
                AnchorChangeHandler<T> anchorChangeHandler2;
                Map anchors$material_release = state.getAnchors$material_release();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterable iterable = possibleValues;
                Function2<T, IntSize, Float> function2 = calculateAnchor;
                for (Object obj : iterable) {
                    Float fInvoke = function2.invoke((T) obj, IntSize.m4103boximpl(j10));
                    if (fInvoke != null) {
                        linkedHashMap.put(obj, fInvoke);
                    }
                }
                if (Intrinsics.areEqual(anchors$material_release, linkedHashMap)) {
                    return;
                }
                Object targetValue = state.getTargetValue();
                if (!state.updateAnchors$material_release(linkedHashMap) || (anchorChangeHandler2 = anchorChangeHandler) == 0) {
                    return;
                }
                anchorChangeHandler2.onAnchorsChanged((T) targetValue, (Map<T, Float>) anchors$material_release, linkedHashMap);
            }
        }, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("swipeAnchors");
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("possibleValues", possibleValues);
                inspectorInfo.getProperties().set("anchorChangeHandler", anchorChangeHandler);
                inspectorInfo.getProperties().set("calculateAnchor", calculateAnchor);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier swipeAnchors$default(Modifier modifier, SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            anchorChangeHandler = null;
        }
        return swipeAnchors(modifier, swipeableV2State, set, anchorChangeHandler, function2);
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final <T> Modifier swipeableV2(@NotNull Modifier modifier, @NotNull SwipeableV2State<T> state, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return DraggableKt.draggable$default(modifier, state.getDraggableState(), orientation, z10, mutableInteractionSource, state.isAnimationRunning(), null, new C15481(state, null), z11, 32, null);
    }

    public static /* synthetic */ Modifier swipeableV2$default(Modifier modifier, SwipeableV2State swipeableV2State, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return swipeableV2(modifier, swipeableV2State, orientation, z12, z13, mutableInteractionSource);
    }
}
