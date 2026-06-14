package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: loaded from: classes11.dex */
public final class d1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static long f61407y = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f61408a = new String[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f61409b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f61410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f61411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SQLiteStatement f61412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f61413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SQLiteStatement f61414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SQLiteStatement f61415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SQLiteStatement f61416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SQLiteStatement f61417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SQLiteStatement f61418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SQLiteStatement f61419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SQLiteStatement f61420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SQLiteStatement f61421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final SQLiteStatement f61422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SQLiteStatement f61423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SQLiteStatement f61424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SQLiteStatement f61425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SQLiteStatement f61426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SQLiteStatement f61427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SQLiteStatement f61428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SQLiteStatement f61429v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final l1 f61430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final SQLiteDatabase f61431x;

    static abstract class a implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Cursor f61432a;

        a(Cursor cursor) {
            this.f61432a = cursor;
        }

        final boolean b() {
            return this.f61432a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f61432a.close();
            } catch (Throwable th2) {
                x2.b("AbstractReader error: error while closing cursor", th2);
            }
        }

        protected void finalize() throws Throwable {
            super.finalize();
            close();
        }
    }

    static final class b extends a {
        b(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f61432a.getLong(0);
        }

        long e() {
            return this.f61432a.getLong(5);
        }

        String m() {
            return this.f61432a.getString(1);
        }

        String n() {
            return this.f61432a.getString(2);
        }

        String o() {
            return this.f61432a.getString(3);
        }

        int p() {
            return this.f61432a.getInt(4);
        }
    }

    static final class c extends a {
        c(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f61432a.getLong(0);
        }

        long c() {
            return this.f61432a.getLong(4);
        }

        long g() {
            return this.f61432a.getLong(1);
        }

        byte[] l() {
            return this.f61432a.getBlob(3);
        }
    }

    static final class d extends a {
        d(Cursor cursor) {
            super(cursor);
        }

        long e() {
            return this.f61432a.getLong(1);
        }
    }

    static final class e extends a {
        e(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f61432a.getLong(0);
        }

        long e() {
            return this.f61432a.getLong(3);
        }

        String m() {
            return this.f61432a.getString(1);
        }

        String n() {
            return this.f61432a.getString(2);
        }
    }

    static final class f extends a {
        f(Cursor cursor) {
            super(cursor);
        }

        long a() {
            return this.f61432a.getLong(0);
        }

        long c() {
            return this.f61432a.getLong(3);
        }

        String k() {
            return this.f61432a.getString(1);
        }

        long m() {
            return this.f61432a.isNull(2) ? d1.f61407y : this.f61432a.getLong(2);
        }
    }

    static final class g extends a {
        g(Cursor cursor) {
            super(cursor);
        }

        long m() {
            return this.f61432a.getLong(2);
        }

        long n() {
            return this.f61432a.getLong(1);
        }

        boolean o() {
            return this.f61432a.isNull(2);
        }
    }

    static final class h implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f61433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f61434b;

        h() {
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f61433a);
            sQLiteQuery.bindBlob(2, this.f61434b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private d1(SQLiteDatabase sQLiteDatabase) {
        this.f61431x = sQLiteDatabase;
        this.f61410c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.f61411d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f61412e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f61413f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.f61414g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.f61415h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.f61416i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.f61417j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.f61418k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.f61419l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.f61420m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.f61421n = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.f61425r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.f61422o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.f61423p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.f61426s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.f61424q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.f61427t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.f61428u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.f61429v = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
        this.f61430w = new l1(sQLiteDatabase);
    }

    public static d1 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                x2.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 10) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
                context.deleteDatabase(str2);
                sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(10);
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
                l1.a(sQLiteDatabaseOpenOrCreateDatabase);
            }
            return new d1(sQLiteDatabaseOpenOrCreateDatabase);
        } catch (Throwable th2) {
            x2.b("MyTrackerDatabase error: exception occurred while initialization database", th2);
            return null;
        }
    }

    Long b(String str) {
        String[] strArr = this.f61408a;
        strArr[0] = str;
        Cursor cursorRawQuery = this.f61431x.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return null;
            }
            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            cursorRawQuery.close();
            return lValueOf;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void c(long j10, long j11) {
        this.f61411d.bindLong(1, j10);
        this.f61411d.bindLong(2, j11);
        this.f61411d.execute();
    }

    long d(long j10) {
        this.f61408a[0] = String.valueOf(j10);
        Cursor cursorRawQuery = this.f61431x.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f61408a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j11 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j11;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    d e(long j10) {
        this.f61408a[0] = String.valueOf(j10);
        return new d(this.f61431x.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f61408a));
    }

    long f(long j10) {
        this.f61408a[0] = String.valueOf(j10);
        Cursor cursorRawQuery = this.f61431x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f61408a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j11 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j11;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    long g(long j10) {
        this.f61408a[0] = String.valueOf(j10);
        Cursor cursorRawQuery = this.f61431x.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f61408a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j11 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j11;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    g h(long j10) {
        this.f61408a[0] = String.valueOf(j10);
        return new g(this.f61431x.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f61408a));
    }

    c i() {
        return new c(this.f61431x.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    long j() {
        Cursor cursorRawQuery = this.f61431x.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j10 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j10;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    e k() {
        return new e(this.f61431x.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", null));
    }

    long l() {
        Cursor cursorRawQuery = this.f61431x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j10 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j10;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void i(long j10) {
        this.f61430w.b(j10);
    }

    void e() {
        this.f61424q.execute();
    }

    b h() {
        return new b(this.f61431x.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", null));
    }

    void c() {
        this.f61422o.execute();
    }

    void c(long j10) {
        this.f61430w.a(j10);
    }

    c b(long j10, byte[] bArr) {
        h hVar = this.f61409b;
        hVar.f61433a = j10;
        hVar.f61434b = bArr;
        return new c(this.f61431x.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    void d(long j10, long j11) {
        this.f61417j.bindLong(1, j11);
        this.f61417j.bindLong(2, j10);
        this.f61417j.execute();
    }

    com.my.tracker.obfuscated.b f() {
        return this.f61430w.a();
    }

    long g() {
        Cursor cursorRawQuery = this.f61431x.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j10 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j10;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void b() {
        this.f61421n.execute();
    }

    void d() {
        this.f61423p.execute();
    }

    long b(long j10, long j11) {
        this.f61426s.bindLong(1, j10);
        this.f61426s.bindLong(2, j11);
        return this.f61426s.executeUpdateDelete();
    }

    void b(long j10) {
        this.f61428u.bindLong(1, j10);
        this.f61428u.execute();
    }

    long a(long j10, byte[] bArr) {
        h hVar = this.f61409b;
        hVar.f61433a = j10;
        hVar.f61434b = bArr;
        Cursor cursorRawQueryWithFactory = this.f61431x.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, null);
        try {
            if (!cursorRawQueryWithFactory.moveToNext()) {
                cursorRawQueryWithFactory.close();
                return 0L;
            }
            long j11 = cursorRawQueryWithFactory.getLong(0);
            cursorRawQueryWithFactory.close();
            return j11;
        } catch (Throwable th2) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    f a(String str) {
        String[] strArr = this.f61408a;
        strArr[0] = str;
        return new f(this.f61431x.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    long a(int i10, byte[] bArr, boolean z10) {
        this.f61410c.bindLong(1, i10);
        this.f61410c.bindLong(2, z10 ? 1L : 0L);
        this.f61410c.bindBlob(3, bArr);
        return this.f61410c.executeInsert();
    }

    long a(String str, long j10) {
        this.f61412e.bindString(1, str);
        this.f61412e.bindLong(2, j10);
        return this.f61412e.executeInsert();
    }

    void a(long j10, long j11, boolean z10, long j12) {
        this.f61413f.bindLong(1, j10);
        this.f61413f.bindLong(2, j11);
        if (z10) {
            this.f61413f.bindNull(3);
        } else {
            this.f61413f.bindLong(3, j12);
        }
        this.f61413f.execute();
    }

    long a(String str, String str2, long j10) {
        this.f61415h.bindString(1, str);
        this.f61415h.bindString(2, str2);
        this.f61415h.bindLong(3, j10);
        return this.f61415h.executeInsert();
    }

    long a(String str, String str2, String str3, int i10, long j10) {
        this.f61416i.bindString(1, str);
        this.f61416i.bindString(2, str2);
        this.f61416i.bindString(3, str3);
        this.f61416i.bindLong(4, i10);
        this.f61416i.bindLong(5, j10);
        return this.f61416i.executeInsert();
    }

    void a(long j10, long j11, long j12) {
        if (j11 != f61407y) {
            this.f61418k.bindLong(1, j11);
        } else {
            this.f61418k.bindNull(1);
        }
        this.f61418k.bindLong(2, j12);
        this.f61418k.bindLong(3, j10);
        this.f61418k.execute();
    }

    void a() {
        this.f61420m.execute();
    }

    void a(String str, Long l10) {
        if (l10 == null) {
            this.f61427t.bindString(1, str);
            this.f61427t.execute();
            return;
        }
        long jLongValue = l10.longValue();
        this.f61414g.bindString(1, str);
        this.f61414g.bindLong(2, jLongValue);
        if (this.f61414g.executeInsert() != f61407y) {
            return;
        }
        this.f61419l.bindLong(1, jLongValue);
        this.f61419l.bindString(2, str);
        this.f61419l.execute();
    }

    long a(long j10, long j11) {
        this.f61425r.bindLong(1, j10);
        this.f61425r.bindLong(2, j11);
        return this.f61425r.executeUpdateDelete();
    }

    void a(long j10) {
        this.f61429v.bindLong(1, j10);
        this.f61429v.execute();
    }

    void a(byte[] bArr) {
        this.f61430w.a(bArr);
    }
}
