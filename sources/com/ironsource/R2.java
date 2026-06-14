package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class R2 extends C4492q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final ISBannerSize f41655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(@NotNull C4304f0 adProperties, @Nullable ISBannerSize iSBannerSize) {
        super(adProperties);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f41655b = iSBannerSize;
    }

    @Override // com.ironsource.C4492q0, com.ironsource.InterfaceC4323g2
    public void a(@NotNull com.ironsource.mediationsdk.i auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.f41655b);
    }
}
