package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaoy implements zzaon {

    @Nullable
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzer zzd;
    private final zzeq zze;
    private zzagh zzf;
    private String zzg;
    private zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;

    @Nullable
    private String zzw;

    public zzaoy(@Nullable String str, int i10, String str2) {
        this.zza = str;
        this.zzb = i10;
        zzer zzerVar = new zzer(1024);
        this.zzd = zzerVar;
        byte[] bArrZzi = zzerVar.zzi();
        this.zze = new zzeq(bArrZzi, bArrZzi.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzeq zzeqVar) throws zzat {
        int iZzc = zzeqVar.zzc();
        zzads zzadsVarZzb = zzadt.zzb(zzeqVar, true);
        this.zzw = zzadsVarZzb.zzc;
        this.zzt = zzadsVarZzb.zza;
        this.zzv = zzadsVarZzb.zzb;
        return iZzc - zzeqVar.zzc();
    }

    private static long zzg(zzeq zzeqVar) {
        return zzeqVar.zzj((zzeqVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzg = zzaqbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        int i10;
        int i11;
        int iZzj;
        boolean zZzi;
        this.zzf.getClass();
        while (zzerVar.zzd() > 0) {
            int i12 = this.zzi;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iZzs = zzerVar.zzs();
                    if ((iZzs & 224) == 224) {
                        this.zzl = iZzs;
                        this.zzi = 2;
                    } else if (iZzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(zzerVar.zzd(), this.zzk - this.zzj);
                    zzeq zzeqVar = this.zze;
                    zzerVar.zzm(zzeqVar.zza, this.zzj, iMin);
                    int i13 = this.zzj + iMin;
                    this.zzj = i13;
                    if (i13 == this.zzk) {
                        zzeqVar.zzf(0);
                        if (zzeqVar.zzi()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int iZzj2 = zzeqVar.zzj(1);
                            if (iZzj2 == 1) {
                                iZzj = zzeqVar.zzj(1);
                                i11 = 1;
                            } else {
                                i11 = iZzj2;
                                iZzj = 0;
                            }
                            this.zzo = iZzj;
                            if (iZzj != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i11 == 1) {
                                zzg(zzeqVar);
                                i11 = 1;
                            }
                            if (!zzeqVar.zzi()) {
                                throw zzat.zzb(null, null);
                            }
                            this.zzp = zzeqVar.zzj(6);
                            int iZzj3 = zzeqVar.zzj(4);
                            int iZzj4 = zzeqVar.zzj(3);
                            if (iZzj3 != 0 || iZzj4 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i11 == 0) {
                                int iZzd = zzeqVar.zzd();
                                int iZzf = zzf(zzeqVar);
                                zzeqVar.zzf(iZzd);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzeqVar.zzl(bArr, 0, iZzf);
                                zzt zztVar = new zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzl(this.zzc);
                                zztVar.zzm("audio/mp4a-latm");
                                zztVar.zzj(this.zzw);
                                zztVar.zzE(this.zzv);
                                zztVar.zzF(this.zzt);
                                zztVar.zzp(Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                zzv zzvVarZzM = zztVar.zzM();
                                if (!zzvVarZzM.equals(this.zzh)) {
                                    this.zzh = zzvVarZzM;
                                    this.zzu = 1024000000 / ((long) zzvVarZzM.zzH);
                                    this.zzf.zzz(zzvVarZzM);
                                }
                            } else {
                                zzeqVar.zzh(((int) zzg(zzeqVar)) - zzf(zzeqVar));
                            }
                            int iZzj5 = zzeqVar.zzj(3);
                            this.zzq = iZzj5;
                            if (iZzj5 == 0) {
                                zzeqVar.zzh(8);
                            } else if (iZzj5 == 1) {
                                zzeqVar.zzh(9);
                            } else if (iZzj5 == 3 || iZzj5 == 4 || iZzj5 == 5) {
                                zzeqVar.zzh(6);
                            } else {
                                if (iZzj5 != 6 && iZzj5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzeqVar.zzh(1);
                            }
                            boolean zZzi2 = zzeqVar.zzi();
                            this.zzr = zZzi2;
                            this.zzs = 0L;
                            if (zZzi2) {
                                if (i11 != 1) {
                                    do {
                                        zZzi = zzeqVar.zzi();
                                        this.zzs = (this.zzs << 8) + ((long) zzeqVar.zzj(8));
                                    } while (zZzi);
                                } else {
                                    this.zzs = zzg(zzeqVar);
                                }
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzat.zzb(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iZzj6 = zzeqVar.zzj(8);
                            i10 = i14 + iZzj6;
                            if (iZzj6 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iZzd2 = zzeqVar.zzd();
                        if ((iZzd2 & 7) == 0) {
                            this.zzd.zzh(iZzd2 >> 3);
                        } else {
                            zzer zzerVar2 = this.zzd;
                            zzeqVar.zzl(zzerVar2.zzi(), 0, i10 * 8);
                            zzerVar2.zzh(0);
                        }
                        this.zzf.zzc(this.zzd, i10);
                        zzgrc.zzi(this.zzm != -9223372036854775807L);
                        this.zzf.zze(this.zzm, 1, i10, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzeqVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzs2 = ((this.zzl & (-225)) << 8) | zzerVar.zzs();
                    this.zzk = iZzs2;
                    zzer zzerVar3 = this.zzd;
                    if (iZzs2 > zzerVar3.zzi().length) {
                        zzerVar3.zza(iZzs2);
                        zzeq zzeqVar2 = this.zze;
                        byte[] bArrZzi = zzerVar3.zzi();
                        zzeqVar2.zzb(bArrZzi, bArrZzi.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzerVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
    }
}
