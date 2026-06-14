package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.internal.AppMetricaService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class V1 {
    @NotNull
    public final Intent a(@NotNull Context context, @NotNull String str) {
        Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
        intent.setAction(str);
        return intent;
    }
}
