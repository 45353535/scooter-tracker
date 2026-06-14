package org.bidon.sdk.stats.models;

import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.auction.models.AdUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J^\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013¨\u0006)"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStat;", "", "auctionId", "", "pricefloor", "", "demands", "", "Lorg/bidon/sdk/stats/models/StatsAdUnit;", "noBids", "Lorg/bidon/sdk/auction/models/AdUnit;", "winnerDemandId", "Lorg/bidon/sdk/adapter/DemandId;", "winnerPrice", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lorg/bidon/sdk/adapter/DemandId;Ljava/lang/Double;)V", "getAuctionId", "()Ljava/lang/String;", "getPricefloor", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDemands", "()Ljava/util/List;", "getNoBids", "getWinnerDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "getWinnerPrice", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lorg/bidon/sdk/adapter/DemandId;Ljava/lang/Double;)Lorg/bidon/sdk/stats/models/RoundStat;", "equals", "", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RoundStat {

    @NotNull
    private final String auctionId;

    @NotNull
    private final List<StatsAdUnit> demands;

    @Nullable
    private final List<AdUnit> noBids;

    @Nullable
    private final Double pricefloor;

    @Nullable
    private final DemandId winnerDemandId;

    @Nullable
    private final Double winnerPrice;

    public RoundStat(@NotNull String auctionId, @Nullable Double d10, @NotNull List<StatsAdUnit> demands, @Nullable List<AdUnit> list, @Nullable DemandId demandId, @Nullable Double d11) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demands, "demands");
        this.auctionId = auctionId;
        this.pricefloor = d10;
        this.demands = demands;
        this.noBids = list;
        this.winnerDemandId = demandId;
        this.winnerPrice = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoundStat copy$default(RoundStat roundStat, String str, Double d10, List list, List list2, DemandId demandId, Double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = roundStat.auctionId;
        }
        if ((i10 & 2) != 0) {
            d10 = roundStat.pricefloor;
        }
        if ((i10 & 4) != 0) {
            list = roundStat.demands;
        }
        if ((i10 & 8) != 0) {
            list2 = roundStat.noBids;
        }
        if ((i10 & 16) != 0) {
            demandId = roundStat.winnerDemandId;
        }
        if ((i10 & 32) != 0) {
            d11 = roundStat.winnerPrice;
        }
        DemandId demandId2 = demandId;
        Double d12 = d11;
        return roundStat.copy(str, d10, list, list2, demandId2, d12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getPricefloor() {
        return this.pricefloor;
    }

    @NotNull
    public final List<StatsAdUnit> component3() {
        return this.demands;
    }

    @Nullable
    public final List<AdUnit> component4() {
        return this.noBids;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DemandId getWinnerDemandId() {
        return this.winnerDemandId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getWinnerPrice() {
        return this.winnerPrice;
    }

    @NotNull
    public final RoundStat copy(@NotNull String auctionId, @Nullable Double pricefloor, @NotNull List<StatsAdUnit> demands, @Nullable List<AdUnit> noBids, @Nullable DemandId winnerDemandId, @Nullable Double winnerPrice) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demands, "demands");
        return new RoundStat(auctionId, pricefloor, demands, noBids, winnerDemandId, winnerPrice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundStat)) {
            return false;
        }
        RoundStat roundStat = (RoundStat) other;
        return Intrinsics.areEqual(this.auctionId, roundStat.auctionId) && Intrinsics.areEqual((Object) this.pricefloor, (Object) roundStat.pricefloor) && Intrinsics.areEqual(this.demands, roundStat.demands) && Intrinsics.areEqual(this.noBids, roundStat.noBids) && Intrinsics.areEqual(this.winnerDemandId, roundStat.winnerDemandId) && Intrinsics.areEqual((Object) this.winnerPrice, (Object) roundStat.winnerPrice);
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    @NotNull
    public final List<StatsAdUnit> getDemands() {
        return this.demands;
    }

    @Nullable
    public final List<AdUnit> getNoBids() {
        return this.noBids;
    }

    @Nullable
    public final Double getPricefloor() {
        return this.pricefloor;
    }

    @Nullable
    public final DemandId getWinnerDemandId() {
        return this.winnerDemandId;
    }

    @Nullable
    public final Double getWinnerPrice() {
        return this.winnerPrice;
    }

    public int hashCode() {
        int iHashCode = this.auctionId.hashCode() * 31;
        Double d10 = this.pricefloor;
        int iHashCode2 = (((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.demands.hashCode()) * 31;
        List<AdUnit> list = this.noBids;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DemandId demandId = this.winnerDemandId;
        int iHashCode4 = (iHashCode3 + (demandId == null ? 0 : demandId.hashCode())) * 31;
        Double d11 = this.winnerPrice;
        return iHashCode4 + (d11 != null ? d11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RoundStat(auctionId=" + this.auctionId + ", pricefloor=" + this.pricefloor + ", demands=" + this.demands + ", noBids=" + this.noBids + ", winnerDemandId=" + this.winnerDemandId + ", winnerPrice=" + this.winnerPrice + ")";
    }
}
