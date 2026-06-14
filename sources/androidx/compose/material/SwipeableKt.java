package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u00062\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u009b\u0001\u0010$\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0001*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a+\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'2\u0006\u0010%\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0002¢\u0006\u0004\b(\u0010)\u001aW\u0010,\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-\u001a/\u0010.\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010/\"*\u00105\u001a\u000200\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"", "T", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/SwipeableState;", "rememberSwipeableState", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "value", "", "onValueChange", "rememberSwipeableStateFor", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "Landroidx/compose/ui/Modifier;", "state", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function2;", "Landroidx/compose/material/ThresholdConfig;", "thresholds", "Landroidx/compose/material/ResistanceConfig;", "resistance", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "swipeable", "offset", "", "", "findBounds", "(FLjava/util/Set;)Ljava/util/List;", "lastValue", "velocity", "computeTarget", "(FFLjava/util/Set;Lkotlin/jvm/functions/Function2;FF)F", "getOffset", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "PreUpPostDownNestedScrollConnection", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SwipeableKt {

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", l = {512}, m = "invokeSuspend")
    static final class C15391 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ SwipeableState<T> $swipeableState;
        final /* synthetic */ T $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15391(T t10, SwipeableState<T> swipeableState, Continuation continuation) {
            super(2, continuation);
            this.$value = t10;
            this.$swipeableState = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C15391(this.$value, this.$swipeableState, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                if (!Intrinsics.areEqual(this.$value, this.$swipeableState.getCurrentValue())) {
                    SwipeableState<T> swipeableState = this.$swipeableState;
                    T t10 = this.$value;
                    this.label = 1;
                    if (SwipeableState.animateTo$default(swipeableState, t10, null, this, 2, null) == objG) {
                        return objG;
                    }
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
            return ((C15391) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeTarget(float f10, float f11, Set<Float> set, Function2<? super Float, ? super Float, Float> function2, float f12, float f13) {
        List<Float> listFindBounds = findBounds(f10, set);
        int size = listFindBounds.size();
        if (size == 0) {
            return f11;
        }
        if (size == 1) {
            return listFindBounds.get(0).floatValue();
        }
        float fFloatValue = listFindBounds.get(0).floatValue();
        float fFloatValue2 = listFindBounds.get(1).floatValue();
        return (f11 > f10 ? f12 > (-f13) && f10 > function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue)).floatValue() : f12 >= f13 || f10 >= function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> findBounds(float f10, Set<Float> set) {
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() <= ((double) f10) + 0.001d) {
                arrayList.add(obj);
            }
        }
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() >= ((double) f10) - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList2);
        return fMaxOrNull == null ? CollectionsKt.listOfNotNull(fMinOrNull) : fMinOrNull == null ? CollectionsKt.listOf(fMaxOrNull) : Intrinsics.areEqual(fMaxOrNull, fMinOrNull) ? CollectionsKt.listOf(fMaxOrNull) : CollectionsKt.listOf((Object[]) new Float[]{fMaxOrNull, fMinOrNull});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t10) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Map.Entry) next).getValue(), t10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    @NotNull
    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(@NotNull SwipeableState<T> swipeableState) {
        Intrinsics.checkNotNullParameter(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableState<T> rememberSwipeableState(@NotNull final T initialValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super T, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1237755169);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableKt.rememberSwipeableState.1
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
            ComposerKt.traceEventStart(-1237755169, i10, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:467)");
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m1261rememberSaveable(new Object[0], (Saver) SwipeableState.INSTANCE.Saver(animationSpec, function1), (String) null, (Function0) new Function0<SwipeableState<T>>() { // from class: androidx.compose.material.SwipeableKt.rememberSwipeableState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SwipeableState<T> invoke() {
                return new SwipeableState<>(initialValue, animationSpec, function1);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(@NotNull final T value, @NotNull final Function1<? super T, Unit> onValueChange, @Nullable AnimationSpec<Float> animationSpec, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1156387078);
        if ((i11 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1156387078, i10, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:496)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new SwipeableState(value, animationSpec, new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final SwipeableState<T> swipeableState = (SwipeableState) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue2;
        int i12 = i10 & 8;
        EffectsKt.LaunchedEffect(value, mutableState.getValue(), new C15391(value, swipeableState, null), composer, (i10 & 14) | i12 | 512);
        EffectsKt.DisposableEffect(swipeableState.getCurrentValue(), new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.SwipeableKt.rememberSwipeableStateFor.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (!Intrinsics.areEqual(value, swipeableState.getCurrentValue())) {
                    onValueChange.invoke((T) swipeableState.getCurrentValue());
                    mutableState.setValue(Boolean.valueOf(!r2.getValue().booleanValue()));
                }
                return new DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, composer, i12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m1134swipeablepPrIpRY(@NotNull Modifier swipeable, @NotNull final SwipeableState<T> state, @NotNull final Map<Float, ? extends T> anchors, @NotNull final Orientation orientation, final boolean z10, final boolean z11, @Nullable final MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super T, ? super T, ? extends ThresholdConfig> thresholds, @Nullable final ResistanceConfig resistanceConfig, final float f10) {
        Intrinsics.checkNotNullParameter(swipeable, "$this$swipeable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        return ComposedModifierKt.composed(swipeable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("anchors", anchors);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("thresholds", thresholds);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("velocityThreshold", Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3

            /* JADX INFO: renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {607}, m = "invokeSuspend")
            static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ Map<Float, T> $anchors;
                final /* synthetic */ Density $density;
                final /* synthetic */ ResistanceConfig $resistance;
                final /* synthetic */ SwipeableState<T> $state;
                final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
                final /* synthetic */ float $velocityThreshold;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f10, Continuation continuation) {
                    super(2, continuation);
                    this.$state = swipeableState;
                    this.$anchors = map;
                    this.$resistance = resistanceConfig;
                    this.$density = density;
                    this.$thresholds = function2;
                    this.$velocityThreshold = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
                        Map anchors$material_release = this.$state.getAnchors$material_release();
                        this.$state.setAnchors$material_release(this.$anchors);
                        this.$state.setResistance$material_release(this.$resistance);
                        SwipeableState<T> swipeableState = this.$state;
                        final Map<Float, T> map = this.$anchors;
                        final Function2<T, T, ThresholdConfig> function2 = this.$thresholds;
                        final Density density = this.$density;
                        swipeableState.setThresholds$material_release(new Function2<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableKt.swipeable.3.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
                                return invoke(f10.floatValue(), f11.floatValue());
                            }

                            /* JADX WARN: Type inference incomplete: some casts might be missing */
                            @NotNull
                            public final Float invoke(float f10, float f11) {
                                return Float.valueOf(function2.invoke((T) MapsKt.getValue(map, Float.valueOf(f10)), (T) MapsKt.getValue(map, Float.valueOf(f11))).computeThreshold(density, f10, f11));
                            }
                        });
                        this.$state.setVelocityThreshold$material_release(this.$density.mo308toPx0680j_4(this.$velocityThreshold));
                        SwipeableState<T> swipeableState2 = this.$state;
                        Object obj2 = this.$anchors;
                        this.label = 1;
                        if (swipeableState2.processNewAnchors$material_release(anchors$material_release, obj2, this) == objG) {
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
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(43594985);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43594985, i10, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
                }
                if (anchors.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (CollectionsKt.distinct(anchors.values()).size() != anchors.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                state.ensureInit$material_release(anchors);
                Map<Float, T> map = anchors;
                SwipeableState<T> swipeableState = state;
                EffectsKt.LaunchedEffect(map, swipeableState, new AnonymousClass3(swipeableState, map, resistanceConfig, density, thresholds, f10, null), composer, IronSourceError.ERROR_NO_INTERNET_CONNECTION);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zIsAnimationRunning = state.isAnimationRunning();
                DraggableState draggableState = state.getDraggableState();
                Orientation orientation2 = orientation;
                boolean z12 = z10;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                SwipeableState<T> swipeableState2 = state;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(swipeableState2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new SwipeableKt$swipeable$3$4$1(swipeableState2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierDraggable$default = DraggableKt.draggable$default(companion, draggableState, orientation2, z12, mutableInteractionSource2, zIsAnimationRunning, null, (Function3) objRememberedValue, z11, 32, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDraggable$default;
            }
        });
    }
}
