package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3876m7 extends Zf {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f39020h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Mutex f39021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Job f39022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3876m7(C3935og dao, E8 listener, Cif networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f39021f = ng.f.b(false, 1, null);
    }

    @Override // com.inmobi.media.Zf
    public final Unit b() {
        CoroutineScope coroutineScope = A9.f36558d;
        eg.i.d(coroutineScope, null, null, new C3752h7(this, null), 3, null);
        eg.i.d(coroutineScope, null, null, new C3777i7(this, null), 3, null);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c6 -> B:34:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.d r19) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3876m7.c(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.inmobi.media.C3801j7
            if (r0 == 0) goto L13
            r0 = r12
            com.inmobi.media.j7 r0 = (com.inmobi.media.C3801j7) r0
            int r1 = r0.f38801d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38801d = r1
            goto L18
        L13:
            com.inmobi.media.j7 r0 = new com.inmobi.media.j7
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f38799b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38801d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.Mutex r0 = r0.f38798a
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
            kotlinx.coroutines.sync.Mutex r12 = r11.f39021f
            r0.f38798a = r12
            r0.f38801d = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            kotlinx.coroutines.Job r0 = r11.f39022g     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L50
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            goto L95
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L59
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L4e
            r12.unlock(r4)
            return r0
        L59:
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config r0 = com.inmobi.media.Zf.a()     // Catch: java.lang.Throwable -> L4e
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config$PingIntervalConfig r0 = r0.getInterval()     // Catch: java.lang.Throwable -> L4e
            int r0 = r0.getHigh()     // Catch: java.lang.Throwable -> L4e
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L72
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L4e
            r12.unlock(r4)
            return r0
        L72:
            java.lang.String r2 = "m7"
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L4e
            kotlinx.coroutines.CoroutineScope r5 = com.inmobi.media.A9.f36558d     // Catch: java.lang.Throwable -> L4e
            kotlin.ranges.IntRange r2 = com.inmobi.media.Se.f37724a     // Catch: java.lang.Throwable -> L4e
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4e
            long r8 = r0 * r2
            com.inmobi.media.k7 r10 = new com.inmobi.media.k7     // Catch: java.lang.Throwable -> L4e
            r10.<init>(r11, r4)     // Catch: java.lang.Throwable -> L4e
            r6 = 0
            kotlinx.coroutines.Job r0 = com.inmobi.media.F3.a(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L4e
            r11.f39022g = r0     // Catch: java.lang.Throwable -> L4e
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L4e
            r12.unlock(r4)
            return r0
        L95:
            r12.unlock(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3876m7.d(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3851l7
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.l7 r0 = (com.inmobi.media.C3851l7) r0
            int r1 = r0.f38958d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38958d = r1
            goto L18
        L13:
            com.inmobi.media.l7 r0 = new com.inmobi.media.l7
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f38956b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38958d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlinx.coroutines.sync.Mutex r0 = r0.f38955a
            kotlin.d.b(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f39021f
            r0.f38955a = r6
            r0.f38958d = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r6
        L45:
            kotlinx.coroutines.Job r6 = r5.f39022g     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L4f
            kotlinx.coroutines.Job.a.a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r6 = move-exception
            goto L57
        L4f:
            r5.f39022g = r4     // Catch: java.lang.Throwable -> L4d
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L4d
            r0.unlock(r4)
            return r6
        L57:
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3876m7.e(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r0 == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2 A[Catch: Error -> 0x003e, Exception -> 0x0041, LOOP:0: B:57:0x00ec->B:59:0x00f2, LOOP_END, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r20) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3876m7.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
