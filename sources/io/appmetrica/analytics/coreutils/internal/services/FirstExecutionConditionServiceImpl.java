package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f75267a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f75268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f75269c;

    public static class FirstExecutionConditionChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f75270a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f75271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f75272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f75273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f75274e;
        public final String tag;

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String str) {
            this.f75274e = firstExecutionDelayChecker;
            this.f75272c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f75271b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f75273d = Long.MAX_VALUE;
            this.tag = str;
        }

        final void a(long j10) {
            this.f75273d = TimeUnit.SECONDS.toMillis(j10);
        }

        final boolean b() {
            if (this.f75270a) {
                return true;
            }
            return this.f75274e.delaySinceFirstStartupWasPassed(this.f75272c, this.f75271b, this.f75273d);
        }

        final void a() {
            this.f75270a = true;
        }

        final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f75272c = utilityServiceConfiguration.getInitialConfigTime();
            this.f75271b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j10, long j11, long j12) {
            return j11 - j10 >= j12;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f75275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f75276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f75277c;

        /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i10) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean zB = this.f75275a.b();
            if (zB) {
                this.f75275a.a();
            }
            return zB;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j10) {
            this.f75275a.a(j10);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j10) {
            if (!this.f75275a.b()) {
                return false;
            }
            this.f75276b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j10), this.f75277c);
            this.f75275a.a();
            return true;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f75275a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f75276b = activationBarrierHelper;
            this.f75275a = firstExecutionConditionChecker;
            this.f75277c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(@NonNull UtilityServiceProvider utilityServiceProvider) {
        this.f75269c = utilityServiceProvider;
    }

    final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f75267a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    @NonNull
    public synchronized FirstExecutionDelayedTask createDelayedTask(@NonNull String str, @NonNull ICommonExecutor iCommonExecutor, @NonNull Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f75269c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f75268b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f75268b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f75267a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
