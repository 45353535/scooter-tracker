package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface zzuk {
    void zza(int i10, int i11, int i12, long j10, int i13);

    void zzb(int i10, int i11, zzie zzieVar, long j10, int i12);

    void zzc(int i10, boolean z10);

    void zzd(int i10, long j10);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    @Nullable
    ByteBuffer zzh(int i10);

    void zzi(Runnable runnable);

    @Nullable
    ByteBuffer zzj(int i10);

    void zzk();

    void zzl();

    boolean zzm(zzuj zzujVar);

    void zzn(Surface surface);

    @RequiresApi(35)
    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i10);

    @RequiresApi(31)
    void zzr(List list);
}
