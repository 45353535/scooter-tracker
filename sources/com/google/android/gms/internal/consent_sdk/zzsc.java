package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final zzsp zzb;

    static {
        int i10 = zzpc.zza;
        zzb = new zzsr();
    }

    public static void zzA(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzC(i10, list, z10);
    }

    public static void zzB(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzE(i10, list, z10);
    }

    public static void zzC(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzI(i10, list, z10);
    }

    public static void zzD(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzK(i10, list, z10);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    static int zza(int i10, zzrq zzrqVar, zzsa zzsaVar) {
        int iZzC = zzpv.zzC(i10 << 3);
        return iZzC + iZzC + ((zzpa) zzrqVar).zzj(zzsaVar);
    }

    static int zzb(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzpv.zzD(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzD;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i10 << 3) + 4);
    }

    static int zzd(List list) {
        return list.size() * 4;
    }

    static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i10 << 3) + 8);
    }

    static int zzf(List list) {
        return list.size() * 8;
    }

    static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzpv.zzD(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzD;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    static int zzh(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzpv.zzD(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    static int zzi(int i10, Object obj, zzsa zzsaVar) {
        int iZzC;
        int iZzj;
        int iZzC2;
        int i11 = i10 << 3;
        if (obj instanceof zzra) {
            iZzC = zzpv.zzC(i11);
            iZzj = ((zzra) obj).zza();
            iZzC2 = zzpv.zzC(iZzj);
        } else {
            iZzC = zzpv.zzC(i11);
            iZzj = ((zzpa) obj).zzj(zzsaVar);
            iZzC2 = zzpv.zzC(iZzj);
        }
        return iZzC + iZzC2 + iZzj;
    }

    static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzC = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzC += zzpv.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzC;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzC2 = 0;
        while (i10 < size) {
            int iZze = zzqnVar.zze(i10);
            iZzC2 += zzpv.zzC((iZze >> 31) ^ (iZze + iZze));
            i10++;
        }
        return iZzC2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzD += zzpv.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i10 < size) {
            long jZze = zzreVar.zze(i10);
            iZzD2 += zzpv.zzD((jZze >> 63) ^ (jZze + jZze));
            i10++;
        }
        return iZzD2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzC = 0;
            while (i10 < size) {
                iZzC += zzpv.zzC(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzC;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzC2 = 0;
        while (i10 < size) {
            iZzC2 += zzpv.zzC(zzqnVar.zze(i10));
            i10++;
        }
        return iZzC2;
    }

    static int zzm(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzpv.zzD(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    public static zzsp zzn() {
        return zzb;
    }

    static void zzo(zzqb zzqbVar, Object obj, Object obj2) {
        if (((zzqk) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zzsp zzspVar, Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        zzsq zzsqVarZze = zzqmVar.zzc;
        zzsq zzsqVar = ((zzqm) obj2).zzc;
        if (!zzsq.zzc().equals(zzsqVar)) {
            if (zzsq.zzc().equals(zzsqVarZze)) {
                zzsqVarZze = zzsq.zze(zzsqVarZze, zzsqVar);
            } else {
                zzsqVarZze.zzd(zzsqVar);
            }
        }
        zzqmVar.zzc = zzsqVarZze;
    }

    public static void zzq(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzc(i10, list, z10);
    }

    public static void zzr(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzg(i10, list, z10);
    }

    public static void zzs(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzi(i10, list, z10);
    }

    public static void zzt(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzk(i10, list, z10);
    }

    public static void zzu(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzm(i10, list, z10);
    }

    public static void zzv(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzo(i10, list, z10);
    }

    public static void zzw(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzr(i10, list, z10);
    }

    public static void zzx(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzt(i10, list, z10);
    }

    public static void zzy(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzy(i10, list, z10);
    }

    public static void zzz(int i10, List list, zztb zztbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzA(i10, list, z10);
    }
}
