package com.startapp.sdk.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class uj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f65354a;

    public uj(com.startapp.sdk.ads.video.c cVar) {
        this.f65354a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f65354a;
        if (cVar.T && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f65354a;
            if (cVar2.U) {
                int iU = cVar2.u();
                com.startapp.sdk.ads.video.c cVar3 = this.f65354a;
                int iV = cVar3.v();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j10 = iU;
                long seconds = timeUnit.toSeconds(j10);
                if (seconds > cVar3.f63874i0) {
                    cVar3.f63874i0 = seconds;
                    vi.a(cVar3.f65681v, true, "videoApi.setVideoCurrentPosition", Long.valueOf(seconds));
                    if (iU != iV || cVar3.f63872g0) {
                        iV -= iU;
                    }
                    vi.a(cVar3.f65681v, true, "videoApi.setVideoRemainingTimer", Long.valueOf(timeUnit.toSeconds(iV)));
                    if (cVar3.E()) {
                        long j11 = 0;
                        if (!cVar3.X && cVar3.C <= 0) {
                            long seconds2 = timeUnit.toSeconds(cVar3.w()) - timeUnit.toSeconds(j10);
                            if (seconds2 > 0) {
                                j11 = seconds2;
                            }
                        }
                        vi.a(cVar3.f65681v, true, "videoApi.setSkipTimer", Long.valueOf(j11));
                    }
                }
                this.f65354a.b(iU);
            }
        }
        this.f65354a.f63881p0.postDelayed(this, 200L);
    }
}
