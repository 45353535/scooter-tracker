package com.amazon.aps.shared.metrics.model;

import com.amazon.aps.shared.ApsMetrics;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsSdkInfo;", "", "version", "", "appid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "getAppid", "setAppid", "toJsonObject", "Lorg/json/JSONObject;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsSdkInfo {

    @Nullable
    private String appid;

    @Nullable
    private String version;

    public ApsMetricsSdkInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsSdkInfo copy$default(ApsMetricsSdkInfo apsMetricsSdkInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsSdkInfo.version;
        }
        if ((i10 & 2) != 0) {
            str2 = apsMetricsSdkInfo.appid;
        }
        return apsMetricsSdkInfo.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppid() {
        return this.appid;
    }

    @NotNull
    public final ApsMetricsSdkInfo copy(@Nullable String version, @Nullable String appid) {
        return new ApsMetricsSdkInfo(version, appid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApsMetricsSdkInfo)) {
            return false;
        }
        ApsMetricsSdkInfo apsMetricsSdkInfo = (ApsMetricsSdkInfo) other;
        return Intrinsics.areEqual(this.version, apsMetricsSdkInfo.version) && Intrinsics.areEqual(this.appid, apsMetricsSdkInfo.appid);
    }

    @Nullable
    public final String getAppid() {
        return this.appid;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAppid(@Nullable String str) {
        this.appid = str;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.version;
        if (str != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_APSVERSION, str);
        }
        String adapterVersion = ApsMetrics.Companion.getAdapterVersion();
        if (adapterVersion != null) {
            jSONObject.put("av", adapterVersion);
        }
        String str2 = this.appid;
        if (str2 != null) {
            jSONObject.put("aid", str2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsSdkInfo(version=" + this.version + ", appid=" + this.appid + ")";
    }

    public ApsMetricsSdkInfo(@Nullable String str, @Nullable String str2) {
        this.version = str;
        this.appid = str2;
    }

    public /* synthetic */ ApsMetricsSdkInfo(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
