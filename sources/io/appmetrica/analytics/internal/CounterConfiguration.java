package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.LocationUtils;
import io.appmetrica.analytics.impl.no;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentValues f78672a;

    /* synthetic */ CounterConfiguration(ContentValues contentValues, int i10) {
        this(contentValues);
    }

    private void a(String str) {
        if (no.a(str)) {
            setApiKey(str);
        }
    }

    private void b(String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            setReporterType(CounterConfigurationReporterType.SELF_SDK);
        } else {
            setReporterType(CounterConfigurationReporterType.MANUAL);
        }
    }

    private void c(Integer num) {
        if (no.a(num)) {
            this.f78672a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    private void d(Integer num) {
        if (no.a(num)) {
            setSessionTimeout(num.intValue());
        }
    }

    public static CounterConfiguration fromBundle(Bundle bundle) {
        if (bundle != null) {
            try {
                return (CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final synchronized void addAutoCollectedDataSubscriber(@NonNull String str) {
        addAutoCollectedDataSubscribers(Collections.singletonList(str));
    }

    public final synchronized void addAutoCollectedDataSubscribers(@NonNull List<String> list) {
        getAutoCollectedDataSubscribers().addAll(list);
        ContentValues contentValues = this.f78672a;
        if (list != null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeStringList(list);
                contentValues.put("CFG_AUTO_COLLECTED_DATA_SUBSCRIBERS", parcelObtain.marshall());
            } catch (Throwable unused) {
            }
            parcelObtain.recycle();
        }
    }

    public synchronized void applyFromAnonymousConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        try {
            a(appMetricaConfig.apiKey);
            d(appMetricaConfig.sessionTimeout);
            if (no.a(appMetricaConfig.location)) {
                setManualLocation(appMetricaConfig.location);
            }
            if (no.a(appMetricaConfig.locationTracking)) {
                setLocationTracking(appMetricaConfig.locationTracking.booleanValue());
            }
            if (no.a(appMetricaConfig.advIdentifiersTracking)) {
                setAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue(), false);
            }
            if (no.a(appMetricaConfig.deviceType)) {
                setDeviceType(appMetricaConfig.deviceType);
            }
            a(appMetricaConfig.dispatchPeriodSeconds);
            b(appMetricaConfig.maxReportsCount);
            b(appMetricaConfig.logs);
            if (!TextUtils.isEmpty(appMetricaConfig.appVersion)) {
                setCustomAppVersion(appMetricaConfig.appVersion);
            }
            if (no.a(appMetricaConfig.appBuildNumber)) {
                setAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
            }
            if (no.a(appMetricaConfig.firstActivationAsUpdate)) {
                setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
            }
            a(appMetricaConfig.dataSendingEnabled);
            c(appMetricaConfig.maxReportsInDatabaseCount);
            Boolean bool = appMetricaConfig.nativeCrashReporting;
            if (no.a(bool)) {
                this.f78672a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
            }
            if (no.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
                setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void applyFromConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        try {
            a(appMetricaConfig.apiKey);
            d(appMetricaConfig.sessionTimeout);
            if (no.a(appMetricaConfig.location)) {
                setManualLocation(appMetricaConfig.location);
            }
            if (no.a(appMetricaConfig.locationTracking)) {
                setLocationTracking(appMetricaConfig.locationTracking.booleanValue());
            }
            if (no.a(appMetricaConfig.advIdentifiersTracking)) {
                setAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue(), true);
            }
            if (no.a(appMetricaConfig.deviceType)) {
                setDeviceType(appMetricaConfig.deviceType);
            }
            a(appMetricaConfig.dispatchPeriodSeconds);
            b(appMetricaConfig.maxReportsCount);
            b(appMetricaConfig.logs);
            if (!TextUtils.isEmpty(appMetricaConfig.appVersion)) {
                setCustomAppVersion(appMetricaConfig.appVersion);
            }
            if (no.a(appMetricaConfig.appBuildNumber)) {
                setAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
            }
            if (no.a(appMetricaConfig.firstActivationAsUpdate)) {
                setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
            }
            a(appMetricaConfig.dataSendingEnabled);
            c(appMetricaConfig.maxReportsInDatabaseCount);
            Boolean bool = appMetricaConfig.nativeCrashReporting;
            if (no.a(bool)) {
                this.f78672a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
            }
            if (no.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
                setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getApiKey() {
        return this.f78672a.getAsString("CFG_API_KEY");
    }

    public String getAppBuildNumber() {
        return this.f78672a.getAsString("CFG_APP_VERSION_CODE");
    }

    public String getAppVersion() {
        return this.f78672a.getAsString("CFG_APP_VERSION");
    }

    @NonNull
    public List<String> getAutoCollectedDataSubscribers() {
        ContentValues contentValues = this.f78672a;
        ArrayList arrayList = new ArrayList();
        byte[] asByteArray = contentValues.getAsByteArray("CFG_AUTO_COLLECTED_DATA_SUBSCRIBERS");
        if (asByteArray != null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(asByteArray, 0, asByteArray.length);
                parcelObtain.setDataPosition(0);
                parcelObtain.readStringList(arrayList);
                parcelObtain.recycle();
                return arrayList;
            } catch (Throwable unused) {
                parcelObtain.recycle();
            }
        }
        return arrayList;
    }

    public Boolean getDataSendingEnabled() {
        return this.f78672a.getAsBoolean("CFG_DATA_SENDING_ENABLED");
    }

    @Nullable
    public String getDeviceType() {
        return this.f78672a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    @Nullable
    public Integer getDispatchPeriod() {
        return this.f78672a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    public Location getManualLocation() {
        if (this.f78672a.containsKey("CFG_MANUAL_LOCATION")) {
            return LocationUtils.bytesToLocation(this.f78672a.getAsByteArray("CFG_MANUAL_LOCATION"));
        }
        return null;
    }

    @Nullable
    public Integer getMaxReportsCount() {
        return this.f78672a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    @Nullable
    public Integer getMaxReportsInDbCount() {
        return this.f78672a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    @Nullable
    public Boolean getReportNativeCrashesEnabled() {
        return this.f78672a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    @NonNull
    public CounterConfigurationReporterType getReporterType() {
        return CounterConfigurationReporterType.fromStringValue(this.f78672a.getAsString("CFG_REPORTER_TYPE"));
    }

    @Nullable
    public Integer getSessionTimeout() {
        return this.f78672a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public String getUuid() {
        return this.f78672a.getAsString("CFG_UUID");
    }

    @Nullable
    public Boolean isAdvIdentifiersTrackingEnabled() {
        return this.f78672a.getAsBoolean("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED");
    }

    @Nullable
    public Boolean isFirstActivationAsUpdate() {
        return this.f78672a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    @Nullable
    public Boolean isLocationTrackingEnabled() {
        return this.f78672a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    @Nullable
    public Boolean isLogEnabled() {
        return this.f78672a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    @Nullable
    public synchronized Boolean isRevenueAutoTrackingEnabled() {
        return this.f78672a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    public synchronized void setAdvIdentifiersTracking(boolean z10, boolean z11) {
        boolean z12 = isAdvIdentifiersTrackingEnabled() == null;
        boolean zEquals = Boolean.TRUE.equals(this.f78672a.getAsBoolean("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED_FORCED"));
        if (z11 || z12 || !zEquals) {
            this.f78672a.put("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED", Boolean.valueOf(z10));
            this.f78672a.put("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED_FORCED", Boolean.valueOf(z11));
        }
    }

    @VisibleForTesting
    public synchronized void setApiKey(String str) {
        this.f78672a.put("CFG_API_KEY", str);
    }

    public synchronized void setAppBuildNumber(int i10) {
        this.f78672a.put("CFG_APP_VERSION_CODE", String.valueOf(i10));
    }

    public final synchronized void setCustomAppVersion(String str) {
        this.f78672a.put("CFG_APP_VERSION", str);
    }

    public final synchronized void setDataSendingEnabled(boolean z10) {
        this.f78672a.put("CFG_DATA_SENDING_ENABLED", Boolean.valueOf(z10));
    }

    public final synchronized void setDeviceType(@Nullable String str) {
        ContentValues contentValues = this.f78672a;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
    }

    @VisibleForTesting
    public synchronized void setDispatchPeriod(int i10) {
        this.f78672a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(i10));
    }

    public final synchronized void setFirstActivationAsUpdate(boolean z10) {
        this.f78672a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(z10));
    }

    public synchronized void setLocationTracking(boolean z10) {
        this.f78672a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z10));
    }

    public synchronized void setLogEnabled(boolean z10) {
        this.f78672a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(z10));
    }

    public final synchronized void setManualLocation(@Nullable Location location) {
        this.f78672a.put("CFG_MANUAL_LOCATION", LocationUtils.locationToBytes(location));
    }

    @VisibleForTesting
    public synchronized void setMaxReportsCount(int i10) {
        ContentValues contentValues = this.f78672a;
        if (i10 <= 0) {
            i10 = Integer.MAX_VALUE;
        }
        contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i10));
    }

    @VisibleForTesting
    public void setMaxReportsInDbCount(int i10) {
        this.f78672a.put("MAX_REPORTS_IN_DB_COUNT", Integer.valueOf(i10));
    }

    public synchronized void setReporterType(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f78672a.put("CFG_REPORTER_TYPE", counterConfigurationReporterType.getStringValue());
    }

    public synchronized void setRevenueAutoTrackingEnabled(boolean z10) {
        this.f78672a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(z10));
    }

    @VisibleForTesting
    public synchronized void setSessionTimeout(int i10) {
        this.f78672a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i10));
    }

    public synchronized void setUuid(String str) {
        this.f78672a.put("CFG_UUID", str);
    }

    public synchronized void toBundle(Bundle bundle) {
        bundle.putParcelable("COUNTER_CFG_OBJ", this);
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f78672a + '}';
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data", this.f78672a);
        parcel.writeBundle(bundle);
    }

    public CounterConfiguration(@NonNull CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f78672a = new ContentValues(counterConfiguration.f78672a);
        }
    }

    private void a(Integer num) {
        if (no.a(num)) {
            setDispatchPeriod(num.intValue());
        }
    }

    private void b(Integer num) {
        if (no.a(num)) {
            setMaxReportsCount(num.intValue());
        }
    }

    private void a(Boolean bool) {
        if (no.a(bool)) {
            setDataSendingEnabled(bool.booleanValue());
        }
    }

    private void b(Boolean bool) {
        if (no.a(bool)) {
            setLogEnabled(bool.booleanValue());
        }
    }

    public CounterConfiguration() {
        this.f78672a = new ContentValues();
    }

    public CounterConfiguration(@NonNull String str) {
        this();
        synchronized (this) {
            setApiKey(str);
        }
    }

    public CounterConfiguration(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(AppMetricaConfig appMetricaConfig, @NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            applyFromConfig(appMetricaConfig);
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(@NonNull ReporterConfig reporterConfig) {
        this();
        synchronized (this) {
            a(reporterConfig.apiKey);
            d(reporterConfig.sessionTimeout);
            a(reporterConfig.dispatchPeriodSeconds);
            b(reporterConfig.maxReportsCount);
            b(reporterConfig.logs);
            a(reporterConfig.dataSendingEnabled);
            c(reporterConfig.maxReportsInDatabaseCount);
            b(reporterConfig.apiKey);
        }
    }

    private CounterConfiguration(ContentValues contentValues) {
        this.f78672a = contentValues;
    }
}
