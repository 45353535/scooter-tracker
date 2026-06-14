package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(24)
final class zzid {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = androidx.media3.decoder.c.a(0, 0);

    /* synthetic */ zzid(MediaCodec.CryptoInfo cryptoInfo, byte[] bArr) {
        this.zza = cryptoInfo;
    }

    final /* synthetic */ void zza(int i10, int i11) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i10, i11);
        this.zza.setPattern(pattern);
    }
}
