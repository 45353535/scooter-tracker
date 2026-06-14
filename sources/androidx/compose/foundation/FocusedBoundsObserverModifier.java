package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001b\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "handler", "(Lkotlin/jvm/functions/Function1;)V", C4240b4.i.W, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "lastBounds", "parent", "value", "getValue", "()Lkotlin/jvm/functions/Function1;", "invoke", "focusedBounds", "onModifierLocalsUpdated", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FocusedBoundsObserverModifier implements ModifierLocalConsumer, ModifierLocalProvider<Function1<? super LayoutCoordinates, ? extends Unit>>, Function1<LayoutCoordinates, Unit> {

    @NotNull
    private final Function1<LayoutCoordinates, Unit> handler;

    @Nullable
    private LayoutCoordinates lastBounds;

    @Nullable
    private Function1<? super LayoutCoordinates, Unit> parent;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverModifier(@NotNull Function1<? super LayoutCoordinates, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
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

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<Function1<? super LayoutCoordinates, ? extends Unit>> getKey() {
        return FocusedBoundsKt.getModifierLocalFocusedBoundsObserver();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public Function1<? super LayoutCoordinates, ? extends Unit> getValue() {
        return this;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.f93236a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function1<? super LayoutCoordinates, Unit> function1 = (Function1) scope.getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        if (Intrinsics.areEqual(function1, this.parent)) {
            return;
        }
        this.parent = function1;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@Nullable LayoutCoordinates focusedBounds) {
        this.lastBounds = focusedBounds;
        this.handler.invoke(focusedBounds);
        Function1<? super LayoutCoordinates, Unit> function1 = this.parent;
        if (function1 != null) {
            function1.invoke(focusedBounds);
        }
    }
}
