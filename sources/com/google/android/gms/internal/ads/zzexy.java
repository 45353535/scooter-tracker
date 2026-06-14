package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzexy implements zzfav {

    @Nullable
    private final Integer zza;

    public zzexy(@Nullable Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (num != null) {
            zzdahVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
