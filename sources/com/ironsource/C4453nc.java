package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4453nc implements InterfaceC4434mc {
    @Override // com.ironsource.InterfaceC4434mc
    public void a(@NotNull Jc onNetworkSDKInitListener) {
        Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC4434mc
    public void b(@NotNull String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC4434mc
    public void a(@NotNull Context applicationContext, @NotNull String applicationKey, @NotNull String userId, @NotNull Map<String, String> initParams) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC4434mc
    public void a(@NotNull String controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC4434mc
    public void a(int i10) {
        SDKUtils.setDebugMode(i10);
    }
}
