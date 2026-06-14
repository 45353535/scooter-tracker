package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class C3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.k f36653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f36654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3(long j10, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.f36653c = (kotlin.coroutines.jvm.internal.k) function1;
        this.f36654d = j10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3 c32 = new C3(this.f36654d, continuation, this.f36653c);
        c32.f36652b = obj;
        return c32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:16:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f36651a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f36652b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.d.b(r7)
            goto L52
        L22:
            java.lang.Object r1 = r6.f36652b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.d.b(r7)
            goto L3f
        L2a:
            kotlin.d.b(r7)
            java.lang.Object r7 = r6.f36652b
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            r6.f36652b = r7
            r6.f36651a = r4
            r4 = 0
            java.lang.Object r1 = eg.k0.a(r4, r6)
            if (r1 != r0) goto L3e
            goto L5e
        L3e:
            r1 = r7
        L3f:
            boolean r7 = kotlinx.coroutines.i.i(r1)
            if (r7 == 0) goto L5f
            kotlin.coroutines.jvm.internal.k r7 = r6.f36653c
            r6.f36652b = r1
            r6.f36651a = r3
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L52
            goto L5e
        L52:
            long r4 = r6.f36654d
            r6.f36652b = r1
            r6.f36651a = r2
            java.lang.Object r7 = eg.k0.a(r4, r6)
            if (r7 != r0) goto L3f
        L5e:
            return r0
        L5f:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
