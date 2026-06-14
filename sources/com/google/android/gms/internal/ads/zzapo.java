package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes8.dex */
public final class zzapo implements zzaqc {
    private final zzapn zza;
    private final zzer zzb = new zzer(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzapo(zzapn zzapnVar) {
        this.zza = zzapnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zza.zza(zzfgVar, zzaexVar, zzaqbVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i10) {
        int i11 = i10 & 1;
        int iZzg = i11 != 0 ? zzerVar.zzg() + zzerVar.zzs() : -1;
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzerVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzerVar.zzd() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzh(zzerVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzerVar.zzd(), 3 - this.zzd);
                zzer zzerVar2 = this.zzb;
                zzerVar.zzm(zzerVar2.zzi(), this.zzd, iMin);
                int i13 = this.zzd + iMin;
                this.zzd = i13;
                if (i13 == 3) {
                    zzerVar2.zzh(0);
                    zzerVar2.zzf(3);
                    zzerVar2.zzk(1);
                    int iZzs2 = zzerVar2.zzs();
                    boolean z10 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzerVar2.zzs();
                    this.zze = z10;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzerVar2.zzj();
                    int i14 = this.zzc;
                    if (iZzj < i14) {
                        int iZzj2 = zzerVar2.zzj();
                        zzerVar2.zzc(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i14, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzerVar.zzd(), this.zzc - this.zzd);
                zzer zzerVar3 = this.zzb;
                zzerVar.zzm(zzerVar3.zzi(), this.zzd, iMin2);
                int i15 = this.zzd + iMin2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzerVar3.zzf(i16);
                    } else {
                        if (zzfj.zzG(zzerVar3.zzi(), 0, i16, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzerVar3.zzf(this.zzc - 4);
                    }
                    zzerVar3.zzh(0);
                    this.zza.zzb(zzerVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
