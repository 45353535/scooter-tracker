package com.google.firebase.sessions;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbDeviceData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", "", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "deviceModel", "sessionSdkVersion", DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, "Lcom/google/firebase/sessions/LogEnvironment;", "logEnvironment", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "androidAppInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/google/firebase/sessions/LogEnvironment;", "component6", "()Lcom/google/firebase/sessions/AndroidApplicationInfo;", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)Lcom/google/firebase/sessions/ApplicationInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAppId", "b", "getDeviceModel", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getSessionSdkVersion", "d", "getOsVersion", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/google/firebase/sessions/LogEnvironment;", "getLogEnvironment", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "getAndroidAppInfo", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionSdkVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String osVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LogEnvironment logEnvironment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AndroidApplicationInfo androidAppInfo;

    public ApplicationInfo(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.appId = appId;
        this.deviceModel = deviceModel;
        this.sessionSdkVersion = sessionSdkVersion;
        this.osVersion = osVersion;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidAppInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applicationInfo.appId;
        }
        if ((i10 & 2) != 0) {
            str2 = applicationInfo.deviceModel;
        }
        if ((i10 & 4) != 0) {
            str3 = applicationInfo.sessionSdkVersion;
        }
        if ((i10 & 8) != 0) {
            str4 = applicationInfo.osVersion;
        }
        if ((i10 & 16) != 0) {
            logEnvironment = applicationInfo.logEnvironment;
        }
        if ((i10 & 32) != 0) {
            androidApplicationInfo = applicationInfo.androidAppInfo;
        }
        LogEnvironment logEnvironment2 = logEnvironment;
        AndroidApplicationInfo androidApplicationInfo2 = androidApplicationInfo;
        return applicationInfo.copy(str, str2, str3, str4, logEnvironment2, androidApplicationInfo2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @NotNull
    public final ApplicationInfo copy(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new ApplicationInfo(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) other;
        return Intrinsics.areEqual(this.appId, applicationInfo.appId) && Intrinsics.areEqual(this.deviceModel, applicationInfo.deviceModel) && Intrinsics.areEqual(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && Intrinsics.areEqual(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && Intrinsics.areEqual(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    @NotNull
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public int hashCode() {
        return (((((((((this.appId.hashCode() * 31) + this.deviceModel.hashCode()) * 31) + this.sessionSdkVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.logEnvironment.hashCode()) * 31) + this.androidAppInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.appId + ", deviceModel=" + this.deviceModel + ", sessionSdkVersion=" + this.sessionSdkVersion + ", osVersion=" + this.osVersion + ", logEnvironment=" + this.logEnvironment + ", androidAppInfo=" + this.androidAppInfo + ')';
    }
}
