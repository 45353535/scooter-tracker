package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes4.dex */
public final class fj1 implements ej1 {
    @Override // yads.ej1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // yads.ej1
    public final boolean b() {
        return false;
    }

    @Override // yads.ej1
    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // yads.ej1
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // yads.ej1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
