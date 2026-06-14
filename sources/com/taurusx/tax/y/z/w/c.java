package com.taurusx.tax.y.z.w;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.taurusx.tax.y.z.w.s;
import com.taurusx.tax.y.z.w.y;
import com.taurusx.tax.y.z.w.z;
import com.taurusx.tax.y.z.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67710a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f67711c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f67712o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f67713s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f67714w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w f67715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f67716z = "EventDao";

    public List<z.c> w(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f67715y.getReadableDatabase().query(this.f67713s, null, "time > ?", new String[]{str}, null, null, null);
            } catch (Error | Exception e10) {
                e10.printStackTrace();
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    z.c cVar = new z.c();
                    cVar.f67734z = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    cVar.f67732w = cursorQuery.getString(cursorQuery.getColumnIndex("event"));
                    cVar.f67731c = cursorQuery.getString(cursorQuery.getColumnIndex(z.C0835z.f67724y));
                    cVar.f67733y = cursorQuery.getLong(cursorQuery.getColumnIndex("time"));
                    arrayList.add(cVar);
                }
                cursorQuery.close();
            } else if (cursorQuery != null) {
                cursorQuery.close();
                return arrayList;
            }
            return arrayList;
        } finally {
        }
    }

    public long y(String str) {
        SQLiteDatabase writableDatabase = this.f67714w.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("event", str);
        return writableDatabase.insert(this.f67712o, null, contentValues);
    }

    public void z(Context context) {
        this.f67714w = new o(context, o.w());
        this.f67715y = new w(context, w.w());
        this.f67711c = new a(context, a.w());
        this.f67712o = y.z.z();
        this.f67713s = z.C0835z.z();
        this.f67710a = s.z.z();
    }

    private String y(int i10) {
        StringBuilder sb2 = new StringBuilder((i10 * 2) - 1);
        sb2.append("?");
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(",?");
        }
        return sb2.toString();
    }

    public int z() {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f67714w.getReadableDatabase().query(this.f67712o, null, null, null, null, null, null);
                int count = cursorQuery.getCount();
                cursorQuery.close();
                return count;
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public int w() {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f67711c.getReadableDatabase().query(this.f67710a, null, null, null, null, null, null);
                int count = cursorQuery.getCount();
                cursorQuery.close();
                return count;
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public List<z.o> z(int i10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f67714w.getReadableDatabase().query(this.f67712o, null, null, null, null, null, null, String.valueOf(i10));
            } catch (Error | Exception e10) {
                e10.printStackTrace();
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    z.o oVar = new z.o();
                    oVar.f67736z = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    oVar.f67735w = cursorQuery.getString(cursorQuery.getColumnIndex("event"));
                    arrayList.add(oVar);
                }
                cursorQuery.close();
            } else if (cursorQuery != null) {
                cursorQuery.close();
                return arrayList;
            }
            return arrayList;
        } finally {
        }
    }

    public List<z.s> w(int i10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f67711c.getReadableDatabase().query(this.f67710a, null, null, null, null, null, null, String.valueOf(i10));
            } catch (Error | Exception e10) {
                e10.printStackTrace();
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    z.s sVar = new z.s();
                    sVar.f67740z = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    sVar.f67738w = cursorQuery.getString(cursorQuery.getColumnIndex(s.z.f67720z));
                    sVar.f67739y = cursorQuery.getString(cursorQuery.getColumnIndex("time"));
                    sVar.f67737c = cursorQuery.getString(cursorQuery.getColumnIndex(s.z.f67719y));
                    arrayList.add(sVar);
                }
                cursorQuery.close();
            } else if (cursorQuery != null) {
                cursorQuery.close();
                return arrayList;
            }
            return arrayList;
        } finally {
        }
    }

    public int z(List<z.o> list) {
        SQLiteDatabase writableDatabase = this.f67714w.getWritableDatabase();
        int size = list.size();
        String str = "_id IN (" + y(size) + ")";
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = String.valueOf(list.get(i10).f67736z);
        }
        return writableDatabase.delete(this.f67712o, str, strArr);
    }

    public long z(String str, String str2) {
        SQLiteDatabase writableDatabase = this.f67715y.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("event", str);
        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put(z.C0835z.f67724y, str2);
        return writableDatabase.insert(this.f67713s, null, contentValues);
    }

    public int w(List<z.s> list) {
        SQLiteDatabase writableDatabase = this.f67711c.getWritableDatabase();
        int size = list.size();
        String str = "_id IN (" + y(size) + ")";
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = String.valueOf(list.get(i10).f67740z);
        }
        return writableDatabase.delete(this.f67710a, str, strArr);
    }

    public void z(String str) {
        this.f67715y.getReadableDatabase().delete(this.f67713s, "time < ?", new String[]{str});
    }

    public long z(String str, String str2, String str3) {
        SQLiteDatabase writableDatabase = this.f67711c.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(s.z.f67720z, str);
        contentValues.put("time", str2);
        contentValues.put(s.z.f67719y, str3);
        return writableDatabase.insert(this.f67710a, null, contentValues);
    }
}
