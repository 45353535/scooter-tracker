package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class S3 extends T7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f37692n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(AdConfig.ViewabilityConfig viewabilityConfig, InterfaceC3878m9 interfaceC3878m9) {
        super(viewabilityConfig, (byte) 1, interfaceC3878m9);
        C3901n7 visibilityChecker = C3976q7.f39351k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.f37692n = 500;
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.Sn
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f39932l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.f37692n;
    }
}
