package org.bidon.sdk.ads;

import com.ironsource.Df;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/ads/FullscreenAdListener;", "", Df.f40646g, "", "ad", "Lorg/bidon/sdk/ads/Ad;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FullscreenAdListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdClosed(@NotNull FullscreenAdListener fullscreenAdListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
        }
    }

    void onAdClosed(@NotNull Ad ad2);
}
