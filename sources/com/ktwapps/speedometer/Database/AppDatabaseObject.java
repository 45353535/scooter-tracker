package com.ktwapps.speedometer.Database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
@Database(entities = {v4.b.class, v4.a.class}, exportSchema = false, version = 4)
public abstract class AppDatabaseObject extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AppDatabaseObject f45994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Migration f45995b = new a(1, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Migration f45996c = new b(2, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Migration f45997d = new c(3, 4);

    class a extends Migration {
        a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE route (id INTEGER PRIMARY KEY NOT NULL,tracking_id INTEGER NOT NULL,type INTEGER NOT NULL,timestamp INTEGER NOT NULL,longitude REAL NOT NULL,latitude REAL NOT NULL)");
        }
    }

    class b extends Migration {
        b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE route ADD COLUMN line INTEGER DEFAULT 0 NOT NULL");
        }
    }

    class c extends Migration {
        c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE route ADD COLUMN speed REAL NOT NULL DEFAULT -1");
        }
    }

    private static AppDatabaseObject e(Context context) {
        return (AppDatabaseObject) Room.databaseBuilder(context, AppDatabaseObject.class, "speedometer-database").addMigrations(f45995b, f45996c, f45997d).build();
    }

    public static synchronized AppDatabaseObject f(Context context) {
        try {
            if (f45994a == null) {
                f45994a = e(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f45994a;
    }

    public abstract u4.a g();
}
