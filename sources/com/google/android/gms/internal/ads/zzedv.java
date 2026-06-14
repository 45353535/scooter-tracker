package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes8.dex */
final class zzedv implements zzgzl {
    final /* synthetic */ zzedy zza;

    zzedv(zzedy zzedyVar) {
        Objects.requireNonNull(zzedyVar);
        this.zza = zzedyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            Matcher matcher = zzedy.zzh.matcher(th2.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzedy zzedyVar = this.zza;
                zzedyVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            zzedy zzedyVar = this.zza;
            zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
            zzedyVar.zzc().zzc(zzfiuVar.zzf);
            zzedyVar.zzc().zze(zzfiuVar.zzg);
        }
    }
}
