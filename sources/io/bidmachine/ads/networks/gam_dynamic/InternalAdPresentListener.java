package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface InternalAdPresentListener {
    void onAdClicked();

    void onAdExpired();

    void onAdShowFailed(@NonNull ae.a aVar);

    void onAdShown();
}
