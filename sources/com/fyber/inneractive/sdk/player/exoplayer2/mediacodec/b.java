package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Exception {
    public b(o oVar, f fVar, int i10) {
        super("Decoder init failed: [" + i10 + "], " + oVar, fVar);
        String str = oVar.f22793f;
        Math.abs(i10);
    }

    public b(o oVar, Exception exc, String str) {
        super("Decoder init failed: " + str + ", " + oVar, exc);
        String str2 = oVar.f22793f;
        if (z.f23162a < 21 || !(exc instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) exc).getDiagnosticInfo();
    }
}
