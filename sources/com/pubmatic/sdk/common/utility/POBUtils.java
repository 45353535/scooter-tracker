package com.pubmatic.sdk.common.utility;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.taurusx.tax.g.f0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsetsCompat a(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    @NonNull
    public static String buildConfigURL(@NonNull String str, int i10) {
        return String.format(Locale.ENGLISH, "https://ads.pubmatic.com/AdServer/js/pwt/%s/%d/config.json", str, Integer.valueOf(i10));
    }

    @NonNull
    public static String buildUriWithQueryParams(@NonNull Uri uri, @NonNull Map<String, String> map) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    @NonNull
    public static String buildUrlWithQueryParam(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter(str2, str3);
        return builderBuildUpon.build().toString();
    }

    public static int convertDpToPixel(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static float convertDpToPixelWithFloatPrecession(int i10) {
        return i10 * Resources.getSystem().getDisplayMetrics().density;
    }

    public static int convertPixelToDp(int i10) {
        return (int) (i10 / Resources.getSystem().getDisplayMetrics().density);
    }

    @Nullable
    public static List<String> convertStringJsonArrayToList(@Nullable JSONArray jSONArray) {
        if (isJsonArrayNullOrEmpty(jSONArray)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (!jSONArray.isNull(i10)) {
                arrayList.add(jSONArray.optString(i10));
            }
        }
        return arrayList;
    }

    public static double convertToSeconds(@Nullable String str, @Nullable String str2) {
        if (str2 == null || str2.isEmpty()) {
            return 0.0d;
        }
        if (!str2.contains("%")) {
            return getSeconds(str2);
        }
        try {
            return (getSeconds(str) * Double.parseDouble(str2.replace("%", ""))) / 100.0d;
        } catch (NumberFormatException unused) {
            POBLog.error("POBUtils", "Invalid time value", new Object[0]);
            return 0.0d;
        }
    }

    @Nullable
    public static String decodeUrl(@NonNull String str) {
        try {
            POBLog.debug("POBUtils", "encoded URL: " + str, new Object[0]);
            String strDecode = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
            POBLog.debug("POBUtils", "Decoded URL: " + strDecode, new Object[0]);
            return strDecode;
        } catch (UnsupportedEncodingException | IllegalArgumentException e10) {
            POBLog.debug("POBUtils", "Failed to decode url due to " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    @NonNull
    public static List<String> filterListOfStrings(@Nullable List<String> list, @NonNull String str) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (str2 != null && str2.contains(str)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static boolean getBooleanValue(@Nullable String str) {
        if (str != null) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Exception unused) {
                POBLog.error("POBUtils", "Cannot convert string %s to boolean", str);
            }
        }
        return false;
    }

    public static int getDeviceOrientation(@NonNull Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static int getIntegerValue(@Nullable String str) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                POBLog.error("POBUtils", "Cannot convert string %s to integer", str);
            }
        }
        return 0;
    }

    public static POBAdSize getInterstitialAdSize(@NonNull Context context) {
        int deviceOrientation = getDeviceOrientation(context);
        return isTablet(context) ? deviceOrientation == 2 ? POBAdSize.INTERSTITIAL_1024x768 : POBAdSize.INTERSTITIAL_768x1024 : deviceOrientation == 2 ? POBAdSize.INTERSTITIAL_480x320 : POBAdSize.INTERSTITIAL_320x480;
    }

    @Nullable
    public static POBLocation getLocation(@Nullable POBLocationDetector pOBLocationDetector) {
        Location location;
        POBLocation pOBLocation = (!POBInstanceProvider.getSdkConfig().isLocationAccessAllowed() || pOBLocationDetector == null || (location = pOBLocationDetector.getLocation()) == null) ? null : new POBLocation(location);
        return pOBLocation == null ? POBInstanceProvider.getSdkConfig().getLocation() : pOBLocation;
    }

    public static int getRandomNumber(int i10, int i11) {
        return i10 + ((int) (Math.random() * ((double) ((i11 - i10) + 1))));
    }

    public static int getScreenHeight() {
        return convertPixelToDp(Resources.getSystem().getDisplayMetrics().heightPixels);
    }

    public static int getScreenWidth() {
        return convertPixelToDp(Resources.getSystem().getDisplayMetrics().widthPixels);
    }

    public static double getSeconds(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return 0.0d;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
        double d10 = 0.0d;
        for (int length = strArrSplit.length - 1; length >= 0; length--) {
            try {
                d10 += Double.parseDouble(strArrSplit[length]) * Math.pow(60.0d, (strArrSplit.length - 1) - length);
            } catch (NumberFormatException unused) {
                POBLog.error("POBUtils", "Invalid time value", new Object[0]);
                return 0.0d;
            }
        }
        return d10;
    }

    public static int getTimeOffsetInMinutes() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        return (calendar.get(15) + calendar.get(16)) / 60000;
    }

    public static int getValidRefreshInterval(int i10, int i11) {
        if (i10 <= 0) {
            return 0;
        }
        return i10 <= i11 ? i11 : i10;
    }

    @Nullable
    public static <K, V> V getValueFromMap(@Nullable Map<K, V> map, @NonNull K k10) {
        if (map == null || !map.containsKey(k10)) {
            return null;
        }
        try {
            return map.get(k10);
        } catch (ClassCastException | NullPointerException e10) {
            POBLog.error("POBUtils", "Unable to get the %s key from passed map because of: %s", k10.toString(), e10.getMessage());
            return null;
        }
    }

    public static int getViewVisiblePixel(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return rect.height() * rect.width();
        }
        return 0;
    }

    public static int[] getViewXYPosition(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = convertPixelToDp(iArr[0]);
        iArr[1] = convertPixelToDp(iArr[1]);
        return iArr;
    }

    public static float getVisiblePercent(@Nullable View view) {
        if (view == null) {
            return 0.0f;
        }
        if (view.getGlobalVisibleRect(new Rect())) {
            return ((r0.height() * r0.width()) * 100) / (view.getHeight() * view.getWidth());
        }
        return 0.0f;
    }

    public static boolean hasPermission(@NonNull Context context, @NonNull String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e10) {
            POBLog.warn("POBUtils", "Error while checking permission %s", e10.getMessage());
            return false;
        }
    }

    @RequiresApi(api = 30)
    public static boolean hasQueryAllPackagesPermission(@NonNull Context context) {
        return hasPermission(context, "android.permission.QUERY_ALL_PACKAGES");
    }

    public static boolean isDebugBuild(@NonNull Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isJsonArrayNullOrEmpty(@Nullable JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() <= 0;
    }

    public static boolean isJsonObjectNullOrEmpty(@Nullable JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() <= 0;
    }

    public static boolean isListNullOrEmpty(@Nullable List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isNull(@Nullable Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(@Nullable String str) {
        if (str != null) {
            return str.isEmpty();
        }
        return true;
    }

    public static boolean isStringValueNullOrEmpty(@Nullable String str) {
        return str == null || str.isEmpty() || str.equals("null");
    }

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static boolean isValidPlayStoreUrl(@Nullable String str) {
        if (str == null) {
            return false;
        }
        if (str.contains(f0.f66126w) || str.contains("market://launch") || str.contains("market://details")) {
            return str.contains("id=");
        }
        return false;
    }

    public static boolean isViewVisible(@Nullable View view, int i10) {
        return getViewVisiblePixel(view) >= i10;
    }

    public static void logBidWinningStatus(boolean z10, @Nullable String str) {
        if (z10) {
            POBLog.debug("POBUtils", "Bid win for partner - %s", str);
        } else {
            POBLog.debug("POBUtils", "AdServerWin", new Object[0]);
        }
    }

    public static boolean openExternalBrowser(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            POBLog.error("POBUtils", "Open external browser %s", "Not able to parse url");
            return false;
        }
    }

    @NonNull
    public static String parseJsTracker(@NonNull List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            if (str.startsWith("http")) {
                sb2.append(String.format("<script src=\"%s\"></script>", str));
            } else {
                sb2.append(str);
            }
        }
        return String.format("<!DOCTYPE HTML><html><head>%s</head></html>", sb2);
    }

    @NonNull
    public static Set<String> parseJsonArrayToSet(@Nullable JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                hashSet.add(jSONArray.getString(i10));
            }
        }
        return hashSet;
    }

    @Nullable
    @WorkerThread
    public static String readFromAssets(@NonNull Context context, @NonNull String str) {
        IOException e10;
        String str2;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            str2 = new String(bArr);
            try {
                POBLog.debug("POBUtils", "Successfully read file %s from bundle", str);
                return str2;
            } catch (IOException e11) {
                e10 = e11;
                POBLog.error("POBUtils", "Failed to read file %s from bundle with error: %s", str, e10);
                return str2;
            }
        } catch (IOException e12) {
            e10 = e12;
            str2 = null;
        }
    }

    public static boolean requiresQueryAllPackagesPermission() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @NonNull
    public static Context resolveWebViewContext(@NonNull Context context) {
        return context;
    }

    public static void runOnBackgroundThread(Runnable runnable) {
        POBTaskHandler.getInstance().runOnBackgroundThread(runnable);
    }

    public static void runOnMainThread(Runnable runnable) {
        POBTaskHandler.getInstance().runOnMainThread(runnable);
    }

    @RequiresApi(api = 30)
    public static void setSystemFitWindowsForEdgeToEdge(@NonNull final View view) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.pubmatic.sdk.common.utility.d
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return POBUtils.a(view, view2, windowInsetsCompat);
            }
        });
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) throws Exception {
        try {
            context.getApplicationContext().startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            POBLog.warn("POBUtils", "Activity not found %s", e10.getMessage());
            throw new ActivityNotFoundException();
        } catch (Exception e11) {
            POBLog.warn("POBUtils", "Error while starting activity %s", e11.getMessage());
            throw new Exception(e11);
        }
    }
}
