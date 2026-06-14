package org.bidon.sdk.ads;

import com.ironsource.Df;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.BidonError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lorg/bidon/sdk/ads/AdListener;", "", "onAdLoaded", "", "ad", "Lorg/bidon/sdk/ads/Ad;", "auctionInfo", "Lorg/bidon/sdk/ads/AuctionInfo;", Df.f40641b, "cause", "Lorg/bidon/sdk/config/BidonError;", "onAdShown", Df.f40644e, Df.f40645f, "onAdExpired", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdClicked(@NotNull AdListener adListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
        }

        public static void onAdExpired(@NotNull AdListener adListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
        }

        public static void onAdShowFailed(@NotNull AdListener adListener, @NotNull BidonError cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    void onAdClicked(@NotNull Ad ad2);

    void onAdExpired(@NotNull Ad ad2);

    void onAdLoadFailed(@Nullable AuctionInfo auctionInfo, @NotNull BidonError cause);

    void onAdLoaded(@NotNull Ad ad2, @NotNull AuctionInfo auctionInfo);

    void onAdShowFailed(@NotNull BidonError cause);

    void onAdShown(@NotNull Ad ad2);
}
