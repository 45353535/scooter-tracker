package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class In {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4198z5 f37083c;

    public In(AdConfig.VideoPlayerViewabilityConfig viewableConfig) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        this.f37081a = viewableConfig.getMinPercentageVisible();
        this.f37082b = viewableConfig.getPollingInterval();
        this.f37083c = AbstractC3766hl.a(viewableConfig.getMinDimensions());
    }
}
