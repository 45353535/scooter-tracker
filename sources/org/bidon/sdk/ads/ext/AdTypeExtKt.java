package org.bidon.sdk.ads.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.AdType;
import org.bidon.sdk.auction.AdTypeParam;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asAdType", "Lorg/bidon/sdk/ads/AdType;", "Lorg/bidon/sdk/auction/AdTypeParam;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdTypeExtKt {
    @NotNull
    public static final AdType asAdType(@NotNull AdTypeParam adTypeParam) {
        Intrinsics.checkNotNullParameter(adTypeParam, "<this>");
        if (adTypeParam instanceof AdTypeParam.Banner) {
            return AdType.Banner;
        }
        if (adTypeParam instanceof AdTypeParam.Interstitial) {
            return AdType.Interstitial;
        }
        if (adTypeParam instanceof AdTypeParam.Rewarded) {
            return AdType.Rewarded;
        }
        throw new m();
    }
}
