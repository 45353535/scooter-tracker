package io.appmetrica.analytics.coreutils.internal.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;

/* JADX INFO: loaded from: classes12.dex */
public class DBUtils {
    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        try {
            enhancedCursorRowToContentValues(cursor, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void enhancedCursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i10 = 0; i10 < length; i10++) {
            int type = cursor.getType(i10);
            if (type == 0) {
                contentValues.put(columnNames[i10], cursor.getString(i10));
            } else if (type == 1) {
                contentValues.put(columnNames[i10], Long.valueOf(cursor.getLong(i10)));
            } else if (type == 2) {
                contentValues.put(columnNames[i10], Double.valueOf(cursor.getDouble(i10)));
            } else if (type == 3) {
                contentValues.put(columnNames[i10], cursor.getString(i10));
            } else if (type != 4) {
                contentValues.put(columnNames[i10], cursor.getString(i10));
            } else {
                contentValues.put(columnNames[i10], cursor.getBlob(i10));
            }
        }
    }

    public static long queryRowsCount(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
        } finally {
            CloseableUtilsKt.closeSafely(cursorRawQuery);
        }
    }
}
