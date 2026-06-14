package com.appodeal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;
import com.appodeal.ads.utils.Log;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13491a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f13492b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f13493c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f13494d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f13495e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f13496f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static WeakReference f13497g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static WeakReference f13498h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static WeakReference f13499i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static WeakReference f13500j = null;

    public static boolean A() {
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10]).exists()) {
                    return true;
                }
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
        return false;
    }

    public static WindowManager B(Context context) {
        WeakReference weakReference = f13498h;
        if (weakReference != null && weakReference.get() != null) {
            return (WindowManager) f13498h.get();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        f13498h = new WeakReference(windowManager);
        return windowManager;
    }

    public static boolean C(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = B(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) point.y) / displayMetrics.ydpi), 2.0d) + Math.pow((double) (((float) point.x) / displayMetrics.xdpi), 2.0d)) > 7.0d;
    }

    public static float a() {
        try {
            int iJ = j();
            float fB = 0.0f;
            float fE = 0.0f;
            float fC = 0.0f;
            for (int i10 = 0; i10 < iJ; i10++) {
                fC += c("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/scaling_cur_freq");
                fE += e(i10);
                fB += b(i10);
            }
            float f10 = fB - fE;
            if (f10 > 0.0f && fB >= 0.0f) {
                return (fC - fE) / f10;
            }
            return 0.0f;
        } catch (Throwable th2) {
            Log.log(th2);
            return 0.0f;
        }
    }

    public static float b(int i10) {
        HashMap map = f13491a;
        if (map.containsKey(Integer.valueOf(i10))) {
            Float f10 = (Float) map.get(Integer.valueOf(i10));
            if (f10 != null) {
                return f10.floatValue();
            }
            return 0.0f;
        }
        float fC = c("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq");
        if (fC > 0.0f) {
            map.put(Integer.valueOf(i10), Float.valueOf(fC));
        }
        return fC;
    }

    public static float c(String str) {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader, 1024);
                } catch (Throwable unused) {
                    bufferedReader = null;
                }
            } catch (Throwable unused2) {
                inputStreamReader = null;
                bufferedReader = null;
            }
        } catch (Throwable unused3) {
            inputStreamReader = null;
            bufferedReader = null;
        }
        try {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                z6.f(bufferedReader);
                z6.f(inputStreamReader);
                z6.f(fileInputStream);
                return 0.0f;
            }
            float f10 = Float.parseFloat(line);
            z6.f(bufferedReader);
            z6.f(inputStreamReader);
            z6.f(fileInputStream);
            return f10;
        } catch (Throwable unused4) {
            fileInputStream2 = fileInputStream;
            z6.f(bufferedReader);
            z6.f(inputStreamReader);
            z6.f(fileInputStream2);
            return 0.0f;
        }
    }

    public static ActivityManager d(Context context) {
        WeakReference weakReference = f13497g;
        if (weakReference != null && weakReference.get() != null) {
            return (ActivityManager) f13497g.get();
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        f13497g = new WeakReference(activityManager);
        return activityManager;
    }

    public static float e(int i10) {
        HashMap map = f13492b;
        if (map.containsKey(Integer.valueOf(i10))) {
            Float f10 = (Float) map.get(Integer.valueOf(i10));
            if (f10 != null) {
                return f10.floatValue();
            }
            return 0.0f;
        }
        float fC = c("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_min_freq");
        if (fC > 0.0f) {
            map.put(Integer.valueOf(i10), Float.valueOf(fC));
        }
        return fC;
    }

    public static float f(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra == -1 || intExtra2 == -1) {
                    return -1.0f;
                }
                return (intExtra / intExtra2) * 100.0f;
            }
        } catch (Throwable th2) {
            Log.log(th2);
        }
        return -1.0f;
    }

    public static String g() {
        return Build.MANUFACTURER;
    }

    public static ConnectionData h(Context context) {
        ConnectivityManager connectivityManager;
        String lowerCase;
        String subtypeName;
        WeakReference weakReference = f13500j;
        if (weakReference == null || weakReference.get() == null) {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            f13500j = new WeakReference(connectivityManager);
        } else {
            connectivityManager = (ConnectivityManager) f13500j.get();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        String str = null;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            lowerCase = activeNetworkInfo.getTypeName();
            subtypeName = activeNetworkInfo.getSubtypeName();
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        z10 = true;
                        break;
                }
            } else if (type == 1 || type == 6) {
                z10 = true;
            } else if (type != 7 && type == 9) {
                z10 = true;
            }
        } else {
            lowerCase = "unknown";
            subtypeName = null;
        }
        if (lowerCase != null) {
            if (lowerCase.equals("CELLULAR")) {
                lowerCase = "MOBILE";
            }
            lowerCase = lowerCase.toLowerCase(Locale.ENGLISH);
        }
        if (subtypeName != null) {
            String lowerCase2 = subtypeName.toLowerCase(Locale.ENGLISH);
            if (!lowerCase2.isEmpty()) {
                str = lowerCase2;
            }
        } else {
            str = subtypeName;
        }
        return new ConnectionData(lowerCase, str, z10);
    }

    public static String i() {
        return Build.MODEL;
    }

    public static int j() {
        if (f13496f == 0) {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new s1());
                if (fileArrListFiles != null) {
                    f13496f = fileArrListFiles.length;
                } else {
                    f13496f = Runtime.getRuntime().availableProcessors();
                }
            } catch (Throwable th2) {
                f13496f = Runtime.getRuntime().availableProcessors();
                Log.log(th2);
            }
        }
        return f13496f;
    }

    public static String k(Context context) {
        String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() < 3) {
            return null;
        }
        return networkOperator.substring(0, 3) + '-' + networkOperator.substring(3);
    }

    public static long l() {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            return ((long) memoryInfo.getTotalPss()) * 1024;
        } catch (Throwable th2) {
            Log.log(th2);
            return 0L;
        }
    }

    public static String m(Context context) {
        return Settings.Global.getString(context.getContentResolver(), "device_name");
    }

    public static long n() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Throwable th2) {
            Log.log(th2);
            return 0L;
        }
    }

    public static Location o(Context context) {
        LocationManager locationManager;
        if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0 || context.checkPermission("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) == 0) {
            WeakReference weakReference = f13499i;
            if (weakReference == null || weakReference.get() == null) {
                locationManager = (LocationManager) context.getSystemService("location");
                f13499i = new WeakReference(locationManager);
            } else {
                locationManager = (LocationManager) f13499i.get();
            }
            String bestProvider = Build.VERSION.SDK_INT >= 33 ? GplLibraryWrapper.FUSED_PROVIDER : locationManager.getBestProvider(new Criteria(), false);
            if (bestProvider != null) {
                try {
                    return locationManager.getLastKnownLocation(bestProvider);
                } catch (IllegalArgumentException unused) {
                    Log.log(LogConstants.KEY_SDK, "Location", "failed to retrieve GPS location: device has no GPS provider");
                } catch (SecurityException unused2) {
                    Log.log(LogConstants.KEY_SDK, "Location", "failed to retrieve GPS location: permission not granted");
                }
            }
        }
        return null;
    }

    public static long p() {
        try {
            if (f13493c == 0) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                f13493c = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            }
        } catch (Throwable th2) {
            Log.log(th2);
        }
        return f13493c;
    }

    public static long q(Context context) {
        try {
            try {
                if (f13495e == 0) {
                    f13495e = ((long) d(context).getLargeMemoryClass()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                }
            } catch (Throwable th2) {
                Log.log(th2);
            }
            return f13495e - l();
        } catch (Throwable th3) {
            Log.log(th3);
            return 0L;
        }
    }

    public static long r() {
        try {
            return p() - n();
        } catch (Throwable th2) {
            Log.log(th2);
            return 0L;
        }
    }

    public static long s(Context context) {
        try {
            if (f13494d == 0) {
                ActivityManager activityManagerD = d(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManagerD.getMemoryInfo(memoryInfo);
                f13494d = memoryInfo.totalMem;
            }
        } catch (Throwable th2) {
            Log.log(th2);
        }
        return f13494d;
    }

    public static float t(Context context) {
        Display defaultDisplay = B(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public static String u() {
        return Build.VERSION.RELEASE;
    }

    public static float v(Context context) {
        Display defaultDisplay = B(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        defaultDisplay.getSize(new Point());
        return r1.y / displayMetrics.density;
    }

    public static int w() {
        return Build.VERSION.SDK_INT;
    }

    public static Point x(Context context) {
        Display defaultDisplay = B(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static boolean y() {
        Object obj;
        try {
            Field declaredField = Build.class.getDeclaredField("IS_EMULATOR");
            declaredField.setAccessible(true);
            obj = declaredField.isAccessible() ? declaredField.get(null) : null;
        } catch (Throwable unused) {
        }
        if (!(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false)) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.MODEL;
                if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static float z(Context context) {
        Display defaultDisplay = B(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        defaultDisplay.getSize(new Point());
        return r1.x / displayMetrics.density;
    }
}
