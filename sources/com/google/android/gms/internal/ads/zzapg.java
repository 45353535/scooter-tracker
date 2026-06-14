package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzapg implements zzaqc {
    private final zzaon zza;
    private final zzeq zzb = new zzeq(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfg zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzapg(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzer zzerVar, @Nullable byte[] bArr, int i10) {
        int iMin = Math.min(zzerVar.zzd(), i10 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzerVar.zzk(iMin);
        } else {
            zzerVar.zzm(bArr, this.zzd, iMin);
        }
        int i11 = this.zzd + iMin;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zze = zzfgVar;
        this.zza.zzb(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i10) throws zzat {
        int i11;
        int i12;
        long jZze;
        long j10;
        this.zze.getClass();
        int i13 = -1;
        int i14 = 2;
        if ((i10 & 1) != 0) {
            int i15 = this.zzc;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i16);
                        sb2.append(" more bytes");
                        zzee.zzc("PesReader", sb2.toString());
                    }
                    this.zza.zze(zzerVar.zze() == 0);
                } else {
                    zzee.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i17 = i10;
        while (zzerVar.zzd() > 0) {
            int i18 = this.zzc;
            if (i18 == 0) {
                i11 = i14;
                zzerVar.zzk(zzerVar.zzd());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iZzd = zzerVar.zzd();
                    int i19 = this.zzj;
                    int i20 = i19 == i13 ? 0 : iZzd - i19;
                    if (i20 > 0) {
                        iZzd -= i20;
                        zzerVar.zzf(zzerVar.zzg() + iZzd);
                    }
                    zzaon zzaonVar = this.zza;
                    zzaonVar.zzd(zzerVar);
                    int i21 = this.zzj;
                    if (i21 != i13) {
                        int i22 = i21 - iZzd;
                        this.zzj = i22;
                        if (i22 == 0) {
                            zzaonVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzeq zzeqVar = this.zzb;
                    if (zzf(zzerVar, zzeqVar.zza, iMin) && zzf(zzerVar, null, this.zzi)) {
                        zzeqVar.zzf(0);
                        if (this.zzf) {
                            zzeqVar.zzh(4);
                            long jZzj = zzeqVar.zzj(3);
                            zzeqVar.zzh(1);
                            int iZzj = zzeqVar.zzj(15) << 15;
                            zzeqVar.zzh(1);
                            long jZzj2 = zzeqVar.zzj(15);
                            zzeqVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j10 = jZzj;
                            } else {
                                zzeqVar.zzh(4);
                                j10 = jZzj;
                                long jZzj3 = ((long) zzeqVar.zzj(3)) << 30;
                                zzeqVar.zzh(1);
                                int iZzj2 = zzeqVar.zzj(15) << 15;
                                zzeqVar.zzh(1);
                                long jZzj4 = zzeqVar.zzj(15);
                                zzeqVar.zzh(1);
                                this.zze.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (j10 << 30) | ((long) iZzj));
                        } else {
                            jZze = -9223372036854775807L;
                        }
                        i17 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i17);
                        zze(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i11 = i14;
            } else {
                zzeq zzeqVar2 = this.zzb;
                if (zzf(zzerVar, zzeqVar2.zza, 9)) {
                    zzeqVar2.zzf(0);
                    int iZzj3 = zzeqVar2.zzj(24);
                    if (iZzj3 != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj3).length() + 30);
                        sb3.append("Unexpected start code prefix: ");
                        sb3.append(iZzj3);
                        zzee.zzc("PesReader", sb3.toString());
                        i13 = -1;
                        this.zzj = -1;
                        i12 = 0;
                        i11 = 2;
                    } else {
                        zzeqVar2.zzh(8);
                        int iZzj4 = zzeqVar2.zzj(16);
                        zzeqVar2.zzh(5);
                        this.zzk = zzeqVar2.zzi();
                        i11 = 2;
                        zzeqVar2.zzh(2);
                        this.zzf = zzeqVar2.zzi();
                        this.zzg = zzeqVar2.zzi();
                        zzeqVar2.zzh(6);
                        int iZzj5 = zzeqVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i13 = -1;
                        } else {
                            int i23 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i23;
                            if (i23 < 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i23).length() + 36);
                                sb4.append("Found negative packet payload size: ");
                                sb4.append(i23);
                                zzee.zzc("PesReader", sb4.toString());
                                i13 = -1;
                                this.zzj = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i12 = 2;
                    }
                    zze(i12);
                } else {
                    i13 = -1;
                    i11 = 2;
                }
            }
            i14 = i11;
        }
    }

    public final boolean zzd(boolean z10) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
