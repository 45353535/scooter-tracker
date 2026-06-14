package com.appodeal.ads.utils.session;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f15116s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f15116s = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f15116s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.f15116s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:12:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r9.f15115r
            r2 = 4
            java.lang.String r3 = "SessionReporter"
            java.lang.String r4 = " ms"
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L1d
            if (r1 != r5) goto L15
            kotlin.d.b(r10)
            goto L4c
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            kotlin.d.b(r10)
        L20:
            com.appodeal.ads.utils.session.w r10 = r9.f15116s
            long r7 = com.appodeal.ads.utils.session.w.b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Session report timer started with "
            r10.append(r1)
            r10.append(r7)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r3, r10, r6, r2, r6)
            com.appodeal.ads.utils.session.w r10 = r9.f15116s
            long r7 = com.appodeal.ads.utils.session.w.b(r10)
            r9.f15115r = r5
            java.lang.Object r10 = eg.k0.a(r7, r9)
            if (r10 != r0) goto L4c
            return r0
        L4c:
            com.appodeal.ads.utils.session.w r10 = r9.f15116s
            long r7 = com.appodeal.ads.utils.session.w.b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Session report timer finished with "
            r10.append(r1)
            r10.append(r7)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r3, r10, r6, r2, r6)
            com.appodeal.ads.utils.session.w r10 = r9.f15116s
            r10.g()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.session.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
