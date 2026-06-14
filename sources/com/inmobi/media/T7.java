package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class T7 extends AbstractC4159xg {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f37758m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T7(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, InterfaceC3878m9 interfaceC3878m9) {
        super(viewabilityConfig, b10, interfaceC3878m9);
        C3901n7 visibilityChecker = C3976q7.f39351k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.f37758m = 1000;
    }

    @Override // com.inmobi.media.Sn
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f39932l;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.f37758m;
    }
}
