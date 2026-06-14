package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import gg.a;
import hg.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "()V", "interactions", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroidx/compose/foundation/interaction/Interaction;", "getInteractions", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "emit", "", "interaction", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    @NotNull
    private final MutableSharedFlow interactions = c0.b(0, 16, a.f72766c, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    @Nullable
    public Object emit(@NotNull Interaction interaction, @NotNull Continuation continuation) {
        Object objEmit = getInteractions().emit(interaction, continuation);
        return objEmit == b.g() ? objEmit : Unit.f93236a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(@NotNull Interaction interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        return getInteractions().g(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @NotNull
    public MutableSharedFlow getInteractions() {
        return this.interactions;
    }
}
