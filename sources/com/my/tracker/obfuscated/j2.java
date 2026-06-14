package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: loaded from: classes11.dex */
final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f61596a = new String[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f61597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f61598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f61599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SQLiteStatement f61600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f61601f;

    static abstract class a implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Cursor f61602a;

        a(Cursor cursor) {
            this.f61602a = cursor;
        }

        final boolean b() {
            return this.f61602a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f61602a.close();
            } catch (Throwable th2) {
                x2.b("TimeSpentDataBaseSQL: AbstractReader error: error while closing cursor", th2);
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

        byte[] m() {
            return this.f61602a.getBlob(2);
        }

        long n() {
            return this.f61602a.getLong(0);
        }
    }

    private j2(SQLiteDatabase sQLiteDatabase) {
        this.f61597b = sQLiteDatabase;
        this.f61599d = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM table_tick_packet");
        this.f61598c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_tick_packet(timestamp, content) VALUES (?, ?)");
        this.f61600e = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id = ?");
        this.f61601f = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id IN (SELECT packet_id FROM table_tick_packet ORDER BY timestamp ASC LIMIT ?)");
    }

    static j2 a(String str, Context context) throws Exception {
        String str2 = String.format("mytracker_timespent_%s.db", str);
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
        if (sQLiteDatabaseOpenOrCreateDatabase == null) {
            throw new Exception("TimeSpentDataBaseSQL: context.openOrCreateDatabase failed");
        }
        if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 1) {
            sQLiteDatabaseOpenOrCreateDatabase.close();
            context.deleteDatabase(str2);
            sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            sQLiteDatabaseOpenOrCreateDatabase.setVersion(1);
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_tick_packet(packet_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, content BLOB NOT NULL)");
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_tick_packettimestamp ON table_tick_packet(timestamp)");
        }
        return new j2(sQLiteDatabaseOpenOrCreateDatabase);
    }

    b b(int i10) {
        this.f61596a[0] = String.valueOf(i10);
        return new b(this.f61597b.rawQuery("SELECT packet_id, timestamp, content FROM table_tick_packet ORDER BY timestamp DESC LIMIT ?", this.f61596a));
    }

    long a(long j10, byte[] bArr) {
        this.f61597b.beginTransaction();
        try {
            this.f61598c.clearBindings();
            this.f61598c.bindLong(1, j10);
            this.f61598c.bindBlob(2, bArr);
            long jExecuteInsert = this.f61598c.executeInsert();
            if (jExecuteInsert >= 0) {
                this.f61597b.setTransactionSuccessful();
                x2.a("TimeSpentDataBaseSQL: 1 tick packet (packetId = " + jExecuteInsert + ") inserted to database (reason: store tick packet)");
                return jExecuteInsert;
            }
            throw new Exception("TimeSpentDataBaseSQL: sql insert failed");
        } finally {
            this.f61597b.endTransaction();
        }
    }

    int a() {
        return (int) this.f61599d.simpleQueryForLong();
    }

    void a(long[] jArr) {
        this.f61597b.beginTransaction();
        try {
            int iA = 0;
            for (long j10 : jArr) {
                iA += a(j10);
            }
            x2.a("TimeSpentDataBaseSQL: " + iA + " tick packet(s) removed from database (reason: delete " + jArr.length + " tick packets)");
            this.f61597b.setTransactionSuccessful();
            this.f61597b.endTransaction();
        } catch (Throwable th2) {
            this.f61597b.endTransaction();
            throw th2;
        }
    }

    int a(int i10) {
        this.f61601f.clearBindings();
        this.f61601f.bindLong(1, i10);
        int iExecuteUpdateDelete = this.f61601f.executeUpdateDelete();
        x2.a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " oldest tick packet(s) removed from database (reason: delete " + i10 + " oldest tick packets)");
        return iExecuteUpdateDelete;
    }

    int a(long j10) {
        this.f61600e.clearBindings();
        this.f61600e.bindLong(1, j10);
        int iExecuteUpdateDelete = this.f61600e.executeUpdateDelete();
        x2.a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " tick packet removed from database (reason: delete tick packet with packetId = " + j10 + ")");
        return iExecuteUpdateDelete;
    }
}
