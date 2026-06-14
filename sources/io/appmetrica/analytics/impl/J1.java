package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class J1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f75982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f75983b;

    public J1(L1 l12, Bundle bundle) {
        this.f75983b = l12;
        this.f75982a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75983b.f76044b.resumeUserSession(this.f75982a);
    }
}
