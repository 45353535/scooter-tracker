package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f22745b;

    public i(boolean z10) {
        this.f22744a = z10 ? 1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final int a() {
        if (this.f22745b == null) {
            this.f22745b = new MediaCodecList(this.f22744a).getCodecInfos();
        }
        return this.f22745b.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final MediaCodecInfo a(int i10) {
        if (this.f22745b == null) {
            this.f22745b = new MediaCodecList(this.f22744a).getCodecInfos();
        }
        return this.f22745b[i10];
    }
}
