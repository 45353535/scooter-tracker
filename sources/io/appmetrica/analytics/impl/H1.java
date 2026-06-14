package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class H1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f75838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f75839b;

    public H1(L1 l12, Intent intent) {
        this.f75839b = l12;
        this.f75838a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75839b.f76044b.b(this.f75838a);
    }
}
