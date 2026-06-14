package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdzt implements zzdzi {
    private final long zza;
    private final zzerx zzb;

    zzdzt(long j10, Context context, zzdzm zzdzmVar, zzcma zzcmaVar, String str) {
        this.zza = j10;
        zzfgx zzfgxVarZzn = zzcmaVar.zzn();
        zzfgxVarZzn.zzd(context);
        zzfgxVarZzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzfgxVarZzn.zzc(str);
        zzerx zzerxVarZza = zzfgxVarZzn.zza().zza();
        this.zzb = zzerxVarZza;
        zzerxVarZza.zzdR(new zzdzs(this, zzdzmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzc() {
        this.zzb.zzc();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
