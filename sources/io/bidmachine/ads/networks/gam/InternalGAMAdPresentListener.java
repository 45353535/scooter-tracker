package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface InternalGAMAdPresentListener {
    void onAdClicked();

    void onAdExpired();

    void onAdShowFailed(@NonNull ae.a aVar);

    void onAdShown();
}
