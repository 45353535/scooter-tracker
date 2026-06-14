package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class H0 implements AppMetricaPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J0 f75837a;

    public H0(@NotNull J0 j02) {
        this.f75837a = j02;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f75837a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.f75837a.a(pluginErrorDetails);
    }

    public H0() {
        this(new J0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f75837a.a(str, str2, pluginErrorDetails);
    }
}
