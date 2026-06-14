package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes8.dex */
final class zzaja {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzajj zzc = new zzajj();
    private zzajb zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzaev zzaevVar, int i10) throws IOException {
        byte[] bArr = this.zza;
        zzaevVar.zzc(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }

    public final void zza(zzajb zzajbVar) {
        this.zzd = zzajbVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzaev r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaja.zzc(com.google.android.gms.internal.ads.zzaev):boolean");
    }
}
