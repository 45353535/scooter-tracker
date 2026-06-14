package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 21)
public final class zzbpe extends zzbpg {
    private final OnH5AdsEventListener zza;

    public zzbpe(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
