package j;

import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {
    public static void a(SQLiteStatement sQLiteStatement, int i10, boolean z10) {
        sQLiteStatement.mo4251bindLong(i10, z10 ? 1L : 0L);
    }

    public static void b(SQLiteStatement sQLiteStatement, int i10, float f10) {
        sQLiteStatement.mo4250bindDouble(i10, f10);
    }

    public static void c(SQLiteStatement sQLiteStatement, int i10, int i11) {
        sQLiteStatement.mo4251bindLong(i10, i11);
    }

    public static boolean d(SQLiteStatement sQLiteStatement, int i10) {
        return sQLiteStatement.getLong(i10) != 0;
    }

    public static List e(SQLiteStatement sQLiteStatement) {
        int columnCount = sQLiteStatement.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(sQLiteStatement.getColumnName(i10));
        }
        return arrayList;
    }

    public static float f(SQLiteStatement sQLiteStatement, int i10) {
        return (float) sQLiteStatement.getDouble(i10);
    }

    public static int g(SQLiteStatement sQLiteStatement, int i10) {
        return (int) sQLiteStatement.getLong(i10);
    }
}
