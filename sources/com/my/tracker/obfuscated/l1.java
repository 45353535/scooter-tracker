package com.my.tracker.obfuscated;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes11.dex */
final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f61633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f61634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f61635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f61636d;

    private static class a implements b, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cursor f61637a;

        public a(Cursor cursor) {
            this.f61637a = cursor;
        }

        @Override // com.my.tracker.obfuscated.b
        public long a() {
            return this.f61637a.getLong(0);
        }

        @Override // com.my.tracker.obfuscated.b
        public boolean b() {
            return this.f61637a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f61637a.close();
        }

        @Override // com.my.tracker.obfuscated.b
        public byte[] i() {
            return this.f61637a.getBlob(1);
        }
    }

    l1(SQLiteDatabase sQLiteDatabase) {
        this.f61633a = sQLiteDatabase;
        this.f61634b = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id not in   (SELECT id    FROM table_partial_proto_packet    ORDER BY TS DESC    LIMIT ?  )");
        this.f61635c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_partial_proto_packet(data, ts) VALUES (?, ?)");
        this.f61636d = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id = ?");
    }

    static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_partial_proto_packet(id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, ts INTEGER(8))");
    }

    void b(long j10) {
        this.f61634b.bindLong(1, j10);
        this.f61634b.executeUpdateDelete();
    }

    void a(byte[] bArr) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f61635c.bindBlob(1, bArr);
            this.f61635c.bindLong(2, jCurrentTimeMillis);
            this.f61635c.executeInsert();
        } finally {
            this.f61635c.clearBindings();
        }
    }

    b a() {
        return new a(this.f61633a.rawQuery("SELECT id, data FROM table_partial_proto_packet ORDER BY ts", null));
    }

    void a(long j10) {
        this.f61636d.bindLong(1, j10);
        this.f61636d.executeUpdateDelete();
    }
}
