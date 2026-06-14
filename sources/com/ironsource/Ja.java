package com.ironsource;

import com.ironsource.AbstractC4341h3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ja implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ea f41173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final K2 f41174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41175c;

    public Ja(@NotNull Ea strategy, @NotNull K2 currentAdUnit, boolean z10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f41173a = strategy;
        this.f41174b = currentAdUnit;
        this.f41175c = z10;
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
        this.f41174b.a(true);
        Ea ea2 = this.f41173a;
        ea2.a((Oa) new Ha(ea2));
    }

    @Override // com.ironsource.Oa
    public void d() {
        this.f41175c = true;
    }

    @Override // com.ironsource.Oa
    public void f() {
        this.f41175c = false;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f41173a.a(adUnitCallback, this.f41174b, (K2) null, new AbstractC4341h3.a(AbstractC4341h3.b.C0461b.f43213a), this.f41175c, (Long) null);
    }

    @Override // com.ironsource.Oa
    public void b() {
        this.f41173a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41173a.a(ironSourceError, this.f41174b, (AbstractC4341h3) new AbstractC4341h3.a(AbstractC4341h3.b.a.f43212a), false, this.f41175c, (Long) null);
    }
}
