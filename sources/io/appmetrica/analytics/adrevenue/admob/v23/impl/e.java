package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e implements ModuleAdRevenueProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final b f74937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClientContext f74938b;

    public e(@NonNull b bVar, @NonNull ClientContext clientContext) {
        this.f74937a = bVar;
        this.f74938b = clientContext;
    }

    public final void a(@NonNull ModuleAdRevenue moduleAdRevenue) {
        this.f74938b.getInternalClientModuleFacade().reportAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }
}
