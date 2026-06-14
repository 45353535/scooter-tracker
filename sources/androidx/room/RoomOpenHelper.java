package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.driver.SupportSQLiteConnection;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0017\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001d\u001e\u001fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "configuration", "Landroidx/room/DatabaseConfiguration;", "delegate", "Landroidx/room/RoomOpenHelper$Delegate;", "identityHash", "", "legacyHash", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;)V", "callbacks", "", "Landroidx/room/RoomDatabase$Callback;", "onConfigure", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onCreate", "onUpgrade", "oldVersion", "", "newVersion", "onDowngrade", "onOpen", "checkIdentity", "updateIdentity", "createMasterTableIfNotExists", "Delegate", "ValidationResult", com.taurusx.tax.f.y.f66058y, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<RoomDatabase.Callback> callbacks;

    @Nullable
    private DatabaseConfiguration configuration;

    @NotNull
    private final Delegate delegate;

    @NotNull
    private final String identityHash;

    @NotNull
    private final String legacyHash;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "<init>", "()V", "hasRoomMasterTable", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "hasRoomMasterTable$room_runtime", "hasEmptySchema", "hasEmptySchema$room_runtime", "dropAllTables", "", "dropAllTables$room_runtime", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void dropAllTables$room_runtime(@NotNull SupportSQLiteDatabase db2) throws IOException {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Cursor cursor = cursorQuery;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    Intrinsics.checkNotNull(string);
                    if (!StringsKt.a0(string, "sqlite_", false, 2, null) && !Intrinsics.areEqual(string, "android_metadata")) {
                        listCreateListBuilder.add(TuplesKt.to(string, Boolean.valueOf(Intrinsics.areEqual(cursor.getString(1), MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW))));
                    }
                }
                List<Pair> listBuild = CollectionsKt.build(listCreateListBuilder);
                uf.c.a(cursorQuery, null);
                for (Pair pair : listBuild) {
                    String str = (String) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        db2.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        db2.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime(@NotNull SupportSQLiteDatabase db2) throws IOException {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = cursorQuery;
                boolean z10 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                uf.c.a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime(@NotNull SupportSQLiteDatabase db2) throws IOException {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = cursorQuery;
                boolean z10 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                uf.c.a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0015J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "version", "", "<init>", "(I)V", "dropAllTables", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "createAllTables", "onOpen", "onCreate", "validateMigration", "onValidateSchema", "Landroidx/room/RoomOpenHelper$ValidationResult;", "onPreMigrate", "onPostMigrate", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class Delegate {
        public final int version;

        public Delegate(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(@NotNull SupportSQLiteDatabase db2);

        public abstract void dropAllTables(@NotNull SupportSQLiteDatabase db2);

        public abstract void onCreate(@NotNull SupportSQLiteDatabase db2);

        public abstract void onOpen(@NotNull SupportSQLiteDatabase db2);

        public void onPostMigrate(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onPreMigrate(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        @NotNull
        public ValidationResult onValidateSchema(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            validateMigration(db2);
            return new ValidationResult(true, null);
        }

        protected void validateMigration(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", "isValid", "", "expectedFoundMsg", "", "<init>", "(ZLjava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class ValidationResult {

        @Nullable
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z10, @Nullable String str) {
            this.isValid = z10;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@NotNull DatabaseConfiguration configuration, @NotNull Delegate delegate, @NotNull String identityHash, @NotNull String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.callbacks = configuration.callbacks;
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void checkIdentity(SupportSQLiteDatabase db2) throws IOException {
        if (!INSTANCE.hasRoomMasterTable$room_runtime(db2)) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (validationResultOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                updateIdentity(db2);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        Cursor cursorQuery = db2.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
        try {
            Cursor cursor = cursorQuery;
            String string = cursor.moveToFirst() ? cursor.getString(0) : null;
            uf.c.a(cursorQuery, null);
            if (Intrinsics.areEqual(this.identityHash, string) || Intrinsics.areEqual(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                uf.c.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase db2) {
        db2.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    private final void updateIdentity(SupportSQLiteDatabase db2) {
        createMasterTableIfNotExists(db2);
        db2.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.onConfigure(db2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(@NotNull SupportSQLiteDatabase db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean zHasEmptySchema$room_runtime = INSTANCE.hasEmptySchema$room_runtime(db2);
        this.delegate.createAllTables(db2);
        if (!zHasEmptySchema$room_runtime) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(db2);
        this.delegate.onCreate(db2);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onCreate(db2);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        onUpgrade(db2, oldVersion, newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(@NotNull SupportSQLiteDatabase db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.onOpen(db2);
        checkIdentity(db2);
        this.delegate.onOpen(db2);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onOpen(db2);
            }
        }
        this.configuration = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) throws IOException {
        List<Migration> listFindMigrationPath;
        Intrinsics.checkNotNullParameter(db2, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(oldVersion, newVersion)) != null) {
            this.delegate.onPreMigrate(db2);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(new SupportSQLiteConnection(db2));
            }
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db2);
            if (validationResultOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                updateIdentity(db2);
                return;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 == null || databaseConfiguration2.isMigrationRequired(oldVersion, newVersion)) {
            throw new IllegalStateException("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (databaseConfiguration2.allowDestructiveMigrationForAllTables) {
            INSTANCE.dropAllTables$room_runtime(db2);
        } else {
            this.delegate.dropAllTables(db2);
        }
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.Callback) it2.next()).onDestructiveMigration(db2);
            }
        }
        this.delegate.createAllTables(db2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@NotNull DatabaseConfiguration configuration, @NotNull Delegate delegate, @NotNull String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
    }
}
