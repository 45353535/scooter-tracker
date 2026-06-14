package f1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f70223a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f70224b = 5;

    public static String a(Context context) {
        ContentResolver contentResolver;
        if (context == null || Build.VERSION.SDK_INT >= 26 || f(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            try {
                if ("9774d56d682e549c".equals(string)) {
                    return null;
                }
                return string;
            } catch (Exception unused) {
                return string;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String b(Context context, boolean z10) {
        String strA = a(context);
        return (z10 || strA == null) ? d(context) : strA;
    }

    public static Integer c(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f11 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((double) ((f11 * f11) + (f10 * f10))) >= 6.5d ? Integer.valueOf(f70224b) : Integer.valueOf(f70223a);
    }

    public static String d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit != null) {
            editorEdit.putString("cbUUID", string2).apply();
        }
        return string2;
    }

    public static String e(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "phone";
        }
        int i10 = configuration.uiMode & 15;
        int i11 = configuration.screenLayout & 15;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "phone";
        }
        if (packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
            return "chromebook";
        }
        String str = Build.BRAND;
        if (str != null && str.equals("chromium") && Build.MANUFACTURER.equals("chromium")) {
            return "chromebook";
        }
        String str2 = Build.DEVICE;
        if (str2 != null && str2.matches(".+_cheets")) {
            return "chromebook";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.watch") || i10 == 6) {
            return "watch";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.television") || i10 == 4) {
            return "tv";
        }
        String str3 = Build.MANUFACTURER;
        return ((str3 == null || !str3.equalsIgnoreCase("Amazon")) && i11 != 4) ? "phone" : "tablet";
    }

    public static boolean f(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue() == 1;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
