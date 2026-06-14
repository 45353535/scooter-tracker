package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5118gd implements ModuleSelfReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vj f77256a = AbstractC5509w1.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77257b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable Throwable th2) {
        Vj vj = this.f77256a;
        vj.getClass();
        vj.a(new C5477uj(str, th2));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str) {
        Vj vj = this.f77256a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f77257b).withName(str).build();
        vj.getClass();
        vj.a(new Kj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable String str2) {
        this.f77256a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        Vj vj = this.f77256a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f77257b).withName(str).withAttributes(map).build();
        vj.getClass();
        vj.a(new Kj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable String str2) {
        Vj vj = this.f77256a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f77257b).withName(str).withValue(str2).build();
        vj.getClass();
        vj.a(new Kj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i10, @NotNull String str, @Nullable String str2) {
        Vj vj = this.f77256a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i10).withName(str).withValue(str2).build();
        vj.getClass();
        vj.a(new Kj(moduleEventBuild));
    }
}
