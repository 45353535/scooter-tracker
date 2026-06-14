package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f23267a;

    public g(h hVar) {
        this.f23267a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f23267a;
        hVar.getClass();
        IAlog.a("player progress monitor: run started", new Object[0]);
        int iB = hVar.f23268a.b();
        if (!hVar.f23271d) {
            IAlog.a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(iB));
            if (iB >= 2000) {
                IAlog.a("run: setting played 2 seconds flag", new Object[0]);
                hVar.f23271d = true;
            }
        }
        hVar.f23268a.a(iB);
    }
}
