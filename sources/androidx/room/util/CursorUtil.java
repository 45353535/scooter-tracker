package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import uf.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a#\u0010\b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"copyAndClose", "Landroid/database/Cursor;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getColumnIndex", "", "name", "", "getColumnIndexOrThrow", "findColumnIndexBySuffix", "cursor", "columnNames", "", "([Ljava/lang/String;Ljava/lang/String;)I", "useCursor", "R", "block", "Lkotlin/Function1;", "(Landroid/database/Cursor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "wrapMappedColumns", "mapping", "", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class CursorUtil {
    @NotNull
    public static final Cursor copyAndClose(@NotNull Cursor c10) throws IOException {
        Intrinsics.checkNotNullParameter(c10, "c");
        Cursor cursor = c10;
        try {
            Cursor cursor2 = cursor;
            MatrixCursor matrixCursor = new MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                Object[] objArr = new Object[cursor2.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = cursor2.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(cursor2.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(cursor2.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = cursor2.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = cursor2.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            c.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        Intrinsics.checkNotNull(columnNames);
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(@NotNull Cursor c10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c10, name);
    }

    public static final int getColumnIndexOrThrow(@NotNull Cursor c10, @NotNull String name) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c10, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "getColumnNames(...)");
            strJoinToString$default = ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strJoinToString$default = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strJoinToString$default);
    }

    public static final <R> R useCursor(@NotNull Cursor cursor, @NotNull Function1<? super Cursor, ? extends R> block) throws IOException {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Cursor cursor2 = cursor;
        try {
            R rInvoke = block.invoke(cursor2);
            z.b(1);
            c.a(cursor2, null);
            z.a(1);
            return rInvoke;
        } finally {
        }
    }

    @NotNull
    public static final Cursor wrapMappedColumns(@NotNull Cursor cursor, @NotNull final String[] columnNames, @NotNull final int[] mapping) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String columnName) {
                    Intrinsics.checkNotNullParameter(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        if (StringsKt.N(strArr[i10], columnName, true)) {
                            return iArr[i11];
                        }
                        i10++;
                        i11 = i12;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }

    @VisibleForTesting
    public static final int findColumnIndexBySuffix(@NotNull String[] columnNames, @NotNull String name) {
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = columnNames[i10];
            int i12 = i11 + 1;
            if (str3.length() >= name.length() + 2 && (StringsKt.M(str3, str, false, 2, null) || (str3.charAt(0) == '`' && StringsKt.M(str3, str2, false, 2, null)))) {
                return i11;
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }
}
