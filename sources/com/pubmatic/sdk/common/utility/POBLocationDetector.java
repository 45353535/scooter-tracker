package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class POBLocationDetector implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Location f62561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LocationManager f62562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f62563d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f62564e = 600000;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62565a;

        static {
            int[] iArr = new int[b.values().length];
            f62565a = iArr;
            try {
                iArr[b.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62565a[b.GPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62565a[b.PASSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        NETWORK("network"),
        GPS("gps"),
        PASSIVE("passive");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f62570a;

        b(String str) {
            this.f62570a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f62570a;
        }

        boolean a(Context context) {
            int i10 = a.f62565a[ordinal()];
            if (i10 == 1) {
                return POBUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION") || POBUtils.hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
            }
            if (i10 == 2 || i10 == 3) {
                return POBUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
            }
            return false;
        }
    }

    public POBLocationDetector(@NonNull Context context) {
        this.f62560a = context;
    }

    private void a() {
        LocationManager locationManagerA = a(this.f62560a);
        if (locationManagerA == null) {
            POBLog.info("POBLocationDetector", "Location Manager is not available to fetch GPS location", new Object[0]);
            return;
        }
        try {
            b bVar = b.NETWORK;
            if (!locationManagerA.isProviderEnabled(bVar.toString())) {
                bVar = b.GPS;
            }
            if (!bVar.a(this.f62560a)) {
                POBLog.info("POBLocationDetector", "No permission to fetch GPS location", new Object[0]);
                return;
            }
            try {
                POBLog.info("POBLocationDetector", "Requesting %s location", bVar.toString());
                locationManagerA.requestLocationUpdates(bVar.toString(), 0L, 0.0f, this);
            } catch (Exception e10) {
                POBLog.info("POBLocationDetector", "Unable to request location updates. Error: %s", e10.getMessage());
            }
        } catch (Exception e11) {
            POBLog.warn("POBLocationDetector", "Unable to check network provider status. Error : %s", e11.getMessage());
        }
    }

    private boolean b() {
        return this.f62563d == 0 || SystemClock.elapsedRealtime() - this.f62563d >= this.f62564e;
    }

    private void c() {
        LocationManager locationManagerA = a(this.f62560a);
        if (locationManagerA != null) {
            try {
                locationManagerA.removeUpdates(this);
            } catch (Exception e10) {
                POBLog.warn("POBLocationDetector", "Unable to remove location updates. Error : %s" + e10.getMessage(), new Object[0]);
            }
        }
    }

    @Nullable
    public Address getAddress() {
        Location location = getLocation();
        if (location == null) {
            return null;
        }
        try {
            List<Address> fromLocation = new Geocoder(this.f62560a, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation == null || fromLocation.isEmpty()) {
                return null;
            }
            return fromLocation.get(0);
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public String getISOAlpha2CountryCode() {
        Location location = getLocation();
        if (location == null) {
            return null;
        }
        try {
            List<Address> fromLocation = new Geocoder(this.f62560a, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation == null || fromLocation.isEmpty()) {
                return null;
            }
            return fromLocation.get(0).getCountryCode();
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public Location getLocation() {
        b bVar = b.GPS;
        if (!bVar.a(this.f62560a) && !b.NETWORK.a(this.f62560a)) {
            return null;
        }
        if (b()) {
            a();
            Location locationA = a(a(this.f62560a, bVar), a(this.f62560a, b.NETWORK));
            this.f62561b = locationA;
            if (locationA == null) {
                this.f62561b = a(this.f62560a, b.PASSIVE);
            }
            if (this.f62561b != null) {
                this.f62563d = SystemClock.elapsedRealtime();
            }
            c();
        }
        return this.f62561b;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@NonNull Location location) {
        POBLog.info("POBLocationDetector", "On location changed : %s on time : %s", location.toString(), Long.valueOf(location.getTime()));
        this.f62561b = location;
        c();
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(@NonNull String str) {
        POBLog.info("POBLocationDetector", "On location provider disabled", new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(@NonNull String str) {
        POBLog.info("POBLocationDetector", "On location provider enabled", new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        POBLog.info("POBLocationDetector", "On location provider status changed : %s", Integer.valueOf(i10));
    }

    public void setLocationUpdateIntervalInMs(long j10) {
        this.f62564e = j10;
    }

    private Location a(Context context, b bVar) {
        LocationManager locationManagerA;
        if (bVar.a(context) && (locationManagerA = a(context)) != null) {
            try {
                this.f62561b = locationManagerA.getLastKnownLocation(bVar.toString());
            } catch (IllegalArgumentException e10) {
                POBLog.error("POBLocationDetector", "Unable to fetch the location. Error : %s", e10.getMessage());
            } catch (SecurityException unused) {
                POBLog.error("POBLocationDetector", "Unable to fetch the location as user has restricted/denied location access to this app.", new Object[0]);
            } catch (Exception e11) {
                POBLog.error("POBLocationDetector", "Unable to fetch the location due to unknown reason. Error : %s", e11.getMessage());
            }
        }
        return this.f62561b;
    }

    private Location a(Location location, Location location2) {
        return location == null ? location2 : (location2 != null && location.getTime() <= location2.getTime()) ? location2 : location;
    }

    private LocationManager a(Context context) {
        if (this.f62562c == null) {
            try {
                this.f62562c = (LocationManager) context.getSystemService("location");
            } catch (Exception e10) {
                POBLog.warn("POBLocationDetector", "Unable to get location manager. Error : %s" + e10.getMessage(), new Object[0]);
            }
        }
        return this.f62562c;
    }
}
