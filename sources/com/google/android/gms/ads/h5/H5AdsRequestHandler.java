package com.google.android.gms.ads.h5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbpo;

/* JADX INFO: loaded from: classes7.dex */
public final class H5AdsRequestHandler {
    private final zzbpo zza;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbpo(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zzb();
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        return this.zza.zza(str);
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return zzbpo.zzc(str);
    }
}
