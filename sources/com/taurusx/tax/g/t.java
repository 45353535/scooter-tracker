package com.taurusx.tax.g;

import android.content.Context;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.taurusx.tax.log.LogUtil;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class t {
    public static int a(Context context) {
        int i10 = context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return 0;
        }
        return i10 == 2 ? 1 : -1;
    }

    public static String c(Context context) {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "zh";
        }
    }

    public static String o(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimOperator() : "";
    }

    public static float s(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String w(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimOperatorName() : "";
    }

    public static int y(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? 2 : 1;
    }

    public static String z(Context context) {
        try {
            String string = Settings.System.getString(context.getContentResolver(), "android_id");
            try {
                LogUtil.v("taurusx", "the android id is " + string);
                return string;
            } catch (Exception unused) {
                return string;
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    public static long z(File file, long j10) {
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            LogUtil.v("taurusx", "Unable to calculate 2% of available disk space, defaulting to minimum");
        }
        return Math.max(Math.min(j10, 104857600L), 31457280L);
    }

    public static long z(File file) {
        return z(file, 31457280L);
    }

    public static int z(int i10, Context context) {
        return (i10 * 160) / context.getResources().getDisplayMetrics().densityDpi;
    }
}
