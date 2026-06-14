package org.bidon.sdk.auction.models;

import kotlin.Metadata;
import org.bidon.sdk.stats.models.BidType;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"getType", "", "Lorg/bidon/sdk/auction/models/AdUnit;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AuctionResultKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getType(AdUnit adUnit) {
        return adUnit.getBidType() == BidType.RTB ? "Bidding" : "Network";
    }
}
