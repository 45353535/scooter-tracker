package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "", "printInLogs", "", "getPrintInLogs", "()Z", "value", "", "getValue", "()Ljava/lang/String;", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public interface TelemetryParamType {
    boolean getPrintInLogs();

    @NotNull
    String getValue();
}
