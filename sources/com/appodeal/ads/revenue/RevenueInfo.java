package com.appodeal.ads.revenue;

import androidx.collection.a;
import androidx.collection.b;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0094\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010%R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010'R\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bO\u0010\u0017R\u0017\u0010V\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010Y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u00101\u001a\u0004\bX\u0010\u0017¨\u0006Z"}, d2 = {"Lcom/appodeal/ads/revenue/RevenueInfo;", "", "", "networkName", "demandSource", "adUnitName", "placement", "", "placementId", "", "segmentId", "", "revenue", "revenuePrecision", "adType", "adTypeString", "Lcom/appodeal/ads/revenue/RevenuePlatform;", "revenuePlatform", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJDLjava/lang/String;ILjava/lang/String;Lcom/appodeal/ads/revenue/RevenuePlatform;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "()J", "component7", "()D", "component8", "component9", "component10", "component11", "()Lcom/appodeal/ads/revenue/RevenuePlatform;", "component12", "()Ljava/util/Map;", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJDLjava/lang/String;ILjava/lang/String;Lcom/appodeal/ads/revenue/RevenuePlatform;Ljava/util/Map;)Lcom/appodeal/ads/revenue/RevenueInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getNetworkName", "b", "getDemandSource", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getAdUnitName", "d", "getPlacement", EidRequestBuilder.REQUEST_FIELD_EMAIL, "I", "getPlacementId", InneractiveMediationDefs.GENDER_FEMALE, "J", "getSegmentId", "g", "D", "getRevenue", "h", "getRevenuePrecision", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "getAdType", "j", "getAdTypeString", CampaignEx.JSON_KEY_AD_K, "Lcom/appodeal/ads/revenue/RevenuePlatform;", "getRevenuePlatform", CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/util/Map;", "getPayload", "m", "getPlatform", "platform", "Lcom/appodeal/ads/revenue/RevenueCurrency;", "n", "Lcom/appodeal/ads/revenue/RevenueCurrency;", "getRevenueCurrency", "()Lcom/appodeal/ads/revenue/RevenueCurrency;", "revenueCurrency", "o", "getCurrency", "currency", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RevenueInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String networkName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String demandSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String adUnitName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String placement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int placementId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final long segmentId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final double revenue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final String revenuePrecision;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final int adType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final String adTypeString;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public final RevenuePlatform revenuePlatform;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map payload;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final String platform;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final RevenueCurrency revenueCurrency;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final String currency;

    public RevenueInfo(String networkName, String demandSource, String adUnitName, String placement, int i10, long j10, double d10, String revenuePrecision, int i11, String adTypeString, RevenuePlatform revenuePlatform, Map<String, String> payload) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(revenuePrecision, "revenuePrecision");
        Intrinsics.checkNotNullParameter(adTypeString, "adTypeString");
        Intrinsics.checkNotNullParameter(revenuePlatform, "revenuePlatform");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.networkName = networkName;
        this.demandSource = demandSource;
        this.adUnitName = adUnitName;
        this.placement = placement;
        this.placementId = i10;
        this.segmentId = j10;
        this.revenue = d10;
        this.revenuePrecision = revenuePrecision;
        this.adType = i11;
        this.adTypeString = adTypeString;
        this.revenuePlatform = revenuePlatform;
        this.payload = payload;
        this.platform = revenuePlatform.getStringValue();
        RevenueCurrency revenueCurrency = RevenueCurrency.USD;
        this.revenueCurrency = revenueCurrency;
        this.currency = revenueCurrency.getStringValue();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAdTypeString() {
        return this.adTypeString;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final RevenuePlatform getRevenuePlatform() {
        return this.revenuePlatform;
    }

    public final Map<String, String> component12() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDemandSource() {
        return this.demandSource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdUnitName() {
        return this.adUnitName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getSegmentId() {
        return this.segmentId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getRevenue() {
        return this.revenue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRevenuePrecision() {
        return this.revenuePrecision;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getAdType() {
        return this.adType;
    }

    public final RevenueInfo copy(String networkName, String demandSource, String adUnitName, String placement, int placementId, long segmentId, double revenue, String revenuePrecision, int adType, String adTypeString, RevenuePlatform revenuePlatform, Map<String, String> payload) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(revenuePrecision, "revenuePrecision");
        Intrinsics.checkNotNullParameter(adTypeString, "adTypeString");
        Intrinsics.checkNotNullParameter(revenuePlatform, "revenuePlatform");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new RevenueInfo(networkName, demandSource, adUnitName, placement, placementId, segmentId, revenue, revenuePrecision, adType, adTypeString, revenuePlatform, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RevenueInfo)) {
            return false;
        }
        RevenueInfo revenueInfo = (RevenueInfo) other;
        return Intrinsics.areEqual(this.networkName, revenueInfo.networkName) && Intrinsics.areEqual(this.demandSource, revenueInfo.demandSource) && Intrinsics.areEqual(this.adUnitName, revenueInfo.adUnitName) && Intrinsics.areEqual(this.placement, revenueInfo.placement) && this.placementId == revenueInfo.placementId && this.segmentId == revenueInfo.segmentId && Double.compare(this.revenue, revenueInfo.revenue) == 0 && Intrinsics.areEqual(this.revenuePrecision, revenueInfo.revenuePrecision) && this.adType == revenueInfo.adType && Intrinsics.areEqual(this.adTypeString, revenueInfo.adTypeString) && this.revenuePlatform == revenueInfo.revenuePlatform && Intrinsics.areEqual(this.payload, revenueInfo.payload);
    }

    public final int getAdType() {
        return this.adType;
    }

    public final String getAdTypeString() {
        return this.adTypeString;
    }

    public final String getAdUnitName() {
        return this.adUnitName;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDemandSource() {
        return this.demandSource;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final int getPlacementId() {
        return this.placementId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    public final RevenueCurrency getRevenueCurrency() {
        return this.revenueCurrency;
    }

    public final RevenuePlatform getRevenuePlatform() {
        return this.revenuePlatform;
    }

    public final String getRevenuePrecision() {
        return this.revenuePrecision;
    }

    public final long getSegmentId() {
        return this.segmentId;
    }

    public int hashCode() {
        return this.payload.hashCode() + ((this.revenuePlatform.hashCode() + ((this.adTypeString.hashCode() + ((this.adType + ((this.revenuePrecision.hashCode() + ((a.a(this.revenue) + ((b.a(this.segmentId) + ((this.placementId + ((this.placement.hashCode() + ((this.adUnitName.hashCode() + ((this.demandSource.hashCode() + (this.networkName.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RevenueInfo(networkName=" + this.networkName + ", demandSource=" + this.demandSource + ", adUnitName=" + this.adUnitName + ", placement=" + this.placement + ", placementId=" + this.placementId + ", segmentId=" + this.segmentId + ", revenue=" + this.revenue + ", revenuePrecision=" + this.revenuePrecision + ", adType=" + this.adType + ", adTypeString=" + this.adTypeString + ", revenuePlatform=" + this.revenuePlatform + ", payload=" + this.payload + ")";
    }

    public /* synthetic */ RevenueInfo(String str, String str2, String str3, String str4, int i10, long j10, double d10, String str5, int i11, String str6, RevenuePlatform revenuePlatform, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i10, j10, d10, str5, i11, str6, revenuePlatform, (i12 & 2048) != 0 ? MapsKt.emptyMap() : map);
    }
}
