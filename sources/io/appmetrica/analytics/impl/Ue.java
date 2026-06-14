package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Ue implements IPluginReporter {
    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NotNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
    }
}
