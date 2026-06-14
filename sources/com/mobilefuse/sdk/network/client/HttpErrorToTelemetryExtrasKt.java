package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.helpers.StringExtensionsKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryBaseParamType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0005¨\u0006\u0006"}, d2 = {"toHttpTelemetryExtras", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "Lcom/mobilefuse/sdk/network/client/HttpError$ConnectionError;", "toTelemetryExtras", "Lcom/mobilefuse/sdk/exception/BaseError;", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class HttpErrorToTelemetryExtrasKt {
    @NotNull
    public static final List<TelemetryActionParam> toHttpTelemetryExtras(@NotNull HttpError.ConnectionError toHttpTelemetryExtras) {
        Intrinsics.checkNotNullParameter(toHttpTelemetryExtras, "$this$toHttpTelemetryExtras");
        List<TelemetryActionParam> listMutableListOf = CollectionsKt.mutableListOf(new TelemetryActionParam(TelemetryBaseParamType.STATUS_CODE, Integer.valueOf(toHttpTelemetryExtras.getStatusCode()), false));
        toTelemetryExtras(toHttpTelemetryExtras);
        return listMutableListOf;
    }

    @NotNull
    public static final List<TelemetryActionParam> toTelemetryExtras(@NotNull BaseError toTelemetryExtras) {
        Intrinsics.checkNotNullParameter(toTelemetryExtras, "$this$toTelemetryExtras");
        ArrayList arrayList = new ArrayList();
        String message = toTelemetryExtras.getMessage();
        if (message != null) {
            arrayList.add(new TelemetryActionParam(TelemetryBaseParamType.REASON, StringExtensionsKt.sanitizeJsonString("Error Message: " + message), true));
        }
        return arrayList;
    }
}
