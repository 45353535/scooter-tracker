package com.appodeal.ads.analytics.breadcrumbs;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12650c;

    public a(String key, String event, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f12648a = key;
        this.f12649b = event;
        this.f12650c = str;
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final Map a() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("Event", this.f12649b);
        String str = this.f12650c;
        if (str != null) {
            mapCreateMapBuilder.put("Message", str);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final String getKey() {
        return this.f12648a;
    }
}
