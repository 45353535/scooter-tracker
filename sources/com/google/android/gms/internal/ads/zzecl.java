package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzecl implements zzaqu {
    final /* synthetic */ zzecm zza;

    zzecl(zzecm zzecmVar) {
        Objects.requireNonNull(zzecmVar);
        this.zza = zzecmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zza(int i10) {
        zzaqv zzaqvVarZzd;
        try {
            zzfpb zzfpbVarZza = zzfpc.zza();
            zzfpbVarZza.zzh(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 7 : 6 : 5 : 4 : 3);
            if (i10 == 0 && (zzaqvVarZzd = this.zza.zzc().zzd()) != null) {
                zzfpbVarZza.zzb(zzaqvVarZzd.zzb());
                zzfpbVarZza.zzc(zzaqvVarZzd.zzc());
                zzfpbVarZza.zzd(zzaqvVarZzd.zzd());
                zzfpbVarZza.zze(zzaqvVarZzd.zze());
                zzfpbVarZza.zzf(zzaqvVarZzd.zzf());
                if (!TextUtils.isEmpty(zzaqvVarZzd.zza())) {
                    zzfpbVarZza.zza(zzaqvVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzaqvVarZzd.zzg())) {
                    zzfpbVarZza.zzg(zzaqvVarZzd.zzg());
                }
            }
            zzecm zzecmVar = this.zza;
            zzecmVar.zzc().zzc();
            zzdxz zzdxzVarZzd = zzecmVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfpc) zzfpbVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfO)).booleanValue()) {
                zzdxy zzdxyVarZza = zzdxzVarZzd.zza();
                zzdxyVarZza.zzc("action", "irda");
                zzdxyVarZza.zzc("irdd", strEncodeToString);
                zzdxyVarZza.zzf();
            }
            zzecmVar.zze().zzQ(true);
        } catch (Exception e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfP)).booleanValue()) {
                zzecm zzecmVar2 = this.zza;
                if (zzecmVar2.zzb == null) {
                    zzecmVar2.zzb = zzbyp.zzc(zzecmVar2.zzb());
                }
                zzecmVar2.zzb.zzh(e10, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzecm zzecmVar3 = this.zza;
            if (zzecmVar3.zza == null) {
                zzecmVar3.zza = zzbyp.zza(zzecmVar3.zzb());
            }
            zzecmVar3.zza.zzh(e10, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
