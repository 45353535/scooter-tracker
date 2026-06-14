package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class N9 extends AbstractC3649d6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3729g9 f37429c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(C3729g9 databaseHelper) {
        super("crash", databaseHelper);
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f37429c = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3649d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r9, kotlin.coroutines.jvm.internal.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.inmobi.media.M9
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.M9 r0 = (com.inmobi.media.M9) r0
            int r1 = r0.f37359c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37359c = r1
            goto L18
        L13:
            com.inmobi.media.M9 r0 = new com.inmobi.media.M9
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f37357a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37359c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r10)
            goto L59
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.d.b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "SELECT * FROM crash ORDER BY ts ASC LIMIT "
            r10.append(r2)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.inmobi.media.g9 r10 = r8.f37429c
            r0.f37359c = r3
            r10.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r3 = 0
            r2.<init>(r10, r9, r3)
            java.lang.Object r10 = r10.a(r2, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r0)
            r9.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L6a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r10.next()
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.lang.String r1 = "contentValues"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "eventId"
            java.lang.String r1 = r0.getAsString(r1)
            java.lang.String r2 = "eventType"
            java.lang.String r2 = r0.getAsString(r2)
            java.lang.String r3 = "componentType"
            java.lang.String r3 = r0.getAsString(r3)
            java.lang.String r4 = "payload"
            java.lang.String r4 = r0.getAsString(r4)
            java.lang.String r5 = "ts"
            java.lang.String r5 = r0.getAsString(r5)
            java.lang.String r6 = "getAsString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            long r5 = java.lang.Long.parseLong(r5)
            com.inmobi.media.Q9 r7 = new com.inmobi.media.Q9
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r7.<init>(r1, r3, r2, r4)
            r7.f38736c = r5
            java.lang.String r1 = "id"
            java.lang.Integer r0 = r0.getAsInteger(r1)
            java.lang.String r1 = "getAsInteger(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = r0.intValue()
            r7.f38737d = r0
            r9.add(r7)
            goto L6a
        Lc7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N9.b(int, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
