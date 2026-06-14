package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import com.ironsource.C4257c4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedModifierImpl;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "(Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "onPlaced", C4257c4.f42802f, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OnPlacedModifierImpl extends Modifier.Node implements LayoutAwareModifierNode {

    @NotNull
    private Function1<? super LayoutCoordinates, Unit> callback;

    public OnPlacedModifierImpl(@NotNull Function1<? super LayoutCoordinates, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @NotNull
    public final Function1<LayoutCoordinates, Unit> getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public /* synthetic */ void onLookaheadPlaced(LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        androidx.compose.ui.node.b.a(this, lookaheadLayoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.callback.invoke(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public /* synthetic */ void mo3038onRemeasuredozmzZPI(long j10) {
        androidx.compose.ui.node.b.c(this, j10);
    }

    public final void setCallback(@NotNull Function1<? super LayoutCoordinates, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.callback = function1;
    }
}
