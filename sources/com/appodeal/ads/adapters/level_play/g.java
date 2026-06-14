package com.appodeal.ads.adapters.level_play;

import androidx.activity.s;
import com.appodeal.ads.AdNetworkInitializationListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdNetworkInitializationListener f12404b;

    public g(AdNetworkInitializationListener adNetworkInitializationListener) {
        this.f12404b = adNetworkInitializationListener;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof g) && s.a(obj)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.v
    public final lf.e getFunctionDelegate() {
        return new y(0, this.f12404b, AdNetworkInitializationListener.class, "onInitializationFinished", "onInitializationFinished()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
