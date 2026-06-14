package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a<com.apm.insight.d.a> {
    public b() {
        super("duplicatelog");
    }

    @Override // com.apm.insight.e.a.a
    protected final /* synthetic */ ContentValues a(com.apm.insight.d.a aVar) {
        com.apm.insight.d.a aVar2 = aVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar2.f7736a);
        contentValues.put("insert_time", Long.valueOf(aVar2.f7737b));
        return contentValues;
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th2;
        int count;
        Cursor cursorQuery;
        if (sQLiteDatabase != null && !TextUtils.isEmpty(str)) {
            try {
                cursorQuery = sQLiteDatabase.query(this.f7768a, null, "path=?", new String[]{str}, null, null, null);
                count = cursorQuery.getCount();
            } catch (Throwable th3) {
                th2 = th3;
                count = 0;
            }
            try {
                cursorQuery.close();
            } catch (Throwable th4) {
                th2 = th4;
                com.apm.insight.a.b(th2);
            }
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.apm.insight.e.a.a
    public final void a(SQLiteDatabase sQLiteDatabase, com.apm.insight.d.a aVar) {
        if (aVar == null || a(sQLiteDatabase, aVar.f7736a)) {
            return;
        }
        super.a(sQLiteDatabase, aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f7768a + " where _id in (select _id from " + this.f7768a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    @Override // com.apm.insight.e.a.a
    protected final HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("path", AdPreferences.TYPE_TEXT);
        map.put("insert_time", "INTEGER");
        map.put(IronSourceConstants.EVENTS_EXT1, AdPreferences.TYPE_TEXT);
        map.put("ext2", AdPreferences.TYPE_TEXT);
        return map;
    }
}
