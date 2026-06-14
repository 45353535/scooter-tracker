package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.mo.qdl.jpc;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class ud {
    private C0231ud qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Context f16546ud;

    private class qdl extends AbstractCursor {
        private qdl() {
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

    ud(Context context) {
        try {
            this.f16546ud = context.getApplicationContext();
            if (this.qdl == null) {
                this.qdl = new C0231ud();
            }
        } catch (Throwable unused) {
        }
    }

    public C0231ud qdl() {
        return this.qdl;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mo.qdl.qdl.qdl.ud$ud, reason: collision with other inner class name */
    public class C0231ud {

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private volatile SQLiteDatabase f16547ud = null;

        public C0231ud() {
        }

        private void qdl() {
            boolean zUd;
            try {
                if (this.f16547ud != null && this.f16547ud.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f16547ud == null || !this.f16547ud.isOpen()) {
                            this.f16547ud = jpc.wd().mml().qdl(jpc.wd().mo());
                            this.f16547ud.setLockingEnabled(false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } finally {
                if (!zUd) {
                }
            }
        }

        private boolean ud() {
            SQLiteDatabase sQLiteDatabase = this.f16547ud;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public void qdl(String str) throws SQLException {
            try {
                qdl();
                this.f16547ud.execSQL(str);
            } catch (Throwable th2) {
                if (ud()) {
                    throw th2;
                }
            }
        }

        public Cursor qdl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                qdl();
                return this.f16547ud.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                qdl qdlVar = new qdl();
                if (ud()) {
                    throw th2;
                }
                return qdlVar;
            }
        }

        public int qdl(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                qdl();
                return this.f16547ud.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (ud()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long qdl(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                qdl();
                return this.f16547ud.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (ud()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void qdl(String str, String str2, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
            JSONObject jSONObjectWd;
            try {
                try {
                    qdl();
                    this.f16547ud.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar = list.get(i10);
                        if (qdlVar != null && (jSONObjectWd = qdlVar.wd()) != null) {
                            contentValues.put("id", qdlVar.lnr());
                            String strUd = jpc.wd().jtx().ud(jSONObjectWd.toString());
                            if (!TextUtils.isEmpty(strUd)) {
                                contentValues.put("value", strUd);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && qdlVar.to() > 0 && (qdlVar.mml() == 0 || qdlVar.mml() == 3)) {
                                    contentValues.put(AppsFlyerProperties.CHANNEL, Integer.valueOf(qdlVar.to()));
                                }
                                this.f16547ud.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.f16547ud.setTransactionSuccessful();
                    list.size();
                    if (this.f16547ud != null) {
                        this.f16547ud.endTransaction();
                    }
                } catch (Exception e10) {
                    list.size();
                    if (!ud()) {
                        if (this.f16547ud != null) {
                            this.f16547ud.endTransaction();
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Throwable th2) {
                if (this.f16547ud != null) {
                    this.f16547ud.endTransaction();
                }
                throw th2;
            }
        }

        public int qdl(String str, String str2, String[] strArr) throws Exception {
            try {
                qdl();
                return this.f16547ud.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (ud()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
