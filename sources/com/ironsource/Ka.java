package com.ironsource;

import com.ironsource.AbstractC4341h3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ka implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ea f41207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final K2 f41208b;

    public Ka(@NotNull Ea strategy, @NotNull K2 currentAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f41207a = strategy;
        this.f41208b = currentAdUnit;
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void a() {
        li.a(this);
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void b(C4525s0 c4525s0) {
        li.b(this, c4525s0);
    }

    @Override // com.ironsource.Oa
    public void c() {
        this.f41208b.a(true);
        Ea ea2 = this.f41207a;
        ea2.a((Oa) new Ha(ea2));
    }

    @Override // com.ironsource.Oa
    public void d() {
    }

    @Override // com.ironsource.Oa
    public void f() {
        this.f41207a.a(this.f41208b, new AbstractC4341h3.a(AbstractC4341h3.b.c.f43214a));
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41207a.a("Received load success while paused");
    }

    @Override // com.ironsource.Oa
    public void b() {
        this.f41207a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41207a.a("Received load failed while paused");
    }
}
