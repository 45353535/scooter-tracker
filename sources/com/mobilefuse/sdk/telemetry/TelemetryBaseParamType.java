package com.mobilefuse.sdk.telemetry;

import com.taurusx.tax.utils.webview.TaxBrowserActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryBaseParamType;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "value", "", "printInLogs", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getPrintInLogs", "()Z", "getValue", "()Ljava/lang/String;", "EXCEPTION_DETAILS", "STATUS_CODE", "REASON", TaxBrowserActivity.f66923n, "BODY", "HEADERS", "REQUEST_METHOD", "REQUEST_ACTION_INSTANCE", "DATA_VALID", "AD_CLICKTHROUGH", "AD_EXPIRY", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public enum TelemetryBaseParamType implements TelemetryParamType {
    EXCEPTION_DETAILS("exceptionDetails", false, 2, null),
    STATUS_CODE("bid.response.httpcode", false, 2, null),
    REASON("bid.ineligible.reason", false, 2, null),
    URL("bid.request.url", false, 2, null),
    BODY("body", false, 2, null),
    HEADERS("headers", false, 2, null),
    REQUEST_METHOD("bid.request.httpmethod", false, 2, null),
    REQUEST_ACTION_INSTANCE("requestActionInstance", false),
    DATA_VALID("dataValid", false, 2, null),
    AD_CLICKTHROUGH("ad.clickurl", false, 2, null),
    AD_EXPIRY("ad.expiry", false, 2, null);

    private final boolean printInLogs;

    @NotNull
    private final String value;

    TelemetryBaseParamType(String str, boolean z10) {
        this.value = str;
        this.printInLogs = z10;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    public boolean getPrintInLogs() {
        return this.printInLogs;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    @NotNull
    public String getValue() {
        return this.value;
    }

    /* synthetic */ TelemetryBaseParamType(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
