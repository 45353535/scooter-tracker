package androidx.room.util;

import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.room.InvalidationTracker;
import androidx.room.PooledConnection;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wf.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0080H¢\u0006\u0002\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"internalPerform", "R", "Landroidx/room/RoomDatabase;", "isReadOnly", "", "inTransaction", "block", "Lkotlin/Function2;", "Landroidx/room/PooledConnection;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dropFtsSyncTriggers", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "foreignKeyCheck", "db", "tableName", "", "processForeignKeyCheckFailure", "stmt", "Landroidx/sqlite/SQLiteStatement;", "processForeignKeyCheckFailure$DBUtil__DBUtilKt", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
final /* synthetic */ class DBUtil__DBUtilKt {

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtilKt$internalPerform$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 176)
    @e(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", f = "DBUtil.kt", l = {56, 57, 59, 60, 65}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k implements Function2<Transactor, Continuation, Object> {
        final /* synthetic */ Function2<PooledConnection, Continuation, Object> $block;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        final /* synthetic */ RoomDatabase $this_internalPerform;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z10, boolean z11, RoomDatabase roomDatabase, Function2<? super PooledConnection, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$inTransaction = z10;
            this.$isReadOnly = z11;
            this.$this_internalPerform = roomDatabase;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Transactor transactor, Continuation continuation) {
            return ((AnonymousClass2) create(transactor, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            if (r9.sync$room_runtime(r8) == r0) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[PHI: r1 r9
  0x00a8: PHI (r1v11 androidx.room.Transactor) = (r1v8 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtilKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) throws Throwable {
            Transactor transactor = (Transactor) this.L$0;
            z.c(10);
            if (!this.$inTransaction) {
                return this.$block.invoke(transactor, this);
            }
            boolean z10 = this.$isReadOnly;
            Transactor.SQLiteTransactionType sQLiteTransactionType = z10 ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (!z10) {
                z.c(0);
                Object objInTransaction = transactor.inTransaction(this);
                z.c(1);
                if (!((Boolean) objInTransaction).booleanValue()) {
                    InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
                    z.c(0);
                    invalidationTracker.sync$room_runtime(this);
                    z.c(1);
                }
            }
            DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
            z.c(0);
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$1, this);
            z.c(1);
            if (!this.$isReadOnly) {
                z.c(0);
                Object objInTransaction2 = transactor.inTransaction(this);
                z.c(1);
                if (!((Boolean) objInTransaction2).booleanValue()) {
                    this.$this_internalPerform.getInvalidationTracker().refreshAsync();
                }
            }
            return objWithTransaction;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@NotNull SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (sQLiteStatementPrepare.step()) {
            try {
                listCreateListBuilder.add(sQLiteStatementPrepare.getText(0));
            } finally {
            }
        }
        Unit unit = Unit.f93236a;
        a.a(sQLiteStatementPrepare, null);
        for (String str : CollectionsKt.build(listCreateListBuilder)) {
            if (StringsKt.a0(str, "room_fts_content_sync_", false, 2, null)) {
                SQLite.execSQL(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@NotNull SQLiteConnection db2, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        SQLiteStatement sQLiteStatementPrepare = db2.prepare("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (sQLiteStatementPrepare.step()) {
                throw new SQLException(processForeignKeyCheckFailure$DBUtil__DBUtilKt(sQLiteStatementPrepare));
            }
            Unit unit = Unit.f93236a;
            a.a(sQLiteStatementPrepare, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.a(sQLiteStatementPrepare, th2);
                throw th3;
            }
        }
    }

    @Nullable
    public static final <R> Object internalPerform(@NotNull RoomDatabase roomDatabase, boolean z10, boolean z11, @NotNull Function2<? super PooledConnection, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return roomDatabase.useConnection(z10, new AnonymousClass2(z11, z10, roomDatabase, function2, null), continuation);
    }

    private static final <R> Object internalPerform$$forInline(RoomDatabase roomDatabase, boolean z10, boolean z11, Function2<? super PooledConnection, ? super Continuation, ? extends Object> function2, Continuation continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(z11, z10, roomDatabase, function2, null);
        z.c(0);
        Object objUseConnection = roomDatabase.useConnection(z10, anonymousClass2, continuation);
        z.c(1);
        return objUseConnection;
    }

    private static final String processForeignKeyCheckFailure$DBUtil__DBUtilKt(SQLiteStatement sQLiteStatement) {
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        do {
            if (i10 == 0) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(sQLiteStatement.getText(0));
                sb2.append("'.\n");
            }
            String text = sQLiteStatement.getText(3);
            if (!linkedHashMap.containsKey(text)) {
                linkedHashMap.put(text, sQLiteStatement.getText(2));
            }
            i10++;
        } while (sQLiteStatement.step());
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append("Number of rows in violation: ");
        sb2.append(i10);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb2.append("\tParent Table = ");
            sb2.append(str2);
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append(str);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb2.toString();
    }
}
