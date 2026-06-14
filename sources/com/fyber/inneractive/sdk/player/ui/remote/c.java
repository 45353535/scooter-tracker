package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23378a;

    public c(d dVar) {
        this.f23378a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : remote UI failed task executed", "RemoteUIWebviewController");
        d dVar = this.f23378a;
        if (dVar.f23386h) {
            return;
        }
        dVar.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_LOAD_TIMEOUT, "Loading remote UI timed out", true, null);
    }
}
