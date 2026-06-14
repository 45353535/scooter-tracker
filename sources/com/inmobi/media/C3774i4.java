package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3774i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3823k4 f38739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3798j4 f38740b;

    public C3774i4(C3823k4 configManagerState, C3798j4 configManagerDI) {
        Intrinsics.checkNotNullParameter(configManagerState, "configManagerState");
        Intrinsics.checkNotNullParameter(configManagerDI, "configManagerDI");
        this.f38739a = configManagerState;
        this.f38740b = configManagerDI;
    }

    public final Config a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String strA = AbstractC4047t4.a(clazz);
        Config config = (Config) this.f38739a.f38854b.get(strA);
        if (config == null) {
            String[] strArr = C3997r4.f39438a;
            for (int i10 = 0; i10 < 5; i10++) {
                String str = strArr[i10];
                if (this.f38739a.f38854b.get(str) == null) {
                    this.f38739a.f38854b.put(str, AbstractC3874m5.a(str));
                }
            }
            config = (Config) this.f38739a.f38854b.get(strA);
            eg.i.d(this.f38740b.f38790a, null, null, new C3698f4(this, null), 3, null);
        }
        Intrinsics.checkNotNull(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.C3724g4
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.g4 r0 = (com.inmobi.media.C3724g4) r0
            int r1 = r0.f38611c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38611c = r1
            goto L18
        L13:
            com.inmobi.media.g4 r0 = new com.inmobi.media.g4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f38609a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38611c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.d.b(r7)
            com.inmobi.media.k4 r7 = r6.f38739a
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f38853a
            boolean r7 = r7.getAndSet(r3)
            if (r7 == 0) goto L41
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        L41:
            r0.f38611c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String[] r7 = com.inmobi.media.C3997r4.f39438a
            r0 = 0
        L4d:
            r1 = 5
            if (r0 >= r1) goto L6a
            r1 = r7[r0]
            com.inmobi.media.k4 r2 = r6.f38739a
            j$.util.concurrent.ConcurrentHashMap r2 = r2.f38854b
            java.lang.Object r2 = r2.get(r1)
            if (r2 != 0) goto L67
            com.inmobi.media.k4 r2 = r6.f38739a
            j$.util.concurrent.ConcurrentHashMap r2 = r2.f38854b
            com.inmobi.media.core.config.models.Config r3 = com.inmobi.media.AbstractC3874m5.a(r1)
            r2.put(r1, r3)
        L67:
            int r0 = r0 + 1
            goto L4d
        L6a:
            com.inmobi.media.j4 r7 = r6.f38740b
            kotlinx.coroutines.CoroutineScope r0 = r7.f38790a
            com.inmobi.media.h4 r3 = new com.inmobi.media.h4
            r7 = 0
            r3.<init>(r6, r7)
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            eg.g.d(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3774i4.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.inmobi.media.C3647d4
            if (r0 == 0) goto L13
            r0 = r5
            com.inmobi.media.d4 r0 = (com.inmobi.media.C3647d4) r0
            int r1 = r0.f38424c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38424c = r1
            goto L18
        L13:
            com.inmobi.media.d4 r0 = new com.inmobi.media.d4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f38422a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38424c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            com.inmobi.media.j4 r5 = r4.f38740b
            kotlin.Lazy r5 = r5.f38791b
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.a4 r5 = (com.inmobi.media.C3569a4) r5
            r0.f38424c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r5.next()
            com.inmobi.media.core.config.models.Config r0 = (com.inmobi.media.core.config.models.Config) r0
            r0.getType()
            com.inmobi.media.k4 r1 = r4.f38739a
            j$.util.concurrent.ConcurrentHashMap r1 = r1.f38854b
            java.lang.String r2 = r0.getType()
            r1.put(r2, r0)
            goto L4d
        L68:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3774i4.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
