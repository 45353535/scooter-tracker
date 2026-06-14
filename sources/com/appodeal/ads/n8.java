package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f13811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4 f13812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ServicesRegistry f13813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.appodeal.ads.services.r f13814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f13815e;

    public n8() {
        z3 getServiceOptions = new z3();
        p4 serviceConnector = new p4();
        ServicesRegistry servicesRegistry = (ServicesRegistry) com.appodeal.ads.services.e.f14645a.getValue();
        com.appodeal.ads.services.r servicesSolutionInitializer = (com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14779b.getValue();
        Intrinsics.checkNotNullParameter(getServiceOptions, "getServiceOptions");
        Intrinsics.checkNotNullParameter(serviceConnector, "serviceConnector");
        Intrinsics.checkNotNullParameter(servicesRegistry, "servicesRegistry");
        Intrinsics.checkNotNullParameter(servicesSolutionInitializer, "servicesSolutionInitializer");
        this.f13811a = getServiceOptions;
        this.f13812b = serviceConnector;
        this.f13813c = servicesRegistry;
        this.f13814d = servicesSolutionInitializer;
        this.f13815e = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.appodeal.ads.n8 r12, com.appodeal.ads.modules.common.internal.service.ServiceVariant r13, com.appodeal.ads.modules.common.internal.service.ServiceOptions r14, com.appodeal.ads.n6 r15, kotlin.coroutines.jvm.internal.d r16) {
        /*
            r0 = r16
            r12.getClass()
            boolean r1 = r0 instanceof com.appodeal.ads.m7
            if (r1 == 0) goto L18
            r1 = r0
            com.appodeal.ads.m7 r1 = (com.appodeal.ads.m7) r1
            int r2 = r1.f13645t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f13645t = r2
            goto L1d
        L18:
            com.appodeal.ads.m7 r1 = new com.appodeal.ads.m7
            r1.<init>(r12, r0)
        L1d:
            java.lang.Object r0 = r1.f13643r
            java.lang.Object r8 = pf.b.g()
            int r2 = r1.f13645t
            r9 = 1
            if (r2 == 0) goto L36
            if (r2 != r9) goto L2e
            kotlin.d.b(r0)     // Catch: java.lang.Exception -> L66
            goto L50
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.d.b(r0)
            long r10 = r14.getInitializationTimeout()     // Catch: java.lang.Exception -> L66
            com.appodeal.ads.r7 r2 = new com.appodeal.ads.r7     // Catch: java.lang.Exception -> L66
            r7 = 0
            r4 = r12
            r6 = r13
            r5 = r14
            r3 = r15
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L66
            r1.f13645t = r9     // Catch: java.lang.Exception -> L66
            java.lang.Object r0 = eg.x1.e(r10, r2, r1)     // Catch: java.lang.Exception -> L66
            if (r0 != r8) goto L50
            return r8
        L50:
            kotlin.Result r0 = (kotlin.Result) r0     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.l()     // Catch: java.lang.Exception -> L66
            return r0
        L59:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c     // Catch: java.lang.Exception -> L66
            com.appodeal.ads.service.ServiceError$InitializationTimeout r0 = com.appodeal.ads.service.ServiceError.InitializationTimeout.INSTANCE     // Catch: java.lang.Exception -> L66
            java.lang.Object r0 = kotlin.d.a(r0)     // Catch: java.lang.Exception -> L66
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L66
            return r0
        L66:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.f93230c
            java.lang.Object r0 = kotlin.d.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n8.b(com.appodeal.ads.n8, com.appodeal.ads.modules.common.internal.service.ServiceVariant, com.appodeal.ads.modules.common.internal.service.ServiceOptions, com.appodeal.ads.n6, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r6, com.appodeal.ads.networking.k r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.appodeal.ads.w7
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.ads.w7 r0 = (com.appodeal.ads.w7) r0
            int r1 = r0.f15193u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15193u = r1
            goto L18
        L13:
            com.appodeal.ads.w7 r0 = new com.appodeal.ads.w7
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f15191s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15193u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.appodeal.ads.n8 r6 = r0.f15190r
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L74
        L2b:
            r7 = move-exception
            goto L7f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.d.b(r8)
            com.appodeal.ads.modules.common.internal.service.ServiceVariant$Companion r8 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.INSTANCE     // Catch: java.lang.Throwable -> L5d
            java.util.List r8 = r8.getValues()     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L5d
        L47:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L60
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L5d
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r4 = (com.appodeal.ads.modules.common.internal.service.ServiceVariant) r4     // Catch: java.lang.Throwable -> L5d
            kotlin.Pair r4 = r5.d(r6, r7, r4)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L47
            r2.add(r4)     // Catch: java.lang.Throwable -> L5d
            goto L47
        L5d:
            r7 = move-exception
            r6 = r5
            goto L7f
        L60:
            com.appodeal.ads.e6 r6 = com.appodeal.ads.e6.f13272b     // Catch: java.lang.Throwable -> L5d
            r0.f15190r = r5     // Catch: java.lang.Throwable -> L5d
            r0.f15193u = r3     // Catch: java.lang.Throwable -> L5d
            com.appodeal.ads.y6 r7 = new com.appodeal.ads.y6     // Catch: java.lang.Throwable -> L5d
            r8 = 0
            r7.<init>(r2, r5, r6, r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r8 = kotlinx.coroutines.i.g(r7, r0)     // Catch: java.lang.Throwable -> L5d
            if (r8 != r1) goto L73
            return r1
        L73:
            r6 = r5
        L74:
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L2b
            r6.e(r8)     // Catch: java.lang.Throwable -> L2b
            java.util.LinkedHashMap r6 = r6.f13815e
            r6.clear()
            return r8
        L7f:
            java.util.LinkedHashMap r6 = r6.f13815e
            r6.clear()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n8.a(android.content.Context, com.appodeal.ads.networking.k, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        if (r14.await(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009e -> B:34:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c0 -> B:33:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.LinkedHashMap r12, com.appodeal.ads.n6 r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n8.c(java.util.LinkedHashMap, com.appodeal.ads.n6, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2 A[PHI: r28
  0x00f2: PHI (r28v5 kotlin.Pair) = (r28v2 kotlin.Pair), (r28v2 kotlin.Pair), (r28v3 kotlin.Pair), (r28v7 kotlin.Pair) binds: [B:38:0x0127, B:33:0x00fe, B:27:0x00f0, B:21:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair d(android.content.Context r30, com.appodeal.ads.networking.k r31, com.appodeal.ads.modules.common.internal.service.ServiceVariant r32) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n8.d(android.content.Context, com.appodeal.ads.networking.k, com.appodeal.ads.modules.common.internal.service.ServiceVariant):kotlin.Pair");
    }

    public final void e(Map map) {
        Object value;
        Collection collectionValues = map.values();
        ArrayList services = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            Object objL = ((Result) it.next()).l();
            if (Result.i(objL)) {
                objL = null;
            }
            Service service = (Service) objL;
            if (service != null) {
                services.add(service);
            }
        }
        if (services.isEmpty()) {
            return;
        }
        com.appodeal.ads.services.r rVar = this.f13814d;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(services, "services");
        MutableStateFlow mutableStateFlow = rVar.f14725c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, SetsKt.plus((Set) value, (Iterable) services)));
        rVar.f14723a.registerServices(services);
        rVar.f14724b.a(services);
        rVar.f14726d.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.content.Context r7, com.appodeal.ads.networking.k r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.c8
            if (r0 == 0) goto L13
            r0 = r9
            com.appodeal.ads.c8 r0 = (com.appodeal.ads.c8) r0
            int r1 = r0.f13168t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13168t = r1
            goto L18
        L13:
            com.appodeal.ads.c8 r0 = new com.appodeal.ads.c8
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f13166r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13168t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r9)
            goto L8a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.d.b(r9)
            com.appodeal.ads.modules.common.internal.service.ServiceVariant$Companion r9 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.INSTANCE
            java.util.List r9 = r9.getValues()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L43:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r9.next()
            r5 = r4
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r5 = (com.appodeal.ads.modules.common.internal.service.ServiceVariant) r5
            boolean r5 = r5.getRequiresSplitInitialization()
            if (r5 == 0) goto L43
            r2.add(r4)
            goto L43
        L5a:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L63:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r2.next()
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r4 = (com.appodeal.ads.modules.common.internal.service.ServiceVariant) r4
            kotlin.Pair r4 = r6.d(r7, r8, r4)
            if (r4 == 0) goto L63
            r9.add(r4)
            goto L63
        L79:
            com.appodeal.ads.i6 r7 = com.appodeal.ads.i6.f13420b
            r0.f13168t = r3
            com.appodeal.ads.y6 r8 = new com.appodeal.ads.y6
            r2 = 0
            r8.<init>(r9, r6, r7, r2)
            java.lang.Object r9 = kotlinx.coroutines.i.g(r8, r0)
            if (r9 != r1) goto L8a
            return r1
        L8a:
            java.util.Map r9 = (java.util.Map) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n8.f(android.content.Context, com.appodeal.ads.networking.k, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
