package org.bidon.sdk.stats.models;

import androidx.collection.a;
import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.auction.models.BannerRequest;
import org.bidon.sdk.auction.models.InterstitialRequest;
import org.bidon.sdk.auction.models.RewardedRequest;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u008d\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006<"}, d2 = {"Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "auctionPricefloor", "", "auctionId", "", "bidType", "auctionConfigurationId", "", "auctionConfigurationUid", "demandId", "adUnitUid", "adUnitLabel", "price", "banner", "Lorg/bidon/sdk/auction/models/BannerRequest;", "interstitial", "Lorg/bidon/sdk/auction/models/InterstitialRequest;", "rewarded", "Lorg/bidon/sdk/auction/models/RewardedRequest;", "<init>", "(DLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLorg/bidon/sdk/auction/models/BannerRequest;Lorg/bidon/sdk/auction/models/InterstitialRequest;Lorg/bidon/sdk/auction/models/RewardedRequest;)V", "getAuctionPricefloor", "()D", "getAuctionId", "()Ljava/lang/String;", "getBidType", "getAuctionConfigurationId", "()J", "getAuctionConfigurationUid", "getDemandId", "getAdUnitUid", "getAdUnitLabel", "getPrice", "getBanner", "()Lorg/bidon/sdk/auction/models/BannerRequest;", "getInterstitial", "()Lorg/bidon/sdk/auction/models/InterstitialRequest;", "getRewarded", "()Lorg/bidon/sdk/auction/models/RewardedRequest;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImpressionRequestBody implements Serializable {

    @JsonName(key = "ad_unit_label")
    @Nullable
    private final String adUnitLabel;

    @JsonName(key = "ad_unit_uid")
    @Nullable
    private final String adUnitUid;

    @JsonName(key = "auction_configuration_id")
    private final long auctionConfigurationId;

    @JsonName(key = "auction_configuration_uid")
    @NotNull
    private final String auctionConfigurationUid;

    @JsonName(key = "auction_id")
    @NotNull
    private final String auctionId;

    @JsonName(key = "auction_pricefloor")
    private final double auctionPricefloor;

    @JsonName(key = "banner")
    @Nullable
    private final BannerRequest banner;

    @JsonName(key = "bid_type")
    @Nullable
    private final String bidType;

    @JsonName(key = "demand_id")
    @NotNull
    private final String demandId;

    @JsonName(key = "interstitial")
    @Nullable
    private final InterstitialRequest interstitial;

    @JsonName(key = "price")
    private final double price;

    @JsonName(key = "rewarded")
    @Nullable
    private final RewardedRequest rewarded;

    public ImpressionRequestBody(double d10, @NotNull String auctionId, @Nullable String str, long j10, @NotNull String auctionConfigurationUid, @NotNull String demandId, @Nullable String str2, @Nullable String str3, double d11, @Nullable BannerRequest bannerRequest, @Nullable InterstitialRequest interstitialRequest, @Nullable RewardedRequest rewardedRequest) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.auctionPricefloor = d10;
        this.auctionId = auctionId;
        this.bidType = str;
        this.auctionConfigurationId = j10;
        this.auctionConfigurationUid = auctionConfigurationUid;
        this.demandId = demandId;
        this.adUnitUid = str2;
        this.adUnitLabel = str3;
        this.price = d11;
        this.banner = bannerRequest;
        this.interstitial = interstitialRequest;
        this.rewarded = rewardedRequest;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAuctionPricefloor() {
        return this.auctionPricefloor;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BannerRequest getBanner() {
        return this.banner;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final InterstitialRequest getInterstitial() {
        return this.interstitial;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final RewardedRequest getRewarded() {
        return this.rewarded;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBidType() {
        return this.bidType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAuctionConfigurationId() {
        return this.auctionConfigurationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAuctionConfigurationUid() {
        return this.auctionConfigurationUid;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDemandId() {
        return this.demandId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAdUnitUid() {
        return this.adUnitUid;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAdUnitLabel() {
        return this.adUnitLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final ImpressionRequestBody copy(double auctionPricefloor, @NotNull String auctionId, @Nullable String bidType, long auctionConfigurationId, @NotNull String auctionConfigurationUid, @NotNull String demandId, @Nullable String adUnitUid, @Nullable String adUnitLabel, double price, @Nullable BannerRequest banner, @Nullable InterstitialRequest interstitial, @Nullable RewardedRequest rewarded) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        return new ImpressionRequestBody(auctionPricefloor, auctionId, bidType, auctionConfigurationId, auctionConfigurationUid, demandId, adUnitUid, adUnitLabel, price, banner, interstitial, rewarded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpressionRequestBody)) {
            return false;
        }
        ImpressionRequestBody impressionRequestBody = (ImpressionRequestBody) other;
        return Double.compare(this.auctionPricefloor, impressionRequestBody.auctionPricefloor) == 0 && Intrinsics.areEqual(this.auctionId, impressionRequestBody.auctionId) && Intrinsics.areEqual(this.bidType, impressionRequestBody.bidType) && this.auctionConfigurationId == impressionRequestBody.auctionConfigurationId && Intrinsics.areEqual(this.auctionConfigurationUid, impressionRequestBody.auctionConfigurationUid) && Intrinsics.areEqual(this.demandId, impressionRequestBody.demandId) && Intrinsics.areEqual(this.adUnitUid, impressionRequestBody.adUnitUid) && Intrinsics.areEqual(this.adUnitLabel, impressionRequestBody.adUnitLabel) && Double.compare(this.price, impressionRequestBody.price) == 0 && Intrinsics.areEqual(this.banner, impressionRequestBody.banner) && Intrinsics.areEqual(this.interstitial, impressionRequestBody.interstitial) && Intrinsics.areEqual(this.rewarded, impressionRequestBody.rewarded);
    }

    @Nullable
    public final String getAdUnitLabel() {
        return this.adUnitLabel;
    }

    @Nullable
    public final String getAdUnitUid() {
        return this.adUnitUid;
    }

    public final long getAuctionConfigurationId() {
        return this.auctionConfigurationId;
    }

    @NotNull
    public final String getAuctionConfigurationUid() {
        return this.auctionConfigurationUid;
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getAuctionPricefloor() {
        return this.auctionPricefloor;
    }

    @Nullable
    public final BannerRequest getBanner() {
        return this.banner;
    }

    @Nullable
    public final String getBidType() {
        return this.bidType;
    }

    @NotNull
    public final String getDemandId() {
        return this.demandId;
    }

    @Nullable
    public final InterstitialRequest getInterstitial() {
        return this.interstitial;
    }

    public final double getPrice() {
        return this.price;
    }

    @Nullable
    public final RewardedRequest getRewarded() {
        return this.rewarded;
    }

    public int hashCode() {
        int iA = ((a.a(this.auctionPricefloor) * 31) + this.auctionId.hashCode()) * 31;
        String str = this.bidType;
        int iHashCode = (((((((iA + (str == null ? 0 : str.hashCode())) * 31) + b.a(this.auctionConfigurationId)) * 31) + this.auctionConfigurationUid.hashCode()) * 31) + this.demandId.hashCode()) * 31;
        String str2 = this.adUnitUid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adUnitLabel;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + a.a(this.price)) * 31;
        BannerRequest bannerRequest = this.banner;
        int iHashCode4 = (iHashCode3 + (bannerRequest == null ? 0 : bannerRequest.hashCode())) * 31;
        InterstitialRequest interstitialRequest = this.interstitial;
        int iHashCode5 = (iHashCode4 + (interstitialRequest == null ? 0 : interstitialRequest.hashCode())) * 31;
        RewardedRequest rewardedRequest = this.rewarded;
        return iHashCode5 + (rewardedRequest != null ? rewardedRequest.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ImpressionRequestBody(auctionPricefloor=" + this.auctionPricefloor + ", auctionId=" + this.auctionId + ", bidType=" + this.bidType + ", auctionConfigurationId=" + this.auctionConfigurationId + ", auctionConfigurationUid=" + this.auctionConfigurationUid + ", demandId=" + this.demandId + ", adUnitUid=" + this.adUnitUid + ", adUnitLabel=" + this.adUnitLabel + ", price=" + this.price + ", banner=" + this.banner + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ")";
    }
}
