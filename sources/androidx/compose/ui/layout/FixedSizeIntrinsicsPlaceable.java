package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.IntSizeKt;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/FixedSizeIntrinsicsPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "", "width", "height", "<init>", "(II)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/unit/IntOffset;", C4240b4.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i10, int i11) {
        m3044setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i10, i11));
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo3012placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
    }
}
