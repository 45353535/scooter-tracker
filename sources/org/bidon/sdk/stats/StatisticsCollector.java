package org.bidon.sdk.stats;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.BannerRequest;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001>J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0011H&J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0017H&J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH&J\u001f\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0002\u0010$J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0011H&J\b\u0010*\u001a\u00020\u0011H&J\b\u0010+\u001a\u00020\u0011H&J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H&J\u0010\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u000201H&J\u0010\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u000bH&J\u0010\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u000206H&J\u0010\u00107\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H&J \u00108\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0017H&J\b\u0010:\u001a\u00020;H&J\b\u0010<\u001a\u000206H&J\b\u0010=\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006?"}, d2 = {"Lorg/bidon/sdk/stats/StatisticsCollector;", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "auctionId", "", "getAuctionId", "()Ljava/lang/String;", "getAd", "Lorg/bidon/sdk/ads/Ad;", "sendShowImpression", "", "sendClickImpression", "sendRewardImpression", "sendLoss", "winnerDemandId", "winnerPrice", "", "sendWin", "setPrice", "price", "setDsp", "dspSource", "setTokenInfo", "tokenInfo", "Lorg/bidon/sdk/auction/models/TokenInfo;", "markFillStarted", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "pricefloor", "(Lorg/bidon/sdk/auction/models/AdUnit;Ljava/lang/Double;)V", "markFillFinished", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "(Lorg/bidon/sdk/stats/models/RoundStatus;Ljava/lang/Double;)V", "markWin", "markLoss", "markBelowPricefloor", "setStatisticAdType", "adType", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "addAuctionConfigurationId", "auctionConfigurationId", "", "addAuctionConfigurationUid", "auctionConfigurationUid", "addExternalWinNotificationsEnabled", "enabled", "", "addDemandId", "addRoundInfo", "auctionPricefloor", "getStats", "Lorg/bidon/sdk/stats/models/BidStat;", "canSendWinLoseNotifications", "markWinLoseNotificationsSent", "AdType", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface StatisticsCollector {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "", "Rewarded", "Interstitial", "Banner", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType$Banner;", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType$Interstitial;", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType$Rewarded;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AdType {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/stats/StatisticsCollector$AdType$Banner;", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "format", "Lorg/bidon/sdk/auction/models/BannerRequest$StatFormat;", "<init>", "(Lorg/bidon/sdk/auction/models/BannerRequest$StatFormat;)V", "getFormat", "()Lorg/bidon/sdk/auction/models/BannerRequest$StatFormat;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Banner implements AdType {

            @NotNull
            private final BannerRequest.StatFormat format;

            public Banner(@NotNull BannerRequest.StatFormat format) {
                Intrinsics.checkNotNullParameter(format, "format");
                this.format = format;
            }

            public static /* synthetic */ Banner copy$default(Banner banner, BannerRequest.StatFormat statFormat, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    statFormat = banner.format;
                }
                return banner.copy(statFormat);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final BannerRequest.StatFormat getFormat() {
                return this.format;
            }

            @NotNull
            public final Banner copy(@NotNull BannerRequest.StatFormat format) {
                Intrinsics.checkNotNullParameter(format, "format");
                return new Banner(format);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Banner) && this.format == ((Banner) other).format;
            }

            @NotNull
            public final BannerRequest.StatFormat getFormat() {
                return this.format;
            }

            public int hashCode() {
                return this.format.hashCode();
            }

            @NotNull
            public String toString() {
                return "Banner(format=" + this.format + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/StatisticsCollector$AdType$Interstitial;", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Interstitial implements AdType {

            @NotNull
            public static final Interstitial INSTANCE = new Interstitial();

            private Interstitial() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/StatisticsCollector$AdType$Rewarded;", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Rewarded implements AdType {

            @NotNull
            public static final Rewarded INSTANCE = new Rewarded();

            private Rewarded() {
            }
        }
    }

    void addAuctionConfigurationId(long auctionConfigurationId);

    void addAuctionConfigurationUid(@NotNull String auctionConfigurationUid);

    void addDemandId(@NotNull DemandId demandId);

    void addExternalWinNotificationsEnabled(boolean enabled);

    void addRoundInfo(@NotNull String auctionId, @NotNull DemandAd demandAd, double auctionPricefloor);

    boolean canSendWinLoseNotifications();

    @Nullable
    Ad getAd();

    @NotNull
    String getAuctionId();

    @NotNull
    DemandAd getDemandAd();

    @NotNull
    DemandId getDemandId();

    @NotNull
    BidStat getStats();

    void markBelowPricefloor();

    void markFillFinished(@NotNull RoundStatus roundStatus, @Nullable Double price);

    void markFillStarted(@NotNull AdUnit adUnit, @Nullable Double pricefloor);

    void markLoss();

    void markWin();

    void markWinLoseNotificationsSent();

    void sendClickImpression();

    void sendLoss(@NotNull String winnerDemandId, double winnerPrice);

    void sendRewardImpression();

    void sendShowImpression();

    void sendWin();

    void setDsp(@Nullable String dspSource);

    void setPrice(double price);

    void setStatisticAdType(@NotNull AdType adType);

    void setTokenInfo(@NotNull TokenInfo tokenInfo);
}
