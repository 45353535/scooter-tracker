package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/draw/DrawBackgroundModifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "setOnDraw", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {

    @NotNull
    private Function1<? super DrawScope, Unit> onDraw;

    public DrawBackgroundModifier(@NotNull Function1<? super DrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.onDraw = onDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.onDraw.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }

    @NotNull
    public final Function1<DrawScope, Unit> getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.a.a(this);
    }

    public final void setOnDraw(@NotNull Function1<? super DrawScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onDraw = function1;
    }
}
