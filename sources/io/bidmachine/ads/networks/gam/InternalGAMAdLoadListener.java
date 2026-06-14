package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;

/* JADX INFO: loaded from: classes12.dex */
interface InternalGAMAdLoadListener<GAMAdType extends InternalGAMAd> {
    void onAdLoadFailed(@NonNull ae.a aVar);

    void onAdLoaded(@NonNull GAMAdType gamadtype);
}
