package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InternalRewardedAd extends InternalFullscreenAd {
    public InternalRewardedAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }
}
