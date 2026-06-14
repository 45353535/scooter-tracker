package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3715fl extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f38590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.k f38591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3715fl(long j10, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.f38590b = j10;
        this.f38591c = (kotlin.coroutines.jvm.internal.k) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3715fl(this.f38590b, continuation, this.f38591c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3715fl(this.f38590b, (Continuation) obj2, this.f38591c).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.invoke(r6) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f38589a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r7)
            goto L37
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.d.b(r7)
            goto L2c
        L1e:
            kotlin.d.b(r7)
            long r4 = r6.f38590b
            r6.f38589a = r3
            java.lang.Object r7 = eg.k0.a(r4, r6)
            if (r7 != r0) goto L2c
            goto L36
        L2c:
            kotlin.coroutines.jvm.internal.k r7 = r6.f38591c
            r6.f38589a = r2
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L37
        L36:
            return r0
        L37:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3715fl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
