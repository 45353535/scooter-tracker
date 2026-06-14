package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f23683a;

    public n(p pVar) {
        this.f23683a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f23683a;
        if (pVar.f23693t != null) {
            IAlog.a("%sIdle state reached!", IAlog.a(pVar));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23683a.f23662k;
            if (bVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.s) bVar).j(true);
            }
            this.f23683a.f23693t = null;
        }
    }
}
