package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.plugins.IPluginReporter;

/* JADX INFO: loaded from: classes12.dex */
public interface Ka extends Ya, IPluginReporter {
    void b(@NonNull String str);

    void b(@NonNull String str, @Nullable String str2);

    boolean b();
}
