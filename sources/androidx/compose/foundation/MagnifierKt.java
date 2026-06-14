package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import hg.c0;
import hg.i;
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
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001al\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0011\u001a\u0019\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\")\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u00178\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "Landroidx/compose/foundation/MagnifierStyle;", "style", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "magnifier", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLandroidx/compose/foundation/MagnifierStyle;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLandroidx/compose/foundation/MagnifierStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "", "sdkVersion", "", "isPlatformMagnifierSupported", "(I)Z", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MagnifierKt {

    @NotNull
    private static final SemanticsPropertyKey<Function0<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function1<Density, Offset> $magnifierCenter;
        final /* synthetic */ Function1<DpSize, Unit> $onSizeChanged;
        final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        final /* synthetic */ Function1<Density, Offset> $sourceCenter;
        final /* synthetic */ MagnifierStyle $style;
        final /* synthetic */ float $zoom;

        /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {365}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
            final /* synthetic */ Density $density;
            final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
            final /* synthetic */ MutableSharedFlow $onNeedsUpdate;
            final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
            final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
            final /* synthetic */ MagnifierStyle $style;
            final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
            final /* synthetic */ State<Function1<DpSize, Unit>> $updatedOnSizeChanged$delegate;
            final /* synthetic */ State<Float> $updatedZoom$delegate;
            final /* synthetic */ View $view;
            final /* synthetic */ float $zoom;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
            static final class C00231 extends k implements Function2<Unit, Continuation, Object> {
                final /* synthetic */ PlatformMagnifier $magnifier;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00231(PlatformMagnifier platformMagnifier, Continuation continuation) {
                    super(2, continuation);
                    this.$magnifier = platformMagnifier;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00231(this.$magnifier, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    this.$magnifier.updateContent();
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull Unit unit, @Nullable Continuation continuation) {
                    return ((C00231) create(unit, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f10, MutableSharedFlow mutableSharedFlow, State<? extends Function1<? super DpSize, Unit>> state, State<Boolean> state2, State<Offset> state3, State<? extends Function1<? super Density, Offset>> state4, MutableState<Offset> mutableState, State<Float> state5, Continuation continuation) {
                super(2, continuation);
                this.$platformMagnifierFactory = platformMagnifierFactory;
                this.$style = magnifierStyle;
                this.$view = view;
                this.$density = density;
                this.$zoom = f10;
                this.$onNeedsUpdate = mutableSharedFlow;
                this.$updatedOnSizeChanged$delegate = state;
                this.$isMagnifierShown$delegate = state2;
                this.$sourceCenterInRoot$delegate = state3;
                this.$updatedMagnifierCenter$delegate = state4;
                this.$anchorPositionInRoot$delegate = mutableState;
                this.$updatedZoom$delegate = state5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedOnSizeChanged$delegate, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                PlatformMagnifier platformMagnifier;
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    platformMagnifier = (PlatformMagnifier) this.L$0;
                    try {
                        d.b(obj);
                        platformMagnifier.dismiss();
                        return Unit.f93236a;
                    } catch (Throwable th2) {
                        th = th2;
                        platformMagnifier.dismiss();
                        throw th;
                    }
                }
                d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final PlatformMagnifier platformMagnifierCreate = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                final u0 u0Var = new u0();
                long jMo234getSizeYbymL2g = platformMagnifierCreate.mo234getSizeYbymL2g();
                Density density = this.$density;
                Function1 function1Invoke$lambda$6 = AnonymousClass4.invoke$lambda$6(this.$updatedOnSizeChanged$delegate);
                if (function1Invoke$lambda$6 != null) {
                    function1Invoke$lambda$6.invoke(DpSize.m4037boximpl(density.mo306toDpSizekrfVVM(IntSizeKt.m4121toSizeozmzZPI(jMo234getSizeYbymL2g))));
                }
                u0Var.f93333b = jMo234getSizeYbymL2g;
                i.F(i.K(this.$onNeedsUpdate, new C00231(platformMagnifierCreate, null)), coroutineScope);
                try {
                    final Density density2 = this.$density;
                    final State<Boolean> state = this.$isMagnifierShown$delegate;
                    final State<Offset> state2 = this.$sourceCenterInRoot$delegate;
                    final State<Function1<Density, Offset>> state3 = this.$updatedMagnifierCenter$delegate;
                    final MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    final State<Float> state4 = this.$updatedZoom$delegate;
                    final State<Function1<DpSize, Unit>> state5 = this.$updatedOnSizeChanged$delegate;
                    Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (!AnonymousClass4.invoke$lambda$10(state)) {
                                platformMagnifierCreate.dismiss();
                                return;
                            }
                            PlatformMagnifier platformMagnifier2 = platformMagnifierCreate;
                            long jInvoke$lambda$8 = AnonymousClass4.invoke$lambda$8(state2);
                            Object objInvoke = AnonymousClass4.invoke$lambda$4(state3).invoke(density2);
                            MutableState<Offset> mutableState2 = mutableState;
                            long packedValue = ((Offset) objInvoke).getPackedValue();
                            platformMagnifier2.mo235updateWko1d7g(jInvoke$lambda$8, OffsetKt.m1390isSpecifiedk4lQ0M(packedValue) ? Offset.m1376plusMKHz9U(AnonymousClass4.invoke$lambda$1(mutableState2), packedValue) : Offset.INSTANCE.m1386getUnspecifiedF1C5BW0(), AnonymousClass4.invoke$lambda$5(state4));
                            long jMo234getSizeYbymL2g2 = platformMagnifierCreate.mo234getSizeYbymL2g();
                            u0 u0Var2 = u0Var;
                            Density density3 = density2;
                            State<Function1<DpSize, Unit>> state6 = state5;
                            if (IntSize.m4109equalsimpl0(jMo234getSizeYbymL2g2, u0Var2.f93333b)) {
                                return;
                            }
                            u0Var2.f93333b = jMo234getSizeYbymL2g2;
                            Function1 function1Invoke$lambda$62 = AnonymousClass4.invoke$lambda$6(state6);
                            if (function1Invoke$lambda$62 != null) {
                                function1Invoke$lambda$62.invoke(DpSize.m4037boximpl(density3.mo306toDpSizekrfVVM(IntSizeKt.m4121toSizeozmzZPI(jMo234getSizeYbymL2g2))));
                            }
                        }
                    });
                    this.L$0 = platformMagnifierCreate;
                    this.label = 1;
                    if (i.k(flowSnapshotFlow, this) == objG) {
                        return objG;
                    }
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    return Unit.f93236a;
                } catch (Throwable th3) {
                    th = th3;
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f10, Function1<? super DpSize, Unit> function13, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
            super(3);
            this.$sourceCenter = function1;
            this.$magnifierCenter = function12;
            this.$zoom = f10;
            this.$onSizeChanged = function13;
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(MutableState<Offset> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$10(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<Offset> mutableState, long j10) {
            mutableState.setValue(Offset.m1360boximpl(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function1<Density, Offset> invoke$lambda$3(State<? extends Function1<? super Density, Offset>> state) {
            return (Function1) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function1<Density, Offset> invoke$lambda$4(State<? extends Function1<? super Density, Offset>> state) {
            return (Function1) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$5(State<Float> state) {
            return state.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function1<DpSize, Unit> invoke$lambda$6(State<? extends Function1<? super DpSize, Unit>> state) {
            return (Function1) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$8(State<Offset> state) {
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
            composer.startReplaceableGroup(-454877003);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454877003, i10, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1360boximpl(Offset.INSTANCE.m1386getUnspecifiedF1C5BW0()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer, 0);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m1360boximpl(m216invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m216invokeF1C5BW0() {
                        long packedValue = ((Offset) MagnifierKt.AnonymousClass4.invoke$lambda$3(stateRememberUpdatedState).invoke(density)).getPackedValue();
                        return (OffsetKt.m1390isSpecifiedk4lQ0M(MagnifierKt.AnonymousClass4.invoke$lambda$1(mutableState)) && OffsetKt.m1390isSpecifiedk4lQ0M(packedValue)) ? Offset.m1376plusMKHz9U(MagnifierKt.AnonymousClass4.invoke$lambda$1(mutableState), packedValue) : Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final State state = (State) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$isMagnifierShown$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(OffsetKt.m1390isSpecifiedk4lQ0M(MagnifierKt.AnonymousClass4.invoke$lambda$8(state)));
                    }
                });
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            State state2 = (State) objRememberedValue3;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = c0.b(1, 0, gg.a.f72766c, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) objRememberedValue4;
            Float fValueOf = Float.valueOf(this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom);
            MagnifierStyle magnifierStyle = this.$style;
            EffectsKt.LaunchedEffect(new Object[]{view, density, fValueOf, magnifierStyle, Boolean.valueOf(Intrinsics.areEqual(magnifierStyle, MagnifierStyle.INSTANCE.getTextDefault()))}, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, mutableSharedFlow, stateRememberUpdatedState4, state2, state, stateRememberUpdatedState2, mutableState, stateRememberUpdatedState3, null), composer, 72);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(mutableState);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        MagnifierKt.AnonymousClass4.invoke$lambda$2(mutableState, LayoutCoordinatesKt.positionInRoot(it));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(composed, (Function1) objRememberedValue5), new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope drawBehind) {
                    Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                    mutableSharedFlow.g(Unit.f93236a);
                }
            });
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(state);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertyKey<Function0<Offset>> magnifierPositionInRoot = MagnifierKt.getMagnifierPositionInRoot();
                        final State<Offset> state3 = state;
                        semantics.set(magnifierPositionInRoot, new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Offset invoke() {
                                return Offset.m1360boximpl(m215invokeF1C5BW0());
                            }

                            /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                            public final long m215invokeF1C5BW0() {
                                return MagnifierKt.AnonymousClass4.invoke$lambda$8(state3);
                            }
                        });
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierDrawBehind, false, (Function1) objRememberedValue6, 1, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierSemantics$default;
        }
    }

    @NotNull
    public static final SemanticsPropertyKey<Function0<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i10);
    }

    @RequiresApi(28)
    @SuppressLint({"ModifierInspectorInfo"})
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull Function1<? super Density, Offset> sourceCenter, @NotNull Function1<? super Density, Offset> magnifierCenter, float f10, @NotNull MagnifierStyle style, @Nullable Function1<? super DpSize, Unit> function1, @NotNull PlatformMagnifierFactory platformMagnifierFactory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass4(sourceCenter, magnifierCenter, f10, function1, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function12, float f10, MagnifierStyle magnifierStyle, Function1 function13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function12 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Offset invoke(Density density) {
                    return Offset.m1360boximpl(m214invoketuRUvjQ(density));
                }

                /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
                public final long m214invoketuRUvjQ(@NotNull Density density) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
                }
            };
        }
        Function1 function14 = function12;
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            magnifierStyle = MagnifierStyle.INSTANCE.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i10 & 16) != 0) {
            function13 = null;
        }
        return magnifier(modifier, function1, function14, f11, magnifierStyle2, function13);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull final Function1<? super Density, Offset> sourceCenter, @NotNull final Function1<? super Density, Offset> magnifierCenter, final float f10, @NotNull final MagnifierStyle style, @Nullable Function1<? super DpSize, Unit> function1) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Function1<InspectorInfo, Unit> noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", sourceCenter);
                inspectorInfo.getProperties().set("magnifierCenter", magnifierCenter);
                inspectorInfo.getProperties().set("zoom", Float.valueOf(f10));
                inspectorInfo.getProperties().set("style", style);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier modifierMagnifier = Modifier.INSTANCE;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifierMagnifier = magnifier(modifierMagnifier, sourceCenter, magnifierCenter, f10, style, function1, PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, modifierMagnifier);
    }
}
