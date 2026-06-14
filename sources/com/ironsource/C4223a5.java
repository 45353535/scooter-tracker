package com.ironsource;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.InterfaceC4496q4;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4223a5 implements InterfaceC4634y7, InterfaceC4634y7.a {
    private static final String A = "browser_user_agent";
    private static final String B = "browser_user_agent_time";
    private static final String C = "IABTCF_gdprApplies";
    private static final String D = "IABTCF_TCString";
    private static final String E = "IABTCF_AddtlConsent";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f42292j = "android";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f42293k = "com.google.android.gms.permission.AD_ID";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f42294l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f42295m = "com.google.android.gms.appset.AppSet";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42296n = "com.google.android.gms.tasks.OnSuccessListener";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f42297o = "getAdvertisingIdInfo";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f42298p = "getClient";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f42299q = "getAppSetIdInfo";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f42300r = "addOnSuccessListener";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f42301s = "getId";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f42302t = "isLimitAdTrackingEnabled";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f42303u = "Mediation_Shared_Preferences";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f42304v = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f42305w = "cachedUUID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f42306x = "auid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f42307y = "unityads-installinfo";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f42308z = "unityads-idfi";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42309b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42310c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42311d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f42312e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42313f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f42314g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f42315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile String f42316i;

    /* JADX INFO: renamed from: com.ironsource.a5$a */
    class a implements InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String string = obj2.getClass().getMethod(C4223a5.f42301s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(string)) {
                            C4223a5.this.f42314g = string;
                        }
                    }
                } catch (Exception e10) {
                    C4462o4.d().a(e10);
                }
            }
            return null;
        }
    }

    private String O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return objQ.getClass().getMethod(f42301s, null).invoke(objQ, null).toString();
    }

    private void P(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objInvoke = AppSet.class.getMethod(f42298p, Context.class).invoke(AppSet.class, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(f42299q, null).invoke(objInvoke, null);
        objInvoke2.getClass().getMethod(f42300r, OnSuccessListener.class).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object Q(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        int i10 = AdvertisingIdClient.f25284a;
        return AdvertisingIdClient.class.getMethod(f42297o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String R(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return String.valueOf(((Boolean) objQ.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objQ, null)).booleanValue());
    }

    @NotNull
    private String S(Context context) {
        try {
            return C4297ea.a(context, f42303u, A, "");
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    private long T(Context context) {
        try {
            return Long.parseLong(C4297ea.a(context, f42303u, B, String.valueOf(-1L)));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String A(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public File B(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean C(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int D(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public float E(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String F(Context context) {
        try {
            return C4297ea.a(context, "IABTCF_AddtlConsent", (String) null);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String G(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC4634y7
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<ApplicationInfo> H(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public String I(Context context) {
        X4 x42 = X4.f42026a;
        if (x42.b()) {
            try {
                if (!x42.a()) {
                    return O(context);
                }
                if (this.f42316i != null) {
                    return this.f42316i;
                }
                String strO = O(context);
                if (TextUtils.isEmpty(strO)) {
                    return strO;
                }
                this.f42316i = strO;
                return strO;
            } catch (Exception e10) {
                C4462o4.d().a(e10);
            }
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean J(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int K(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public String L(Context context) {
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public synchronized String M(Context context) {
        if (!TextUtils.isEmpty(this.f42309b)) {
            return this.f42309b;
        }
        if (C4297ea.a(context, f42303u, InterfaceC4634y7.f45876a, true)) {
            String strA = C4297ea.a(context, f42303u, f42305w, "");
            if (TextUtils.isEmpty(strA)) {
                String string = UUID.randomUUID().toString();
                this.f42309b = string;
                C4297ea.b(context, f42303u, f42305w, string);
            } else {
                this.f42309b = strA;
            }
        }
        return this.f42309b;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String c(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String d() {
        String id2 = TimeZone.getDefault().getID();
        return id2 != null ? id2 : "";
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean e(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String f() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC4634y7
    public long g() {
        if (j()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean h(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String i() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean j() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (Environment.isExternalStorageRemovable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String l() {
        return Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int m() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public ActivityManager.MemoryInfo n(Context context) {
        if (context == null || !Ib.U().g().a()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int o() {
        return k();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean p() {
        return b("su");
    }

    @Override // com.ironsource.InterfaceC4634y7
    public long q(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public float r() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String s() {
        try {
            return this.f42312e.isEmpty() ? S(ContextProvider.getInstance().getApplicationContext()) : this.f42312e;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public String t() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e10) {
            IronLog.INTERNAL.error(e10.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String u(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String v(Context context) {
        try {
            return C4297ea.a(context, "IABTCF_TCString", (String) null);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean w(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String x(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String y(Context context) {
        if (!X4.f42026a.c()) {
            return "";
        }
        try {
            P(context);
            return !TextUtils.isEmpty(this.f42314g) ? this.f42314g : "";
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int z(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.InterfaceC4634y7
    public File f(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public String i(Context context) {
        if (!TextUtils.isEmpty(this.f42311d)) {
            return this.f42311d;
        }
        if (context == null) {
            return null;
        }
        String strA = C4297ea.a(context, "unityads-installinfo", "unityads-idfi", (String) null);
        this.f42311d = strA;
        return strA;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public File l(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String m(Context context) {
        if (context == null) {
            return "";
        }
        int iN = N(context);
        if (iN == 0) {
            return "landscape";
        }
        if (iN == 1) {
            return "portrait";
        }
        if (iN == 11) {
            return "landscape";
        }
        if (iN == 12) {
            return "portrait";
        }
        switch (iN) {
            case 6:
            case 8:
                return "landscape";
            case 7:
            case 9:
                return "portrait";
            default:
                return "none";
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int o(Context context) {
        int iK = K(context);
        int iZ = z(context);
        return (((iK == 0 || iK == 2) && iZ == 2) || ((iK == 1 || iK == 3) && iZ == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean p(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public synchronized String d(Context context) {
        if (!TextUtils.isEmpty(this.f42310c)) {
            return this.f42310c;
        }
        if (context == null) {
            return "";
        }
        String strA = C4297ea.a(context, "supersonic_shared_preferen", "auid", "");
        this.f42310c = strA;
        if (TextUtils.isEmpty(strA)) {
            String string = UUID.randomUUID().toString();
            this.f42310c = string;
            C4297ea.b(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.f42310c;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int k(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String r(Context context) {
        if (a(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int t(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int e() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean g(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(f42293k)) {
                    return true;
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public long h() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean n() {
        return this.f42313f;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public String q() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC4634y7
    public File j(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int s(Context context) {
        try {
            return C4297ea.a(context, "IABTCF_gdprApplies", -1);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return -1;
        }
    }

    @Override // com.ironsource.InterfaceC4634y7
    public int b() {
        return c();
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public String b(Context context) {
        try {
            if (X4.f42026a.a()) {
                if (this.f42315h == null) {
                    String strR = R(context);
                    if (TextUtils.isEmpty(strR)) {
                        return strR;
                    }
                    this.f42315h = strR;
                    return strR;
                }
                return this.f42315h;
            }
            return R(context);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return null;
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.ironsource.InterfaceC4634y7
    @Nullable
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.InterfaceC4634y7
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.InterfaceC4634y7
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.ironsource.InterfaceC4634y7.a
    public void a(Context context, long j10) {
        if (context != null) {
            if (!new Xf(new InterfaceC4496q4.a()).a(T(context), j10)) {
                this.f42312e = S(context);
                this.f42313f = !r0.isEmpty();
            }
            if (this.f42312e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f42312e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j10 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
    }

    private void b(Context context, long j10) {
        try {
            C4297ea.b(context, f42303u, B, String.valueOf(j10));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void a(Context context, String str) {
        try {
            C4297ea.b(context, f42303u, A, str);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
