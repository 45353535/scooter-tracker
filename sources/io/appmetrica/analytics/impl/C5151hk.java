package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5151hk implements ServiceContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleServiceLifecycleController f77317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zd f77318b = new Zd(getContext());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5118gd f77319c = new C5118gd();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hk f77320d = new Hk(getContext(), new Gk(new V1()));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Dk f77321e = new Dk(getContext(), C5468ua.k().z(), C5112g7.a(getContext()).h());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F9 f77322f = new F9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5514w6 f77323g = new C5514w6();

    public C5151hk(@NotNull ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f77317a = moduleServiceLifecycleController;
    }

    @NotNull
    public final Zd a() {
        return this.f77318b;
    }

    @NotNull
    public final C5118gd b() {
        return this.f77319c;
    }

    @NotNull
    public final Dk c() {
        return this.f77321e;
    }

    @NotNull
    public final Hk d() {
        return this.f77320d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActivationBarrier getActivationBarrier() {
        return C5468ua.H.B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return C5468ua.H.G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C5468ua.H.l().f76123b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ChargeTypeProvider getChargeTypeProvider() {
        Z2 z22;
        C5468ua c5468ua = C5468ua.H;
        Z2 z23 = c5468ua.f78356e;
        if (z23 != null) {
            return z23;
        }
        synchronized (c5468ua) {
            try {
                z22 = c5468ua.f78356e;
                if (z22 == null) {
                    z22 = new Z2(c5468ua.f78355d.a(), c5468ua.l().f76122a);
                    c5468ua.f78356e = z22;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z22;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final Context getContext() {
        return C5468ua.H.f78352a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final CryptoProvider getCryptoProvider() {
        return this.f77323g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C5468ua.H.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.f77322f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C5468ua.H.B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final LocationServiceApi getLocationServiceApi() {
        return C5468ua.H.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f77317a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f77318b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return C5468ua.H.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C5468ua.H.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C5468ua.H.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f77319c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return C5468ua.H.F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f77321e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f77320d;
    }
}
