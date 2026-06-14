package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes12.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f75341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationListener f75342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LocationCallback f75343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Looper f75344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f75345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f75346f;

    /* JADX INFO: renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f75347a;

        static {
            int[] iArr = new int[Priority.values().length];
            f75347a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75347a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75347a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f75348a;

        ClientProvider(Context context) {
            this.f75348a = context;
        }

        final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.f75348a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j10) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j10);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.f75341a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f75346f);
        int i10 = AnonymousClass1.f75347a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i10 != 1 ? i10 != 2 ? i10 != 3 ? 105 : 100 : 102 : 104), this.f75343c, this.f75344d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f75341a.removeLocationUpdates(this.f75343c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f75341a.getLastLocation().addOnSuccessListener(this.f75345e, new GplOnSuccessListener(this.f75342b));
    }

    GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j10) {
        this.f75341a = clientProvider.a();
        this.f75342b = locationListener;
        this.f75344d = looper;
        this.f75345e = executor;
        this.f75346f = j10;
        this.f75343c = new GplLocationCallback(locationListener);
    }
}
