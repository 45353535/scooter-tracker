package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f21063a;

    public d(h hVar) {
        this.f21063a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f21063a;
        IAlog.a("onInstallTimeout after %d msec", Long.valueOf(hVar.f21079k));
        for (r rVar : hVar.f21076h) {
            if (rVar != null) {
                rVar.a((String) null, j.INSTALL_TIMEOUT.a(), (String) null);
            }
        }
    }
}
