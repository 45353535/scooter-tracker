package org.bidon.sdk.ads.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.AdUnitInfo;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;
import org.bidon.sdk.stats.models.StatsAdUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toAuctionInfo", "Lorg/bidon/sdk/ads/AdUnitInfo;", "Lorg/bidon/sdk/stats/models/StatsAdUnit;", "toAuctionNoBidInfo", "Lorg/bidon/sdk/auction/models/AdUnit;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AuctionInfoExtKt {
    @NotNull
    public static final AdUnitInfo toAuctionInfo(@NotNull StatsAdUnit statsAdUnit) {
        Intrinsics.checkNotNullParameter(statsAdUnit, "<this>");
        return new AdUnitInfo(statsAdUnit.getDemandId(), statsAdUnit.getAdUnitLabel(), statsAdUnit.getPrice(), statsAdUnit.getAdUnitUid(), statsAdUnit.getBidType(), statsAdUnit.getFillStartTs(), statsAdUnit.getFillFinishTs(), statsAdUnit.getStatus(), String.valueOf(statsAdUnit.getExt()));
    }

    @NotNull
    public static final AdUnitInfo toAuctionNoBidInfo(@NotNull AdUnit adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "<this>");
        return new AdUnitInfo(adUnit.getDemandId(), adUnit.getLabel(), Double.valueOf(adUnit.getPricefloor()), adUnit.getUid(), BidType.RTB.getCode(), null, null, RoundStatus.NoBid.INSTANCE.getCode(), String.valueOf(adUnit.getExtra()));
    }
}
