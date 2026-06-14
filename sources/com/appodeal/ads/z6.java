package com.appodeal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.security.NetworkSecurityPolicy;
import android.view.View;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z6 {
    public static Rect a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (AdType adType : f6.b(i10)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(adType.getDisplayName());
        }
        return sb2.toString();
    }

    public static String c(Context context) {
        Object obj;
        try {
            try {
                Class.forName(new String[]{"com.google.android.gms.common.GoogleApiAvailabilityLight"}[0], false, h2.class.getClassLoader());
                int i10 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                Field declaredField = GoogleApiAvailabilityLight.class.getDeclaredField("GOOGLE_PLAY_SERVICES_VERSION_CODE");
                declaredField.setAccessible(true);
                obj = declaredField.isAccessible() ? declaredField.get(null) : null;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            }
            int iIntValue = obj != null ? ((Integer) obj).intValue() : -1;
            if (iIntValue == -1) {
                iIntValue = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.google.android.gms.version");
            }
            return String.valueOf(iIntValue);
        } catch (Throwable th2) {
            Log.log(LogConstants.KEY_SDK, "PlayServicesVersion", "Failed to receive PlayServicesVersion: " + th2.getMessage());
            return "not-found";
        }
    }

    public static String d(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(str.length());
            Matcher matcher = Pattern.compile("_(.)").matcher(str);
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, matcher.group(1).toUpperCase(Locale.ENGLISH));
            }
            matcher.appendTail(stringBuffer);
            stringBuffer.setCharAt(0, Character.toUpperCase(str.charAt(0)));
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String e(JSONObject jSONObject, String str, String str2) {
        return (jSONObject == null || jSONObject.isNull(str)) ? str2 : jSONObject.optString(str, str2);
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
    }

    public static boolean g() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static String h(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
