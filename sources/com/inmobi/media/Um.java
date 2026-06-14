package com.inmobi.media;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class Um implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f37868a;

    public Um(FlowCollector flowCollector) {
        this.f37868a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.inmobi.media.Tm
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.Tm r0 = (com.inmobi.media.Tm) r0
            int r1 = r0.f37797b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37797b = r1
            goto L18
        L13:
            com.inmobi.media.Tm r0 = new com.inmobi.media.Tm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f37796a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37797b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f37868a
            com.inmobi.media.Mn r5 = (com.inmobi.media.Mn) r5
            com.inmobi.media.Mn r2 = com.inmobi.media.Mn.f37388b
            if (r5 != r2) goto L3e
            r5 = r3
            goto L3f
        L3e:
            r5 = 0
        L3f:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            r0.f37797b = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Um.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
