package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvh implements zzuk {
    private final MediaCodec zza;

    @Nullable
    private final zzug zzb;

    /* synthetic */ zzvh(MediaCodec mediaCodec, zzug zzugVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzugVar;
        if (Build.VERSION.SDK_INT < 35 || zzugVar == null) {
            return;
        }
        zzugVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zza(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzb(int i10, int i11, zzie zzieVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzieVar.zzb(), j10, i12);
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
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @Nullable
    public final ByteBuffer zzh(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public /* synthetic */ void zzi(Runnable runnable) {
        h2.a(this, runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @Nullable
    public final ByteBuffer zzj(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzl() {
        zzug zzugVar;
        zzug zzugVar2;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && (zzugVar2 = this.zzb) != null) {
                zzugVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzb) != null) {
                zzugVar.zzc(this.zza);
            }
            this.zza.release();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public /* synthetic */ boolean zzm(zzuj zzujVar) {
        return h2.b(this, zzujVar);
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
        this.zza.setParameters(bundle);
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
}
