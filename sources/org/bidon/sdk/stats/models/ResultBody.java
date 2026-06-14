package org.bidon.sdk.stats.models;

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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u008c\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006;"}, d2 = {"Lorg/bidon/sdk/stats/models/ResultBody;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "status", "", "winnerDemandId", "bidType", "price", "", "winnerAdUnitUid", "winnerAdUnitLabel", "auctionStartTs", "", "auctionFinishTs", "banner", "Lorg/bidon/sdk/auction/models/BannerRequest;", "interstitial", "Lorg/bidon/sdk/auction/models/InterstitialRequest;", "rewarded", "Lorg/bidon/sdk/auction/models/RewardedRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;JJLorg/bidon/sdk/auction/models/BannerRequest;Lorg/bidon/sdk/auction/models/InterstitialRequest;Lorg/bidon/sdk/auction/models/RewardedRequest;)V", "getStatus", "()Ljava/lang/String;", "getWinnerDemandId", "getBidType", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWinnerAdUnitUid", "getWinnerAdUnitLabel", "getAuctionStartTs", "()J", "getAuctionFinishTs", "getBanner", "()Lorg/bidon/sdk/auction/models/BannerRequest;", "getInterstitial", "()Lorg/bidon/sdk/auction/models/InterstitialRequest;", "getRewarded", "()Lorg/bidon/sdk/auction/models/RewardedRequest;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;JJLorg/bidon/sdk/auction/models/BannerRequest;Lorg/bidon/sdk/auction/models/InterstitialRequest;Lorg/bidon/sdk/auction/models/RewardedRequest;)Lorg/bidon/sdk/stats/models/ResultBody;", "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ResultBody implements Serializable {

    @JsonName(key = "auction_finish_ts")
    private final long auctionFinishTs;

    @JsonName(key = "auction_start_ts")
    private final long auctionStartTs;

    @JsonName(key = "banner")
    @Nullable
    private final BannerRequest banner;

    @JsonName(key = "bid_type")
    @Nullable
    private final String bidType;

    @JsonName(key = "interstitial")
    @Nullable
    private final InterstitialRequest interstitial;

    @JsonName(key = "price")
    @Nullable
    private final Double price;

    @JsonName(key = "rewarded")
    @Nullable
    private final RewardedRequest rewarded;

    @JsonName(key = "status")
    @NotNull
    private final String status;

    @JsonName(key = "winner_ad_unit_label")
    @Nullable
    private final String winnerAdUnitLabel;

    @JsonName(key = "winner_ad_unit_uid")
    @Nullable
    private final String winnerAdUnitUid;

    @JsonName(key = "winner_demand_id")
    @Nullable
    private final String winnerDemandId;

    public ResultBody(@NotNull String status, @Nullable String str, @Nullable String str2, @Nullable Double d10, @Nullable String str3, @Nullable String str4, long j10, long j11, @Nullable BannerRequest bannerRequest, @Nullable InterstitialRequest interstitialRequest, @Nullable RewardedRequest rewardedRequest) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.winnerDemandId = str;
        this.bidType = str2;
        this.price = d10;
        this.winnerAdUnitUid = str3;
        this.winnerAdUnitLabel = str4;
        this.auctionStartTs = j10;
        this.auctionFinishTs = j11;
        this.banner = bannerRequest;
        this.interstitial = interstitialRequest;
        this.rewarded = rewardedRequest;
    }

    public static /* synthetic */ ResultBody copy$default(ResultBody resultBody, String str, String str2, String str3, Double d10, String str4, String str5, long j10, long j11, BannerRequest bannerRequest, InterstitialRequest interstitialRequest, RewardedRequest rewardedRequest, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resultBody.status;
        }
        return resultBody.copy(str, (i10 & 2) != 0 ? resultBody.winnerDemandId : str2, (i10 & 4) != 0 ? resultBody.bidType : str3, (i10 & 8) != 0 ? resultBody.price : d10, (i10 & 16) != 0 ? resultBody.winnerAdUnitUid : str4, (i10 & 32) != 0 ? resultBody.winnerAdUnitLabel : str5, (i10 & 64) != 0 ? resultBody.auctionStartTs : j10, (i10 & 128) != 0 ? resultBody.auctionFinishTs : j11, (i10 & 256) != 0 ? resultBody.banner : bannerRequest, (i10 & 512) != 0 ? resultBody.interstitial : interstitialRequest, (i10 & 1024) != 0 ? resultBody.rewarded : rewardedRequest);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final InterstitialRequest getInterstitial() {
        return this.interstitial;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final RewardedRequest getRewarded() {
        return this.rewarded;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWinnerDemandId() {
        return this.winnerDemandId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBidType() {
        return this.bidType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWinnerAdUnitUid() {
        return this.winnerAdUnitUid;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWinnerAdUnitLabel() {
        return this.winnerAdUnitLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getAuctionStartTs() {
        return this.auctionStartTs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getAuctionFinishTs() {
        return this.auctionFinishTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BannerRequest getBanner() {
        return this.banner;
    }

    @NotNull
    public final ResultBody copy(@NotNull String status, @Nullable String winnerDemandId, @Nullable String bidType, @Nullable Double price, @Nullable String winnerAdUnitUid, @Nullable String winnerAdUnitLabel, long auctionStartTs, long auctionFinishTs, @Nullable BannerRequest banner, @Nullable InterstitialRequest interstitial, @Nullable RewardedRequest rewarded) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new ResultBody(status, winnerDemandId, bidType, price, winnerAdUnitUid, winnerAdUnitLabel, auctionStartTs, auctionFinishTs, banner, interstitial, rewarded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultBody)) {
            return false;
        }
        ResultBody resultBody = (ResultBody) other;
        return Intrinsics.areEqual(this.status, resultBody.status) && Intrinsics.areEqual(this.winnerDemandId, resultBody.winnerDemandId) && Intrinsics.areEqual(this.bidType, resultBody.bidType) && Intrinsics.areEqual((Object) this.price, (Object) resultBody.price) && Intrinsics.areEqual(this.winnerAdUnitUid, resultBody.winnerAdUnitUid) && Intrinsics.areEqual(this.winnerAdUnitLabel, resultBody.winnerAdUnitLabel) && this.auctionStartTs == resultBody.auctionStartTs && this.auctionFinishTs == resultBody.auctionFinishTs && Intrinsics.areEqual(this.banner, resultBody.banner) && Intrinsics.areEqual(this.interstitial, resultBody.interstitial) && Intrinsics.areEqual(this.rewarded, resultBody.rewarded);
    }

    public final long getAuctionFinishTs() {
        return this.auctionFinishTs;
    }

    public final long getAuctionStartTs() {
        return this.auctionStartTs;
    }

    @Nullable
    public final BannerRequest getBanner() {
        return this.banner;
    }

    @Nullable
    public final String getBidType() {
        return this.bidType;
    }

    @Nullable
    public final InterstitialRequest getInterstitial() {
        return this.interstitial;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    public final RewardedRequest getRewarded() {
        return this.rewarded;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getWinnerAdUnitLabel() {
        return this.winnerAdUnitLabel;
    }

    @Nullable
    public final String getWinnerAdUnitUid() {
        return this.winnerAdUnitUid;
    }

    @Nullable
    public final String getWinnerDemandId() {
        return this.winnerDemandId;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.winnerDemandId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bidType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.price;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str3 = this.winnerAdUnitUid;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.winnerAdUnitLabel;
        int iHashCode6 = (((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + b.a(this.auctionStartTs)) * 31) + b.a(this.auctionFinishTs)) * 31;
        BannerRequest bannerRequest = this.banner;
        int iHashCode7 = (iHashCode6 + (bannerRequest == null ? 0 : bannerRequest.hashCode())) * 31;
        InterstitialRequest interstitialRequest = this.interstitial;
        int iHashCode8 = (iHashCode7 + (interstitialRequest == null ? 0 : interstitialRequest.hashCode())) * 31;
        RewardedRequest rewardedRequest = this.rewarded;
        return iHashCode8 + (rewardedRequest != null ? rewardedRequest.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResultBody(status=" + this.status + ", winnerDemandId=" + this.winnerDemandId + ", bidType=" + this.bidType + ", price=" + this.price + ", winnerAdUnitUid=" + this.winnerAdUnitUid + ", winnerAdUnitLabel=" + this.winnerAdUnitLabel + ", auctionStartTs=" + this.auctionStartTs + ", auctionFinishTs=" + this.auctionFinishTs + ", banner=" + this.banner + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ")";
    }
}
