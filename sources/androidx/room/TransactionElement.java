package androidx.room;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/room/TransactionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/d;", "transactionDispatcher", "<init>", "(Lkotlin/coroutines/d;)V", "Lkotlin/coroutines/d;", "getTransactionDispatcher$room_runtime", "()Lkotlin/coroutines/d;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", C4240b4.i.W, "Key", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionElement implements CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final kotlin.coroutines.d transactionDispatcher;

    /* JADX INFO: renamed from: androidx.room.TransactionElement$Key, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/TransactionElement$Key;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/room/TransactionElement;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TransactionElement(@NotNull kotlin.coroutines.d transactionDispatcher) {
        Intrinsics.checkNotNullParameter(transactionDispatcher, "transactionDispatcher");
        this.transactionDispatcher = transactionDispatcher;
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

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b getKey() {
        return INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionDispatcher$room_runtime, reason: from getter */
    public final kotlin.coroutines.d getTransactionDispatcher() {
        return this.transactionDispatcher;
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
