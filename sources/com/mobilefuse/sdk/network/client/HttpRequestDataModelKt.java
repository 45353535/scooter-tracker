package com.mobilefuse.sdk.network.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"telemetryBody", "", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "getTelemetryBody", "(Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;)Ljava/lang/String;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class HttpRequestDataModelKt {
    @NotNull
    public static final String getTelemetryBody(@NotNull HttpParamsPostBody telemetryBody) {
        Intrinsics.checkNotNullParameter(telemetryBody, "$this$telemetryBody");
        return telemetryBody.getParams().toString();
    }
}
