package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class I7 implements AskForPermissionStrategyModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5042de f75925a = new C5042de();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f75925a;
    }
}
