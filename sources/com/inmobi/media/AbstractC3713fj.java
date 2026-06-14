package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3713fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f38586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mutex f38587b;

    public AbstractC3713fj(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f38586a = coroutineScope;
        this.f38587b = ng.f.b(false, 1, null);
    }

    public abstract InterfaceC3636cj a();

    public abstract void a(InterfaceC3636cj interfaceC3636cj);

    public final void a(InterfaceC3636cj newState, InterfaceC3636cj callerState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(callerState, "callerState");
        eg.i.d(this.f38586a, null, null, new C3662dj(this, newState, callerState, null), 3, null);
    }

    public final void b(InterfaceC3636cj interfaceC3636cj, InterfaceC3636cj interfaceC3636cj2) {
        if (Intrinsics.areEqual(a(), interfaceC3636cj2) && !Intrinsics.areEqual(a(), interfaceC3636cj)) {
            Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
            a().getClass();
            interfaceC3636cj.getClass();
            a().c();
            a(interfaceC3636cj);
            a().a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.Vc r6, com.inmobi.media.InterfaceC3636cj r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3687ej
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.ej r0 = (com.inmobi.media.C3687ej) r0
            int r1 = r0.f38528f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38528f = r1
            goto L18
        L13:
            com.inmobi.media.ej r0 = new com.inmobi.media.ej
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f38526d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38528f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            kotlinx.coroutines.sync.Mutex r6 = r0.f38525c
            com.inmobi.media.cj r7 = r0.f38524b
            com.inmobi.media.cj r0 = r0.f38523a
            kotlin.d.b(r8)
            r8 = r6
            r6 = r0
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r5.f38587b
            r0.f38523a = r6
            r0.f38524b = r7
            r0.f38525c = r8
            r0.f38528f = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L57
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L57
            r8.unlock(r4)
            return r6
        L57:
            r6 = move-exception
            r8.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3713fj.a(com.inmobi.media.Vc, com.inmobi.media.cj, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
