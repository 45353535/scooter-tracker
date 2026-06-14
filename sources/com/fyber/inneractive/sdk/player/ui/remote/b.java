package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23377a;

    public b(d dVar) {
        this.f23377a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : remote UI load timeout task executed", "RemoteUIWebviewController");
        d dVar = this.f23377a;
        dVar.f23385g = true;
        IAlog.a("%s : UI load timed out", "RemoteUIWebviewController");
        r.f23896b.post(dVar.f23390l);
    }
}
