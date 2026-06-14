package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4492q0 implements InterfaceC4323g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4304f0 f44669a;

    public C4492q0(@NotNull C4304f0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f44669a = adProperties;
    }

    @Override // com.ironsource.InterfaceC4323g2
    public void a(@NotNull com.ironsource.mediationsdk.i auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f44669a.c());
        auctionRequestParams.a(this.f44669a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
