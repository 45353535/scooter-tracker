package com.moloco.sdk.internal.services.config.handlers;

import com.moloco.sdk.Init$SDKInitResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {
    @Override // com.moloco.sdk.internal.services.config.handlers.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.configs.a a(Init$SDKInitResponse sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        if (!sdkInitResponse.hasOperationalMetricsConfig()) {
            return com.moloco.sdk.internal.configs.b.a();
        }
        Init$SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig = sdkInitResponse.getOperationalMetricsConfig();
        String url = operationalMetricsConfig.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        return new com.moloco.sdk.internal.configs.a(url, operationalMetricsConfig.getPollingIntervalSeconds());
    }

    @Override // com.moloco.sdk.internal.services.config.handlers.a
    public Class a() {
        return com.moloco.sdk.internal.configs.a.class;
    }
}
