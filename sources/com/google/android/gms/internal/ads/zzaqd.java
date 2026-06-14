package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaqd {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzer zzerVar, int i10, int i11) {
        zzerVar.zzh(i10);
        if (zzerVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int iZzB = zzerVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & 8191) != i11 || (iZzB & 32) == 0 || zzerVar.zzs() < 7 || zzerVar.zzd() < 7 || (zzerVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzerVar.zzm(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((((long) bArr[4]) & 255) >> 7);
    }
}
