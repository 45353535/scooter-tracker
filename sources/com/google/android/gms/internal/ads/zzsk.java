package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
final class zzsk {
    private boolean zzA;
    private long zzB;
    private final zzsj zza;
    private final zzdn zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzrl zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    @Nullable
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzsk(zzsj zzsjVar, zzdn zzdnVar, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.zza = zzsjVar;
        this.zzb = zzdnVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzrl(audioTrack, zzsjVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zZzA = zzfj.zzA(i10);
        this.zzg = zZzA;
        this.zzf = zZzA ? zzfj.zzr(i12 / i11, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j10) {
        long j11 = this.zzj;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long jZzw = zzfj.zzw(j10 - j11, this.zzi);
        zzdn zzdnVar = this.zzb;
        long jZza = zzdnVar.zza() - zzfj.zzp(jZzw);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(jZza);
    }

    private final long zzh(long j10) {
        long jMax = Math.max(0L, (this.zzt == 0 ? this.zzu != -9223372036854775807L ? zzfj.zzr(zzl(), this.zze) : zzj() : zzfj.zzv(j10 + this.zzk, this.zzi)) - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfj.zzr(this.zzx, this.zze), jMax) : jMax;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfj.zzr(zzk(), this.zze);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzk() {
        /*
            r12 = this;
            long r0 = r12.zzu
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.zzl()
            long r2 = r12.zzx
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            com.google.android.gms.internal.ads.zzdn r0 = r12.zzb
            long r0 = r0.zzb()
            long r4 = r12.zzp
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L6f
            android.media.AudioTrack r4 = r12.zzd
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L33
            goto L6d
        L33:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 29
            if (r4 > r8) goto L5e
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5c
            long r10 = r12.zzq
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r4 = 3
            if (r5 != r4) goto L5c
            long r4 = r12.zzv
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L6d
            r12.zzv = r0
            goto L6d
        L5c:
            r12.zzv = r2
        L5e:
            long r2 = r12.zzq
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6b
            long r2 = r12.zzr
            r4 = 1
            long r2 = r2 + r4
            r12.zzr = r2
        L6b:
            r12.zzq = r6
        L6d:
            r12.zzp = r0
        L6f:
            long r0 = r12.zzq
            long r2 = r12.zzB
            long r0 = r0 + r2
            long r2 = r12.zzr
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsk.zzk():long");
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfj.zzs(zzfj.zzv(zzfj.zzq(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[Catch: Exception -> 0x009d, TRY_LEAVE, TryCatch #0 {Exception -> 0x009d, blocks: (B:23:0x0075, B:25:0x0095), top: B:52:0x0075 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zza() {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsk.zza():long");
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfj.zzq(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j10) {
        return this.zzv != -9223372036854775807L && j10 > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j10) {
        this.zzw = zzk();
        this.zzu = zzfj.zzq(this.zzb.zzb());
        this.zzx = j10;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
