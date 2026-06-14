package com.appodeal.ads.analytics.breadcrumbs;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12656b;

    public c(String state, String screen) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f12655a = state;
        this.f12656b = screen;
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final Map a() {
        return MapsKt.mapOf(TuplesKt.to("State", this.f12655a), TuplesKt.to("Screen", this.f12656b));
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.e
    public final String getKey() {
        return LogConstants.KEY_NAVIGATION;
    }
}
