package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f20430a;

    public q(s sVar) {
        this.f20430a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f20430a;
        Iterator it = sVar.f20485c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).onGlobalConfigChanged(sVar, sVar.f20484b);
        }
    }
}
