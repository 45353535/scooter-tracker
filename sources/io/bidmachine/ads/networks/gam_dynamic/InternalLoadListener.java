package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface InternalLoadListener {
    void onAdLoadFailed(@NonNull InternalAd internalAd, @NonNull ae.a aVar);

    void onAdLoaded(@NonNull InternalAd internalAd, @Nullable InternalAdLoadData internalAdLoadData);
}
