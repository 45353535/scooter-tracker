package androidx.room.coroutines;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import com.ironsource.C4240b4;
import com.ironsource.V5;
import eg.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012B\b\u0002\u0010\u0006\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007j\b\u0012\u0002\b\u0003\u0018\u0001`\u000b¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0096@¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RJ\u0010\u0006\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007j\b\u0012\u0002\b\u0003\u0018\u0001`\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "driver", "Landroidx/sqlite/SQLiteDriver;", V5.c.f41892b, "", "transactionWrapper", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Landroidx/room/coroutines/TransactionWrapper;", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "connection", "Lkotlin/Lazy;", "Landroidx/sqlite/SQLiteConnection;", "useConnection", "R", "isReadOnly", "", "block", "Landroidx/room/Transactor;", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "ConnectionElement", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PassthroughConnectionPool implements ConnectionPool, AutoCloseable {

    @NotNull
    private final Lazy connection;

    @NotNull
    private final SQLiteDriver driver;

    @NotNull
    private final String fileName;

    @Nullable
    private final Function2<Function1<? super Continuation, ? extends Object>, Continuation, Object> transactionWrapper;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Landroidx/room/coroutines/PassthroughConnection;", "connectionWrapper", "<init>", "(Landroidx/room/coroutines/PassthroughConnection;)V", "Landroidx/room/coroutines/PassthroughConnection;", "getConnectionWrapper", "()Landroidx/room/coroutines/PassthroughConnection;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", C4240b4.i.W, "Key", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ConnectionElement implements CoroutineContext.Element {

        /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PassthroughConnection connectionWrapper;

        /* JADX INFO: renamed from: androidx.room.coroutines.PassthroughConnectionPool$ConnectionElement$Key, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement$Key;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/room/coroutines/PassthroughConnectionPool$ConnectionElement;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements CoroutineContext.b {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public ConnectionElement(@NotNull PassthroughConnection connectionWrapper) {
            Intrinsics.checkNotNullParameter(connectionWrapper, "connectionWrapper");
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
        public final PassthroughConnection getConnectionWrapper() {
            return this.connectionWrapper;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        @NotNull
        public CoroutineContext.b getKey() {
            return INSTANCE;
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

    /* JADX INFO: renamed from: androidx.room.coroutines.PassthroughConnectionPool$useConnection$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.PassthroughConnectionPool$useConnection$2", f = "PassthroughConnectionPool.kt", l = {59}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<Transactor, Continuation, Object> $block;
        final /* synthetic */ PassthroughConnection $connectionWrapper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Transactor, ? super Continuation, ? extends Object> function2, PassthroughConnection passthroughConnection, Continuation continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$connectionWrapper = passthroughConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$block, this.$connectionWrapper, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            Function2<Transactor, Continuation, Object> function2 = this.$block;
            PassthroughConnection passthroughConnection = this.$connectionWrapper;
            this.label = 1;
            Object objInvoke = function2.invoke(passthroughConnection, this);
            return objInvoke == objG ? objG : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassthroughConnectionPool(@NotNull SQLiteDriver driver, @NotNull String fileName, @Nullable Function2<? super Function1<? super Continuation, ? extends Object>, ? super Continuation, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.transactionWrapper = function2;
        this.connection = i.a(new Function0() { // from class: androidx.room.coroutines.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PassthroughConnectionPool.connection$lambda$0(this.f5398b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection connection$lambda$0(PassthroughConnectionPool passthroughConnectionPool) {
        return passthroughConnectionPool.driver.open(passthroughConnectionPool.fileName);
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this.connection.isInitialized()) {
            ((SQLiteConnection) this.connection.getValue()).close();
        }
    }

    @Override // androidx.room.coroutines.ConnectionPool
    @Nullable
    public <R> Object useConnection(boolean z10, @NotNull Function2<? super Transactor, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        ConnectionElement connectionElement = (ConnectionElement) continuation.getContext().get(ConnectionElement.INSTANCE);
        PassthroughConnection connectionWrapper = connectionElement != null ? connectionElement.getConnectionWrapper() : null;
        if (connectionWrapper != null) {
            return function2.invoke(connectionWrapper, continuation);
        }
        PassthroughConnection passthroughConnection = new PassthroughConnection(this.transactionWrapper, (SQLiteConnection) this.connection.getValue());
        return g.g(new ConnectionElement(passthroughConnection), new AnonymousClass2(function2, passthroughConnection, null), continuation);
    }

    public /* synthetic */ PassthroughConnectionPool(SQLiteDriver sQLiteDriver, String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteDriver, str, (i10 & 4) != 0 ? null : function2);
    }
}
