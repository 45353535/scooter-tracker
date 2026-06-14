package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzapt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    zzapt(int i10) {
    }

    private final int zze(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzaevVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaevVar);
                return 0;
            }
            if (this.zzd) {
                long j11 = this.zzf;
                if (j11 == -9223372036854775807L) {
                    zze(zzaevVar);
                    return 0;
                }
                zzfg zzfgVar = this.zza;
                this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j11);
                zze(zzaevVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzaevVar.zzo());
            if (zzaevVar.zzn() != 0) {
                zzafvVar.zza = 0L;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(iMin);
            zzaevVar.zzl();
            zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
            int iZzg = zzerVar.zzg();
            int iZze = zzerVar.zze();
            while (true) {
                if (iZzg >= iZze) {
                    break;
                }
                if (zzerVar.zzi()[iZzg] == 71) {
                    long jZzb = zzaqd.zzb(zzerVar, iZzg, i10);
                    if (jZzb != -9223372036854775807L) {
                        j10 = jZzb;
                        break;
                    }
                }
                iZzg++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzaevVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j12 = jZzo - ((long) iMin2);
        if (zzaevVar.zzn() != j12) {
            zzafvVar.zza = j12;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(iMin2);
        zzaevVar.zzl();
        zzaevVar.zzi(zzerVar2.zzi(), 0, iMin2);
        int iZzg2 = zzerVar2.zzg();
        int iZze2 = zzerVar2.zze();
        int i11 = iZze2 - 188;
        while (true) {
            if (i11 < iZzg2) {
                break;
            }
            byte[] bArrZzi = zzerVar2.zzi();
            int i12 = -4;
            int i13 = 0;
            while (true) {
                if (i12 > 4) {
                    break;
                }
                int i14 = (i12 * 188) + i11;
                if (i14 < iZzg2 || i14 >= iZze2 || bArrZzi[i14] != 71) {
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 5) {
                        long jZzb2 = zzaqd.zzb(zzerVar2, i11, i10);
                        if (jZzb2 != -9223372036854775807L) {
                            j10 = jZzb2;
                            break;
                        }
                    }
                }
                i12++;
            }
            i11--;
        }
        this.zzg = j10;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfg zzd() {
        return this.zza;
    }
}
