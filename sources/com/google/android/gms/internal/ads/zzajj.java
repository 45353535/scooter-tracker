package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzajj {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = i11 + 1;
            if ((zza[i11] & ((long) i10)) != 0) {
                return i12;
            }
            i11 = i12;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~zza[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zzb(zzaev zzaevVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzaevVar.zzb(bArr, 0, 1, z10)) {
                return -1L;
            }
            int iZzd = zzd(bArr[0] & 255);
            this.zzd = iZzd;
            if (iZzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i11 = this.zzd;
        if (i11 > i10) {
            this.zzc = 0;
            return -2L;
        }
        if (i11 != 1) {
            zzaevVar.zzc(this.zzb, 1, i11 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z11);
    }

    public final int zzc() {
        return this.zzd;
    }
}
