package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaeh {
    public static void zza(long j10, zzer zzerVar, zzagh[] zzaghVarArr) {
        int iZzB;
        while (true) {
            if (zzerVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzerVar);
            int iZzc2 = zzc(zzerVar);
            int iZzg = zzerVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzerVar.zzd()) {
                zzee.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzerVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzerVar.zzs();
                int iZzt = zzerVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzerVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzerVar.zzs();
                if (iZzt == 47) {
                    zzerVar.zzk(1);
                    iZzt = 47;
                }
                boolean z10 = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z10 &= iZzB == 1195456820;
                }
                if (z10) {
                    zzb(j10, zzerVar, zzaghVarArr);
                }
            }
            zzerVar.zzh(iZzg);
        }
    }

    public static void zzb(long j10, zzer zzerVar, zzagh[] zzaghVarArr) {
        int iZzs = zzerVar.zzs();
        if ((iZzs & 64) != 0) {
            int i10 = iZzs & 31;
            zzerVar.zzk(1);
            int iZzg = zzerVar.zzg();
            for (zzagh zzaghVar : zzaghVarArr) {
                int i11 = i10 * 3;
                zzerVar.zzh(iZzg);
                zzaghVar.zzc(zzerVar, i11);
                zzgrc.zzi(j10 != -9223372036854775807L);
                zzaghVar.zze(j10, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzer zzerVar) {
        int i10 = 0;
        while (zzerVar.zzd() != 0) {
            int iZzs = zzerVar.zzs();
            i10 += iZzs;
            if (iZzs != 255) {
                return i10;
            }
        }
        return -1;
    }
}
