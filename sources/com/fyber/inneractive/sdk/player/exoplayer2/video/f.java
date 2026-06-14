package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.media.MediaCodec;
import android.os.Handler;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaCodecVideoRenderer f23207a;

    public f(MediaCodecVideoRenderer mediaCodecVideoRenderer, MediaCodec mediaCodec) {
        this.f23207a = mediaCodecVideoRenderer;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer = this.f23207a;
        if (this == mediaCodecVideoRenderer.f23191p0 && !mediaCodecVideoRenderer.Y) {
            mediaCodecVideoRenderer.Y = true;
            mediaCodecVideoRenderer.Q.renderedFirstFrame(mediaCodecVideoRenderer.W);
        }
    }
}
