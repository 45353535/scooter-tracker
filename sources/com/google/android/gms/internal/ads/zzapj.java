package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzapj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    zzapj() {
    }

    public static long zze(zzer zzerVar) {
        int iZzg = zzerVar.zzg();
        if (zzerVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzerVar.zzm(bArr, 0, 9);
        zzerVar.zzh(iZzg);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (bArr[1] & 255) << 20;
        long j14 = (j11 & 3) << 13;
        return j14 | j13 | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    private final int zzf(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfg zzb() {
        return this.zza;
    }

    public final int zzc(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzaevVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j11 = jZzo - ((long) iMin);
            if (zzaevVar.zzn() != j11) {
                zzafvVar.zza = j11;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(iMin);
            zzaevVar.zzl();
            zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
            int iZzg = zzerVar.zzg();
            int iZze = zzerVar.zze() - 4;
            while (true) {
                if (iZze < iZzg) {
                    break;
                }
                if (zzg(zzerVar.zzi(), iZze) == 442) {
                    zzerVar.zzh(iZze + 4);
                    long jZze = zze(zzerVar);
                    if (jZze != -9223372036854775807L) {
                        j10 = jZze;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzaevVar);
            return 0;
        }
        if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzaevVar);
                return 0;
            }
            zzfg zzfgVar = this.zza;
            this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j12);
            zzf(zzaevVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzaevVar.zzo());
        if (zzaevVar.zzn() != 0) {
            zzafvVar.zza = 0L;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(iMin2);
        zzaevVar.zzl();
        zzaevVar.zzi(zzerVar2.zzi(), 0, iMin2);
        int iZzg2 = zzerVar2.zzg();
        int iZze2 = zzerVar2.zze();
        while (true) {
            if (iZzg2 >= iZze2 - 3) {
                break;
            }
            if (zzg(zzerVar2.zzi(), iZzg2) == 442) {
                zzerVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzerVar2);
                if (jZze2 != -9223372036854775807L) {
                    j10 = jZze2;
                    break;
                }
            }
            iZzg2++;
        }
        this.zzf = j10;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
