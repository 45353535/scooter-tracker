package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4953a3 implements IBinaryDataHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F6 f76777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76778b;

    public C4953a3(@NonNull F6 f62, @NonNull String str) {
        this.f76777a = f62;
        this.f76778b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[Catch: all -> 0x0045, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0045, blocks: (B:7:0x001b, B:9:0x0022, B:11:0x0028, B:15:0x003d), top: B:27:0x001b }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] get(@androidx.annotation.NonNull java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            io.appmetrica.analytics.impl.F6 r1 = r10.f76777a     // Catch: java.lang.Throwable -> L43
            android.database.sqlite.SQLiteDatabase r2 = r1.a()     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L41
            java.lang.String r3 = r10.f76778b     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "data_key = ?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L41
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L41
            if (r11 == 0) goto L3b
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L45
            r3 = 1
            if (r1 != r3) goto L3b
            boolean r1 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L3b
            java.lang.String r1 = "value"
            int r1 = r11.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L45
            byte[] r0 = r11.getBlob(r1)     // Catch: java.lang.Throwable -> L45
            io.appmetrica.analytics.impl.no.a(r11)
            io.appmetrica.analytics.impl.F6 r11 = r10.f76777a
            r11.a(r2)
            return r0
        L3b:
            if (r11 == 0) goto L45
            r11.getCount()     // Catch: java.lang.Throwable -> L45
            goto L45
        L41:
            r11 = r0
            goto L45
        L43:
            r11 = r0
            r2 = r11
        L45:
            io.appmetrica.analytics.impl.no.a(r11)
            io.appmetrica.analytics.impl.F6 r11 = r10.f76777a
            r11.a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4953a3.get(java.lang.String):byte[]");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(@NonNull String str, @NonNull byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.f76777a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseA.insertWithOnConflict(this.f76778b, null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f76777a.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(@NonNull String str) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f76777a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseA.delete(this.f76778b, "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f76777a.a(sQLiteDatabaseA);
    }
}
