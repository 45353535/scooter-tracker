package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbkh;

/* JADX INFO: loaded from: classes7.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    @Nullable
    private final zzbkh zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, @Nullable Location location, int i10, int i11, @Nullable String str2, String str3, @Nullable zzbkh zzbkhVar) {
        super(context, str, bundle, bundle2, z10, location, i10, i11, str2, str3);
        this.zza = zzbkhVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbkh.zza(this.zza);
    }
}
