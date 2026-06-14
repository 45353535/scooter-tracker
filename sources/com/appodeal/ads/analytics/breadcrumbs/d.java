package com.appodeal.ads.analytics.breadcrumbs;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdType f12658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12659c;

    public d(AdType adType, String request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12657a = request;
        this.f12658b = adType;
        this.f12659c = LogConstants.KEY_NETWORK_API;
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final Map a() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("Request", this.f12657a);
        AdType adType = this.f12658b;
        if (adType != null) {
            mapCreateMapBuilder.put("Ad type", adType.getDisplayName());
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final String getKey() {
        return this.f12659c;
    }
}
