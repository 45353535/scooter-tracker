package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class sj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f65271a;

    public sj(com.startapp.sdk.ads.video.c cVar) {
        this.f65271a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f65271a;
        if (cVar.N == null) {
            return;
        }
        cVar.S = !cVar.S;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f65271a;
        cVar2.a(cVar2.S);
    }
}
