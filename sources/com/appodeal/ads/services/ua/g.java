package com.appodeal.ads.services.ua;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements FlowCollector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f14771b;

    public g(FlowCollector flowCollector) {
        this.f14771b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appodeal.ads.services.ua.f
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.ads.services.ua.f r0 = (com.appodeal.ads.services.ua.f) r0
            int r1 = r0.f14769s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14769s = r1
            goto L18
        L13:
            com.appodeal.ads.services.ua.f r0 = new com.appodeal.ads.services.ua.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f14768r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14769s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L62
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f14771b
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
            r2.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r6.next()
            com.appodeal.ads.services.ua.a r4 = (com.appodeal.ads.services.ua.a) r4
            java.lang.String r4 = r4.f14755a
            r2.add(r4)
            goto L47
        L59:
            r0.f14769s = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.ua.g.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
