package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaoi implements zzaeu {
    private final zzaoj zza;
    private final zzer zzb;
    private final zzer zzc;
    private final zzeq zzd;
    private zzaex zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaoi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar;
        int i10 = 0;
        while (true) {
            zzerVar = this.zzc;
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
        if (this.zzg == -1) {
            this.zzg = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 2, false);
            zzerVar.zzh(0);
            if (zzaoj.zzf(zzerVar.zzt())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzaelVar2.zzh(zzerVar.zzi(), 0, 4, false);
                zzeq zzeqVar = this.zzd;
                zzeqVar.zzf(14);
                int iZzj = zzeqVar.zzj(13);
                if (iZzj <= 6) {
                    i13++;
                    zzaevVar.zzl();
                    zzaelVar2.zzj(i13, false);
                } else {
                    zzaelVar2.zzj(iZzj - 6, false);
                    i12 += iZzj;
                }
            } else {
                i13++;
                zzaevVar.zzl();
                zzaelVar2.zzj(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = zzaexVar;
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zze.getClass();
        zzer zzerVar = this.zzb;
        int iZza = zzaevVar.zza(zzerVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzafx(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }

    public zzaoi(int i10) {
        this.zza = new zzaoj(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzer(2048);
        this.zzg = -1L;
        zzer zzerVar = new zzer(10);
        this.zzc = zzerVar;
        byte[] bArrZzi = zzerVar.zzi();
        this.zzd = new zzeq(bArrZzi, bArrZzi.length);
    }
}
