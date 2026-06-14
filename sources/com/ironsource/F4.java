package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class F4 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static E4 f40861a = new E4();

    public F4(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void a(M5 m52) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = f40861a.a(true, new F4(C4462o4.d().a()));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            sQLiteDatabaseA.beginTransaction();
            ContentValues contentValues = new ContentValues();
            String strE = m52.e();
            String strB = m52.b();
            String strD = m52.d();
            contentValues.put("stack_trace", strE);
            contentValues.put("crash_date", strB);
            contentValues.put("crashType", strD);
            sQLiteDatabaseA.insert("REPORTS", null, contentValues);
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            sQLiteDatabaseA.close();
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseA;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static M5 b(int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f40861a.a(new F4(C4462o4.d().a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
                int i11 = cursorRawQuery.getInt(0);
                String string = cursorRawQuery.getString(1);
                String string2 = cursorRawQuery.getString(2);
                String string3 = cursorRawQuery.getString(3);
                cursorRawQuery.close();
                M5 m52 = new M5(i11, string, string2, string3);
                sQLiteDatabaseA.close();
                return m52;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Cursor c() throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        F4 f42 = new F4(C4462o4.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = f40861a.a(f42);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS;", null);
            sQLiteDatabaseA.close();
            return cursorRawQuery;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseA;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public static List<M5> b() {
        F4 f42 = new F4(C4462o4.d().a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f40861a.a(f42);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS ;", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(new M5(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Cursor a(int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = f40861a.a(new F4(C4462o4.d().a()));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
            sQLiteDatabaseA.close();
            return cursorRawQuery;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseA;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void a() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = f40861a.a(true, new F4(C4462o4.d().a()));
            sQLiteDatabaseA.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabaseA.close();
        } catch (Throwable th2) {
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.close();
            }
            throw th2;
        }
    }
}
