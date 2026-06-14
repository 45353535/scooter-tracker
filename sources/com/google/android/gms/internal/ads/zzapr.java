package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzapr implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();
    private final int zzc;

    public zzapr(int i10, zzfg zzfgVar, int i11) {
        this.zzc = i10;
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j10) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzaevVar.zzn();
        int iMin = (int) Math.min(112800L, zzaevVar.zzo() - jZzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(iMin);
        zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
        int iZze = zzerVar.zze();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzerVar.zzd() >= 188 && (iZza2 = (iZza = zzaqd.zza(zzerVar.zzi(), zzerVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzaqd.zzb(zzerVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j10) {
                    return j12 == -9223372036854775807L ? zzaee.zza(jZze, jZzn) : zzaee.zzc(jZzn + j13);
                }
                j13 = iZza;
                if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jZze > j10) {
                    return zzaee.zzc(jZzn + j13);
                }
                j12 = jZze;
            }
            zzerVar.zzh(iZza2);
            j11 = iZza2;
        }
        return j12 != -9223372036854775807L ? zzaee.zzb(j12, jZzn + j11) : zzaee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
