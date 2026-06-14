package com.appodeal.ads.adapters.bidonmediation.ext;

import com.appodeal.ads.adapters.bidonmediation.AdmobCustomAdapterKt;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.BidonError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"asBidonError", "Lorg/bidon/sdk/config/BidonError;", "Lcom/google/android/gms/ads/LoadAdError;", "Lcom/google/android/gms/ads/AdError;", "admob_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdmobErrorExtKt {
    @NotNull
    public static final BidonError asBidonError(@NotNull LoadAdError loadAdError) {
        Intrinsics.checkNotNullParameter(loadAdError, "<this>");
        int code = loadAdError.getCode();
        return code != 2 ? (code == 3 || code == 9) ? new BidonError.NoFill(AdmobCustomAdapterKt.getAdmobDemandId()) : new BidonError.Unspecified(AdmobCustomAdapterKt.getAdmobDemandId(), null, null, 6, null) : new BidonError.NetworkError(AdmobCustomAdapterKt.getAdmobDemandId(), null, 2, null);
    }

    @NotNull
    public static final BidonError asBidonError(@NotNull AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "<this>");
        int code = adError.getCode();
        if (code == 2) {
            return new BidonError.NetworkError(AdmobCustomAdapterKt.getAdmobDemandId(), null, 2, null);
        }
        if (code != 3 && code != 9) {
            return new BidonError.Unspecified(AdmobCustomAdapterKt.getAdmobDemandId(), null, null, 6, null);
        }
        return new BidonError.NoFill(AdmobCustomAdapterKt.getAdmobDemandId());
    }
}
