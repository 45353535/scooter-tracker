package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5073ek implements ServiceComponentModuleConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5487v4 f77133a;

    public C5073ek(@NotNull C5487v4 c5487v4) {
        this.f77133a = c5487v4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f77133a.f78421m, Boolean.TRUE)).booleanValue();
    }
}
