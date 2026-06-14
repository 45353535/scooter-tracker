package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.IAd;

/* JADX INFO: loaded from: classes12.dex */
public interface AdListener<AdType extends IAd> {
    void onAdClicked(@NonNull AdType adtype);

    void onAdExpired(@NonNull AdType adtype);

    void onAdImpression(@NonNull AdType adtype);

    void onAdLoadFailed(@NonNull AdType adtype, @NonNull ae.a aVar);

    void onAdLoaded(@NonNull AdType adtype);

    void onAdShowFailed(@NonNull AdType adtype, @NonNull ae.a aVar);
}
