package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: loaded from: classes12.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f75285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f75286b;

    public static class ActivationBarrierHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f75287a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f75288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f75289c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f75288b = new a(this, runnable);
            this.f75289c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j10, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f75287a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f75289c.subscribe(j10, iCommonExecutor, this.f75288b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f75285a = this.f75286b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j10, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j10 - (this.f75286b.currentTimeMillis() - this.f75285a), 0L));
    }

    WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f75286b = systemTimeProvider;
    }
}
