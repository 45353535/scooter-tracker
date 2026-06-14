package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import com.taurusx.tax.f.y;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "name", "", "columns", "", "options", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "equals", "", "other", "hashCode", "", "toString", y.f66058y, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class FtsTableInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final Set<String> columns;

    @NotNull
    public final String name;

    @NotNull
    public final Set<String> options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Landroidx/room/util/FtsTableInfo$Companion;", "", "<init>", "()V", "read", "Landroidx/room/util/FtsTableInfo;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FtsTableInfo read(@NotNull SupportSQLiteDatabase database, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return read(new SupportSQLiteConnection(database), tableName);
        }

        private Companion() {
        }

        @NotNull
        public final FtsTableInfo read(@NotNull SQLiteConnection connection, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new FtsTableInfo(tableName, SchemaInfoUtilKt.readFtsColumns(connection, tableName), SchemaInfoUtilKt.readFtsOptions(connection, tableName));
        }
    }

    public FtsTableInfo(@NotNull String name, @NotNull Set<String> columns, @NotNull Set<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @NotNull
    public static final FtsTableInfo read(@NotNull SQLiteConnection sQLiteConnection, @NotNull String str) {
        return INSTANCE.read(sQLiteConnection, str);
    }

    public boolean equals(@Nullable Object other) {
        return FtsTableInfoKt.equalsCommon(this, other);
    }

    public int hashCode() {
        return FtsTableInfoKt.hashCodeCommon(this);
    }

    @NotNull
    public String toString() {
        return FtsTableInfoKt.toStringCommon(this);
    }

    @NotNull
    public static final FtsTableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String str) {
        return INSTANCE.read(supportSQLiteDatabase, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(@NotNull String name, @NotNull Set<String> columns, @NotNull String createSql) {
        this(name, columns, SchemaInfoUtilKt.parseFtsOptions(createSql));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(createSql, "createSql");
    }
}
