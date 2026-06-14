package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.ironsource.C4240b4;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5594zb implements Oa, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f78611a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f78612b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78613c = "preferences";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5569yb f78614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f78615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F6 f78616f;

    public C5594zb(F6 f62) {
        this.f78616f = f62;
        C5569yb c5569yb = new C5569yb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(Gd.a())));
        this.f78614d = c5569yb;
        c5569yb.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(io.appmetrica.analytics.impl.C5594zb r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.F6 r4 = r13.f78616f     // Catch: java.lang.Throwable -> L84
            android.database.sqlite.SQLiteDatabase r5 = r4.a()     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L85
            java.lang.String r6 = r13.f78613c     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L85
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L85
        L21:
            boolean r6 = r4.moveToNext()     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L82
            int r6 = r4.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L82
            int r7 = r4.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = r4.getString(r7)     // Catch: java.lang.Throwable -> L82
            int r8 = r4.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L82
            int r8 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L82
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L82
            if (r9 != 0) goto L21
            r9 = 1
            if (r8 == r9) goto L65
            r9 = 2
            if (r8 == r9) goto L60
            r9 = 3
            if (r8 == r9) goto L5b
            r9 = 4
            if (r8 == r9) goto L7a
            r9 = 5
            if (r8 == r9) goto L56
        L54:
            r7 = r3
            goto L7a
        L56:
            java.lang.Float r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L5b:
            java.lang.Long r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L60:
            java.lang.Integer r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L65:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto L70
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L82
            goto L7a
        L70:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L54
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L82
        L7a:
            if (r7 == 0) goto L21
            java.util.HashMap r8 = r13.f78611a     // Catch: java.lang.Throwable -> L82
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L82
            goto L21
        L82:
            r3 = r4
            goto L85
        L84:
            r5 = r3
        L85:
            io.appmetrica.analytics.impl.no.a(r3)
            io.appmetrica.analytics.impl.F6 r13 = r13.f78616f
            r13.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5594zb.a(io.appmetrica.analytics.impl.zb):void");
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b() {
        synchronized (this.f78614d) {
            this.f78614d.notifyAll();
        }
    }

    public final void c() {
        if (this.f78615e) {
            return;
        }
        try {
            this.f78611a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f78614d.isRunning()) {
            this.f78614d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z10;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final int getInt(String str, int i10) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i10;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final long getLong(String str, long j10) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j10;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa remove(String str) {
        synchronized (this.f78611a) {
            c();
            this.f78611a.remove(str);
        }
        synchronized (this.f78614d) {
            this.f78612b.put(str, this);
            this.f78614d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f78611a) {
            c();
            obj = this.f78611a.get(str);
        }
        return obj;
    }

    public static void a(C5594zb c5594zb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseA;
        c5594zb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put(C4240b4.i.W, str);
            if (value == c5594zb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i10] = contentValues;
            i10++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c5594zb.f78616f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i11 = 0; i11 < size; i11++) {
                        ContentValues contentValues2 = contentValuesArr[i11];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(c5594zb.f78613c, "key = ?", new String[]{contentValues2.getAsString(C4240b4.i.W)});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(c5594zb.f78613c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c5594zb.f78616f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(int i10, String str) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f78611a) {
            c();
            zContainsKey = this.f78611a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f78611a) {
            hashSet = new HashSet(this.f78611a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f78611a) {
            c();
            this.f78611a.put(str, obj);
        }
        synchronized (this.f78614d) {
            this.f78612b.put(str, obj);
            this.f78614d.notifyAll();
        }
    }
}
