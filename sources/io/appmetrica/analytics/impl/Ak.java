package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Ak implements ServiceModuleReporterComponentContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5099fk f75531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5073ek f75532b;

    public Ak(@NotNull C5058e5 c5058e5, @NotNull C5487v4 c5487v4) {
        this.f75531a = new C5099fk(c5058e5, null, 2, 0 == true ? 1 : 0);
        this.f75532b = new C5073ek(c5487v4);
    }

    @NotNull
    public final C5073ek a() {
        return this.f75532b;
    }

    @NotNull
    public final C5099fk b() {
        return this.f75531a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f75532b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f75531a;
    }
}
