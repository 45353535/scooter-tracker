package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;

/* JADX INFO: loaded from: classes12.dex */
interface InternalAdLoadListener<InternalAdType extends InternalAd> {
    void onAdLoadFailed(@NonNull ae.a aVar);

    void onAdLoaded(@NonNull InternalAdType internaladtype);
}
