package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class zzum extends zzif {
    public final int zza;

    public zzum(Throwable th2, @Nullable zzun zzunVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(zzunVar == null ? null : zzunVar.zza)), th2);
        if (th2 instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.zza = errorCode;
    }
}
