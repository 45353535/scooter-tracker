package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class D4 extends SQLiteOpenHelper implements E7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static D4 f40539f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f40540g = " TEXT";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f40541h = " INTEGER";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f40542i = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E4 f40543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f40546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f40547e;

    static abstract class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f40548a = "events";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40549b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f40550c = "eventid";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f40551d = "timestamp";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f40552e = "type";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f40553f = "data";

        a() {
        }
    }

    public D4(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f40543a = new E4();
        this.f40544b = 4;
        this.f40545c = 400;
        this.f40546d = "DROP TABLE IF EXISTS events";
        this.f40547e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    public static synchronized D4 a(Context context, String str, int i10) {
        try {
            if (f40539f == null) {
                f40539f = new D4(context, str, i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40539f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: all -> 0x0018, DONT_GENERATE, PHI: r1
  0x0034: PHI (r1v3 android.database.sqlite.SQLiteDatabase) = (r1v2 android.database.sqlite.SQLiteDatabase), (r1v4 android.database.sqlite.SQLiteDatabase) binds: [B:19:0x0032, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:20:0x0034, B:18:0x002e, B:25:0x003c, B:27:0x0042, B:28:0x0045, B:16:0x001e), top: B:31:0x0001, inners: #1 }] */
    @Override // com.ironsource.E7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "type = ?"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L18
            r1 = 1
            android.database.sqlite.SQLiteDatabase r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "events"
            r1.delete(r2, r0, r4)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r1.isOpen()     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L37
            goto L34
        L18:
            r4 = move-exception
            goto L46
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            r4 = move-exception
            r1 = 0
        L1e:
            com.ironsource.o4 r0 = com.ironsource.C4462o4.d()     // Catch: java.lang.Throwable -> L39
            r0.a(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "IronSource"
            java.lang.String r2 = "Exception while clearing events: "
            android.util.Log.e(r0, r2, r4)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L37
            boolean r4 = r1.isOpen()     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L37
        L34:
            r1.close()     // Catch: java.lang.Throwable -> L18
        L37:
            monitor-exit(r3)
            return
        L39:
            r4 = move-exception
            if (r1 == 0) goto L45
            boolean r0 = r1.isOpen()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L45
            r1.close()     // Catch: java.lang.Throwable -> L18
        L45:
            throw r4     // Catch: java.lang.Throwable -> L18
        L46:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.D4.b(java.lang.String):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    @Override // com.ironsource.E7
    public synchronized void a(List<C4649z5> list, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabaseA = a(true);
                    try {
                        Iterator<C4649z5> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesA = a(it.next(), str);
                            if (sQLiteDatabaseA != null && contentValuesA != null) {
                                sQLiteDatabaseA.insert("events", null, contentValuesA);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            C4462o4.d().a(th);
                            Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseA = sQLiteDatabase;
                            }
                        } catch (Throwable th3) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[Catch: all -> 0x006f, PHI: r3
  0x009d: PHI (r3v2 android.database.sqlite.SQLiteDatabase) = (r3v1 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:41:0x009b, B:30:0x0076] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x006f, blocks: (B:3:0x0001, B:24:0x0065, B:26:0x006b, B:29:0x0072, B:42:0x009d, B:36:0x008c, B:38:0x0092, B:40:0x0097, B:48:0x00a6, B:50:0x00ac, B:52:0x00b1, B:54:0x00b7, B:55:0x00ba, B:34:0x007c), top: B:64:0x0001, inners: #0 }] */
    @Override // com.ironsource.E7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.ArrayList<com.ironsource.C4649z5> a(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.a(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "type = ?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L5f
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r8 = 0
            r9 = 0
            r5 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5f
            int r12 = r2.getCount()     // Catch: java.lang.Throwable -> L5f
            if (r12 <= 0) goto L65
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L5f
        L26:
            boolean r12 = r2.isAfterLast()     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L62
            java.lang.String r12 = "eventid"
            int r12 = r2.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L5f
            if (r12 >= 0) goto L35
            goto L26
        L35:
            int r12 = r2.getInt(r12)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "timestamp"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 >= 0) goto L42
            goto L26
        L42:
            long r4 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "data"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 >= 0) goto L4f
            goto L26
        L4f:
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L5f
            com.ironsource.z5 r6 = new com.ironsource.z5     // Catch: java.lang.Throwable -> L5f
            r6.<init>(r12, r4, r0)     // Catch: java.lang.Throwable -> L5f
            r1.add(r6)     // Catch: java.lang.Throwable -> L5f
            r2.moveToNext()     // Catch: java.lang.Throwable -> L5f
            goto L26
        L5f:
            r0 = move-exception
            r12 = r0
            goto L7c
        L62:
            r2.close()     // Catch: java.lang.Throwable -> L5f
        L65:
            boolean r12 = r2.isClosed()     // Catch: java.lang.Throwable -> L6f
            if (r12 != 0) goto L72
            r2.close()     // Catch: java.lang.Throwable -> L6f
            goto L72
        L6f:
            r0 = move-exception
            r12 = r0
            goto Lbb
        L72:
            boolean r12 = r3.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto La0
            goto L9d
        L79:
            r0 = move-exception
            r12 = r0
            r3 = r2
        L7c:
            com.ironsource.o4 r0 = com.ironsource.C4462o4.d()     // Catch: java.lang.Throwable -> La2
            r0.a(r12)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "IronSource"
            java.lang.String r4 = "Exception while loading events: "
            android.util.Log.e(r0, r4, r12)     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L95
            boolean r12 = r2.isClosed()     // Catch: java.lang.Throwable -> L6f
            if (r12 != 0) goto L95
            r2.close()     // Catch: java.lang.Throwable -> L6f
        L95:
            if (r3 == 0) goto La0
            boolean r12 = r3.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto La0
        L9d:
            r3.close()     // Catch: java.lang.Throwable -> L6f
        La0:
            monitor-exit(r11)
            return r1
        La2:
            r0 = move-exception
            r12 = r0
            if (r2 == 0) goto Laf
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto Laf
            r2.close()     // Catch: java.lang.Throwable -> L6f
        Laf:
            if (r3 == 0) goto Lba
            boolean r0 = r3.isOpen()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto Lba
            r3.close()     // Catch: java.lang.Throwable -> L6f
        Lba:
            throw r12     // Catch: java.lang.Throwable -> L6f
        Lbb:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6f
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.D4.a(java.lang.String):java.util.ArrayList");
    }

    private ContentValues a(C4649z5 c4649z5, String str) {
        if (c4649z5 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c4649z5.c()));
        contentValues.put("timestamp", Long.valueOf(c4649z5.d()));
        contentValues.put("type", str);
        contentValues.put("data", c4649z5.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z10) throws Throwable {
        int i10 = 0;
        while (true) {
            try {
                if (z10) {
                    return this.f40543a.a(true, this);
                }
                return this.f40543a.a(false, this);
            } finally {
            }
        }
    }
}
