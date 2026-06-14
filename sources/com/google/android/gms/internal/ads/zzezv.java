package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes8.dex */
public final class zzezv implements zzfav {
    private final String zza;
    private final int zzb;

    public zzezv(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString(CommonUrlParts.REQUEST_ID, this.zza);
        if (this.zzb == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzdah) obj).zzb.putString(CommonUrlParts.REQUEST_ID, this.zza);
    }
}
