package com.inmobi.media;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4125w7 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f39833a;

    public C4125w7(FlowCollector flowCollector) {
        this.f39833a = flowCollector;
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
            boolean r0 = r6 instanceof com.inmobi.media.C4100v7
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.v7 r0 = (com.inmobi.media.C4100v7) r0
            int r1 = r0.f39743b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39743b = r1
            goto L18
        L13:
            com.inmobi.media.v7 r0 = new com.inmobi.media.v7
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39742a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39743b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f39833a
            r2 = r5
            com.inmobi.media.Rl r2 = (com.inmobi.media.Rl) r2
            boolean r2 = r2 instanceof com.inmobi.media.Pl
            if (r2 == 0) goto L46
            r0.f39743b = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4125w7.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
