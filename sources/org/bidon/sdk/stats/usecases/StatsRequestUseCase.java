package org.bidon.sdk.stats.usecases;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.stats.models.StatsRequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH¦B¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/stats/usecases/StatsRequestUseCase;", "", "invoke", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "statsRequestBody", "Lorg/bidon/sdk/stats/models/StatsRequestBody;", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "invoke-0E7RQCE", "(Lorg/bidon/sdk/stats/models/StatsRequestBody;Lorg/bidon/sdk/adapter/DemandAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface StatsRequestUseCase {
    @Nullable
    /* JADX INFO: renamed from: invoke-0E7RQCE */
    Object mo8678invoke0E7RQCE(@Nullable StatsRequestBody statsRequestBody, @NotNull DemandAd demandAd, @NotNull Continuation continuation);
}
