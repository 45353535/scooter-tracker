package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class I1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f75889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f75890c;

    public I1(L1 l12, int i10, Bundle bundle) {
        this.f75890c = l12;
        this.f75888a = i10;
        this.f75889b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75890c.f76044b.reportData(this.f75888a, this.f75889b);
    }
}
