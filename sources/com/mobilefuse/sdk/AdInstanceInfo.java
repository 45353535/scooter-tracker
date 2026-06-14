package com.mobilefuse.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AdInstanceInfo {
    private static int NEXT_AD_INSTANCE_ID = 1;

    @Nullable
    protected String adSize;

    @NonNull
    protected final String adType;
    protected final int instanceId;

    @Nullable
    protected String placementId;
    protected String renderType;

    @NonNull
    protected TelemetryAgent telemetryAgent;

    public AdInstanceInfo(@NonNull Object obj, @NonNull String str) {
        this(obj, str, null);
    }

    public TelemetryAdInfo createTelemetryAdInfo() {
        return new TelemetryAdInfo(this.instanceId, this.adType, this.placementId, this.adSize, this.renderType);
    }

    public void fillTelemetryExtras(List<TelemetryActionParam> list) {
        try {
            list.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(this.instanceId), true));
            list.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_TYPE, this.adType, true));
            String str = this.placementId;
            if (str != null) {
                list.add(new TelemetryActionParam(TelemetrySdkParamType.PLACEMENT_ID, str, true));
            }
            String str2 = this.adSize;
            if (str2 != null) {
                list.add(new TelemetryActionParam(TelemetrySdkParamType.AD_SIZE, str2, true));
            }
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public String getAdSize() {
        return this.adSize;
    }

    @NonNull
    public String getAdType() {
        return this.adType;
    }

    public int getInstanceId() {
        return this.instanceId;
    }

    @Nullable
    public String getPlacementId() {
        return this.placementId;
    }

    public String getRenderType() {
        return this.renderType;
    }

    @NonNull
    public TelemetryAgent getTelemetryAgent() {
        return this.telemetryAgent;
    }

    public void setAdSize(@Nullable String str) {
        this.adSize = str;
    }

    public void setPlacementId(@Nullable String str) {
        this.placementId = str;
    }

    public void setRenderType(String str) {
        this.renderType = str;
    }

    public AdInstanceInfo(@NonNull Object obj, @NonNull String str, @Nullable String str2) {
        int i10 = NEXT_AD_INSTANCE_ID;
        NEXT_AD_INSTANCE_ID = i10 + 1;
        this.instanceId = i10;
        this.renderType = "";
        this.adType = str.toUpperCase();
        this.placementId = str2;
        this.telemetryAgent = new TelemetryAgent(obj);
    }

    public TelemetryAdInfo createTelemetryAdInfo(ObservableConfig observableConfig) {
        Boolean boolValueOf = null;
        try {
            ObservableConfigKey observableConfigKey = ObservableConfigKey.VIDEO_STREAM_ENABLED;
            if (observableConfig.hasValue(observableConfigKey)) {
                boolValueOf = Boolean.valueOf(observableConfig.getBooleanValue(observableConfigKey));
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        return new TelemetryAdInfo(this.instanceId, this.adType, this.placementId, this.adSize, this.renderType, boolValueOf);
    }
}
