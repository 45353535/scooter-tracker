package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ua implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Qa f41842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final K2 f41843b;

    public Ua(@NotNull Qa strategy, @NotNull K2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f41842a = strategy;
        this.f41843b = adUnit;
    }

    @Override // com.ironsource.Va
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41842a.a(adUnitCallback, this.f41843b);
        Qa qa2 = this.f41842a;
        qa2.a(new Ta(qa2, this.f41843b));
    }

    @Override // com.ironsource.Va
    public void b() {
        this.f41842a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Va
    public void c() {
        this.f41843b.a(true);
        this.f41842a.a((K2) null);
        Qa qa2 = this.f41842a;
        qa2.a(new Sa(qa2));
    }

    @Override // com.ironsource.Va
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41842a.a(ironSourceError);
        this.f41843b.a(false);
        this.f41842a.a((K2) null);
        Qa qa2 = this.f41842a;
        qa2.a(new Sa(qa2));
    }
}
