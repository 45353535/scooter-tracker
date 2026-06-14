package androidx.room;

import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.coroutines.PassthroughConnectionPool;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.driver.SupportSQLiteConnection;
import androidx.sqlite.driver.SupportSQLiteDriver;
import com.ironsource.V5;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u000256BW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012<\u0010\u0006\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007j\u0006\u0012\u0002\b\u0003`\u000b¢\u0006\u0004\b\f\u0010\rBc\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\b\u0012<\u0010\u0006\u001a8\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007j\u0006\u0012\u0002\b\u0003`\u000b¢\u0006\u0004\b\f\u0010\u0010J\b\u0010$\u001a\u00020%H\u0002J@\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u00020)2\"\u0010*\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0096@¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0010¢\u0006\u0002\b0J\u0006\u00101\u001a\u00020%J\u0006\u00102\u001a\u00020)J \u00103\u001a\u00020\u0003*\u00020\u00032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020%0\bH\u0002R\u0014\u0010\u0011\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Landroidx/room/RoomConnectionManager;", "Landroidx/room/BaseRoomConnectionManager;", "config", "Landroidx/room/DatabaseConfiguration;", "openDelegate", "Landroidx/room/RoomOpenDelegate;", "transactionWrapper", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Landroidx/room/coroutines/TransactionWrapper;", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenDelegate;Lkotlin/jvm/functions/Function2;)V", "supportOpenHelperFactory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "(Landroidx/room/DatabaseConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "configuration", "getConfiguration", "()Landroidx/room/DatabaseConfiguration;", "getOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "callbacks", "", "Landroidx/room/RoomDatabase$Callback;", "getCallbacks", "()Ljava/util/List;", "connectionPool", "Landroidx/room/coroutines/ConnectionPool;", "getConnectionPool$room_runtime", "()Landroidx/room/coroutines/ConnectionPool;", "supportOpenHelper", "getSupportOpenHelper$room_runtime", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "supportDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "init", "", "useConnection", "R", "isReadOnly", "", "block", "Landroidx/room/Transactor;", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveFileName", "", V5.c.f41892b, "resolveFileName$room_runtime", "close", "isSupportDatabaseOpen", "installOnOpenCallback", "onOpen", "SupportOpenHelperCallback", "NoOpOpenDelegate", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomConnectionManager extends BaseRoomConnectionManager {

    @NotNull
    private final List<RoomDatabase.Callback> callbacks;

    @NotNull
    private final DatabaseConfiguration configuration;

    @NotNull
    private final ConnectionPool connectionPool;

    @NotNull
    private final RoomOpenDelegate openDelegate;

    @Nullable
    private SupportSQLiteDatabase supportDatabase;

    @Nullable
    private final SupportSQLiteOpenHelper supportOpenHelper;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/room/RoomConnectionManager$NoOpOpenDelegate;", "Landroidx/room/RoomOpenDelegate;", "<init>", "()V", "onCreate", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "onPreMigrate", "onValidateSchema", "Landroidx/room/RoomOpenDelegate$ValidationResult;", "onPostMigrate", "onOpen", "createAllTables", "dropAllTables", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        @NotNull
        public RoomOpenDelegate.ValidationResult onValidateSchema(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Landroidx/room/RoomConnectionManager$SupportOpenHelperCallback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "version", "", "<init>", "(Landroidx/room/RoomConnectionManager;I)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "onDowngrade", "onOpen", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i10) {
            super(i10);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            RoomConnectionManager.this.onCreate(new SupportSQLiteConnection(db2));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onDowngrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            onUpgrade(db2, oldVersion, newVersion);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onOpen(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            RoomConnectionManager.this.onOpen(new SupportSQLiteConnection(db2));
            RoomConnectionManager.this.supportDatabase = db2;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            RoomConnectionManager.this.onMigrate(new SupportSQLiteConnection(db2), oldVersion, newVersion);
        }
    }

    public RoomConnectionManager(@NotNull DatabaseConfiguration config, @NotNull RoomOpenDelegate openDelegate, @NotNull Function2<? super Function1<? super Continuation, ? extends Object>, ? super Continuation, ? extends Object> transactionWrapper) {
        ConnectionPool connectionPoolNewSingleConnectionPool;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(openDelegate, "openDelegate");
        Intrinsics.checkNotNullParameter(transactionWrapper, "transactionWrapper");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt.emptyList() : list;
        SQLiteDriver sQLiteDriver = config.sqliteDriver;
        if (sQLiteDriver != null) {
            this.supportOpenHelper = null;
            if (sQLiteDriver.hasConnectionPool()) {
                BaseRoomConnectionManager.DriverWrapper driverWrapper = new BaseRoomConnectionManager.DriverWrapper(this, config.sqliteDriver);
                String str = config.name;
                connectionPoolNewSingleConnectionPool = new PassthroughConnectionPool(driverWrapper, str != null ? str : ":memory:", transactionWrapper);
            } else {
                connectionPoolNewSingleConnectionPool = config.name == null ? ConnectionPoolKt.newSingleConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, config.sqliteDriver), ":memory:", config.getPreparedStatementCacheSize()) : ConnectionPoolKt.newConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, config.sqliteDriver), config.name, getMaxNumberOfReaders(config.journalMode), getMaxNumberOfWriters(config.journalMode), config.getPreparedStatementCacheSize());
            }
            this.connectionPool = connectionPoolNewSingleConnectionPool;
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(config.context).name(config.name).callback(new SupportOpenHelperCallback(openDelegate.getVersion())).build());
            this.supportOpenHelper = supportSQLiteOpenHelperCreate;
            SupportSQLiteDriver supportSQLiteDriver = new SupportSQLiteDriver(supportSQLiteOpenHelperCreate);
            String str2 = config.name;
            this.connectionPool = new PassthroughConnectionPool(supportSQLiteDriver, str2 != null ? str2 : ":memory:", transactionWrapper);
        }
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(RoomConnectionManager roomConnectionManager, SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        roomConnectionManager.supportDatabase = db2;
        return Unit.f93236a;
    }

    private final void init() {
        boolean z10 = getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.supportOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
        }
    }

    private final DatabaseConfiguration installOnOpenCallback(DatabaseConfiguration databaseConfiguration, final Function1<? super SupportSQLiteDatabase, Unit> function1) {
        List<RoomDatabase.Callback> listEmptyList = databaseConfiguration.callbacks;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return DatabaseConfiguration.copy$default(databaseConfiguration, null, null, null, null, CollectionsKt.plus((Collection<? extends RoomDatabase.Callback>) listEmptyList, new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public void onOpen(SupportSQLiteDatabase db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                function1.invoke(db2);
            }
        }), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final void close() {
        this.connectionPool.close();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.supportOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
        }
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    protected List<RoomDatabase.Callback> getCallbacks() {
        return this.callbacks;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    protected DatabaseConfiguration getConfiguration() {
        return this.configuration;
    }

    @NotNull
    /* JADX INFO: renamed from: getConnectionPool$room_runtime, reason: from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    protected RoomOpenDelegate getOpenDelegate() {
        return this.openDelegate;
    }

    @Nullable
    /* JADX INFO: renamed from: getSupportOpenHelper$room_runtime, reason: from getter */
    public final SupportSQLiteOpenHelper getSupportOpenHelper() {
        return this.supportOpenHelper;
    }

    public final boolean isSupportDatabaseOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    public String resolveFileName$room_runtime(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (Intrinsics.areEqual(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @Nullable
    public <R> Object useConnection(boolean z10, @NotNull Function2<? super Transactor, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return this.connectionPool.useConnection(z10, function2, continuation);
    }

    public RoomConnectionManager(@NotNull DatabaseConfiguration config, @NotNull Function1<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper> supportOpenHelperFactory, @NotNull Function2<? super Function1<? super Continuation, ? extends Object>, ? super Continuation, ? extends Object> transactionWrapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
        Intrinsics.checkNotNullParameter(transactionWrapper, "transactionWrapper");
        this.configuration = config;
        this.openDelegate = new NoOpOpenDelegate();
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt.emptyList() : list;
        SupportSQLiteOpenHelper supportSQLiteOpenHelperInvoke = supportOpenHelperFactory.invoke(installOnOpenCallback(config, new Function1() { // from class: androidx.room.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomConnectionManager._init_$lambda$1(this.f5406b, (SupportSQLiteDatabase) obj);
            }
        }));
        this.supportOpenHelper = supportSQLiteOpenHelperInvoke;
        SupportSQLiteDriver supportSQLiteDriver = new SupportSQLiteDriver(supportSQLiteOpenHelperInvoke);
        String str = config.name;
        this.connectionPool = new PassthroughConnectionPool(supportSQLiteDriver, str == null ? ":memory:" : str, transactionWrapper);
        init();
    }
}
