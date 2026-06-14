package org.bidon.sdk.stats.models;

import androidx.collection.a;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0080\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006="}, d2 = {"Lorg/bidon/sdk/stats/models/BidStat;", "", "auctionId", "", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "price", "", "auctionPricefloor", "fillStartTs", "", "fillFinishTs", "dspSource", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "tokenInfo", "Lorg/bidon/sdk/auction/models/TokenInfo;", "<init>", "(Ljava/lang/String;Lorg/bidon/sdk/adapter/DemandId;Lorg/bidon/sdk/stats/models/RoundStatus;DDLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/bidon/sdk/auction/models/AdUnit;Lorg/bidon/sdk/auction/models/TokenInfo;)V", "getAuctionId", "()Ljava/lang/String;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "getRoundStatus", "()Lorg/bidon/sdk/stats/models/RoundStatus;", "getPrice", "()D", "getAuctionPricefloor", "getFillStartTs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFillFinishTs", "getDspSource", "getAdUnit", "()Lorg/bidon/sdk/auction/models/AdUnit;", "getTokenInfo", "()Lorg/bidon/sdk/auction/models/TokenInfo;", "bidType", "Lorg/bidon/sdk/stats/models/BidType;", "getBidType", "()Lorg/bidon/sdk/stats/models/BidType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", MenuActionType.COPY, "(Ljava/lang/String;Lorg/bidon/sdk/adapter/DemandId;Lorg/bidon/sdk/stats/models/RoundStatus;DDLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/bidon/sdk/auction/models/AdUnit;Lorg/bidon/sdk/auction/models/TokenInfo;)Lorg/bidon/sdk/stats/models/BidStat;", "equals", "", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BidStat {

    @Nullable
    private final AdUnit adUnit;

    @Nullable
    private final String auctionId;
    private final double auctionPricefloor;

    @NotNull
    private final DemandId demandId;

    @Nullable
    private final String dspSource;

    @Nullable
    private final Long fillFinishTs;

    @Nullable
    private final Long fillStartTs;
    private final double price;

    @Nullable
    private final RoundStatus roundStatus;

    @Nullable
    private final TokenInfo tokenInfo;

    public BidStat(@Nullable String str, @NotNull DemandId demandId, @Nullable RoundStatus roundStatus, double d10, double d11, @Nullable Long l10, @Nullable Long l11, @Nullable String str2, @Nullable AdUnit adUnit, @Nullable TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.auctionId = str;
        this.demandId = demandId;
        this.roundStatus = roundStatus;
        this.price = d10;
        this.auctionPricefloor = d11;
        this.fillStartTs = l10;
        this.fillFinishTs = l11;
        this.dspSource = str2;
        this.adUnit = adUnit;
        this.tokenInfo = tokenInfo;
    }

    public static /* synthetic */ BidStat copy$default(BidStat bidStat, String str, DemandId demandId, RoundStatus roundStatus, double d10, double d11, Long l10, Long l11, String str2, AdUnit adUnit, TokenInfo tokenInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bidStat.auctionId;
        }
        if ((i10 & 2) != 0) {
            demandId = bidStat.demandId;
        }
        if ((i10 & 4) != 0) {
            roundStatus = bidStat.roundStatus;
        }
        if ((i10 & 8) != 0) {
            d10 = bidStat.price;
        }
        if ((i10 & 16) != 0) {
            d11 = bidStat.auctionPricefloor;
        }
        if ((i10 & 32) != 0) {
            l10 = bidStat.fillStartTs;
        }
        if ((i10 & 64) != 0) {
            l11 = bidStat.fillFinishTs;
        }
        if ((i10 & 128) != 0) {
            str2 = bidStat.dspSource;
        }
        if ((i10 & 256) != 0) {
            adUnit = bidStat.adUnit;
        }
        if ((i10 & 512) != 0) {
            tokenInfo = bidStat.tokenInfo;
        }
        TokenInfo tokenInfo2 = tokenInfo;
        String str3 = str2;
        Long l12 = l10;
        double d12 = d11;
        double d13 = d10;
        RoundStatus roundStatus2 = roundStatus;
        return bidStat.copy(str, demandId, roundStatus2, d13, d12, l12, l11, str3, adUnit, tokenInfo2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DemandId getDemandId() {
        return this.demandId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RoundStatus getRoundStatus() {
        return this.roundStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAuctionPricefloor() {
        return this.auctionPricefloor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getFillStartTs() {
        return this.fillStartTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getFillFinishTs() {
        return this.fillFinishTs;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDspSource() {
        return this.dspSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AdUnit getAdUnit() {
        return this.adUnit;
    }

    @NotNull
    public final BidStat copy(@Nullable String auctionId, @NotNull DemandId demandId, @Nullable RoundStatus roundStatus, double price, double auctionPricefloor, @Nullable Long fillStartTs, @Nullable Long fillFinishTs, @Nullable String dspSource, @Nullable AdUnit adUnit, @Nullable TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        return new BidStat(auctionId, demandId, roundStatus, price, auctionPricefloor, fillStartTs, fillFinishTs, dspSource, adUnit, tokenInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidStat)) {
            return false;
        }
        BidStat bidStat = (BidStat) other;
        return Intrinsics.areEqual(this.auctionId, bidStat.auctionId) && Intrinsics.areEqual(this.demandId, bidStat.demandId) && Intrinsics.areEqual(this.roundStatus, bidStat.roundStatus) && Double.compare(this.price, bidStat.price) == 0 && Double.compare(this.auctionPricefloor, bidStat.auctionPricefloor) == 0 && Intrinsics.areEqual(this.fillStartTs, bidStat.fillStartTs) && Intrinsics.areEqual(this.fillFinishTs, bidStat.fillFinishTs) && Intrinsics.areEqual(this.dspSource, bidStat.dspSource) && Intrinsics.areEqual(this.adUnit, bidStat.adUnit) && Intrinsics.areEqual(this.tokenInfo, bidStat.tokenInfo);
    }

    @Nullable
    public final AdUnit getAdUnit() {
        return this.adUnit;
    }

    @Nullable
    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getAuctionPricefloor() {
        return this.auctionPricefloor;
    }

    @Nullable
    public final BidType getBidType() {
        AdUnit adUnit = this.adUnit;
        if (adUnit != null) {
            return adUnit.getBidType();
        }
        return null;
    }

    @NotNull
    public final DemandId getDemandId() {
        return this.demandId;
    }

    @Nullable
    public final String getDspSource() {
        return this.dspSource;
    }

    @Nullable
    public final Long getFillFinishTs() {
        return this.fillFinishTs;
    }

    @Nullable
    public final Long getFillStartTs() {
        return this.fillStartTs;
    }

    public final double getPrice() {
        return this.price;
    }

    @Nullable
    public final RoundStatus getRoundStatus() {
        return this.roundStatus;
    }

    @Nullable
    public final TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public int hashCode() {
        String str = this.auctionId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.demandId.hashCode()) * 31;
        RoundStatus roundStatus = this.roundStatus;
        int iHashCode2 = (((((iHashCode + (roundStatus == null ? 0 : roundStatus.hashCode())) * 31) + a.a(this.price)) * 31) + a.a(this.auctionPricefloor)) * 31;
        Long l10 = this.fillStartTs;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.fillFinishTs;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.dspSource;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdUnit adUnit = this.adUnit;
        int iHashCode6 = (iHashCode5 + (adUnit == null ? 0 : adUnit.hashCode())) * 31;
        TokenInfo tokenInfo = this.tokenInfo;
        return iHashCode6 + (tokenInfo != null ? tokenInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BidStat(auctionId=" + this.auctionId + ", demandId=" + this.demandId + ", roundStatus=" + this.roundStatus + ", price=" + this.price + ", auctionPricefloor=" + this.auctionPricefloor + ", fillStartTs=" + this.fillStartTs + ", fillFinishTs=" + this.fillFinishTs + ", dspSource=" + this.dspSource + ", adUnit=" + this.adUnit + ", tokenInfo=" + this.tokenInfo + ")";
    }
}
