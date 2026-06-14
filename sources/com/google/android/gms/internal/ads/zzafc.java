package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafc {
    public static boolean zza(zzer zzerVar, zzafh zzafhVar, int i10, zzafb zzafbVar) {
        int iZzg = zzerVar.zzg();
        long jZzz = zzerVar.zzz();
        long j10 = jZzz >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = jZzz >> 12;
        long j12 = jZzz >> 8;
        long j13 = jZzz >> 4;
        long j14 = jZzz >> 1;
        long j15 = jZzz & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != zzafhVar.zzg - 1) {
                return false;
            }
        } else if (i11 > 10 || zzafhVar.zzg != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 != 0 && i12 != zzafhVar.zzi) || j15 == 1 || !zzd(zzerVar, zzafhVar, z10, zzafbVar)) {
            return false;
        }
        long j16 = zzafbVar.zza;
        int iZzc = zzc(zzerVar, (int) (j11 & 15));
        long j17 = zzafhVar.zzj;
        boolean z11 = j17 == 0 || j16 + ((long) iZzc) >= j17;
        if (iZzc == -1) {
            return false;
        }
        if ((!z11 && iZzc < zzafhVar.zza) || iZzc > zzafhVar.zzb) {
            return false;
        }
        int i13 = zzafhVar.zze;
        int i14 = (int) (j12 & 15);
        if (i14 != 0) {
            if (i14 <= 11) {
                if (i14 != zzafhVar.zzf) {
                    return false;
                }
            } else if (i14 == 12) {
                if (zzerVar.zzs() * 1000 != i13) {
                    return false;
                }
            } else {
                if (i14 > 14) {
                    return false;
                }
                int iZzt = zzerVar.zzt();
                if (i14 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i13) {
                    return false;
                }
            }
        }
        if (zzerVar.zzs() != zzfj.zzI(zzerVar.zzi(), iZzg, zzerVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzerVar.zzd() != 0) {
            int iZzn = zzerVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i15 = (iZzn & 126) >> 1;
            if ((i15 >= 2 && i15 <= 7) || (i15 >= 13 && i15 <= 31)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 57);
                sb2.append("Ignoring frame where first subframe has a reserved type: ");
                sb2.append(i15);
                zzee.zzb("FlacFrameReader", sb2.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzaev zzaevVar, zzafh zzafhVar) throws IOException {
        zzaevVar.zzl();
        zzaevVar.zzk(1);
        byte[] bArr = new byte[1];
        zzaevVar.zzi(bArr, 0, 1);
        int i10 = bArr[0] & 1;
        boolean z10 = 1 == i10;
        zzaevVar.zzk(2);
        int i11 = 1 != i10 ? 6 : 7;
        zzer zzerVar = new zzer(i11);
        zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 0, i11));
        zzaevVar.zzl();
        zzafb zzafbVar = new zzafb();
        if (zzd(zzerVar, zzafhVar, z10, zzafbVar)) {
            return zzafbVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzer zzerVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzerVar.zzs() + 1;
            case 7:
                return zzerVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzer zzerVar, zzafh zzafhVar, boolean z10, zzafb zzafbVar) {
        try {
            long jZzO = zzerVar.zzO();
            if (!z10) {
                jZzO *= (long) zzafhVar.zzb;
            }
            long j10 = zzafhVar.zzj;
            if (j10 != 0 && jZzO > j10) {
                return false;
            }
            zzafbVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
