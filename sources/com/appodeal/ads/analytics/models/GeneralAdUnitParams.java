package com.appodeal.ads.analytics.models;

import androidx.collection.a;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "", "waterfallType", "Lcom/appodeal/ads/analytics/models/WaterfallType;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "impressionId", "", "adNetwork", "adUnitName", "ecpm", "", "<init>", "(Lcom/appodeal/ads/analytics/models/WaterfallType;Lcom/appodeal/ads/modules/common/internal/adtype/AdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getWaterfallType", "()Lcom/appodeal/ads/analytics/models/WaterfallType;", "getAdType", "()Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "getImpressionId", "()Ljava/lang/String;", "getAdNetwork", "getAdUnitName", "getEcpm", "()D", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GeneralAdUnitParams {
    private final String adNetwork;
    private final AdType adType;
    private final String adUnitName;
    private final double ecpm;
    private final String impressionId;
    private final WaterfallType waterfallType;

    public GeneralAdUnitParams(WaterfallType waterfallType, AdType adType, String impressionId, String adNetwork, String adUnitName, double d10) {
        Intrinsics.checkNotNullParameter(waterfallType, "waterfallType");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        this.waterfallType = waterfallType;
        this.adType = adType;
        this.impressionId = impressionId;
        this.adNetwork = adNetwork;
        this.adUnitName = adUnitName;
        this.ecpm = d10;
    }

    public static /* synthetic */ GeneralAdUnitParams copy$default(GeneralAdUnitParams generalAdUnitParams, WaterfallType waterfallType, AdType adType, String str, String str2, String str3, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            waterfallType = generalAdUnitParams.waterfallType;
        }
        if ((i10 & 2) != 0) {
            adType = generalAdUnitParams.adType;
        }
        if ((i10 & 4) != 0) {
            str = generalAdUnitParams.impressionId;
        }
        if ((i10 & 8) != 0) {
            str2 = generalAdUnitParams.adNetwork;
        }
        if ((i10 & 16) != 0) {
            str3 = generalAdUnitParams.adUnitName;
        }
        if ((i10 & 32) != 0) {
            d10 = generalAdUnitParams.ecpm;
        }
        double d11 = d10;
        String str4 = str3;
        String str5 = str;
        return generalAdUnitParams.copy(waterfallType, adType, str5, str2, str4, d11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WaterfallType getWaterfallType() {
        return this.waterfallType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AdType getAdType() {
        return this.adType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImpressionId() {
        return this.impressionId;
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
    public final double getEcpm() {
        return this.ecpm;
    }

    public final GeneralAdUnitParams copy(WaterfallType waterfallType, AdType adType, String impressionId, String adNetwork, String adUnitName, double ecpm) {
        Intrinsics.checkNotNullParameter(waterfallType, "waterfallType");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        return new GeneralAdUnitParams(waterfallType, adType, impressionId, adNetwork, adUnitName, ecpm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneralAdUnitParams)) {
            return false;
        }
        GeneralAdUnitParams generalAdUnitParams = (GeneralAdUnitParams) other;
        return Intrinsics.areEqual(this.waterfallType, generalAdUnitParams.waterfallType) && this.adType == generalAdUnitParams.adType && Intrinsics.areEqual(this.impressionId, generalAdUnitParams.impressionId) && Intrinsics.areEqual(this.adNetwork, generalAdUnitParams.adNetwork) && Intrinsics.areEqual(this.adUnitName, generalAdUnitParams.adUnitName) && Double.compare(this.ecpm, generalAdUnitParams.ecpm) == 0;
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

    public final double getEcpm() {
        return this.ecpm;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final WaterfallType getWaterfallType() {
        return this.waterfallType;
    }

    public int hashCode() {
        return a.a(this.ecpm) + ((this.adUnitName.hashCode() + ((this.adNetwork.hashCode() + ((this.impressionId.hashCode() + ((this.adType.hashCode() + (this.waterfallType.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "GeneralAdUnitParams(waterfallType=" + this.waterfallType + ", adType=" + this.adType + ", impressionId=" + this.impressionId + ", adNetwork=" + this.adNetwork + ", adUnitName=" + this.adUnitName + ", ecpm=" + this.ecpm + ")";
    }
}
