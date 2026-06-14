package androidx.compose.foundation.layout;

import androidx.activity.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aJ\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u001d\u001a\u00020\b*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\u001f\"\u001a\u0010 \u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001a\u0010$\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#\"\u001a\u0010)\u001a\u0004\u0018\u00010&*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0018\u0010,\u001a\u00020\u0004*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "content", "Box", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "alignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "boxMeasurePolicy", "(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "boxWidth", "boxHeight", "placeInBox", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/LayoutDirection;IILandroidx/compose/ui/Alignment;)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/BoxChildData;", "getBoxChildData", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildData;", "boxChildData", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BoxKt {

    @NotNull
    private static final MeasurePolicy DefaultBoxMeasurePolicy = boxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);

    @NotNull
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope MeasurePolicy, @NotNull List<? extends Measurable> list, long j10) {
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            return MeasureScope.CC.p(MeasurePolicy, Constraints.m3921getMinWidthimpl(j10), Constraints.m3920getMinHeightimpl(j10), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1$measure$1
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
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.d(this, intrinsicMeasureScope, list, i10);
        }
    };

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(@Nullable Modifier modifier, @Nullable Alignment alignment, boolean z10, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(733328855);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.INSTANCE.getTopStart();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z10, composer, (i10 >> 3) & 126);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
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
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i10 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final MeasurePolicy boxMeasurePolicy(@NotNull final Alignment alignment, final boolean z10) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return androidx.compose.ui.layout.e.a(this, intrinsicMeasureScope, list, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return androidx.compose.ui.layout.e.b(this, intrinsicMeasureScope, list, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo30measure3p2s80s(@NotNull final MeasureScope MeasurePolicy, @NotNull final List<? extends Measurable> measurables, long j10) {
                long j11;
                int iM3921getMinWidthimpl;
                int iM3920getMinHeightimpl;
                Placeable placeableMo3011measureBRTryo0;
                Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.p(MeasurePolicy, Constraints.m3921getMinWidthimpl(j10), Constraints.m3920getMinHeightimpl(j10), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$1
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
                if (z10) {
                    j11 = j10;
                } else {
                    j11 = j10;
                    j10 = Constraints.m3910copyZbe2FdA$default(j11, 0, 0, 0, 0, 10, null);
                }
                if (measurables.size() == 1) {
                    final Measurable measurable = measurables.get(0);
                    if (BoxKt.getMatchesParentSize(measurable)) {
                        iM3921getMinWidthimpl = Constraints.m3921getMinWidthimpl(j11);
                        iM3920getMinHeightimpl = Constraints.m3920getMinHeightimpl(j11);
                        placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(Constraints.INSTANCE.m3927fixedJhjzzOo(Constraints.m3921getMinWidthimpl(j11), Constraints.m3920getMinHeightimpl(j11)));
                    } else {
                        placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
                        iM3921getMinWidthimpl = Math.max(Constraints.m3921getMinWidthimpl(j11), placeableMo3011measureBRTryo0.getWidth());
                        iM3920getMinHeightimpl = Math.max(Constraints.m3920getMinHeightimpl(j11), placeableMo3011measureBRTryo0.getHeight());
                    }
                    final Placeable placeable = placeableMo3011measureBRTryo0;
                    final int i10 = iM3921getMinWidthimpl;
                    final int i11 = iM3920getMinHeightimpl;
                    final Alignment alignment2 = alignment;
                    return MeasureScope.CC.p(MeasurePolicy, i10, i11, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            BoxKt.placeInBox(layout, placeable, measurable, MeasurePolicy.getLayoutDirection(), i10, i11, alignment2);
                        }
                    }, 4, null);
                }
                final Placeable[] placeableArr = new Placeable[measurables.size()];
                final t0 t0Var = new t0();
                t0Var.f93331b = Constraints.m3921getMinWidthimpl(j11);
                final t0 t0Var2 = new t0();
                t0Var2.f93331b = Constraints.m3920getMinHeightimpl(j11);
                int size = measurables.size();
                boolean z11 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    Measurable measurable2 = measurables.get(i12);
                    if (BoxKt.getMatchesParentSize(measurable2)) {
                        z11 = true;
                    } else {
                        Placeable placeableMo3011measureBRTryo02 = measurable2.mo3011measureBRTryo0(j10);
                        placeableArr[i12] = placeableMo3011measureBRTryo02;
                        t0Var.f93331b = Math.max(t0Var.f93331b, placeableMo3011measureBRTryo02.getWidth());
                        t0Var2.f93331b = Math.max(t0Var2.f93331b, placeableMo3011measureBRTryo02.getHeight());
                    }
                }
                if (z11) {
                    int i13 = t0Var.f93331b;
                    int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
                    int i15 = t0Var2.f93331b;
                    long jConstraints = ConstraintsKt.Constraints(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
                    int size2 = measurables.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Measurable measurable3 = measurables.get(i16);
                        if (BoxKt.getMatchesParentSize(measurable3)) {
                            placeableArr[i16] = measurable3.mo3011measureBRTryo0(jConstraints);
                        }
                    }
                }
                int i17 = t0Var.f93331b;
                int i18 = t0Var2.f93331b;
                final Alignment alignment3 = alignment;
                return MeasureScope.CC.p(MeasurePolicy, i17, i18, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$5
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
                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope layout = placementScope;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Placeable[] placeableArr2 = placeableArr;
                        List<Measurable> list = measurables;
                        MeasureScope measureScope = MeasurePolicy;
                        t0 t0Var3 = t0Var;
                        t0 t0Var4 = t0Var2;
                        Alignment alignment4 = alignment3;
                        int length = placeableArr2.length;
                        int i19 = 0;
                        int i20 = 0;
                        while (i20 < length) {
                            Placeable placeable2 = placeableArr2[i20];
                            Intrinsics.checkNotNull(placeable2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                            BoxKt.placeInBox(layout, placeable2, list.get(i19), measureScope.getLayoutDirection(), t0Var3.f93331b, t0Var4.f93331b, alignment4);
                            i20++;
                            layout = placementScope;
                            i19++;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return androidx.compose.ui.layout.e.c(this, intrinsicMeasureScope, list, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return androidx.compose.ui.layout.e.d(this, intrinsicMeasureScope, list, i10);
            }
        };
    }

    private static final BoxChildData getBoxChildData(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildData) {
            return (BoxChildData) parentData;
        }
        return null;
    }

    @NotNull
    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return DefaultBoxMeasurePolicy;
    }

    @NotNull
    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildData boxChildData = getBoxChildData(measurable);
        if (boxChildData != null) {
            return boxChildData.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i10, int i11, Alignment alignment) {
        Alignment alignment2;
        BoxChildData boxChildData = getBoxChildData(measurable);
        Placeable.PlacementScope.m3046place70tqf50$default(placementScope, placeable, ((boxChildData == null || (alignment2 = boxChildData.getAlignment()) == null) ? alignment : alignment2).mo1265alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i10, i11), layoutDirection), 0.0f, 2, null);
    }

    @Composable
    @NotNull
    public static final MeasurePolicy rememberBoxMeasurePolicy(@NotNull Alignment alignment, boolean z10, @Nullable Composer composer, int i10) {
        MeasurePolicy measurePolicy;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        composer.startReplaceableGroup(56522820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:80)");
        }
        if (!Intrinsics.areEqual(alignment, Alignment.INSTANCE.getTopStart()) || z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(boolValueOf) | composer.changed(alignment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = boxMeasurePolicy(alignment, z10);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) objRememberedValue;
        } else {
            measurePolicy = DefaultBoxMeasurePolicy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(@NotNull final Modifier modifier, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:199)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt.Box.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                BoxKt.Box(modifier, composer2, i10 | 1);
            }
        });
    }
}
