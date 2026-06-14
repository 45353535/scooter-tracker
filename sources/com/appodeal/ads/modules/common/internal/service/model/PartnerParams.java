package com.appodeal.ads.modules.common.internal.service.model;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appodeal.ads.ext.MapExtKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u000eR#\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/model/PartnerParams;", "", "", "appodealFramework", "appodealFrameworkVersion", "appodealPluginVersion", "appodealSdkVersion", "appodealSegmentId", "appodealSessionUuid", "appodealToken", "firebaseKeywords", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appodeal/ads/modules/common/internal/service/model/PartnerParams;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAppodealFramework", "b", "getAppodealFrameworkVersion", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getAppodealPluginVersion", "d", "getAppodealSdkVersion", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getAppodealSegmentId", InneractiveMediationDefs.GENDER_FEMALE, "getAppodealSessionUuid", "g", "getAppodealToken", "h", "getFirebaseKeywords", "", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Ljava/util/Map;", "getParamsMap", "()Ljava/util/Map;", "paramsMap", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PartnerParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appodealFramework;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appodealFrameworkVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appodealPluginVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appodealSdkVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appodealSegmentId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appodealSessionUuid;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final String appodealToken;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final String firebaseKeywords;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final Map paramsMap;

    public PartnerParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.appodealFramework = str;
        this.appodealFrameworkVersion = str2;
        this.appodealPluginVersion = str3;
        this.appodealSdkVersion = str4;
        this.appodealSegmentId = str5;
        this.appodealSessionUuid = str6;
        this.appodealToken = str7;
        this.firebaseKeywords = str8;
        this.paramsMap = MapExtKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("appodeal_framework", str), TuplesKt.to("appodeal_framework_version", str2), TuplesKt.to("appodeal_plugin_version", str3), TuplesKt.to("appodeal_sdk_version", str4), TuplesKt.to("appodeal_token", str7), TuplesKt.to("firebase_keywords", str8), TuplesKt.to("segment_id", str5), TuplesKt.to("session_uuid", str6)));
    }

    public static /* synthetic */ PartnerParams copy$default(PartnerParams partnerParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = partnerParams.appodealFramework;
        }
        if ((i10 & 2) != 0) {
            str2 = partnerParams.appodealFrameworkVersion;
        }
        if ((i10 & 4) != 0) {
            str3 = partnerParams.appodealPluginVersion;
        }
        if ((i10 & 8) != 0) {
            str4 = partnerParams.appodealSdkVersion;
        }
        if ((i10 & 16) != 0) {
            str5 = partnerParams.appodealSegmentId;
        }
        if ((i10 & 32) != 0) {
            str6 = partnerParams.appodealSessionUuid;
        }
        if ((i10 & 64) != 0) {
            str7 = partnerParams.appodealToken;
        }
        if ((i10 & 128) != 0) {
            str8 = partnerParams.firebaseKeywords;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return partnerParams.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppodealFramework() {
        return this.appodealFramework;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppodealFrameworkVersion() {
        return this.appodealFrameworkVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppodealPluginVersion() {
        return this.appodealPluginVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppodealSdkVersion() {
        return this.appodealSdkVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppodealSegmentId() {
        return this.appodealSegmentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppodealSessionUuid() {
        return this.appodealSessionUuid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAppodealToken() {
        return this.appodealToken;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFirebaseKeywords() {
        return this.firebaseKeywords;
    }

    public final PartnerParams copy(String appodealFramework, String appodealFrameworkVersion, String appodealPluginVersion, String appodealSdkVersion, String appodealSegmentId, String appodealSessionUuid, String appodealToken, String firebaseKeywords) {
        return new PartnerParams(appodealFramework, appodealFrameworkVersion, appodealPluginVersion, appodealSdkVersion, appodealSegmentId, appodealSessionUuid, appodealToken, firebaseKeywords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerParams)) {
            return false;
        }
        PartnerParams partnerParams = (PartnerParams) other;
        return Intrinsics.areEqual(this.appodealFramework, partnerParams.appodealFramework) && Intrinsics.areEqual(this.appodealFrameworkVersion, partnerParams.appodealFrameworkVersion) && Intrinsics.areEqual(this.appodealPluginVersion, partnerParams.appodealPluginVersion) && Intrinsics.areEqual(this.appodealSdkVersion, partnerParams.appodealSdkVersion) && Intrinsics.areEqual(this.appodealSegmentId, partnerParams.appodealSegmentId) && Intrinsics.areEqual(this.appodealSessionUuid, partnerParams.appodealSessionUuid) && Intrinsics.areEqual(this.appodealToken, partnerParams.appodealToken) && Intrinsics.areEqual(this.firebaseKeywords, partnerParams.firebaseKeywords);
    }

    public final String getAppodealFramework() {
        return this.appodealFramework;
    }

    public final String getAppodealFrameworkVersion() {
        return this.appodealFrameworkVersion;
    }

    public final String getAppodealPluginVersion() {
        return this.appodealPluginVersion;
    }

    public final String getAppodealSdkVersion() {
        return this.appodealSdkVersion;
    }

    public final String getAppodealSegmentId() {
        return this.appodealSegmentId;
    }

    public final String getAppodealSessionUuid() {
        return this.appodealSessionUuid;
    }

    public final String getAppodealToken() {
        return this.appodealToken;
    }

    public final String getFirebaseKeywords() {
        return this.firebaseKeywords;
    }

    public final Map<String, String> getParamsMap() {
        return this.paramsMap;
    }

    public int hashCode() {
        String str = this.appodealFramework;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appodealFrameworkVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appodealPluginVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appodealSdkVersion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appodealSegmentId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appodealSessionUuid;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appodealToken;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firebaseKeywords;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "PartnerParams(appodealFramework=" + this.appodealFramework + ", appodealFrameworkVersion=" + this.appodealFrameworkVersion + ", appodealPluginVersion=" + this.appodealPluginVersion + ", appodealSdkVersion=" + this.appodealSdkVersion + ", appodealSegmentId=" + this.appodealSegmentId + ", appodealSessionUuid=" + this.appodealSessionUuid + ", appodealToken=" + this.appodealToken + ", firebaseKeywords=" + this.firebaseKeywords + ")";
    }
}
