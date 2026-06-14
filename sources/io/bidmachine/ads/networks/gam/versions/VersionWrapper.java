package io.bidmachine.ads.networks.gam.versions;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ge.a;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;

/* JADX INFO: loaded from: classes12.dex */
public interface VersionWrapper {
    @Nullable
    InternalGAMAd createAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData);

    int getMinDeviceApiVersion();

    @Nullable
    a getVersion() throws Throwable;

    @NonNull
    a getVersionForWhichCompiled();

    void initialize(@NonNull Context context) throws Throwable;

    boolean isGAMPresent(@NonNull Context context);
}
