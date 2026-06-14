package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3632cf extends Zf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Mutex f38338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Job f38339g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3632cf(C3935og dao, C3899n5 listener, Cif networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f38338f = ng.f.b(false, 1, null);
    }

    @Override // com.inmobi.media.Zf
    public final Unit b() {
        eg.i.d(A9.f36557c, null, null, new Ye(this, null), 3, null);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.inmobi.media.Ze
            if (r0 == 0) goto L13
            r0 = r12
            com.inmobi.media.Ze r0 = (com.inmobi.media.Ze) r0
            int r1 = r0.f38119d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38119d = r1
            goto L18
        L13:
            com.inmobi.media.Ze r0 = new com.inmobi.media.Ze
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f38117b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38119d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.Mutex r0 = r0.f38116a
            kotlin.d.b(r12)
            r12 = r0
            goto L45
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            kotlin.d.b(r12)
            kotlinx.coroutines.sync.Mutex r12 = r11.f38338f
            r0.f38116a = r12
            r0.f38119d = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            kotlinx.coroutines.Job r0 = r11.f38339g     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L66
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.n()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L60
            kotlinx.coroutines.Job r0 = r11.f38339g     // Catch: java.lang.Throwable -> L5e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L66
            goto L60
        L5e:
            r0 = move-exception
            goto L99
        L60:
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5e
            r12.unlock(r4)
            return r0
        L66:
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config r0 = com.inmobi.media.Zf.a()     // Catch: java.lang.Throwable -> L5e
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config$PingIntervalConfig r0 = r0.getInterval()     // Catch: java.lang.Throwable -> L5e
            int r0 = r0.getNormal()     // Catch: java.lang.Throwable -> L5e
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L7f
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5e
            r12.unlock(r4)
            return r0
        L7f:
            kotlinx.coroutines.CoroutineScope r5 = com.inmobi.media.A9.f36557c     // Catch: java.lang.Throwable -> L5e
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L5e
            long r8 = r0 * r2
            com.inmobi.media.af r10 = new com.inmobi.media.af     // Catch: java.lang.Throwable -> L5e
            r10.<init>(r11, r4)     // Catch: java.lang.Throwable -> L5e
            r6 = 0
            kotlinx.coroutines.Job r0 = com.inmobi.media.F3.a(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L5e
            r11.f38339g = r0     // Catch: java.lang.Throwable -> L5e
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5e
            r12.unlock(r4)
            return r0
        L99:
            r12.unlock(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3632cf.c(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3606bf
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.bf r0 = (com.inmobi.media.C3606bf) r0
            int r1 = r0.f38280d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38280d = r1
            goto L18
        L13:
            com.inmobi.media.bf r0 = new com.inmobi.media.bf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f38278b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38280d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlinx.coroutines.sync.Mutex r0 = r0.f38277a
            kotlin.d.b(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f38338f
            r0.f38277a = r6
            r0.f38280d = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r6
        L45:
            kotlinx.coroutines.Job r6 = r5.f38339g     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L4f
            kotlinx.coroutines.Job.a.a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r6 = move-exception
            goto L57
        L4f:
            r5.f38339g = r4     // Catch: java.lang.Throwable -> L4d
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L4d
            r0.unlock(r4)
            return r6
        L57:
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3632cf.d(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[LOOP:0: B:47:0x00d5->B:49:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3632cf.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
