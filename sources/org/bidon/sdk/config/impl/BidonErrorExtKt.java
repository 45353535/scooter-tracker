package org.bidon.sdk.config.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.auction.models.AuctionCancellation;
import org.bidon.sdk.config.BidonError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asBidonErrorOrUnspecified", "Lorg/bidon/sdk/config/BidonError;", "", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BidonErrorExtKt {
    @NotNull
    public static final BidonError asBidonErrorOrUnspecified(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return th2 instanceof BidonError ? (BidonError) th2 : th2 instanceof AuctionCancellation ? BidonError.AuctionCancelled.INSTANCE : new BidonError.Unspecified(null, th2, null, 4, null);
    }
}
