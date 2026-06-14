package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ra implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Qa f41665a;

    public Ra(@NotNull Qa strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f41665a = strategy;
    }

    @Override // com.ironsource.Va
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41665a.a("Received load success before load called");
    }

    @Override // com.ironsource.Va
    public void b() {
        K2 k2A = this.f41665a.i().a(true);
        this.f41665a.a(k2A);
        Qa qa2 = this.f41665a;
        qa2.a(new Ua(qa2, k2A));
        k2A.a(this.f41665a.g());
    }

    @Override // com.ironsource.Va
    public void c() {
        K2 k2K = this.f41665a.k();
        if (k2K != null) {
            k2K.a(false);
        }
        this.f41665a.a((K2) null);
        Qa qa2 = this.f41665a;
        qa2.a(new Sa(qa2));
    }

    @Override // com.ironsource.Va
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41665a.a("Received load failed before load called");
    }
}
