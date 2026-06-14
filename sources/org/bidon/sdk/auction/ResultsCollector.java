package org.bidon.sdk.auction;

import com.ironsource.X0;
import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.auction.usecases.models.RoundResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H'J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH'J\u0018\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\tH&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"Lorg/bidon/sdk/auction/ResultsCollector;", "", "startRound", "", "pricefloor", "", "serverBiddingStarted", "serverBiddingFinished", X0.f42007c, "", "Lorg/bidon/sdk/auction/models/AdUnit;", "setNoBidInfo", "noBidsInfo", "biddingTimeoutReached", "add", "result", "Lorg/bidon/sdk/auction/models/AuctionResult;", "getRoundResults", "Lorg/bidon/sdk/auction/usecases/models/RoundResult;", "getAll", "clear", "saveWinners", "sourcePriceFloor", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", y.f66058y, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ResultsCollector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int MaxAuctionResultsAmount = 2;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/auction/ResultsCollector$Companion;", "", "<init>", "()V", "MaxAuctionResultsAmount", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int MaxAuctionResultsAmount = 2;

        private Companion() {
        }
    }

    void add(@NotNull AuctionResult result);

    void biddingTimeoutReached();

    void clear();

    @NotNull
    List<AuctionResult> getAll();

    @NotNull
    RoundResult getRoundResults();

    @Nullable
    Object saveWinners(double d10, @NotNull Continuation continuation);

    void serverBiddingFinished(@Nullable List<AdUnit> adUnits);

    void serverBiddingStarted();

    void setNoBidInfo(@Nullable List<AdUnit> noBidsInfo);

    void startRound(double pricefloor);
}
