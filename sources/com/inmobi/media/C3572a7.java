package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3572a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3572a7 f38170a = new C3572a7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InMobiUserDataModel f38171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Mutex f38172c;

    static {
        Intrinsics.checkNotNullExpressionValue(C3572a7.class.getSimpleName(), "getSimpleName(...)");
        f38172c = ng.f.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.inmobi.media.Z6
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.Z6 r0 = (com.inmobi.media.Z6) r0
            int r1 = r0.f38100d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38100d = r1
            goto L18
        L13:
            com.inmobi.media.Z6 r0 = new com.inmobi.media.Z6
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38099c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38100d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlinx.coroutines.sync.Mutex r5 = r0.f38098b
            com.inmobi.unifiedId.InMobiUserDataModel r0 = r0.f38097a
            kotlin.d.b(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = com.inmobi.media.C3572a7.f38172c
            r0.f38097a = r5
            r0.f38098b = r6
            r0.f38100d = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            com.inmobi.unifiedId.InMobiUserDataModel r0 = com.inmobi.media.C3572a7.f38171b     // Catch: java.lang.Throwable -> L5a
            j$.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L5a
            j$.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L5a
            com.inmobi.media.C3572a7.f38171b = r5     // Catch: java.lang.Throwable -> L5a
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5a
            r6.unlock(r4)
            return r5
        L5a:
            r5 = move-exception
            r6.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3572a7.a(com.inmobi.unifiedId.InMobiUserDataModel, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final String toString() {
        return String.valueOf(f38171b);
    }
}
