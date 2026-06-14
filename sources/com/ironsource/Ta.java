package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ta implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Qa f41804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final K2 f41805b;

    public Ta(@NotNull Qa strategy, @NotNull K2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f41804a = strategy;
        this.f41805b = adUnit;
    }

    @Override // com.ironsource.Va
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41804a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Va
    public void b() {
        this.f41804a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Va
    public void c() {
        this.f41805b.a(true);
        this.f41804a.a((K2) null);
        Qa qa2 = this.f41804a;
        qa2.a(new Sa(qa2));
    }

    @Override // com.ironsource.Va
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41804a.a("Ad unit is already loaded");
    }
}
