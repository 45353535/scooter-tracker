package net.pubnative.lite.sdk.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.PNPermissionUtil;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
public class HyBidLocationManager implements LocationListener {
    private static final int LOCATION_UPDATE_TIMEOUT = 10000;
    private static final String TAG = "HyBidLocationManager";
    private static final int TWO_MINUTES = 120000;
    private final Context mContext;
    private Location mCurrentBestLocation;
    private final LocationManager mManager;
    private final Runnable mStopUpdatesRunnable = new Runnable() { // from class: net.pubnative.lite.sdk.location.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f95865b.stopLocationUpdates();
        }
    };

    public HyBidLocationManager(Context context) {
        this.mManager = (LocationManager) context.getSystemService("location");
        this.mContext = context;
    }

    private Location getLastKnownNetworkLocation() {
        if (hasNetworkProvider()) {
            return this.mManager.getLastKnownLocation("network");
        }
        return null;
    }

    private Location getLocationFromProviders() {
        Location lastKnownNetworkLocation = hasCoarsePermission() ? getLastKnownNetworkLocation() : null;
        if (lastKnownNetworkLocation != null) {
            return lastKnownNetworkLocation;
        }
        return null;
    }

    private boolean hasCoarsePermission() {
        return PNPermissionUtil.hasPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION");
    }

    private boolean hasNetworkProvider() {
        LocationManager locationManager = this.mManager;
        return (locationManager == null || locationManager.getProvider("network") == null) ? false : true;
    }

    private boolean hasPermission() {
        return hasCoarsePermission();
    }

    private boolean isSameProvider(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public Location getUserLocation() {
        if (!hasPermission()) {
            return null;
        }
        Location locationFromProviders = getLocationFromProviders();
        if (locationFromProviders != null && isBetterLocation(locationFromProviders, this.mCurrentBestLocation)) {
            this.mCurrentBestLocation = locationFromProviders;
        }
        Location location = this.mCurrentBestLocation;
        if (HyBid.isLocationTrackingEnabled() && HyBid.areLocationUpdatesEnabled()) {
            startLocationUpdates();
        }
        return location;
    }

    protected boolean isBetterLocation(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            return true;
        }
        if (z11) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = accuracy > 200;
        boolean zIsSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
        if (z14) {
            return true;
        }
        if (!z12 || z13) {
            return z12 && !z15 && zIsSameProvider;
        }
        return true;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (isBetterLocation(location, this.mCurrentBestLocation)) {
            this.mCurrentBestLocation = location;
            stopLocationUpdates();
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
    }

    public void startLocationUpdates() {
        Handler handler = new Handler(Looper.getMainLooper());
        try {
            if (hasCoarsePermission() && hasNetworkProvider()) {
                handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.location.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        HyBidLocationManager hyBidLocationManager = this.f95864b;
                        hyBidLocationManager.mManager.requestLocationUpdates("network", 0L, 0.0f, hyBidLocationManager);
                    }
                });
            }
        } catch (Exception e10) {
            Logger.e(TAG, "Can't request location updates: ".concat(String.valueOf(e10.getMessage())));
        }
        handler.postDelayed(this.mStopUpdatesRunnable, 10000L);
    }

    public void stopLocationUpdates() {
        LocationManager locationManager = this.mManager;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }
}
