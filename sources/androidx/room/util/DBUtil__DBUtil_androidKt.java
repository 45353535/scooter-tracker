package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.TransactionElement;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.driver.SupportSQLiteConnection;
import eg.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;
import uf.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00010\bH\u0087@¢\u0006\u0002\u0010\n\u001a?\u0010\u000b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001a:\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bH\u0087@¢\u0006\u0002\u0010\u0010\u001aB\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001e\b\u0004\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bH\u0082H¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001a\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007\u001a*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007\u001a\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020 H\u0007\u001a\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007\u001a\b\u0010(\u001a\u00020\u001dH\u0007\u001a\u0010\u0010)\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020 H\u0007¨\u0006*"}, d2 = {"performSuspending", "R", "db", "Landroidx/room/RoomDatabase;", "isReadOnly", "", "inTransaction", "block", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performBlocking", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "performInTransactionSuspending", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compatCoroutineExecute", "compatCoroutineExecute$DBUtil__DBUtil_androidKt", "(Landroidx/room/RoomDatabase;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/room/RoomDatabase;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "Landroid/database/Cursor;", "sqLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "maybeCopy", "signal", "Landroid/os/CancellationSignal;", "dropFtsSyncTriggers", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "foreignKeyCheck", "tableName", "", "readVersion", "", "databaseFile", "Ljava/io/File;", "createCancellationSignal", "toSQLiteConnection", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
final /* synthetic */ class DBUtil__DBUtil_androidKt {

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<SQLiteConnection, R> $block;
        final /* synthetic */ CoroutineContext $context;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        int label;

        /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
        static final class C01191 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Function1<SQLiteConnection, R> $block;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ boolean $inTransaction;
            final /* synthetic */ boolean $isReadOnly;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01191(RoomDatabase roomDatabase, boolean z10, boolean z11, Function1<? super SQLiteConnection, ? extends R> function1, Continuation continuation) {
                super(2, continuation);
                this.$db = roomDatabase;
                this.$inTransaction = z10;
                this.$isReadOnly = z11;
                this.$block = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01191(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    return obj;
                }
                d.b(obj);
                boolean z10 = !(this.$db.inCompatibilityMode() && this.$db.inTransaction()) && this.$inTransaction;
                RoomDatabase roomDatabase = this.$db;
                boolean z11 = this.$isReadOnly;
                DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1(z10, z11, roomDatabase, null, this.$block);
                this.label = 1;
                Object objUseConnection = roomDatabase.useConnection(z11, dBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1, this);
                return objUseConnection == objG ? objG : objUseConnection;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C01191) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(CoroutineContext coroutineContext, RoomDatabase roomDatabase, boolean z10, boolean z11, Function1<? super SQLiteConnection, ? extends R> function1, Continuation continuation) {
            super(2, continuation);
            this.$context = coroutineContext;
            this.$db = roomDatabase;
            this.$inTransaction = z10;
            this.$isReadOnly = z11;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$context, this.$db, this.$inTransaction, this.$isReadOnly, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                return obj;
            }
            d.b(obj);
            CoroutineContext coroutineContext = this.$context;
            C01191 c01191 = new C01191(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, null);
            this.label = 1;
            Object objG2 = g.g(coroutineContext, c01191, this);
            return objG2 == objG ? objG : objG2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
    static final class C16851<R> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C16851(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DBUtil.performInTransactionSuspending(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function1<Continuation, Object> {
        final /* synthetic */ Function1<Continuation, Object> $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(RoomDatabase roomDatabase, Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
            super(1, continuation);
            this.$db = roomDatabase;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.$db, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                return obj;
            }
            d.b(obj);
            RoomDatabase roomDatabase = this.$db;
            DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(true, false, roomDatabase, null, this.$block);
            this.label = 1;
            Object objUseConnection = roomDatabase.useConnection(false, dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1, this);
            return objUseConnection == objG ? objG : objUseConnection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
    static final class C16861<R> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C16861(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DBUtil.performSuspending(null, false, false, null, this);
        }
    }

    private static final <R> Object compatCoroutineExecute$DBUtil__DBUtil_androidKt(RoomDatabase roomDatabase, boolean z10, Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
        if (roomDatabase.inCompatibilityMode() && roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) {
            return function1.invoke(continuation);
        }
        z.c(0);
        Object coroutineContext = DBUtil.getCoroutineContext(roomDatabase, z10, continuation);
        z.c(1);
        DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 dBUtil__DBUtil_androidKt$compatCoroutineExecute$2 = new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(function1, null);
        z.c(0);
        Object objG = g.g((CoroutineContext) coroutineContext, dBUtil__DBUtil_androidKt$compatCoroutineExecute$2, continuation);
        z.c(1);
        return objG;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        DBUtil.dropFtsSyncTriggers(new SupportSQLiteConnection(db2));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@NotNull SupportSQLiteDatabase db2, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        DBUtil.foreignKeyCheck(new SupportSQLiteConnection(db2), tableName);
    }

    @Nullable
    public static final Object getCoroutineContext(@NotNull RoomDatabase roomDatabase, boolean z10, @NotNull Continuation continuation) {
        TransactionElement transactionElement = (TransactionElement) continuation.getContext().get(TransactionElement.INSTANCE);
        CoroutineContext transactionDispatcher = transactionElement != null ? transactionElement.getTransactionDispatcher() : null;
        if (roomDatabase.inCompatibilityMode()) {
            return transactionDispatcher != null ? roomDatabase.getQueryContext().plus(transactionDispatcher) : z10 ? roomDatabase.getTransactionContext$room_runtime() : roomDatabase.getQueryContext();
        }
        CoroutineContext queryContext = roomDatabase.getQueryContext();
        if (transactionDispatcher == null) {
            transactionDispatcher = kotlin.coroutines.e.f93267b;
        }
        return queryContext.plus(transactionDispatcher);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(@NotNull RoomDatabase db2, boolean z10, boolean z11, @NotNull Function1<? super SQLiteConnection, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        db2.assertNotMainThread();
        db2.assertNotSuspendingTransaction();
        CoroutineContext coroutineContext = db2.getSuspendingTransactionContext().get();
        if (coroutineContext == null) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        return (R) RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(coroutineContext, db2, z11, z10, block, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object performInTransactionSuspending(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) {
        /*
            boolean r1 = r13 instanceof androidx.room.util.DBUtil__DBUtil_androidKt.C16851
            if (r1 == 0) goto L14
            r1 = r13
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt.C16851) r1
            int r2 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r2 & r4
            if (r6 == 0) goto L14
            int r2 = r2 - r4
            r1.label = r2
        L12:
            r6 = r1
            goto L1a
        L14:
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1
            r1.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = pf.b.g()
            int r1 = r6.label
            r2 = 4
            r4 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L51
            if (r1 == r9) goto L4d
            if (r1 == r8) goto L49
            if (r1 == r4) goto L3d
            if (r1 != r2) goto L35
            kotlin.d.b(r0)
            return r0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r3 = r6.L$0
            androidx.room.RoomDatabase r3 = (androidx.room.RoomDatabase) r3
            kotlin.d.b(r0)
            goto L9f
        L49:
            kotlin.d.b(r0)
            return r0
        L4d:
            kotlin.d.b(r0)
            return r0
        L51:
            kotlin.d.b(r0)
            boolean r0 = r11.inCompatibilityMode()
            if (r0 == 0) goto L69
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r0.<init>(r11, r12, r10)
            r6.label = r9
            java.lang.Object r0 = androidx.room.RoomDatabaseKt.withTransactionContext(r11, r0, r6)
            if (r0 != r7) goto L68
            goto Lb2
        L68:
            return r0
        L69:
            boolean r0 = r11.inCompatibilityMode()
            if (r0 == 0) goto L90
            boolean r0 = r11.isOpenInternal$room_runtime()
            if (r0 == 0) goto L90
            boolean r0 = r11.inTransaction()
            if (r0 == 0) goto L90
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1
            r2 = 0
            r4 = 0
            r1 = 1
            r3 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.label = r8
            r1 = 0
            java.lang.Object r0 = r11.useConnection(r1, r0, r6)
            if (r0 != r7) goto L8f
            goto Lb2
        L8f:
            return r0
        L90:
            r6.L$0 = r11
            r6.L$1 = r12
            r6.label = r4
            java.lang.Object r0 = androidx.room.util.DBUtil.getCoroutineContext(r11, r9, r6)
            if (r0 != r7) goto L9d
            goto Lb2
        L9d:
            r3 = r11
            r1 = r12
        L9f:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r4 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r4.<init>(r10, r3, r1)
            r6.L$0 = r10
            r6.L$1 = r10
            r6.label = r2
            java.lang.Object r0 = eg.g.g(r0, r4, r6)
            if (r0 != r7) goto Lb3
        Lb2:
            return r7
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.performInTransactionSuspending(androidx.room.RoomDatabase, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object performSuspending(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r14, boolean r15, boolean r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends R> r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.room.util.DBUtil__DBUtil_androidKt.C16861
            if (r1 == 0) goto L16
            r1 = r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt.C16861) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = pf.b.g()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            kotlin.d.b(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.Z$1
            boolean r15 = r6.Z$0
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r3 = r6.L$0
            androidx.room.RoomDatabase r3 = (androidx.room.RoomDatabase) r3
            kotlin.d.b(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            kotlin.d.b(r0)
            return r0
        L53:
            kotlin.d.b(r0)
            boolean r0 = r14.inCompatibilityMode()
            if (r0 == 0) goto L7f
            boolean r0 = r14.isOpenInternal$room_runtime()
            if (r0 == 0) goto L7f
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L7f
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.label = r8
            java.lang.Object r14 = r14.useConnection(r15, r2, r6)
            if (r14 != r7) goto L7e
            goto Lae
        L7e:
            return r14
        L7f:
            r4 = r16
            r6.L$0 = r14
            r5 = r17
            r6.L$1 = r5
            r6.Z$0 = r15
            r6.Z$1 = r4
            r6.label = r3
            java.lang.Object r3 = androidx.room.util.DBUtil.getCoroutineContext(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Lae
        L94:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4d
        L99:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r8 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            java.lang.Object r14 = eg.g.g(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.performSuspending(androidx.room.RoomDatabase, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final Cursor query(@NotNull RoomDatabase db2, @NotNull SupportSQLiteQuery sqLiteQuery, boolean z10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return DBUtil.query(db2, sqLiteQuery, z10, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(@NotNull File databaseFile) throws IOException {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            c.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(channel, th2);
                throw th3;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final SQLiteConnection toSQLiteConnection(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        return new SupportSQLiteConnection(db2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final Cursor query(@NotNull RoomDatabase db2, @NotNull SupportSQLiteQuery sqLiteQuery, boolean z10, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }
}
