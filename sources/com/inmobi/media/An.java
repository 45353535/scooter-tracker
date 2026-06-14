package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class An extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bn f36596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public An(Bn bn, Continuation continuation) {
        super(2, continuation);
        this.f36596b = bn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new An(this.f36596b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new An(this.f36596b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f36595a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r7)
            goto L44
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.d.b(r7)
            goto L31
        L1e:
            kotlin.d.b(r7)
            com.inmobi.media.Bn r7 = r6.f36596b
            com.inmobi.media.Dn r7 = r7.f36642b
            int r7 = r7.f36756b
            long r4 = (long) r7
            r6.f36595a = r3
            java.lang.Object r7 = eg.k0.a(r4, r6)
            if (r7 != r0) goto L31
            goto L43
        L31:
            com.inmobi.media.Bn r7 = r6.f36596b
            com.inmobi.media.Cn r1 = r7.f36644d
            r1.f36687b = r3
            kotlinx.coroutines.flow.MutableSharedFlow r7 = r7.f36643c
            kotlin.Unit r1 = kotlin.Unit.f93236a
            r6.f36595a = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.An.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
