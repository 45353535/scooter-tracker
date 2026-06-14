package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* JADX INFO: loaded from: classes8.dex */
final class zzrl {
    private final zzrk zza;
    private final int zzb;
    private final zzsj zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzrl(AudioTrack audioTrack, zzsj zzsjVar) {
        this.zza = new zzrk(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzsjVar;
        zzf(0);
    }

    private final void zzf(int i10) {
        this.zzd = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.zzf = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j10;
    }

    private final long zzg(long j10, float f10) {
        zzrk zzrkVar = this.zza;
        return zzh(zzrkVar.zzc(), zzrkVar.zzb(), j10, f10);
    }

    private final long zzh(long j10, long j11, long j12, float f10) {
        return zzfj.zzr(j10, this.zzb) + zzfj.zzv(j12 - j11, f10);
    }

    public final void zza(long j10, float f10, long j11) {
        boolean z10;
        int i10;
        if (j10 - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j10;
        zzrk zzrkVar = this.zza;
        boolean zZza = zzrkVar.zza();
        if (zZza) {
            long jZzb = zzrkVar.zzb();
            long jZzg = zzg(j10, f10);
            i10 = 2;
            if (Math.abs(jZzb - j10) > 5000000) {
                zzsj zzsjVar = this.zzc;
                long jZzc = zzrkVar.zzc();
                long jZzq = ((zzrw) zzsjVar).zza.zzq();
                int length = String.valueOf(jZzc).length();
                int length2 = String.valueOf(jZzb).length();
                int length3 = String.valueOf(j10).length();
                StringBuilder sb2 = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j11).length() + 2 + String.valueOf(jZzq).length());
                sb2.append("Spurious audio timestamp (system clock mismatch): ");
                sb2.append(jZzc);
                sb2.append(", ");
                sb2.append(jZzb);
                sb2.append(", ");
                sb2.append(j10);
                sb2.append(", ");
                sb2.append(j11);
                sb2.append(", ");
                sb2.append(jZzq);
                zzee.zzc("AudioTrackAudioOutput", sb2.toString());
                zzf(4);
                z10 = zZza;
            } else if (Math.abs(jZzg - j11) > 5000000) {
                zzsj zzsjVar2 = this.zzc;
                long jZzc2 = zzrkVar.zzc();
                long jZzq2 = ((zzrw) zzsjVar2).zza.zzq();
                int length4 = String.valueOf(jZzc2).length();
                int length5 = String.valueOf(jZzb).length();
                int length6 = String.valueOf(j10).length();
                int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j11).length() + 2;
                z10 = zZza;
                StringBuilder sb3 = new StringBuilder(length7 + String.valueOf(jZzq2).length());
                sb3.append("Spurious audio timestamp (frame position mismatch): ");
                sb3.append(jZzc2);
                sb3.append(", ");
                sb3.append(jZzb);
                sb3.append(", ");
                sb3.append(j10);
                sb3.append(", ");
                sb3.append(j11);
                sb3.append(", ");
                sb3.append(jZzq2);
                zzee.zzc("AudioTrackAudioOutput", sb3.toString());
                zzf(4);
            } else {
                z10 = zZza;
                if (this.zzd == 4) {
                    zzf(0);
                }
            }
        } else {
            z10 = zZza;
            i10 = 2;
        }
        int i11 = this.zzd;
        if (i11 == 0) {
            if (!z10) {
                if (j10 - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzrkVar.zzb() >= this.zze) {
                    this.zzh = zzrkVar.zzc();
                    this.zzi = zzrkVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 == i10) {
                if (z10) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i11 == 3 && z10) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            zzf(0);
            return;
        }
        long jZzc3 = zzrkVar.zzc();
        long j12 = this.zzh;
        if (jZzc3 > j12) {
            if (Math.abs(zzg(j10, f10) - zzh(j12, this.zzi, j10, f10)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j10 - this.zze > SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) {
            zzf(3);
        } else {
            this.zzh = zzrkVar.zzc();
            this.zzi = zzrkVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i10 = this.zzd;
        return i10 == 0 || i10 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j10, float f10) {
        return zzg(j10, f10);
    }
}
