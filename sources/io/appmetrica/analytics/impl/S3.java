package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class S3 implements O5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R5 f76384b = new R5(new C5339p5());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5212k4 f76385c = new C5212k4(C5186j4.l().b(getContext()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5142hb f76386d = new C5142hb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5308o f76387e = C5186j4.l().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q3 f76388f = new Q3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Xc f76389g = new Xc();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R3 f76390h = new R3();

    public S3(@NotNull Context context) {
        this.f76383a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f76387e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientActivator getClientActivator() {
        return this.f76388f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f76389g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f76385c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Context getContext() {
        return this.f76383a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f76386d;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Q5 getModuleAdRevenueContext() {
        return this.f76384b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ProcessDetector getProcessDetector() {
        return this.f76390h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f76384b;
    }
}
