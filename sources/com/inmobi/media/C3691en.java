package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3691en extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3717fn f38535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3691en(C3717fn c3717fn, Continuation continuation) {
        super(2, continuation);
        this.f38535c = c3717fn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3691en c3691en = new C3691en(this.f38535c, continuation);
        c3691en.f38534b = obj;
        return c3691en;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3691en c3691en = new C3691en(this.f38535c, (Continuation) obj2);
        c3691en.f38534b = (CoroutineScope) obj;
        return c3691en.invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[Catch: IllegalStateException -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x0026, blocks: (B:17:0x0036, B:10:0x0022), top: B:26:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0052 -> B:15:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f38533a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r6.f38534b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.d.b(r7)
            goto L30
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.f38534b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.d.b(r7)     // Catch: java.lang.IllegalStateException -> L26
            goto L46
        L26:
            r7 = move-exception
            goto L43
        L28:
            kotlin.d.b(r7)
            java.lang.Object r7 = r6.f38534b
            r1 = r7
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
        L30:
            boolean r7 = kotlinx.coroutines.i.i(r1)
            if (r7 == 0) goto L55
            com.inmobi.media.fn r7 = r6.f38535c     // Catch: java.lang.IllegalStateException -> L26
            r6.f38534b = r1     // Catch: java.lang.IllegalStateException -> L26
            r6.f38533a = r3     // Catch: java.lang.IllegalStateException -> L26
            java.lang.Object r7 = com.inmobi.media.C3717fn.a(r7, r6)     // Catch: java.lang.IllegalStateException -> L26
            if (r7 != r0) goto L46
            goto L54
        L43:
            r7.toString()
        L46:
            com.inmobi.media.fn r7 = r6.f38535c
            long r4 = r7.f38598c
            r6.f38534b = r1
            r6.f38533a = r2
            java.lang.Object r7 = eg.k0.a(r4, r6)
            if (r7 != r0) goto L30
        L54:
            return r0
        L55:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3691en.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
