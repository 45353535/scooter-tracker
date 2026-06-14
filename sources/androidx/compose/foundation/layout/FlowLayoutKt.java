package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aP\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001b\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001d\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\u00020 2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b#\u0010$\u001a\u008f\u0001\u00103\u001a\u00020 2\u0006\u0010&\u001a\u00020%2*\u0010'\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2$\u00100\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0.2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001aU\u0010;\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u001e\u00108\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<\u001au\u0010=\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u001e\u00108\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010>\u001aE\u0010B\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u0006\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010C\u001au\u0010B\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u001e\u00108\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006072\u0006\u0010A\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010>\u001a3\u0010I\u001a\u00020H*\u00020/2\u0006\u0010E\u001a\u00020D2\u0006\u0010&\u001a\u00020%2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\bI\u0010J\u001a#\u0010L\u001a\u00020\u0006*\u00020K2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0006H\u0000¢\u0006\u0004\bL\u0010M\u001a#\u0010N\u001a\u00020\u0006*\u00020K2\u0006\u0010&\u001a\u00020%2\u0006\u00108\u001a\u00020\u0006H\u0000¢\u0006\u0004\bN\u0010M\u001a\u001b\u00108\u001a\u00020\u0006*\u00020O2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b8\u0010P\u001a\u001b\u0010+\u001a\u00020\u0006*\u00020O2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b+\u0010P\u001a9\u0010R\u001a\u00020\u0006*\u00020K2\u0006\u0010G\u001a\u00020F2\u0006\u0010&\u001a\u00020%2\u0014\u0010Q\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\bR\u0010S\"2\u0010T\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U\"2\u0010V\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006W"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "", "maxItemsInEachRow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/ColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "mainAxisRowArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;", "mainAxisColumnArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "mainAxisArrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "crossAxisArrangement", "flowMeasurePolicy-942rkJo", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function4;I)Landroidx/compose/ui/layout/MeasurePolicy;", "flowMeasurePolicy", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "maxIntrinsicMainAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I", "minIntrinsicMainAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)I", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "intrinsicCrossAxisSize", "(Ljava/util/List;[I[IIII)I", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "measureHelper", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/OrientationIndependentConstraints;I)Landroidx/compose/foundation/layout/FlowResult;", "Landroidx/compose/ui/layout/Measurable;", "mainAxisMin", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/LayoutOrientation;I)I", "crossAxisMin", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/LayoutOrientation;)I", "storePlaceable", "measureAndCache", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/OrientationIndependentConstraints;Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function1;)I", "crossAxisRowArrangement", "Lkotlin/jvm/functions/Function4;", "crossAxisColumnArrangement", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowLayoutKt {

    @NotNull
    private static final Function4<Integer, int[], MeasureScope, int[], Unit> crossAxisRowArrangement = new Function4<Integer, int[], MeasureScope, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$crossAxisRowArrangement$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, MeasureScope measureScope, int[] iArr2) {
            invoke(num.intValue(), iArr, measureScope, iArr2);
            return Unit.f93236a;
        }

        public final void invoke(int i10, @NotNull int[] size, @NotNull MeasureScope measureScope, @NotNull int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(measureScope, "measureScope");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            Arrangement.INSTANCE.getTop().arrange(measureScope, i10, size, outPosition);
        }
    };

    @NotNull
    private static final Function4<Integer, int[], MeasureScope, int[], Unit> crossAxisColumnArrangement = new Function4<Integer, int[], MeasureScope, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$crossAxisColumnArrangement$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, MeasureScope measureScope, int[] iArr2) {
            invoke(num.intValue(), iArr, measureScope, iArr2);
            return Unit.f93236a;
        }

        public final void invoke(int i10, @NotNull int[] size, @NotNull MeasureScope measureScope, @NotNull int[] outPosition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(measureScope, "measureScope");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            Arrangement.INSTANCE.getStart().arrange(measureScope, i10, size, measureScope.getLayoutDirection(), outPosition);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FlowColumn(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r16, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r17, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r18, int r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.layout.ExperimentalLayoutApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FlowRow(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r16, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r17, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r18, int r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.layout.FlowResult breakDownItems(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.MeasureScope r23, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.RowColumnMeasurementHelper r24, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.LayoutOrientation r25, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.OrientationIndependentConstraints r26, int r27) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.breakDownItems(androidx.compose.ui.layout.MeasureScope, androidx.compose.foundation.layout.RowColumnMeasurementHelper, androidx.compose.foundation.layout.LayoutOrientation, androidx.compose.foundation.layout.OrientationIndependentConstraints, int):androidx.compose.foundation.layout.FlowResult");
    }

    @Composable
    private static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i10, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(-2013098357);
        if ((i12 & 1) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i12 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getStart();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i11, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)");
        }
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5MainAxisColumnArrangement = mainAxisColumnArrangement(vertical, composer, i11 & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(horizontal);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(horizontal);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CrossAxisAlignment crossAxisAlignment = (CrossAxisAlignment) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i10);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged2 = composer.changed(horizontal) | composer.changed(vertical) | composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = m397flowMeasurePolicy942rkJo(LayoutOrientation.Vertical, function5MainAxisColumnArrangement, vertical.getSpacing(), SizeMode.Wrap, crossAxisAlignment, crossAxisColumnArrangement, i10);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final int crossAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation orientation, int i10) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicHeight(i10) : measurable.minIntrinsicWidth(i10);
    }

    public static final int crossAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: flowMeasurePolicy-942rkJo, reason: not valid java name */
    private static final MeasurePolicy m397flowMeasurePolicy942rkJo(final LayoutOrientation layoutOrientation, final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, final float f10, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment, final Function4<? super Integer, ? super int[], ? super MeasureScope, ? super int[], Unit> function4, final int i10) {
        return new MeasurePolicy(function5, f10, sizeMode, crossAxisAlignment, i10, function4) { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1
            final /* synthetic */ float $arrangementSpacing;
            final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
            final /* synthetic */ Function4<Integer, int[], MeasureScope, int[], Unit> $crossAxisArrangement;
            final /* synthetic */ SizeMode $crossAxisSize;
            final /* synthetic */ Function5<Integer, int[], LayoutDirection, Density, int[], Unit> $mainAxisArrangement;
            final /* synthetic */ int $maxItemsInMainAxis;

            @NotNull
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;

            @NotNull
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;

            @NotNull
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;

            @NotNull
            private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$mainAxisArrangement = function5;
                this.$arrangementSpacing = f10;
                this.$crossAxisSize = sizeMode;
                this.$crossAxisAlignment = crossAxisAlignment;
                this.$maxItemsInMainAxis = i10;
                this.$crossAxisArrangement = function4;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                this.maxMainAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                    }
                };
                this.maxCrossAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                    }
                };
                this.minCrossAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i12));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i12));
                    }
                };
                this.minMainAxisIntrinsicItemSize = this.$orientation == layoutOrientation2 ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i12));
                    }
                } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                    }

                    @NotNull
                    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11, int i12) {
                        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "$this$null");
                        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i12));
                    }
                };
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
                return this.maxCrossAxisIntrinsicItemSize;
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
                return this.maxMainAxisIntrinsicItemSize;
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
                return this.minCrossAxisIntrinsicItemSize;
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
                return this.minMainAxisIntrinsicItemSize;
            }

            public final int intrinsicCrossAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int mainAxisAvailable, int arrangementSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.intrinsicCrossAxisSize((List<? extends IntrinsicMeasurable>) measurables, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minMainAxisIntrinsicItemSize, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minCrossAxisIntrinsicItemSize, mainAxisAvailable, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing)) : maxIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing));
            }

            public final int maxIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int height, int arrangementSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? maxIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing)) : intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@NotNull final MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                int crossAxisTotalSize;
                int mainAxisTotalSize;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.$orientation, this.$mainAxisArrangement, this.$arrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, measurables, new Placeable[measurables.size()], null);
                final FlowResult flowResultBreakDownItems = FlowLayoutKt.breakDownItems(measure, rowColumnMeasurementHelper, this.$orientation, new OrientationIndependentConstraints(j10, this.$orientation, null), this.$maxItemsInMainAxis);
                int crossAxisTotalSize2 = flowResultBreakDownItems.getCrossAxisTotalSize();
                MutableVector<RowColumnMeasureHelperResult> items = flowResultBreakDownItems.getItems();
                int size = items.getSize();
                int[] iArr = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr[i11] = items.getContent()[i11].getCrossAxisSize();
                }
                final int[] iArr2 = new int[size];
                this.$crossAxisArrangement.invoke(Integer.valueOf(crossAxisTotalSize2), iArr, measure, iArr2);
                if (this.$orientation == LayoutOrientation.Horizontal) {
                    crossAxisTotalSize = flowResultBreakDownItems.getMainAxisTotalSize();
                    mainAxisTotalSize = flowResultBreakDownItems.getCrossAxisTotalSize();
                } else {
                    crossAxisTotalSize = flowResultBreakDownItems.getCrossAxisTotalSize();
                    mainAxisTotalSize = flowResultBreakDownItems.getMainAxisTotalSize();
                }
                return MeasureScope.CC.p(measure, ConstraintsKt.m3933constrainWidthK40F9xA(j10, crossAxisTotalSize), ConstraintsKt.m3932constrainHeightK40F9xA(j10, mainAxisTotalSize), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1$measure$1
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
                        MutableVector<RowColumnMeasureHelperResult> items2 = flowResultBreakDownItems.getItems();
                        RowColumnMeasurementHelper rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
                        int[] iArr3 = iArr2;
                        MeasureScope measureScope = measure;
                        int size2 = items2.getSize();
                        if (size2 > 0) {
                            RowColumnMeasureHelperResult[] content = items2.getContent();
                            int i12 = 0;
                            do {
                                rowColumnMeasurementHelper2.placeHelper(layout, content[i12], iArr3[i12], measureScope.getLayoutDirection());
                                i12++;
                            } while (i12 < size2);
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing)) : minIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing));
            }

            public final int minIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int crossAxisAvailable, int arrangementSpacing) {
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return FlowLayoutKt.minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, arrangementSpacing, this.$maxItemsInMainAxis);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return this.$orientation == LayoutOrientation.Horizontal ? minIntrinsicMainAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing)) : intrinsicCrossAxisSize(measurables, i11, intrinsicMeasureScope.mo302roundToPx0680j_4(this.$arrangementSpacing));
            }
        };
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i10, int i11, int i12) {
        return intrinsicCrossAxisSize(list, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicCrossAxisSize, int i13, int i14) {
                Intrinsics.checkNotNullParameter(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
                return Integer.valueOf(iArr[i13]);
            }
        }, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicCrossAxisSize, int i13, int i14) {
                Intrinsics.checkNotNullParameter(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
                return Integer.valueOf(iArr2[i13]);
            }
        }, i10, i11, i12);
    }

    @Composable
    private static final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> mainAxisColumnArrangement(final Arrangement.Vertical vertical, Composer composer, int i10) {
        composer.startReplaceableGroup(-1642644113);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1642644113, i10, -1, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(vertical);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function5<Integer, int[], LayoutDirection, Density, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$mainAxisColumnArrangement$1$1
                {
                    super(5);
                }

                @Override // kotlin.jvm.functions.Function5
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                    invoke(num.intValue(), iArr, layoutDirection, density, iArr2);
                    return Unit.f93236a;
                }

                public final void invoke(int i11, @NotNull int[] size, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull int[] outPosition) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
                    Intrinsics.checkNotNullParameter(density, "density");
                    Intrinsics.checkNotNullParameter(outPosition, "outPosition");
                    vertical.arrange(density, i11, size, outPosition);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = (Function5) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function5;
    }

    public static final int mainAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation orientation, int i10) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? measurable.minIntrinsicWidth(i10) : measurable.minIntrinsicHeight(i10);
    }

    @Composable
    private static final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> mainAxisRowArrangement(final Arrangement.Horizontal horizontal, Composer composer, int i10) {
        composer.startReplaceableGroup(746410833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(746410833, i10, -1, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(horizontal);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function5<Integer, int[], LayoutDirection, Density, int[], Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$mainAxisRowArrangement$1$1
                {
                    super(5);
                }

                @Override // kotlin.jvm.functions.Function5
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
                    invoke(num.intValue(), iArr, layoutDirection, density, iArr2);
                    return Unit.f93236a;
                }

                public final void invoke(int i11, @NotNull int[] size, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull int[] outPosition) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                    Intrinsics.checkNotNullParameter(density, "density");
                    Intrinsics.checkNotNullParameter(outPosition, "outPosition");
                    horizontal.arrange(density, i11, size, layoutDirection, outPosition);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = (Function5) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function5;
    }

    public static final int mainAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = function3.invoke(list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10)).intValue() + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, i15 + iIntValue);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iIntValue;
            }
            i13 = i16;
        }
        return iMax;
    }

    private static final int measureAndCache(Measurable measurable, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation, Function1<? super Placeable, Unit> function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) != 0.0f) {
            return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
        }
        Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, 0, 0, 0, 14, null).m410toBoxConstraintsOenEA2s(layoutOrientation));
        function1.invoke(placeableMo3011measureBRTryo0);
        return mainAxisSize(placeableMo3011measureBRTryo0, layoutOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i10, int i11, int i12) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr2[i14] = 0;
        }
        int size3 = list.size();
        for (int i15 = 0; i15 < size3; i15++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i15);
            int iIntValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i15), Integer.valueOf(i10)).intValue();
            iArr[i15] = iIntValue;
            iArr2[i15] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i15), Integer.valueOf(iIntValue)).intValue();
        }
        int iSum = ArraysKt.sum(iArr);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i16 = iArr2[0];
        IntIterator it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
        while (it.hasNext()) {
            int i17 = iArr2[it.nextInt()];
            if (i16 < i17) {
                i16 = i17;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i18 = iArr[0];
        IntIterator it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
        while (it2.hasNext()) {
            int i19 = iArr[it2.nextInt()];
            if (i18 < i19) {
                i18 = i19;
            }
        }
        int i20 = i18;
        int iIntrinsicCrossAxisSize = i16;
        int i21 = iSum;
        while (i20 < iSum && iIntrinsicCrossAxisSize != i10) {
            int i22 = (i20 + iSum) / 2;
            List<? extends IntrinsicMeasurable> list2 = list;
            int i23 = i11;
            int i24 = i12;
            iIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i22, i23, i24);
            if (iIntrinsicCrossAxisSize == i10) {
                return i22;
            }
            if (iIntrinsicCrossAxisSize > i10) {
                i20 = i22 + 1;
            } else {
                iSum = i22 - 1;
            }
            list = list2;
            i21 = i22;
            i11 = i23;
            i12 = i24;
        }
        return i21;
    }

    @Composable
    private static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i10, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1479255111);
        if ((i12 & 1) != 0) {
            horizontal = Arrangement.INSTANCE.getEnd();
        }
        if ((i12 & 2) != 0) {
            vertical = Alignment.INSTANCE.getTop();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i11, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)");
        }
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5MainAxisRowArrangement = mainAxisRowArrangement(horizontal, composer, i11 & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(vertical);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(vertical);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CrossAxisAlignment crossAxisAlignment = (CrossAxisAlignment) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i10);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged2 = composer.changed(vertical) | composer.changed(horizontal) | composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = m397flowMeasurePolicy942rkJo(LayoutOrientation.Horizontal, function5MainAxisRowArrangement, horizontal.getSpacing(), SizeMode.Wrap, crossAxisAlignment, crossAxisRowArrangement, i10);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i10, int i11, int i12) {
        if (list.isEmpty()) {
            return 0;
        }
        Object orNull = CollectionsKt.getOrNull(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) orNull;
        int iIntValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i10)).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue)).intValue() : 0;
        int size = list.size();
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i14 < size) {
            list.get(i14);
            Intrinsics.checkNotNull(orNull);
            i13 -= iIntValue2;
            int iMax = Math.max(i16, iIntValue);
            i14++;
            Object orNull2 = CollectionsKt.getOrNull(list, i14);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) orNull2;
            int iIntValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i14), Integer.valueOf(i10)).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i14), Integer.valueOf(iIntValue3)).intValue() + i11 : 0;
            if (i13 >= 0 && i14 != list.size()) {
                if (i14 - i17 == i12 || i13 - iIntValue4 < 0) {
                }
                int i18 = iIntValue3;
                i16 = iMax;
                orNull = orNull2;
                iIntValue2 = iIntValue4;
                iIntValue = i18;
            }
            i15 += iMax;
            iIntValue4 -= i11;
            i13 = i10;
            iMax = 0;
            i17 = i14;
            int i182 = iIntValue3;
            i16 = iMax;
            orNull = orNull2;
            iIntValue2 = iIntValue4;
            iIntValue = i182;
        }
        return i15;
    }
}
