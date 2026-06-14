package com.appodeal.ads.services.adjust.collector;

import com.adjust.sdk.AdjustAttribution;
import com.appodeal.ads.ext.LogExtKt;
import hg.l0;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f14541a = l0.a(new a(new AdjustAttribution(), new String()));

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r7, com.appodeal.ads.modules.common.internal.service.InitializationMode r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.services.adjust.collector.c
            if (r0 == 0) goto L13
            r0 = r9
            com.appodeal.ads.services.adjust.collector.c r0 = (com.appodeal.ads.services.adjust.collector.c) r0
            int r1 = r0.f14536u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14536u = r1
            goto L18
        L13:
            com.appodeal.ads.services.adjust.collector.c r0 = new com.appodeal.ads.services.adjust.collector.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f14534s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14536u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.appodeal.ads.services.adjust.collector.e r7 = r0.f14533r
            kotlin.d.b(r9)
            goto L8b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.d.b(r9)
            java.lang.String r9 = "Reading attribution data"
            r2 = 4
            java.lang.String r4 = "AdjustService"
            r5 = 0
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r4, r9, r5, r2, r5)
            r0.f14533r = r6
            r0.f14536u = r3
            int[] r9 = com.appodeal.ads.services.adjust.util.d.f14567a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r3) goto L65
            r9 = 2
            if (r8 != r9) goto L5f
            kotlinx.coroutines.CoroutineDispatcher r8 = eg.o0.b()
            com.appodeal.ads.services.adjust.util.f r9 = new com.appodeal.ads.services.adjust.util.f
            r9.<init>(r7, r5)
            java.lang.Object r7 = eg.g.g(r8, r9, r0)
        L5d:
            r9 = r7
            goto L87
        L5f:
            lf.m r7 = new lf.m
            r7.<init>()
            throw r7
        L65:
            kotlinx.coroutines.e r7 = new kotlinx.coroutines.e
            kotlin.coroutines.Continuation r8 = pf.b.d(r0)
            r7.<init>(r8, r3)
            r7.I()
            com.appodeal.ads.services.adjust.util.e r8 = new com.appodeal.ads.services.adjust.util.e
            r8.<init>(r7)
            com.adjust.sdk.Adjust.getAttribution(r8)
            java.lang.Object r7 = r7.C()
            java.lang.Object r8 = pf.b.g()
            if (r7 != r8) goto L5d
            kotlin.coroutines.jvm.internal.g.c(r0)
            goto L5d
        L87:
            if (r9 != r1) goto L8a
            return r1
        L8a:
            r7 = r6
        L8b:
            com.adjust.sdk.AdjustAttribution r9 = (com.adjust.sdk.AdjustAttribution) r9
            if (r9 == 0) goto L92
            r7.b(r9)
        L92:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.adjust.collector.e.a(android.content.Context, com.appodeal.ads.modules.common.internal.service.InitializationMode, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void b(AdjustAttribution adjustAttribution) {
        LogExtKt.logInternal$default("AdjustService", "Attribution received: " + adjustAttribution, null, 4, null);
        if (adjustAttribution != null) {
            e(adjustAttribution);
        }
    }

    public final void c(String str) {
        Object value;
        LogExtKt.logInternal$default("AdjustService", "Setting attribution id: " + str, null, 4, null);
        MutableStateFlow mutableStateFlow = this.f14541a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, new a(((a) value).b(), str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r7, com.appodeal.ads.modules.common.internal.service.InitializationMode r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.services.adjust.collector.d
            if (r0 == 0) goto L13
            r0 = r9
            com.appodeal.ads.services.adjust.collector.d r0 = (com.appodeal.ads.services.adjust.collector.d) r0
            int r1 = r0.f14540u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14540u = r1
            goto L18
        L13:
            com.appodeal.ads.services.adjust.collector.d r0 = new com.appodeal.ads.services.adjust.collector.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f14538s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14540u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.appodeal.ads.services.adjust.collector.e r7 = r0.f14537r
            kotlin.d.b(r9)
            goto L8b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.d.b(r9)
            java.lang.String r9 = "Reading attribution id"
            r2 = 4
            java.lang.String r4 = "AdjustService"
            r5 = 0
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r4, r9, r5, r2, r5)
            r0.f14537r = r6
            r0.f14540u = r3
            int[] r9 = com.appodeal.ads.services.adjust.util.a.f14563a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r3) goto L65
            r9 = 2
            if (r8 != r9) goto L5f
            kotlinx.coroutines.CoroutineDispatcher r8 = eg.o0.b()
            com.appodeal.ads.services.adjust.util.c r9 = new com.appodeal.ads.services.adjust.util.c
            r9.<init>(r7, r5)
            java.lang.Object r7 = eg.g.g(r8, r9, r0)
        L5d:
            r9 = r7
            goto L87
        L5f:
            lf.m r7 = new lf.m
            r7.<init>()
            throw r7
        L65:
            kotlinx.coroutines.e r7 = new kotlinx.coroutines.e
            kotlin.coroutines.Continuation r8 = pf.b.d(r0)
            r7.<init>(r8, r3)
            r7.I()
            com.appodeal.ads.services.adjust.util.b r8 = new com.appodeal.ads.services.adjust.util.b
            r8.<init>(r7)
            com.adjust.sdk.Adjust.getAdid(r8)
            java.lang.Object r7 = r7.C()
            java.lang.Object r8 = pf.b.g()
            if (r7 != r8) goto L5d
            kotlin.coroutines.jvm.internal.g.c(r0)
            goto L5d
        L87:
            if (r9 != r1) goto L8a
            return r1
        L8a:
            r7 = r6
        L8b:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L92
            r7.c(r9)
        L92:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.adjust.collector.e.d(android.content.Context, com.appodeal.ads.modules.common.internal.service.InitializationMode, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void e(AdjustAttribution adjustAttribution) {
        Object value;
        LogExtKt.logInternal$default("AdjustService", "Setting attribution: " + adjustAttribution, null, 4, null);
        MutableStateFlow mutableStateFlow = this.f14541a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, new a(adjustAttribution, ((a) value).c())));
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public final void onAttributionChanged(AdjustAttribution adjustAttribution) {
        LogExtKt.logInternal$default("AdjustService", "Attribution changed: " + adjustAttribution, null, 4, null);
        b(adjustAttribution);
    }
}
