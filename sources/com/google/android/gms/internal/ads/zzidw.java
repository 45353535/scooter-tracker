package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzidw {
    public static final /* synthetic */ int zza = 0;
    private static final zzief zzb;

    static {
        int i10 = zziaa.zza;
        zzb = new zzieh();
    }

    static int zzA(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i10 << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i10 << 3) + 8);
    }

    static int zzD(int i10, Object obj, zzidu zziduVar) {
        int iZzA;
        int iZzaT;
        int iZzA2;
        int i11 = i10 << 3;
        if (obj instanceof zzicm) {
            iZzA = zziaw.zzA(i11);
            iZzaT = ((zzicm) obj).zzb();
            iZzA2 = zziaw.zzA(iZzaT);
        } else {
            iZzA = zziaw.zzA(i11);
            iZzaT = ((zzhzw) obj).zzaT(zziduVar);
            iZzA2 = zziaw.zzA(iZzaT);
        }
        return iZzA + iZzA2 + iZzaT;
    }

    @Deprecated
    static int zzE(int i10, zzidc zzidcVar, zzidu zziduVar) {
        int iZzA = zziaw.zzA(i10 << 3);
        return iZzA + iZzA + ((zzhzw) zzidcVar).zzaT(zziduVar);
    }

    public static zzief zzF() {
        return zzb;
    }

    static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzH(zzibc zzibcVar, Object obj, Object obj2) {
        if (((zzibn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(zzief zziefVar, Object obj, Object obj2) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVarZzc = zzibrVar.zzt;
        zzieg zziegVar = ((zzibr) obj2).zzt;
        if (!zzieg.zza().equals(zziegVar)) {
            if (zzieg.zza().equals(zziegVarZzc)) {
                zziegVarZzc = zzieg.zzc(zziegVarZzc, zziegVar);
            } else {
                zziegVarZzc.zzm(zziegVar);
            }
        }
        zzibrVar.zzt = zziegVarZzc;
    }

    static Object zzJ(Object obj, int i10, List list, zzibx zzibxVar, Object obj2, zzief zziefVar) {
        if (zzibxVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzibxVar.zza(iIntValue)) {
                    obj2 = zzK(obj, i10, iIntValue, obj2, zziefVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (zzibxVar.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzK(obj, i10, iIntValue2, obj2, zziefVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    static Object zzK(Object obj, int i10, int i11, Object obj2, zzief zziefVar) {
        if (obj2 == null) {
            obj2 = zziefVar.zzh(obj);
        }
        zziefVar.zza(obj2, i10, i11);
        return obj2;
    }

    public static void zza(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzC(i10, list, z10);
    }

    public static void zzb(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzB(i10, list, z10);
    }

    public static void zzc(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzy(i10, list, z10);
    }

    public static void zzd(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzz(i10, list, z10);
    }

    public static void zze(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzL(i10, list, z10);
    }

    public static void zzf(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzA(i10, list, z10);
    }

    public static void zzg(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzJ(i10, list, z10);
    }

    public static void zzh(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzw(i10, list, z10);
    }

    public static void zzi(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzH(i10, list, z10);
    }

    public static void zzj(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzK(i10, list, z10);
    }

    public static void zzk(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzx(i10, list, z10);
    }

    public static void zzl(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzI(i10, list, z10);
    }

    public static void zzm(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzD(i10, list, z10);
    }

    public static void zzn(int i10, List list, zzieu zzieuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzE(i10, list, z10);
    }

    public static void zzo(int i10, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzF(i10, list);
    }

    public static void zzp(int i10, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzG(i10, list);
    }

    public static void zzq(int i10, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zziax) zzieuVar).zzr(i10, list.get(i11), zziduVar);
        }
    }

    public static void zzr(int i10, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zziax) zzieuVar).zzs(i10, list.get(i11), zziduVar);
        }
    }

    static int zzs(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zziaw.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzB;
        }
        zzicq zzicqVar = (zzicq) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i10));
            i10++;
        }
        return iZzB2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zziaw.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzB;
        }
        zzicq zzicqVar = (zzicq) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i10));
            i10++;
        }
        return iZzB2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int iZzB = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzB += zziaw.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzB;
        }
        zzicq zzicqVar = (zzicq) list;
        int iZzB2 = 0;
        while (i10 < size) {
            long jZzc = zzicqVar.zzc(i10);
            iZzB2 += zziaw.zzB((jZzc >> 63) ^ (jZzc + jZzc));
            i10++;
        }
        return iZzB2;
    }

    static int zzv(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zziaw.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzB;
        }
        zzibs zzibsVar = (zzibs) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i10));
            i10++;
        }
        return iZzB2;
    }

    static int zzw(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zziaw.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzB;
        }
        zzibs zzibsVar = (zzibs) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i10));
            i10++;
        }
        return iZzB2;
    }

    static int zzx(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zziaw.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzA;
        }
        zzibs zzibsVar = (zzibs) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zziaw.zzA(zzibsVar.zzf(i10));
            i10++;
        }
        return iZzA2;
    }

    static int zzy(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int iZzA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzA += zziaw.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzA;
        }
        zzibs zzibsVar = (zzibs) list;
        int iZzA2 = 0;
        while (i10 < size) {
            int iZzf = zzibsVar.zzf(i10);
            iZzA2 += zziaw.zzA((iZzf >> 31) ^ (iZzf + iZzf));
            i10++;
        }
        return iZzA2;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
