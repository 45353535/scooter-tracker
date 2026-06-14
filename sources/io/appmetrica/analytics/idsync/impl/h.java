package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f75403a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f75405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f75406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f75407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f75408f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f75404b = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f75409g = new f(this);

    public h(ServiceContext serviceContext) {
        this.f75403a = serviceContext;
        this.f75405c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f75406d = new p(serviceContext, new B(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")));
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }

    public final synchronized void b(IdSyncConfig idSyncConfig) {
        try {
            if (!Intrinsics.areEqual(this.f75407e, idSyncConfig)) {
                this.f75407e = idSyncConfig;
                if (a(idSyncConfig) && !this.f75408f) {
                    this.f75403a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f75405c, new g(this));
                    this.f75408f = true;
                } else if (!a(idSyncConfig) && this.f75408f) {
                    this.f75408f = false;
                    IHandlerExecutor iHandlerExecutor = this.f75405c;
                    f fVar = this.f75409g;
                    if (fVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
                        fVar = null;
                    }
                    iHandlerExecutor.remove(fVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
