package org.bidon.sdk.auction.usecases;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.AdUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/auction/usecases/RequestAdUnitUseCase;", "", "invoke", "Lorg/bidon/sdk/auction/models/AuctionResult;", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "priceFloor", "", "(Lorg/bidon/sdk/adapter/AdSource;Lorg/bidon/sdk/auction/models/AdUnit;Lorg/bidon/sdk/auction/AdTypeParam;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RequestAdUnitUseCase {
    @Nullable
    Object invoke(@NotNull AdSource<AdAuctionParams> adSource, @NotNull AdUnit adUnit, @NotNull AdTypeParam adTypeParam, double d10, @NotNull Continuation continuation);
}
