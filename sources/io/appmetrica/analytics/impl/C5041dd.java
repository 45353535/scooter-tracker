package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5041dd implements ModuleEventServiceHandlerContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f77013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModulePreferences f77014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModuleEventServiceHandlerReporter f77015c;

    public C5041dd(@NotNull ModulePreferences modulePreferences, @NotNull ModulePreferences modulePreferences2, @NotNull ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f77013a = modulePreferences;
        this.f77014b = modulePreferences2;
        this.f77015c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f77015c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f77014b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getModulePreferences() {
        return this.f77013a;
    }
}
