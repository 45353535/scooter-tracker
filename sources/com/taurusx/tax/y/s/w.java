package com.taurusx.tax.y.s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.taurusx.tax.g.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f67659a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f67660c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HashMap<String, ArrayList<String>> f67661f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f67662g = "SHA256";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67663n = "MD5";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f67664o = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String f67665s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f67666t = "SHA1";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static long f67667w = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f67668y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f67669z = "DeviceUtil";

    public static String a(Context context) {
        if (f67665s == null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            f67665s = telephonyManager.getNetworkOperator() + telephonyManager.getNetworkOperatorName();
        }
        return f67665s;
    }

    public static String c(Context context) {
        ArrayList<String> arrayListZ = z(context, f67666t);
        return (arrayListZ == null || arrayListZ.size() == 0) ? "" : arrayListZ.get(0);
    }

    public static boolean n(Context context) {
        if (f67659a == null) {
            List<Sensor> sensorList = ((SensorManager) context.getSystemService("sensor")).getSensorList(5);
            f67659a = Boolean.valueOf(sensorList != null && sensorList.size() > 0);
        }
        return f67659a.booleanValue();
    }

    public static long o(Context context) {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public static long s(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0L;
        }
        try {
            long j10 = f67668y;
            if (j10 > 0) {
                return j10;
            }
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(packageName, 256)) == null) {
                return 0L;
            }
            long j11 = packageInfo.lastUpdateTime;
            f67668y = j11;
            return j11;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static long w(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0L;
        }
        try {
            long j10 = f67667w;
            if (j10 > 0) {
                return j10;
            }
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(packageName, 256)) == null) {
                return 0L;
            }
            long j11 = packageInfo.firstInstallTime;
            f67667w = j11;
            return j11;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static JSONObject y(Context context) {
        try {
            return new JSONObject(b.z().y(context, b.f66088f));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String z(Context context) {
        if (TextUtils.isEmpty(f67660c)) {
            f67660c = Settings.System.getString(context.getContentResolver(), "android_id");
            Log.d(f67669z, "Android id is " + f67660c);
        }
        return f67660c;
    }

    public static boolean y(Context context, String str) {
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String z() {
        if (f67664o == null) {
            String[] strArr = Build.SUPPORTED_ABIS;
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(',');
            }
            f67664o = sb2.toString();
        }
        return f67664o;
    }

    public static boolean w() {
        ArrayList arrayList = new ArrayList();
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.isUp()) {
                    arrayList.add(networkInterface.getName());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList.contains("tun0") || arrayList.contains("ppp0");
    }

    public static Signature[] w(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static ArrayList<String> z(Context context, String str) {
        String strZ;
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (f67661f.get(str) != null) {
                return f67661f.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : w(context, packageName)) {
                    if ("MD5".equals(str)) {
                        strZ = z(signature, "MD5");
                    } else if (f67666t.equals(str)) {
                        strZ = z(signature, f67666t);
                    } else if ("SHA256".equals(str)) {
                        strZ = z(signature, "SHA256");
                    } else {
                        strZ = "error!";
                    }
                    arrayList.add(strZ);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            f67661f.put(str, arrayList);
        }
        return arrayList;
    }

    public static String z(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return sb2.substring(0, sb2.length() - 1).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "error!";
        }
    }
}
