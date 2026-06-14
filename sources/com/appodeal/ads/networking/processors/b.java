package com.appodeal.ads.networking.processors;

import com.appodeal.ads.context.o;
import com.appodeal.ads.network.IndexProvider;
import com.appodeal.ads.services.ua.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndexProvider f14150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f14151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f14152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.appodeal.ads.targeting.d f14153d;

    public b(IndexProvider indexProvider, o contextProvider, j servicesEventManager, com.appodeal.ads.targeting.d targetingParamsManager) {
        Intrinsics.checkNotNullParameter(indexProvider, "indexProvider");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(servicesEventManager, "servicesEventManager");
        Intrinsics.checkNotNullParameter(targetingParamsManager, "targetingParamsManager");
        this.f14150a = indexProvider;
        this.f14151b = contextProvider;
        this.f14152c = servicesEventManager;
        this.f14153d = targetingParamsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    @Override // com.appodeal.ads.networking.processors.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.appodeal.ads.networking.b0 r13, com.appodeal.ads.network.NetworkResponse.JsonResult r14) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.processors.b.a(com.appodeal.ads.networking.b0, com.appodeal.ads.network.NetworkResponse$JsonResult):void");
    }
}
