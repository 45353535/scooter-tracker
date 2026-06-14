package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4988bc implements PermissionStrategy, LocationControllerObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C4962ac f76893b = new C4962ac();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f76894c = CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f76895a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        if (f76894c.contains(str)) {
            return !this.f76895a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f76895a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f76895a = false;
    }

    @NotNull
    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f76895a + ", locationPermissions=" + f76894c + ')';
    }
}
