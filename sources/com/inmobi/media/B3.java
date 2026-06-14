package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class B3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f36603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f36605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(long j10, Function1 function1, long j11, Continuation continuation) {
        super(2, continuation);
        this.f36603c = j10;
        this.f36604d = function1;
        this.f36605e = j11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        B3 b32 = new B3(this.f36603c, this.f36604d, this.f36605e, continuation);
        b32.f36602b = obj;
        return b32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:16:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r7.f36601a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f36602b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.d.b(r8)
            goto L52
        L22:
            java.lang.Object r1 = r7.f36602b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.d.b(r8)
            goto L3f
        L2a:
            kotlin.d.b(r8)
            java.lang.Object r8 = r7.f36602b
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            long r5 = r7.f36603c
            r7.f36602b = r8
            r7.f36601a = r4
            java.lang.Object r1 = eg.k0.a(r5, r7)
            if (r1 != r0) goto L3e
            goto L5e
        L3e:
            r1 = r8
        L3f:
            boolean r8 = kotlinx.coroutines.i.i(r1)
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r7.f36604d
            r7.f36602b = r1
            r7.f36601a = r3
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r0) goto L52
            goto L5e
        L52:
            long r4 = r7.f36605e
            r7.f36602b = r1
            r7.f36601a = r2
            java.lang.Object r8 = eg.k0.a(r4, r7)
            if (r8 != r0) goto L3f
        L5e:
            return r0
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.B3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
