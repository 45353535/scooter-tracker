package com.mobilefuse.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"MissingPermission"})
public class LocationService {
    private static boolean enabled = true;

    @Nullable
    private static Location lastLocation = null;
    private static long lastLocationRefreshTimestamp = 0;
    private static final long locationValidTime = 900000;

    @Nullable
    public static synchronized Location getLastKnownLocation() throws Throwable {
        Location location;
        Context globalContext = AppLifecycleHelper.getGlobalContext();
        if (!enabled) {
            return null;
        }
        if (AppLifecycleHelper.getCurrentActivity() == null) {
            return null;
        }
        if (!AppLifecycleHelper.isAppInForeground()) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - lastLocationRefreshTimestamp <= 900000 && (location = lastLocation) != null) {
            return location;
        }
        try {
            LocationManager locationManager = (LocationManager) globalContext.getSystemService("location");
            Location locationFromGpsProvider = getLocationFromGpsProvider(globalContext, locationManager);
            if (locationFromGpsProvider == null) {
                locationFromGpsProvider = getLocationFromNetworkProvider(globalContext, locationManager);
            }
            if (locationFromGpsProvider == null) {
                return null;
            }
            lastLocation = locationFromGpsProvider;
            lastLocationRefreshTimestamp = jCurrentTimeMillis;
            return locationFromGpsProvider;
        } catch (Throwable th2) {
            StabilityHelper.logException((Class<?>) LocationService.class, th2);
            return null;
        }
    }

    private static Location getLocationFromGpsProvider(Context context, LocationManager locationManager) throws Throwable {
        if (Utils.hasManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return locationManager.getLastKnownLocation("gps");
        }
        return null;
    }

    private static Location getLocationFromNetworkProvider(Context context, LocationManager locationManager) throws Throwable {
        boolean zHasManifestPermission = Utils.hasManifestPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zHasManifestPermission) {
            zHasManifestPermission = Utils.hasManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        }
        if (zHasManifestPermission) {
            return locationManager.getLastKnownLocation("network");
        }
        return null;
    }

    static boolean isEnabled() {
        return enabled;
    }

    static void setEnabled(boolean z10) {
        enabled = z10;
        if (z10) {
            return;
        }
        lastLocation = null;
        lastLocationRefreshTimestamp = 0L;
    }
}
