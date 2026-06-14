package org.bidon.sdk.adapter;

import kotlin.Metadata;
import org.bidon.sdk.auction.models.AdUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/adapter/AdAuctionParams;", "", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "getAdUnit", "()Lorg/bidon/sdk/auction/models/AdUnit;", "price", "", "getPrice", "()D", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdAuctionParams {
    @NotNull
    AdUnit getAdUnit();

    double getPrice();
}
