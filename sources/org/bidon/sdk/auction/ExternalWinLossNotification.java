package org.bidon.sdk.auction;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J4\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/auction/ExternalWinLossNotification;", "", "notifyWin", "", "notifyLoss", "winnerDemandId", "", "winnerPrice", "", "onAuctionCancelled", "Lkotlin/Function0;", "onNotified", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ExternalWinLossNotification {
    void notifyLoss(@NotNull String winnerDemandId, double winnerPrice, @NotNull Function0<Unit> onAuctionCancelled, @NotNull Function0<Unit> onNotified);

    void notifyWin();
}
