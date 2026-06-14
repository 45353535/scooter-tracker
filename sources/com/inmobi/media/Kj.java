package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Kj extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = Lj.f37297a;
        Intrinsics.checkNotNullExpressionValue("Lj", "access$getTAG$p(...)");
        super.onAvailable(network);
        ((C4155xc) Ji.f37161e.getValue()).b(new I2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = Lj.f37297a;
        Intrinsics.checkNotNullExpressionValue("Lj", "access$getTAG$p(...)");
        super.onLost(network);
        ((C4155xc) Ji.f37161e.getValue()).b(new I2(10, 4, "lost"));
    }
}
