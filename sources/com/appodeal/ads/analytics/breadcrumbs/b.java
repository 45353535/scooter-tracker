package com.appodeal.ads.analytics.breadcrumbs;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.uc;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdType f12652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc f12653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12654d;

    public b(String event, AdType adType, uc ucVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f12651a = event;
        this.f12652b = adType;
        this.f12653c = ucVar;
        this.f12654d = LogConstants.KEY_MEDIATION;
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final Map a() {
        AdNetwork adNetwork;
        String name;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("Event", this.f12651a);
        mapCreateMapBuilder.put("Ad type", this.f12652b.getDisplayName());
        uc ucVar = this.f12653c;
        if (ucVar != null && (adNetwork = ucVar.f14936b) != null && (name = adNetwork.getName()) != null) {
            mapCreateMapBuilder.put("Ad network", name);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final String getKey() {
        return this.f12654d;
    }
}
