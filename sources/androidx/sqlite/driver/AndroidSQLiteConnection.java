package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/sqlite/driver/AndroidSQLiteConnection;", "Landroidx/sqlite/SQLiteConnection;", "db", "Landroid/database/sqlite/SQLiteDatabase;", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "getDb", "()Landroid/database/sqlite/SQLiteDatabase;", "inTransaction", "", "prepare", "Landroidx/sqlite/SQLiteStatement;", "sql", "", "close", "", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class AndroidSQLiteConnection implements SQLiteConnection, AutoCloseable {

    @NotNull
    private final SQLiteDatabase db;

    public AndroidSQLiteConnection(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.db = db2;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.db.close();
    }

    @NotNull
    public final SQLiteDatabase getDb() {
        return this.db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public boolean inTransaction() {
        return this.db.inTransaction();
    }

    @Override // androidx.sqlite.SQLiteConnection
    @NotNull
    public SQLiteStatement prepare(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        if (this.db.isOpen()) {
            return SupportSQLiteStatement.INSTANCE.create(new FrameworkSQLiteDatabase(this.db), sql);
        }
        SQLite.throwSQLiteException(21, "connection is closed");
        throw new g();
    }
}
