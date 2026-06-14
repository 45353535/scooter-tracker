package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m342alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f10, float f11, Measurable measurable, long j10) {
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m3910copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null) : Constraints.m3910copyZbe2FdA$default(j10, 0, 0, 0, 0, 14, null));
        int i10 = placeableMo3011measureBRTryo0.get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo3011measureBRTryo0.getHeight() : placeableMo3011measureBRTryo0.getWidth();
        int iM3918getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m3918getMaxHeightimpl(j10) : Constraints.m3919getMaxWidthimpl(j10);
        Dp.Companion companion = Dp.INSTANCE;
        int i11 = iM3918getMaxHeightimpl - height;
        final int iN = kotlin.ranges.g.n((!Dp.m3956equalsimpl0(f10, companion.m3971getUnspecifiedD9Ej5fM()) ? measureScope.mo302roundToPx0680j_4(f10) : 0) - i10, 0, i11);
        final int iN2 = kotlin.ranges.g.n(((!Dp.m3956equalsimpl0(f11, companion.m3971getUnspecifiedD9Ej5fM()) ? measureScope.mo302roundToPx0680j_4(f11) : 0) - height) + i10, 0, i11 - iN);
        int width = getHorizontal(alignmentLine) ? placeableMo3011measureBRTryo0.getWidth() : Math.max(placeableMo3011measureBRTryo0.getWidth() + iN + iN2, Constraints.m3921getMinWidthimpl(j10));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo3011measureBRTryo0.getHeight() + iN + iN2, Constraints.m3920getMinHeightimpl(j10)) : placeableMo3011measureBRTryo0.getHeight();
        final int i12 = width;
        return MeasureScope.CC.p(measureScope, i12, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
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
                int width2;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !Dp.m3956equalsimpl0(f10, Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM()) ? iN : (i12 - iN2) - placeableMo3011measureBRTryo0.getWidth();
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, width2, AlignmentLineKt.getHorizontal(alignmentLine) ? !Dp.m3956equalsimpl0(f10, Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM()) ? iN : (iMax - iN2) - placeableMo3011measureBRTryo0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m343paddingFrom4j6BHR0(@NotNull Modifier paddingFrom, @NotNull final AlignmentLine alignmentLine, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffset(alignmentLine, f10, f11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("after", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m344paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m343paddingFrom4j6BHR0(modifier, alignmentLine, f10, f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m345paddingFromY_r0B1c(@NotNull Modifier paddingFrom, @NotNull final AlignmentLine alignmentLine, final long j10, final long j11) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffset(alignmentLine, j10, j11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", TextUnit.m4122boximpl(j10));
                inspectorInfo.getProperties().set("after", TextUnit.m4122boximpl(j11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m346paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE();
        }
        return m345paddingFromY_r0B1c(modifier, alignmentLine, j12, j11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m347paddingFromBaselineVpY3zN4(@NotNull Modifier paddingFromBaseline, float f10, float f11) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        Dp.Companion companion = Dp.INSTANCE;
        return paddingFromBaseline.then(!Dp.m3956equalsimpl0(f10, companion.m3971getUnspecifiedD9Ej5fM()) ? m344paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f10, 0.0f, 4, null) : Modifier.INSTANCE).then(!Dp.m3956equalsimpl0(f11, companion.m3971getUnspecifiedD9Ej5fM()) ? m344paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f11, 2, null) : Modifier.INSTANCE);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m348paddingFromBaselineVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m347paddingFromBaselineVpY3zN4(modifier, f10, f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m349paddingFromBaselinewCyjxdI(@NotNull Modifier paddingFromBaseline, long j10, long j11) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        return paddingFromBaseline.then(!TextUnitKt.m4150isUnspecifiedR2X_6o(j10) ? m346paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j10, 0L, 4, null) : Modifier.INSTANCE).then(!TextUnitKt.m4150isUnspecifiedR2X_6o(j11) ? m346paddingFromY_r0B1c$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j11, 2, null) : Modifier.INSTANCE);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m350paddingFromBaselinewCyjxdI$default(Modifier modifier, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE();
        }
        if ((i10 & 2) != 0) {
            j11 = TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE();
        }
        return m349paddingFromBaselinewCyjxdI(modifier, j10, j11);
    }
}
