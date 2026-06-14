package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.compose.animation.core.c;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.fid.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jpc {
    private static final AtomicReference<Boolean> qdl = new AtomicReference<>(null);

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final AtomicReference<String> f17856ud = new AtomicReference<>(null);

    private static boolean jpc(Context context) {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static String lnr(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int mml(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static PackageInfo mo(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : rq(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String mzz(Context context) {
        try {
            AtomicReference<String> atomicReference = f17856ud;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoMo = mo(context);
            String str2 = packageInfoMo != null ? packageInfoMo.versionName : "";
            c.a(atomicReference, null, str2);
            return str2;
        } catch (Throwable unused) {
            c.a(f17856ud, null, "");
            return "";
        }
    }

    public static void qdl(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ud()) {
                com.bytedance.sdk.openadsdk.core.lnr lnrVarQdl = com.bytedance.sdk.openadsdk.core.lnr.qdl();
                lnrVarQdl.qdl("w_ver", mzz(context));
                lnrVarQdl.qdl("bp", ud(context));
                lnrVarQdl.qdl("is_fold", wd(context) ? 1 : 0);
                lnrVarQdl.qdl("abi", qdl());
                lnrVarQdl.qdl("t_ver", lnr(context));
                lnrVarQdl.qdl(CampaignEx.JSON_KEY_AAB, mml(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static PackageInfo rq(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", null).invoke(null, null) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean to(Context context) {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean tvp(Context context) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static int ud(Context context) {
        if (jpc(context)) {
            return 1;
        }
        if (tvp(context)) {
            return 2;
        }
        return to(context) ? 3 : 4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean wd(android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.jpc.wd(android.content.Context):boolean");
    }

    private static boolean mml() {
        if (rq()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {Reporting.EventType.WINNER, "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 12; i10++) {
                    if (lowerCase.contains(strArr2[i10])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i11 = 0; i11 < 12; i11++) {
                if (lowerCase2.contains(strArr[i11])) {
                    return true;
                }
            }
            if (ud()) {
                String strQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strQdl)) {
                    return false;
                }
                for (String str : strQdl.split(StringUtils.COMMA)) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean jpc() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "isXiaomiFold return false " + th2.getMessage());
            return false;
        }
    }

    public static String lnr() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("fold_config", "fold_default", "");
    }

    private static boolean to() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException e10) {
            e = e10;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (IllegalAccessException e11) {
            e = e11;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (NoSuchMethodException e12) {
            e = e12;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (InvocationTargetException e13) {
            e = e13;
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean tvp() {
        if (to()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 9; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (ud()) {
                    String strLnr = lnr();
                    if (TextUtils.isEmpty(strLnr)) {
                        return false;
                    }
                    for (String str : strLnr.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean ud() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("fold_config", a.f44111j, 0) == 1;
    }

    private static boolean mzz() {
        if (jpc()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 6; i10++) {
                    if (lowerCase.contains(strArr[i10])) {
                        return true;
                    }
                }
                if (ud()) {
                    String strLnr = lnr();
                    if (TextUtils.isEmpty(strLnr)) {
                        return false;
                    }
                    for (String str : strLnr.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean mo() {
        if (wd()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 7; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (ud()) {
                    String strLnr = lnr();
                    if (TextUtils.isEmpty(strLnr)) {
                        return false;
                    }
                    for (String str : strLnr.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean rq() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            if ("TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"))) {
                return true;
            }
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.aaj.lnr("PAG_BANNER", "get ss fold device error: " + e10.getMessage());
            return false;
        }
    }

    public static String qdl() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void qdl(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ud()) {
                com.bytedance.sdk.openadsdk.core.lnr lnrVarQdl = com.bytedance.sdk.openadsdk.core.lnr.qdl();
                String strUd = lnrVarQdl.ud("md", com.bytedance.sdk.openadsdk.core.tvp.ud().wd());
                if (!TextUtils.isEmpty(strUd)) {
                    jSONObject.put("md", strUd);
                }
                int iUd = lnrVarQdl.ud("bp", ud(context));
                if (iUd != 4) {
                    jSONObject.put("bp", iUd);
                }
                String strUd2 = lnrVarQdl.ud("t_ver", lnr(context));
                if (!TextUtils.isEmpty(strUd2)) {
                    jSONObject.put("t_ver", strUd2);
                }
                jSONObject.put("is_fold", lnrVarQdl.ud("is_fold", wd(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, lnrVarQdl.ud(CampaignEx.JSON_KEY_AAB, mml(context)));
                String strUd3 = lnrVarQdl.ud("w_ver", mzz(context));
                if (!TextUtils.isEmpty(strUd3)) {
                    jSONObject.put("w_ver", strUd3);
                }
                String strUd4 = lnrVarQdl.ud("abi", qdl());
                if (TextUtils.isEmpty(strUd4)) {
                    return;
                }
                jSONObject.put("abi", strUd4);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean wd() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("BED", "isVIVOFoldDevice return false " + th2.getMessage());
            return false;
        }
    }
}
