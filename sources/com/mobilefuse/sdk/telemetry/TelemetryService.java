package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\fH&¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryService;", "", "captureException", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "sender", "", "breadcrumbs", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "modules", "", "variables", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public interface TelemetryService {
    void captureException(@NotNull Throwable e10, @NotNull String sender, @NotNull List<TelemetryBreadcrumb> breadcrumbs, @NotNull Map<String, String> modules, @NotNull Map<String, String> variables);
}
