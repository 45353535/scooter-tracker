package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "Lkotlin/Function1;", "platformMagnifier", "animatedSelectionMagnifier", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "targetCalculation", "Landroidx/compose/runtime/State;", "rememberAnimatedMagnifierPosition", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/TwoWayConverter;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "OffsetDisplacementThreshold", "J", "Landroidx/compose/animation/core/SpringSpec;", "MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SelectionMagnifierKt {

    @NotNull
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;

    @NotNull
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);

    @NotNull
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<Offset, AnimationVector2D>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m827invokek4lQ0M(offset.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m827invokek4lQ0M(long j10) {
            return OffsetKt.m1390isSpecifiedk4lQ0M(j10) ? new AnimationVector2D(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10)) : SelectionMagnifierKt.UnspecifiedAnimationVector2D;
        }
    }, new Function1<AnimationVector2D, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m1360boximpl(m828invoketuRUvjQ(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m828invoketuRUvjQ(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OffsetKt.Offset(it.getV1(), it.getV2());
        }
    });

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function0<Offset> $magnifierCenter;
        final /* synthetic */ Function1<Function0<Offset>, Modifier> $platformMagnifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<Offset> function0, Function1<? super Function0<Offset>, ? extends Modifier> function1) {
            super(3);
            this.$magnifierCenter = function0;
            this.$platformMagnifier = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$0(State<Offset> state) {
            return state.getValue().getPackedValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(759876635);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:66)");
            }
            final State stateRememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
            Function1<Function0<Offset>, Modifier> function1 = this.$platformMagnifier;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(stateRememberAnimatedMagnifierPosition);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m1360boximpl(m829invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m829invokeF1C5BW0() {
                        return SelectionMagnifierKt.AnonymousClass1.invoke$lambda$0(stateRememberAnimatedMagnifierPosition);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier modifierInvoke = function1.invoke((Function0<Offset>) objRememberedValue);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {88}, m = "invokeSuspend")
    static final class C14991 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
        final /* synthetic */ State<Offset> $targetValue$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14991(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, Continuation continuation) {
            super(2, continuation);
            this.$targetValue$delegate = state;
            this.$animatable = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14991 c14991 = new C14991(this.$targetValue$delegate, this.$animatable, continuation);
            c14991.L$0 = obj;
            return c14991;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final State<Offset> state = this.$targetValue$delegate;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m1360boximpl(m830invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m830invokeF1C5BW0() {
                        return SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state);
                    }
                });
                final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return m831emit3MmeM6k(((Offset) obj2).getPackedValue(), continuation);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: emit-3MmeM6k, reason: not valid java name */
                    public final Object m831emit3MmeM6k(long j10, @NotNull Continuation continuation) {
                        if (OffsetKt.m1390isSpecifiedk4lQ0M(animatable.getValue().getPackedValue()) && OffsetKt.m1390isSpecifiedk4lQ0M(j10) && Offset.m1372getYimpl(animatable.getValue().getPackedValue()) != Offset.m1372getYimpl(j10)) {
                            i.d(coroutineScope, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(animatable, j10, null), 3, null);
                            return Unit.f93236a;
                        }
                        Object objSnapTo = animatable.snapTo(Offset.m1360boximpl(j10), continuation);
                        return objSnapTo == pf.b.g() ? objSnapTo : Unit.f93236a;
                    }
                };
                this.label = 1;
                if (flowSnapshotFlow.collect(flowCollector, this) == objG) {
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
            return ((C14991) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static {
        long jOffset = OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = jOffset;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m1360boximpl(jOffset), 3, null);
    }

    @NotNull
    public static final Modifier animatedSelectionMagnifier(@NotNull Modifier modifier, @NotNull Function0<Offset> magnifierCenter, @NotNull Function1<? super Function0<Offset>, ? extends Modifier> platformMagnifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(platformMagnifier, "platformMagnifier");
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass1(magnifierCenter, platformMagnifier), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Offset> rememberAnimatedMagnifierPosition(Function0<Offset> function0, Composer composer, int i10) {
        composer.startReplaceableGroup(-1589795249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Animatable(Offset.m1360boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), UnspecifiedSafeOffsetVectorConverter, Offset.m1360boximpl(OffsetDisplacementThreshold));
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue2;
        EffectsKt.LaunchedEffect(Unit.f93236a, new C14991(state, animatable, null), composer, 70);
        State<Offset> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().getPackedValue();
    }
}
