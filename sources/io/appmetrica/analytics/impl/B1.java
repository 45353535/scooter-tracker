package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class B1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f75565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f75566b;

    public B1(L1 l12, Configuration configuration) {
        this.f75566b = l12;
        this.f75565a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75566b.f76044b.onConfigurationChanged(this.f75565a);
    }
}
