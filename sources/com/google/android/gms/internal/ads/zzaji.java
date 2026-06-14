package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzaji {
    private final zzer zza = new zzer(8);
    private int zzb;

    private final long zzb(zzaev zzaevVar) throws IOException {
        int i10;
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        int i11 = 0;
        zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        int i12 = zzerVar.zzi()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzaelVar.zzh(zzerVar.zzi(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (zzerVar.zzi()[i11] & 255) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        long jZzo = zzaevVar.zzo();
        long j10 = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j10 = jZzo;
        }
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzerVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzerVar.zzi()[0] & 255))) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzaevVar);
        long j11 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j12 = j11 + jZzb;
            if (jZzo == -1 || j12 < jZzo) {
                while (true) {
                    long j13 = this.zzb;
                    if (j13 < j12) {
                        if (zzb(zzaevVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzaevVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i12 = (int) jZzb2;
                            zzaelVar.zzj(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
