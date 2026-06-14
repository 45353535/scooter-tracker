package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zztv implements zzuk {
    private final MediaCodec zza;
    private final zzua zzb;
    private final zzul zzc;

    @Nullable
    private final zzug zzd;
    private boolean zze;
    private int zzf = 0;

    /* synthetic */ zztv(MediaCodec mediaCodec, HandlerThread handlerThread, zzul zzulVar, zzug zzugVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zzua(handlerThread);
        this.zzc = zzulVar;
        this.zzd = zzugVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzw(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zza(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzb(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzb(int i10, int i11, zzie zzieVar, long j10, int i12) {
        this.zzc.zzc(i10, 0, zzieVar, j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzc(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzd(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zze() {
        this.zzc.zzg();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zze(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final MediaFormat zzg() {
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @Nullable
    public final ByteBuffer zzh(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzi(final Runnable runnable) {
        this.zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zztr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzs(runnable);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @Nullable
    public final ByteBuffer zzj(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzk() {
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzg();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzl() {
        zzug zzugVar;
        zzug zzugVar2;
        zzug zzugVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.zza.stop();
                }
                if (i10 >= 35 && (zzugVar3 = this.zzd) != null) {
                    zzugVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th2) {
                if (!this.zze) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.zza.stop();
                    }
                    if (i11 >= 35 && (zzugVar2 = this.zzd) != null) {
                        zzugVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzd) != null) {
                zzugVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final boolean zzm(zzuj zzujVar) {
        this.zzb.zzh(zzujVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @RequiresApi(35)
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzp(Bundle bundle) {
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @RequiresApi(31)
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }

    final /* synthetic */ void zzs(Runnable runnable) {
        this.zzc.zzg();
        this.zzb.zzc(runnable);
    }

    final /* synthetic */ void zzt(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzug zzugVar;
        zzua zzuaVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zzuaVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzd) != null) {
            zzugVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
