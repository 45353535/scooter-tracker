package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaoc implements zzaeu {
    private final zzaod zza = new zzaod(null, 0, "audio/ac3");
    private final zzer zzb = new zzer(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = new zzer(10);
        int i10 = 0;
        while (true) {
            zzael zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int iZzG = zzerVar.zzG();
            i10 += iZzG + 10;
            zzaelVar.zzj(iZzG, false);
        }
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 6, false);
            zzerVar.zzh(0);
            if (zzerVar.zzt() != 2935) {
                zzaevVar.zzl();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzaelVar2.zzj(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iZzd = zzadv.zzd(zzerVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzaelVar2.zzj(iZzd - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
        zzaexVar.zzw(new zzafx(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        zzer zzerVar = this.zzb;
        int iZza = zzaevVar.zza(zzerVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }
}
