package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.MeasureScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static MeasureResult a(MeasureScope measureScope, int i10, int i11, Map alignmentLines, Function1 placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return new MeasureResult(i10, i11, alignmentLines, measureScope, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
                final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
                final /* synthetic */ int $width;

                @NotNull
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i10;
                    this.this$0 = measureScope;
                    this.$placementBlock = placementBlock;
                    this.width = i10;
                    this.height = i11;
                    this.alignmentLines = alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                    int i12 = this.$width;
                    LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                    MeasureScope measureScope2 = this.this$0;
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = measureScope2 instanceof LookaheadCapablePlaceable ? (LookaheadCapablePlaceable) measureScope2 : null;
                    Function1<Placeable.PlacementScope, Unit> function1 = this.$placementBlock;
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
                    Placeable.PlacementScope.parentWidth = i12;
                    Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                    boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(lookaheadCapablePlaceable);
                    function1.invoke(companion);
                    if (lookaheadCapablePlaceable != null) {
                        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
                    }
                    Placeable.PlacementScope.parentWidth = parentWidth;
                    Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
                    Placeable.PlacementScope._coordinates = layoutCoordinates;
                    Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult p(MeasureScope measureScope, int i10, int i11, Map map, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i12 & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return measureScope.layout(i10, i11, map, function1);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope, int i10, int i11, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return CC.a(measureScope, i10, i11, alignmentLines, placementBlock);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3025roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j10) {
            return androidx.compose.ui.unit.a.a(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3026roundToPx0680j_4(@NotNull MeasureScope measureScope, float f10) {
            return androidx.compose.ui.unit.a.b(measureScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3027toDpGaN1DYA(@NotNull MeasureScope measureScope, long j10) {
            return androidx.compose.ui.unit.a.c(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3028toDpu2uoSUM(@NotNull MeasureScope measureScope, float f10) {
            return androidx.compose.ui.unit.a.d(measureScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3030toDpSizekrfVVM(@NotNull MeasureScope measureScope, long j10) {
            return androidx.compose.ui.unit.a.f(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3031toPxR2X_6o(@NotNull MeasureScope measureScope, long j10) {
            return androidx.compose.ui.unit.a.g(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3032toPx0680j_4(@NotNull MeasureScope measureScope, float f10) {
            return androidx.compose.ui.unit.a.h(measureScope, f10);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return androidx.compose.ui.unit.a.i(measureScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3033toSizeXkaWNTQ(@NotNull MeasureScope measureScope, long j10) {
            return androidx.compose.ui.unit.a.j(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3034toSp0xMU5do(@NotNull MeasureScope measureScope, float f10) {
            return androidx.compose.ui.unit.a.k(measureScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3035toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f10) {
            return androidx.compose.ui.unit.a.l(measureScope, f10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3029toDpu2uoSUM(@NotNull MeasureScope measureScope, int i10) {
            return androidx.compose.ui.unit.a.e(measureScope, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3036toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i10) {
            return androidx.compose.ui.unit.a.m(measureScope, i10);
        }
    }

    @NotNull
    MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock);
}
