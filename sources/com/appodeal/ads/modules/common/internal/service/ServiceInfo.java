package com.appodeal.ads.modules.common.internal.service;

import androidx.compose.foundation.c;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0007\u0010\u000f¨\u0006\""}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "", "", "name", "sdkVersion", "buildVersion", "", "isInitialized", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getSdkVersion", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getBuildVersion", "d", "Z", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ServiceInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String sdkVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String buildVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isInitialized;

    public ServiceInfo(String name, String sdkVersion, String buildVersion, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(buildVersion, "buildVersion");
        this.name = name;
        this.sdkVersion = sdkVersion;
        this.buildVersion = buildVersion;
        this.isInitialized = z10;
    }

    public static /* synthetic */ ServiceInfo copy$default(ServiceInfo serviceInfo, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceInfo.name;
        }
        if ((i10 & 2) != 0) {
            str2 = serviceInfo.sdkVersion;
        }
        if ((i10 & 4) != 0) {
            str3 = serviceInfo.buildVersion;
        }
        if ((i10 & 8) != 0) {
            z10 = serviceInfo.isInitialized;
        }
        return serviceInfo.copy(str, str2, str3, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBuildVersion() {
        return this.buildVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    public final ServiceInfo copy(String name, String sdkVersion, String buildVersion, boolean isInitialized) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(buildVersion, "buildVersion");
        return new ServiceInfo(name, sdkVersion, buildVersion, isInitialized);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceInfo)) {
            return false;
        }
        ServiceInfo serviceInfo = (ServiceInfo) other;
        return Intrinsics.areEqual(this.name, serviceInfo.name) && Intrinsics.areEqual(this.sdkVersion, serviceInfo.sdkVersion) && Intrinsics.areEqual(this.buildVersion, serviceInfo.buildVersion) && this.isInitialized == serviceInfo.isInitialized;
    }

    public final String getBuildVersion() {
        return this.buildVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        return c.a(this.isInitialized) + ((this.buildVersion.hashCode() + ((this.sdkVersion.hashCode() + (this.name.hashCode() * 31)) * 31)) * 31);
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public String toString() {
        return "ServiceInfo(name=" + this.name + ", sdkVersion=" + this.sdkVersion + ", buildVersion=" + this.buildVersion + ", isInitialized=" + this.isInitialized + ")";
    }
}
