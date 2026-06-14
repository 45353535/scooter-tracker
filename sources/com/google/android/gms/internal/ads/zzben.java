package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.collection.SieveCacheKt;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes8.dex */
public final class zzben {
    public static void zza(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i10, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i10, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            long jZza = zzbek.zza(strArr[i12 - 1]);
            long jZza2 = zzbek.zza(strArr[i12 + 5]);
            String strZzc = zzc(strArr, i12, 6);
            jZze = ((((((jZze + 1073807359) - ((zzd(16785407L, 5) * ((jZza + SieveCacheKt.NodeLinkMask) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jZza2 + SieveCacheKt.NodeLinkMask) % 1073807359)) % 1073807359;
            zzb(i10, jZze, strZzc, length2, priorityQueue);
            i12++;
        }
    }

    @VisibleForTesting
    static void zzb(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzbem zzbemVar = new zzbem(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzbem) priorityQueue.peek()).zzc <= zzbemVar.zzc && ((zzbem) priorityQueue.peek()).zza <= zzbemVar.zza)) && !priorityQueue.contains(zzbemVar)) {
            priorityQueue.add(zzbemVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    @VisibleForTesting
    static String zzc(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i12 - 1;
            if (i10 >= i14) {
                sb2.append(strArr[i14]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    @VisibleForTesting
    static long zzd(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return ((i10 & 1) == 0 ? zzd(j11, i11) : j10 * (zzd(j11, i11) % 1073807359)) % 1073807359;
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long jZza = (((long) zzbek.zza(strArr[0])) + SieveCacheKt.NodeLinkMask) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jZza = (((jZza * 16785407) % 1073807359) + ((((long) zzbek.zza(strArr[i12])) + SieveCacheKt.NodeLinkMask) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
