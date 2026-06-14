package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import com.ironsource.V5;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0013\u001a\u00020\u00122\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\r0)j\b\u0012\u0004\u0012\u00020\r`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0015\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Landroidx/room/coroutines/ConnectionPoolImpl;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/sqlite/SQLiteDriver;", "driver", "", V5.c.f41892b, "", "preparedStatementCacheSize", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;I)V", "maxNumOfReaders", "maxNumOfWriters", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;III)V", "Landroidx/room/coroutines/PooledConnectionImpl;", "connection", "Lkotlin/coroutines/CoroutineContext;", "createConnectionContext", "(Landroidx/room/coroutines/PooledConnectionImpl;)Lkotlin/coroutines/CoroutineContext;", "", "isReadOnly", "", "onTimeout", "(Z)V", "R", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "block", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Landroidx/sqlite/SQLiteDriver;", "Landroidx/room/coroutines/Pool;", "readers", "Landroidx/room/coroutines/Pool;", "writers", "Landroidx/room/coroutines/ConnectionElementKey;", "connectionElementKey", "Landroidx/room/coroutines/ConnectionElementKey;", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "connectionThreadLocal", "Ljava/lang/ThreadLocal;", "isClosed", "Z", "Lkotlin/time/b;", "timeout", "J", "getTimeout-UwyO8pc$room_runtime", "()J", "setTimeout-LRDsOJo$room_runtime", "(J)V", "I", "getOnTimeout$room_runtime", "()I", "setOnTimeout$room_runtime", "(I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectionPoolImpl implements ConnectionPool, AutoCloseable {

    @NotNull
    private final ConnectionElementKey connectionElementKey;

    @NotNull
    private final ThreadLocal<PooledConnectionImpl> connectionThreadLocal;

    @NotNull
    private final SQLiteDriver driver;
    private volatile boolean isClosed;
    private int onTimeout;

    @NotNull
    private final Pool readers;
    private long timeout;

    @NotNull
    private final Pool writers;

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 135, 154, 159}, m = "useConnection")
    static final class AnonymousClass1<R> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<Transactor, Continuation, Object> $block;
        final /* synthetic */ PooledConnectionImpl $confinedConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Transactor, ? super Continuation, ? extends Object> function2, PooledConnectionImpl pooledConnectionImpl, Continuation continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$confinedConnection = pooledConnectionImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$block, this.$confinedConnection, continuation);
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
            PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
            this.label = 1;
            Object objInvoke = function2.invoke(pooledConnectionImpl, this);
            return objInvoke == objG ? objG : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {159}, m = "invokeSuspend")
    static final class AnonymousClass4 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<Transactor, Continuation, Object> $block;
        final /* synthetic */ Ref$ObjectRef $connection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function2<? super Transactor, ? super Continuation, ? extends Object> function2, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$connection = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.$block, this.$connection, continuation);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.room.coroutines.ConnectionPoolImpl$useConnection$4 for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.d.b(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.d.b(r4)
                kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation, java.lang.Object> r4 = r3.$block
                kotlin.jvm.internal.Ref$ObjectRef r1 = r3.$connection
                java.lang.Object r1 = r1.f93280b
                r3.label = r2
                java.lang.Object r4 = r4.invoke(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public ConnectionPoolImpl(@NotNull final SQLiteDriver driver, @NotNull final String fileName, int i10) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new ConnectionElementKey();
        this.connectionThreadLocal = new ThreadLocal<>();
        b.a aVar = kotlin.time.b.f93560c;
        this.timeout = kotlin.time.c.s(30, cg.b.f6839f);
        this.onTimeout = 2;
        this.driver = driver;
        Pool pool = new Pool(1, new Function0() { // from class: androidx.room.coroutines.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return driver.open(fileName);
            }
        }, i10);
        this.readers = pool;
        this.writers = pool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) throws Exception {
        SQLiteConnection sQLiteConnectionOpen = sQLiteDriver.open(str);
        SQLite.execSQL(sQLiteConnectionOpen, "PRAGMA query_only = 1");
        return sQLiteConnectionOpen;
    }

    private final CoroutineContext createConnectionContext(PooledConnectionImpl connection) {
        return new ConnectionElement(this.connectionElementKey, connection).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.connectionThreadLocal, connection));
    }

    private final void onTimeout(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.dump(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.dump(sb2);
        try {
            SQLite.throwSQLiteException(5, sb2.toString());
            throw new g();
        } catch (SQLException e10) {
            int i10 = this.onTimeout;
            if (i10 == 1) {
                throw e10;
            }
            if (i10 != 2) {
                return;
            }
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useConnection$lambda$6(ConnectionPoolImpl connectionPoolImpl, boolean z10) {
        connectionPoolImpl.onTimeout(z10);
        return Unit.f93236a;
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.readers.close();
        this.writers.close();
    }

    /* JADX INFO: renamed from: getOnTimeout$room_runtime, reason: from getter */
    public final int getOnTimeout() {
        return this.onTimeout;
    }

    /* JADX INFO: renamed from: getTimeout-UwyO8pc$room_runtime, reason: not valid java name and from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    public final void setOnTimeout$room_runtime(int i10) {
        this.onTimeout = i10;
    }

    /* JADX INFO: renamed from: setTimeout-LRDsOJo$room_runtime, reason: not valid java name */
    public final void m4247setTimeoutLRDsOJo$room_runtime(long j10) {
        this.timeout = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013d A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #3 {all -> 0x0177, blocks: (B:64:0x0121, B:69:0x0132, B:71:0x013d, B:81:0x017b, B:82:0x0182), top: B:103:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b A[Catch: all -> 0x0177, TRY_ENTER, TryCatch #3 {all -> 0x0177, blocks: (B:64:0x0121, B:69:0x0132, B:71:0x013d, B:81:0x017b, B:82:0x0182), top: B:103:0x0121 }] */
    @Override // androidx.room.coroutines.ConnectionPool
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object useConnection(boolean r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.useConnection(boolean, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ConnectionPoolImpl(@NotNull final SQLiteDriver driver, @NotNull final String fileName, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new ConnectionElementKey();
        this.connectionThreadLocal = new ThreadLocal<>();
        b.a aVar = kotlin.time.b.f93560c;
        this.timeout = kotlin.time.c.s(30, cg.b.f6839f);
        this.onTimeout = 2;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.driver = driver;
            this.readers = new Pool(i10, new Function0() { // from class: androidx.room.coroutines.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConnectionPoolImpl._init_$lambda$4(driver, fileName);
                }
            }, i12);
            this.writers = new Pool(i11, new Function0() { // from class: androidx.room.coroutines.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return driver.open(fileName);
                }
            }, i12);
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
