package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.r;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends u implements LocationReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f78722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f78723f;

    public r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f78722e = looper;
        this.f78723f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final Unit a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f78732d, rVar.f78723f, 0.0f, rVar.f78731c, rVar.f78722e);
        return Unit.f93236a;
    }

    public static final Unit b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f78731c);
        return Unit.f93236a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f78730b.hasNecessaryPermissions(this.f78729a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f78729a, "location", "request location updates for " + this.f78732d + " provider", "location manager", new FunctionWithThrowable() { // from class: r8.b
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return r.a(this.f99225a, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f78729a, "location", "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: r8.a
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return r.b(this.f99224a, (LocationManager) obj);
            }
        });
    }
}
