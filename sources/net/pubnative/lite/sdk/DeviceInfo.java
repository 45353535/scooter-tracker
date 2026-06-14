package net.pubnative.lite.sdk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.ironsource.X3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.models.request.UserAgent;
import net.pubnative.lite.sdk.utils.BatteryUtils;
import net.pubnative.lite.sdk.utils.HyBidAdvertisingId;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.PNCrypto;
import net.pubnative.lite.sdk.utils.ScreenDimensionsUtils;
import net.pubnative.lite.sdk.utils.SoundUtils;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceInfo {
    private static final String TAG = "DeviceInfo";
    private String deviceHeight;
    private String deviceWidth;
    private String mAdvertisingId;
    private String mAdvertisingIdMd5;
    private String mAdvertisingIdSha1;
    private final Context mContext;
    private Listener mListener;
    private float pxratio;
    private boolean mLimitTracking = false;
    private boolean mIsCharging = false;
    private final Object mReceiverLock = new Object();
    private boolean mIsChangingReceiverRegistered = false;
    private final BroadcastReceiver mBatteryStatusReceiver = new BroadcastReceiver() { // from class: net.pubnative.lite.sdk.DeviceInfo.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("status", -1);
            DeviceInfo deviceInfo = DeviceInfo.this;
            deviceInfo.mIsCharging = intExtra == 2 || intExtra == 5;
            synchronized (deviceInfo.mReceiverLock) {
                DeviceInfo deviceInfo2 = DeviceInfo.this;
                Context context2 = deviceInfo2.mContext;
                if (context2 != null && deviceInfo2.mIsChangingReceiverRegistered) {
                    try {
                        context2.unregisterReceiver(this);
                    } catch (IllegalArgumentException unused) {
                    }
                    DeviceInfo.this.mIsChangingReceiverRegistered = false;
                }
            }
        }
    };
    private final UserAgentProvider mUserAgentProvider = new UserAgentProvider();

    public enum Connectivity {
        ETHERNET(X3.f42021e),
        WIFI(X3.f42018b),
        WWAN("wwan"),
        NONE("none");

        private final String mConnectivity;

        Connectivity(String str) {
            this.mConnectivity = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mConnectivity;
        }
    }

    public interface Listener {
        void onInfoLoaded();
    }

    public enum Orientation {
        PORTRAIT("portrait"),
        LANDSCAPE("landscape"),
        NONE("none");

        private final String mOrientation;

        Orientation(String str) {
            this.mOrientation = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mOrientation;
        }
    }

    public DeviceInfo(Context context) {
        this.mContext = context.getApplicationContext();
        getDeviceScreenDimensions();
    }

    public static /* synthetic */ void a(DeviceInfo deviceInfo, String str, Boolean bool) {
        deviceInfo.getClass();
        deviceInfo.mLimitTracking = bool.booleanValue();
        if (TextUtils.isEmpty(str)) {
            deviceInfo.fetchFireOSAdvertisingId();
        } else {
            deviceInfo.mAdvertisingId = str;
            deviceInfo.mAdvertisingIdMd5 = PNCrypto.md5(str);
            deviceInfo.mAdvertisingIdSha1 = PNCrypto.sha1(deviceInfo.mAdvertisingId);
        }
        Listener listener = deviceInfo.mListener;
        if (listener != null) {
            listener.onInfoLoaded();
        }
    }

    private Integer checkAirplaneMode() {
        return isAirplaneModeOn() ? 1 : 0;
    }

    private void fetchAdvertisingId() {
        try {
            new HyBidAdvertisingId(this.mContext).execute(new HyBidAdvertisingId.Listener() { // from class: net.pubnative.lite.sdk.a
                @Override // net.pubnative.lite.sdk.utils.HyBidAdvertisingId.Listener
                public final void onHyBidAdvertisingIdFinish(String str, Boolean bool) {
                    DeviceInfo.a(this.f95841a, str, bool);
                }
            });
        } catch (RejectedExecutionException e10) {
            Logger.e(TAG, "fetchAdvertisingId", e10);
            Listener listener = this.mListener;
            if (listener != null) {
                listener.onInfoLoaded();
            }
            HyBid.reportException((Exception) e10);
        } catch (Exception e11) {
            Logger.e(TAG, "Error executing HyBidAdvertisingId Executor");
            Listener listener2 = this.mListener;
            if (listener2 != null) {
                listener2.onInfoLoaded();
            }
            HyBid.reportException(e11);
        }
    }

    private void fetchFireOSAdvertisingId() {
        ContentResolver contentResolver;
        String string;
        try {
            Context context = this.mContext;
            if (context == null || (contentResolver = context.getContentResolver()) == null || Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0 || (string = Settings.Secure.getString(contentResolver, "advertising_id")) == null || string.isEmpty()) {
                return;
            }
            this.mAdvertisingId = string;
            this.mAdvertisingIdMd5 = PNCrypto.md5(string);
            this.mAdvertisingIdSha1 = PNCrypto.sha1(this.mAdvertisingId);
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    private Long getAvailableInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
    }

    private TelephonyManager getTelephonyManager() {
        Context context = this.mContext;
        if (context != null) {
            return (TelephonyManager) context.getSystemService("phone");
        }
        return null;
    }

    private Long getTotalInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
    }

    private boolean hasPermission(String str) {
        Context context = this.mContext;
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    private boolean isAirplaneModeOn() {
        Context context = this.mContext;
        return (context == null || context.getContentResolver() == null || Settings.System.getInt(this.mContext.getContentResolver(), "airplane_mode_on", 0) == 0) ? false : true;
    }

    public void fetchUserAgent() {
        this.mUserAgentProvider.initialise(this.mContext);
    }

    @SuppressLint({"HardwareIds"})
    public String getAdvertisingId() {
        return this.mAdvertisingId;
    }

    public String getAdvertisingIdMd5() {
        return this.mAdvertisingIdMd5;
    }

    public String getAdvertisingIdSha1() {
        return this.mAdvertisingIdSha1;
    }

    public Integer getBatteryLevel() {
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        int batteryPercentageSync = BatteryUtils.getBatteryPercentageSync(context);
        if (batteryPercentageSync >= 85) {
            return 8;
        }
        if (batteryPercentageSync >= 70) {
            return 7;
        }
        if (batteryPercentageSync >= 55) {
            return 6;
        }
        if (batteryPercentageSync >= 40) {
            return 5;
        }
        if (batteryPercentageSync >= 25) {
            return 4;
        }
        if (batteryPercentageSync >= 10) {
            return 3;
        }
        if (batteryPercentageSync >= 5) {
            return 2;
        }
        return batteryPercentageSync >= 0 ? 1 : null;
    }

    public String getCarrier() {
        TelephonyManager telephonyManager = getTelephonyManager();
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    @SuppressLint({"MissingPermission"})
    public Integer getConnectionType() {
        NetworkCapabilities networkCapabilities;
        if (hasPermission("android.permission.ACCESS_NETWORK_STATE")) {
            boolean zHasPermission = hasPermission("android.permission.READ_PHONE_STATE");
            Context context = this.mContext;
            if (context != null && context.getSystemService("connectivity") != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.mContext.getSystemService("connectivity");
                if (Build.VERSION.SDK_INT >= 24 && zHasPermission) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            return 2;
                        }
                        if (networkCapabilities.hasTransport(3)) {
                            return 1;
                        }
                        if (networkCapabilities.hasTransport(0)) {
                            TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
                            if (telephonyManager == null) {
                                return 3;
                            }
                            switch (telephonyManager.getDataNetworkType()) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                case 16:
                                    return 4;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    return 5;
                                case 13:
                                case 18:
                                case 19:
                                    return 6;
                                case 20:
                                    return 7;
                                default:
                                    return 3;
                            }
                        }
                    }
                    return null;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            return type != 9 ? null : 1;
                        }
                        return 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 0:
                            return 3;
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return 4;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return 5;
                        case 13:
                        case 18:
                        case 19:
                            return 6;
                        case 20:
                            return 7;
                        default:
                            return null;
                    }
                }
            }
        }
        return null;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceHeight() {
        return this.deviceHeight;
    }

    public void getDeviceScreenDimensions() {
        Point screenDimensionsToPoint = new ScreenDimensionsUtils().getScreenDimensionsToPoint(this.mContext);
        this.deviceWidth = Integer.toString(screenDimensionsToPoint.x);
        this.deviceHeight = Integer.toString(screenDimensionsToPoint.y);
        Context context = this.mContext;
        if (context != null) {
            this.pxratio = context.getResources().getDisplayMetrics().density;
        }
    }

    public int getDeviceType() {
        Context context = this.mContext;
        if (context != null) {
            return context.getResources().getBoolean(R.bool.is_tablet) ? 5 : 4;
        }
        return 1;
    }

    public String getDeviceWidth() {
        return this.deviceWidth;
    }

    public Integer getFreeMemoryMb() {
        return Integer.valueOf((int) ((getAvailableInternalMemorySize().longValue() / 1024) / 1024));
    }

    public List<String> getInputLanguages() {
        List<InputMethodInfo> enabledInputMethodList;
        List<InputMethodSubtype> enabledInputMethodSubtypeList;
        String mode;
        String locale;
        ArrayList arrayList = new ArrayList();
        Context context = this.mContext;
        if (context != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null && (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) != null && !enabledInputMethodList.isEmpty()) {
                    for (InputMethodInfo inputMethodInfo : enabledInputMethodList) {
                        if (inputMethodInfo != null && (enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) != null) {
                            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                                if (inputMethodSubtype != null && (mode = inputMethodSubtype.getMode()) != null && mode.equals("keyboard") && (locale = inputMethodSubtype.getLocale()) != null && !locale.isEmpty()) {
                                    arrayList.add(locale);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Logger.e(TAG, "Error getting input languages", e10);
            }
        }
        return arrayList;
    }

    public String getLangb() {
        Locale locale = getLocale();
        if (locale != null) {
            return locale.toLanguageTag();
        }
        return null;
    }

    public Locale getLocale() {
        Context context = this.mContext;
        if (context != null) {
            return context.getResources().getConfiguration().locale;
        }
        return null;
    }

    public String getMake() {
        return Build.MANUFACTURER;
    }

    public String getMccmnc() {
        TelephonyManager telephonyManager = getTelephonyManager();
        return telephonyManager != null ? telephonyManager.getNetworkOperator() : "";
    }

    public String getMccmncsim() {
        TelephonyManager telephonyManager = getTelephonyManager();
        return telephonyManager != null ? telephonyManager.getSimOperator() : "";
    }

    public String getModel() {
        return Build.MODEL;
    }

    public String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public Orientation getOrientation() {
        Context context = this.mContext;
        if (context == null) {
            return Orientation.NONE;
        }
        int i10 = context.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? Orientation.NONE : Orientation.LANDSCAPE : Orientation.PORTRAIT;
    }

    public String getPpi() {
        Context context = this.mContext;
        return context != null ? String.valueOf((int) context.getResources().getDisplayMetrics().xdpi) : "";
    }

    public String getPxratio() {
        return String.valueOf(this.pxratio);
    }

    public String getSoundSetting() {
        return SoundUtils.isSoundMuted(this.mContext) ? "0" : "1";
    }

    public UserAgent getStructuredUserAgent() {
        UserAgentProvider userAgentProvider = this.mUserAgentProvider;
        if (userAgentProvider != null) {
            return userAgentProvider.getStructuredUserAgent();
        }
        return null;
    }

    public Integer getTotalMemoryMb() {
        return Integer.valueOf((int) ((getTotalInternalMemorySize().longValue() / 1024) / 1024));
    }

    public String getUserAgent() {
        UserAgentProvider userAgentProvider = this.mUserAgentProvider;
        return userAgentProvider != null ? userAgentProvider.getUserAgent() : "";
    }

    public boolean hasTrackingPermissions() {
        return hasPermission("android.permission.ACCESS_COARSE_LOCATION") || hasPermission("android.permission.ACCESS_FINE_LOCATION");
    }

    public void initialize(Listener listener) {
        this.mListener = listener;
        fetchUserAgent();
        fetchAdvertisingId();
        updateChargingStatus();
    }

    public Integer isAirplaneModeEnabled() {
        return checkAirplaneMode();
    }

    public Integer isBatteryCharging() {
        updateChargingStatus();
        return Integer.valueOf(this.mIsCharging ? 1 : 0);
    }

    public Integer isDarkMode() {
        Context context = this.mContext;
        if (context == null || context.getResources() == null || this.mContext.getResources().getConfiguration() == null) {
            return null;
        }
        int i10 = this.mContext.getResources().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            return i10 != 32 ? null : 1;
        }
        return 0;
    }

    public Integer isDndEnabled() {
        try {
            Context context = this.mContext;
            if (context != null && context.getContentResolver() != null) {
                int i10 = Settings.Global.getInt(this.mContext.getContentResolver(), "zen_mode");
                if (i10 == 0) {
                    Logger.d(TAG, "DnD : OFF");
                    return 0;
                }
                if (i10 == 1) {
                    Logger.d(TAG, "DnD : ON - Priority Only");
                    return 1;
                }
                if (i10 == 2) {
                    Logger.d(TAG, "DnD : ON - Total Silence");
                    return 1;
                }
                if (i10 != 3) {
                    return null;
                }
                Logger.d(TAG, "DnD : ON - Alarms Only");
                return 1;
            }
            return null;
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    public Integer isHeadsetOn() {
        AudioManager audioManager;
        AudioDeviceInfo[] devices;
        if (!hasPermission("android.permission.READ_PHONE_STATE") || (audioManager = (AudioManager) this.mContext.getSystemService("audio")) == null || (devices = audioManager.getDevices(2)) == null) {
            return null;
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                return 1;
            }
        }
        return 0;
    }

    public Integer isPowerSaveMode() {
        PowerManager powerManager = (PowerManager) this.mContext.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode() ? 1 : 0;
        }
        return null;
    }

    public boolean limitTracking() {
        return this.mLimitTracking;
    }

    public void updateChargingStatus() {
        synchronized (this.mReceiverLock) {
            if (!this.mIsChangingReceiverRegistered && this.mContext != null) {
                try {
                    this.mContext.registerReceiver(this.mBatteryStatusReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    this.mIsChangingReceiverRegistered = true;
                } catch (IllegalArgumentException | SecurityException e10) {
                    Logger.e(TAG, "Failed to register battery receiver", e10);
                }
            }
        }
    }
}
