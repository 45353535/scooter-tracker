package org.bidon.sdk.ads;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.stats.models.BidType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001e\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lorg/bidon/sdk/ads/Ad;", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "price", "", "auctionId", "", "dsp", AppsFlyerProperties.CURRENCY_CODE, "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "<init>", "(Lorg/bidon/sdk/adapter/DemandAd;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bidon/sdk/auction/models/AdUnit;)V", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "getPrice", "()D", "getAuctionId", "()Ljava/lang/String;", "getDsp", "getCurrencyCode", "getAdUnit", "()Lorg/bidon/sdk/auction/models/AdUnit;", "networkName", "getNetworkName", "bidType", "Lorg/bidon/sdk/stats/models/BidType;", "getBidType", "()Lorg/bidon/sdk/stats/models/BidType;", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Ad {

    @NotNull
    private final AdUnit adUnit;

    @NotNull
    private final String auctionId;

    @Nullable
    private final String currencyCode;

    @NotNull
    private final DemandAd demandAd;

    @Nullable
    private final String dsp;
    private final double price;

    public Ad(@NotNull DemandAd demandAd, double d10, @NotNull String auctionId, @Nullable String str, @Nullable String str2, @NotNull AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.demandAd = demandAd;
        this.price = d10;
        this.auctionId = auctionId;
        this.dsp = str;
        this.currencyCode = str2;
        this.adUnit = adUnit;
    }

    @NotNull
    public final AdUnit getAdUnit() {
        return this.adUnit;
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    @NotNull
    public final BidType getBidType() {
        return this.adUnit.getBidType();
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final DemandAd getDemandAd() {
        return this.demandAd;
    }

    @Nullable
    public final String getDsp() {
        return this.dsp;
    }

    @NotNull
    public final String getNetworkName() {
        return this.adUnit.getDemandId();
    }

    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public String toString() {
        return "Ad(" + this.demandAd.getAdType() + " " + getNetworkName() + "/" + getBidType() + " " + this.price + " " + this.currencyCode + ", auctionId=" + this.auctionId + ", dsp=" + this.dsp + ", extras=" + this.demandAd.getExtras() + ", " + this.adUnit + ")";
    }
}
