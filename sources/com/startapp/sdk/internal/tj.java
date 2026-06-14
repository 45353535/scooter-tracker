package com.startapp.sdk.internal;

import android.widget.VideoView;

/* JADX INFO: loaded from: classes11.dex */
public final class tj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f65324a;

    public tj(com.startapp.sdk.ads.video.c cVar) {
        this.f65324a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoView videoView;
        com.startapp.sdk.ads.video.c cVar = this.f65324a;
        if (cVar.N == null || (videoView = cVar.O) == null) {
            return;
        }
        cVar.C++;
        videoView.setVisibility(0);
        com.startapp.sdk.ads.video.c cVar2 = this.f65324a;
        cVar2.f63872g0 = false;
        vi.a(cVar2.f65681v, true, "videoApi.setVideoCurrentPosition", 0);
        vi.a(cVar2.f65681v, true, "videoApi.setSkipTimer", 0);
        this.f65324a.G();
    }
}
