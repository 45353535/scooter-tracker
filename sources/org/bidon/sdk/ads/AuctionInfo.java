package org.bidon.sdk.ads;

import com.ironsource.X0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lorg/bidon/sdk/ads/AuctionInfo;", "", "auctionId", "", "auctionConfigurationId", "", "auctionConfigurationUid", "auctionTimeout", "auctionPricefloor", "", "noBids", "", "Lorg/bidon/sdk/ads/AdUnitInfo;", X0.f42007c, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JDLjava/util/List;Ljava/util/List;)V", "getAuctionId", "()Ljava/lang/String;", "getAuctionConfigurationId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuctionConfigurationUid", "getAuctionTimeout", "()J", "getAuctionPricefloor", "()D", "getNoBids", "()Ljava/util/List;", "getAdUnits", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuctionInfo {

    @Nullable
    private final List<AdUnitInfo> adUnits;

    @Nullable
    private final Long auctionConfigurationId;

    @Nullable
    private final String auctionConfigurationUid;

    @NotNull
    private final String auctionId;
    private final double auctionPricefloor;
    private final long auctionTimeout;

    @Nullable
    private final List<AdUnitInfo> noBids;

    public AuctionInfo(@NotNull String auctionId, @Nullable Long l10, @Nullable String str, long j10, double d10, @Nullable List<AdUnitInfo> list, @Nullable List<AdUnitInfo> list2) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        this.auctionId = auctionId;
        this.auctionConfigurationId = l10;
        this.auctionConfigurationUid = str;
        this.auctionTimeout = j10;
        this.auctionPricefloor = d10;
        this.noBids = list;
        this.adUnits = list2;
    }

    @Nullable
    public final List<AdUnitInfo> getAdUnits() {
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

    public final double getAuctionPricefloor() {
        return this.auctionPricefloor;
    }

    public final long getAuctionTimeout() {
        return this.auctionTimeout;
    }

    @Nullable
    public final List<AdUnitInfo> getNoBids() {
        return this.noBids;
    }
}
