package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class D1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f75647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f75649c;

    public D1(L1 l12, Intent intent, int i10) {
        this.f75649c = l12;
        this.f75647a = intent;
        this.f75648b = i10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75649c.f76044b.a(this.f75647a, this.f75648b);
    }
}
