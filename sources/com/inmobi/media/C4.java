package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3729g9 f36655a;

    public C4(C3729g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f36655a = databaseHelper;
    }

    public final Object a(int i10, long j10, J4 j42) {
        Object objA = this.f36655a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j10 + " ORDER BY timestamp DESC LIMIT " + i10 + ") foo);", j42);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.A4
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.A4 r0 = (com.inmobi.media.A4) r0
            int r1 = r0.f36550c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36550c = r1
            goto L18
        L13:
            com.inmobi.media.A4 r0 = new com.inmobi.media.A4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f36548a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36550c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.d.b(r7)
            com.inmobi.media.g9 r7 = r6.f36655a
            r0.f36550c = r3
            r7.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r3 = 0
            java.lang.String r4 = "SELECT * FROM c_data"
            r2.<init>(r7, r4, r3)
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L5b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r7.next()
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.inmobi.media.W5 r2 = new com.inmobi.media.W5
            java.lang.String r3 = "e_data"
            java.lang.String r3 = r1.getAsString(r3)
            java.lang.String r4 = "getAsString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r4 = "timestamp"
            java.lang.Long r1 = r1.getAsLong(r4)
            java.lang.String r4 = "getAsLong(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            long r4 = r1.longValue()
            r2.<init>(r3, r4)
            r0.add(r2)
            goto L5b
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
