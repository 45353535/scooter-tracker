package yads;

import android.media.MediaCodec;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class p23 implements ni1 {
    public static MediaCodec b(mi1 mi1Var) throws IOException {
        mi1Var.f113509a.getClass();
        String str = mi1Var.f113509a.f116659a;
        q43.a("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        q43.a();
        return mediaCodecCreateByCodecName;
    }

    @Override // yads.ni1
    public final pi1 a(mi1 mi1Var) {
        MediaCodec mediaCodecB = null;
        try {
            mediaCodecB = b(mi1Var);
            q43.a("configureCodec");
            mediaCodecB.configure(mi1Var.f113510b, mi1Var.f113512d, mi1Var.f113513e, 0);
            q43.a();
            q43.a("startCodec");
            mediaCodecB.start();
            q43.a();
            return new q23(mediaCodecB);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecB != null) {
                mediaCodecB.release();
            }
            throw e10;
        }
    }
}
