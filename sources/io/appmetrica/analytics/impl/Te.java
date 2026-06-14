package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: loaded from: classes12.dex */
public final class Te implements IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final We f76508a = new We();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xe f76509b = new Xe();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f76510c = C5186j4.l().g().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f76511d;

    public Te(@NonNull Provider<Ya> provider) {
        this.f76511d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        We we2 = this.f76508a;
        we2.f76633a.a(pluginErrorDetails);
        if (we2.f76635c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f78248a) {
            this.f76509b.getClass();
            this.f76510c.execute(new Re(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f76508a.f76633a.a(pluginErrorDetails);
        this.f76509b.getClass();
        this.f76510c.execute(new Qe(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f76508a.f76634b.a(str);
        this.f76509b.getClass();
        this.f76510c.execute(new Se(this, str, str2, pluginErrorDetails));
    }
}
