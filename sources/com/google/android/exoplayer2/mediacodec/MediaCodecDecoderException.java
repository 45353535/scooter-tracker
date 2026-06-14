package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;

    public MediaCodecDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        super(sb2.toString(), th2);
        this.codecInfo = mediaCodecInfo;
        this.diagnosticInfo = Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th2) : null;
    }

    @Nullable
    @RequiresApi(21)
    private static String getDiagnosticInfoV21(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
