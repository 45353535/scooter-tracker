package io.bidmachine.ads.networks.gam;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InternalGAMBannerAd extends InternalGAMAd {
    public InternalGAMBannerAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        super(gAMLoader, adsFormat, gAMUnitData);
    }

    @Nullable
    protected abstract View getAdView();
}
