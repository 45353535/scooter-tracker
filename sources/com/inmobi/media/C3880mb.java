package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.C3880mb;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3880mb implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3880mb f39026a = new C3880mb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocationManager f39027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HandlerThread f39028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static GoogleApiClient f39029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f39031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Mutex f39032g;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        f39028c = handlerThread;
        f39030e = C3880mb.class.getSimpleName();
        f39032g = ng.f.b(false, 1, null);
        H6.a(handlerThread, "LThread");
        Context context = Ji.f37157a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            f39027b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location c() {
        try {
            Context context = Ji.f37157a;
            Intrinsics.checkNotNull(context);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
            return lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e10) {
            String TAG = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            e10.toString();
            return null;
        }
    }

    public static boolean d() {
        try {
            if (Kf.a(Ji.f37157a, "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return Kf.a(Ji.f37157a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i10;
        Context context = Ji.f37157a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = f39027b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i10 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        return i10 != 0;
    }

    public static boolean f() {
        try {
            kotlin.jvm.internal.v0.b(GoogleApiClient.class).getSimpleName();
            kotlin.jvm.internal.v0.b(FusedLocationProviderClient.class).getSimpleName();
            kotlin.jvm.internal.v0.b(LocationServices.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3855lb
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.lb r0 = (com.inmobi.media.C3855lb) r0
            int r1 = r0.f38969d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38969d = r1
            goto L18
        L13:
            com.inmobi.media.lb r0 = new com.inmobi.media.lb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f38967b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38969d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlinx.coroutines.sync.Mutex r0 = r0.f38966a
            kotlin.d.b(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = com.inmobi.media.C3880mb.f39032g
            r0.f38966a = r6
            r0.f38969d = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r6
        L45:
            com.inmobi.media.mb r6 = com.inmobi.media.C3880mb.f39026a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            boolean r1 = d()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r1 == 0) goto L6f
            boolean r1 = e()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r1 == 0) goto L6f
            r6.b()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            boolean r6 = f()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            if (r6 != 0) goto L6f
            android.content.Context r6 = com.inmobi.media.Ji.f37157a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            a(r6)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L64
            goto L6f
        L62:
            r6 = move-exception
            goto L75
        L64:
            r6 = move-exception
            java.lang.String r1 = com.inmobi.media.C3880mb.f39030e     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L62
            r6.getMessage()     // Catch: java.lang.Throwable -> L62
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L62
            r0.unlock(r4)
            return r6
        L75:
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3880mb.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void b() {
        LocationManager locationManager = f39027b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                Intrinsics.checkNotNullExpressionValue(f39030e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, f39028c.getLooper());
            } else {
                String TAG = f39030e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            }
        }
        Unit unit = Unit.f93236a;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            String TAG = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = f39027b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = f39029d;
            if (googleApiClient == null) {
                String TAG = f39030e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.checkNotNull(context);
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C3830kb()).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: w3.w9
                    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                    public final void onConnectionFailed(ConnectionResult connectionResult) {
                        C3880mb.a(connectionResult);
                    }
                }).addApi(LocationServices.API).build();
                f39029d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception e10) {
            String TAG2 = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            e10.getMessage();
        }
    }

    public static final void a(ConnectionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f39031f = false;
    }

    public static Location a() {
        Location location;
        Location locationC;
        Location locationA;
        try {
        } catch (Exception e10) {
            e = e10;
            location = null;
        }
        if (e() && d()) {
            locationC = f39031f ? c() : null;
            try {
            } catch (Exception e11) {
                location = locationC;
                e = e11;
                String TAG = f39030e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                e.getMessage();
                locationC = location;
            }
            locationA = (f39027b == null || !Kf.a(Ji.f37157a, "android.permission.ACCESS_COARSE_LOCATION")) ? null : a(2, 2);
        } else {
            locationC = null;
            locationA = null;
        }
        if (locationC == null && locationA == null) {
            String TAG2 = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            return null;
        }
        return a(locationC, locationA);
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            String TAG = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            String TAG2 = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            String TAG3 = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        if (z11) {
            String TAG4 = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = accuracy > 200;
        if (!z14 && (!z12 || (z13 && z15))) {
            String TAG5 = f39030e;
            Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        String TAG6 = f39030e;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        location.getTime();
        location.toString();
        return location;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[PHI: r1
  0x0057: PHI (r1v4 android.location.Location) = 
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v5 android.location.Location)
 binds: [B:31:0x0057, B:17:0x0047, B:19:0x004d, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.location.Location a(int r5, int r6) {
        /*
            android.location.Criteria r0 = new android.location.Criteria
            r0.<init>()
            r0.setAccuracy(r5)
            r0.setPowerRequirement(r6)
            r6 = 0
            r0.setCostAllowed(r6)
            android.location.LocationManager r6 = com.inmobi.media.C3880mb.f39027b
            r1 = 0
            if (r6 == 0) goto L5d
            r2 = 1
            java.lang.String r0 = r6.getBestProvider(r0, r2)
            if (r0 == 0) goto L5d
            android.location.Location r6 = r6.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
            r6 = r1
        L21:
            if (r6 != 0) goto L5c
            if (r5 == r2) goto L5c
            android.location.LocationManager r5 = com.inmobi.media.C3880mb.f39027b
            if (r5 == 0) goto L5d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.util.List r5 = r5.getProviders(r2)
            java.lang.String r6 = "getProviders(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r6 = r5.size()
            int r6 = r6 + (-1)
            if (r6 < 0) goto L5d
        L3d:
            int r0 = r6 + (-1)
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            android.location.LocationManager r3 = com.inmobi.media.C3880mb.f39027b     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L57
            boolean r4 = r3.isProviderEnabled(r6)     // Catch: java.lang.Exception -> L57
            if (r4 != r2) goto L57
            android.location.Location r6 = r3.getLastKnownLocation(r6)     // Catch: java.lang.SecurityException -> L54 java.lang.Exception -> L57
            r1 = r6
        L54:
            if (r1 == 0) goto L57
            goto L5d
        L57:
            if (r0 >= 0) goto L5a
            goto L5d
        L5a:
            r6 = r0
            goto L3d
        L5c:
            r1 = r6
        L5d:
            java.lang.String r5 = com.inmobi.media.C3880mb.f39030e
            java.lang.String r6 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3880mb.a(int, int):android.location.Location");
    }

    public static HashMap a(Location location, boolean z10, Location location2) {
        HashMap map = new HashMap();
        Context context = Ji.f37157a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                map.put("u-latlong-accu", a(location));
                map.put("sdk-collected", Integer.valueOf(z10 ? 1 : 0));
            }
            C3986qh c3986qh = Yi.f38062a;
            if (Ji.b() == null || Yi.a().getLocationEnabled()) {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                map.put("u-latlong-accu-fine", a(location2));
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (Kf.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    map.put("loc-granularity", "coarse");
                }
            } else {
                map.put("loc-granularity", "none");
                return map;
            }
        }
        return map;
    }

    public static String a(Location location) {
        return location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + ((int) location.getAccuracy());
    }
}
