package com.amazon.aps.shared.metrics.model;

import android.os.Build;
import com.amazon.device.ads.DtbDeviceData;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\r¨\u0006*"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsDeviceInfo;", "", "platformCategory", "", DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY, "deviceType", "connectionType", "platformCategoryVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatformCategory", "()Ljava/lang/String;", "setPlatformCategory", "(Ljava/lang/String;)V", "getScreenSize", "setScreenSize", "getDeviceType", "setDeviceType", "getConnectionType", "setConnectionType", "getPlatformCategoryVersion", "setPlatformCategoryVersion", "os", "getOs", "setOs", "platform", "getPlatform", "setPlatform", "toJsonObject", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsDeviceInfo {

    @Nullable
    private String connectionType;

    @Nullable
    private String deviceType;

    @NotNull
    private String os;

    @NotNull
    private String platform;

    @Nullable
    private String platformCategory;

    @Nullable
    private String platformCategoryVersion;

    @Nullable
    private String screenSize;

    public ApsMetricsDeviceInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ApsMetricsDeviceInfo copy$default(ApsMetricsDeviceInfo apsMetricsDeviceInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsDeviceInfo.platformCategory;
        }
        if ((i10 & 2) != 0) {
            str2 = apsMetricsDeviceInfo.screenSize;
        }
        if ((i10 & 4) != 0) {
            str3 = apsMetricsDeviceInfo.deviceType;
        }
        if ((i10 & 8) != 0) {
            str4 = apsMetricsDeviceInfo.connectionType;
        }
        if ((i10 & 16) != 0) {
            str5 = apsMetricsDeviceInfo.platformCategoryVersion;
        }
        String str6 = str5;
        String str7 = str3;
        return apsMetricsDeviceInfo.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatformCategory() {
        return this.platformCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScreenSize() {
        return this.screenSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlatformCategoryVersion() {
        return this.platformCategoryVersion;
    }

    @NotNull
    public final ApsMetricsDeviceInfo copy(@Nullable String platformCategory, @Nullable String screenSize, @Nullable String deviceType, @Nullable String connectionType, @Nullable String platformCategoryVersion) {
        return new ApsMetricsDeviceInfo(platformCategory, screenSize, deviceType, connectionType, platformCategoryVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApsMetricsDeviceInfo)) {
            return false;
        }
        ApsMetricsDeviceInfo apsMetricsDeviceInfo = (ApsMetricsDeviceInfo) other;
        return Intrinsics.areEqual(this.platformCategory, apsMetricsDeviceInfo.platformCategory) && Intrinsics.areEqual(this.screenSize, apsMetricsDeviceInfo.screenSize) && Intrinsics.areEqual(this.deviceType, apsMetricsDeviceInfo.deviceType) && Intrinsics.areEqual(this.connectionType, apsMetricsDeviceInfo.connectionType) && Intrinsics.areEqual(this.platformCategoryVersion, apsMetricsDeviceInfo.platformCategoryVersion);
    }

    @Nullable
    public final String getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getPlatformCategory() {
        return this.platformCategory;
    }

    @Nullable
    public final String getPlatformCategoryVersion() {
        return this.platformCategoryVersion;
    }

    @Nullable
    public final String getScreenSize() {
        return this.screenSize;
    }

    public int hashCode() {
        String str = this.platformCategory;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.screenSize;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.connectionType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.platformCategoryVersion;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setConnectionType(@Nullable String str) {
        this.connectionType = str;
    }

    public final void setDeviceType(@Nullable String str) {
        this.deviceType = str;
    }

    public final void setOs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os = str;
    }

    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final void setPlatformCategory(@Nullable String str) {
        this.platformCategory = str;
    }

    public final void setPlatformCategoryVersion(@Nullable String str) {
        this.platformCategoryVersion = str;
    }

    public final void setScreenSize(@Nullable String str) {
        this.screenSize = str;
    }

    @NotNull
    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os", this.os);
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORM, this.platform);
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_OSVERSION, String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, Build.MANUFACTURER);
        jSONObject.put("md", Build.MODEL);
        String str = this.platformCategoryVersion;
        if (str != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORYVERSION, str);
        }
        String str2 = this.platformCategory;
        if (str2 != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY, str2);
        }
        String str3 = this.screenSize;
        if (str3 != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, str3);
        }
        String str4 = this.deviceType;
        if (str4 != null) {
            jSONObject.put("dt", str4);
        }
        String str5 = this.connectionType;
        if (str5 != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE, str5);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsDeviceInfo(platformCategory=" + this.platformCategory + ", screenSize=" + this.screenSize + ", deviceType=" + this.deviceType + ", connectionType=" + this.connectionType + ", platformCategoryVersion=" + this.platformCategoryVersion + ")";
    }

    public ApsMetricsDeviceInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.platformCategory = str;
        this.screenSize = str2;
        this.deviceType = str3;
        this.connectionType = str4;
        this.platformCategoryVersion = str5;
        this.os = "android";
        this.platform = "app";
    }

    public /* synthetic */ ApsMetricsDeviceInfo(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
