package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface AppMetricaPlugins {
    void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str);

    void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails);
}
