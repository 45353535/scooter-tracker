package org.bidon.sdk.auction.impl;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lf.i;
import org.bidon.sdk.auction.AuctionResolver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"MaxPriceAuctionResolver", "Lorg/bidon/sdk/auction/AuctionResolver;", "getMaxPriceAuctionResolver", "()Lorg/bidon/sdk/auction/AuctionResolver;", "MaxPriceAuctionResolver$delegate", "Lkotlin/Lazy;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PriceAuctionResolverKt {

    @NotNull
    private static final Lazy MaxPriceAuctionResolver$delegate = i.a(new Function0() { // from class: org.bidon.sdk.auction.impl.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PriceAuctionResolverKt.MaxPriceAuctionResolver_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PriceAuctionResolver MaxPriceAuctionResolver_delegate$lambda$0() {
        return new PriceAuctionResolver();
    }

    @NotNull
    public static final AuctionResolver getMaxPriceAuctionResolver() {
        return (AuctionResolver) MaxPriceAuctionResolver$delegate.getValue();
    }
}
