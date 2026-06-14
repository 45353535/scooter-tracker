package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wf.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"getLastInsertedRowId", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "getTotalChangedRows", "", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SQLiteConnectionUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long getLastInsertedRowId(@NotNull SQLiteConnection connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (getTotalChangedRows(connection) == 0) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT last_insert_rowid()");
        try {
            sQLiteStatementPrepare.step();
            long j10 = sQLiteStatementPrepare.getLong(0);
            a.a(sQLiteStatementPrepare, null);
            return j10;
        } finally {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getTotalChangedRows(@NotNull SQLiteConnection connection) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT changes()");
        try {
            sQLiteStatementPrepare.step();
            int i10 = (int) sQLiteStatementPrepare.getLong(0);
            a.a(sQLiteStatementPrepare, null);
            return i10;
        } finally {
        }
    }
}
