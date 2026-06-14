package androidx.room.coroutines;

import androidx.annotation.IntRange;
import androidx.collection.LruCache;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u000289B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0004\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096A¢\u0006\u0004\b\u0004\u0010%J\u001a\u0010&\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b&\u0010$J\u001a\u0010'\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0018\u000100R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u0010 R\"\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u0002048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Landroidx/room/coroutines/ConnectionWithLock;", "Landroidx/sqlite/SQLiteConnection;", "Lkotlinx/coroutines/sync/Mutex;", "delegate", "lock", "", "preparedStatementCacheSize", "<init>", "(Landroidx/sqlite/SQLiteConnection;Lkotlinx/coroutines/sync/Mutex;I)V", "", "sql", "Landroidx/sqlite/SQLiteStatement;", "prepare", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;", "", "close", "()V", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "markAcquired", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/room/coroutines/ConnectionWithLock;", "markReleased", "()Landroidx/room/coroutines/ConnectionWithLock;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "dump", "(Ljava/lang/StringBuilder;)V", "toString", "()Ljava/lang/String;", "", "inTransaction", "()Z", "", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "Landroidx/sqlite/SQLiteConnection;", "Lkotlinx/coroutines/sync/Mutex;", "acquireCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "", "acquireThrowable", "Ljava/lang/Throwable;", "Landroidx/room/coroutines/ConnectionWithLock$PreparedStatementCache;", "preparedStatementCache", "Landroidx/room/coroutines/ConnectionWithLock$PreparedStatementCache;", "isLocked", "Lmg/e;", "getOnLock", "()Lmg/e;", "onLock", "PreparedStatementCache", "CachedStatement", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ConnectionWithLock implements SQLiteConnection, Mutex, AutoCloseable {

    @Nullable
    private CoroutineContext acquireCoroutineContext;

    @Nullable
    private Throwable acquireThrowable;

    @NotNull
    private final SQLiteConnection delegate;

    @NotNull
    private final Mutex lock;

    @Nullable
    private final PreparedStatementCache preparedStatementCache;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001b\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001J\u001b\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0096\u0001J\u001b\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0011H\u0096\u0001J\u001b\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0013H\u0096\u0001J\u001b\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001J\u001b\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0016H\u0096\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u001b\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0019H\u0096\u0001J\t\u0010\u001a\u001a\u00020\bH\u0096\u0001J\u0013\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u001d\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\u001e\u001a\u00020\u00192\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190 H\u0096\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\"\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010#\u001a\u00020\u00132\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010%\u001a\u00020\u00162\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010&\u001a\u00020\u00192\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\t\u0010(\u001a\u00020\bH\u0096\u0001J\t\u0010)\u001a\u00020\u000fH\u0096\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006*"}, d2 = {"Landroidx/room/coroutines/ConnectionWithLock$CachedStatement;", "Landroidx/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroidx/sqlite/SQLiteStatement;)V", "getDelegate", "()Landroidx/sqlite/SQLiteStatement;", "close", "", "bindBlob", FirebaseAnalytics.Param.INDEX, "", "value", "", "bindBoolean", "", "bindDouble", "", "bindFloat", "", "bindInt", "bindLong", "", "bindNull", "bindText", "", "clearBindings", "getBlob", "getBoolean", "getColumnCount", "getColumnName", "getColumnNames", "", "getColumnType", "getDouble", "getFloat", "getInt", "getLong", "getText", "isNull", "reset", "step", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CachedStatement implements SQLiteStatement, AutoCloseable {

        @NotNull
        private final SQLiteStatement delegate;

        public CachedStatement(@NotNull SQLiteStatement delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public void mo4249bindBlob(@IntRange(from = 1) int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo4249bindBlob(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void bindBoolean(@IntRange(from = 1) int index, boolean value) {
            this.delegate.bindBoolean(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public void mo4250bindDouble(@IntRange(from = 1) int index, double value) {
            this.delegate.mo4250bindDouble(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void bindFloat(@IntRange(from = 1) int index, float value) {
            this.delegate.bindFloat(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void bindInt(@IntRange(from = 1) int index, int value) {
            this.delegate.bindInt(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public void mo4251bindLong(@IntRange(from = 1) int index, long value) {
            this.delegate.mo4251bindLong(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public void mo4252bindNull(@IntRange(from = 1) int index) {
            this.delegate.mo4252bindNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public void mo4253bindText(@IntRange(from = 1) int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo4253bindText(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public void mo4254clearBindings() {
            this.delegate.mo4254clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            this.delegate.reset();
            this.delegate.mo4254clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public byte[] getBlob(@IntRange(from = 0) int index) {
            return this.delegate.getBlob(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean getBoolean(@IntRange(from = 0) int index) {
            return this.delegate.getBoolean(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getColumnName(@IntRange(from = 0) int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public List<String> getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(@IntRange(from = 0) int index) {
            return this.delegate.getColumnType(index);
        }

        @NotNull
        public final SQLiteStatement getDelegate() {
            return this.delegate;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(@IntRange(from = 0) int index) {
            return this.delegate.getDouble(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public float getFloat(@IntRange(from = 0) int index) {
            return this.delegate.getFloat(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getInt(@IntRange(from = 0) int index) {
            return this.delegate.getInt(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(@IntRange(from = 0) int index) {
            return this.delegate.getLong(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getText(@IntRange(from = 0) int index) {
            return this.delegate.getText(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(@IntRange(from = 0) int index) {
            return this.delegate.isNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            this.delegate.reset();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            return this.delegate.step();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\u0010"}, d2 = {"Landroidx/room/coroutines/ConnectionWithLock$PreparedStatementCache;", "Landroidx/collection/LruCache;", "", "Landroidx/sqlite/SQLiteStatement;", "maxSize", "", "<init>", "(Landroidx/room/coroutines/ConnectionWithLock;I)V", "create", C4240b4.i.W, "entryRemoved", "", "evicted", "", "oldValue", "newValue", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class PreparedStatementCache extends LruCache<String, SQLiteStatement> {
        public PreparedStatementCache(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        @NotNull
        public SQLiteStatement create(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return ConnectionWithLock.this.delegate.prepare(key);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean evicted, @NotNull String key, @NotNull SQLiteStatement oldValue, @Nullable SQLiteStatement newValue) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            oldValue.close();
            super.entryRemoved(evicted, key, oldValue, newValue);
        }

        public /* synthetic */ PreparedStatementCache(ConnectionWithLock connectionWithLock, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 25 : i10);
        }
    }

    public ConnectionWithLock(@NotNull SQLiteConnection delegate, @NotNull Mutex lock, int i10) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
        this.preparedStatementCache = i10 > 0 ? new PreparedStatementCache(i10) : null;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        PreparedStatementCache preparedStatementCache = this.preparedStatementCache;
        if (preparedStatementCache != null) {
            preparedStatementCache.evictAll();
        }
        this.delegate.close();
    }

    public final void dump(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
        } else {
            builder.append("\t\tStatus: Acquired connection");
            builder.append('\n');
            CoroutineContext coroutineContext = this.acquireCoroutineContext;
            if (coroutineContext != null) {
                builder.append("\t\tCoroutine: " + coroutineContext);
                builder.append('\n');
            }
            Throwable th2 = this.acquireThrowable;
            if (th2 != null) {
                builder.append("\t\tAcquired:");
                builder.append('\n');
                Iterator it = CollectionsKt.drop(StringsKt.F0(lf.c.b(th2)), 1).iterator();
                while (it.hasNext()) {
                    builder.append("\t\t" + ((String) it.next()));
                    builder.append('\n');
                }
            }
        }
        if (this.preparedStatementCache != null) {
            builder.append("\t\tPrepared Statement Cache Size: " + this.preparedStatementCache.size());
            builder.append('\n');
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @NotNull
    public mg.e getOnLock() {
        return this.lock.getOnLock();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(@NotNull Object owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return this.lock.holdsLock(owner);
    }

    @Override // androidx.sqlite.SQLiteConnection
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @Nullable
    public Object lock(@Nullable Object obj, @NotNull Continuation continuation) {
        return this.lock.lock(obj, continuation);
    }

    @NotNull
    public final ConnectionWithLock markAcquired(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    @NotNull
    public final ConnectionWithLock markReleased() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // androidx.sqlite.SQLiteConnection
    @NotNull
    public SQLiteStatement prepare(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        PreparedStatementCache preparedStatementCache = this.preparedStatementCache;
        if (preparedStatementCache == null) {
            return this.delegate.prepare(sql);
        }
        SQLiteStatement sQLiteStatement = preparedStatementCache.get(sql);
        Intrinsics.checkNotNull(sQLiteStatement);
        return new CachedStatement(sQLiteStatement);
    }

    @NotNull
    public String toString() {
        return this.delegate.toString();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(@Nullable Object owner) {
        return this.lock.tryLock(owner);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(@Nullable Object owner) {
        this.lock.unlock(owner);
    }

    public /* synthetic */ ConnectionWithLock(SQLiteConnection sQLiteConnection, Mutex mutex, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteConnection, (i11 & 2) != 0 ? f.b(false, 1, null) : mutex, i10);
    }
}
