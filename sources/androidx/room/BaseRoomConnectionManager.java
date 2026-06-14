package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.concurrent.ExclusiveLock;
import androidx.room.migration.Migration;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.SQLiteStatement;
import com.ironsource.V5;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 ;2\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u00122\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H¦@¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0010¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0004J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J \u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0004J\u0010\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00101\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0004J\u0010\u00102\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00103\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002J\f\u00104\u001a\u00020.*\u000205H\u0004J\f\u00106\u001a\u00020.*\u000205H\u0004J\u0010\u00107\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00109\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u0012\u0010\u0004\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Landroidx/room/BaseRoomConnectionManager;", "", "<init>", "()V", "configuration", "Landroidx/room/DatabaseConfiguration;", "getConfiguration", "()Landroidx/room/DatabaseConfiguration;", "openDelegate", "Landroidx/room/RoomOpenDelegate;", "getOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "callbacks", "", "Landroidx/room/RoomDatabase$Callback;", "getCallbacks", "()Ljava/util/List;", "isConfigured", "", "isInitializing", "useConnection", "R", "isReadOnly", "block", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveFileName", "", V5.c.f41892b, "resolveFileName$room_runtime", "configureDatabase", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "configurationConnection", "configureJournalMode", "configureSynchronousFlag", "configureBusyTimeout", "onCreate", "hasEmptySchema", "updateIdentity", "createMasterTableIfNotExists", "onMigrate", "oldVersion", "", "newVersion", "dropAllTables", "onOpen", "checkIdentity", "hasRoomMasterTable", "getMaxNumberOfReaders", "Landroidx/room/RoomDatabase$JournalMode;", "getMaxNumberOfWriters", "invokeCreateCallback", "invokeDestructiveMigrationCallback", "invokeOpenCallback", "DriverWrapper", com.taurusx.tax.f.y.f66058y, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class BaseRoomConnectionManager {
    public static final int BUSY_TIMEOUT_MS = 3000;
    private boolean isConfigured;
    private boolean isInitializing;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/room/BaseRoomConnectionManager$DriverWrapper;", "Landroidx/sqlite/SQLiteDriver;", "actual", "<init>", "(Landroidx/room/BaseRoomConnectionManager;Landroidx/sqlite/SQLiteDriver;)V", "open", "Landroidx/sqlite/SQLiteConnection;", V5.c.f41892b, "", "openLocked", "filename", "hasConnectionPool", "", "()Z", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected final class DriverWrapper implements SQLiteDriver {

        @NotNull
        private final SQLiteDriver actual;
        final /* synthetic */ BaseRoomConnectionManager this$0;

        public DriverWrapper(@NotNull BaseRoomConnectionManager baseRoomConnectionManager, SQLiteDriver actual) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            this.this$0 = baseRoomConnectionManager;
            this.actual = actual;
        }

        private final SQLiteConnection openLocked(final String filename) {
            ExclusiveLock exclusiveLock = new ExclusiveLock(filename, (this.this$0.isConfigured || this.this$0.isInitializing || Intrinsics.areEqual(filename, ":memory:")) ? false : true);
            final BaseRoomConnectionManager baseRoomConnectionManager = this.this$0;
            return (SQLiteConnection) exclusiveLock.withLock(new Function0() { // from class: androidx.room.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseRoomConnectionManager.DriverWrapper.openLocked$lambda$1(baseRoomConnectionManager, this, filename);
                }
            }, new Function1() { // from class: androidx.room.BaseRoomConnectionManager$DriverWrapper$openLocked$2
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    throw new IllegalStateException("Unable to open database '" + filename + "'. Was a proper path / name used in Room's database builder?", error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SQLiteConnection openLocked$lambda$1(BaseRoomConnectionManager baseRoomConnectionManager, DriverWrapper driverWrapper, String str) throws Exception {
            if (baseRoomConnectionManager.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            SQLiteConnection sQLiteConnectionOpen = driverWrapper.actual.open(str);
            if (baseRoomConnectionManager.isConfigured) {
                baseRoomConnectionManager.configurationConnection(sQLiteConnectionOpen);
                return sQLiteConnectionOpen;
            }
            try {
                baseRoomConnectionManager.isInitializing = true;
                baseRoomConnectionManager.configureDatabase(sQLiteConnectionOpen);
                return sQLiteConnectionOpen;
            } finally {
                baseRoomConnectionManager.isInitializing = false;
            }
        }

        @Override // androidx.sqlite.SQLiteDriver
        public boolean hasConnectionPool() {
            return this.actual.hasConnectionPool();
        }

        @Override // androidx.sqlite.SQLiteDriver
        @NotNull
        public SQLiteConnection open(@NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return openLocked(this.this$0.resolveFileName$room_runtime(fileName));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomDatabase.JournalMode.values().length];
            try {
                iArr[RoomDatabase.JournalMode.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void checkIdentity(SQLiteConnection connection) throws Exception {
        Object objB;
        RoomOpenDelegate.ValidationResult validationResultOnValidateSchema;
        if (hasRoomMasterTable(connection)) {
            SQLiteStatement sQLiteStatementPrepare = connection.prepare(RoomMasterTable.READ_QUERY);
            try {
                String text = sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getText(0) : null;
                wf.a.a(sQLiteStatementPrepare, null);
                if (Intrinsics.areEqual(getOpenDelegate().getIdentityHash(), text) || Intrinsics.areEqual(getOpenDelegate().getLegacyIdentityHash(), text)) {
                    return;
                }
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + text).toString());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    wf.a.a(sQLiteStatementPrepare, th2);
                    throw th3;
                }
            }
        }
        SQLite.execSQL(connection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            Result.Companion companion = Result.f93230c;
            validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(connection);
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th4));
        }
        if (!validationResultOnValidateSchema.isValid) {
            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg).toString());
        }
        getOpenDelegate().onPostMigrate(connection);
        updateIdentity(connection);
        objB = Result.b(Unit.f93236a);
        if (Result.j(objB)) {
            SQLite.execSQL(connection, "END TRANSACTION");
        }
        Throwable thG = Result.g(objB);
        if (thG == null) {
            Result.a(objB);
        } else {
            SQLite.execSQL(connection, "ROLLBACK TRANSACTION");
            throw thG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurationConnection(SQLiteConnection connection) throws Exception {
        configureBusyTimeout(connection);
        configureSynchronousFlag(connection);
        getOpenDelegate().onOpen(connection);
    }

    private final void configureBusyTimeout(SQLiteConnection connection) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("PRAGMA busy_timeout");
        try {
            sQLiteStatementPrepare.step();
            long j10 = sQLiteStatementPrepare.getLong(0);
            wf.a.a(sQLiteStatementPrepare, null);
            if (j10 < 3000) {
                SQLite.execSQL(connection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                wf.a.a(sQLiteStatementPrepare, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureDatabase(SQLiteConnection connection) throws Exception {
        Object objB;
        configureBusyTimeout(connection);
        configureJournalMode(connection);
        configureSynchronousFlag(connection);
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("PRAGMA user_version");
        try {
            sQLiteStatementPrepare.step();
            int i10 = (int) sQLiteStatementPrepare.getLong(0);
            wf.a.a(sQLiteStatementPrepare, null);
            if (i10 != getOpenDelegate().getVersion()) {
                SQLite.execSQL(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    Result.Companion companion = Result.f93230c;
                    if (i10 == 0) {
                        onCreate(connection);
                    } else {
                        onMigrate(connection, i10, getOpenDelegate().getVersion());
                    }
                    SQLite.execSQL(connection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objB = Result.b(Unit.f93236a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(kotlin.d.a(th2));
                }
                if (Result.j(objB)) {
                    SQLite.execSQL(connection, "END TRANSACTION");
                }
                Throwable thG = Result.g(objB);
                if (thG != null) {
                    SQLite.execSQL(connection, "ROLLBACK TRANSACTION");
                    throw thG;
                }
            }
            onOpen(connection);
        } finally {
        }
    }

    private final void configureJournalMode(SQLiteConnection connection) throws Exception {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(connection, "PRAGMA journal_mode = WAL");
        } else {
            SQLite.execSQL(connection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void configureSynchronousFlag(SQLiteConnection connection) throws Exception {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(connection, "PRAGMA synchronous = NORMAL");
        } else {
            SQLite.execSQL(connection, "PRAGMA synchronous = FULL");
        }
    }

    private final void createMasterTableIfNotExists(SQLiteConnection connection) throws Exception {
        SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
    }

    private final void dropAllTables(SQLiteConnection connection) throws Exception {
        if (!getConfiguration().allowDestructiveMigrationForAllTables) {
            getOpenDelegate().dropAllTables(connection);
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(0);
                if (!StringsKt.a0(text, "sqlite_", false, 2, null) && !Intrinsics.areEqual(text, "android_metadata")) {
                    listCreateListBuilder.add(TuplesKt.to(text, Boolean.valueOf(Intrinsics.areEqual(sQLiteStatementPrepare.getText(1), MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW))));
                }
            }
            List<Pair> listBuild = CollectionsKt.build(listCreateListBuilder);
            wf.a.a(sQLiteStatementPrepare, null);
            for (Pair pair : listBuild) {
                String str = (String) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    SQLite.execSQL(connection, "DROP VIEW IF EXISTS `" + str + '`');
                } else {
                    SQLite.execSQL(connection, "DROP TABLE IF EXISTS `" + str + '`');
                }
            }
        } finally {
        }
    }

    private final boolean hasEmptySchema(SQLiteConnection connection) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.getLong(0) == 0) {
                    z10 = true;
                }
            }
            wf.a.a(sQLiteStatementPrepare, null);
            return z10;
        } finally {
        }
    }

    private final boolean hasRoomMasterTable(SQLiteConnection connection) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z10 = false;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.getLong(0) != 0) {
                    z10 = true;
                }
            }
            wf.a.a(sQLiteStatementPrepare, null);
            return z10;
        } finally {
        }
    }

    private final void invokeCreateCallback(SQLiteConnection connection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onCreate(connection);
        }
    }

    private final void invokeDestructiveMigrationCallback(SQLiteConnection connection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onDestructiveMigration(connection);
        }
    }

    private final void invokeOpenCallback(SQLiteConnection connection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onOpen(connection);
        }
    }

    private final void updateIdentity(SQLiteConnection connection) throws Exception {
        createMasterTableIfNotExists(connection);
        SQLite.execSQL(connection, RoomMasterTable.createInsertQuery(getOpenDelegate().getIdentityHash()));
    }

    @NotNull
    protected abstract List<RoomDatabase.Callback> getCallbacks();

    @NotNull
    protected abstract DatabaseConfiguration getConfiguration();

    protected final int getMaxNumberOfReaders(@NotNull RoomDatabase.JournalMode journalMode) {
        Intrinsics.checkNotNullParameter(journalMode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + journalMode + '\'').toString());
    }

    protected final int getMaxNumberOfWriters(@NotNull RoomDatabase.JournalMode journalMode) {
        Intrinsics.checkNotNullParameter(journalMode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + journalMode + '\'').toString());
    }

    @NotNull
    protected abstract RoomOpenDelegate getOpenDelegate();

    protected final void onCreate(@NotNull SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        boolean zHasEmptySchema = hasEmptySchema(connection);
        getOpenDelegate().createAllTables(connection);
        if (!zHasEmptySchema) {
            RoomOpenDelegate.ValidationResult validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(connection);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg).toString());
            }
        }
        updateIdentity(connection);
        getOpenDelegate().onCreate(connection);
        invokeCreateCallback(connection);
    }

    protected final void onMigrate(@NotNull SQLiteConnection connection, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List<Migration> listFindMigrationPath = MigrationUtil.findMigrationPath(getConfiguration().migrationContainer, oldVersion, newVersion);
        if (listFindMigrationPath == null) {
            if (!MigrationUtil.isMigrationRequired(getConfiguration(), oldVersion, newVersion)) {
                dropAllTables(connection);
                invokeDestructiveMigrationCallback(connection);
                getOpenDelegate().createAllTables(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().onPreMigrate(connection);
        Iterator<T> it = listFindMigrationPath.iterator();
        while (it.hasNext()) {
            ((Migration) it.next()).migrate(connection);
        }
        RoomOpenDelegate.ValidationResult validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(connection);
        if (validationResultOnValidateSchema.isValid) {
            getOpenDelegate().onPostMigrate(connection);
            updateIdentity(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg).toString());
        }
    }

    protected final void onOpen(@NotNull SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        checkIdentity(connection);
        getOpenDelegate().onOpen(connection);
        invokeOpenCallback(connection);
        this.isConfigured = true;
    }

    @NotNull
    public String resolveFileName$room_runtime(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return fileName;
    }

    @Nullable
    public abstract <R> Object useConnection(boolean z10, @NotNull Function2<? super Transactor, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation);
}
