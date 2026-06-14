package com.fyber.inneractive.sdk.flow.nativead;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f20805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f20807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f20808d;

    public m(p pVar, i iVar, boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        this.f20808d = pVar;
        this.f20805a = iVar;
        this.f20806b = z10;
        this.f20807c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            r0 = 1
            com.fyber.inneractive.sdk.flow.nativead.p r1 = r8.f20808d
            com.fyber.inneractive.sdk.flow.nativead.i r2 = r8.f20805a
            boolean r3 = r8.f20806b
            com.fyber.inneractive.sdk.util.g r4 = r8.f20807c
            r1.getClass()
            java.lang.String r5 = r2.f20798a
            java.lang.String r6 = r2.f20799b
            boolean r7 = com.fyber.inneractive.sdk.util.v.a(r5)
            if (r7 == 0) goto L1c
            com.fyber.inneractive.sdk.flow.nativead.n r0 = new com.fyber.inneractive.sdk.flow.nativead.n
            r0.<init>(r1, r2, r6, r4)
            goto L28
        L1c:
            boolean r5 = com.fyber.inneractive.sdk.util.v.a(r6)
            if (r5 == 0) goto L34
            com.fyber.inneractive.sdk.flow.nativead.o r0 = new com.fyber.inneractive.sdk.flow.nativead.o
            r0.<init>(r1, r2, r4)
            r5 = r6
        L28:
            com.fyber.inneractive.sdk.flow.nativead.l r1 = r1.f20832a
            com.fyber.inneractive.sdk.flow.nativead.j r1 = (com.fyber.inneractive.sdk.flow.nativead.j) r1
            com.fyber.inneractive.sdk.flow.nativead.k r1 = r1.f20803b
            if (r1 == 0) goto L64
            r1.a(r5, r3, r4, r0)
            goto L64
        L34:
            com.fyber.inneractive.sdk.flow.nativead.l r1 = r1.f20832a
            com.fyber.inneractive.sdk.flow.nativead.j r1 = (com.fyber.inneractive.sdk.flow.nativead.j) r1
            com.fyber.inneractive.sdk.flow.nativead.i r3 = r1.f20802a
            if (r3 == 0) goto L55
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L43
            goto L55
        L43:
            com.fyber.inneractive.sdk.flow.nativead.p r2 = r1.f20804c
            com.fyber.inneractive.sdk.flow.nativead.i r1 = r1.f20802a
            r2.getClass()
            java.util.concurrent.ThreadPoolExecutor r3 = com.fyber.inneractive.sdk.util.r.f23895a
            com.fyber.inneractive.sdk.flow.nativead.m r5 = new com.fyber.inneractive.sdk.flow.nativead.m
            r5.<init>(r2, r1, r0, r4)
            r3.execute(r5)
            goto L64
        L55:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = com.fyber.inneractive.sdk.flow.nativead.j.f20801d
            r3 = 0
            r1[r3] = r2
            r1[r0] = r4
            java.lang.String r0 = "%s : No valid link object, origin: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r1)
        L64:
            com.fyber.inneractive.sdk.flow.nativead.p r0 = r8.f20808d
            com.fyber.inneractive.sdk.flow.nativead.i r1 = r8.f20805a
            r0.getClass()
            java.util.ArrayList r0 = r1.f20800c
            java.util.Iterator r0 = r0.iterator()
        L71:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            com.fyber.inneractive.sdk.network.z0.b(r1)
            goto L71
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.m.run():void");
    }
}
