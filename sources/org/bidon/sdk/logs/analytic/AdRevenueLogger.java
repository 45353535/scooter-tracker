package org.bidon.sdk.logs.analytic;

import kotlin.Metadata;
import org.bidon.sdk.ads.Ad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/logs/analytic/AdRevenueLogger;", "", "logAdRevenue", "", "ad", "Lorg/bidon/sdk/ads/Ad;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdRevenueLogger {
    void logAdRevenue(@NotNull Ad ad2);
}
