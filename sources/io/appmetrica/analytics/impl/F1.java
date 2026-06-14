package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class F1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f75754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f75755b;

    public F1(L1 l12, Intent intent) {
        this.f75755b = l12;
        this.f75754a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75755b.f76044b.a(this.f75754a);
    }
}
