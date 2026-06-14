package org.bidon.sdk.databinders.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Process;
import com.adjust.sdk.Constants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.LocalDateTimeExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\n\u0010#\u001a\u0004\u0018\u00010!H\u0016J\n\u0010$\u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020!H\u0002J\u0018\u0010*\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u0006+"}, d2 = {"Lorg/bidon/sdk/databinders/location/LocationDataSourceImpl;", "Lorg/bidon/sdk/databinders/location/LocationDataSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "weakLocationManager", "Ljava/lang/ref/WeakReference;", "Landroid/location/LocationManager;", "deviceLocation", "Landroid/location/Location;", "getDeviceLocation", "()Landroid/location/Location;", "address", "Landroid/location/Address;", "getAddress", "()Landroid/location/Address;", "address$delegate", "Lkotlin/Lazy;", "isLocationAvailable", "", "()Z", "getLatitude", "", "()Ljava/lang/Double;", "getLongitude", "getAccuracy", "", "()Ljava/lang/Integer;", "getLastFix", "", "()Ljava/lang/Long;", "getCountry", "", "getRegion", "getCity", "getZip", "getUtcOffset", "getLocation", "getLocationManager", "isPermissionGranted", "permission", "checkSelfPermission", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocationDataSourceImpl implements LocationDataSource {

    /* JADX INFO: renamed from: address$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy address;

    @NotNull
    private final Context context;

    @Nullable
    private WeakReference<LocationManager> weakLocationManager;

    public LocationDataSourceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.address = i.a(new Function0() { // from class: org.bidon.sdk.databinders.location.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocationDataSourceImpl.address_delegate$lambda$0(this.f97645b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Address address_delegate$lambda$0(LocationDataSourceImpl locationDataSourceImpl) {
        try {
            if (locationDataSourceImpl.getDeviceLocation() == null) {
                return null;
            }
            Location deviceLocation = locationDataSourceImpl.getDeviceLocation();
            if (deviceLocation == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List<Address> fromLocation = new Geocoder(locationDataSourceImpl.context, Locale.getDefault()).getFromLocation(deviceLocation.getLatitude(), deviceLocation.getLongitude(), 1);
            if (fromLocation != null) {
                return (Address) CollectionsKt.first((List) fromLocation);
            }
            return null;
        } catch (Exception e10) {
            LogExtKt.logError("Location", "Error while retrieving location", e10);
            return null;
        }
    }

    private final int checkSelfPermission(Context context, String permission) {
        return context.checkPermission(permission, Process.myPid(), Process.myUid());
    }

    private final Address getAddress() {
        return (Address) this.address.getValue();
    }

    private final Location getDeviceLocation() {
        return getLocation(this.context);
    }

    @SuppressLint({"MissingPermission"})
    private final Location getLocation(Context context) {
        LocationManager locationManager;
        String bestProvider;
        if ((!isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION") && !isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION")) || (bestProvider = (locationManager = getLocationManager(context)).getBestProvider(new Criteria(), false)) == null) {
            return null;
        }
        try {
            return locationManager.getLastKnownLocation(bestProvider);
        } catch (IllegalArgumentException e10) {
            LogExtKt.logError("Location", "failed to retrieve GPS location: device has no GPS provider", e10);
            return null;
        } catch (SecurityException e11) {
            LogExtKt.logError("Location", "failed to retrieve GPS location: permission not granted", e11);
            return null;
        }
    }

    private final LocationManager getLocationManager(Context context) {
        LocationManager locationManager;
        WeakReference<LocationManager> weakReference = this.weakLocationManager;
        if (weakReference != null && (locationManager = weakReference.get()) != null) {
            return locationManager;
        }
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager2 = (LocationManager) systemService;
        this.weakLocationManager = new WeakReference<>(locationManager2);
        return locationManager2;
    }

    private final boolean isPermissionGranted(Context context, String permission) {
        return checkSelfPermission(context, permission) == 0;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public Integer getAccuracy() {
        Location deviceLocation = getDeviceLocation();
        if (deviceLocation != null) {
            return Integer.valueOf(zf.a.d(deviceLocation.getAccuracy()));
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public String getCity() {
        Address address = getAddress();
        if (address != null) {
            return address.getLocality();
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public String getCountry() {
        Address address = getAddress();
        if (address != null) {
            return address.getCountryCode();
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public Long getLastFix() {
        Location deviceLocation = getDeviceLocation();
        if (deviceLocation == null) {
            return null;
        }
        return Long.valueOf((LocalDateTimeExtKt.getSystemTimeNow() - deviceLocation.getTime()) / ((long) 1000));
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public Double getLatitude() {
        Location deviceLocation = getDeviceLocation();
        if (deviceLocation != null) {
            return Double.valueOf(deviceLocation.getLatitude());
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public Double getLongitude() {
        Location deviceLocation = getDeviceLocation();
        if (deviceLocation != null) {
            return Double.valueOf(deviceLocation.getLongitude());
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public String getRegion() {
        Address address = getAddress();
        if (address != null) {
            return address.getAdminArea();
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    public int getUtcOffset() {
        return TimeZone.getDefault().getOffset(new Date().getTime()) / Constants.ONE_HOUR;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    @Nullable
    public String getZip() {
        Address address = getAddress();
        if (address != null) {
            return address.getPostalCode();
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.location.LocationDataSource
    public boolean isLocationAvailable() {
        return getDeviceLocation() != null;
    }
}
