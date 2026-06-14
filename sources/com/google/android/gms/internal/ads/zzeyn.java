package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeyn implements zzfav {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzeyn(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = z12;
        this.zze = z13;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z10 = this.zzb;
        bundle.putInt("test_mode", z10 ? 1 : 0);
        boolean z11 = this.zzc;
        bundle.putInt("linked_device", z11 ? 1 : 0);
        if (z10 || z11) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkG)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkK)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z10 = this.zzb;
        bundle.putInt("test_mode", z10 ? 1 : 0);
        boolean z11 = this.zzc;
        bundle.putInt("linked_device", z11 ? 1 : 0);
        if (z10 || z11) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkK)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
