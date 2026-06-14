package com.inmobi.media;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3767hm implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f38722a;

    public C3767hm(FlowCollector flowCollector) {
        this.f38722a = flowCollector;
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
            boolean r0 = r7 instanceof com.inmobi.media.C3742gm
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.gm r0 = (com.inmobi.media.C3742gm) r0
            int r1 = r0.f38664b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38664b = r1
            goto L18
        L13:
            com.inmobi.media.gm r0 = new com.inmobi.media.gm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38663a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38664b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f38722a
            r2 = r6
            com.inmobi.media.Rl r2 = (com.inmobi.media.Rl) r2
            com.inmobi.media.in r4 = com.inmobi.media.C3792in.f38775a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 != 0) goto L45
            boolean r2 = r2 instanceof com.inmobi.media.Pl
            if (r2 == 0) goto L4e
        L45:
            r0.f38664b = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3767hm.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
