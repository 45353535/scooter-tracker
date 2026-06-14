package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes12.dex */
public final class Ng implements Ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Em f76166a;

    public Ng(@NonNull Em em) {
        this.f76166a = em;
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void a() throws Throwable {
        NetworkTask networkTaskC = this.f76166a.c();
        if (networkTaskC != null) {
            C5468ua.H.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskC);
        }
    }
}
