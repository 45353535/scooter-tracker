package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5428sk implements Pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo f78242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78243b = "startup_state";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AESEncrypter f78244c;

    public C5428sk(@NotNull yo yoVar) {
        this.f78242a = yoVar;
        C4949a c4949a = new C4949a(C5468ua.k().g());
        this.f78244c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4949a.b(), c4949a.a());
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = C5112g7.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Hb hbA = a(readableDatabase);
                C5281mm c5281mm = new C5281mm(new C5412s4(new C5363q4()));
                if (hbA != null) {
                    a(this.f78242a, c5281mm, hbA);
                    c5281mm.f77785p = hbA.f75858c;
                    c5281mm.f77787r = hbA.f75857b;
                }
                C5306nm c5306nm = new C5306nm(c5281mm);
                Vm vm = (Vm) Tm.a(C5306nm.class);
                vm.a(context, vm.b(context)).save(c5306nm);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(yo yoVar, C5281mm c5281mm, Hb hb2) {
        String strOptStringOrNull;
        synchronized (yoVar) {
            strOptStringOrNull = JsonUtils.optStringOrNull(yoVar.f78594a.a(), "device_id");
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(hb2.f75859d)) {
                yoVar.a(hb2.f75859d);
            }
            if (!TextUtils.isEmpty(hb2.f75860e)) {
                yoVar.b(hb2.f75860e);
            }
            if (TextUtils.isEmpty(hb2.f75856a)) {
                return;
            }
            c5281mm.f77770a = hb2.f75856a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:5:0x001b, B:7:0x0022, B:9:0x0028, B:13:0x0047), top: B:21:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Hb a(android.database.sqlite.SQLiteDatabase r11) {
        /*
            r10 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "binary_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "data_key = ?"
            java.lang.String r2 = r10.f78243b     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r6 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L4b
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L45
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> L4c
            r3 = 1
            if (r2 != r3) goto L45
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L45
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r11.getBlob(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r2 = r10.f78244c     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r2.decrypt(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.Hb r2 = new io.appmetrica.analytics.impl.Hb     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.protobuf.nano.MessageNano r0 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r2, r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.Hb r0 = (io.appmetrica.analytics.impl.Hb) r0     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r0
        L45:
            if (r11 == 0) goto L4c
            r11.getCount()     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L4b:
            r11 = r1
        L4c:
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5428sk.a(android.database.sqlite.SQLiteDatabase):io.appmetrica.analytics.impl.Hb");
    }
}
