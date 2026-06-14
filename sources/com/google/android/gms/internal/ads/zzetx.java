package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzetx implements zzfav {

    @Nullable
    private final String zza;
    private final boolean zzb;

    public zzetx(@Nullable String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (str != null) {
            Bundle bundleZza = zzfjz.zza(zzdahVar.zza, "pii");
            bundleZza.putString("afai", str);
            bundleZza.putBoolean("is_afai_lat", this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
