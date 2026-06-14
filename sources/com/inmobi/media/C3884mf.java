package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3884mf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f39035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f39036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3884mf(AdConfig.OmidConfig omidConfig, Context context, Continuation continuation) {
        super(2, continuation);
        this.f39035c = omidConfig;
        this.f39036d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3884mf c3884mf = new C3884mf(this.f39035c, this.f39036d, continuation);
        c3884mf.f39034b = obj;
        return c3884mf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3884mf) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r15 == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r1 = pf.b.g()
            int r0 = r14.f39033a
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L24
            if (r0 == r5) goto L1d
            if (r0 != r4) goto L15
            kotlin.d.b(r15)
            goto Lb6
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            kotlin.d.b(r15)     // Catch: java.lang.Throwable -> L21
            goto L62
        L21:
            r0 = move-exception
            r15 = r0
            goto L69
        L24:
            kotlin.d.b(r15)
            java.lang.Object r15 = r14.f39034b
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r15 = r14.f39035c
            kotlin.Result$Companion r0 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L21
            r14.f39033a = r5     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = r15.getUrl()     // Catch: java.lang.Throwable -> L21
            int r0 = r15.getMaxRetries()     // Catch: java.lang.Throwable -> L21
            int r15 = r15.getRetryInterval()     // Catch: java.lang.Throwable -> L21
            kotlin.ranges.IntRange r6 = com.inmobi.media.Se.f37724a     // Catch: java.lang.Throwable -> L21
            int r15 = r15 * 1000
            long r8 = (long) r15     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.Je r6 = new com.inmobi.media.Je     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.Ai r11 = new com.inmobi.media.Ai     // Catch: java.lang.Throwable -> L21
            r11.<init>(r0, r8, r3)     // Catch: java.lang.Throwable -> L21
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 46
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.CoroutineDispatcher r15 = eg.o0.b()     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.tf r0 = new com.inmobi.media.tf     // Catch: java.lang.Throwable -> L21
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r15 = eg.g.g(r15, r0, r14)     // Catch: java.lang.Throwable -> L21
            if (r15 != r1) goto L62
            goto Lb5
        L62:
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L21
            java.lang.Object r15 = kotlin.Result.b(r15)     // Catch: java.lang.Throwable -> L21
            goto L73
        L69:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r15 = kotlin.d.a(r15)
            java.lang.Object r15 = kotlin.Result.b(r15)
        L73:
            java.lang.Throwable r0 = kotlin.Result.g(r15)
            if (r0 == 0) goto L7e
            java.util.concurrent.atomic.AtomicInteger r0 = com.inmobi.media.C3959pf.f39285b
            r0.set(r3)
        L7e:
            android.content.Context r0 = r14.f39036d
            boolean r3 = kotlin.Result.j(r15)
            if (r3 == 0) goto Lb6
            r3 = r15
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.atomic.AtomicInteger r6 = com.inmobi.media.C3959pf.f39285b
            r6.set(r5)
            com.inmobi.media.sf r5 = com.inmobi.media.C3959pf.f39286c
            if (r5 != 0) goto L99
            com.inmobi.media.sf r5 = new com.inmobi.media.sf
            r5.<init>(r0)
            com.inmobi.media.C3959pf.f39286c = r5
        L99:
            r14.f39034b = r15
            r14.f39033a = r4
            kotlinx.coroutines.CoroutineDispatcher r15 = eg.o0.b()
            com.inmobi.media.rf r0 = new com.inmobi.media.rf
            r0.<init>(r5, r3, r2)
            java.lang.Object r15 = eg.g.g(r15, r0, r14)
            java.lang.Object r0 = pf.b.g()
            if (r15 != r0) goto Lb1
            goto Lb3
        Lb1:
            kotlin.Unit r15 = kotlin.Unit.f93236a
        Lb3:
            if (r15 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            kotlin.Unit r15 = kotlin.Unit.f93236a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3884mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
