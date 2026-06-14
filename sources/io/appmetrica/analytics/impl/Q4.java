package io.appmetrica.analytics.impl;

import android.database.Cursor;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* JADX INFO: loaded from: classes12.dex */
public final class Q4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76291a = "sessions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76292b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76293c = "id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76294d = "start_time";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76295e = "report_request_parameters";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f76296f = "server_time_offset";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f76297g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f76298h = "obtained_before_first_sync";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B7 f76299i = new B7(null, 1, 0 == true ? 1 : 0);

    public final A7 a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f76293c)));
            int i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f76297g));
            EnumC4971al enumC4971al = EnumC4971al.FOREGROUND;
            boolean z10 = true;
            if (i10 != 0) {
                enumC4971al = EnumC4971al.BACKGROUND;
                if (i10 != 1) {
                    enumC4971al = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f76295e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f76294d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f76296f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f76298h)) != 1) {
                z10 = false;
            }
            return new A7(lValueOf, enumC4971al, string, new C5590z7(lValueOf2, lValueOf3, Boolean.valueOf(z10)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void runScript(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r11.f76291a     // Catch: java.lang.Throwable -> L5a
            int r2 = r11.f76292b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5b
        L19:
            boolean r3 = r12.moveToNext()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5e
            io.appmetrica.analytics.impl.A7 r3 = r11.a(r12)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L19
            java.lang.Long r4 = r3.f75497a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L19
            io.appmetrica.analytics.impl.al r4 = r3.f75498b     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            java.lang.String r4 = r3.f75499c     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L42
            goto L19
        L42:
            io.appmetrica.analytics.impl.z7 r4 = r3.f75500d     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r4 = r4.f78606a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.appmetrica.analytics.impl.B7 r4 = r11.f76299i     // Catch: java.lang.Throwable -> L5c
            android.content.ContentValues r3 = r4.fromModel(r3)     // Catch: java.lang.Throwable -> L5c
            r0.add(r3)     // Catch: java.lang.Throwable -> L5c
            goto L19
        L5a:
            r2 = r12
        L5b:
            r12 = r1
        L5c:
            if (r12 == 0) goto L61
        L5e:
            r12.close()
        L61:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r12.<init>(r3)
            java.lang.String r3 = r11.f76291a
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r2.execSQL(r12)
            java.lang.String r12 = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )"
            r2.execSQL(r12)
            java.util.Iterator r12 = r0.iterator()
        L7d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r12.next()
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.lang.String r3 = "sessions"
            r2.insertOrThrow(r3, r1, r0)     // Catch: java.lang.Throwable -> L7d
            goto L7d
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Q4.runScript(android.database.sqlite.SQLiteDatabase):void");
    }
}
