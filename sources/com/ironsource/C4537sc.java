package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4537sc implements InterfaceC4520rc {
    @Override // com.ironsource.InterfaceC4520rc
    public void a(@NotNull L9 adInstance, @NotNull C4554tc loadParams) throws Exception {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }

    @Override // com.ironsource.InterfaceC4520rc
    @NotNull
    public String a() {
        String version = IronSourceNetwork.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }
}
