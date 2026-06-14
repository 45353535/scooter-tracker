package org.bidon.sdk.stats;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/stats/WinLossNotifier;", "", "notifyLoss", "", "winnerDemandId", "", "winnerPrice", "", "notifyWin", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface WinLossNotifier {
    void notifyLoss(@NotNull String winnerDemandId, double winnerPrice);

    void notifyWin();
}
