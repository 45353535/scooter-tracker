package org.bidon.sdk.auction.models;

import androidx.collection.a;
import androidx.collection.b;
import androidx.compose.foundation.c;
import com.ironsource.X0;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003Jr\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lorg/bidon/sdk/auction/models/AuctionResponse;", "", X0.f42007c, "", "Lorg/bidon/sdk/auction/models/AdUnit;", "noBids", "pricefloor", "", "auctionId", "", "auctionTimeout", "", "auctionConfigurationId", "auctionConfigurationUid", "externalWinNotificationsEnabled", "", "<init>", "(Ljava/util/List;Ljava/util/List;DLjava/lang/String;JLjava/lang/Long;Ljava/lang/String;Z)V", "getAdUnits", "()Ljava/util/List;", "getNoBids", "getPricefloor", "()D", "getAuctionId", "()Ljava/lang/String;", "getAuctionTimeout", "()J", "getAuctionConfigurationId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuctionConfigurationUid", "getExternalWinNotificationsEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "(Ljava/util/List;Ljava/util/List;DLjava/lang/String;JLjava/lang/Long;Ljava/lang/String;Z)Lorg/bidon/sdk/auction/models/AuctionResponse;", "equals", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AuctionResponse {

    @Nullable
    private final List<AdUnit> adUnits;

    @Nullable
    private final Long auctionConfigurationId;

    @Nullable
    private final String auctionConfigurationUid;

    @NotNull
    private final String auctionId;
    private final long auctionTimeout;
    private final boolean externalWinNotificationsEnabled;

    @Nullable
    private final List<AdUnit> noBids;
    private final double pricefloor;

    public AuctionResponse(@Nullable List<AdUnit> list, @Nullable List<AdUnit> list2, double d10, @NotNull String auctionId, long j10, @Nullable Long l10, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        this.adUnits = list;
        this.noBids = list2;
        this.pricefloor = d10;
        this.auctionId = auctionId;
        this.auctionTimeout = j10;
        this.auctionConfigurationId = l10;
        this.auctionConfigurationUid = str;
        this.externalWinNotificationsEnabled = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuctionResponse copy$default(AuctionResponse auctionResponse, List list, List list2, double d10, String str, long j10, Long l10, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = auctionResponse.adUnits;
        }
        if ((i10 & 2) != 0) {
            list2 = auctionResponse.noBids;
        }
        if ((i10 & 4) != 0) {
            d10 = auctionResponse.pricefloor;
        }
        if ((i10 & 8) != 0) {
            str = auctionResponse.auctionId;
        }
        if ((i10 & 16) != 0) {
            j10 = auctionResponse.auctionTimeout;
        }
        if ((i10 & 32) != 0) {
            l10 = auctionResponse.auctionConfigurationId;
        }
        if ((i10 & 64) != 0) {
            str2 = auctionResponse.auctionConfigurationUid;
        }
        if ((i10 & 128) != 0) {
            z10 = auctionResponse.externalWinNotificationsEnabled;
        }
        boolean z11 = z10;
        Long l11 = l10;
        String str3 = str;
        double d11 = d10;
        return auctionResponse.copy(list, list2, d11, str3, j10, l11, str2, z11);
    }

    @Nullable
    public final List<AdUnit> component1() {
        return this.adUnits;
    }

    @Nullable
    public final List<AdUnit> component2() {
        return this.noBids;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPricefloor() {
        return this.pricefloor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getAuctionTimeout() {
        return this.auctionTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getAuctionConfigurationId() {
        return this.auctionConfigurationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAuctionConfigurationUid() {
        return this.auctionConfigurationUid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getExternalWinNotificationsEnabled() {
        return this.externalWinNotificationsEnabled;
    }

    @NotNull
    public final AuctionResponse copy(@Nullable List<AdUnit> adUnits, @Nullable List<AdUnit> noBids, double pricefloor, @NotNull String auctionId, long auctionTimeout, @Nullable Long auctionConfigurationId, @Nullable String auctionConfigurationUid, boolean externalWinNotificationsEnabled) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        return new AuctionResponse(adUnits, noBids, pricefloor, auctionId, auctionTimeout, auctionConfigurationId, auctionConfigurationUid, externalWinNotificationsEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuctionResponse)) {
            return false;
        }
        AuctionResponse auctionResponse = (AuctionResponse) other;
        return Intrinsics.areEqual(this.adUnits, auctionResponse.adUnits) && Intrinsics.areEqual(this.noBids, auctionResponse.noBids) && Double.compare(this.pricefloor, auctionResponse.pricefloor) == 0 && Intrinsics.areEqual(this.auctionId, auctionResponse.auctionId) && this.auctionTimeout == auctionResponse.auctionTimeout && Intrinsics.areEqual(this.auctionConfigurationId, auctionResponse.auctionConfigurationId) && Intrinsics.areEqual(this.auctionConfigurationUid, auctionResponse.auctionConfigurationUid) && this.externalWinNotificationsEnabled == auctionResponse.externalWinNotificationsEnabled;
    }

    @Nullable
    public final List<AdUnit> getAdUnits() {
        return this.adUnits;
    }

    @Nullable
    public final Long getAuctionConfigurationId() {
        return this.auctionConfigurationId;
    }

    @Nullable
    public final String getAuctionConfigurationUid() {
        return this.auctionConfigurationUid;
    }

    @NotNull
    public final String getAuctionId() {
        return this.auctionId;
    }

    public final long getAuctionTimeout() {
        return this.auctionTimeout;
    }

    public final boolean getExternalWinNotificationsEnabled() {
        return this.externalWinNotificationsEnabled;
    }

    @Nullable
    public final List<AdUnit> getNoBids() {
        return this.noBids;
    }

    public final double getPricefloor() {
        return this.pricefloor;
    }

    public int hashCode() {
        List<AdUnit> list = this.adUnits;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AdUnit> list2 = this.noBids;
        int iHashCode2 = (((((((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + a.a(this.pricefloor)) * 31) + this.auctionId.hashCode()) * 31) + b.a(this.auctionTimeout)) * 31;
        Long l10 = this.auctionConfigurationId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.auctionConfigurationUid;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + c.a(this.externalWinNotificationsEnabled);
    }

    @NotNull
    public String toString() {
        return "AuctionResponse(adUnits=" + this.adUnits + ", noBids=" + this.noBids + ", pricefloor=" + this.pricefloor + ", auctionId=" + this.auctionId + ", auctionTimeout=" + this.auctionTimeout + ", auctionConfigurationId=" + this.auctionConfigurationId + ", auctionConfigurationUid=" + this.auctionConfigurationUid + ", externalWinNotificationsEnabled=" + this.externalWinNotificationsEnabled + ")";
    }
}
