package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Rk extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rk(boolean z10, Continuation continuation) {
        super(1, continuation);
        this.f37678b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Rk(this.f37678b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Rk(this.f37678b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5.b(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (com.inmobi.media.Yk.a(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r4.f37677a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.d.b(r5)
            goto L36
        L1b:
            kotlin.d.b(r5)
            boolean r5 = r4.f37678b
            if (r5 == 0) goto L2d
            com.inmobi.media.Yk r5 = com.inmobi.media.Yk.f38071a
            r4.f37677a = r3
            java.lang.Object r5 = r5.b(r4)
            if (r5 != r0) goto L36
            goto L35
        L2d:
            r4.f37677a = r2
            java.lang.Object r5 = com.inmobi.media.Yk.a(r4)
            if (r5 != r0) goto L36
        L35:
            return r0
        L36:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
