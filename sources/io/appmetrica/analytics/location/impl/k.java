package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f78697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f78698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f78699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f78700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f78701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f78702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f78703h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f78704i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Location f78705j;

    public k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull p pVar) {
        this.f78696a = context;
        this.f78698c = pVar;
        this.f78697b = permissionExtractor;
        this.f78699d = iHandlerExecutor;
        this.f78700e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f78701f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    @Nullable
    public final synchronized Location a() {
        return (Location) this.f78698c.f78716b.getData();
    }

    @AnyThread
    public final synchronized void b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f78703h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    @Nullable
    public final synchronized Location c() {
        Location locationA;
        locationA = this.f78705j;
        if (locationA == null) {
            locationA = a();
        }
        return locationA;
    }

    public final synchronized void d() {
        try {
            this.f78701f.startUpdates();
            Iterator it = this.f78704i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f78701f.stopUpdates();
        Iterator it = this.f78704i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f78702g) {
            this.f78702g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f78702g) {
            this.f78702g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f78703h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    @AnyThread
    public final synchronized void b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f78704i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f78702g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    @AnyThread
    public final void a(@NonNull i iVar) {
        this.f78699d.execute(new j(this, iVar));
    }

    @AnyThread
    public final synchronized void a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f78696a, this.f78697b, this.f78699d, this.f78700e);
        this.f78703h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f78702g) {
            extractor.updateLastKnownLocation();
        }
    }

    @Nullable
    public final synchronized Location b() {
        return this.f78705j;
    }

    @AnyThread
    public final synchronized void a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f78696a, this.f78697b, this.f78699d, this.f78700e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f78704i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f78702g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(@Nullable Location location) {
        if (location != null) {
            this.f78705j = location;
        }
    }
}
