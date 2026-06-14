package com.moloco.sdk.acm.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class MetricsDb_Impl extends MetricsDb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f53956c;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `eventType` TEXT NOT NULL, `data` INTEGER, `tags` TEXT NOT NULL)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1f78eccdc6d7153084e9120766fe56b')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `events`");
            if (((RoomDatabase) MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.get(i10)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.get(i10)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) MetricsDb_Impl.this).mDatabase = supportSQLiteDatabase;
            MetricsDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) MetricsDb_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) MetricsDb_Impl.this).mCallbacks.get(i10)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(6);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("name", new TableInfo.Column("name", AdPreferences.TYPE_TEXT, true, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put("eventType", new TableInfo.Column("eventType", AdPreferences.TYPE_TEXT, true, 0, null, 1));
            map.put("data", new TableInfo.Column("data", "INTEGER", false, 0, null, 1));
            map.put("tags", new TableInfo.Column("tags", AdPreferences.TYPE_TEXT, true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("events", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "events");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "events(com.moloco.sdk.acm.db.EventEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `events`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(1), "b1f78eccdc6d7153084e9120766fe56b", "82d5e07fb1fc98c9c5bfa339c0f04693")).build());
    }

    @Override // com.moloco.sdk.acm.db.MetricsDb
    public d g() {
        d dVar;
        if (this.f53956c != null) {
            return this.f53956c;
        }
        synchronized (this) {
            try {
                if (this.f53956c == null) {
                    this.f53956c = new f(this);
                }
                dVar = this.f53956c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(d.class, f.f());
        return map;
    }
}
