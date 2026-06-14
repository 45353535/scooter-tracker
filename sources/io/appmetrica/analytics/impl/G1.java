package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class G1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f75805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f75806b;

    public G1(L1 l12, Intent intent) {
        this.f75806b = l12;
        this.f75805a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75806b.f76044b.c(this.f75805a);
    }
}
