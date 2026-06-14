package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0005*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/DrawBackgroundModifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/ui/draw/DrawBackgroundModifier;", "node", "update", "(Landroidx/compose/ui/draw/DrawBackgroundModifier;)Landroidx/compose/ui/draw/DrawBackgroundModifier;", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Lkotlin/jvm/functions/Function1;", MenuActionType.COPY, "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawBehindElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {

    @NotNull
    private final Function1<DrawScope, Unit> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(@NotNull Function1<? super DrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.onDraw = onDraw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawBehindElement copy$default(DrawBehindElement drawBehindElement, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = drawBehindElement.onDraw;
        }
        return drawBehindElement.copy(function1);
    }

    @NotNull
    public final Function1<DrawScope, Unit> component1() {
        return this.onDraw;
    }

    @NotNull
    public final DrawBehindElement copy(@NotNull Function1<? super DrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        return new DrawBehindElement(onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawBehindElement) && Intrinsics.areEqual(this.onDraw, ((DrawBehindElement) other).onDraw);
    }

    @NotNull
    public final Function1<DrawScope, Unit> getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("drawBehind");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    @NotNull
    public String toString() {
        return "DrawBehindElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public DrawBackgroundModifier create() {
        return new DrawBackgroundModifier(this.onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public DrawBackgroundModifier update(@NotNull DrawBackgroundModifier node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setOnDraw(this.onDraw);
        return node;
    }
}
