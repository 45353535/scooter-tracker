package com.mobilefuse.sdk;

import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/KtInternalProxy;", "", "()V", "sdkInternalTelemetryAgent", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "getSdkInternalTelemetryAgent$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class KtInternalProxy {

    @NotNull
    public static final KtInternalProxy INSTANCE = new KtInternalProxy();

    @NotNull
    private static final TelemetryAgent sdkInternalTelemetryAgent;

    static {
        TelemetryAgent telemetryAgent = MobileFuse.sdkImpl.telemetryAgent;
        Intrinsics.checkNotNullExpressionValue(telemetryAgent, "MobileFuse.sdkImpl.telemetryAgent");
        sdkInternalTelemetryAgent = telemetryAgent;
    }

    private KtInternalProxy() {
    }

    @NotNull
    public final TelemetryAgent getSdkInternalTelemetryAgent$mobilefuse_sdk_core_release() {
        return sdkInternalTelemetryAgent;
    }
}
