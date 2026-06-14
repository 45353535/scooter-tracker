package com.my.tracker.obfuscated;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Location f61260a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LocationManager f61262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f61263d = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final LocationListener f61261b = new a();

    class a implements LocationListener {
        a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            x2.a("LocationDataProvider: location has been updated");
            a1 a1Var = a1.this;
            a1Var.f61260a = location;
            LocationManager locationManager = a1Var.f61262c;
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            x2.a("LocationDataProvider: onProviderDisabled, provider – " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            x2.a("LocationDataProvider: onProviderEnabled, provider –" + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i10, Bundle bundle) {
            x2.a("LocationDataProvider: onStatusChanged, provider – " + str + ", status – " + i10 + ", extras – " + bundle);
        }
    }

    a1() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public z0 a(int i10, Context context) {
        float accuracy;
        long time;
        String provider;
        int i11;
        int i12 = 1;
        if (i10 == 0) {
            return z0.f61984g;
        }
        this.f61263d = -1;
        if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context) || !m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            return z0.f61984g;
        }
        if (m1.a()) {
            return z0.f61984g;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        this.f61262c = locationManager;
        if (locationManager == null) {
            return z0.f61984g;
        }
        if (i10 == 2) {
            a();
        }
        Location location = this.f61260a;
        if (location != null) {
            accuracy = location.getAccuracy();
            time = location.getTime();
            provider = location.getProvider();
        } else {
            location = null;
            accuracy = Float.MAX_VALUE;
            time = 0;
            provider = null;
        }
        for (String str : this.f61262c.getAllProviders()) {
            try {
                Location lastKnownLocation = this.f61262c.getLastKnownLocation(str);
                if (lastKnownLocation != null) {
                    float accuracy2 = lastKnownLocation.getAccuracy();
                    long time2 = lastKnownLocation.getTime();
                    if (location == null || (time2 > time && accuracy2 < accuracy)) {
                        provider = str;
                        location = lastKnownLocation;
                        accuracy = accuracy2;
                        time = time2;
                    }
                }
            } catch (SecurityException unused) {
                x2.a("LocationDataProvider: Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
            }
        }
        if (location == null) {
            return z0.f61984g;
        }
        provider.getClass();
        switch (provider) {
            case "passive":
                i12 = 4;
                i11 = i12;
                break;
            case "gps":
                i11 = 2;
                break;
            case "network":
                i12 = 3;
                i11 = i12;
                break;
            default:
                i11 = i12;
                break;
        }
        return new z0(i11, location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), location.getTime());
    }

    void a() {
        if (this.f61262c != null) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            final String bestProvider = this.f61262c.getBestProvider(criteria, true);
            x2.a("LocationDataProvider: best provider is " + bestProvider);
            if (bestProvider != null) {
                m.f(new Runnable() { // from class: com.my.tracker.obfuscated.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61555b.a(bestProvider);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f61262c.requestLocationUpdates(str, 2000L, 0.0f, this.f61261b);
    }
}
