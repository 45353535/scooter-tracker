package com.inmobi.media;

import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3663dk extends AbstractC3649d6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3729g9 f38464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3663dk(C3729g9 databaseHelper) {
        super(TelemetryCategory.TELEMETRY, databaseHelper);
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f38464c = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3649d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3637ck
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ck r0 = (com.inmobi.media.C3637ck) r0
            int r1 = r0.f38406c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38406c = r1
            goto L18
        L13:
            com.inmobi.media.ck r0 = new com.inmobi.media.ck
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f38404a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38406c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r9)
            goto L59
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.d.b(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM telemetry ORDER BY ts ASC LIMIT "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.inmobi.media.g9 r9 = r7.f38464c
            r0.f38406c = r3
            r9.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r3 = 0
            r2.<init>(r9, r8, r3)
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r0)
            r8.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L6a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r9.next()
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.lang.String r1 = "contentValues"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "eventType"
            java.lang.String r1 = r0.getAsString(r1)
            java.lang.String r2 = "payload"
            java.lang.String r2 = r0.getAsString(r2)
            java.lang.String r3 = "eventSource"
            java.lang.String r3 = r0.getAsString(r3)
            java.lang.String r4 = "ts"
            java.lang.String r4 = r0.getAsString(r4)
            java.lang.String r5 = "getAsString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            long r4 = java.lang.Long.parseLong(r4)
            com.inmobi.media.ek r6 = new com.inmobi.media.ek
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r6.<init>(r1, r2, r3)
            r6.f38736c = r4
            java.lang.String r1 = "id"
            java.lang.Integer r0 = r0.getAsInteger(r1)
            java.lang.String r1 = "getAsInteger(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = r0.intValue()
            r6.f38737d = r0
            r8.add(r6)
            goto L6a
        Lbe:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3663dk.b(int, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
