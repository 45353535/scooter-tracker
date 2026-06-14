package org.bidon.sdk.auction.usecases.models;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.auction.usecases.models.BiddingResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/RoundResult;", "", "Idle", "Results", "Lorg/bidon/sdk/auction/usecases/models/RoundResult$Idle;", "Lorg/bidon/sdk/auction/usecases/models/RoundResult$Results;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RoundResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/RoundResult$Idle;", "Lorg/bidon/sdk/auction/usecases/models/RoundResult;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Idle implements RoundResult {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/RoundResult$Results;", "Lorg/bidon/sdk/auction/usecases/models/RoundResult;", "pricefloor", "", "biddingResult", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "networkResults", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "noBidsInfo", "Lorg/bidon/sdk/auction/models/AdUnit;", "<init>", "(DLorg/bidon/sdk/auction/usecases/models/BiddingResult;Ljava/util/List;Ljava/util/List;)V", "getPricefloor", "()D", "getBiddingResult", "()Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "getNetworkResults", "()Ljava/util/List;", "getNoBidsInfo", "getAuctionResults", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Results implements RoundResult {

        @NotNull
        private final BiddingResult biddingResult;

        @NotNull
        private final List<AuctionResult> networkResults;

        @Nullable
        private final List<AdUnit> noBidsInfo;
        private final double pricefloor;

        /* JADX WARN: Multi-variable type inference failed */
        public Results(double d10, @NotNull BiddingResult biddingResult, @NotNull List<? extends AuctionResult> networkResults, @Nullable List<AdUnit> list) {
            Intrinsics.checkNotNullParameter(biddingResult, "biddingResult");
            Intrinsics.checkNotNullParameter(networkResults, "networkResults");
            this.pricefloor = d10;
            this.biddingResult = biddingResult;
            this.networkResults = networkResults;
            this.noBidsInfo = list;
        }

        @NotNull
        public final List<AuctionResult> getAuctionResults() {
            List<AuctionResult> list = this.networkResults;
            BiddingResult biddingResult = this.biddingResult;
            BiddingResult.FilledAd filledAd = biddingResult instanceof BiddingResult.FilledAd ? (BiddingResult.FilledAd) biddingResult : null;
            List<AuctionResult> results = filledAd != null ? filledAd.getResults() : null;
            if (results == null) {
                results = CollectionsKt.emptyList();
            }
            return CollectionsKt.plus((Collection) list, (Iterable) results);
        }

        @NotNull
        public final BiddingResult getBiddingResult() {
            return this.biddingResult;
        }

        @NotNull
        public final List<AuctionResult> getNetworkResults() {
            return this.networkResults;
        }

        @Nullable
        public final List<AdUnit> getNoBidsInfo() {
            return this.noBidsInfo;
        }

        public final double getPricefloor() {
            return this.pricefloor;
        }
    }
}
