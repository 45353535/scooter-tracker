package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4383jc implements InterfaceC4367ic {
    @Override // com.ironsource.InterfaceC4367ic
    public void a(@NotNull L9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e10.getMessage());
        }
    }
}
