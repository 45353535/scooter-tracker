package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f75290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f75291b;

    public a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.f75291b = activationBarrierHelper;
        this.f75290a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f75291b.f75287a = true;
        this.f75290a.run();
    }
}
