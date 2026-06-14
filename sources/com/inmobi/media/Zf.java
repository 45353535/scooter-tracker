package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3935og f38120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vf f38121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cif f38122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Wf f38123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f38124e;

    public Zf(C3935og dao, Vf vf2, Cif networkHandler) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f38120a = dao;
        this.f38121b = vf2;
        this.f38122c = networkHandler;
        this.f38123d = Wf.f37951a;
        this.f38124e = new ConcurrentHashMap();
    }

    public static Xf a(Rf rf2, Ne ne2) {
        String str = rf2.f37658a;
        ne2.c();
        ne2.e();
        return new Xf(rf2, ne2.c(), ne2.e());
    }

    public abstract Unit b();

    public static AdConfig.PingsV2Config a() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f38021a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        if (r5.invoke(r2, r3) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.Rf r18, kotlin.jvm.functions.Function2 r19, kotlin.coroutines.jvm.internal.d r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.inmobi.media.Yf
            if (r3 == 0) goto L19
            r3 = r2
            com.inmobi.media.Yf r3 = (com.inmobi.media.Yf) r3
            int r4 = r3.f38059e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f38059e = r4
            goto L1e
        L19:
            com.inmobi.media.Yf r3 = new com.inmobi.media.Yf
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f38057c
            java.lang.Object r4 = pf.b.g()
            int r5 = r3.f38059e
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4a
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L35
            com.inmobi.media.Rf r1 = r3.f38055a
            kotlin.d.b(r2)
            goto Lb3
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            kotlin.jvm.functions.Function2 r1 = r3.f38056b
            com.inmobi.media.Rf r5 = r3.f38055a
            kotlin.d.b(r2)
            r16 = r5
            r5 = r1
            r1 = r16
            goto L9f
        L4a:
            kotlin.d.b(r2)
            com.inmobi.media.Wf r2 = r0.f38123d
            com.inmobi.media.Wf r5 = com.inmobi.media.Wf.f37952b
            if (r2 != r5) goto Lbd
            j$.util.concurrent.ConcurrentHashMap r2 = r0.f38124e
            java.lang.String r5 = r1.f37659b
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L60
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        L60:
            j$.util.concurrent.ConcurrentHashMap r2 = r0.f38124e
            java.lang.String r5 = r1.f37659b
            java.lang.String r8 = r1.f37658a
            r2.put(r5, r8)
            com.inmobi.media.if r2 = r0.f38122c
            r3.f38055a = r1
            r5 = r19
            r3.f38056b = r5
            r3.f38059e = r7
            r2.getClass()
            java.util.HashMap r10 = new java.util.HashMap
            java.util.Map r7 = r1.f37660c
            r10.<init>(r7)
            java.lang.String r7 = com.inmobi.media.Ji.c()
            java.lang.String r8 = "user-agent"
            r10.put(r8, r7)
            com.inmobi.media.Je r8 = new com.inmobi.media.Je
            java.lang.String r9 = r1.f37658a
            boolean r14 = r1.f37661d
            r15 = 28
            r11 = 0
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.inmobi.media.u9 r2 = r2.f38763a
            com.inmobi.media.x4 r2 = r2.f39655a
            java.lang.Object r2 = r2.a(r8, r3)
            if (r2 != r4) goto L9f
            goto Lb2
        L9f:
            com.inmobi.media.Ne r2 = (com.inmobi.media.Ne) r2
            com.inmobi.media.Xf r2 = a(r1, r2)
            r3.f38055a = r1
            r7 = 0
            r3.f38056b = r7
            r3.f38059e = r6
            java.lang.Object r2 = r5.invoke(r2, r3)
            if (r2 != r4) goto Lb3
        Lb2:
            return r4
        Lb3:
            j$.util.concurrent.ConcurrentHashMap r2 = r0.f38124e
            java.lang.String r1 = r1.f37659b
            r2.remove(r1)
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        Lbd:
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Zf.a(com.inmobi.media.Rf, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        Wf wf2 = this.f38123d;
        Wf wf3 = Wf.f37952b;
        Wf wf4 = Wf.f37951a;
        Objects.toString(wf2);
        if (this.f38123d == wf4) {
            this.f38123d = wf3;
            Unit unitB = b();
            return unitB == pf.b.g() ? unitB : Unit.f93236a;
        }
        return Unit.f93236a;
    }
}
