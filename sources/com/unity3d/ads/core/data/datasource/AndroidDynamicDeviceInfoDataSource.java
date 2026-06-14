package com.unity3d.ads.core.data.datasource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ironsource.C4240b4;
import com.ironsource.X3;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import hg.i;
import hg.l0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 W2\u00020\u0001:\u0001WB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\fH\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0006\u0010)\u001a\u00020'J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0003J\u0006\u0010-\u001a\u00020\rJ\b\u0010.\u001a\u00020\fH\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\f00H\u0016J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u000203H\u0002J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020\fJ\b\u00107\u001a\u00020\rH\u0002J\b\u00108\u001a\u00020\fH\u0002J\b\u00109\u001a\u00020\fH\u0002J\b\u0010:\u001a\u00020\u001eH\u0003J\b\u0010;\u001a\u00020\fH\u0016J\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010=\u001a\u00020\u001eH\u0016J\u0006\u0010>\u001a\u00020\u001eJ\b\u0010?\u001a\u00020\u001eH\u0002J\b\u0010@\u001a\u00020\u001eH\u0002J\u0006\u0010A\u001a\u00020\rJ\u000e\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001eJ\u0010\u0010D\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001eH\u0002J\n\u0010E\u001a\u0004\u0018\u00010FH\u0002J\b\u0010G\u001a\u00020\fH\u0002J\b\u0010H\u001a\u00020'H\u0002J\u0006\u0010I\u001a\u00020'J\b\u0010J\u001a\u00020'H\u0002J\u0012\u0010K\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\b\u0010L\u001a\u00020\rH\u0016J\b\u0010M\u001a\u00020\rH\u0002J\b\u0010N\u001a\u00020\rH\u0003J\b\u0010O\u001a\u00020\rH\u0002J\b\u0010P\u001a\u00020\rH\u0002J\b\u0010Q\u001a\u00020\rH\u0002J\b\u0010R\u001a\u00020\rH\u0002J\b\u0010S\u001a\u00020\rH\u0002J\b\u0010T\u001a\u00020\rH\u0002J\b\u0010U\u001a\u00020\rH\u0002J\b\u0010V\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006X"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;)V", "getContext", "()Landroid/content/Context;", "reportedWarning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "adbStatus", RemoteConfigComponent.FETCH_FILE_NAME, "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "fetchAndroidDynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "getAirplaneMode", "getAudioManager", "Landroid/media/AudioManager;", "getBatteryLevel", "", "getBatteryStatus", "", "getChargingType", "getConnectionType", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getConnectionTypeStr", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getCurrentUiTheme", "getElapsedRealtime", "", "getEventTimeStamp", "getFreeMemory", "getFreeSpace", C4240b4.i.f42616b, "Ljava/io/File;", "getIsSdCardPresent", "getLanguage", "getLocaleList", "", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getNetworkCapabilityTransports", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getNetworkCountryISO", "getNetworkMetered", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getOrientation", "getProcessInfo", "getRingerMode", "getScreenBrightness", "getScreenHeight", "getScreenWidth", "getStayOnWhilePluggedIn", "getStreamMaxVolume", "streamType", "getStreamVolume", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "getTimeZone", "getTimeZoneOffset", "getTotalMemory", "getUptime", "getUsableSpace", "hasInternet", "hasInternetConnection", "hasInternetConnectionM", "isActiveNetworkConnected", "isAdbEnabled", "isAppActive", C4240b4.j.M, "isLimitOpenAdTrackingEnabled", "isUSBConnected", "isUsingWifi", "isWiredHeadsetOn", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {

    @NotNull
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";

    @NotNull
    public static final String DIRECTORY_MODE_READ = "r";

    @NotNull
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";

    @NotNull
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";

    @NotNull
    public static final String KEY_STAT_CONTENT = "stat";

    @NotNull
    public static final String USB_EXTRA_CONNECTED = "connected";

    @NotNull
    private final Context context;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final MutableStateFlow reportedWarning;

    @NotNull
    private final Flow volumeSettingsChange;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(@NotNull Context context, @NotNull LifecycleDataSource lifecycleDataSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.reportedWarning = l0.a(MapsKt.emptyMap());
        this.volumeSettingsChange = i.f(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null));
    }

    private final boolean adbStatus() {
        Boolean boolValueOf;
        try {
            boolean z10 = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        DynamicDeviceInfoKt dynamicDeviceInfoKt = DynamicDeviceInfoKt.INSTANCE;
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setNetworkConnected(isActiveNetworkConnected());
        dsl_create.setNetworkType(getNetworkType());
        dsl_create.setNetworkMetered(getNetworkMetered());
        dsl_create.setTelephonyManagerNetworkType(getNetworkType());
        dsl_create.setAdbEnabled(isAdbEnabled());
        dsl_create.setUsbConnected(isUSBConnected());
        dsl_create.setVolume(getStreamVolume(3));
        dsl_create.setMaxVolume(getStreamMaxVolume(3));
        dsl_create.setDeviceElapsedRealtime(getElapsedRealtime());
        dsl_create.setDeviceUpTime(getUptime());
        dsl_create.setAirplaneMode(getAirplaneMode());
        dsl_create.setChargingType(getChargingType());
        dsl_create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        dsl_create.setSdCardPresent(getIsSdCardPresent());
        dsl_create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        return dsl_create._build();
    }

    private final boolean getAirplaneMode() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Throwable th2) {
            DeviceLog.error("Problems fetching airplane mode status", th2.getMessage());
            return false;
        }
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final double getBatteryLevel() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return -1.0d;
        }
        return ((double) intentRegisterReceiver.getIntExtra("level", 0)) / ((double) intentRegisterReceiver.getIntExtra("scale", 0));
    }

    private final int getBatteryStatus() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    private final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        return isUsingWifi() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI : isActiveNetworkConnected() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR : DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    private final long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return zf.a.d(file.getFreeSpace() / ((long) 1024));
    }

    private final String getLanguage() {
        String string = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "getDefault().toString()");
        return string;
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) throws IOException {
        int i10;
        int i11 = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2) {
                i10 = -1;
            }
        } else {
            i10 = 1;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_MEM_INFO, "r");
        String line = null;
        for (int i12 = 0; i12 < i10; i12++) {
            try {
                line = randomAccessFile.readLine();
            } finally {
            }
        }
        Unit unit = Unit.f93236a;
        c.a(randomAccessFile, null);
        return GetMemoryValueFromStringKt.getMemoryValueFromString(line);
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final String getNetworkOperator() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        return networkOperator == null ? "" : networkOperator;
    }

    private final String getNetworkOperatorName() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    @SuppressLint({"MissingPermission"})
    private final int getNetworkType() {
        Object value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkType();
            } catch (SecurityException unused) {
                if (!Intrinsics.areEqual(((Map) this.reportedWarning.getValue()).get("getNetworkType"), Boolean.TRUE)) {
                    MutableStateFlow mutableStateFlow = this.reportedWarning;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.b(value, MapsKt.plus((Map) value, TuplesKt.to("getNetworkType", Boolean.TRUE))));
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
        return -1;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getStreamVolume(int streamType) {
        return getAudioManager() != null ? r0.getStreamVolume(streamType) : -2;
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final String getTimeZone() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            Intrinsics.checkNotNullExpressionValue(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (AssertionError e10) {
            DeviceLog.error("Could not read timeZone information: %s", e10.getMessage());
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return ((long) TimeZone.getDefault().getOffset(System.currentTimeMillis())) / ((long) 1000);
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return zf.a.d(file.getUsableSpace() / ((long) 1024));
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @RequiresApi(api = 23)
    private final boolean hasInternetConnectionM() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter(INTENT_USB_STATE));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLanguage(getLanguage());
        dsl_create.setNetworkOperator(getNetworkOperator());
        dsl_create.setNetworkOperatorName(getNetworkOperatorName());
        dsl_create.setFreeDiskSpace(getUsableSpace(this.context.getExternalFilesDir(null)));
        dsl_create.setFreeRamMemory(getFreeMemory());
        dsl_create.setWiredHeadset(isWiredHeadsetOn());
        dsl_create.setTimeZone(getTimeZone());
        dsl_create.setTimeZoneOffset(getTimeZoneOffset());
        dsl_create.setLimitedTracking(isLimitAdTrackingEnabled());
        dsl_create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        dsl_create.setBatteryLevel(getBatteryLevel());
        dsl_create.setBatteryStatus(getBatteryStatus());
        dsl_create.setConnectionType(getConnectionType());
        dsl_create.setAndroid(fetchAndroidDynamicDeviceInfo());
        dsl_create.setAppActive(isAppActive());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        return dsl_create._build();
    }

    public final int getChargingType() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public String getConnectionTypeStr() {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        return i10 != 1 ? i10 != 2 ? "none" : X3.f42023g : X3.f42018b;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    public final boolean getIsSdCardPresent() {
        return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public List<String> getLocaleList() {
        int i10 = 0;
        if (Build.VERSION.SDK_INT < 24) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales()");
            ArrayList arrayList = new ArrayList(availableLocales.length);
            int length = availableLocales.length;
            while (i10 < length) {
                arrayList.add(availableLocales[i10].toString());
                i10++;
            }
            return arrayList;
        }
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "context.resources.configuration.locales");
        int size = locales.size();
        ArrayList arrayList2 = new ArrayList(size);
        while (i10 < size) {
            String string = locales.get(i10).toString();
            Intrinsics.checkNotNullExpressionValue(string, "locales[it].toString()");
            arrayList2.add(string);
            i10++;
        }
        return arrayList2;
    }

    @NotNull
    public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        Network activeNetwork;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder result = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (Build.VERSION.SDK_INT < 31) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild = result.build();
            Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild, "result.build()");
            return networkCapabilityTransportsBuild;
        }
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild2 = result.build();
            Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild2, "result.build()");
            return networkCapabilityTransportsBuild2;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild3 = result.build();
            Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild3, "result.build()");
            return networkCapabilityTransportsBuild3;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(1);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        result.setWifi(zHasTransport);
        result.setCellular(networkCapabilities.hasTransport(0));
        result.setVpn(networkCapabilities.hasTransport(4));
        result.setEthernet(networkCapabilities.hasTransport(3));
        result.setWifiAware(networkCapabilities.hasTransport(5));
        result.setLowpan(networkCapabilities.hasTransport(6));
        result.setBluetooth(networkCapabilities.hasTransport(2));
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild4 = result.build();
        Intrinsics.checkNotNullExpressionValue(networkCapabilityTransportsBuild4, "result.build()");
        return networkCapabilityTransportsBuild4;
    }

    @NotNull
    public final String getNetworkCountryISO() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? "" : networkCountryIso;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public String getOrientation() {
        return getScreenHeight() > getScreenWidth() ? "portrait" : "landscape";
    }

    @NotNull
    public final Map<String, String> getProcessInfo() throws IOException {
        HashMap map = new HashMap();
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_PROCESS_INFO, "r");
        try {
            String statContent = randomAccessFile.readLine();
            Intrinsics.checkNotNullExpressionValue(statContent, "statContent");
            map.put(KEY_STAT_CONTENT, statContent);
            Unit unit = Unit.f93236a;
            c.a(randomAccessFile, null);
            return map;
        } finally {
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Throwable th2) {
            DeviceLog.error("Problems fetching stay on while plugged in status", th2.getMessage());
            return false;
        }
    }

    public final double getStreamMaxVolume(int streamType) {
        return getAudioManager() != null ? r0.getStreamMaxVolume(streamType) : -2;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public Flow getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        return hasInternetConnectionM();
    }
}
