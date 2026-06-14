package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B*\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\u00020\u00002 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R2\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutModifierImpl;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "create", "()Landroidx/compose/ui/layout/LayoutModifierImpl;", "node", "update", "(Landroidx/compose/ui/layout/LayoutModifierImpl;)Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lkotlin/jvm/functions/Function3;", MenuActionType.COPY, "(Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/layout/LayoutModifierElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function3;", "getMeasure", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class LayoutModifierElement extends ModifierNodeElement<LayoutModifierImpl> {

    @NotNull
    private final Function3<MeasureScope, Measurable, Constraints, MeasureResult> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutModifierElement(@NotNull Function3<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measure) {
        Intrinsics.checkNotNullParameter(measure, "measure");
        this.measure = measure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutModifierElement copy$default(LayoutModifierElement layoutModifierElement, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function3 = layoutModifierElement.measure;
        }
        return layoutModifierElement.copy(function3);
    }

    @NotNull
    public final Function3<MeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.measure;
    }

    @NotNull
    public final LayoutModifierElement copy(@NotNull Function3<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measure) {
        Intrinsics.checkNotNullParameter(measure, "measure");
        return new LayoutModifierElement(measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutModifierElement) && Intrinsics.areEqual(this.measure, ((LayoutModifierElement) other).measure);
    }

    @NotNull
    public final Function3<MeasureScope, Measurable, Constraints, MeasureResult> getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    @NotNull
    public String toString() {
        return "LayoutModifierElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public LayoutModifierImpl update(@NotNull LayoutModifierImpl node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setMeasureBlock(this.measure);
        return node;
    }
}
