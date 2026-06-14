package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3935og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3729g9 f39203a;

    public C3935og(C3729g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f39203a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Integer r5, java.lang.String r6, long r7, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3910ng
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ng r0 = (com.inmobi.media.C3910ng) r0
            int r1 = r0.f39108c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39108c = r1
            goto L18
        L13:
            com.inmobi.media.ng r0 = new com.inmobi.media.ng
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f39106a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39108c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r9)
            goto L84
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r9)
            if (r5 == 0) goto L4d
            int r5 = r5.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = " LIMIT "
            r9.append(r2)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            if (r5 != 0) goto L4f
        L4d:
            java.lang.String r5 = ""
        L4f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r9.append(r2)
            r9.append(r6)
            java.lang.String r6 = "' AND retry_count=0 AND time_created<"
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = " ORDER BY time_created ASC"
            r9.append(r6)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.inmobi.media.g9 r6 = r4.f39203a
            r0.f39108c = r3
            r6.getClass()
            com.inmobi.media.c9 r7 = new com.inmobi.media.c9
            r8 = 0
            r7.<init>(r6, r5, r8)
            java.lang.Object r9 = r6.a(r7, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r9.iterator()
        L95:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La9
            java.lang.Object r7 = r6.next()
            android.content.ContentValues r7 = (android.content.ContentValues) r7
            com.inmobi.media.Rf r7 = com.inmobi.media.AbstractC3960pg.a(r7)
            r5.add(r7)
            goto L95
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3935og.a(java.lang.Integer, java.lang.String, long, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Object b(String str, kotlin.coroutines.jvm.internal.d dVar) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        C3729g9 c3729g9 = this.f39203a;
        c3729g9.getClass();
        return c3729g9.a(new Y8(c3729g9, str2, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.Integer r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3885mg
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.mg r0 = (com.inmobi.media.C3885mg) r0
            int r1 = r0.f39039c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39039c = r1
            goto L18
        L13:
            com.inmobi.media.mg r0 = new com.inmobi.media.mg
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f39037a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39039c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r9)
            goto L88
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.d.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto L51
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = " LIMIT "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            if (r8 != 0) goto L53
        L51:
            java.lang.String r8 = ""
        L53:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r9.append(r2)
            r9.append(r7)
            java.lang.String r7 = "' AND retry_count>=1 AND retryAfter<="
            r9.append(r7)
            r9.append(r4)
            java.lang.String r7 = " ORDER BY time_created ASC"
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            com.inmobi.media.g9 r8 = r6.f39203a
            r0.f39039c = r3
            r8.getClass()
            com.inmobi.media.c9 r9 = new com.inmobi.media.c9
            r2 = 0
            r9.<init>(r8, r7, r2)
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L88
            return r1
        L88:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L99:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lad
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            com.inmobi.media.Rf r9 = com.inmobi.media.AbstractC3960pg.a(r9)
            r7.add(r9)
            goto L99
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3935og.b(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.Integer r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3860lg
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.lg r0 = (com.inmobi.media.C3860lg) r0
            int r1 = r0.f38983c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38983c = r1
            goto L18
        L13:
            com.inmobi.media.lg r0 = new com.inmobi.media.lg
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f38981a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38983c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r9)
            goto L88
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.d.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto L51
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = " LIMIT "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            if (r8 != 0) goto L53
        L51:
            java.lang.String r8 = ""
        L53:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r9.append(r2)
            r9.append(r7)
            java.lang.String r7 = "' AND retryAfter<="
            r9.append(r7)
            r9.append(r4)
            java.lang.String r7 = " ORDER BY time_created ASC"
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            com.inmobi.media.g9 r8 = r6.f39203a
            r0.f38983c = r3
            r8.getClass()
            com.inmobi.media.c9 r9 = new com.inmobi.media.c9
            r2 = 0
            r9.<init>(r8, r7, r2)
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L88
            return r1
        L88:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L99:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lad
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            com.inmobi.media.Rf r9 = com.inmobi.media.AbstractC3960pg.a(r9)
            r7.add(r9)
            goto L99
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3935og.a(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.C3835kg
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.kg r0 = (com.inmobi.media.C3835kg) r0
            int r1 = r0.f38887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38887d = r1
            goto L18
        L13:
            com.inmobi.media.kg r0 = new com.inmobi.media.kg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38885b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38887d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.inmobi.media.Rf r6 = r0.f38884a
            kotlin.d.b(r7)
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.d.b(r7)
            goto L67
        L3a:
            kotlin.d.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "SELECT * FROM pings WHERE priority='"
            r7.append(r2)
            r7.append(r6)
            java.lang.String r6 = "' ORDER BY time_created ASC LIMIT 1"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.inmobi.media.g9 r7 = r5.f39203a
            r0.f38887d = r4
            r7.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r4 = 0
            r2.<init>(r7, r6, r4)
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L67
            goto Laa
        L67:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r2)
            r6.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r7.next()
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            com.inmobi.media.Rf r2 = com.inmobi.media.AbstractC3960pg.a(r2)
            r6.add(r2)
            goto L78
        L8c:
            java.lang.Object r6 = kotlin.collections.CollectionsKt.firstOrNull(r6)
            com.inmobi.media.Rf r6 = (com.inmobi.media.Rf) r6
            if (r6 == 0) goto Lab
            com.inmobi.media.g9 r7 = r5.f39203a
            java.lang.String r2 = r6.f37659b
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r0.f38884a = r6
            r0.f38887d = r3
            java.lang.String r3 = "pings"
            java.lang.String r4 = "id=?"
            java.lang.Object r7 = r7.a(r3, r4, r2, r0)
            if (r7 != r1) goto Lab
        Laa:
            return r1
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3935og.a(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Object a(long j10, kotlin.coroutines.jvm.internal.d dVar) {
        String strValueOf = String.valueOf(System.currentTimeMillis() - j10);
        Object objA = C3729g9.a(this.f39203a, "pings", "time_created<" + strValueOf, dVar, 4);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
