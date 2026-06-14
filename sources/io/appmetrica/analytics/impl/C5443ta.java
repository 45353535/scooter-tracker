package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5443ta implements InterfaceC5354pk {
    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
