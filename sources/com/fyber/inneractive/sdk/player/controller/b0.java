package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements VideoRendererEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f21485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21486b = false;

    public b0(f fVar) {
        this.f21485a = new WeakReference(fVar);
    }

    public final String a() {
        f fVar = (f) this.f21485a.get();
        return fVar == null ? b0.class.getName() : IAlog.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i10, long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        f fVar = (f) this.f21485a.get();
        if (fVar != null) {
            fVar.f21501t = i10;
            fVar.f21502u = i11;
        }
    }

    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", a(), Boolean.valueOf(z10), Integer.valueOf(i10));
        f fVar = (f) this.f21485a.get();
        if (fVar == null || (gVar = fVar.f21500s) == null || fVar.f21507z) {
            return;
        }
        if (i10 != 3) {
            if (i10 == 2) {
                if (fVar.f21526e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                    return;
                }
                return;
            } else {
                if (i10 == 4) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            if (fVar.f21526e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = gVar.f22657o;
                if (hVar != null && hVar.f22934a > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f22935b[0];
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = bVar == null ? null : bVar.f22928d[bVar.a()];
                    if (oVar != null) {
                        int i11 = oVar.f22797j;
                        int i12 = oVar.f22798k;
                        fVar.f21501t = i11;
                        fVar.f21502u = i12;
                    }
                }
                this.f21486b = true;
                fVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                return;
            }
            return;
        }
        fVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
    }
}
