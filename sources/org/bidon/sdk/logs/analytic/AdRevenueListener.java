package org.bidon.sdk.logs.analytic;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/logs/analytic/AdRevenueListener;", "", "onRevenuePaid", "", "ad", "Lorg/bidon/sdk/ads/Ad;", "adValue", "Lorg/bidon/sdk/logs/analytic/AdValue;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdRevenueListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onRevenuePaid(@NotNull AdRevenueListener adRevenueListener, @NotNull Ad ad2, @NotNull AdValue adValue) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            Intrinsics.checkNotNullParameter(adValue, "adValue");
        }
    }

    void onRevenuePaid(@NotNull Ad ad2, @NotNull AdValue adValue);
}
