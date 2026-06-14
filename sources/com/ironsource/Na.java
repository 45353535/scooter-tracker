package com.ironsource;

import com.ironsource.AbstractC4341h3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Na implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ea f41448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final K2 f41449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final K2 f41450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41451d;

    public Na(@NotNull Ea strategy, @NotNull K2 currentAdUnit, @NotNull K2 reloadingAdUnit, long j10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f41448a = strategy;
        this.f41449b = currentAdUnit;
        this.f41450c = reloadingAdUnit;
        this.f41451d = j10;
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
        this.f41449b.a(true);
        this.f41450c.a(true);
        Ea ea2 = this.f41448a;
        ea2.a((Oa) new Ha(ea2));
    }

    @Override // com.ironsource.Oa
    public void d() {
        Ea ea2 = this.f41448a;
        ea2.a((Oa) new Ka(ea2, this.f41449b));
    }

    @Override // com.ironsource.Oa
    public void f() {
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41448a.a(adUnitCallback, this.f41450c, this.f41449b, (AbstractC4341h3) new AbstractC4341h3.c(this.f41448a.p().a() - this.f41451d, AbstractC4341h3.d.C0462d.f43220a), false, Long.valueOf(this.f41451d));
    }

    @Override // com.ironsource.Oa
    public void b() {
        this.f41448a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41448a.a(ironSourceError, this.f41449b, (AbstractC4341h3) new AbstractC4341h3.c(this.f41448a.p().a() - this.f41451d, AbstractC4341h3.d.c.f43219a), true, false, Long.valueOf(this.f41451d));
    }
}
