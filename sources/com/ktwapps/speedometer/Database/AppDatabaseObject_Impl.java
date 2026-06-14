package com.ktwapps.speedometer.Database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u4.l;

/* JADX INFO: loaded from: classes10.dex */
public final class AppDatabaseObject_Impl extends AppDatabaseObject {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile u4.a f45998e;

    class a extends RoomOpenDelegate {
        a(int i10, String str, String str2) {
            super(i10, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) throws Exception {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `tracking` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `duration` INTEGER NOT NULL, `distance` REAL NOT NULL, `maximum` REAL NOT NULL, `average` REAL NOT NULL, `speeding` INTEGER NOT NULL, `start_address` TEXT, `end_address` TEXT, `start_date` INTEGER NOT NULL, `end_date` INTEGER NOT NULL, `title` TEXT)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `route` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tracking_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `line` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `longitude` REAL NOT NULL, `latitude` REAL NOT NULL, `speed` REAL NOT NULL)");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bb24131aacb82ea693a03c5c40329c49')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) throws Exception {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `tracking`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `route`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            AppDatabaseObject_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(SQLiteConnection sQLiteConnection) {
            DBUtil.dropFtsSyncTriggers(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
            HashMap map = new HashMap(11);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map.put("distance", new TableInfo.Column("distance", "REAL", true, 0, null, 1));
            map.put("maximum", new TableInfo.Column("maximum", "REAL", true, 0, null, 1));
            map.put("average", new TableInfo.Column("average", "REAL", true, 0, null, 1));
            map.put("speeding", new TableInfo.Column("speeding", "INTEGER", true, 0, null, 1));
            map.put("start_address", new TableInfo.Column("start_address", AdPreferences.TYPE_TEXT, false, 0, null, 1));
            map.put("end_address", new TableInfo.Column("end_address", AdPreferences.TYPE_TEXT, false, 0, null, 1));
            map.put("start_date", new TableInfo.Column("start_date", "INTEGER", true, 0, null, 1));
            map.put("end_date", new TableInfo.Column("end_date", "INTEGER", true, 0, null, 1));
            map.put("title", new TableInfo.Column("title", AdPreferences.TYPE_TEXT, false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("tracking", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "tracking");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "tracking(com.ktwapps.speedometer.Database.Entity.Tracking).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(8);
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map2.put("tracking_id", new TableInfo.Column("tracking_id", "INTEGER", true, 0, null, 1));
            map2.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map2.put("line", new TableInfo.Column("line", "INTEGER", true, 0, null, 1));
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map2.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, 1));
            map2.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, 1));
            map2.put("speed", new TableInfo.Column("speed", "REAL", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("route", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "route");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "route(com.ktwapps.speedometer.Database.Entity.Route).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "tracking", "route");
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "tracking", "route");
    }

    @Override // com.ktwapps.speedometer.Database.AppDatabaseObject
    public u4.a g() {
        u4.a aVar;
        if (this.f45998e != null) {
            return this.f45998e;
        }
        synchronized (this) {
            try {
                if (this.f45998e == null) {
                    this.f45998e = new l(this);
                }
                aVar = this.f45998e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(u4.a.class, l.u());
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new a(4, "bb24131aacb82ea693a03c5c40329c49", "61f1192e4c53fcf2548408add6a29f8d");
    }
}
