package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Bk implements ServiceModuleReporterComponentLifecycle, ServiceModuleReporterComponentLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f75599a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    public final void onMainReporterCreated(@NotNull ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        Iterator it = this.f75599a.iterator();
        while (it.hasNext()) {
            ((ServiceModuleReporterComponentLifecycleListener) it.next()).onMainReporterCreated(serviceModuleReporterComponentContext);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle
    public final void subscribe(@NotNull ServiceModuleReporterComponentLifecycleListener serviceModuleReporterComponentLifecycleListener) {
        this.f75599a.add(serviceModuleReporterComponentLifecycleListener);
    }
}
