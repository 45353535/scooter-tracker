package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface Rb extends Ub, LocationServiceApi {
    @Override // io.appmetrica.analytics.impl.Ub
    /* synthetic */ void a(@Nullable Location location);

    @Override // io.appmetrica.analytics.impl.Ub
    /* synthetic */ void a(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Ub
    /* synthetic */ void a(boolean z10);

    @Override // io.appmetrica.analytics.impl.Ub
    /* synthetic */ void b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Ub
    /* synthetic */ void init();
}
