package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import eg.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class DrawerKt$BottomDrawer$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DrawerKt$BottomDrawer$1(boolean z10, BottomDrawerState bottomDrawerState, Function2<? super Composer, ? super Integer, Unit> function2, int i10, long j10, Shape shape, long j11, long j12, float f10, CoroutineScope coroutineScope, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$gesturesEnabled = z10;
        this.$drawerState = bottomDrawerState;
        this.$content = function2;
        this.$$dirty = i10;
        this.$scrimColor = j10;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j11;
        this.$drawerContentColor = j12;
        this.$drawerElevation = f10;
        this.$scope = coroutineScope;
        this.$drawerContent = function3;
    }

    private static final float invoke$lambda$1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Float> mutableState, float f10) {
        mutableState.setValue(Float.valueOf(f10));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.f93236a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1220102512, i10, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:533)");
        }
        float fM3918getMaxHeightimpl = Constraints.m3918getMaxHeightimpl(BoxWithConstraints.getConstraints());
        Object objValueOf = Float.valueOf(fM3918getMaxHeightimpl);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(objValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(fM3918getMaxHeightimpl), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        boolean z10 = Constraints.m3919getMaxWidthimpl(BoxWithConstraints.getConstraints()) > Constraints.m3918getMaxHeightimpl(BoxWithConstraints.getConstraints());
        float f10 = 0.5f * fM3918getMaxHeightimpl;
        float fMax = Math.max(0.0f, fM3918getMaxHeightimpl - invoke$lambda$1(mutableState));
        Map mapMapOf = (invoke$lambda$1(mutableState) < f10 || z10) ? MapsKt.mapOf(TuplesKt.to(Float.valueOf(fM3918getMaxHeightimpl), BottomDrawerValue.Closed), TuplesKt.to(Float.valueOf(fMax), BottomDrawerValue.Expanded)) : MapsKt.mapOf(TuplesKt.to(Float.valueOf(fM3918getMaxHeightimpl), BottomDrawerValue.Closed), TuplesKt.to(Float.valueOf(f10), BottomDrawerValue.Open), TuplesKt.to(Float.valueOf(fMax), BottomDrawerValue.Expanded));
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM465sizeInqDBjuR0$default = SizeKt.m465sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density.mo305toDpu2uoSUM(Constraints.m3919getMaxWidthimpl(BoxWithConstraints.getConstraints())), density.mo305toDpu2uoSUM(Constraints.m3918getMaxHeightimpl(BoxWithConstraints.getConstraints())), 3, null);
        Modifier modifierM1134swipeablepPrIpRY = SwipeableKt.m1134swipeablepPrIpRY(companion.then(this.$gesturesEnabled ? NestedScrollModifierKt.nestedScroll$default(companion, this.$drawerState.getNestedScrollConnection(), null, 2, null) : companion), this.$drawerState, mapMapOf, Orientation.Vertical, (288 & 8) != 0 ? true : this.$gesturesEnabled, (288 & 16) != 0 ? false : false, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final FixedThreshold invoke(Object obj, Object obj2) {
                return new FixedThreshold(Dp.m3951constructorimpl(56), null);
            }
        } : null, (288 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (288 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1133getVelocityThresholdD9Ej5fM() : 0.0f);
        Function2<Composer, Integer, Unit> function2 = this.$content;
        final int i12 = this.$$dirty;
        long j10 = this.$scrimColor;
        final BottomDrawerState bottomDrawerState = this.$drawerState;
        Shape shape = this.$drawerShape;
        long j11 = this.$drawerBackgroundColor;
        long j12 = this.$drawerContentColor;
        float f11 = this.$drawerElevation;
        final boolean z11 = this.$gesturesEnabled;
        final CoroutineScope coroutineScope = this.$scope;
        final Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1134swipeablepPrIpRY);
        if (!s.a(composer.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density2, companion2.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        function2.invoke(composer, Integer.valueOf((i12 >> 27) & 14));
        DrawerKt.m1004BottomDrawerScrim3JVO9M(j10, new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1

            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1", f = "Drawer.kt", l = {585}, m = "invokeSuspend")
            static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ BottomDrawerState $drawerState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BottomDrawerState bottomDrawerState, Continuation continuation) {
                    super(2, continuation);
                    this.$drawerState = bottomDrawerState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass1(this.$drawerState, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        d.b(obj);
                        BottomDrawerState bottomDrawerState = this.$drawerState;
                        this.label = 1;
                        if (bottomDrawerState.close(this) == objG) {
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
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (z11 && bottomDrawerState.getConfirmStateChange$material_release().invoke(BottomDrawerValue.Closed).booleanValue()) {
                    i.d(coroutineScope, null, null, new AnonymousClass1(bottomDrawerState, null), 3, null);
                }
            }
        }, bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, (i12 >> 24) & 14);
        final String strM1122getString4foXLRw = Strings_androidKt.m1122getString4foXLRw(Strings.INSTANCE.m1119getNavigationMenuUdPEhr4(), composer, 6);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(bottomDrawerState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                    return IntOffset.m4060boximpl(m1009invokeBjo55l4(density3));
                }

                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m1009invokeBjo55l4(@NotNull Density offset) {
                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                    return IntOffsetKt.IntOffset(0, zf.a.d(bottomDrawerState.getOffset().getValue().floatValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier modifierOffset = OffsetKt.offset(modifierM465sizeInqDBjuR0$default, (Function1) objRememberedValue2);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged3 = composer.changed(mutableState);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
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
                public final void invoke2(@NotNull LayoutCoordinates position) {
                    Intrinsics.checkNotNullParameter(position, "position");
                    DrawerKt$BottomDrawer$1.invoke$lambda$2(mutableState, IntSize.m4110getHeightimpl(position.mo3015getSizeYbymL2g()));
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        int i13 = i12 >> 12;
        SurfaceKt.m1124SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOffset, (Function1) objRememberedValue3), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4
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
                SemanticsPropertiesKt.setPaneTitle(semantics, strM1122getString4foXLRw);
                if (bottomDrawerState.isOpen()) {
                    final BottomDrawerState bottomDrawerState2 = bottomDrawerState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.1

                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1, reason: invalid class name and collision with other inner class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @e(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1", f = "Drawer.kt", l = {603}, m = "invokeSuspend")
                        static final class C00721 extends k implements Function2<CoroutineScope, Continuation, Object> {
                            final /* synthetic */ BottomDrawerState $drawerState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00721(BottomDrawerState bottomDrawerState, Continuation continuation) {
                                super(2, continuation);
                                this.$drawerState = bottomDrawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @NotNull
                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                return new C00721(this.$drawerState, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object objG = b.g();
                                int i10 = this.label;
                                if (i10 == 0) {
                                    d.b(obj);
                                    BottomDrawerState bottomDrawerState = this.$drawerState;
                                    this.label = 1;
                                    if (bottomDrawerState.close(this) == objG) {
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
                                return ((C00721) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            if (bottomDrawerState2.getConfirmStateChange$material_release().invoke(BottomDrawerValue.Closed).booleanValue()) {
                                i.d(coroutineScope2, null, null, new C00721(bottomDrawerState2, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                }
            }
        }, 1, null), shape, j11, j12, null, f11, ComposableLambdaKt.composableLambda(composer, 457750254, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i14) {
                if ((i14 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(457750254, i14, -1, "androidx.compose.material.BottomDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:611)");
                }
                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                int i15 = (i12 << 9) & 7168;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion3);
                if (!s.a(composer2.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM1248constructorimpl2 = Updater.m1248constructorimpl(composer2);
                Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl2, density3, companion4.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
                composer2.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                function32.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i15 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, ((i12 >> 9) & 112) | 1572864 | (i13 & 896) | (i13 & 7168) | (458752 & i12), 16);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
