package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssMeasurementsEvent$Callback;
import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static Field sContextField;
    private static Method sGnssRequestBuilderBuildMethod;
    private static Class<?> sGnssRequestBuilderClass;

    @GuardedBy("sLocationListeners")
    static final WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> sLocationListeners = new WeakHashMap<>();
    private static Method sRegisterGnssMeasurementsCallbackMethod;

    @RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            return locationManager.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(handler != null);
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssListenersHolder.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap.get(callback);
                    if (preRGnssStatusTransport == null) {
                        preRGnssStatusTransport = new PreRGnssStatusTransport(callback);
                    } else {
                        preRGnssStatusTransport.unregister();
                    }
                    preRGnssStatusTransport.register(executor);
                    if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, preRGnssStatusTransport);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @DoNotInline
        static void unregisterGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            locationManager.unregisterGnssMeasurementsCallback(gnssMeasurementsEvent$Callback);
        }

        @DoNotInline
        static void unregisterGnssStatusCallback(LocationManager locationManager, Object obj) {
            if (obj instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport) obj).unregister();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus$Callback) obj);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @NonNull Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback, handler);
        }
    }

    @RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static String getGnssHardwareModelName(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @DoNotInline
        static int getGnssYearOfHardware(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @DoNotInline
        static boolean isLocationEnabled(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @RequiresApi(30)
    private static class Api30Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        static void getCurrentLocation(LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new java.util.function.Consumer() { // from class: androidx.core.location.s
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void p(Object obj) {
                    consumer.accept((Location) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            });
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        public static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssListenersHolder.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.get(callback);
                    if (gnssStatusTransport == null) {
                        gnssStatusTransport = new GnssStatusTransport(callback);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, gnssStatusTransport);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @DoNotInline
        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sRequestLocationUpdatesExecutorMethod == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, Executor.class, LocationListener.class);
                        sRequestLocationUpdatesExecutorMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        sRequestLocationUpdatesExecutorMethod.invoke(locationManager, locationRequest, executor, locationListenerCompat);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @RequiresApi(31)
    private static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static boolean hasProvider(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, gnssMeasurementsEvent$Callback);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        static void requestLocationUpdates(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class CancellableLocationListener implements LocationListener {
        private Consumer<Location> mConsumer;
        private final Executor mExecutor;
        private final LocationManager mLocationManager;
        private final Handler mTimeoutHandler = new Handler(Looper.getMainLooper());

        @Nullable
        Runnable mTimeoutRunnable;

        @GuardedBy("this")
        private boolean mTriggered;

        CancellableLocationListener(LocationManager locationManager, Executor executor, Consumer<Location> consumer) {
            this.mLocationManager = locationManager;
            this.mExecutor = executor;
            this.mConsumer = consumer;
        }

        public static /* synthetic */ void a(CancellableLocationListener cancellableLocationListener) {
            cancellableLocationListener.mTimeoutRunnable = null;
            cancellableLocationListener.onLocationChanged((Location) null);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void cleanup() {
            this.mConsumer = null;
            this.mLocationManager.removeUpdates(this);
            Runnable runnable = this.mTimeoutRunnable;
            if (runnable != null) {
                this.mTimeoutHandler.removeCallbacks(runnable);
                this.mTimeoutRunnable = null;
            }
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void cancel() {
            synchronized (this) {
                try {
                    if (this.mTriggered) {
                        return;
                    }
                    this.mTriggered = true;
                    cleanup();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@Nullable final Location location) {
            synchronized (this) {
                try {
                    if (this.mTriggered) {
                        return;
                    }
                    this.mTriggered = true;
                    final Consumer<Location> consumer = this.mConsumer;
                    this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            consumer.accept(location);
                        }
                    });
                    cleanup();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@NonNull String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@NonNull String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }

        @SuppressLint({"MissingPermission"})
        public void startTimeout(long j10) {
            synchronized (this) {
                try {
                    if (this.mTriggered) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: androidx.core.location.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.CancellableLocationListener.a(this.f4509b);
                        }
                    };
                    this.mTimeoutRunnable = runnable;
                    this.mTimeoutHandler.postDelayed(runnable, j10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class GnssListenersHolder {

        @GuardedBy("sGnssStatusListeners")
        static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap<>();

        @GuardedBy("sGnssMeasurementListeners")
        static final SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> sGnssMeasurementListeners = new SimpleArrayMap<>();

        private GnssListenersHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(24)
    static class GnssMeasurementsTransport extends GnssMeasurementsEvent$Callback {
        final GnssMeasurementsEvent$Callback mCallback;

        @Nullable
        volatile Executor mExecutor;

        GnssMeasurementsTransport(@NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @NonNull Executor executor) {
            this.mCallback = gnssMeasurementsEvent$Callback;
            this.mExecutor = executor;
        }

        public static /* synthetic */ void a(GnssMeasurementsTransport gnssMeasurementsTransport, Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (gnssMeasurementsTransport.mExecutor != executor) {
                return;
            }
            gnssMeasurementsTransport.mCallback.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        public static /* synthetic */ void b(GnssMeasurementsTransport gnssMeasurementsTransport, Executor executor, int i10) {
            if (gnssMeasurementsTransport.mExecutor != executor) {
                return;
            }
            gnssMeasurementsTransport.mCallback.onStatusChanged(i10);
        }

        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.x
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.GnssMeasurementsTransport.a(this.f4512b, executor, gnssMeasurementsEvent);
                }
            });
        }

        public void onStatusChanged(final int i10) {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.y
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.GnssMeasurementsTransport.b(this.f4515b, executor, i10);
                }
            });
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    @RequiresApi(30)
    private static class GnssStatusTransport extends GnssStatus$Callback {
        final GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public void onFirstFix(int i10) {
            this.mCallback.onFirstFix(i10);
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        public void onStarted() {
            this.mCallback.onStarted();
        }

        public void onStopped() {
            this.mCallback.onStopped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GpsStatusTransport implements GpsStatus.Listener {
        final GnssStatusCompat.Callback mCallback;

        @Nullable
        volatile Executor mExecutor;
        private final LocationManager mLocationManager;

        GpsStatusTransport(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
        }

        public static /* synthetic */ void a(GpsStatusTransport gpsStatusTransport, Executor executor) {
            if (gpsStatusTransport.mExecutor != executor) {
                return;
            }
            gpsStatusTransport.mCallback.onStopped();
        }

        public static /* synthetic */ void b(GpsStatusTransport gpsStatusTransport, Executor executor) {
            if (gpsStatusTransport.mExecutor != executor) {
                return;
            }
            gpsStatusTransport.mCallback.onStarted();
        }

        public static /* synthetic */ void c(GpsStatusTransport gpsStatusTransport, Executor executor, int i10) {
            if (gpsStatusTransport.mExecutor != executor) {
                return;
            }
            gpsStatusTransport.mCallback.onFirstFix(i10);
        }

        public static /* synthetic */ void d(GpsStatusTransport gpsStatusTransport, Executor executor, GnssStatusCompat gnssStatusCompat) {
            if (gpsStatusTransport.mExecutor != executor) {
                return;
            }
            gpsStatusTransport.mCallback.onSatelliteStatusChanged(gnssStatusCompat);
        }

        @Override // android.location.GpsStatus.Listener
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i10) {
            GpsStatus gpsStatus;
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            if (i10 == 1) {
                executor.execute(new Runnable() { // from class: androidx.core.location.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GpsStatusTransport.b(this.f4518b, executor);
                    }
                });
                return;
            }
            if (i10 == 2) {
                executor.execute(new Runnable() { // from class: androidx.core.location.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GpsStatusTransport.a(this.f4471b, executor);
                    }
                });
                return;
            }
            if (i10 != 3) {
                if (i10 == 4 && (gpsStatus = this.mLocationManager.getGpsStatus(null)) != null) {
                    final GnssStatusCompat gnssStatusCompatWrap = GnssStatusCompat.wrap(gpsStatus);
                    executor.execute(new Runnable() { // from class: androidx.core.location.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.GpsStatusTransport.d(this.f4476b, executor, gnssStatusCompatWrap);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: androidx.core.location.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GpsStatusTransport.c(this.f4473b, executor, timeToFirstFix);
                    }
                });
            }
        }

        public void register(Executor executor) {
            Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    private static final class InlineHandlerExecutor implements Executor {
        private final Handler mHandler;

        InlineHandlerExecutor(@NonNull Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (Looper.myLooper() == this.mHandler.getLooper()) {
                runnable.run();
            } else {
                if (this.mHandler.post((Runnable) Preconditions.checkNotNull(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LocationListenerKey {
        final LocationListenerCompat mListener;
        final String mProvider;

        LocationListenerKey(String str, LocationListenerCompat locationListenerCompat) {
            this.mProvider = (String) ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.mListener = (LocationListenerCompat) ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            LocationListenerKey locationListenerKey = (LocationListenerKey) obj;
            return this.mProvider.equals(locationListenerKey.mProvider) && this.mListener.equals(locationListenerKey.mListener);
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mProvider, this.mListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(24)
    static class PreRGnssStatusTransport extends GnssStatus$Callback {
        final GnssStatusCompat.Callback mCallback;

        @Nullable
        volatile Executor mExecutor;

        PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public static /* synthetic */ void a(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
            if (preRGnssStatusTransport.mExecutor != executor) {
                return;
            }
            preRGnssStatusTransport.mCallback.onStopped();
        }

        public static /* synthetic */ void b(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i10) {
            if (preRGnssStatusTransport.mExecutor != executor) {
                return;
            }
            preRGnssStatusTransport.mCallback.onFirstFix(i10);
        }

        public static /* synthetic */ void c(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
            if (preRGnssStatusTransport.mExecutor != executor) {
                return;
            }
            preRGnssStatusTransport.mCallback.onStarted();
        }

        public static /* synthetic */ void d(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, GnssStatus gnssStatus) {
            if (preRGnssStatusTransport.mExecutor != executor) {
                return;
            }
            preRGnssStatusTransport.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        public void onFirstFix(final int i10) {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.j0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.b(this.f4493b, executor, i10);
                }
            });
        }

        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.k0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.d(this.f4496b, executor, gnssStatus);
                }
            });
        }

        public void onStarted() {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.m0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.c(this.f4501b, executor);
                }
            });
        }

        public void onStopped() {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.l0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.a(this.f4499b, executor);
                }
            });
        }

        public void register(Executor executor) {
            Preconditions.checkArgument(executor != null, "invalid null executor");
            Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    private LocationManagerCompat() {
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @Deprecated
    public static void getCurrentLocation(@NonNull LocationManager locationManager, @NonNull String str, @Nullable androidx.core.os.CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull Consumer<Location> consumer) {
        getCurrentLocation(locationManager, str, cancellationSignal != null ? (CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, executor, consumer);
    }

    @Nullable
    public static String getGnssHardwareModelName(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssHardwareModelName(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssYearOfHardware(locationManager);
        }
        return 0;
    }

    public static boolean hasProvider(@NonNull LocationManager locationManager, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.hasProvider(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        return locationManager.getProvider(str) != null;
    }

    public static boolean isLocationEnabled(@NonNull LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.isLocationEnabled(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @NonNull Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            return Api24Impl.registerGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$Callback, handler);
        }
        if (i10 == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, ExecutorCompat.create(handler), gnssMeasurementsEvent$Callback);
        }
        SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> simpleArrayMap = GnssListenersHolder.sGnssMeasurementListeners;
        synchronized (simpleArrayMap) {
            try {
                unregisterGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$Callback);
                if (!Api24Impl.registerGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$Callback, handler)) {
                    return false;
                }
                simpleArrayMap.put(gnssMeasurementsEvent$Callback, gnssMeasurementsEvent$Callback);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresApi(30)
    private static boolean registerGnssMeasurementsCallbackOnR(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        if (Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if (sGnssRequestBuilderClass == null) {
                sGnssRequestBuilderClass = Class.forName("android.location.GnssRequest$Builder");
            }
            if (sGnssRequestBuilderBuildMethod == null) {
                Method declaredMethod = sGnssRequestBuilderClass.getDeclaredMethod("build", null);
                sGnssRequestBuilderBuildMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (sRegisterGnssMeasurementsCallbackMethod == null) {
                Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, o.a());
                sRegisterGnssMeasurementsCallbackMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            Object objInvoke = sRegisterGnssMeasurementsCallbackMethod.invoke(locationManager, sGnssRequestBuilderBuildMethod.invoke(sGnssRequestBuilderClass.getDeclaredConstructor(null).newInstance(null), null), executor, gnssMeasurementsEvent$Callback);
            if (objInvoke != null) {
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return false;
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback, @NonNull Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback) : registerGnssStatusCallback(locationManager, new InlineHandlerExecutor(handler), callback);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @GuardedBy("sLocationListeners")
    static void registerLocationListenerTransport(LocationManager locationManager, LocationListenerTransport locationListenerTransport) {
        WeakReference<LocationListenerTransport> weakReferencePut = sLocationListeners.put(locationListenerTransport.getKey(), new WeakReference<>(locationListenerTransport));
        LocationListenerTransport locationListenerTransport2 = weakReferencePut != null ? weakReferencePut.get() : null;
        if (locationListenerTransport2 != null) {
            locationListenerTransport2.unregister();
            locationManager.removeUpdates(locationListenerTransport2);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@NonNull LocationManager locationManager, @NonNull LocationListenerCompat locationListenerCompat) {
        WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> weakHashMap = sLocationListeners;
        synchronized (weakHashMap) {
            try {
                Iterator<WeakReference<LocationListenerTransport>> it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    LocationListenerTransport locationListenerTransport = it.next().get();
                    if (locationListenerTransport != null) {
                        LocationListenerKey key = locationListenerTransport.getKey();
                        if (key.mListener == locationListenerCompat) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(key);
                            locationListenerTransport.unregister();
                            locationManager.removeUpdates(locationListenerTransport);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        sLocationListeners.remove((LocationListenerKey) it2.next());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull Executor executor, @NonNull LocationListenerCompat locationListenerCompat) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
            return;
        }
        if (i10 < 30 || !Api30Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            LocationListenerTransport locationListenerTransport = new LocationListenerTransport(new LocationListenerKey(str, locationListenerCompat), executor);
            if (Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerTransport)) {
                return;
            }
            synchronized (sLocationListeners) {
                locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerTransport, Looper.getMainLooper());
                registerLocationListenerTransport(locationManager, locationListenerTransport);
            }
        }
    }

    @RequiresApi(24)
    public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api24Impl.unregisterGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$Callback);
            return;
        }
        SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> simpleArrayMap = GnssListenersHolder.sGnssMeasurementListeners;
        synchronized (simpleArrayMap) {
            try {
                GnssMeasurementsEvent$Callback gnssMeasurementsEvent$CallbackA = n.a(simpleArrayMap.remove(gnssMeasurementsEvent$Callback));
                if (gnssMeasurementsEvent$CallbackA != null) {
                    if (gnssMeasurementsEvent$CallbackA instanceof GnssMeasurementsTransport) {
                        ((GnssMeasurementsTransport) gnssMeasurementsEvent$CallbackA).unregister();
                    }
                    Api24Impl.unregisterGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$CallbackA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void unregisterGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssListenersHolder.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    Object objRemove = simpleArrayMap.remove(callback);
                    if (objRemove != null) {
                        Api24Impl.unregisterGnssStatusCallback(locationManager, objRemove);
                    }
                } finally {
                }
            }
            return;
        }
        SimpleArrayMap<Object, Object> simpleArrayMap2 = GnssListenersHolder.sGnssStatusListeners;
        synchronized (simpleArrayMap2) {
            try {
                GpsStatusTransport gpsStatusTransport = (GpsStatusTransport) simpleArrayMap2.remove(callback);
                if (gpsStatusTransport != null) {
                    gpsStatusTransport.unregister();
                    locationManager.removeGpsStatusListener(gpsStatusTransport);
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LocationListenerTransport implements LocationListener {
        final Executor mExecutor;

        @Nullable
        volatile LocationListenerKey mKey;

        LocationListenerTransport(@Nullable LocationListenerKey locationListenerKey, Executor executor) {
            this.mKey = locationListenerKey;
            this.mExecutor = executor;
        }

        public static /* synthetic */ void a(LocationListenerTransport locationListenerTransport, String str) {
            LocationListenerKey locationListenerKey = locationListenerTransport.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onProviderEnabled(str);
        }

        public static /* synthetic */ void b(LocationListenerTransport locationListenerTransport, String str, int i10, Bundle bundle) {
            LocationListenerKey locationListenerKey = locationListenerTransport.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onStatusChanged(str, i10, bundle);
        }

        public static /* synthetic */ void c(LocationListenerTransport locationListenerTransport, Location location) {
            LocationListenerKey locationListenerKey = locationListenerTransport.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onLocationChanged(location);
        }

        public static /* synthetic */ void d(LocationListenerTransport locationListenerTransport, List list) {
            LocationListenerKey locationListenerKey = locationListenerTransport.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onLocationChanged((List<Location>) list);
        }

        public static /* synthetic */ void e(LocationListenerTransport locationListenerTransport, String str) {
            LocationListenerKey locationListenerKey = locationListenerTransport.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onProviderDisabled(str);
        }

        public static /* synthetic */ void f(LocationListenerTransport locationListenerTransport, int i10) {
            LocationListenerKey locationListenerKey = locationListenerTransport.mKey;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.mListener.onFlushComplete(i10);
        }

        public LocationListenerKey getKey() {
            return (LocationListenerKey) ObjectsCompat.requireNonNull(this.mKey);
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i10) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.h0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.f(this.f4487b, i10);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@NonNull final Location location) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.g0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.c(this.f4485b, location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@NonNull final String str) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.e0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.e(this.f4481b, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@NonNull final String str) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.d0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.a(this.f4479b, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i10, final Bundle bundle) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.i0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.b(this.f4489b, str, i10, bundle);
                }
            });
        }

        public void unregister() {
            this.mKey = null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@NonNull final List<Location> list) {
            if (this.mKey == null) {
                return;
            }
            this.mExecutor.execute(new Runnable() { // from class: androidx.core.location.f0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.d(this.f4483b, list);
                }
            });
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@NonNull LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.getCurrentLocation(locationManager, str, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: androidx.core.location.p
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(lastKnownLocation);
                }
            });
            return;
        }
        final CancellableLocationListener cancellableLocationListener = new CancellableLocationListener(locationManager, executor, consumer);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, cancellableLocationListener, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.core.location.q
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    cancellableLocationListener.cancel();
                }
            });
        }
        cancellableLocationListener.startTimeout(30000L);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, null, executor, callback);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new Handler(looperMyLooper), executor, callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd A[Catch: all -> 0x00a8, TryCatch #6 {all -> 0x00a8, blocks: (B:27:0x0056, B:60:0x00ae, B:61:0x00c4, B:62:0x00c5, B:64:0x00cd, B:66:0x00d5, B:67:0x00db, B:68:0x00dc, B:69:0x00e1, B:70:0x00e2, B:71:0x00e8), top: B:79:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2 A[Catch: all -> 0x00a8, TryCatch #6 {all -> 0x00a8, blocks: (B:27:0x0056, B:60:0x00ae, B:61:0x00c4, B:62:0x00c5, B:64:0x00cd, B:66:0x00d5, B:67:0x00db, B:68:0x00dc, B:69:0x00e1, B:70:0x00e2, B:71:0x00e8), top: B:79:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #10 {all -> 0x002f, blocks: (B:16:0x0021, B:18:0x0029, B:22:0x0035, B:24:0x004c, B:33:0x0079, B:34:0x0080, B:43:0x008e, B:44:0x0095, B:73:0x00eb, B:74:0x00f2, B:25:0x0050, B:75:0x00f3, B:76:0x0109, B:21:0x0032), top: B:80:0x0021 }] */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean registerGnssStatusCallback(final android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationManagerCompat.registerGnssStatusCallback(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, androidx.core.location.GnssStatusCompat$Callback):boolean");
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            return Api31Impl.registerGnssMeasurementsCallback(locationManager, executor, gnssMeasurementsEvent$Callback);
        }
        if (i10 == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, executor, gnssMeasurementsEvent$Callback);
        }
        SimpleArrayMap<GnssMeasurementsEvent$Callback, GnssMeasurementsEvent$Callback> simpleArrayMap = GnssListenersHolder.sGnssMeasurementListeners;
        synchronized (simpleArrayMap) {
            try {
                GnssMeasurementsTransport gnssMeasurementsTransport = new GnssMeasurementsTransport(gnssMeasurementsEvent$Callback, executor);
                unregisterGnssMeasurementsCallback(locationManager, gnssMeasurementsEvent$Callback);
                if (!Api24Impl.registerGnssMeasurementsCallback(locationManager, gnssMeasurementsTransport)) {
                    return false;
                }
                simpleArrayMap.put(gnssMeasurementsEvent$Callback, gnssMeasurementsTransport);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static class Api19Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerTransport locationListenerTransport) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, LocationListener.class, Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    synchronized (LocationManagerCompat.sLocationListeners) {
                        sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest, locationListenerTransport, Looper.getMainLooper());
                        LocationManagerCompat.registerLocationListenerTransport(locationManager, locationListenerTransport);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, LocationListener.class, Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest, locationListenerCompat, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull LocationListenerCompat locationListenerCompat, @NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), locationListenerCompat);
        } else {
            if (Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }
}
