package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface Ub extends LocationProvider {
    void a(@Nullable Location location);

    void a(@NotNull Object obj);

    void a(boolean z10);

    void b(@NotNull Object obj);

    void init();
}
