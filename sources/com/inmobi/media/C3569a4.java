package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3569a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3729g9 f38146a;

    public C3569a4(C3729g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f38146a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.media.Z3
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.Z3 r0 = (com.inmobi.media.Z3) r0
            int r1 = r0.f38094c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38094c = r1
            goto L18
        L13:
            com.inmobi.media.Z3 r0 = new com.inmobi.media.Z3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f38092a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38094c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.d.b(r8)
            goto L4a
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            kotlin.d.b(r8)
            com.inmobi.media.g9 r8 = r7.f38146a
            r0.f38094c = r3
            r8.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            java.lang.String r3 = "SELECT * FROM config_db"
            r2.<init>(r8, r3, r4)
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            r0.toString()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L5b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r8.next()
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "config_value"
            java.lang.String r2 = r1.getAsString(r2)
            java.lang.String r3 = "update_ts"
            java.lang.Long r3 = r1.getAsLong(r3)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb2
            r5.<init>(r2)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "config_type"
            java.lang.String r1 = r1.getAsString(r2)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "getAsString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Exception -> Lb2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Exception -> Lb2
            long r2 = r3.longValue()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "configType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)     // Catch: java.lang.Exception -> Lb2
            java.lang.Class r1 = com.inmobi.media.AbstractC4047t4.a(r1)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "jsonObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r5 = com.inmobi.media.AbstractC3879ma.a(r5, r1, r4, r4)     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r1 = r1.cast(r5)     // Catch: java.lang.Exception -> Lb2
            com.inmobi.media.core.config.models.Config r1 = (com.inmobi.media.core.config.models.Config) r1     // Catch: java.lang.Exception -> Lb2
            if (r1 == 0) goto Lb2
            r1.setLastUpdateTimeStamp(r2)     // Catch: java.lang.Exception -> Lb2
            goto Lb3
        Lb2:
            r1 = r4
        Lb3:
            java.lang.String.valueOf(r1)
            if (r1 == 0) goto L5b
            r0.add(r1)
            goto L5b
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3569a4.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
