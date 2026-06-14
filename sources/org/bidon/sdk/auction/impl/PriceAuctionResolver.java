package org.bidon.sdk.auction.impl;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import lf.m;
import org.bidon.sdk.auction.AuctionResolver;
import org.bidon.sdk.auction.models.AuctionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/auction/impl/PriceAuctionResolver;", "Lorg/bidon/sdk/auction/AuctionResolver;", "<init>", "()V", "sortWinners", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PriceAuctionResolver implements AuctionResolver {
    @Override // org.bidon.sdk.auction.AuctionResolver
    @Nullable
    public Object sortWinners(@NotNull List<? extends AuctionResult> list, @NotNull Continuation continuation) {
        return CollectionsKt.sortedWith(list, new Comparator() { // from class: org.bidon.sdk.auction.impl.PriceAuctionResolver$sortWinners$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                double pricefloor;
                double pricefloor2;
                AuctionResult auctionResult = (AuctionResult) t11;
                if (auctionResult instanceof AuctionResult.Bidding) {
                    pricefloor = ((AuctionResult.Bidding) auctionResult).getAdSource().getStats().getPrice();
                } else if (auctionResult instanceof AuctionResult.Network) {
                    pricefloor = ((AuctionResult.Network) auctionResult).getAdSource().getStats().getPrice();
                } else {
                    if (!(auctionResult instanceof AuctionResult.AuctionFailed)) {
                        throw new m();
                    }
                    pricefloor = ((AuctionResult.AuctionFailed) auctionResult).getAdUnit().getPricefloor();
                }
                Double dValueOf = Double.valueOf(pricefloor);
                AuctionResult auctionResult2 = (AuctionResult) t10;
                if (auctionResult2 instanceof AuctionResult.Bidding) {
                    pricefloor2 = ((AuctionResult.Bidding) auctionResult2).getAdSource().getStats().getPrice();
                } else if (auctionResult2 instanceof AuctionResult.Network) {
                    pricefloor2 = ((AuctionResult.Network) auctionResult2).getAdSource().getStats().getPrice();
                } else {
                    if (!(auctionResult2 instanceof AuctionResult.AuctionFailed)) {
                        throw new m();
                    }
                    pricefloor2 = ((AuctionResult.AuctionFailed) auctionResult2).getAdUnit().getPricefloor();
                }
                return mf.a.d(dValueOf, Double.valueOf(pricefloor2));
            }
        });
    }
}
