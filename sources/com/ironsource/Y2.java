package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Y2 implements InterfaceC4397k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4237b1 f42114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T2 f42115b;

    public Y2(@NotNull C4237b1 adapterConfig, @NotNull T2 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f42114a = adapterConfig;
        this.f42115b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4254c1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4541t
    public long b() {
        return this.f42115b.b();
    }

    @Override // com.ironsource.InterfaceC4254c1
    @NotNull
    public String c() {
        String strF = this.f42114a.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC4254c1
    public boolean d() {
        return !this.f42114a.j();
    }

    @Override // com.ironsource.InterfaceC4254c1
    @NotNull
    public String e() {
        String strA = this.f42114a.a();
        Intrinsics.checkNotNullExpressionValue(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC4254c1
    @NotNull
    public EnumC4431m9 f() {
        return EnumC4431m9.f43719b.a(this.f42114a.d());
    }
}
