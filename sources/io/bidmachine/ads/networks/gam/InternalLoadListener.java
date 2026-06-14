package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface InternalLoadListener {
    void onAdLoadFailed(@NonNull InternalGAMAd internalGAMAd, @NonNull ae.a aVar);

    void onAdLoaded(@NonNull InternalGAMAd internalGAMAd);
}
