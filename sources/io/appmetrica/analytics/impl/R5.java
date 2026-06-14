package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class R5 implements Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5339p5 f76335a;

    public R5(@NotNull C5339p5 c5339p5) {
        this.f76335a = c5339p5;
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final C5339p5 getAdRevenueProcessorsHolder() {
        return this.f76335a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f76335a;
    }
}
