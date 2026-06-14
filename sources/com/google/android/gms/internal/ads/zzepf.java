package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzepf implements zzdco {
    boolean zza;
    final /* synthetic */ zzekj zzb;
    final /* synthetic */ zzcen zzc;

    zzepf(zzepi zzepiVar, zzekj zzekjVar, zzcen zzcenVar) {
        this.zzb = zzekjVar;
        this.zzc = zzcenVar;
        Objects.requireNonNull(zzepiVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgy)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzekk(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zzb(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzepi.zze(this.zzb.zza, i10), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zzc(int i10, @Nullable String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzepi.zze(this.zzb.zza, i10);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i10, str, "undefined", null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}
