package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaod implements zzaon {
    private final zzeq zza;
    private final zzer zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzagh zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzaod(@Nullable String str, int i10, String str2) {
        zzeq zzeqVar = new zzeq(new byte[128], 128);
        this.zza = zzeqVar;
        this.zzb = new zzer(zzeqVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                while (true) {
                    if (zzerVar.zzd() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int iZzs = zzerVar.zzs();
                        if (iZzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzer zzerVar2 = this.zzb;
                            zzerVar2.zzi()[0] = Ascii.VT;
                            zzerVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = iZzs == 11;
                    } else {
                        this.zzj = zzerVar.zzs() == 11;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzerVar, iMin);
                int i11 = this.zzi + iMin;
                this.zzi = i11;
                if (i11 == this.zzm) {
                    zzgrc.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzer zzerVar3 = this.zzb;
                byte[] bArrZzi = zzerVar3.zzi();
                int iMin2 = Math.min(zzerVar.zzd(), 128 - this.zzi);
                zzerVar.zzm(bArrZzi, this.zzi, iMin2);
                int i12 = this.zzi + iMin2;
                this.zzi = i12;
                if (i12 == 128) {
                    zzeq zzeqVar = this.zza;
                    zzeqVar.zzf(0);
                    zzadu zzaduVarZzc = zzadv.zzc(zzeqVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzaduVarZzc.zzc != zzvVar.zzG || zzaduVarZzc.zzb != zzvVar.zzH || !Objects.equals(zzaduVarZzc.zza, zzvVar.zzo)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzl(this.zze);
                        String str = zzaduVarZzc.zza;
                        zztVar.zzm(str);
                        zztVar.zzE(zzaduVarZzc.zzc);
                        zztVar.zzF(zzaduVarZzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i13 = zzaduVarZzc.zzf;
                        zztVar.zzi(i13);
                        if ("audio/ac3".equals(str)) {
                            zztVar.zzh(i13);
                        }
                        zzv zzvVarZzM = zztVar.zzM();
                        this.zzl = zzvVarZzM;
                        this.zzg.zzz(zzvVarZzM);
                    }
                    this.zzm = zzaduVarZzc.zzd;
                    this.zzk = (((long) zzaduVarZzc.zze) * 1000000) / ((long) this.zzl.zzH);
                    zzerVar3.zzh(0);
                    this.zzg.zzc(zzerVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
    }
}
