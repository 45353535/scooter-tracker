package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f21511a;

    public h(i iVar) {
        this.f21511a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f21511a.f21512a.f21525d;
        if (xVar != null) {
            z zVar = xVar.f21544a;
            zVar.getClass();
            IAlog.a("%s onTextureViewDestroyed", IAlog.a(zVar));
        }
    }
}
