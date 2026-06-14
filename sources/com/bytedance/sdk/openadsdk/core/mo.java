package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private static final Object lnr = new Object();
    private lnr qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Context f17323ud;

    private class ud extends AbstractCursor {
        private ud() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    mo(Context context) {
        try {
            this.f17323ud = context == null ? yt.qdl() : context.getApplicationContext();
            if (this.qdl == null) {
                this.qdl = new lnr();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context lnr() {
        Context context = this.f17323ud;
        return context == null ? yt.qdl() : context;
    }

    public class lnr {

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private SQLiteDatabase f17324ud = null;

        public lnr() {
        }

        private synchronized boolean mo() {
            SQLiteDatabase sQLiteDatabase = this.f17324ud;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void mzz() {
            try {
                synchronized (mo.lnr) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.f17324ud;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            mo moVar = mo.this;
                            SQLiteDatabase writableDatabase = moVar.new qdl(moVar.lnr()).getWritableDatabase();
                            this.f17324ud = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", th2.getMessage());
                if (mo()) {
                    throw th2;
                }
            }
        }

        public synchronized void lnr() {
            mzz();
            SQLiteDatabase sQLiteDatabase = this.f17324ud;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void mml() {
            mzz();
            SQLiteDatabase sQLiteDatabase = this.f17324ud;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public SQLiteDatabase qdl() {
            mzz();
            return this.f17324ud;
        }

        public synchronized void ud() {
            mzz();
            SQLiteDatabase sQLiteDatabase = this.f17324ud;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void qdl(String str) throws SQLException {
            try {
                mzz();
                this.f17324ud.execSQL(str);
            } catch (Throwable th2) {
                if (mo()) {
                    throw th2;
                }
            }
        }

        public synchronized Cursor qdl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                mzz();
                cursorQuery = this.f17324ud.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", th2.getMessage());
                ud udVar = new ud();
                if (mo()) {
                    throw th2;
                }
                cursorQuery = udVar;
            }
            return cursorQuery;
        }

        public synchronized int qdl(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                mzz();
                iUpdate = this.f17324ud.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", e10.getMessage());
                if (mo()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long qdl(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                mzz();
                jReplace = this.f17324ud.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", e10.getMessage());
                if (mo()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int qdl(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                mzz();
                iDelete = this.f17324ud.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", e10.getMessage());
                if (mo()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public lnr qdl() {
        return this.qdl;
    }

    private class qdl extends SQLiteOpenHelper {
        final Context qdl;

        public qdl(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.qdl = context;
        }

        private void lnr(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListMml = mml(sQLiteDatabase);
            if (arrayListMml == null || arrayListMml.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListMml.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        private ArrayList<String> mml(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
            return arrayList;
        }

        private void qdl(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.mml.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.to.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.bjy.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.rdp.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.bch.ud.qdl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.yt.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.qdl.ud.ud.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.rq.qdl.lnr.lnr());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.jtx.qdl());
        }

        private void ud(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.rq.qdl.lnr.mml());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                qdl(sQLiteDatabase, this.qdl);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.lnr("DBHelper", th2.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    lnr(sQLiteDatabase);
                    qdl(sQLiteDatabase, mo.this.f17323ud);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.aaj.lnr(th2.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            /*
                r0 = this;
                if (r2 <= r3) goto L5
                r0.lnr(r1)     // Catch: java.lang.Throwable -> L43
            L5:
                com.bytedance.sdk.openadsdk.core.mo r3 = com.bytedance.sdk.openadsdk.core.mo.this     // Catch: java.lang.Throwable -> L43
                android.content.Context r3 = com.bytedance.sdk.openadsdk.core.mo.ud(r3)     // Catch: java.lang.Throwable -> L43
                r0.qdl(r1, r3)     // Catch: java.lang.Throwable -> L43
                switch(r2) {
                    case 1: goto L40;
                    case 2: goto L37;
                    case 3: goto L2c;
                    case 4: goto L21;
                    case 5: goto L16;
                    case 6: goto L12;
                    default: goto L11;
                }     // Catch: java.lang.Throwable -> L43
            L11:
                goto L43
            L12:
                r0.qdl(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L16:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.mml.rdp.qdl()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.qdl(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L21:
                java.lang.String r3 = com.bytedance.sdk.component.adexpress.qdl.ud.ud.lnr()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.qdl(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L2c:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.mml.bjy.qdl()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.qdl(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L37:
                java.lang.String r3 = "DROP TABLE IF EXISTS 'ad_video_info';"
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.qdl(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L40:
                r0.qdl(r1)     // Catch: java.lang.Throwable -> L43
            L43:
                r3 = 11
                if (r2 >= r3) goto L58
                r0.ud(r1)     // Catch: java.lang.Throwable -> L4e
                com.bytedance.sdk.openadsdk.bch.ud.qdl(r1)     // Catch: java.lang.Throwable -> L4e
                goto L58
            L4e:
                r1 = move-exception
                java.lang.String r2 = "DBHelper"
                java.lang.String r1 = r1.getMessage()
                com.bytedance.sdk.component.utils.aaj.lnr(r2, r1)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mo.qdl.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }

        private void qdl(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.mml.ud());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.to.mml());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.bjy.ud());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mml.rdp.ud());
        }
    }
}
