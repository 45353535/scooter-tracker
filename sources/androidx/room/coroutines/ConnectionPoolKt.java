package androidx.room.coroutines;

import androidx.sqlite.SQLiteDriver;
import com.ironsource.V5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a2\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u000b"}, d2 = {"newSingleConnectionPool", "Landroidx/room/coroutines/ConnectionPool;", "driver", "Landroidx/sqlite/SQLiteDriver;", V5.c.f41892b, "", "preparedStatementCacheSize", "", "newConnectionPool", "maxNumOfReaders", "maxNumOfWriters", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConnectionPoolKt {
    @NotNull
    public static final ConnectionPool newConnectionPool(@NotNull SQLiteDriver driver, @NotNull String fileName, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName, i10, i11, i12);
    }

    public static /* synthetic */ ConnectionPool newConnectionPool$default(SQLiteDriver sQLiteDriver, String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            i12 = 25;
        }
        return newConnectionPool(sQLiteDriver, str, i10, i11, i12);
    }

    @NotNull
    public static final ConnectionPool newSingleConnectionPool(@NotNull SQLiteDriver driver, @NotNull String fileName, int i10) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName, i10);
    }

    public static /* synthetic */ ConnectionPool newSingleConnectionPool$default(SQLiteDriver sQLiteDriver, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 25;
        }
        return newSingleConnectionPool(sQLiteDriver, str, i10);
    }
}
