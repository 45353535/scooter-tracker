package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class u implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f78730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f78731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78732d;

    public u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.f78729a = context;
        this.f78730b = permissionResolutionStrategy;
        this.f78731c = locationListener;
        this.f78732d = str;
    }

    @NotNull
    public final Context a() {
        return this.f78729a;
    }

    @NotNull
    public final LocationListener b() {
        return this.f78731c;
    }

    @NotNull
    public final PermissionResolutionStrategy c() {
        return this.f78730b;
    }

    @NotNull
    public final String d() {
        return this.f78732d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f78730b.hasNecessaryPermissions(this.f78729a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f78729a, "location", "getting last known location for provider " + this.f78732d, "location manager", new FunctionWithThrowable() { // from class: r8.c
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return u.a(this.f99226a, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.f78731c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f78732d);
    }
}
