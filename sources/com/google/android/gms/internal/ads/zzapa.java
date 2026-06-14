package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes8.dex */
public final class zzapa implements zzaon {
    private String zzf;
    private zzagh zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzer zzb = new zzer(new byte[15], 2);
    private final zzeq zzc = new zzeq();
    private final zzer zzd = new zzer();
    private final zzapb zzq = new zzapb();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzapa(String str) {
    }

    private static final void zzf(zzer zzerVar, zzer zzerVar2, boolean z10) {
        int iZzg = zzerVar.zzg();
        int iMin = Math.min(zzerVar.zzd(), zzerVar2.zzd());
        zzerVar.zzm(zzerVar2.zzi(), zzerVar2.zzg(), iMin);
        zzerVar2.zzk(iMin);
        if (z10) {
            zzerVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzl = i10;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j10 != -9223372036854775807L) {
            double d10 = j10;
            if (this.zzj) {
                this.zzi = d10;
            } else {
                this.zzh = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        int i10;
        int iZzj;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i11 = this.zze;
            if (i11 == 0) {
                int i12 = this.zzl;
                if ((i12 & 2) != 0) {
                    if ((i12 & 4) == 0) {
                        while (zzerVar.zzd() > 0) {
                            int i13 = this.zzm << 8;
                            this.zzm = i13;
                            int iZzs = i13 | zzerVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzerVar.zzh(zzerVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzerVar.zzh(zzerVar.zze());
            } else if (i11 != 1) {
                zzapb zzapbVar = this.zzq;
                int i14 = zzapbVar.zza;
                if (i14 == 1 || i14 == 17) {
                    zzf(zzerVar, this.zzd, true);
                }
                int iMin = Math.min(zzerVar.zzd(), zzapbVar.zzc - this.zzo);
                this.zzg.zzc(zzerVar, iMin);
                int i15 = this.zzo + iMin;
                this.zzo = i15;
                if (i15 == zzapbVar.zzc) {
                    int i16 = zzapbVar.zza;
                    if (i16 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzapc zzapcVarZzb = zzapd.zzb(new zzeq(bArrZzi, bArrZzi.length));
                        this.zzr = zzapcVarZzb.zzb;
                        this.zzs = zzapcVarZzb.zzc;
                        long j10 = this.zzu;
                        long j11 = zzapbVar.zzb;
                        if (j10 != j11) {
                            this.zzu = j11;
                            int i17 = zzapcVarZzb.zza;
                            String strConcat = i17 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i17))) : "mhm1";
                            byte[] bArr = zzapcVarZzb.zzd;
                            zzguf zzgufVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgufVarZzk = zzguf.zzk(zzfj.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzl(this.zza);
                            zztVar.zzm("audio/mhm1");
                            zztVar.zzF(this.zzr);
                            zztVar.zzj(strConcat);
                            zztVar.zzp(zzgufVarZzk);
                            this.zzg.zzz(zztVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i16 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzeq zzeqVar = new zzeq(bArrZzi2, bArrZzi2.length);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(2);
                            iZzj = zzeqVar.zzj(13);
                        } else {
                            iZzj = 0;
                        }
                        this.zzt = iZzj;
                    } else if (i16 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i18 = this.zzs - this.zzt;
                        double d10 = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (((double) i18) * 1000000.0d) / d10;
                        }
                        this.zzg.zze(jRound, i10, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzer zzerVar2 = this.zzb;
                zzf(zzerVar, zzerVar2, false);
                if (zzerVar2.zzd() == 0) {
                    zzeq zzeqVar2 = this.zzc;
                    int iZze = zzerVar2.zze();
                    zzeqVar2.zzb(zzerVar2.zzi(), iZze);
                    zzapb zzapbVar2 = this.zzq;
                    if (zzapd.zza(zzeqVar2, zzapbVar2)) {
                        this.zzo = 0;
                        this.zzp += zzapbVar2.zzc + iZze;
                        zzerVar2.zzh(0);
                        this.zzg.zzc(zzerVar2, zzerVar2.zze());
                        zzerVar2.zza(2);
                        this.zzd.zza(zzapbVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzerVar2.zze() < 15) {
                        zzerVar2.zzf(zzerVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
    }
}
