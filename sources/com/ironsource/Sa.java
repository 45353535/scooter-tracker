package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Sa implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Qa f41740a;

    public Sa(@NotNull Qa strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f41740a = strategy;
    }

    @Override // com.ironsource.Va
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41740a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Va
    public void b() {
        this.f41740a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Va
    public void c() {
        this.f41740a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Va
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41740a.a("Received load failed on a destroyed ad");
    }
}
