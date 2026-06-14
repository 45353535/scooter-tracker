package org.bidon.sdk.stats.usecases;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/stats/usecases/SendWinLossRequestUseCase;", "", "invoke", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "data", "Lorg/bidon/sdk/stats/usecases/WinLossRequestData;", "invoke-gIAlu-s", "(Lorg/bidon/sdk/stats/usecases/WinLossRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SendWinLossRequestUseCase {
    @Nullable
    /* JADX INFO: renamed from: invoke-gIAlu-s */
    Object mo8677invokegIAlus(@NotNull WinLossRequestData winLossRequestData, @NotNull Continuation continuation);
}
