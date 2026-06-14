package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Bb implements S5<Ab> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f40444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4521rd f40445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4271d1 f40446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f40447d;

    public Bb(@NotNull String adm, @NotNull InterfaceC4521rd providerName, @NotNull InterfaceC4271d1 adapterConfigs, boolean z10) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.f40444a = adm;
        this.f40445b = providerName;
        this.f40446c = adapterConfigs;
        this.f40447d = z10;
    }

    @Override // com.ironsource.S5
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Ab a() throws Exception {
        InterfaceC4397k9 interfaceC4397k9A = this.f40446c.a(this.f40445b);
        new S(this.f40444a, interfaceC4397k9A, this.f40447d).a();
        if (interfaceC4397k9A != null) {
            return new Ab(interfaceC4397k9A.f(), interfaceC4397k9A.e(), interfaceC4397k9A.b(), interfaceC4397k9A.d(), false, 16, null);
        }
        return null;
    }
}
