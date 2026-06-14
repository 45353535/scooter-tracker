package androidx.room.util;

import android.os.Build;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0019\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"columnIndexOf", "", "Landroidx/sqlite/SQLiteStatement;", "name", "", "findColumnIndexBySuffix", "findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(@NotNull SQLiteStatement sQLiteStatement, @NotNull String name) {
        Intrinsics.checkNotNullParameter(sQLiteStatement, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int iColumnIndexOfCommon = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, name);
        if (iColumnIndexOfCommon >= 0) {
            return iColumnIndexOfCommon;
        }
        int iColumnIndexOfCommon2 = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, '`' + name + '`');
        return iColumnIndexOfCommon2 >= 0 ? iColumnIndexOfCommon2 : findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(sQLiteStatement, name);
    }

    private static final int findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(SQLiteStatement sQLiteStatement, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = sQLiteStatement.getColumnCount();
            String str2 = '.' + str;
            String str3 = '.' + str + '`';
            for (int i10 = 0; i10 < columnCount; i10++) {
                String columnName = sQLiteStatement.getColumnName(i10);
                if (columnName.length() >= str.length() + 2 && (StringsKt.M(columnName, str2, false, 2, null) || (columnName.charAt(0) == '`' && StringsKt.M(columnName, str3, false, 2, null)))) {
                    return i10;
                }
            }
        }
        return -1;
    }
}
