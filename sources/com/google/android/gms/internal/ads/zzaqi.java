package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes8.dex */
final class zzaqi implements zzaqh {
    private final zzaex zza;
    private final zzagh zzb;
    private final zzaql zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaqi(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar, String str, int i10) throws zzat {
        this.zza = zzaexVar;
        this.zzb = zzaghVar;
        this.zzc = zzaqlVar;
        int i11 = zzaqlVar.zzb * zzaqlVar.zze;
        int i12 = zzaqlVar.zzd;
        int i13 = i11 / 8;
        if (i12 != i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 28 + String.valueOf(i12).length());
            sb2.append("Expected block size: ");
            sb2.append(i13);
            sb2.append("; got: ");
            sb2.append(i12);
            throw zzat.zzb(sb2.toString(), null);
        }
        int i14 = zzaqlVar.zzc * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzl("audio/wav");
        zztVar.zzm(str);
        zztVar.zzh(i15);
        zztVar.zzi(i15);
        zztVar.zzn(iMax);
        zztVar.zzE(zzaqlVar.zzb);
        zztVar.zzF(zzaqlVar.zzc);
        zztVar.zzG(i10);
        this.zzd = zztVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(int i10, long j10) {
        zzaqo zzaqoVar = new zzaqo(this.zzc, 1, i10, j10);
        this.zza.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzb;
        zzaghVar.zzz(this.zzd);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final boolean zzc(zzaev zzaevVar, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int iZza = this.zzb.zza(zzaevVar, (int) Math.min(i11 - i10, j11), true);
            if (iZza == -1) {
                j11 = 0;
            } else {
                this.zzg += iZza;
                j11 -= (long) iZza;
            }
        }
        zzaql zzaqlVar = this.zzc;
        int i12 = this.zzg;
        int i13 = zzaqlVar.zzd;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jZzt = this.zzf + zzfj.zzt(this.zzh, 1000000L, zzaqlVar.zzc, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zze(jZzt, 1, i15, i16, null);
            this.zzh += (long) i14;
            this.zzg = i16;
        }
        return j11 <= 0;
    }
}
