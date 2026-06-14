package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ec0 implements tm3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f110303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f110304f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30 f110306b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110308d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110305a = "ExoPlayerDownloads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f110307c = new Object();

    static {
        int[] iArr = {3, 4};
        StringBuilder sb2 = new StringBuilder("state IN (");
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i10]);
        }
        sb2.append(')');
        f110303e = sb2.toString();
        f110304f = new String[]{"id", "mime_type", com.taurusx.tax.o.g.f66428y, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public ec0(u03 u03Var, int i10) {
        this.f110306b = u03Var;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i10 = w83.f117341a;
            for (String str2 : str.split(StringUtils.COMMA, -1)) {
                String[] strArrSplit = str2.split("\\.", -1);
                if (strArrSplit.length != 3) {
                    throw new IllegalStateException();
                }
                arrayList.add(new h13(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public final oi0 b(String str) throws i30 {
        a();
        try {
            Cursor cursorA = a("id = ?", new String[]{str});
            try {
                if (cursorA.getCount() == 0) {
                    cursorA.close();
                    return null;
                }
                cursorA.moveToNext();
                oi0 oi0VarA = a(cursorA);
                cursorA.close();
                return oi0VarA;
            } finally {
            }
        } catch (SQLiteException e10) {
            throw new i30(e10);
        }
        throw new i30(e10);
    }

    public final void c() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f110306b.getWritableDatabase().update(this.f110305a, contentValues, null, null);
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }

    public static oi0 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        wi0 wi0Var = new wi0(string, uri, str, a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        ui0 ui0Var = new ui0();
        ui0Var.f116657a = cursor.getLong(13);
        ui0Var.f116658b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new oi0(wi0Var, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, ui0Var);
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f110307c) {
            if (this.f110308d) {
                return;
            }
            try {
                int iA = eb3.a(this.f110306b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.f110306b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        eb3.a(writableDatabase, 0, "", 3);
                        if (iA == 2) {
                            arrayList = a(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f110305a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f110305a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a((oi0) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f110308d = true;
            } catch (Throwable th3) {
                throw new i30(th3);
            }
        }
    }

    public final Cursor a(String str, String[] strArr) {
        try {
            return this.f110306b.getReadableDatabase().query(this.f110305a, f110304f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }

    public final void b() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f110306b.getWritableDatabase().update(this.f110305a, contentValues, "state = 2", null);
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }

    public static oi0 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList arrayListA = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        wi0 wi0Var = new wi0(string, uri, string3, arrayListA, blob, cursor.getString(4), cursor.getBlob(5));
        ui0 ui0Var = new ui0();
        ui0Var.f116657a = cursor.getLong(13);
        ui0Var.f116658b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new oi0(wi0Var, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, ui0Var);
    }

    public final ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!w83.a(sQLiteDatabase, this.f110305a)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f110305a, new String[]{"id", "title", com.taurusx.tax.o.g.f66428y, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(b(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void a(oi0 oi0Var) {
        a();
        try {
            a(oi0Var, this.f110306b.getWritableDatabase());
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }

    public final void a(oi0 oi0Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = oi0Var.f114325a.f117463f;
        if (bArr == null) {
            bArr = w83.f117346f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", oi0Var.f114325a.f117459b);
        contentValues.put("mime_type", oi0Var.f114325a.f117461d);
        contentValues.put(com.taurusx.tax.o.g.f66428y, oi0Var.f114325a.f117460c.toString());
        List list = oi0Var.f114325a.f117462e;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            h13 h13Var = (h13) list.get(i10);
            sb2.append(h13Var.f111438b);
            sb2.append('.');
            sb2.append(h13Var.f111439c);
            sb2.append('.');
            sb2.append(h13Var.f111440d);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        contentValues.put("stream_keys", sb2.toString());
        contentValues.put("custom_cache_key", oi0Var.f114325a.f117464g);
        contentValues.put("data", oi0Var.f114325a.f117465h);
        contentValues.put("state", Integer.valueOf(oi0Var.f114326b));
        contentValues.put("start_time_ms", Long.valueOf(oi0Var.f114327c));
        contentValues.put("update_time_ms", Long.valueOf(oi0Var.f114328d));
        contentValues.put("content_length", Long.valueOf(oi0Var.f114329e));
        contentValues.put("stop_reason", Integer.valueOf(oi0Var.f114330f));
        contentValues.put("failure_reason", Integer.valueOf(oi0Var.f114331g));
        contentValues.put("percent_downloaded", Float.valueOf(oi0Var.f114332h.f116658b));
        contentValues.put("bytes_downloaded", Long.valueOf(oi0Var.f114332h.f116657a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f110305a, null, contentValues);
    }

    public final void a(int i10, String str) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f110306b.getWritableDatabase().update(this.f110305a, contentValues, f110303e + " AND id = ?", new String[]{str});
        } catch (Throwable th2) {
            throw new i30(th2);
        }
    }
}
