package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.taurusx.tax.y.z.w.s;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes11.dex */
public final class k9 extends m6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f64824d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", NotificationCompat.CATEGORY_SERVICE, s.z.f67720z};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f64825c;

    public k9(Context context) {
        super(context);
        this.f64825c = new LinkedList();
    }

    public static boolean a(g9 g9Var, m9 m9Var, SQLiteDatabase sQLiteDatabase, HashMap map, long j10) {
        if (m9Var.f64913a.size() > 0 && !m9Var.f64913a.contains(g9Var.f64553d)) {
            return false;
        }
        if (m9Var.f64914b.size() > 0 && m9Var.f64914b.contains(g9Var.f64553d)) {
            return false;
        }
        if (m9Var.f64915c.size() > 0 && !m9Var.f64915c.contains(g9Var.f64558i)) {
            return false;
        }
        if (m9Var.f64916d.size() > 0 && m9Var.f64916d.contains(g9Var.f64558i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", (String) map.get("sdkVersion"));
        }
        if (map.containsKey("category")) {
            linkedHashMap.put("category", (String) map.get("category"));
        }
        for (String str : m9Var.f64917e) {
            if (map.containsKey(str)) {
                linkedHashMap.put(str, (String) map.get(str));
            }
        }
        int size = linkedHashMap.size();
        if (size < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList(size);
        String str2 = "";
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb2.append(str2);
            sb2.append((String) entry.getKey());
            if (entry.getValue() == null) {
                sb2.append(" IS NULL");
            } else {
                sb2.append(" = ?");
                arrayList.add((String) entry.getValue());
            }
            str2 = " AND ";
        }
        Pair pair = new Pair(sb2.toString(), (String[]) arrayList.toArray(new String[0]));
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, null, null, "sendSuccess DESC");
            if (cursorQuery.moveToFirst()) {
                long j11 = cursorQuery.getLong(0);
                if (j11 <= 0) {
                    a(cursorQuery);
                    return true;
                }
                long j12 = j10 - j11;
                long j13 = m9Var.f64918f;
                if (j13 > 0 && j12 < j13) {
                    a(cursorQuery);
                    return true;
                }
            }
            a(cursorQuery);
            return false;
        } catch (Throwable th2) {
            a(cursorQuery);
            throw th2;
        }
    }

    public static g9 b(Cursor cursor) {
        long j10 = cursor.getLong(0);
        long j11 = cursor.getLong(1);
        a(j10, j11);
        String string = cursor.getString(2);
        h9 h9Var = (h9) h9.f64608c.get(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        boolean z10 = cursor.getInt(9) == 1;
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        }
        if (h9Var == null) {
            throw new IllegalArgumentException();
        }
        Object objNextValue = null;
        if (string5 != null) {
            try {
                objNextValue = new JSONTokener(string5).nextValue();
            } catch (JSONException unused) {
            }
        }
        g9 g9Var = new g9(h9Var, j10);
        g9Var.f64557h = Long.valueOf(j11);
        g9Var.f64552c = string;
        g9Var.f64558i = string2;
        g9Var.f64553d = string3;
        g9Var.f64554e = string4;
        g9Var.f64555f = objNextValue;
        g9Var.f64556g = string6;
        g9Var.f64559j = z10;
        g9Var.f64560k = string7;
        return g9Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public final void a(v9 v9Var, int i10, int i11) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("events", f64824d, "attempt < " + i10 + " AND validTill >= " + System.currentTimeMillis() + " AND sendSuccess = 0  AND send <= sendFailure", null, null, null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i11)));
            while (cursorQuery.moveToNext()) {
                v9Var.a(b(cursorQuery));
            }
        } finally {
            a(cursorQuery);
        }
    }

    public final boolean a(g9 g9Var, j9 j9Var) {
        long jLongValue;
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = j9Var.f64754e + jCurrentTimeMillis;
            Long l10 = g9Var.f64557h;
            if (l10 != null) {
                jLongValue = l10.longValue();
            } else {
                g9Var.f64557h = Long.valueOf(jCurrentTimeMillis);
                jLongValue = jCurrentTimeMillis;
            }
            Object obj = g9Var.f64555f;
            String string = obj != null ? obj.toString() : null;
            String str = g9Var.f64552c;
            if (str == null) {
                str = "5.2.4";
            }
            String str2 = str;
            List list = j9Var.f64756g;
            if (list.size() > 0) {
                HashMap map = new HashMap();
                map.put("sdkVersion", str2);
                map.put("category", g9Var.f64550a.f64622a);
                map.put("appActivity", g9Var.f64558i);
                map.put("value", g9Var.f64553d);
                map.put("details", g9Var.f64554e);
                map.put("detailsJson", string);
                map.put("dParam", g9Var.f64556g);
                map.put(NotificationCompat.CATEGORY_SERVICE, g9Var.f64559j ? "1" : "0");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (a(g9Var, (m9) it.next(), sQLiteDatabaseA, map, jCurrentTimeMillis)) {
                        sQLiteDatabaseA.endTransaction();
                        return false;
                    }
                }
            }
            sQLiteDatabaseA.delete("events", "validTill < " + jCurrentTimeMillis, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(jLongValue));
            contentValues.put("validTill", Long.valueOf(j10));
            contentValues.put("sdkVersion", str2);
            contentValues.put("category", g9Var.f64550a.f64622a);
            contentValues.put("appActivity", g9Var.f64558i);
            contentValues.put("value", g9Var.f64553d);
            contentValues.put("details", g9Var.f64554e);
            contentValues.put("detailsJson", string);
            contentValues.put("dParam", g9Var.f64556g);
            contentValues.put(NotificationCompat.CATEGORY_SERVICE, Integer.valueOf(g9Var.f64559j ? 1 : 0));
            contentValues.put(s.z.f67720z, g9Var.f64560k);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(j9Var.f64752c));
            sQLiteDatabaseA.insertOrThrow("events", null, contentValues);
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            synchronized (this) {
                Iterator it2 = this.f64825c.iterator();
                while (it2.hasNext()) {
                    ((k7) it2.next()).a();
                }
            }
            return true;
        } catch (Throwable th2) {
            sQLiteDatabaseA.endTransaction();
            throw th2;
        }
    }

    public static void a(long j10, long j11) {
        if (j10 <= 0) {
            throw new IllegalArgumentException();
        }
        if (j11 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, long j10) {
        try {
            Cursor cursorQuery = sQLiteDatabase.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j10)}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                int i10 = cursorQuery.getInt(0);
                a(cursorQuery);
                return i10;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            a(null);
            throw th2;
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
