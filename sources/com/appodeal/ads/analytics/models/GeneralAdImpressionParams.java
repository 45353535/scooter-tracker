package com.appodeal.ads.analytics.models;

import androidx.collection.a;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/appodeal/ads/analytics/models/GeneralAdImpressionParams;", "", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionId", "", "placementId", "adNetwork", "adUnitName", "demandSource", "ecpm", "", "<init>", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionId", "()Ljava/lang/String;", "getPlacementId", "getAdNetwork", "getAdUnitName", "getDemandSource", "getEcpm", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GeneralAdImpressionParams {
    private final String adNetwork;
    private final AdType adType;
    private final String adUnitName;
    private final String demandSource;
    private final double ecpm;
    private final String impressionId;
    private final String placementId;

    public GeneralAdImpressionParams(AdType adType, String impressionId, String placementId, String adNetwork, String adUnitName, String demandSource, double d10) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        this.adType = adType;
        this.impressionId = impressionId;
        this.placementId = placementId;
        this.adNetwork = adNetwork;
        this.adUnitName = adUnitName;
        this.demandSource = demandSource;
        this.ecpm = d10;
    }

    public static /* synthetic */ GeneralAdImpressionParams copy$default(GeneralAdImpressionParams generalAdImpressionParams, AdType adType, String str, String str2, String str3, String str4, String str5, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            adType = generalAdImpressionParams.adType;
        }
        if ((i10 & 2) != 0) {
            str = generalAdImpressionParams.impressionId;
        }
        if ((i10 & 4) != 0) {
            str2 = generalAdImpressionParams.placementId;
        }
        if ((i10 & 8) != 0) {
            str3 = generalAdImpressionParams.adNetwork;
        }
        if ((i10 & 16) != 0) {
            str4 = generalAdImpressionParams.adUnitName;
        }
        if ((i10 & 32) != 0) {
            str5 = generalAdImpressionParams.demandSource;
        }
        if ((i10 & 64) != 0) {
            d10 = generalAdImpressionParams.ecpm;
        }
        double d11 = d10;
        String str6 = str4;
        String str7 = str5;
        return generalAdImpressionParams.copy(adType, str, str2, str3, str6, str7, d11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdType getAdType() {
        return this.adType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImpressionId() {
        return this.impressionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAdNetwork() {
        return this.adNetwork;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdUnitName() {
        return this.adUnitName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDemandSource() {
        return this.demandSource;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getEcpm() {
        return this.ecpm;
    }

    public final GeneralAdImpressionParams copy(AdType adType, String impressionId, String placementId, String adNetwork, String adUnitName, String demandSource, double ecpm) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        Intrinsics.checkNotNullParameter(demandSource, "demandSource");
        return new GeneralAdImpressionParams(adType, impressionId, placementId, adNetwork, adUnitName, demandSource, ecpm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneralAdImpressionParams)) {
            return false;
        }
        GeneralAdImpressionParams generalAdImpressionParams = (GeneralAdImpressionParams) other;
        return this.adType == generalAdImpressionParams.adType && Intrinsics.areEqual(this.impressionId, generalAdImpressionParams.impressionId) && Intrinsics.areEqual(this.placementId, generalAdImpressionParams.placementId) && Intrinsics.areEqual(this.adNetwork, generalAdImpressionParams.adNetwork) && Intrinsics.areEqual(this.adUnitName, generalAdImpressionParams.adUnitName) && Intrinsics.areEqual(this.demandSource, generalAdImpressionParams.demandSource) && Double.compare(this.ecpm, generalAdImpressionParams.ecpm) == 0;
    }

    public final String getAdNetwork() {
        return this.adNetwork;
    }

    public final AdType getAdType() {
        return this.adType;
    }

    public final String getAdUnitName() {
        return this.adUnitName;
    }

    public final String getDemandSource() {
        return this.demandSource;
    }

    public final double getEcpm() {
        return this.ecpm;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        return a.a(this.ecpm) + ((this.demandSource.hashCode() + ((this.adUnitName.hashCode() + ((this.adNetwork.hashCode() + ((this.placementId.hashCode() + ((this.impressionId.hashCode() + (this.adType.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "GeneralAdImpressionParams(adType=" + this.adType + ", impressionId=" + this.impressionId + ", placementId=" + this.placementId + ", adNetwork=" + this.adNetwork + ", adUnitName=" + this.adUnitName + ", demandSource=" + this.demandSource + ", ecpm=" + this.ecpm + ")";
    }
}
