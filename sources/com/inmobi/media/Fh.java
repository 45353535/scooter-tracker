package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Fh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f36860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4154xb f36861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gh f36863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f36864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f36865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(Gh gh2, long j10, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f36863d = gh2;
        this.f36864e = j10;
        this.f36865f = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Fh(this.f36863d, this.f36864e, this.f36865f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Fh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r2.b(r7, r17) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36862c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L36
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f36860a
            com.inmobi.media.xb r1 = (com.inmobi.media.C4154xb) r1
            kotlin.d.b(r18)
            r8 = r1
            goto L89
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            kotlin.d.b(r18)
            goto Lbf
        L2a:
            com.inmobi.media.xb r2 = r0.f36861b
            java.lang.Object r7 = r0.f36860a
            com.inmobi.media.qb r7 = (com.inmobi.media.C3980qb) r7
            kotlin.d.b(r18)
            r8 = r18
            goto L66
        L36:
            kotlin.d.b(r18)
            com.inmobi.media.Gh r2 = r0.f36863d
            long r9 = r0.f36864e
            boolean r14 = r0.f36865f
            java.lang.String r8 = r2.f36951j
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f36952k
            int r15 = r2.get()
            com.inmobi.media.qb r7 = new com.inmobi.media.qb
            r12 = 0
            r16 = 12
            r11 = 0
            r7.<init>(r8, r9, r11, r12, r14, r15, r16)
            kotlin.Lazy r2 = com.inmobi.media.AbstractC4179yb.f39987a
            java.lang.Object r2 = r2.getValue()
            com.inmobi.media.xb r2 = (com.inmobi.media.C4154xb) r2
            r0.f36860a = r7
            r0.f36861b = r2
            r0.f36862c = r5
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 != r1) goto L66
            goto L87
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            r0.f36860a = r6
            r0.f36861b = r6
            r0.f36862c = r4
            java.lang.Object r2 = r2.b(r7, r0)
            if (r2 != r1) goto Lbf
            goto L87
        L7b:
            r0.f36860a = r2
            r0.f36861b = r6
            r0.f36862c = r3
            java.lang.Object r3 = r2.a(r7, r0)
            if (r3 != r1) goto L88
        L87:
            return r1
        L88:
            r8 = r2
        L89:
            kotlinx.coroutines.CoroutineScope r1 = com.inmobi.media.Sb.f37702a
            long r1 = r0.f36864e
            com.inmobi.media.Gh r3 = r0.f36863d
            long r9 = r3.f36943b
            long r9 = r1 - r9
            int r11 = r3.f36944c
            java.lang.String r1 = "dao"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = com.inmobi.media.Sb.f37704c
            boolean r1 = r1.getAndSet(r5)
            if (r1 != 0) goto Lbf
            com.inmobi.media.Qb r7 = new com.inmobi.media.Qb
            r12 = 0
            r7.<init>(r8, r9, r11, r12)
            kotlinx.coroutines.CoroutineScope r1 = com.inmobi.media.AbstractC3790il.f38771a
            java.lang.String r1 = "runnable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlinx.coroutines.CoroutineScope r8 = com.inmobi.media.AbstractC3790il.f38771a
            com.inmobi.media.fl r11 = new com.inmobi.media.fl
            r1 = 10000(0x2710, double:4.9407E-320)
            r11.<init>(r1, r6, r7)
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            eg.g.d(r8, r9, r10, r11, r12, r13)
        Lbf:
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
