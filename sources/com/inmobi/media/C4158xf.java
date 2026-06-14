package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4158xf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4183yf f39931b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4158xf(C4183yf c4183yf, Continuation continuation) {
        super(2, continuation);
        this.f39931b = c4183yf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4158xf(this.f39931b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4158xf(this.f39931b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.a(r4) == r0) goto L15;
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
            int r1 = r4.f39930a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r5)
            goto L37
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.d.b(r5)
            goto L2c
        L1e:
            kotlin.d.b(r5)
            com.inmobi.media.yf r5 = r4.f39931b
            r4.f39930a = r3
            java.lang.Object r5 = com.inmobi.media.C4183yf.a(r5, r4)
            if (r5 != r0) goto L2c
            goto L36
        L2c:
            com.inmobi.media.pf r5 = com.inmobi.media.C3959pf.f39284a
            r4.f39930a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L37
        L36:
            return r0
        L37:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4158xf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
