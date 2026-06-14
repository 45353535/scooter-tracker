package io.bidmachine.ads.networks.gam_dynamic.versions;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ge.a;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes12.dex */
public interface VersionWrapper {
    @Nullable
    InternalAd createAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener);

    int getMinDeviceApiVersion();

    @Nullable
    a getVersion() throws Throwable;

    @NonNull
    a getVersionForWhichCompiled();

    void initialize(@NonNull Context context) throws Throwable;

    boolean isGAMPresent(@NonNull Context context);
}
