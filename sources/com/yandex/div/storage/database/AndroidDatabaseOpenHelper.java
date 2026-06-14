package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.VisibleForTesting;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001:\u0003 !\"B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0011H\u0012J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0011H\u0017R\u000e\u0010\r\u001a\u00020\u000eX\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006#"}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "name", "", "version", "", "ccb", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$CreateCallback;", "ucb", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$UpgradeCallback;", "(Landroid/content/Context;Ljava/lang/String;ILcom/yandex/div/storage/database/DatabaseOpenHelper$CreateCallback;Lcom/yandex/div/storage/database/DatabaseOpenHelper$UpgradeCallback;)V", "databaseManager", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$DatabaseManager;", "mOpenCloseInfoMap", "", "Landroid/database/sqlite/SQLiteDatabase;", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$OpenCloseInfo;", "mOpenCloseLock", "", "mSQLiteOpenHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "readableDatabase", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "getReadableDatabase", "()Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "writableDatabase", "getWritableDatabase", "getOpenCloseInfo", "sqLiteDatabase", "wrapDataBase", "AndroidSQLiteDatabase", "DatabaseManager", "OpenCloseInfo", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {

    @NotNull
    private final DatabaseManager databaseManager;

    @NotNull
    private final SQLiteOpenHelper mSQLiteOpenHelper;

    @NotNull
    private final Object mOpenCloseLock = new Object();

    @NotNull
    private final Map<SQLiteDatabase, OpenCloseInfo> mOpenCloseInfoMap = new HashMap();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$AndroidSQLiteDatabase;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "Landroid/database/sqlite/SQLiteDatabase;", "mDb", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$OpenCloseInfo;", "mOpenCloseInfo", "<init>", "(Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper;Landroid/database/sqlite/SQLiteDatabase;Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$OpenCloseInfo;)V", "", "sql", "", "execSQL", "(Ljava/lang/String;)V", "query", "", "selectionArgs", "Landroid/database/Cursor;", "rawQuery", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "beginTransaction", "()V", "setTransactionSuccessful", "endTransaction", "Landroid/database/sqlite/SQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;", "close", "Landroid/database/sqlite/SQLiteDatabase;", "Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$OpenCloseInfo;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class AndroidSQLiteDatabase implements DatabaseOpenHelper.Database, AutoCloseable {

        @NotNull
        private final SQLiteDatabase mDb;

        @NotNull
        private final OpenCloseInfo mOpenCloseInfo;

        public AndroidSQLiteDatabase(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull OpenCloseInfo openCloseInfo) {
            this.mDb = sQLiteDatabase;
            this.mOpenCloseInfo = openCloseInfo;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void beginTransaction() {
            this.mDb.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AndroidDatabaseOpenHelper.this.databaseManager.closeDatabase(this.mDb);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public SQLiteStatement compileStatement(@NotNull String sql) {
            return this.mDb.compileStatement(sql);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void endTransaction() {
            this.mDb.endTransaction();
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void execSQL(@NotNull String sql) {
            this.mDb.execSQL(sql);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @NotNull
        public Cursor rawQuery(@NotNull String query, @Nullable String[] selectionArgs) {
            return this.mDb.rawQuery(query, selectionArgs);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void setTransactionSuccessful() {
            this.mDb.setTransactionSuccessful();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$DatabaseManager;", "", "databaseHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "(Landroid/database/sqlite/SQLiteOpenHelper;)V", "readableDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "readableUsers", "", "Ljava/lang/Thread;", "readableUsersCount", "", "writableDatabase", "writableUsers", "writableUsersCount", "closeDatabase", "", "mDb", "openReadableDatabase", "openWritableDatabase", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DatabaseManager {

        @NotNull
        private final SQLiteOpenHelper databaseHelper;

        @Nullable
        private SQLiteDatabase readableDatabase;
        private int readableUsersCount;

        @Nullable
        private SQLiteDatabase writableDatabase;
        private int writableUsersCount;

        @NotNull
        private final Set<Thread> readableUsers = new LinkedHashSet();

        @NotNull
        private final Set<Thread> writableUsers = new LinkedHashSet();

        public DatabaseManager(@NotNull SQLiteOpenHelper sQLiteOpenHelper) {
            this.databaseHelper = sQLiteOpenHelper;
        }

        public final synchronized void closeDatabase(@NotNull SQLiteDatabase mDb) {
            try {
                if (Intrinsics.areEqual(mDb, this.writableDatabase)) {
                    this.writableUsers.remove(Thread.currentThread());
                    if (this.writableUsers.isEmpty()) {
                        while (true) {
                            int i10 = this.writableUsersCount;
                            this.writableUsersCount = i10 - 1;
                            if (i10 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase = this.writableDatabase;
                            Intrinsics.checkNotNull(sQLiteDatabase);
                            sQLiteDatabase.close();
                        }
                    }
                } else if (Intrinsics.areEqual(mDb, this.readableDatabase)) {
                    this.readableUsers.remove(Thread.currentThread());
                    if (this.readableUsers.isEmpty()) {
                        while (true) {
                            int i11 = this.readableUsersCount;
                            this.readableUsersCount = i11 - 1;
                            if (i11 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase2 = this.readableDatabase;
                            Intrinsics.checkNotNull(sQLiteDatabase2);
                            sQLiteDatabase2.close();
                        }
                    }
                } else {
                    Assert.fail("Trying to close unknown database from DatabaseManager");
                    mDb.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @NotNull
        public final synchronized SQLiteDatabase openReadableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.readableDatabase = this.databaseHelper.getReadableDatabase();
            this.readableUsersCount++;
            this.readableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.readableDatabase;
            Intrinsics.checkNotNull(sQLiteDatabase);
            return sQLiteDatabase;
        }

        @NotNull
        public final synchronized SQLiteDatabase openWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            this.writableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.writableDatabase;
            Intrinsics.checkNotNull(sQLiteDatabase);
            return sQLiteDatabase;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/database/AndroidDatabaseOpenHelper$OpenCloseInfo;", "", "()V", "currentlyOpenedCount", "", "getCurrentlyOpenedCount", "()I", "setCurrentlyOpenedCount", "(I)V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class OpenCloseInfo {
        private int currentlyOpenedCount;

        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void setCurrentlyOpenedCount(int i10) {
            this.currentlyOpenedCount = i10;
        }
    }

    public AndroidDatabaseOpenHelper(@NotNull Context context, @NotNull String str, int i10, @NotNull final DatabaseOpenHelper.CreateCallback createCallback, @NotNull final DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, str, i10) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(@NotNull SQLiteDatabase db2) {
                db2.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
                createCallback.onCreate(this.wrapDataBase(sqLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
                upgradeCallback.onUpgrade(this.wrapDataBase(sqLiteDatabase), oldVersion, newVersion);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new DatabaseManager(sQLiteOpenHelper);
    }

    private OpenCloseInfo getOpenCloseInfo(SQLiteDatabase sqLiteDatabase) {
        OpenCloseInfo openCloseInfo;
        synchronized (this.mOpenCloseLock) {
            try {
                openCloseInfo = this.mOpenCloseInfoMap.get(sqLiteDatabase);
                if (openCloseInfo == null) {
                    openCloseInfo = new OpenCloseInfo();
                    this.mOpenCloseInfoMap.put(sqLiteDatabase, openCloseInfo);
                }
                openCloseInfo.setCurrentlyOpenedCount(openCloseInfo.getCurrentlyOpenedCount() + 1);
                openCloseInfo.getCurrentlyOpenedCount();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return openCloseInfo;
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.Database getReadableDatabase() {
        return wrapDataBase(this.databaseManager.openReadableDatabase());
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.Database getWritableDatabase() {
        return wrapDataBase(this.databaseManager.openWritableDatabase());
    }

    @VisibleForTesting
    @NotNull
    public DatabaseOpenHelper.Database wrapDataBase(@NotNull SQLiteDatabase sqLiteDatabase) {
        return new AndroidSQLiteDatabase(sqLiteDatabase, getOpenCloseInfo(sqLiteDatabase));
    }
}
