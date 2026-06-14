package org.bidon.sdk.auction.models;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/auction/models/AuctionCancellation;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "<init>", "()V", PglCryptUtils.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuctionCancellation extends CancellationException {

    @NotNull
    private final String message = "Auction was cancelled";

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
