package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3729g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4152x9 f38622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3824k5 f38623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f38624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SQLiteDatabase f38625d;

    public C3729g9(C4152x9 sqLiteOpenHelper, C3824k5 databaseConfig) {
        Intrinsics.checkNotNullParameter(sqLiteOpenHelper, "sqLiteOpenHelper");
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.f38622a = sqLiteOpenHelper;
        this.f38623b = databaseConfig;
    }

    public final Object a(String str, ContentValues contentValues, int i10, kotlin.coroutines.jvm.internal.d dVar) {
        Object objA = a(new C3703f9(this, new C3652d9(str, contentValues, i10, null), null), dVar);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static Object a(C3729g9 c3729g9, String str, ContentValues contentValues, String str2, String[] strArr, kotlin.coroutines.jvm.internal.d dVar, int i10) {
        String str3 = (i10 & 4) != 0 ? null : str2;
        String[] strArr2 = (i10 & 8) != 0 ? null : strArr;
        c3729g9.getClass();
        Object objA = c3729g9.a(new C3703f9(c3729g9, new C3677e9(str, contentValues, str3, strArr2, null), null), dVar);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static /* synthetic */ Object a(C3729g9 c3729g9, String str, String str2, kotlin.coroutines.jvm.internal.d dVar, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3729g9.a(str, str2, (String[]) null, dVar);
    }

    public final Object a(String str, String str2, String[] strArr, Continuation continuation) {
        Object objA = a(new C3703f9(this, new Z8(str, str2, strArr, null), null), continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) {
        Object objA = a(new C3703f9(this, new C3574a9(str, null), null), dVar);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3600b9
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.b9 r0 = (com.inmobi.media.C3600b9) r0
            int r1 = r0.f38257d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38257d = r1
            goto L18
        L13:
            com.inmobi.media.b9 r0 = new com.inmobi.media.b9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f38255b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38257d
            r3 = 2
            if (r2 == 0) goto L3d
            r5 = 1
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.jvm.functions.Function1 r5 = r0.f38254a
            kotlin.d.b(r6)
            if (r6 != 0) goto L3c
            goto L40
        L3c:
            return r6
        L3d:
            kotlin.d.b(r6)
        L40:
            r6 = 0
            r0.f38254a = r6
            r0.f38257d = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3729g9.a(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
