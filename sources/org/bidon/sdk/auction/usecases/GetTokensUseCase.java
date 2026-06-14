package org.bidon.sdk.auction.usecases;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.adapter.AdaptersSource;
import org.bidon.sdk.auction.AdTypeParam;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦B¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/auction/usecases/GetTokensUseCase;", "", "invoke", "", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "adaptersSource", "Lorg/bidon/sdk/adapter/AdaptersSource;", "tokenTimeout", "", "(Lorg/bidon/sdk/auction/AdTypeParam;Lorg/bidon/sdk/adapter/AdaptersSource;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GetTokensUseCase {
    @Nullable
    Object invoke(@NotNull AdTypeParam adTypeParam, @NotNull AdaptersSource adaptersSource, long j10, @NotNull Continuation continuation);
}
