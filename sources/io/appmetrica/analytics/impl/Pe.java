package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Pe implements Bc, ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5567y9 f76255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ac f76256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f76257c;

    public Pe(@NotNull InterfaceC5567y9 interfaceC5567y9, @NotNull Vg vg2, @NotNull C5487v4 c5487v4, @NotNull C4991bf c4991bf) {
        this.f76255a = interfaceC5567y9;
        Ac ac2 = new Ac(vg2, c5487v4, c4991bf);
        this.f76256b = ac2;
        this.f76257c = ac2;
        if (ac2.b()) {
            return;
        }
        C5468ua.k().a().subscribe(TimeUnit.SECONDS.toMillis(O7.f76190a.longValue()), C5468ua.k().x().e(), this);
    }

    @Override // io.appmetrica.analytics.impl.Bc
    @NotNull
    public final K8 a() {
        return this.f76257c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f76256b.a();
        ((C5388r5) this.f76255a.a()).e();
    }
}
