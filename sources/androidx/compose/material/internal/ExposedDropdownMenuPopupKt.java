package androidx.compose.material.internal;

import android.view.View;
import androidx.activity.s;
import androidx.compose.material.internal.ExposedDropdownMenuPopupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0013\b\b\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\fH\u0083\b¢\u0006\u0002\u0010\u0011\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0012"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ExposedDropdownMenuPopup", "", "onDismissRequest", "Lkotlin/Function0;", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExposedDropdownMenuPopupKt {

    @NotNull
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new Function0<String>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    /* JADX INFO: renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C15581 implements MeasurePolicy {
        public static final C15581 INSTANCE = new C15581();

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return e.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return e.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            int i10;
            int i11;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            int size = measurables.size();
            if (size == 0) {
                return MeasureScope.CC.p(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.f93236a;
                    }
                }, 4, null);
            }
            int i12 = 0;
            if (size == 1) {
                final Placeable placeableMo3011measureBRTryo0 = measurables.get(0).mo3011measureBRTryo0(j10);
                return MeasureScope.CC.p(Layout, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, 0, 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
            final ArrayList arrayList = new ArrayList(measurables.size());
            int size2 = measurables.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList.add(measurables.get(i13).mo3011measureBRTryo0(j10));
            }
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (lastIndex >= 0) {
                int iMax = 0;
                int iMax2 = 0;
                while (true) {
                    Placeable placeable = (Placeable) arrayList.get(i12);
                    iMax = Math.max(iMax, placeable.getWidth());
                    iMax2 = Math.max(iMax2, placeable.getHeight());
                    if (i12 == lastIndex) {
                        break;
                    }
                    i12++;
                }
                i10 = iMax;
                i11 = iMax2;
            } else {
                i10 = 0;
                i11 = 0;
            }
            return MeasureScope.CC.p(Layout, i10, i11, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex2 < 0) {
                        return;
                    }
                    int i14 = 0;
                    while (true) {
                        Placeable.PlacementScope placementScope = layout;
                        Placeable.PlacementScope.placeRelative$default(placementScope, arrayList.get(i14), 0, 0, 0.0f, 4, null);
                        if (i14 == lastIndex2) {
                            return;
                        }
                        i14++;
                        layout = placementScope;
                    }
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return e.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return e.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuPopup(@Nullable Function0<Unit> function0, @NotNull PopupPositionProvider popupPositionProvider, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10, final int i11) {
        Function0<Unit> function02;
        int i12;
        final Function0<Unit> function03;
        int i13;
        final LayoutDirection layoutDirection;
        final PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        Intrinsics.checkNotNullParameter(popupPositionProvider2, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-841446797);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            function02 = function0;
        } else if ((i10 & 14) == 0) {
            function02 = function0;
            i12 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i10;
        } else {
            function02 = function0;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(popupPositionProvider2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function02;
        } else {
            function03 = i14 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841446797, i12, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.kt:79)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final String str = (String) composerStartRestartGroup.consume(LocalPopupTestTag);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i12 >> 6) & 14);
            UUID popupId = (UUID) RememberSaveableKt.m1261rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<UUID>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1
                @Override // kotlin.jvm.functions.Function0
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i13 = i12;
                Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                layoutDirection = layoutDirection2;
                final PopupLayout popupLayout = new PopupLayout(function03, str, view, density, popupPositionProvider2, popupId);
                str = str;
                popupPositionProvider2 = popupPositionProvider2;
                popupLayout.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(144472904, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
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
                    public final void invoke(@Nullable Composer composer2, int i15) {
                        if ((i15 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(144472904, i15, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.kt:100)");
                        }
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsPropertiesKt.popup(semantics);
                            }
                        }, 1, null);
                        final PopupLayout popupLayout2 = popupLayout;
                        Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m1196invokeozmzZPI(intSize.getPackedValue());
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m1196invokeozmzZPI(long j10) {
                                popupLayout2.m1198setPopupContentSizefhxjrPA(IntSize.m4103boximpl(j10));
                                popupLayout2.updatePosition();
                            }
                        }), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
                        final State<Function2<Composer, Integer, Unit>> state = stateRememberUpdatedState;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 2080999218, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.f93236a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i16) {
                                if ((i16 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2080999218, i16, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.kt:111)");
                                }
                                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup$lambda$0(state).invoke(composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        composer2.startReplaceableGroup(1769324208);
                        ExposedDropdownMenuPopupKt.C15581 c15581 = ExposedDropdownMenuPopupKt.C15581.INSTANCE;
                        composer2.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlpha);
                        if (!s.a(composer2.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer2);
                        Updater.m1255setimpl(composerM1248constructorimpl, c15581, companion.getSetMeasurePolicy());
                        Updater.m1255setimpl(composerM1248constructorimpl, density2, companion.getSetDensity());
                        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection3, companion.getSetLayoutDirection());
                        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composableLambda.invoke(composer2, 6);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                composerStartRestartGroup.updateRememberedValue(popupLayout);
                objRememberedValue = popupLayout;
            } else {
                i13 = i12;
                layoutDirection = layoutDirection2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final PopupLayout popupLayout2 = (PopupLayout) objRememberedValue;
            EffectsKt.DisposableEffect(popupLayout2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    popupLayout2.show();
                    popupLayout2.updateParameters(function03, str, layoutDirection);
                    final PopupLayout popupLayout3 = popupLayout2;
                    return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            popupLayout3.disposeComposition();
                            popupLayout3.dismiss();
                        }
                    };
                }
            }, composerStartRestartGroup, 8);
            EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup.2
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
                    popupLayout2.updateParameters(function03, str, layoutDirection);
                }
            }, composerStartRestartGroup, 0);
            EffectsKt.DisposableEffect(popupPositionProvider2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    popupLayout2.setPositionProvider(popupPositionProvider2);
                    popupLayout2.updatePosition();
                    return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, composerStartRestartGroup, (i13 >> 3) & 14);
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup.5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutCoordinates childCoordinates) {
                    Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                    LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                    Intrinsics.checkNotNull(parentLayoutCoordinates);
                    long jMo3015getSizeYbymL2g = parentLayoutCoordinates.mo3015getSizeYbymL2g();
                    long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
                    popupLayout2.setParentBounds(IntRectKt.m4101IntRectVbeCjmY(IntOffsetKt.IntOffset(a.d(Offset.m1371getXimpl(jPositionInWindow)), a.d(Offset.m1372getYimpl(jPositionInWindow))), jMo3015getSizeYbymL2g));
                    popupLayout2.updatePosition();
                }
            });
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup.6
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return e.a(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return e.b(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> list, long j10) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                    popupLayout2.setParentLayoutDirection(layoutDirection);
                    return MeasureScope.CC.p(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.f93236a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return e.c(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return e.d(this, intrinsicMeasureScope, list, i15);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierOnGloballyPositioned);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density2, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection3, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup.7
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

            public final void invoke(@Nullable Composer composer2, int i15) {
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(function03, popupPositionProvider2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> ExposedDropdownMenuPopup$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        composer.startReplaceableGroup(1769324208);
        C15581 c15581 = C15581.INSTANCE;
        int i11 = ((i10 << 3) & 112) | ((i10 >> 3) & 14);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
        int i12 = ((i11 << 9) & 7168) | 6;
        if (!s.a(composer.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer);
        Updater.m1255setimpl(composerM1248constructorimpl, c15581, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i12 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }
}
