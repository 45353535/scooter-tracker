package org.bidon.sdk.auction;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.auction.models.AuctionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/auction/AuctionResolver;", "", "sortWinners", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AuctionResolver {
    @Nullable
    Object sortWinners(@NotNull List<? extends AuctionResult> list, @NotNull Continuation continuation);
}
