package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f46893a = "NormalDeviceInfoProvider";

    public String a() {
        return Build.BRAND;
    }

    public int b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage());
            return -1;
        }
    }

    public int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage(), e10);
            return -1;
        }
    }

    public String d() {
        return Build.MANUFACTURER;
    }

    public String e(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage(), e10);
            return "";
        }
    }

    public String f() {
        return Build.MODEL;
    }

    public String g() {
        return Build.VERSION.RELEASE;
    }

    public int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Integer num = g(context).get("width");
            return num == null ? displayMetrics.widthPixels : num.intValue();
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage(), e10);
            return 0;
        }
    }

    public Map<String, String> i(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return null;
            }
            String strSubstring = simOperator.substring(0, Math.min(3, simOperator.length()));
            String strSubstring2 = simOperator.substring(Math.min(3, simOperator.length()));
            HashMap map = new HashMap();
            map.put("mcc", strSubstring);
            map.put("mnc", strSubstring2);
            return map;
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage(), e10);
            return null;
        }
    }

    public int j(Context context) {
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null) {
                    return 1;
                }
                return configuration.orientation == 2 ? 2 : 1;
            } catch (Throwable th2) {
                q0.b(f46893a, th2.getMessage(), th2);
            }
        }
        return 1;
    }

    public String k(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return "0";
        }
    }

    public String l(Context context) {
        String string;
        if (context == null) {
            return "";
        }
        try {
            string = Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage(), th2);
            string = "";
        }
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public boolean m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (context.getResources() != null && context.getResources().getConfiguration() != null) {
                return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
            }
            return false;
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage(), th2);
            return false;
        }
    }

    public int n(Context context) {
        return v0.c(context, "com.tencent.mm") ? 1 : 0;
    }

    public String a(Context context, String str) {
        try {
            return (TextUtils.isEmpty(str) || context == null) ? "" : context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage(), e10);
            return "";
        }
    }

    public String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage(), e10);
            return "";
        }
    }

    public int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Integer num = g(context).get("height");
            return num == null ? displayMetrics.heightPixels : num.intValue();
        } catch (Exception e10) {
            q0.b(f46893a, e10.getMessage(), e10);
            return 0;
        }
    }

    public HashMap<String, Integer> g(Context context) {
        HashMap<String, Integer> map = new HashMap<>();
        if (context != null) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (context instanceof Activity) {
                    ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                } else {
                    ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                }
                map.put("height", Integer.valueOf(displayMetrics.heightPixels));
                map.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return map;
            } catch (Exception e10) {
                q0.b(f46893a, e10.getMessage(), e10);
            }
        }
        return map;
    }

    public int n() {
        return v0.g() ? 1 : 0;
    }

    public long b() {
        try {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String c() {
        String str;
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th3) {
                    q0.b(f46893a, th3.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th4) {
                    q0.b(f46893a, th4.getMessage());
                }
                string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = k0.b(string);
                }
            } else {
                string = "android";
            }
            return string;
        } catch (Throwable th5) {
            q0.b(f46893a, th5.getMessage());
            return null;
        }
    }

    public Map<String, Object> e() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return null;
            }
            ActivityManager activityManager = (ActivityManager) contextD.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            long j11 = memoryInfo.availMem;
            HashMap map = new HashMap();
            map.put("totalMem", Long.valueOf((j10 / 1024) / 1024));
            map.put(N6.f41431w, Long.valueOf((j11 / 1024) / 1024));
            return map;
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage(), th2);
            return null;
        }
    }

    public int m() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage(), th2);
            return -1;
        }
    }

    public int j() {
        return v0.e();
    }

    public int k() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public int l() {
        PackageManager packageManager;
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null || (packageManager = contextD.getPackageManager()) == null) {
                return 0;
            }
            return packageManager.getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2;
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage(), th2);
            return 0;
        }
    }

    public String a(Context context) {
        Locale locale;
        if (context != null) {
            try {
                if (context.getResources() != null && context.getResources().getConfiguration() != null && (locale = context.getResources().getConfiguration().locale) != null) {
                    return locale.toLanguageTag();
                }
            } catch (Throwable th2) {
                q0.a(f46893a, th2.getMessage(), th2);
            }
        }
        return "en-US";
    }

    public String h() {
        try {
            return Arrays.asList(Build.SUPPORTED_ABIS).toString();
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage(), th2);
            return "";
        }
    }

    public int i() {
        try {
            return Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "install_non_market_apps", 0);
        } catch (Throwable th2) {
            q0.b(f46893a, th2.getMessage(), th2);
            return 0;
        }
    }

    public int a(String str) {
        return v0.f(str);
    }
}
