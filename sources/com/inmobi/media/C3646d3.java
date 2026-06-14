package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3646d3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f38420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC3723g3 f38421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3646d3(S2 s22, HandlerC3723g3 handlerC3723g3, Continuation continuation) {
        super(2, continuation);
        this.f38420b = s22;
        this.f38421c = handlerC3723g3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3646d3(this.f38420b, this.f38421c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3646d3(this.f38420b, this.f38421c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r7.f38419a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.d.b(r8)
            goto L6e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.d.b(r8)
            goto L4e
        L1f:
            kotlin.d.b(r8)
            kotlin.Lazy r8 = com.inmobi.media.C4121w3.f39817b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            com.inmobi.media.S2 r1 = r7.f38420b
            int r1 = r1.f37684a
            r7.f38419a = r4
            com.inmobi.media.g9 r8 = r8.f37928a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r5 = "click"
            java.lang.String r6 = "id=?"
            java.lang.Object r8 = r8.a(r5, r6, r1, r7)
            java.lang.Object r1 = pf.b.g()
            if (r8 != r1) goto L49
            goto L4b
        L49:
            kotlin.Unit r8 = kotlin.Unit.f93236a
        L4b:
            if (r8 != r0) goto L4e
            goto L6d
        L4e:
            java.util.List r8 = com.inmobi.media.C4121w3.f39821f
            com.inmobi.media.S2 r1 = r7.f38420b
            r8.remove(r1)
            java.util.List r8 = com.inmobi.media.C4121w3.f39821f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L98
            kotlin.Lazy r8 = com.inmobi.media.C4121w3.f39817b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            r7.f38419a = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L6e
        L6d:
            return r0
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L87
            android.os.Message r8 = android.os.Message.obtain()
            r8.what = r4
            com.inmobi.media.g3 r0 = r7.f38421c
            boolean r8 = r0.sendMessage(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r8
        L87:
            com.inmobi.media.w3 r8 = com.inmobi.media.C4121w3.f39816a
            java.lang.String r8 = "w3"
            java.lang.String r0 = "access$getTAG$p(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.media.C4121w3.f39822g
            r8.set(r2)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        L98:
            com.inmobi.media.g3 r8 = r7.f38421c
            java.util.List r0 = com.inmobi.media.C4121w3.f39821f
            java.lang.Object r0 = r0.get(r2)
            com.inmobi.media.S2 r0 = (com.inmobi.media.S2) r0
            int r1 = com.inmobi.media.HandlerC3723g3.f38608a
            android.os.Message r1 = android.os.Message.obtain()
            if (r0 == 0) goto Laf
            boolean r2 = r0.f37688e
            if (r2 != r4) goto Laf
            r3 = 3
        Laf:
            r1.what = r3
            r1.obj = r0
            r8.sendMessage(r1)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3646d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
