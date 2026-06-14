package org.bidon.sdk.ads.banner.helper;

import kotlin.Metadata;
import org.bidon.sdk.auction.models.AdObjectRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\t\u0010\u0002\u001a\u00020\u0003H¦\u0002¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/GetOrientationUseCase;", "", "invoke", "Lorg/bidon/sdk/auction/models/AdObjectRequest$Orientation;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GetOrientationUseCase {
    @NotNull
    AdObjectRequest.Orientation invoke();
}
