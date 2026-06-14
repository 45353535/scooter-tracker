package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaof implements zzaeu {
    private final zzaog zza = new zzaog(null, 0, "audio/ac4");
    private final zzer zzb = new zzer(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        char c10;
        int i10;
        char c11 = 2;
        zzer zzerVar = new zzer(10);
        int i11 = 0;
        while (true) {
            zzael zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            char c12 = c11;
            zzerVar.zzk(3);
            int iZzG = zzerVar.zzG();
            i11 += iZzG + 10;
            zzaelVar.zzj(iZzG, false);
            c11 = c12;
        }
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzaelVar2.zzh(zzerVar.zzi(), 0, 7, false);
            zzerVar.zzh(0);
            int iZzt = zzerVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzerVar.zzi();
                int i15 = zzady.zza;
                if (bArrZzi.length < 7) {
                    c10 = c11;
                    i10 = -1;
                } else {
                    c10 = c11;
                    int i16 = (bArrZzi[3] & 255) | ((bArrZzi[c11] & 255) << 8);
                    if (i16 == 65535) {
                        i16 = ((bArrZzi[4] & 255) << 16) | ((bArrZzi[5] & 255) << 8) | (bArrZzi[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iZzt == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzaelVar2.zzj(i10 - 7, false);
                c11 = c10;
            } else {
                zzaevVar.zzl();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzaelVar2.zzj(i13, false);
                i12 = 0;
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
        int iZza = zzaevVar.zza(zzerVar.zzi(), 0, 16384);
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
