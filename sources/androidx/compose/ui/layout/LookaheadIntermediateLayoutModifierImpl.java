package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BD\u0012$\u0010\t\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR8\u0010\t\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010 \u001a\u00020\u00078\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/LookaheadIntermediateLayoutModifierImpl;", "Landroidx/compose/ui/layout/IntermediateLayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/layout/MeasureResult;", "measureBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;)V", "measurable", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function4;", "getMeasureBlock", "()Lkotlin/jvm/functions/Function4;", "targetSize", "J", "getTargetSize-YbymL2g", "()J", "setTargetSize-ozmzZPI", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LookaheadIntermediateLayoutModifierImpl extends InspectorValueInfo implements IntermediateLayoutModifier {

    @NotNull
    private final Function4<MeasureScope, Measurable, Constraints, IntSize, MeasureResult> measureBlock;
    private long targetSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadIntermediateLayoutModifierImpl(@NotNull Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> measureBlock, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.measureBlock = measureBlock;
        this.targetSize = IntSize.INSTANCE.m4116getZeroYbymL2g();
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LookaheadIntermediateLayoutModifierImpl)) {
            return false;
        }
        LookaheadIntermediateLayoutModifierImpl lookaheadIntermediateLayoutModifierImpl = (LookaheadIntermediateLayoutModifierImpl) other;
        return Intrinsics.areEqual(this.measureBlock, lookaheadIntermediateLayoutModifierImpl.measureBlock) && IntSize.m4109equalsimpl0(getTargetSize(), lookaheadIntermediateLayoutModifierImpl.getTargetSize());
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @NotNull
    public final Function4<MeasureScope, Measurable, Constraints, IntSize, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    @Override // androidx.compose.ui.layout.IntermediateLayoutModifier
    /* JADX INFO: renamed from: getTargetSize-YbymL2g, reason: from getter */
    public long getTargetSize() {
        return this.targetSize;
    }

    public int hashCode() {
        return (this.measureBlock.hashCode() * 31) + IntSize.m4112hashCodeimpl(getTargetSize());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.measureBlock.invoke(measure, measurable, Constraints.m3907boximpl(j10), IntSize.m4103boximpl(getTargetSize()));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return c.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.layout.IntermediateLayoutModifier
    /* JADX INFO: renamed from: setTargetSize-ozmzZPI */
    public void mo3014setTargetSizeozmzZPI(long j10) {
        this.targetSize = j10;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
