package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class C1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L1 f75601a;

    public C1(L1 l12) {
        this.f75601a = l12;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f75601a) {
            try {
                L1 l12 = this.f75601a;
                if (l12.f76045c) {
                    l12.f76044b.onCreate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
