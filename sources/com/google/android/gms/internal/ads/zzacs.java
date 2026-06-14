package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzacs {
    private final zzacr zza;
    private final zzacz zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdn zzk = zzdn.zza;

    public zzacs(Context context, zzacr zzacrVar, long j10) {
        this.zza = zzacrVar;
        this.zzb = new zzacz(context);
    }

    private final void zzo(int i10) {
        this.zzd = Math.min(this.zzd, i10);
    }

    public final void zza(int i10) {
        if (i10 == 0) {
            this.zzd = 1;
        } else if (i10 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(@Nullable Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f10) {
        this.zzb.zzf(f10);
    }

    public final boolean zzf() {
        int i10 = this.zzd;
        this.zzd = 3;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        return i10 != 3;
    }

    public final void zzg(zzdn zzdnVar) {
        this.zzk = zzdnVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z10) {
        if (z10 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzj(boolean z10) {
        this.zzi = z10;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r17 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r24 >= r28) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        if (r21.zzc != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzk(long r22, long r24, long r26, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.zzacq r32) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacs.zzk(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.zzacq):int");
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzm(int i10) {
        this.zzb.zza(i10);
    }

    public final void zzn(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        zzgrc.zza(f10 > 0.0f);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }
}
