package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ha implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ea f41047a;

    public Ha(@NotNull Ea strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f41047a = strategy;
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
        this.f41047a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Oa
    public void d() {
        this.f41047a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Oa
    public void f() {
        this.f41047a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41047a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Oa
    public void b() {
        this.f41047a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41047a.a("Received load failed on a destroyed ad");
    }
}
