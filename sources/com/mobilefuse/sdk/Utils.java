package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.applovin.impl.tc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class Utils {
    public static int convertDpToPx(Context context, int i10) throws Throwable {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static void convertFromDpToPixels(Activity activity, int[] iArr) throws Throwable {
        float f10 = activity.getResources().getDisplayMetrics().density;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = (int) ((iArr[i10] * f10) + 0.5f);
        }
    }

    public static void convertFromPixelsToDp(Activity activity, int[] iArr) throws Throwable {
        float f10 = activity.getResources().getDisplayMetrics().density;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = (int) ((iArr[i10] / f10) + 0.5f);
        }
    }

    public static int convertPxToDp(Context context, int i10) throws Throwable {
        return (int) ((i10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Activity getActivityForView(View view) throws Throwable {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String getApplicationName(Context context) throws Throwable {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i10 = applicationInfo.labelRes;
        return i10 == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i10);
    }

    public static String getAssetContent(Context context, String str) throws Throwable {
        InputStream inputStreamOpen = context.getAssets().open(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, "UTF-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line + IOUtils.LINE_SEPARATOR_UNIX);
            }
        } finally {
            try {
            } finally {
            }
        }
        return sb2.toString();
    }

    public static int getCurrentYear() {
        return Calendar.getInstance().get(1);
    }

    public static int[] getDeviceScreenSize() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    @NonNull
    public static Handler getHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static PackageInfo getPackageInfo(Context context) throws Throwable {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
    }

    public static int[] getScreenSizeAsDp(Activity activity) throws Throwable {
        int[] screenSizeAsPixels = getScreenSizeAsPixels(activity);
        convertFromPixelsToDp(activity, screenSizeAsPixels);
        return screenSizeAsPixels;
    }

    public static int[] getScreenSizeAsPixels(Context context) throws Throwable {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static boolean hasIntent(Context context, Intent intent) throws Throwable {
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    public static boolean hasManifestPermission(Context context, String str) throws Throwable {
        return context != null && context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean isAttachedToWindow(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    public static boolean isDeviceTypeTablet() throws Throwable {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int iMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int iMax = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        float f10 = displayMetrics.density;
        return Math.min(((float) iMin) / f10, ((float) iMax) / f10) >= 600.0f;
    }

    public static boolean isJavaVersionSupported() {
        try {
            tc.a(" ", new CharSequence[]{"java", "test"});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void lockOrientationFromExpand(Activity activity, boolean z10, String str) throws Throwable {
        if (str == null) {
            return;
        }
        if (!str.equals("none")) {
            lockToMraidOrientation(activity, str);
        }
        if (z10) {
            unlockOrientation(activity);
        } else if (str.equals("none")) {
            lockToCurrentOrientation(activity);
        }
    }

    protected static void lockToCurrentOrientation(Activity activity) throws Throwable {
        setActivityOrientation(activity, activity.getResources().getConfiguration().orientation);
    }

    public static void lockToMraidOrientation(Activity activity, String str) throws Throwable {
        int i10;
        int i11;
        i10 = 2;
        i11 = activity.getResources().getConfiguration().orientation;
        str.getClass();
        switch (str) {
            case "none":
                activity.setRequestedOrientation(-1);
                return;
            case "portrait":
                i10 = 1;
                break;
            case "landscape":
                break;
            default:
                i10 = i11;
                break;
        }
        setActivityOrientation(activity, i10);
    }

    public static void setActivityOrientation(Activity activity, int i10) throws Throwable {
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        boolean z10 = Build.MANUFACTURER.toUpperCase(locale).equals("AMAZON") && (upperCase.equals("KFTT") || upperCase.equals("KFJWI") || upperCase.equals("KFJWA"));
        if (activity == null || activity.isFinishing()) {
            return;
        }
        int rotation = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 1) {
            if (rotation == 2) {
                activity.setRequestedOrientation(9);
                return;
            } else {
                activity.setRequestedOrientation(1);
                return;
            }
        }
        if (i10 == 2) {
            if (z10) {
                if (rotation == 0 || rotation == 1) {
                    activity.setRequestedOrientation(8);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            if (rotation == 0 || rotation == 1) {
                activity.setRequestedOrientation(0);
            } else {
                activity.setRequestedOrientation(8);
            }
        }
    }

    public static void unlockOrientation(Activity activity) throws Throwable {
        activity.setRequestedOrientation(-1);
    }
}
