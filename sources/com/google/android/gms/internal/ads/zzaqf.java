package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzaqf {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzagh[] zzc;
    private final zzgq zzd;

    public zzaqf(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
        zzgq zzgqVar = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzaqe
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j10, zzer zzerVar) {
                this.zza.zzc(j10, zzerVar);
            }
        });
        this.zzd = zzgqVar;
        zzgqVar.zza(3);
    }

    public final void zza(zzaex zzaexVar, zzaqb zzaqbVar) {
        int i10 = 0;
        while (true) {
            zzagh[] zzaghVarArr = this.zzc;
            if (i10 >= zzaghVarArr.length) {
                return;
            }
            zzaqbVar.zza();
            zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i10);
            String str = zzvVar.zzo;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzgrc.zzf(z10, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzaqbVar.zzc());
            zztVar.zzl(this.zzb);
            zztVar.zzm(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzJ(zzvVar.zzL);
            zztVar.zzp(zzvVar.zzr);
            zzaghVarZzu.zzz(zztVar.zzM());
            zzaghVarArr[i10] = zzaghVarZzu;
            i10++;
        }
    }

    public final void zzb(long j10, zzer zzerVar) {
        if (zzerVar.zzd() < 9) {
            return;
        }
        int iZzB = zzerVar.zzB();
        int iZzB2 = zzerVar.zzB();
        int iZzs = zzerVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j10, zzerVar);
        }
    }

    final /* synthetic */ void zzc(long j10, zzer zzerVar) {
        zzaeh.zzb(j10, zzerVar, this.zzc);
    }
}
