package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a3\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001ac\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a{\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00012\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a \u0010&\u001a\u00020\f2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010'\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"HeightToFirstLine", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "Snackbar", "snackbarData", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "actionColor", "elevation", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float HeightToFirstLine = Dp.m3951constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m3951constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m3951constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m3951constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m3951constructorimpl(12);
    private static final float SnackbarMinHeightOneLine = Dp.m3951constructorimpl(48);
    private static final float SnackbarMinHeightTwoLines = Dp.m3951constructorimpl(68);

    static {
        float f10 = 8;
        HorizontalSpacingButtonSide = Dp.m3951constructorimpl(f10);
        TextEndExtraSpacing = Dp.m3951constructorimpl(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NewLineButtonSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:270)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f10 = HorizontalSpacing;
            float f11 = HorizontalSpacingButtonSide;
            Modifier modifierM422paddingqDBjuR0$default = PaddingKt.m422paddingqDBjuR0$default(modifierFillMaxWidth$default, f10, 0.0f, f11, SeparateButtonExtraY, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM422paddingqDBjuR0$default);
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
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion3.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM422paddingqDBjuR0$default2 = PaddingKt.m422paddingqDBjuR0$default(AlignmentLineKt.m347paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f11, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM422paddingqDBjuR0$default2);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl2 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl2, density2, companion3.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getEnd());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierAlign);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl3 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl3, density3, companion3.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.NewLineButtonSnackbar.2
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                SnackbarKt.NewLineButtonSnackbar(function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OneRowSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-534813202);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534813202, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM422paddingqDBjuR0$default = PaddingKt.m422paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            final String str = "action";
            final String str2 = "text";
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt.OneRowSnackbar.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.a(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.b(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long j10) {
                    int iMo302roundToPx0680j_4;
                    int iMax;
                    MeasureScope Layout = measureScope;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    String str3 = str;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str3)) {
                            long j11 = j10;
                            final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j11);
                            int iE = g.e((Constraints.m3919getMaxWidthimpl(j11) - placeableMo3011measureBRTryo0.getWidth()) - Layout.mo302roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing), Constraints.m3921getMinWidthimpl(j11));
                            String str4 = str2;
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str4)) {
                                    final Placeable placeableMo3011measureBRTryo02 = measurable2.mo3011measureBRTryo0(Constraints.m3910copyZbe2FdA$default(j11, 0, iE, 0, 0, 9, null));
                                    int i12 = placeableMo3011measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                    if (i12 == Integer.MIN_VALUE) {
                                        throw new IllegalArgumentException("No baselines for text");
                                    }
                                    int i13 = placeableMo3011measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                    if (i13 == Integer.MIN_VALUE) {
                                        throw new IllegalArgumentException("No baselines for text");
                                    }
                                    int height = 0;
                                    boolean z10 = i12 == i13;
                                    final int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10) - placeableMo3011measureBRTryo0.getWidth();
                                    if (z10) {
                                        iMax = Math.max(Layout.mo302roundToPx0680j_4(SnackbarKt.SnackbarMinHeightOneLine), placeableMo3011measureBRTryo0.getHeight());
                                        iMo302roundToPx0680j_4 = (iMax - placeableMo3011measureBRTryo02.getHeight()) / 2;
                                        int i14 = placeableMo3011measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                        if (i14 != Integer.MIN_VALUE) {
                                            height = (i12 + iMo302roundToPx0680j_4) - i14;
                                        }
                                    } else {
                                        iMo302roundToPx0680j_4 = Layout.mo302roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i12;
                                        iMax = Math.max(Layout.mo302roundToPx0680j_4(SnackbarKt.SnackbarMinHeightTwoLines), placeableMo3011measureBRTryo02.getHeight() + iMo302roundToPx0680j_4);
                                        height = (iMax - placeableMo3011measureBRTryo0.getHeight()) / 2;
                                    }
                                    final int i15 = height;
                                    final int i16 = iMo302roundToPx0680j_4;
                                    return MeasureScope.CC.p(Layout, Constraints.m3919getMaxWidthimpl(j10), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$measure$4
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
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo02, 0, i16, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, iM3919getMaxWidthimpl, i15, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                                Layout = measureScope;
                                j11 = j10;
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        Layout = measureScope;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.c(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.d(this, intrinsicMeasureScope, list, i12);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM422paddingqDBjuR0$default);
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
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM420paddingVpY3zN4$default = PaddingKt.m420paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM420paddingVpY3zN4$default);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl2 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl2, density2, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "action");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl3 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl3, density3, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.OneRowSnackbar.3
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                SnackbarKt.OneRowSnackbar(function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Snackbar-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1106Snackbar7zSek6w(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r27, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, boolean r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m1106Snackbar7zSek6w(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1107SnackbarsPrSdHI(@org.jetbrains.annotations.NotNull final androidx.compose.material.SnackbarData r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r28, boolean r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r30, long r31, long r33, long r35, float r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m1107SnackbarsPrSdHI(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TextOnlySnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(917397959);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917397959, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            C15362 c15362 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt.TextOnlySnackbar.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.a(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.b(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (measurables.size() != 1) {
                        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child");
                    }
                    final Placeable placeableMo3011measureBRTryo0 = ((Measurable) CollectionsKt.first((List) measurables)).mo3011measureBRTryo0(j10);
                    int i12 = placeableMo3011measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                    int i13 = placeableMo3011measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                    if (i12 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    if (i13 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    final int iMax = Math.max(Layout.mo302roundToPx0680j_4(i12 == i13 ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), placeableMo3011measureBRTryo0.getHeight());
                    return MeasureScope.CC.p(Layout, Constraints.m3919getMaxWidthimpl(j10), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$measure$4
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
                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, 0, (iMax - placeableMo3011measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.c(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.d(this, intrinsicMeasureScope, list, i12);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
            Updater.m1255setimpl(composerM1248constructorimpl, c15362, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM419paddingVpY3zN4 = PaddingKt.m419paddingVpY3zN4(companion, HorizontalSpacing, SnackbarVerticalPadding);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM419paddingVpY3zN4);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl2 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl2, density2, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.TextOnlySnackbar.3
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                SnackbarKt.TextOnlySnackbar(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }
}
