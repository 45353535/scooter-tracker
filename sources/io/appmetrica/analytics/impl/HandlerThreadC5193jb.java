package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class HandlerThreadC5193jb extends HandlerThread implements IInterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f77511a;

    public HandlerThreadC5193jb(@NonNull String str) {
        super(str);
        this.f77511a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f77511a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f77511a = false;
        interrupt();
    }
}
