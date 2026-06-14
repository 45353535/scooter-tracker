package androidx.test.core.view;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class SuspendToFutureAdapter$launchFuture$1$1 extends y implements Function1<Continuation, Object> {
    SuspendToFutureAdapter$launchFuture$1$1(Object obj) {
        super(1, obj, Deferred.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull Continuation continuation) {
        return ((Deferred) this.receiver).await(continuation);
    }
}
