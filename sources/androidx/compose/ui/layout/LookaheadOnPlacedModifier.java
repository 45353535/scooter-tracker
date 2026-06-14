package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import com.ironsource.C4257c4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/LookaheadOnPlacedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "", "callback", "Lkotlin/Function0;", "rootCoordinates", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", C4257c4.f42802f, "onPlaced", "(Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;)V", "Lkotlin/jvm/functions/Function2;", "getCallback", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "getRootCoordinates", "()Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LookaheadOnPlacedModifier implements Modifier.Element {

    @NotNull
    private final Function2<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, Unit> callback;

    @NotNull
    private final Function0<LookaheadLayoutCoordinates> rootCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadOnPlacedModifier(@NotNull Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> callback, @NotNull Function0<? extends LookaheadLayoutCoordinates> rootCoordinates) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.callback = callback;
        this.rootCoordinates = rootCoordinates;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
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
    public final Function2<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, Unit> getCallback() {
        return this.callback;
    }

    @NotNull
    public final Function0<LookaheadLayoutCoordinates> getRootCoordinates() {
        return this.rootCoordinates;
    }

    public final void onPlaced(@NotNull LookaheadLayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.callback.invoke(this.rootCoordinates.invoke(), coordinates);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
