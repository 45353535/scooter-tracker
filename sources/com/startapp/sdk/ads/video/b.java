package com.startapp.sdk.ads.video;

import com.startapp.sdk.internal.sd;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f63864a;

    public b(c cVar) {
        this.f63864a = cVar;
    }

    public final void a() {
        c cVar = this.f63864a;
        if (!cVar.f63872g0) {
            cVar.a(VideoMode$VideoFinishedReason.COMPLETE);
        }
        sd sdVar = this.f63864a.N;
        if (sdVar != null) {
            sdVar.f65255h.stopPlayback();
        }
    }
}
