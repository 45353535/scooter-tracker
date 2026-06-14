package com.google.android.exoplayer2.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;

/* JADX INFO: loaded from: classes7.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable Surface surface) {
        super(th2, mediaCodecInfo);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
