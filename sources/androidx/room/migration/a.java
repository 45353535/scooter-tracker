package androidx.room.migration;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static void a(AutoMigrationSpec autoMigrationSpec, SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection instanceof SupportSQLiteConnection) {
            autoMigrationSpec.onPostMigrate(((SupportSQLiteConnection) connection).getDb());
        }
    }

    public static void b(AutoMigrationSpec autoMigrationSpec, SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
    }
}
