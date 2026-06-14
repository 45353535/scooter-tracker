package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.signals.SignalManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class gy {
    private static String bjy;
    private static final byte[] exu;
    private static final byte[] fs;
    public static Integer qdl;
    private static String rdp;
    private static final HashSet<String> rq;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final ExecutorService f17851ud = Executors.newSingleThreadExecutor();
    private static volatile boolean lnr = false;
    private static final AtomicInteger mml = new AtomicInteger(0);
    private static volatile String mzz = "";
    private static final ReentrantLock mo = new ReentrantLock();

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private static String f17852wd = null;
    private static String jpc = null;
    private static String tvp = null;
    private static final HashSet<String> to = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.gy$2, reason: invalid class name */
    static class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(gy.mzz)) {
                    com.bytedance.sdk.component.tvp.mo moVar = new com.bytedance.sdk.component.tvp.mo(com.bytedance.sdk.openadsdk.core.yt.qdl(), mo.lnr.USER_AGENT);
                    moVar.setWebViewClient(new mo.qdl());
                    String unused = gy.mzz = moVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.vu.qdl(moVar);
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "", e10);
            } catch (NoClassDefFoundError e11) {
                com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "", e11);
            }
        }
    }

    private static class lnr {
        private static final int qdl;

        static {
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i10 = 2;
            try {
                int i11 = RecyclerView.ViewHolder.f5382l;
                if (RecyclerView.ViewHolder.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i10 = 0;
                }
            } catch (ClassNotFoundException unused) {
                i10 = 1;
            } catch (NoSuchMethodException unused2) {
            }
            qdl = i10;
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i10)));
        }
    }

    public static class qdl implements Callable<String> {
        private final int qdl;

        qdl(int i10) {
            this.qdl = i10;
        }

        private synchronized String lnr() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.gy.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = gy.hzv();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", e10.getMessage());
            }
            return strArr[0];
        }

        private String ud() {
            String property;
            Throwable th2;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                                com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_ua_data", "android_system_ua", property);
                                return property;
                            }
                            com.bytedance.sdk.openadsdk.core.lnr.qdl().qdl("android_system_ua", property);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.bytedance.sdk.component.utils.aaj.lnr("getUA", "e:" + th2.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th4) {
                property = "unKnow";
                th2 = th4;
            }
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strUd;
            try {
                strUd = "unKnow";
                int i10 = this.qdl;
                if (i10 == 1) {
                    strUd = lnr();
                } else if (i10 == 2) {
                    strUd = ud();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return strUd;
        }
    }

    public static class ud {
        public final ComponentName qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public final int f17854ud;

        public ud(ComponentName componentName, int i10) {
            this.qdl = componentName;
            this.f17854ud = i10;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        rq = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        qdl = null;
        fs = new byte[]{108, 111, 97, 100, 105, 110, 103};
        exu = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static String aaj() {
        String strGsp = com.bytedance.sdk.openadsdk.core.settings.rq.gsp();
        if (!TextUtils.isEmpty(strGsp)) {
            return strGsp;
        }
        String strWc = com.bytedance.sdk.openadsdk.core.yt.mml().wc();
        return TextUtils.isEmpty(strWc) ? jyq.qdl() : strWc;
    }

    public static int bch() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (to.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 == null || !id2.startsWith("America/")) {
                return 3;
            }
            return !rq.contains(id2) ? 5 : 3;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", th2.toString());
            return 0;
        }
    }

    public static long bjy() {
        try {
            if (!fco()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", th2.getMessage());
            return 0L;
        }
    }

    public static boolean bqt() {
        return mml.get() == 1;
    }

    public static String exc() {
        String strZpu = com.bytedance.sdk.openadsdk.core.yt.mml().zpu();
        if (!TextUtils.isEmpty(strZpu)) {
            return strZpu;
        }
        String strQdl = jyq.qdl();
        if (TextUtils.isEmpty(strQdl)) {
            return strZpu;
        }
        return DtbConstants.HTTPS + strQdl + "/service/2/dual_events/";
    }

    public static long exu() {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("free_internal_storage", 0L).longValue();
    }

    private static boolean fco() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long fs() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String hzv() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.yt.qdl());
            webView.setWebViewClient(new mo.qdl());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_ua_data", "webview_ua", userAgentString);
                    return userAgentString;
                }
                com.bytedance.sdk.openadsdk.core.lnr.qdl().qdl("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("getUA", "e:" + th2.getMessage());
            return "unKnow";
        }
    }

    public static String jl() {
        String strAg = com.bytedance.sdk.openadsdk.core.yt.mml().ag();
        return TextUtils.isEmpty(strAg) ? jyq.qdl() : strAg;
    }

    public static synchronized String jpc() {
        try {
            if (TextUtils.isEmpty(tvp) && com.bytedance.sdk.openadsdk.core.yt.qdl() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.yt.qdl().getPackageManager().getPackageInfo(mo(), 0);
                    jpc = String.valueOf(packageInfo.versionCode);
                    tvp = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return tvp;
    }

    public static int jtx() {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("is_root", -1);
    }

    public static String jyq() {
        return String.format(Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String koa() {
        String str = rdp;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(fs);
        rdp = str2;
        return str2;
    }

    public static String ljh() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static String lnr(int i10) {
        return i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 == 4) ? "open_ad" : i10 != 7 ? i10 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : com.appodeal.ads.modules.common.internal.Constants.REWARDED_VIDEO : "interaction" : "banner_ad";
    }

    public static boolean mml(int i10) {
        return i10 == 4;
    }

    public static boolean mo(int i10) {
        return i10 == 6;
    }

    public static boolean mzz(int i10) {
        return i10 == 5;
    }

    public static String oth() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static void qdl(@NonNull com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, @NonNull View view) {
    }

    public static int rc() {
        return lnr.qdl;
    }

    public static long rdp() {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("total_sdcard_storage", 0L).longValue();
    }

    public static String to() {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("total_memory", "0");
    }

    public static String tvp() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.yt.qdl().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean ud(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.ud.qdl(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static int uw() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String vu() {
        String str = bjy;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(exu);
        bjy = str2;
        return str2;
    }

    public static int wd(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 != 6) {
            return i10;
        }
        return 5;
    }

    public static String xmv() {
        int i10 = -uw();
        return i10 >= 0 ? "Etc/GMT+".concat(String.valueOf(i10)) : "Etc/GMT".concat(String.valueOf(i10));
    }

    public static boolean yt() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean mml(Context context) {
        return false;
    }

    public static synchronized String mo() {
        Context contextQdl;
        try {
            if (TextUtils.isEmpty(f17852wd) && (contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl()) != null) {
                try {
                    f17852wd = contextQdl.getPackageName();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f17852wd;
    }

    public static String mzz() {
        return uw.qdl();
    }

    public static String rq() {
        return lnr("MemTotal");
    }

    public static void to(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.aaj.lnr("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    public static synchronized String wd() {
        try {
            if (TextUtils.isEmpty(jpc) && com.bytedance.sdk.openadsdk.core.yt.qdl() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.yt.qdl().getPackageManager().getPackageInfo(mo(), 0);
                    jpc = String.valueOf(packageInfo.versionCode);
                    tvp = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return jpc;
    }

    public static String mml() {
        if (!TextUtils.isEmpty(mzz)) {
            return mzz;
        }
        com.bytedance.sdk.openadsdk.multipro.lnr.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl());
        String strQdl = com.bytedance.sdk.openadsdk.core.tvp.qdl("sdk_local_web_ua", SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        mzz = strQdl;
        if (TextUtils.isEmpty(strQdl)) {
            ReentrantLock reentrantLock = mo;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(mzz)) {
                            mzz = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.yt.qdl());
                        }
                        com.bytedance.sdk.openadsdk.core.tvp.qdl("sdk_local_web_ua", mzz);
                        reentrantLock.unlock();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "", e10);
                    } catch (NoClassDefFoundError e11) {
                        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "", e11);
                    }
                }
            } finally {
                mo.unlock();
            }
        }
        return mzz;
    }

    public static String mzz(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.yt.mml().om();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? DtbConstants.HTTPS.concat(str) : str;
    }

    public static Intent qdl(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static int to(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = qdl;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        qdl = Integer.valueOf(size);
        return size;
    }

    private static String fs(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", wd()).toString();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", e10.getMessage());
            return str;
        }
    }

    public static void lnr() {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.utils.gy.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", gy.rc());
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("recycle_version_not_valid").ud(jSONObject.toString());
            }
        });
    }

    public static boolean mo(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean tvp(String str) {
        if (com.bytedance.sdk.openadsdk.core.rdp.mzz()) {
            return true;
        }
        com.bytedance.sdk.component.utils.aaj.lnr("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    public static String ud(int i10) {
        if (i10 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i10 == 2) {
            return "banner_ad_landingpage";
        }
        if (i10 == 3) {
            return "interaction_landingpage";
        }
        if (i10 == 4) {
            return "splash_ad_landingpage";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static String lnr(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static boolean mzz(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    @NonNull
    public static ud qdl(Context context, Intent intent) {
        return new ud(null, 0);
    }

    public static void tvp(Context context) {
        try {
            AtomicInteger atomicInteger = mml;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl().lnr();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            mml.set(2);
        }
    }

    public static void jpc(final String str) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl();
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("reportMultiLog", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.utils.gy.3
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                if (gy.lnr || !com.bytedance.sdk.openadsdk.core.yt.mml().dk()) {
                    return null;
                }
                boolean unused = gy.lnr = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", str);
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("reportMultiLog").ud(jSONObject.toString());
            }
        });
    }

    public static int mo(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", th2.getMessage());
            return -1;
        }
    }

    public static boolean qdl() {
        return (com.bytedance.sdk.openadsdk.core.bjy.qdl() == null || com.bytedance.sdk.openadsdk.core.bjy.qdl().mml()) ? false : true;
    }

    public static int jpc(Context context) {
        return wd(com.bytedance.sdk.component.utils.bqt.qdl(context, 0L));
    }

    public static String qdl(int i10) {
        if (i10 == 1) {
            return "embeded_ad";
        }
        if (i10 == 2) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "interaction";
        }
        if (i10 == 4) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return null;
        }
        return com.appodeal.ads.modules.common.internal.Constants.REWARDED_VIDEO;
    }

    public static String wd(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static boolean jpc(int i10) {
        if (i10 <= 0) {
            return false;
        }
        return i10 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i10;
    }

    public static int ud(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null) {
            return -1;
        }
        int iVz = ljhVar.vz();
        int i10 = 1;
        if (iVz == 1) {
            return 2;
        }
        if (iVz == 3) {
            return 4;
        }
        if (iVz != 5) {
            i10 = 7;
            if (iVz != 7) {
                return iVz != 8 ? -1 : 5;
            }
        }
        return i10;
    }

    public static String ud() {
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.lnr.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl());
        try {
            String strUd = com.bytedance.sdk.openadsdk.multipro.ud.lnr() ? com.bytedance.sdk.openadsdk.multipro.mml.qdl.ud("sp_multi_ua_data", "android_system_ua", "unKnow") : com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("android_system_ua", "unKnow");
            if (strUd != null && !"unKnow".equals(strUd)) {
                return strUd;
            }
            FutureTask futureTask = new FutureTask(new qdl(2));
            f17851ud.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        com.bytedance.sdk.component.utils.aaj.lnr("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static long wd(Context context) {
        int i10 = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = context.getApplicationInfo().minSdkVersion;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", th2.getMessage());
        }
        return i10;
    }

    public static String qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null) {
            return null;
        }
        try {
            return lnr(ljhVar.vz());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String mml(String str) {
        return qdl(str, false, false);
    }

    public static boolean mml(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        return ljhVar != null && ljhVar.ygv() == 3 && ljhVar.se() && (ljhVar.fge() == 4 || ljhVar.fge() == 5);
    }

    public static int qdl(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static String qdl(Context context) {
        String strUd = com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("total_memory", (String) null);
        if (strUd != null && ud(strUd) > 0) {
            return strUd;
        }
        String strLnr = lnr("MemTotal");
        if (ud(strLnr) <= 0) {
            strLnr = tvp();
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl().qdl("total_memory", strLnr);
        return strLnr;
    }

    public static String lnr(@NonNull Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static long ud(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String qdl(@NonNull String str, boolean z10, boolean z11) {
        String strJl;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z11) {
            strJl = aaj();
        } else {
            strJl = jl();
        }
        if (TextUtils.isEmpty(strJl)) {
            strJl = "api16-access-ttp.tiktokpangle.us";
        }
        String strQdl = DtbConstants.HTTPS + strJl + str;
        if (hzv.qdl() && !z10) {
            strQdl = hzv.qdl(strQdl);
        }
        return z10 ? fs(strQdl) : strQdl;
    }

    public static long ud(Context context) {
        return com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("total_internal_storage", 0L).longValue();
    }

    public static boolean lnr(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null) {
            return true;
        }
        int iUd = com.bytedance.sdk.openadsdk.core.yt.mml().ud(ljhVar.fz());
        int iLnr = com.bytedance.sdk.component.utils.jl.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl());
        if (iUd == 1) {
            return mml(iLnr);
        }
        if (iUd == 2) {
            return mzz(iLnr) || mml(iLnr) || mo(iLnr);
        }
        if (iUd != 3) {
            return iUd != 5 || mml(iLnr) || mo(iLnr);
        }
        return false;
    }

    public static JSONObject qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, long j10, com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
        if (ljhVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", ljhVar.yre());
            jSONObject.put("buffers_time", j10);
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
            if (udVarTdy != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, udVarTdy.mzz());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, udVarTdy.tvp());
            }
            qdl(jSONObject, qdlVar);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ToolUtils", "getVideoAction json error", e10);
            return jSONObject;
        }
    }

    private static void qdl(JSONObject jSONObject, com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || qdlVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(qdlVar.mml()), Integer.valueOf(qdlVar.mzz())));
        } catch (Throwable unused) {
        }
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str) {
        if (ljhVar != null) {
            try {
                String strOd = ljhVar.od();
                if (TextUtils.isEmpty(strOd) && ljhVar.bo() != null && ljhVar.bo().lnr() == 1 && !TextUtils.isEmpty(ljhVar.bo().ud())) {
                    strOd = ljhVar.bo().ud();
                }
                String str2 = strOd;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.fco.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), str2, ljhVar, qdl(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void qdl(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !mzz(context)) {
            return;
        }
        int length = str2.length();
        int i11 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i12 = 3572;
        int i13 = 0;
        while (i11 <= i10) {
            if (i12 < length) {
                Log.d(str, i10 + TokenBuilder.TOKEN_DELIMITER + i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + str2.substring(i13, i12));
                i11++;
                i13 = i12;
                i12 += 3572;
            } else {
                Log.d(str, i10 + TokenBuilder.TOKEN_DELIMITER + i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + str2.substring(i13));
                return;
            }
        }
    }

    public static void qdl(StringBuilder sb2, String str, String str2) {
        int iIndexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (iIndexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.mml qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, com.bytedance.sdk.component.tvp.mo moVar, Context context, String str) {
        int iFge = ljhVar.fge();
        if (!ljhVar.se()) {
            return null;
        }
        if (iFge != 1 && iFge != 3) {
            return null;
        }
        moVar.qdl(true, (View) new com.bytedance.sdk.openadsdk.common.lnr(context));
        return new com.bytedance.sdk.openadsdk.common.mml(ljhVar, moVar, str, false);
    }

    public static void qdl(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairMml = com.bytedance.sdk.openadsdk.core.tvp.mml("oem_store");
            int i10 = -1;
            if (pairMml != null && ((iIntValue = Integer.valueOf((String) pairMml.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairMml.second).longValue() < com.bytedance.sdk.openadsdk.jyq.qdl.qdl("oem_store_state_time", 259200000))) {
                i10 = iIntValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", th2.getMessage());
        }
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, com.bytedance.sdk.component.tvp.mo moVar) {
        qdl(ljhVar, moVar, false);
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, com.bytedance.sdk.component.tvp.mo moVar, boolean z10) {
        com.bytedance.sdk.component.tvp.mo moVar2;
        com.bytedance.sdk.openadsdk.core.model.jpc jpcVarJyq;
        List<Integer> list;
        if (ljhVar == null || moVar == null) {
            return;
        }
        int iFge = ljhVar.fge();
        if (!ljhVar.se() || (!(iFge == 2 || iFge == 3 || iFge == 5) || (jpcVarJyq = ljhVar.jyq()) == null)) {
            moVar2 = moVar;
        } else {
            List<Integer> listMo = jpcVarJyq.mo();
            ArrayList arrayList = new ArrayList();
            if (z10) {
                for (int i10 = 0; i10 < listMo.size(); i10++) {
                    arrayList.add(Integer.valueOf(listMo.get(i10).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listMo;
            }
            moVar2 = moVar;
            moVar2.qdl(true, jpcVarJyq.mml(), jpcVarJyq.mzz(), list, jpcVarJyq.wd(), jpcVarJyq.lnr());
        }
        int iHoh = ljhVar.hoh();
        long jUv = ljhVar.uv();
        if ((iHoh == 1 || iHoh == 2) && jUv > 0) {
            moVar2.qdl(iHoh, jUv);
        }
    }

    public static int qdl(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.ToolUtils", th2.toString());
            return -1;
        }
    }

    public static JSONObject qdl(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
