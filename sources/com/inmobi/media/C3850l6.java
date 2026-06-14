package com.inmobi.media;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3850l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC3649d6 f38946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jf f38947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wj f38948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f38950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f38951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f38952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CoroutineScope f38953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C3623c6 f38954j;

    public C3850l6(String tableName, AbstractC3649d6 mEventDao, Jf mPayloadProvider, C3623c6 eventConfig, Wj wj) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(mEventDao, "mEventDao");
        Intrinsics.checkNotNullParameter(mPayloadProvider, "mPayloadProvider");
        Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
        this.f38945a = tableName;
        this.f38946b = mEventDao;
        this.f38947c = mPayloadProvider;
        this.f38948d = wj;
        this.f38949e = C3850l6.class.getSimpleName();
        this.f38950f = new AtomicBoolean(false);
        this.f38951g = new AtomicBoolean(false);
        this.f38953i = A9.f36557c;
        this.f38952h = new LinkedList();
        this.f38954j = eventConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3850l6 r17, boolean r18, kotlin.coroutines.jvm.internal.d r19) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3850l6.a(com.inmobi.media.l6, boolean, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final long a() {
        Context context = Ji.f37157a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "batch_processing_info");
        String key = this.f38945a + "_last_batch_process";
        Intrinsics.checkNotNullParameter(key, "key");
        return eaA.f36783a.getLong(key, -1L);
    }

    public final void a(long j10) {
        Context context = Ji.f37157a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            Da.a(context, "batch_processing_info").a(this.f38945a + "_last_batch_process", j10, false);
        }
    }

    public final void a(boolean z10) {
        C3623c6 c3623c6 = this.f38954j;
        if (this.f38951g.get() || c3623c6 == null) {
            return;
        }
        long j10 = c3623c6.f38322c;
        if (this.f38952h.contains("default")) {
            return;
        }
        this.f38952h.add("default");
        String TAG = this.f38949e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        CoroutineScope coroutineScope = this.f38953i;
        C3623c6 c3623c62 = this.f38954j;
        long jA = a();
        if (jA == -1) {
            a(System.currentTimeMillis());
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ref$ObjectRef.f93280b = F3.a(coroutineScope, Math.max(0L, (timeUnit.toSeconds(jA) + (c3623c62 != null ? c3623c62.f38322c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())) * 1000, 1000 * j10, new C3800j6(this, z10, ref$ObjectRef, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r9, kotlin.coroutines.jvm.internal.d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.inmobi.media.C3726g6
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.g6 r0 = (com.inmobi.media.C3726g6) r0
            int r1 = r0.f38616d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38616d = r1
            goto L18
        L13:
            com.inmobi.media.g6 r0 = new com.inmobi.media.g6
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f38614b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38616d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r9 = r0.f38613a
            kotlin.d.b(r11)
            goto L43
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.d.b(r11)
            com.inmobi.media.d6 r11 = r8.f38946b
            r0.f38613a = r9
            r0.f38616d = r3
            java.lang.Object r11 = r11.b(r3, r0)
            if (r11 != r1) goto L43
            return r1
        L43:
            java.util.List r11 = (java.util.List) r11
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L64
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Object r11 = r11.get(r1)
            com.inmobi.media.i2 r11 = (com.inmobi.media.AbstractC3772i2) r11
            long r6 = r11.f38736c
            long r4 = r4 - r6
            long r4 = r0.toSeconds(r4)
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L64
            goto L65
        L64:
            r3 = r1
        L65:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3850l6.a(long, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r7, long r9, kotlin.coroutines.jvm.internal.d r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.inmobi.media.C3825k6
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.k6 r0 = (com.inmobi.media.C3825k6) r0
            int r1 = r0.f38863e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38863e = r1
            goto L18
        L13:
            com.inmobi.media.k6 r0 = new com.inmobi.media.k6
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f38861c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38863e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r7 = r0.f38860b
            long r9 = r0.f38859a
            kotlin.d.b(r11)
            goto L52
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.d.b(r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r11.toSeconds(r4)
            long r7 = r7 + r4
            com.inmobi.media.d6 r11 = r6.f38946b
            r0.f38859a = r9
            r0.f38860b = r7
            r0.f38863e = r3
            java.lang.Object r11 = r11.b(r3, r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            java.util.List r11 = (java.util.List) r11
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L6f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r11 = r11.get(r1)
            com.inmobi.media.i2 r11 = (com.inmobi.media.AbstractC3772i2) r11
            long r4 = r11.f38736c
            long r4 = r0.toSeconds(r4)
            long r7 = r7 - r4
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L6f
            goto L70
        L6f:
            r3 = r1
        L70:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3850l6.a(long, long, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
