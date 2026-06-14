package org.bidon.sdk.auction.usecases;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.TokenInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JV\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\fH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/auction/usecases/GetAuctionRequestUseCase;", "", "request", "Lkotlin/Result;", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "auctionId", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "adapters", "", "Lorg/bidon/sdk/adapter/AdapterInfo;", "tokens", "Lorg/bidon/sdk/auction/models/TokenInfo;", "request-hUnOzRk", "(Lorg/bidon/sdk/auction/AdTypeParam;Ljava/lang/String;Lorg/bidon/sdk/adapter/DemandAd;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GetAuctionRequestUseCase {
    @Nullable
    /* JADX INFO: renamed from: request-hUnOzRk */
    Object mo8671requesthUnOzRk(@NotNull AdTypeParam adTypeParam, @NotNull String str, @NotNull DemandAd demandAd, @NotNull Map<String, AdapterInfo> map, @NotNull Map<String, TokenInfo> map2, @NotNull Continuation continuation);
}
