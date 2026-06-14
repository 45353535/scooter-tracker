package org.bidon.sdk.auction.usecases;

import com.ironsource.X0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.ResultsCollector;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001Jx\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u0018H¦B¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lorg/bidon/sdk/auction/usecases/ExecuteAuctionUseCase;", "", "invoke", "", "auctionId", "", "auctionConfigurationId", "", "auctionConfigurationUid", "externalWinNotificationsEnabled", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "pricefloor", "", "auctionTimeout", X0.f42007c, "", "Lorg/bidon/sdk/auction/models/AdUnit;", "resultsCollector", "Lorg/bidon/sdk/auction/ResultsCollector;", "tokens", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "(Ljava/lang/String;JLjava/lang/String;ZLorg/bidon/sdk/adapter/DemandAd;Lorg/bidon/sdk/auction/AdTypeParam;DJLjava/util/List;Lorg/bidon/sdk/auction/ResultsCollector;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ExecuteAuctionUseCase {
    @Nullable
    Object invoke(@NotNull String str, long j10, @NotNull String str2, boolean z10, @NotNull DemandAd demandAd, @NotNull AdTypeParam adTypeParam, double d10, long j11, @NotNull List<AdUnit> list, @NotNull ResultsCollector resultsCollector, @NotNull Map<String, TokenInfo> map, @NotNull Continuation continuation);
}
