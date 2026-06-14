package com.bytedance.sdk.openadsdk.yt.qdl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.aaj;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile qdl f17904ud;
    final Context qdl;

    private qdl(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.qdl = context;
    }

    private static qdl lnr() {
        if (f17904ud == null) {
            synchronized (qdl.class) {
                try {
                    if (f17904ud == null) {
                        f17904ud = new qdl(com.bytedance.sdk.openadsdk.yt.qdl.qdl());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17904ud;
    }

    public static SQLiteDatabase qdl() {
        try {
            qdl qdlVarLnr = lnr();
            if (qdlVarLnr == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = qdlVarLnr.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase ud() {
        try {
            qdl qdlVarLnr = lnr();
            if (qdlVarLnr == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = qdlVarLnr.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th2) {
            Log.e("MonitorSQLiteOpenHelper", th2.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                qdl(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private void qdl(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListUd = ud(sQLiteDatabase);
        if (arrayListUd == null || arrayListUd.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListUd.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> ud(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
                return arrayList;
            }
        } catch (Exception e10) {
            aaj.lnr("MonitorSQLiteOpenHelper", e10.getMessage());
        }
        return arrayList;
    }
}
