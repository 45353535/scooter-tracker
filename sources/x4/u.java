package x4;

import android.app.Activity;
import android.content.Context;
import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationManager f108141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FusedLocationProviderClient f108142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GnssStatus$Callback f108143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GpsStatus.Listener f108144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f108145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LocationCallback f108146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f108147g = false;

    class a extends GnssStatus$Callback {
        a() {
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            super.onSatelliteStatusChanged(gnssStatus);
            int satelliteCount = gnssStatus.getSatelliteCount();
            int i10 = 0;
            for (int i11 = 0; i11 < satelliteCount; i11++) {
                if (gnssStatus.usedInFix(i11)) {
                    i10++;
                }
            }
            if (u.this.f108145e != null) {
                u.this.f108145e.i(satelliteCount, i10);
            }
        }
    }

    class b extends LocationCallback {
        b() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            if (u.this.f108145e == null) {
                return;
            }
            for (Location location : locationResult.getLocations()) {
                if (location != null) {
                    u.this.f108145e.e(location);
                }
            }
        }
    }

    public interface c {
        void a(Location location);
    }

    public interface d {
        void e(Location location);

        void i(int i10, int i11);
    }

    public u(Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.f108141a = (LocationManager) applicationContext.getSystemService("location");
        this.f108142b = LocationServices.getFusedLocationProviderClient(applicationContext);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f108143c = new a();
        } else {
            this.f108144d = new GpsStatus.Listener() { // from class: x4.r
                @Override // android.location.GpsStatus.Listener
                public final void onGpsStatusChanged(int i10) {
                    this.f108137a.i(applicationContext, i10);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Context context, int i10) {
        GpsStatus gpsStatus;
        Iterable<GpsSatellite> satellites;
        if (!f(context) || (gpsStatus = this.f108141a.getGpsStatus(null)) == null || (satellites = gpsStatus.getSatellites()) == null) {
            return;
        }
        Iterator<GpsSatellite> it = satellites.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            i11++;
            if (it.next().usedInFix()) {
                i12++;
            }
        }
        d dVar = this.f108145e;
        if (dVar != null) {
            dVar.i(i11, i12);
        }
    }

    public boolean d(Context context) {
        return Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    public void e(Context context, final c cVar) {
        if (!f(context)) {
            cVar.a(null);
            return;
        }
        Task<Location> lastLocation = this.f108142b.getLastLocation();
        Objects.requireNonNull(cVar);
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: x4.s
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                cVar.a((Location) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: x4.t
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                cVar.a(null);
            }
        });
    }

    public boolean f(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean g(Activity activity) {
        return !ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.ACCESS_FINE_LOCATION");
    }

    public boolean h() {
        return this.f108141a.isProviderEnabled("gps");
    }

    public void j(Context context, long j10) {
        if (f(context) && !this.f108147g) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f108141a.registerGnssStatusCallback(this.f108143c);
            } else {
                this.f108141a.addGpsStatusListener(this.f108144d);
            }
            LocationRequest locationRequestBuild = new LocationRequest.Builder(j10).setMinUpdateIntervalMillis(j10 / 2).setPriority(100).build();
            b bVar = new b();
            this.f108146f = bVar;
            this.f108142b.requestLocationUpdates(locationRequestBuild, bVar, Looper.getMainLooper());
            this.f108147g = true;
        }
    }

    public void k(Activity activity, int i10) {
        ActivityCompat.requestPermissions(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, i10);
    }

    public void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 2);
        }
    }

    public void m(d dVar) {
        this.f108145e = dVar;
    }

    public void n() {
        if (this.f108147g) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f108141a.unregisterGnssStatusCallback(this.f108143c);
            } else {
                this.f108141a.removeGpsStatusListener(this.f108144d);
            }
            LocationCallback locationCallback = this.f108146f;
            if (locationCallback != null) {
                this.f108142b.removeLocationUpdates(locationCallback);
                this.f108146f = null;
            }
            this.f108147g = false;
        }
    }
}
