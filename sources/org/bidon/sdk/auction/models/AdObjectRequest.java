package org.bidon.sdk.auction.models;

import androidx.exifinterface.media.ExifInterface;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u00011B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lorg/bidon/sdk/auction/models/AdObjectRequest;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "orientationCode", "", "auctionId", "auctionKey", "pricefloor", "", "banner", "Lorg/bidon/sdk/auction/models/BannerRequest;", "interstitial", "Lorg/bidon/sdk/auction/models/InterstitialRequest;", "rewarded", "Lorg/bidon/sdk/auction/models/RewardedRequest;", "demands", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLorg/bidon/sdk/auction/models/BannerRequest;Lorg/bidon/sdk/auction/models/InterstitialRequest;Lorg/bidon/sdk/auction/models/RewardedRequest;Ljava/util/Map;)V", "getOrientationCode", "()Ljava/lang/String;", "getAuctionId", "getAuctionKey", "getPricefloor", "()D", "getBanner", "()Lorg/bidon/sdk/auction/models/BannerRequest;", "getInterstitial", "()Lorg/bidon/sdk/auction/models/InterstitialRequest;", "getRewarded", "()Lorg/bidon/sdk/auction/models/RewardedRequest;", "getDemands", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", ExifInterface.TAG_ORIENTATION, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdObjectRequest implements Serializable {

    @JsonName(key = "auction_id")
    @NotNull
    private final String auctionId;

    @JsonName(key = "auction_key")
    @Nullable
    private final String auctionKey;

    @JsonName(key = "banner")
    @Nullable
    private final BannerRequest banner;

    @JsonName(key = "demands")
    @NotNull
    private final Map<String, TokenInfo> demands;

    @JsonName(key = "interstitial")
    @Nullable
    private final InterstitialRequest interstitial;

    @JsonName(key = "orientation")
    @NotNull
    private final String orientationCode;

    @JsonName(key = "auction_pricefloor")
    private final double pricefloor;

    @JsonName(key = "rewarded")
    @Nullable
    private final RewardedRequest rewarded;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/auction/models/AdObjectRequest$Orientation;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Portrait", "Landscape", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Orientation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;

        @NotNull
        private final String code;
        public static final Orientation Portrait = new Orientation("Portrait", 0, "PORTRAIT");
        public static final Orientation Landscape = new Orientation("Landscape", 1, "LANDSCAPE");

        private static final /* synthetic */ Orientation[] $values() {
            return new Orientation[]{Portrait, Landscape};
        }

        static {
            Orientation[] orientationArr$values = $values();
            $VALUES = orientationArr$values;
            $ENTRIES = a.a(orientationArr$values);
        }

        private Orientation(String str, int i10, String str2) {
            this.code = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }
    }

    public AdObjectRequest(@NotNull String orientationCode, @NotNull String auctionId, @Nullable String str, double d10, @Nullable BannerRequest bannerRequest, @Nullable InterstitialRequest interstitialRequest, @Nullable RewardedRequest rewardedRequest, @NotNull Map<String, TokenInfo> demands) {
        Intrinsics.checkNotNullParameter(orientationCode, "orientationCode");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demands, "demands");
        this.orientationCode = orientationCode;
        this.auctionId = auctionId;
        this.auctionKey = str;
        this.pricefloor = d10;
        this.banner = bannerRequest;
        this.interstitial = interstitialRequest;
        this.rewarded = rewardedRequest;
        this.demands = demands;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdObjectRequest copy$default(AdObjectRequest adObjectRequest, String str, String str2, String str3, double d10, BannerRequest bannerRequest, InterstitialRequest interstitialRequest, RewardedRequest rewardedRequest, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adObjectRequest.orientationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = adObjectRequest.auctionId;
        }
        if ((i10 & 4) != 0) {
            str3 = adObjectRequest.auctionKey;
        }
        if ((i10 & 8) != 0) {
            d10 = adObjectRequest.pricefloor;
        }
        if ((i10 & 16) != 0) {
            bannerRequest = adObjectRequest.banner;
        }
        if ((i10 & 32) != 0) {
            interstitialRequest = adObjectRequest.interstitial;
        }
        if ((i10 & 64) != 0) {
            rewardedRequest = adObjectRequest.rewarded;
        }
        if ((i10 & 128) != 0) {
            map = adObjectRequest.demands;
        }
        double d11 = d10;
        String str4 = str3;
        return adObjectRequest.copy(str, str2, str4, d11, bannerRequest, interstitialRequest, rewardedRequest, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrientationCode() {
        return this.orientationCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuctionKey() {
        return this.auctionKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPricefloor() {
        return this.pricefloor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BannerRequest getBanner() {
        return this.banner;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InterstitialRequest getInterstitial() {
        return this.interstitial;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RewardedRequest getRewarded() {
        return this.rewarded;
    }

    @NotNull
    public final Map<String, TokenInfo> component8() {
        return this.demands;
    }

    @NotNull
    public final AdObjectRequest copy(@NotNull String orientationCode, @NotNull String auctionId, @Nullable String auctionKey, double pricefloor, @Nullable BannerRequest banner, @Nullable InterstitialRequest interstitial, @Nullable RewardedRequest rewarded, @NotNull Map<String, TokenInfo> demands) {
        Intrinsics.checkNotNullParameter(orientationCode, "orientationCode");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demands, "demands");
        return new AdObjectRequest(orientationCode, auctionId, auctionKey, pricefloor, banner, interstitial, rewarded, demands);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObjectRequest)) {
            return false;
        }
        AdObjectRequest adObjectRequest = (AdObjectRequest) other;
        return Intrinsics.areEqual(this.orientationCode, adObjectRequest.orientationCode) && Intrinsics.areEqual(this.auctionId, adObjectRequest.auctionId) && Intrinsics.areEqual(this.auctionKey, adObjectRequest.auctionKey) && Double.compare(this.pricefloor, adObjectRequest.pricefloor) == 0 && Intrinsics.areEqual(this.banner, adObjectRequest.banner) && Intrinsics.areEqual(this.interstitial, adObjectRequest.interstitial) && Intrinsics.areEqual(this.rewarded, adObjectRequest.rewarded) && Intrinsics.areEqual(this.demands, adObjectRequest.demands);
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    @Nullable
    public final String getAuctionKey() {
        return this.auctionKey;
    }

    @Nullable
    public final BannerRequest getBanner() {
        return this.banner;
    }

    @NotNull
    public final Map<String, TokenInfo> getDemands() {
        return this.demands;
    }

    @Nullable
    public final InterstitialRequest getInterstitial() {
        return this.interstitial;
    }

    @NotNull
    public final String getOrientationCode() {
        return this.orientationCode;
    }

    public final double getPricefloor() {
        return this.pricefloor;
    }

    @Nullable
    public final RewardedRequest getRewarded() {
        return this.rewarded;
    }

    public int hashCode() {
        int iHashCode = ((this.orientationCode.hashCode() * 31) + this.auctionId.hashCode()) * 31;
        String str = this.auctionKey;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.collection.a.a(this.pricefloor)) * 31;
        BannerRequest bannerRequest = this.banner;
        int iHashCode3 = (iHashCode2 + (bannerRequest == null ? 0 : bannerRequest.hashCode())) * 31;
        InterstitialRequest interstitialRequest = this.interstitial;
        int iHashCode4 = (iHashCode3 + (interstitialRequest == null ? 0 : interstitialRequest.hashCode())) * 31;
        RewardedRequest rewardedRequest = this.rewarded;
        return ((iHashCode4 + (rewardedRequest != null ? rewardedRequest.hashCode() : 0)) * 31) + this.demands.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdObjectRequest(orientationCode=" + this.orientationCode + ", auctionId=" + this.auctionId + ", auctionKey=" + this.auctionKey + ", pricefloor=" + this.pricefloor + ", banner=" + this.banner + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ", demands=" + this.demands + ")";
    }
}
