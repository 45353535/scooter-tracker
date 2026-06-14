package com.google.firebase.sessions;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "", "packageName", "versionName", "appBuildVersion", "deviceManufacturer", "Lcom/google/firebase/sessions/ProcessDetails;", "currentProcessDetails", "", "appProcessDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/google/firebase/sessions/ProcessDetails;", "component6", "()Ljava/util/List;", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)Lcom/google/firebase/sessions/AndroidApplicationInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPackageName", "b", "getVersionName", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getAppBuildVersion", "d", "getDeviceManufacturer", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/google/firebase/sessions/ProcessDetails;", "getCurrentProcessDetails", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/List;", "getAppProcessDetails", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AndroidApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String packageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String versionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appBuildVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceManufacturer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProcessDetails currentProcessDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List appProcessDetails;

    public AndroidApplicationInfo(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
        this.currentProcessDetails = currentProcessDetails;
        this.appProcessDetails = appProcessDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i10 & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i10 & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((i10 & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        if ((i10 & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        if ((i10 & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        ProcessDetails processDetails2 = processDetails;
        List list2 = list;
        return androidApplicationInfo.copy(str, str2, str3, str4, processDetails2, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) other;
        return Intrinsics.areEqual(this.packageName, androidApplicationInfo.packageName) && Intrinsics.areEqual(this.versionName, androidApplicationInfo.versionName) && Intrinsics.areEqual(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.areEqual(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && Intrinsics.areEqual(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && Intrinsics.areEqual(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
