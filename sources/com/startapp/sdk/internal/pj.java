package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;

/* JADX INFO: loaded from: classes11.dex */
public final class pj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj f65119a;

    public pj(qj qjVar) {
        this.f65119a = qjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.startapp.sdk.ads.video.c cVar = this.f65119a.f65167a;
            int i10 = com.startapp.sdk.ads.video.c.f63865t0;
            cVar.I();
            com.startapp.sdk.ads.video.c cVar2 = this.f65119a.f65167a;
            cVar2.a(new ck(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", cVar2.u()));
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
