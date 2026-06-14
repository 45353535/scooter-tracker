package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class P5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f76244b = C5468ua.k().x().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f76245c = C5468ua.k().a();

    public P5(List list) {
        this.f76243a = list;
    }

    public static final void a(P5 p52) {
        Iterator it = p52.f76243a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76245c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f76244b, new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.lp
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                P5.a(this.f77724a);
            }
        });
    }
}
