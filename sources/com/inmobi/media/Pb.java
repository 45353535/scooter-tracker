package com.inmobi.media;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Pb extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4154xb f37531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f37532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4154xb f37534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f37535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pb(C4154xb c4154xb, long j10, int i10, Continuation continuation) {
        super(2, continuation);
        this.f37534d = c4154xb;
        this.f37535e = j10;
        this.f37536f = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pb(this.f37534d, this.f37535e, this.f37536f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Pb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0013, B:20:0x003f, B:22:0x0045, B:13:0x0021, B:19:0x0037, B:16:0x0028), top: B:29:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r7.f37533c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.util.Iterator r1 = r7.f37532b
            com.inmobi.media.xb r4 = r7.f37531a
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L17
            goto L3f
        L17:
            r8 = move-exception
            goto L67
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L17
            goto L37
        L25:
            kotlin.d.b(r8)
            com.inmobi.media.xb r8 = r7.f37534d     // Catch: java.lang.Throwable -> L17
            long r5 = r7.f37535e     // Catch: java.lang.Throwable -> L17
            int r1 = r7.f37536f     // Catch: java.lang.Throwable -> L17
            r7.f37533c = r4     // Catch: java.lang.Throwable -> L17
            java.lang.Object r8 = r8.a(r5, r1, r7)     // Catch: java.lang.Throwable -> L17
            if (r8 != r0) goto L37
            goto L5e
        L37:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L17
            com.inmobi.media.xb r4 = r7.f37534d     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L17
        L3f:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L17
            com.inmobi.media.qb r8 = (com.inmobi.media.C3980qb) r8     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = r8.f39367a     // Catch: java.lang.Throwable -> L17
            com.inmobi.media.Tb.a(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r8 = r8.f39367a     // Catch: java.lang.Throwable -> L17
            r7.f37531a = r4     // Catch: java.lang.Throwable -> L17
            r7.f37532b = r1     // Catch: java.lang.Throwable -> L17
            r7.f37533c = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r8 = r4.a(r8, r7)     // Catch: java.lang.Throwable -> L17
            if (r8 != r0) goto L3f
        L5e:
            return r0
        L5f:
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.media.Sb.f37704c
            r8.set(r2)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        L67:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.media.Sb.f37704c
            r0.set(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Pb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
