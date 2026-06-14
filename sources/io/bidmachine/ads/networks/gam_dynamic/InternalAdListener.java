package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface InternalAdListener {
    void onAdDestroyed(@NonNull InternalAd internalAd, boolean z10);

    void onAdExpired(@NonNull InternalAd internalAd);

    void onAdShown(@NonNull InternalAd internalAd);

    void onPaidEvent(@NonNull InternalAd internalAd);
}
