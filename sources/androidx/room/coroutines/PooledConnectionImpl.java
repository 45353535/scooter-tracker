package androidx.room.coroutines;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003:;<B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082H¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00028\u00000 H\u0096@¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "Landroidx/room/coroutines/ConnectionElementKey;", "connectionElementKey", "Landroidx/room/coroutines/ConnectionWithLock;", "delegate", "", "isReadOnly", "<init>", "(Landroidx/room/coroutines/ConnectionElementKey;Landroidx/room/coroutines/ConnectionWithLock;Z)V", "R", "Landroidx/room/Transactor$SQLiteTransactionType;", "type", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "block", "transaction", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "beginTransaction", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "success", "endTransaction", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "withStateCheck", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "usePrepared", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "inTransaction", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markRecycled", "()V", "Landroidx/room/coroutines/ConnectionElementKey;", "getConnectionElementKey", "()Landroidx/room/coroutines/ConnectionElementKey;", "Landroidx/room/coroutines/ConnectionWithLock;", "getDelegate", "()Landroidx/room/coroutines/ConnectionWithLock;", "Z", "()Z", "Lkotlin/collections/ArrayDeque;", "Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "transactionStack", "Lkotlin/collections/ArrayDeque;", "isRecycled", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "rawConnection", "TransactionItem", "TransactionImpl", "StatementWrapper", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PooledConnectionImpl implements Transactor, RawConnectionAccessor {

    @NotNull
    private final ConnectionElementKey connectionElementKey;

    @NotNull
    private final ConnectionWithLock delegate;
    private final boolean isReadOnly;
    private volatile boolean isRecycled;

    @NotNull
    private final ArrayDeque<TransactionItem> transactionStack;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\"\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0#H\u0082\b¢\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$StatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;Landroidx/sqlite/SQLiteStatement;)V", "threadId", "", "bindBlob", "", FirebaseAnalytics.Param.INDEX, "", "value", "", "bindDouble", "", "bindLong", "bindText", "", "bindNull", "getBlob", "getDouble", "getLong", "getText", "isNull", "", "getColumnCount", "getColumnName", "getColumnType", "step", "reset", "clearBindings", "close", "withStateCheck", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class StatementWrapper implements SQLiteStatement, AutoCloseable {

        @NotNull
        private final SQLiteStatement delegate;
        final /* synthetic */ PooledConnectionImpl this$0;
        private final long threadId;

        public StatementWrapper(@NotNull PooledConnectionImpl pooledConnectionImpl, SQLiteStatement delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = pooledConnectionImpl;
            this.delegate = delegate;
            this.threadId = ThreadLocal_jvmAndroidKt.currentThreadId();
        }

        private final <R> R withStateCheck(Function0<? extends R> block) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return block.invoke();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public void mo4249bindBlob(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo4249bindBlob(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindBoolean(int i10, boolean z10) {
            j.c.a(this, i10, z10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public void mo4250bindDouble(int index, double value) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo4250bindDouble(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindFloat(int i10, float f10) {
            j.c.b(this, i10, f10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindInt(int i10, int i11) {
            j.c.c(this, i10, i11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public void mo4251bindLong(int index, long value) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo4251bindLong(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public void mo4252bindNull(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo4252bindNull(index);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public void mo4253bindText(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo4253bindText(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public void mo4254clearBindings() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo4254clearBindings();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.close();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public byte[] getBlob(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getBlob(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ boolean getBoolean(int i10) {
            return j.c.d(this, i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnCount();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getColumnName(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnName(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ List getColumnNames() {
            return j.c.e(this);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnType(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getDouble(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ float getFloat(int i10) {
            return j.c.f(this, i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ int getInt(int i10) {
            return j.c.g(this, i10);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getLong(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getText(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getText(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.isNull(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.reset();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new g();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new g();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.step();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u000b0\u000fH\u0096@¢\u0006\u0002\u0010\u0011J>\u0010\u0012\u001a\u0002H\u000b\"\u0004\b\u0001\u0010\u000b2(\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0096@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl;", "T", "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;)V", "rawConnection", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "usePrepared", "R", "sql", "", "block", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withNestedTransaction", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rollback", "", "result", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class TransactionImpl<T> implements TransactionScope<T>, RawConnectionAccessor {
        public TransactionImpl() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        @NotNull
        public SQLiteConnection getRawConnection() {
            return PooledConnectionImpl.this.getRawConnection();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.room.TransactionScope
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object rollback(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) throws androidx.room.coroutines.ConnectionPool.RollbackException {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3c
                if (r2 == r3) goto L2e
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2e:
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
                java.lang.Object r1 = r0.L$1
                androidx.room.coroutines.PooledConnectionImpl r1 = (androidx.room.coroutines.PooledConnectionImpl) r1
                java.lang.Object r0 = r0.L$0
                kotlin.d.b(r9)
                goto L7f
            L3c:
                kotlin.d.b(r9)
                androidx.room.coroutines.PooledConnectionImpl r9 = androidx.room.coroutines.PooledConnectionImpl.this
                boolean r2 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled$p(r9)
                r5 = 21
                if (r2 != 0) goto Laf
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                androidx.room.coroutines.ConnectionElementKey r6 = r9.getConnectionElementKey()
                kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r6)
                androidx.room.coroutines.ConnectionElement r2 = (androidx.room.coroutines.ConnectionElement) r2
                if (r2 == 0) goto La4
                androidx.room.coroutines.PooledConnectionImpl r2 = r2.getConnectionWrapper()
                if (r2 != r9) goto La4
                kotlin.collections.ArrayDeque r2 = androidx.room.coroutines.PooledConnectionImpl.access$getTransactionStack$p(r9)
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L9c
                androidx.room.coroutines.ConnectionWithLock r2 = r9.getDelegate()
                r0.L$0 = r8
                r0.L$1 = r9
                r0.L$2 = r2
                r0.label = r3
                java.lang.Object r0 = r2.lock(r4, r0)
                if (r0 != r1) goto L7c
                return r1
            L7c:
                r0 = r8
                r1 = r9
                r8 = r2
            L7f:
                kotlin.collections.ArrayDeque r9 = androidx.room.coroutines.PooledConnectionImpl.access$getTransactionStack$p(r1)     // Catch: java.lang.Throwable -> L97
                java.lang.Object r9 = r9.last()     // Catch: java.lang.Throwable -> L97
                androidx.room.coroutines.PooledConnectionImpl$TransactionItem r9 = (androidx.room.coroutines.PooledConnectionImpl.TransactionItem) r9     // Catch: java.lang.Throwable -> L97
                r9.setShouldRollback(r3)     // Catch: java.lang.Throwable -> L97
                kotlin.Unit r9 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L97
                r8.unlock(r4)
                androidx.room.coroutines.ConnectionPool$RollbackException r8 = new androidx.room.coroutines.ConnectionPool$RollbackException
                r8.<init>(r0)
                throw r8
            L97:
                r9 = move-exception
                r8.unlock(r4)
                throw r9
            L9c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "Not in a transaction"
                r8.<init>(r9)
                throw r8
            La4:
                java.lang.String r8 = "Attempted to use connection on a different coroutine"
                androidx.sqlite.SQLite.throwSQLiteException(r5, r8)
                lf.g r8 = new lf.g
                r8.<init>()
                throw r8
            Laf:
                java.lang.String r8 = "Connection is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r5, r8)
                lf.g r8 = new lf.g
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.TransactionImpl.rollback(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.room.PooledConnection
        @Nullable
        public <R> Object usePrepared(@NotNull String str, @NotNull Function1<? super SQLiteStatement, ? extends R> function1, @NotNull Continuation continuation) {
            return PooledConnectionImpl.this.usePrepared(str, function1, continuation);
        }

        @Override // androidx.room.TransactionScope
        @Nullable
        public <R> Object withNestedTransaction(@NotNull Function2<? super TransactionScope<R>, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
            PooledConnectionImpl pooledConnectionImpl = PooledConnectionImpl.this;
            if (pooledConnectionImpl.isRecycled) {
                SQLite.throwSQLiteException(21, "Connection is recycled");
                throw new g();
            }
            ConnectionElement connectionElement = (ConnectionElement) continuation.getContext().get(pooledConnectionImpl.getConnectionElementKey());
            if (connectionElement != null && connectionElement.getConnectionWrapper() == pooledConnectionImpl) {
                return pooledConnectionImpl.transaction(null, function2, continuation);
            }
            SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
            throw new g();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "", "id", "", "shouldRollback", "", "<init>", "(IZ)V", "getId", "()I", "getShouldRollback", "()Z", "setShouldRollback", "(Z)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class TransactionItem {
        private final int id;
        private boolean shouldRollback;

        public TransactionItem(int i10, boolean z10) {
            this.id = i10;
            this.shouldRollback = z10;
        }

        public final int getId() {
            return this.id;
        }

        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }

        public final void setShouldRollback(boolean z10) {
            this.shouldRollback = z10;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW}, m = "beginTransaction")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return PooledConnectionImpl.this.beginTransaction(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$endTransaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW}, m = "endTransaction")
    static final class C16701 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C16701(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.endTransaction(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$transaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {464, 468, 482, 482, 482}, m = "transaction")
    static final class C16711<R> extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C16711(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.transaction(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$usePrepared$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {640}, m = "usePrepared")
    static final class C16721<R> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C16721(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.usePrepared(null, null, this);
        }
    }

    public PooledConnectionImpl(@NotNull ConnectionElementKey connectionElementKey, @NotNull ConnectionWithLock delegate, boolean z10) {
        Intrinsics.checkNotNullParameter(connectionElementKey, "connectionElementKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.connectionElementKey = connectionElementKey;
        this.delegate = delegate;
        this.isReadOnly = z10;
        this.transactionStack = new ArrayDeque<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object beginTransaction(androidx.room.Transactor.SQLiteTransactionType r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.room.coroutines.PooledConnectionImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r0 = (androidx.room.coroutines.PooledConnectionImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r0 = r0.L$0
            androidx.room.Transactor$SQLiteTransactionType r0 = (androidx.room.Transactor.SQLiteTransactionType) r0
            kotlin.d.b(r7)
            r7 = r6
            r6 = r0
            goto L4e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.d.b(r7)
            androidx.room.coroutines.ConnectionWithLock r7 = r5.delegate
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            kotlin.collections.ArrayDeque<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r0 = r5.transactionStack     // Catch: java.lang.Throwable -> L74
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L74
            kotlin.collections.ArrayDeque<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r1 = r5.transactionStack     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L8c
            int[] r1 = androidx.room.coroutines.PooledConnectionImpl.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L74
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L74
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L74
            if (r6 == r3) goto L84
            r1 = 2
            if (r6 == r1) goto L7c
            r1 = 3
            if (r6 != r1) goto L76
            androidx.room.coroutines.ConnectionWithLock r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "BEGIN EXCLUSIVE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r1)     // Catch: java.lang.Throwable -> L74
            goto La7
        L74:
            r6 = move-exception
            goto Lb8
        L76:
            lf.m r6 = new lf.m     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            throw r6     // Catch: java.lang.Throwable -> L74
        L7c:
            androidx.room.coroutines.ConnectionWithLock r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "BEGIN IMMEDIATE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r1)     // Catch: java.lang.Throwable -> L74
            goto La7
        L84:
            androidx.room.coroutines.ConnectionWithLock r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "BEGIN DEFERRED TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r1)     // Catch: java.lang.Throwable -> L74
            goto La7
        L8c:
            androidx.room.coroutines.ConnectionWithLock r6 = r5.delegate     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "SAVEPOINT '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            r1.append(r0)     // Catch: java.lang.Throwable -> L74
            r2 = 39
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L74
            androidx.sqlite.SQLite.execSQL(r6, r1)     // Catch: java.lang.Throwable -> L74
        La7:
            kotlin.collections.ArrayDeque<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r6 = r5.transactionStack     // Catch: java.lang.Throwable -> L74
            androidx.room.coroutines.PooledConnectionImpl$TransactionItem r1 = new androidx.room.coroutines.PooledConnectionImpl$TransactionItem     // Catch: java.lang.Throwable -> L74
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L74
            r6.addLast(r1)     // Catch: java.lang.Throwable -> L74
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L74
            r7.unlock(r4)
            return r6
        Lb8:
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.beginTransaction(androidx.room.Transactor$SQLiteTransactionType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object endTransaction(boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.endTransaction(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c2, code lost:
    
        if (endTransaction(false, r0) == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r11, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.transaction(androidx.room.Transactor$SQLiteTransactionType, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final <R> Object withStateCheck(Function0<? extends R> function0, Continuation continuation) {
        if (this.isRecycled) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new g();
        }
        z.c(3);
        throw null;
    }

    @NotNull
    public final ConnectionElementKey getConnectionElementKey() {
        return this.connectionElementKey;
    }

    @NotNull
    public final ConnectionWithLock getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    @NotNull
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    @Nullable
    public Object inTransaction(@NotNull Continuation continuation) {
        if (this.isRecycled) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new g();
        }
        ConnectionElement connectionElement = (ConnectionElement) continuation.getContext().get(getConnectionElementKey());
        if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
            return kotlin.coroutines.jvm.internal.b.a(!this.transactionStack.isEmpty() || this.delegate.inTransaction());
        }
        SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw new g();
    }

    /* JADX INFO: renamed from: isReadOnly, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void markRecycled() throws Exception {
        if (this.isRecycled) {
            return;
        }
        this.isRecycled = true;
        if (this.delegate.inTransaction()) {
            SQLite.execSQL(this.delegate, "ROLLBACK TRANSACTION");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.room.PooledConnection
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object usePrepared(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteStatement, ? extends R> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl.C16721
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = (androidx.room.coroutines.PooledConnectionImpl.C16721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$usePrepared$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.d.b(r9)
            r9 = r7
            r7 = r0
            goto L72
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            kotlin.d.b(r9)
            boolean r9 = access$isRecycled$p(r6)
            r2 = 21
            if (r9 != 0) goto La0
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            androidx.room.coroutines.ConnectionElementKey r5 = r6.getConnectionElementKey()
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r5)
            androidx.room.coroutines.ConnectionElement r9 = (androidx.room.coroutines.ConnectionElement) r9
            if (r9 == 0) goto L95
            androidx.room.coroutines.PooledConnectionImpl r9 = r9.getConnectionWrapper()
            if (r9 != r6) goto L95
            androidx.room.coroutines.ConnectionWithLock r9 = r6.delegate
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L72
            return r1
        L72:
            androidx.room.coroutines.PooledConnectionImpl$StatementWrapper r0 = new androidx.room.coroutines.PooledConnectionImpl$StatementWrapper     // Catch: java.lang.Throwable -> L88
            androidx.room.coroutines.ConnectionWithLock r1 = r6.delegate     // Catch: java.lang.Throwable -> L88
            androidx.sqlite.SQLiteStatement r7 = r1.prepare(r7)     // Catch: java.lang.Throwable -> L88
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L8a
            wf.a.a(r0, r4)     // Catch: java.lang.Throwable -> L88
            r9.unlock(r4)
            return r7
        L88:
            r7 = move-exception
            goto L91
        L8a:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r8 = move-exception
            wf.a.a(r0, r7)     // Catch: java.lang.Throwable -> L88
            throw r8     // Catch: java.lang.Throwable -> L88
        L91:
            r9.unlock(r4)
            throw r7
        L95:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            androidx.sqlite.SQLite.throwSQLiteException(r2, r7)
            lf.g r7 = new lf.g
            r7.<init>()
            throw r7
        La0:
            java.lang.String r7 = "Connection is recycled"
            androidx.sqlite.SQLite.throwSQLiteException(r2, r7)
            lf.g r7 = new lf.g
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.usePrepared(java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.room.Transactor
    @Nullable
    public <R> Object withTransaction(@NotNull Transactor.SQLiteTransactionType sQLiteTransactionType, @NotNull Function2<? super TransactionScope<R>, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        if (this.isRecycled) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new g();
        }
        ConnectionElement connectionElement = (ConnectionElement) continuation.getContext().get(getConnectionElementKey());
        if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
            return transaction(sQLiteTransactionType, function2, continuation);
        }
        SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw new g();
    }
}
