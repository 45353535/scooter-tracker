package com.appodeal.ads.services;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ServicesRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14644a = new LinkedHashMap();

    @Override // com.appodeal.ads.modules.common.internal.service.ServicesRegistry
    public final List getAvailableServicesInfo() {
        Service service;
        List<ServiceVariant> values = ServiceVariant.INSTANCE.getValues();
        ArrayList arrayList = new ArrayList();
        for (ServiceVariant serviceVariant : values) {
            try {
                Class<?> cls = Class.forName(serviceVariant.getClassName(), false, c.class.getClassLoader());
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<com.appodeal.ads.modules.common.internal.service.Service<Options of com.appodeal.ads.services.ServicesRegistryImpl.obtainServiceClass>>");
                Object objNewInstance = cls.newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.appodeal.ads.modules.common.internal.service.Service<com.appodeal.ads.modules.common.internal.service.ServiceOptions>");
                service = (Service) objNewInstance;
                this.f14644a.put(serviceVariant, service);
            } catch (Exception e10) {
                LogExtKt.logInternal("ServicesRegistry", "service error:", e10);
                service = null;
            }
            if (service != null) {
                arrayList.add(service);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Service) it.next()).getInfo());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.modules.common.internal.service.ServicesRegistry
    /* JADX INFO: renamed from: initialize-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4431initialize0E7RQCE(com.appodeal.ads.modules.common.internal.service.ServiceVariant r7, com.appodeal.ads.modules.common.internal.service.ServiceOptions r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.c.mo4431initialize0E7RQCE(com.appodeal.ads.modules.common.internal.service.ServiceVariant, com.appodeal.ads.modules.common.internal.service.ServiceOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.modules.common.internal.service.ServicesRegistry
    /* JADX INFO: renamed from: preInitialize-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4432preInitialize0E7RQCE(com.appodeal.ads.modules.common.internal.service.ServiceVariant r7, com.appodeal.ads.modules.common.internal.service.ServiceOptions r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.services.b
            if (r0 == 0) goto L13
            r0 = r9
            com.appodeal.ads.services.b r0 = (com.appodeal.ads.services.b) r0
            int r1 = r0.f14643u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14643u = r1
            goto L18
        L13:
            com.appodeal.ads.services.b r0 = new com.appodeal.ads.services.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f14641s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14643u
            java.lang.String r3 = "ServicesRegistry"
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            com.appodeal.ads.modules.common.internal.service.Service r7 = r0.f14640r
            kotlin.d.b(r9)     // Catch: java.lang.Exception -> L33
            kotlin.Result r9 = (kotlin.Result) r9     // Catch: java.lang.Exception -> L33
            java.lang.Object r8 = r9.l()     // Catch: java.lang.Exception -> L33
            goto L92
        L33:
            r8 = move-exception
            goto La4
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.d.b(r9)
            java.util.LinkedHashMap r9 = r6.f14644a
            java.lang.Object r9 = r9.get(r7)
            boolean r2 = r9 instanceof com.appodeal.ads.modules.common.internal.service.Service
            r5 = 0
            if (r2 == 0) goto L4e
            com.appodeal.ads.modules.common.internal.service.Service r9 = (com.appodeal.ads.modules.common.internal.service.Service) r9
            goto L4f
        L4e:
            r9 = r5
        L4f:
            if (r9 != 0) goto L71
            java.lang.String r7 = r7.getClassName()
            java.lang.Class<com.appodeal.ads.services.c> r9 = com.appodeal.ads.services.c.class
            java.lang.ClassLoader r9 = r9.getClassLoader()
            r2 = 0
            java.lang.Class r7 = java.lang.Class.forName(r7, r2, r9)
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.Class<com.appodeal.ads.modules.common.internal.service.Service<Options of com.appodeal.ads.services.ServicesRegistryImpl.obtainServiceClass>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r9)
            java.lang.Object r7 = r7.newInstance()
            java.lang.String r9 = "null cannot be cast to non-null type com.appodeal.ads.modules.common.internal.service.Service<com.appodeal.ads.modules.common.internal.service.ServiceOptions>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r9)
            com.appodeal.ads.modules.common.internal.service.Service r7 = (com.appodeal.ads.modules.common.internal.service.Service) r7
            goto L72
        L71:
            r7 = r9
        L72:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "preInitialize service: "
            r9.append(r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r2 = 4
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r3, r9, r5, r2, r5)
            r0.f14640r = r7     // Catch: java.lang.Exception -> L33
            r0.f14643u = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r8 = r7.mo4429preInitializegIAlus(r8, r0)     // Catch: java.lang.Exception -> L33
            if (r8 != r1) goto L92
            return r1
        L92:
            boolean r9 = kotlin.Result.j(r8)     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L9f
            kotlin.Unit r8 = (kotlin.Unit) r8     // Catch: java.lang.Exception -> L33
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Exception -> L33
            return r7
        L9f:
            java.lang.Object r7 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L33
            return r7
        La4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "preInitialize service error: "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.appodeal.ads.ext.LogExtKt.logInternal(r3, r7, r8)
            java.lang.Object r7 = com.appodeal.ads.ext.ResultExtKt.asFailure(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.c.mo4432preInitialize0E7RQCE(com.appodeal.ads.modules.common.internal.service.ServiceVariant, com.appodeal.ads.modules.common.internal.service.ServiceOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
