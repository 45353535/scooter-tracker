package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.C4240b4;
import com.ironsource.C4462o4;
import com.ironsource.C4500q8;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.Yd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45403a = "SDKUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f45404b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f45405c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f45406d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f45407e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f45408f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f45409g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Map<String, String> f45410h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f45411i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f45412j = new AtomicInteger(1);

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f45412j;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C4462o4.d().a(e10);
            Logger.d(f45403a, "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((j10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        } catch (UnsupportedEncodingException e10) {
            e = e10;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            messageDigest = null;
        }
        try {
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e12) {
            e = e12;
            C4462o4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            C4462o4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(Yd yd2) {
        return fetchDemandSourceId(yd2.a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    Logger.i(f45403a, "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        return z10 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f45404b;
    }

    public static String getControllerConfig() {
        return f45409g;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f45407e) ? f45407e : !TextUtils.isEmpty(f45406d) ? f45406d : "";
    }

    public static int getDebugMode() {
        return f45408f;
    }

    public static String getFileName(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f45410h;
    }

    public static String getLimitAdTracking() {
        return f45405c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e10) {
            C4462o4.d().a(e10);
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C4240b4.d.f42549b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C4240b4.a.f42497b);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(interfaceC4634y7I.z(context)));
            return jSONObject;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static C4500q8.e getProductType(String str) {
        C4500q8.e eVar = C4500q8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4500q8.e eVar2 = C4500q8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.1.0";
    }

    public static String getTesterParameters() {
        return f45411i;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState)) {
                return true;
            }
            return "mounted_ro".equals(externalStorageState);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        String strI = interfaceC4634y7I.I(context);
        String strB = interfaceC4634y7I.b(context);
        if (!TextUtils.isEmpty(strI)) {
            f45404b = strI;
        }
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        f45405c = strB;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map2 : mapArr) {
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
        }
        return map;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((j10 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f45409g = str;
        Ib.O().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f45406d = str;
    }

    public static void setCustomControllerUrl(String str) {
        f45407e = str;
    }

    public static void setDebugMode(int i10) {
        f45408f = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f45410h = map;
    }

    public static void setTesterParameters(String str) {
        f45411i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 == 0) {
            return "landscape";
        }
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 == 11) {
            return "landscape";
        }
        if (i10 == 12) {
            return "portrait";
        }
        switch (i10) {
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

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f45409g);
            jSONObject2.put(str, jSONObject);
            f45409g = jSONObject2.toString();
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            Logger.i(f45403a, "Unable to update controllerConfigs: " + e10.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }
}
