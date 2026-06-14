package com.pubmatic.sdk.common.models;

import android.content.Context;
import android.location.Address;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.service.POBDeviceIpUpdaterService;
import com.pubmatic.sdk.common.utility.POBAdvertisingIdClient;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class POBDeviceInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f62379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f62380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f62382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f62383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f62384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f62385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f62386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f62387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f62388o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    POBAdvertisingIdClient f62390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f62391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f62392s;
    public int screenHeight;
    public int screenWidth;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62374a = "POBDeviceInfo";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicReference f62389p = new AtomicReference();

    public enum DEVICE_ID_TYPE {
        ANDROID_ID("3"),
        ADVERTISING_ID("9");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f62394a;

        DEVICE_ID_TYPE(String str) {
            this.f62394a = str;
        }

        public String getValue() {
            return this.f62394a;
        }
    }

    public POBDeviceInfo(@NonNull Context context) {
        this.f62377d = null;
        this.f62384k = null;
        this.f62386m = context;
        this.f62390q = POBAdvertisingIdClient.getInstance(context);
        refreshAdvertisingIdInfo();
        this.f62376c = a(context);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                if (telephonyManager.getPhoneType() != 2) {
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator)) {
                        this.f62388o = "" + Integer.parseInt(networkOperator.substring(0, 3)) + TokenBuilder.TOKEN_DELIMITER + Integer.parseInt(networkOperator.substring(3));
                    }
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    this.f62391r = networkCountryIso != null ? networkCountryIso.toUpperCase(Locale.ENGLISH) : null;
                }
                a();
                this.f62377d = telephonyManager.getNetworkOperatorName();
            } catch (Exception e10) {
                POBLog.warn("POBDeviceInfo", "Unable to fetch carrier name from TelephonyManager or ISO3 or ISO2 country code. Error: %s", e10.getMessage());
            }
        }
        this.f62378e = Locale.getDefault().getLanguage();
        this.f62379f = Build.MANUFACTURER;
        this.f62380g = Build.MODEL;
        this.f62381h = Build.DEVICE;
        this.f62382i = "Android";
        this.f62383j = Build.VERSION.RELEASE;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                this.screenWidth = displayMetrics.widthPixels;
                this.screenHeight = displayMetrics.heightPixels;
                this.f62384k = this.screenWidth + "x" + this.screenHeight;
            }
        } catch (Exception e11) {
            POBLog.warn("POBDeviceInfo", "Unable to fetch screen resolution. Error: %s", e11.getMessage());
        }
        this.f62385l = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime());
        this.f62387n = this.f62386m.getResources().getDisplayMetrics().density;
        this.f62375b = POBUtils.getTimeOffsetInMinutes();
    }

    private String a(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e10) {
            POBLog.warn("POBDeviceInfo", "Unable to fetch Device ID. Error: %s", e10.getMessage());
            string = null;
        }
        return string == null ? "" : string;
    }

    @Nullable
    public String getAcceptLanguage() {
        return this.f62378e;
    }

    @Nullable
    public String getAdvertisingID() {
        return this.f62390q.getAdvertisingId();
    }

    @Nullable
    public String getAndroidId() {
        return this.f62376c;
    }

    public DEVICE_ID_TYPE getAndroidIdType(boolean z10) {
        return z10 ? DEVICE_ID_TYPE.ADVERTISING_ID : DEVICE_ID_TYPE.ANDROID_ID;
    }

    @Nullable
    public String getCarrierName() {
        return this.f62377d;
    }

    public String getCurrentTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime());
    }

    @Nullable
    public String getCurrentTimeZone() {
        return this.f62385l;
    }

    @Nullable
    public String getDeviceIp() {
        return (String) this.f62389p.get();
    }

    @Nullable
    public String getHardwareVersion() {
        return this.f62381h;
    }

    @Nullable
    public String getISOAlpha2CountryCode() {
        return this.f62391r;
    }

    @Nullable
    public String getISOAlpha3CountryCode() {
        return this.f62392s;
    }

    @Nullable
    public Boolean getLmtEnabled() {
        return Boolean.valueOf(this.f62390q.getLMTState());
    }

    @Nullable
    public String getMake() {
        return this.f62379f;
    }

    @Nullable
    public String getMccmnc() {
        return this.f62388o;
    }

    @Nullable
    public String getModel() {
        return this.f62380g;
    }

    public int getOrientation() {
        return this.f62386m.getResources().getConfiguration().orientation;
    }

    @Nullable
    public String getOsName() {
        return this.f62382i;
    }

    @Nullable
    public String getOsVersion() {
        return this.f62383j;
    }

    public float getPxratio() {
        return this.f62387n;
    }

    public int getScreenHeight() {
        return this.screenHeight;
    }

    @Nullable
    public String getScreenResolution() {
        return this.f62384k;
    }

    public int getScreenWidth() {
        return this.screenWidth;
    }

    public int getTimeZoneOffsetInMinutes() {
        return this.f62375b;
    }

    @WorkerThread
    public String getUserAgent() {
        return POBInstanceProvider.getCacheManager(this.f62386m).fetchUserAgent();
    }

    public void refreshAdvertisingIdInfo() {
        this.f62390q.refreshAAID();
    }

    public void registerIpUpdateService(@NonNull POBDeviceIpUpdaterService pOBDeviceIpUpdaterService) {
        final AtomicReference atomicReference = this.f62389p;
        Objects.requireNonNull(atomicReference);
        pOBDeviceIpUpdaterService.registerListener(new POBDeviceIpUpdaterService.POBIpUpdateListener() { // from class: com.pubmatic.sdk.common.models.a
            @Override // com.pubmatic.sdk.common.service.POBDeviceIpUpdaterService.POBIpUpdateListener
            public final void onIpAddressFetched(String str) {
                atomicReference.set(str);
            }
        });
    }

    private void a() {
        Address address;
        String str = this.f62391r;
        if (str != null) {
            this.f62392s = a(str);
        }
        if (!TextUtils.isEmpty(this.f62392s) || (address = new POBLocationDetector(this.f62386m).getAddress()) == null) {
            return;
        }
        String countryCode = address.getCountryCode();
        if (TextUtils.isEmpty(countryCode)) {
            return;
        }
        this.f62392s = a(countryCode);
    }

    private String a(String str) {
        try {
            return new Locale(Locale.ENGLISH.getLanguage(), str).getISO3Country();
        } catch (MissingResourceException unused) {
            POBLog.warn("POBDeviceInfo", "Unable to get ISO 3 country code from ISO2 for input value as %s", str);
            return null;
        }
    }
}
