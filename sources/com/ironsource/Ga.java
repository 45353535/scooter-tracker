package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ga implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ea f40973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40974b;

    public Ga(@NotNull Ea strategy, boolean z10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f40973a = strategy;
        this.f40974b = z10;
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
        Ea ea2 = this.f40973a;
        ea2.a((Oa) new Ha(ea2));
    }

    @Override // com.ironsource.Oa
    public void d() {
        this.f40974b = true;
    }

    @Override // com.ironsource.Oa
    public void f() {
        this.f40974b = false;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f40973a.a("Received load success before load");
    }

    @Override // com.ironsource.Oa
    public void b() {
        K2 k2A = this.f40973a.j().a(true);
        k2A.a(this.f40973a.g());
        this.f40973a.a((Oa) new Ja(this.f40973a, k2A, this.f40974b));
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f40973a.a("Received load failed before load");
    }

    public /* synthetic */ Ga(Ea ea2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(ea2, (i10 & 2) != 0 ? false : z10);
    }
}
