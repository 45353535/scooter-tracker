package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
final class zzfar implements zzfav {
    private final Bundle zza;

    public zzfar(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzdahVar.zza.putBundle("shared_pref", bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzdahVar.zzb.putBundle("shared_pref", bundle);
    }
}
