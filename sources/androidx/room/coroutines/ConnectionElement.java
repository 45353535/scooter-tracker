package androidx.room.coroutines;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/room/coroutines/ConnectionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$b;", C4240b4.i.W, "Landroidx/room/coroutines/PooledConnectionImpl;", "connectionWrapper", "<init>", "(Lkotlin/coroutines/CoroutineContext$b;Landroidx/room/coroutines/PooledConnectionImpl;)V", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/room/coroutines/PooledConnectionImpl;", "getConnectionWrapper", "()Landroidx/room/coroutines/PooledConnectionImpl;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ConnectionElement implements CoroutineContext.Element {

    @NotNull
    private final PooledConnectionImpl connectionWrapper;

    @NotNull
    private final CoroutineContext.b key;

    public ConnectionElement(@NotNull CoroutineContext.b key, @NotNull PooledConnectionImpl connectionWrapper) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(connectionWrapper, "connectionWrapper");
        this.key = key;
        this.connectionWrapper = connectionWrapper;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    @NotNull
    public final PooledConnectionImpl getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
