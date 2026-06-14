package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f74980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f74981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BillingMonitor f74982c;

    public m(@NotNull ServiceContext serviceContext, @Nullable B b10) {
        this.f74980a = serviceContext;
        this.f74981b = b10;
    }

    public final void a(@Nullable B b10) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f74982c;
        if (billingMonitor != null) {
            if (b10 != null) {
                A a10 = b10.f74957b;
                billingConfig = new BillingConfig(a10.f74954a, a10.f74955b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f74981b = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMainReporterCreated(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext r19) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.billing.impl.m.onMainReporterCreated(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext):void");
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f74982c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
