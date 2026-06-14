package com.inmobi.media;

import android.net.Network;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Z4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Network f38095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z4(Network network, Continuation continuation) {
        super(2, continuation);
        this.f38095a = network;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z4(this.f38095a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z4(this.f38095a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            pf.b.g()
            kotlin.d.b(r3)
            r3 = 0
            com.inmobi.media.core.config.models.AdConfig$CustomNetworkValidation r0 = com.inmobi.media.C3570a5.a()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.getUrlDomain()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r0 == 0) goto L30
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r1 <= 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L30
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r1 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r0 = r0 ^ 1
            goto L31
        L2e:
            r0 = move-exception
            goto L53
        L30:
            r0 = r3
        L31:
            com.inmobi.media.C3570a5.f38148b = r0     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            android.net.Network r0 = r2.f38095a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            com.inmobi.media.C3570a5.f38147a = r0     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            com.inmobi.media.C3570a5.f38149c = r0     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            android.net.Network r0 = com.inmobi.media.C3570a5.f38147a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            goto L4b
        L40:
            r0 = move-exception
            kotlin.Lazy r1 = com.inmobi.media.P9.f37527a     // Catch: java.lang.Throwable -> L2e
            com.inmobi.media.L2 r1 = new com.inmobi.media.L2     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            com.inmobi.media.P9.a(r1)     // Catch: java.lang.Throwable -> L2e
        L4b:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.media.C3570a5.f38151e
            r0.set(r3)
            kotlin.Unit r3 = kotlin.Unit.f93236a
            return r3
        L53:
            java.util.concurrent.atomic.AtomicBoolean r1 = com.inmobi.media.C3570a5.f38151e
            r1.set(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Z4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
