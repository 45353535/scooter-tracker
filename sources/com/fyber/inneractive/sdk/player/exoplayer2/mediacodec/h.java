package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements g {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
