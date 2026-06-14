package com.mobilefuse.sdk.telemetry;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryCategory;", "", "()V", "AD", "", IronSourceConstants.APP_EVENT_TYPE, "BID", "EID", "EXCEPTION", LogConstants.KEY_SDK, "TELEMETRY", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetryCategory {

    @NotNull
    public static final String AD = "ad";

    @NotNull
    public static final String APP = "app";

    @NotNull
    public static final String BID = "bid";

    @NotNull
    public static final String EID = "eid";

    @NotNull
    public static final String EXCEPTION = "exception";

    @NotNull
    public static final TelemetryCategory INSTANCE = new TelemetryCategory();

    @NotNull
    public static final String SDK = "sdk";

    @NotNull
    public static final String TELEMETRY = "telemetry";

    private TelemetryCategory() {
    }
}
