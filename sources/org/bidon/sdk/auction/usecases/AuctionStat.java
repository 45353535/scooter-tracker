package org.bidon.sdk.auction.usecases;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.AuctionResponse;
import org.bidon.sdk.auction.usecases.models.RoundResult;
import org.bidon.sdk.stats.models.RoundStat;
import org.bidon.sdk.stats.models.StatsRequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ$\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/auction/usecases/AuctionStat;", "", "markAuctionStarted", "", "auctionId", "", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "addRoundResults", "Lorg/bidon/sdk/stats/models/RoundStat;", "result", "Lorg/bidon/sdk/auction/usecases/models/RoundResult$Results;", "(Lorg/bidon/sdk/auction/usecases/models/RoundResult$Results;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAuctionStats", "Lorg/bidon/sdk/stats/models/StatsRequestBody;", "auctionData", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "roundStat", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "markAuctionCanceled", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AuctionStat {
    @Nullable
    Object addRoundResults(@NotNull RoundResult.Results results, @NotNull Continuation continuation);

    void markAuctionCanceled();

    void markAuctionStarted(@NotNull String auctionId, @NotNull AdTypeParam adTypeParam);

    @Nullable
    StatsRequestBody sendAuctionStats(@NotNull AuctionResponse auctionData, @Nullable RoundStat roundStat, @NotNull DemandAd demandAd);
}
