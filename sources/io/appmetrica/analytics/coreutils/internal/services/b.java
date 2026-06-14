package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f75292a;

    public b(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.f75292a = activationBarrierHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f75292a.f75288b;
        aVar.f75291b.f75287a = true;
        aVar.f75290a.run();
    }
}
