package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1sSDK;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFg1qSDK implements AFg1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f15604i = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f15605w;

    @NotNull
    private final AFg1sSDK AFAdRevenueData;

    @NotNull
    private final Lazy AFKeystoreWrapper;

    @NotNull
    private final AFc1pSDK areAllFieldsValid;

    @NotNull
    private final AFc1oSDK component1;

    @NotNull
    private final AFg1vSDK component2;

    @NotNull
    private final AFh1tSDK component3;

    @NotNull
    private final AFi1sSDK component4;

    @NotNull
    private final AFf1cSDK copy;

    @NotNull
    private final Lazy copydefault;

    @NotNull
    private final AFc1gSDK equals;

    @NotNull
    private final AFi1lSDK getCurrencyIso4217Code;

    @NotNull
    private final Context getMediationNetwork;

    @NotNull
    private final AFj1pSDK getMonetizationNetwork;

    @NotNull
    private final String getRevenue;

    @NotNull
    private final AFg1xSDK hashCode;

    @NotNull
    private final AFc1eSDK toString;
    private static char[] AFInAppEventType = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int AFLogger = 1912311267;
    private static boolean AFInAppEventParameterName = true;
    private static boolean registerClient = true;

    public AFg1qSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFg1sSDK aFg1sSDK, @NotNull AFj1pSDK aFj1pSDK, @NotNull AFg1vSDK aFg1vSDK, @NotNull AFh1tSDK aFh1tSDK, @NotNull AFc1oSDK aFc1oSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFi1sSDK aFi1sSDK, @NotNull AFf1cSDK aFf1cSDK, @NotNull AFc1gSDK aFc1gSDK, @NotNull AFg1xSDK aFg1xSDK, @NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1sSDK, "");
        Intrinsics.checkNotNullParameter(aFj1pSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFi1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1cSDK, "");
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.getRevenue = str;
        this.getMediationNetwork = context;
        this.getCurrencyIso4217Code = aFi1lSDK;
        this.AFAdRevenueData = aFg1sSDK;
        this.getMonetizationNetwork = aFj1pSDK;
        this.component2 = aFg1vSDK;
        this.component3 = aFh1tSDK;
        this.component1 = aFc1oSDK;
        this.areAllFieldsValid = aFc1pSDK;
        this.component4 = aFi1sSDK;
        this.copy = aFf1cSDK;
        this.equals = aFc1gSDK;
        this.hashCode = aFg1xSDK;
        this.toString = aFc1eSDK;
        this.copydefault = lf.i.a(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1qSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = lf.i.a(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1qSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private final void AFAdRevenueData(Map<String, Object> map) {
        try {
            long jLongValue = ((Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i10 = f15604i + 15;
            f15605w = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e10);
        }
    }

    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j10 = this.component3.hashCode;
        if (j10 != 0) {
            f15605w = (f15604i + 41) % 128;
            map.put("prev_session_dur", Long.valueOf(j10));
            f15604i = (f15605w + 31) % 128;
        }
        f15605w = (f15604i + 111) % 128;
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -2015365334, 2015365335, System.identityHashCode(this));
    }

    private static void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        int i10 = f15605w + 41;
        f15604i = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1zSDK.getMonetizationNetwork();
            AFa1zSDK.getRevenue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        Object monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        String revenue = AFa1zSDK.getRevenue();
        if (monetizationNetwork == null || revenue == null || Integer.parseInt(revenue) <= 0) {
            return;
        }
        f15605w = (f15604i + 57) % 128;
        map.put("reinstallCounter", revenue);
        map.put("originalAppsflyerId", monetizationNetwork);
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            f15605w = (f15604i + 39) % 128;
            if (string.length() == 0) {
                return;
            }
            f15605w = (f15604i + 117) % 128;
            map.put(AppsFlyerProperties.EXTENSION, string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:20:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r10, java.lang.String r11, int[] r12, int r13, java.lang.Object[] r14) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.a(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        String revenue;
        Intrinsics.checkNotNullParameter(map, "");
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            f15604i = (f15605w + 113) % 128;
            try {
                this.getMediationNetwork.getPackageManager().getApplicationInfo(FbValidationUtils.FB_PACKAGE, 0);
                revenue = this.areAllFieldsValid.getRevenue(this.getMediationNetwork);
                f15605w = (f15604i + 105) % 128;
            } catch (Throwable unused) {
                revenue = null;
            }
            if (revenue != null) {
                f15605w = (f15604i + 119) % 128;
                map.put("fb", revenue);
            }
        }
    }

    private static long areAllFieldsValid() {
        f15604i = (f15605w + 121) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        f15604i = (f15605w + 3) % 128;
        return jCurrentTimeMillis;
    }

    @VisibleForTesting
    private void component1(@NotNull Map<String, Object> map) {
        f15604i = (f15605w + 53) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        AFf1cSDK.getMonetizationNetwork(map, this.areAllFieldsValid);
        int i10 = f15604i + 43;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Nullable
    private String component2() {
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            f15604i = (f15605w + 75) % 128;
            string = getCurrencyIso4217Code("AF_STORE");
        }
        int i10 = f15604i + 95;
        f15605w = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        f15604i = (f15605w + 85) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (aFg1qSDK.getMonetizationNetwork().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return null;
        }
        String mediationNetwork = aFg1qSDK.copy.getMediationNetwork(aFg1qSDK.component1);
        if (mediationNetwork != null && mediationNetwork.length() != 0) {
            int i10 = f15605w + 87;
            f15604i = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("imei", mediationNetwork);
                int i11 = 7 / 0;
            } else {
                map.put("imei", mediationNetwork);
            }
        }
        String revenue = aFg1qSDK.getRevenue(str);
        if (revenue != null) {
            int i12 = f15605w + 43;
            f15604i = i12 % 128;
            if (i12 % 2 == 0) {
                aFg1qSDK.component1.AFAdRevenueData("androidIdCached", revenue);
                map.put("android_id", revenue);
                int i13 = 37 / 0;
            } else {
                aFg1qSDK.component1.AFAdRevenueData("androidIdCached", revenue);
                map.put("android_id", revenue);
            }
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1mSDK currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(aFg1qSDK.getMediationNetwork);
        if (currencyIso4217Code != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = currencyIso4217Code.getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = currencyIso4217Code.getCurrencyIso4217Code;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = currencyIso4217Code.getRevenue;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put(CommonUrlParts.HUAWEI_OAID, linkedHashMap);
        }
        return null;
    }

    private boolean component4() {
        f15605w = (f15604i + 59) % 128;
        boolean z10 = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", null));
        f15605w = (f15604i + 69) % 128;
        return z10;
    }

    private final void copy(Map<String, Object> map) {
        UiModeManager uiModeManager;
        int i10 = f15605w + 19;
        f15604i = i10 % 128;
        if (i10 % 2 != 0 || Build.VERSION.SDK_INT >= 117) {
            uiModeManager = (UiModeManager) this.getMediationNetwork.getSystemService(UiModeManager.class);
        } else {
            Object systemService = this.getMediationNetwork.getSystemService("uimode");
            uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        }
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        map.put("tv", Boolean.TRUE);
        f15604i = (f15605w + 63) % 128;
    }

    private void copydefault(@NotNull Map<String, Object> map) {
        long seconds;
        TimeUnit timeUnit;
        long j10;
        Intrinsics.checkNotNullParameter(map, "");
        long currencyIso4217Code = this.component1.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.component1.getRevenue("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (currencyIso4217Code > 0) {
            int i10 = f15605w + 121;
            f15604i = i10 % 128;
            if (i10 % 2 == 0) {
                timeUnit = TimeUnit.MILLISECONDS;
                j10 = jCurrentTimeMillis % currencyIso4217Code;
            } else {
                timeUnit = TimeUnit.MILLISECONDS;
                j10 = jCurrentTimeMillis - currencyIso4217Code;
            }
            seconds = timeUnit.toSeconds(j10);
        } else {
            f15605w = (f15604i + 13) % 128;
            seconds = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private void d(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getRevenue("is_stop_tracking_used")) {
            f15604i = (f15605w + 49) % 128;
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
            f15604i = (f15605w + 79) % 128;
        }
        int i10 = f15604i + 125;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1qSDK.f15605w
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.f15604i = r1
            int r0 = r0 % 2
            java.lang.String r1 = "didConfigureTokenRefreshService="
            java.lang.String r2 = ""
            if (r0 != 0) goto L34
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            android.content.Context r0 = r3.getMediationNetwork
            boolean r0 = com.appsflyer.internal.AFg1tSDK.getMediationNetwork(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            r1 = 45
            int r1 = r1 / 0
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L51
            goto L6c
        L34:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            android.content.Context r0 = r3.getMediationNetwork
            boolean r0 = com.appsflyer.internal.AFg1tSDK.getMediationNetwork(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            if (r0 != 0) goto L6c
        L51:
            int r0 = com.appsflyer.internal.AFg1qSDK.f15604i
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.f15605w = r1
            int r0 = r0 % 2
            java.lang.String r1 = "tokenRefreshConfigured"
            if (r0 != 0) goto L65
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.put(r1, r0)
            goto L6c
        L65:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.put(r1, r0)
            r4 = 0
            throw r4
        L6c:
            com.appsflyer.internal.AFc1oSDK r0 = r3.component1
            boolean r0 = com.appsflyer.internal.AFg1tSDK.getCurrencyIso4217Code(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "registeredUninstall"
            r4.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.e(java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void equals(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1qSDK.f15605w
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.f15604i = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L19
            com.appsflyer.AppsFlyerProperties r0 = r3.getMonetizationNetwork()
            boolean r0 = r0.isOtherSdkStringDisabled()
            int r2 = r1 / 0
            if (r0 != 0) goto L36
            goto L23
        L19:
            com.appsflyer.AppsFlyerProperties r0 = r3.getMonetizationNetwork()
            boolean r0 = r0.isOtherSdkStringDisabled()
            if (r0 != 0) goto L36
        L23:
            com.appsflyer.internal.AFg1sSDK r0 = r3.AFAdRevenueData
            android.content.Context r2 = r3.getMediationNetwork
            com.appsflyer.internal.AFg1sSDK$AFa1uSDK r0 = r0.AFAdRevenueData(r2)
            float r0 = r0.getRevenue
            java.lang.String r2 = "batteryLevel"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r2, r0)
        L36:
            int r4 = com.appsflyer.internal.AFg1qSDK.f15604i
            int r4 = r4 + 69
            int r0 = r4 % 128
            com.appsflyer.internal.AFg1qSDK.f15605w = r0
            int r4 = r4 % r1
            if (r4 != 0) goto L42
            return
        L42:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.equals(java.util.Map):void");
    }

    private final void getCurrencyIso4217Code(Map<String, Object> map, int i10) {
        f15605w = (f15604i + 75) % 128;
        try {
            if (this.areAllFieldsValid.n_().versionCode > this.component1.getMediationNetwork("versionCode", 0)) {
                f15605w = (f15604i + 39) % 128;
                this.component1.getRevenue("versionCode", this.areAllFieldsValid.n_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.areAllFieldsValid.n_().versionCode));
            map.put(CommonUrlParts.APP_VERSION, this.areAllFieldsValid.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.areAllFieldsValid.getRevenue.getRevenue.getApplicationInfo().targetSdkVersion));
            map.put("date1", getMediationNetwork().format(new Date(((Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this))).longValue())));
            map.put("date2", getMediationNetwork().format(new Date(this.areAllFieldsValid.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a(null, "\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 126 - TextUtils.lastIndexOf("", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat mediationNetwork = getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            map.put(strIntern, getCurrencyIso4217Code(mediationNetwork, i10));
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.getMediationNetwork(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private final AppsFlyerProperties getMonetizationNetwork() {
        int i10 = f15604i + 79;
        f15605w = i10 % 128;
        if (i10 % 2 == 0) {
            return (AppsFlyerProperties) this.copydefault.getValue();
        }
        int i11 = 88 / 0;
        return (AppsFlyerProperties) this.copydefault.getValue();
    }

    private void hashCode(@NotNull Map<String, Object> map) {
        int i10 = f15605w + 101;
        f15604i = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        AFb1mSDK aFb1mSDKL_;
        int i10 = f15604i + 57;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            aFb1mSDKL_ = AFb1kSDK.l_(this.getMediationNetwork.getContentResolver());
            int i11 = 54 / 0;
            if (aFb1mSDKL_ == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            aFb1mSDKL_ = AFb1kSDK.l_(this.getMediationNetwork.getContentResolver());
            if (aFb1mSDKL_ == null) {
                return;
            }
        }
        f15604i = (f15605w + 97) % 128;
        map.put("amazon_aid", aFb1mSDKL_.getCurrencyIso4217Code);
        map.put("amazon_aid_limit", String.valueOf(aFb1mSDKL_.getRevenue));
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        f15604i = (f15605w + 51) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.areAllFieldsValid.getMediationNetwork(this.getMediationNetwork)));
        int i10 = f15605w + 91;
        f15604i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private final void toString(Map<String, Object> map) {
        int i10 = f15604i + 117;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            AFg1kSDK.AFAdRevenueData(this.getMediationNetwork);
            throw null;
        }
        if (AFg1kSDK.AFAdRevenueData(this.getMediationNetwork)) {
            map.put("inst_app", Boolean.TRUE);
            f15604i = (f15605w + 29) % 128;
        }
    }

    private static void unregisterClient(@NotNull Map<String, Object> map) {
        getMediationNetwork(new Object[]{map}, -43428876, 43428885, (int) System.currentTimeMillis());
    }

    private void w(@NotNull Map<String, Object> map) {
        int i10 = f15604i + 31;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copy.getMediationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.copy.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.length() == 0) {
            return;
        }
        int i11 = f15605w + 83;
        f15604i = i11 % 128;
        if (i11 % 2 != 0) {
            map.put("appsflyerKey", mediationNetwork);
        } else {
            map.put("appsflyerKey", mediationNetwork);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getRevenue(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1pSDK aFi1pSDK = this.component4.getMediationNetwork;
        AFi1tSDK aFi1tSDKAFAdRevenueData = aFi1pSDK != null ? aFi1pSDK.AFAdRevenueData() : null;
        if (aFi1tSDKAFAdRevenueData != null) {
            map.put("network", aFi1tSDKAFAdRevenueData.getRevenue);
            map.put("ivc", Boolean.valueOf(aFi1tSDKAFAdRevenueData.getCurrencyIso4217Code()));
            if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                f15605w = (f15604i + 95) % 128;
            } else {
                f15605w = (f15604i + 89) % 128;
                String str = aFi1tSDKAFAdRevenueData.getCurrencyIso4217Code;
                if (str != null) {
                    map.put("operator", str);
                }
                String str2 = aFi1tSDKAFAdRevenueData.getMediationNetwork;
                if (str2 != null) {
                    map.put(N6.Q0, str2);
                    return;
                }
            }
            int i10 = f15604i + 7;
            f15605w = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFh1tSDK aFh1tSDK = aFg1qSDK.component3;
        HashMap map2 = new HashMap(aFh1tSDK.AFAdRevenueData);
        aFh1tSDK.AFAdRevenueData.clear();
        aFh1tSDK.getCurrencyIso4217Code.getCurrencyIso4217Code("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            f15605w = (f15604i + 29) % 128;
            return null;
        }
        int i10 = (f15604i + 111) % 128;
        f15605w = i10;
        int i11 = i10 + 31;
        f15604i = i11 % 128;
        if (i11 % 2 != 0) {
            Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork((Map<String, Object>) map);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("gcd", map2);
            return null;
        }
        Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork((Map<String, Object>) map);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
        monetizationNetwork2.put("gcd", map2);
        int i12 = 88 / 0;
        return null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i10 = f15604i + 107;
        f15605w = i10 % 128;
        try {
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e10);
        }
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put(N6.f41413q, Locale.getDefault().getDisplayLanguage());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put(N6.f41413q, Locale.getDefault().getDisplayLanguage());
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            f15604i = (f15605w + 51) % 128;
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            return null;
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e12);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(@NotNull AFh1jSDK aFh1jSDK) {
        f15605w = (f15604i + 21) % 128;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        if (aFh1jSDK.getMediationNetwork()) {
            String str = aFh1jSDK.areAllFieldsValid;
            AFc1eSDK aFc1eSDK = this.toString;
            getCurrencyIso4217Code(aFh1jSDK, str, aFc1eSDK.getMonetizationNetwork, aFc1eSDK.getCurrencyIso4217Code);
        } else if (!(aFh1jSDK instanceof AFh1fSDK)) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            String str2 = aFh1jSDK.component4;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            getMediationNetwork(new Object[]{this, map, str2}, 1127076864, -1127076862, System.identityHashCode(this));
        }
        if (CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP}).contains(aFh1jSDK.getCurrencyIso4217Code())) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            hashCode(map);
        }
        if (aFh1jSDK.getMonetizationNetwork()) {
            f15604i = (f15605w + 29) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            component1(map);
            f15604i = (f15605w + 81) % 128;
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        w(map);
        AFKeystoreWrapper(map);
        getMediationNetwork(new Object[]{this, map}, -2015365334, 2015365335, System.identityHashCode(this));
        AFLogger(map);
        getMediationNetwork(map);
        AFAdRevenueData(map, aFh1jSDK.getMediationNetwork());
        e(map);
        d(map);
        AFAdRevenueData(map, aFh1jSDK);
        map.put("af_events_api", "1");
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        f15605w = (f15604i + 79) % 128;
        String monetizationNetwork = aFg1qSDK.component1.getMonetizationNetwork("androidIdCached", null);
        try {
            String string = Settings.Secure.getString(aFg1qSDK.getMediationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                f15605w = (f15604i + 13) % 128;
                return string;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
        }
        if (monetizationNetwork == null) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + monetizationNetwork);
        int i10 = f15605w + 3;
        f15604i = i10 % 128;
        if (i10 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFg1sSDK.AFa1uSDK aFa1uSDKAFAdRevenueData = aFg1qSDK.AFAdRevenueData.AFAdRevenueData(aFg1qSDK.getMediationNetwork);
        float f10 = aFa1uSDKAFAdRevenueData.getRevenue;
        String str = aFa1uSDKAFAdRevenueData.AFAdRevenueData;
        map.put("btl", String.valueOf(f10));
        if (str != null) {
            f15604i = (f15605w + 95) % 128;
            map.put("btch", str);
        }
        int i10 = f15604i + 31;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 14 / 0;
        }
        return null;
    }

    private final String equals() {
        File fileAFAdRevenueData = AFAdRevenueData(getMediationNetwork("ro.appsflyer.preinstall.path"));
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData(getCurrencyIso4217Code("AF_PRE_INSTALL_PATH"));
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            fileAFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
            f15605w = (f15604i + 51) % 128;
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            f15604i = (f15605w + 101) % 128;
            return null;
        }
        String packageName = this.getMediationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return getMonetizationNetwork(fileAFAdRevenueData, packageName);
    }

    private final boolean copy() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -932948428, 932948439, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (r1.toString.equals != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r1.toString.equals != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        com.appsflyer.internal.AFg1qSDK.f15605w = (com.appsflyer.internal.AFg1qSDK.f15604i + 93) % 128;
        com.appsflyer.internal.AFh1ySDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        com.appsflyer.internal.AFh1ySDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object copydefault(java.lang.Object[] r13) {
        /*
            r0 = 0
            r1 = r13[r0]
            com.appsflyer.internal.AFg1qSDK r1 = (com.appsflyer.internal.AFg1qSDK) r1
            r2 = 1
            r3 = r13[r2]
            java.util.Map r3 = (java.util.Map) r3
            r4 = 2
            r5 = r13[r4]
            com.appsflyer.internal.AFe1mSDK r5 = (com.appsflyer.internal.AFe1mSDK) r5
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.util.List r6 = copydefault()
            boolean r5 = r6.contains(r5)
            r6 = 0
            if (r5 != 0) goto L23
            return r6
        L23:
            com.appsflyer.internal.AFc1eSDK r5 = r1.toString
            boolean r5 = r5.getMediationNetwork()
            java.lang.String r7 = "app_set_id"
            if (r5 == 0) goto L86
            int r2 = com.appsflyer.internal.AFg1qSDK.f15604i
            int r2 = r2 + 55
            int r5 = r2 % 128
            com.appsflyer.internal.AFg1qSDK.f15605w = r5
            int r2 = r2 % r4
            java.lang.String r4 = "app_set_id_disabled"
            if (r2 == 0) goto L51
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            kotlin.Pair r2 = kotlin.TuplesKt.to(r4, r2)
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)
            r3.put(r7, r2)
            com.appsflyer.internal.AFc1eSDK r1 = r1.toString
            com.appsflyer.internal.AFb1gSDK r1 = r1.equals
            r2 = 15
            int r2 = r2 / r0
            if (r1 == 0) goto L79
            goto L64
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            kotlin.Pair r0 = kotlin.TuplesKt.to(r4, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r3.put(r7, r0)
            com.appsflyer.internal.AFc1eSDK r0 = r1.toString
            com.appsflyer.internal.AFb1gSDK r0 = r0.equals
            if (r0 == 0) goto L79
        L64:
            int r0 = com.appsflyer.internal.AFg1qSDK.f15604i
            int r0 = r0 + 93
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.f15605w = r0
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r8 = com.appsflyer.internal.AFg1cSDK.APP_SET_ID
            r11 = 4
            r12 = 0
            java.lang.String r9 = "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK."
            r10 = 0
            com.appsflyer.internal.AFh1ySDK.i$default(r7, r8, r9, r10, r11, r12)
            return r6
        L79:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.APP_SET_ID
            r4 = 4
            r5 = 0
            java.lang.String r2 = "App Set ID collection is disabled. Skipping inclusion in the event payload."
            r3 = 0
            com.appsflyer.internal.AFh1ySDK.i$default(r0, r1, r2, r3, r4, r5)
            return r6
        L86:
            com.appsflyer.internal.AFc1eSDK r1 = r1.toString
            com.appsflyer.internal.AFb1gSDK r1 = r1.equals
            if (r1 == 0) goto Lba
            int r5 = r1.getRevenue
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r8 = "scope"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r8, r5)
            java.lang.String r8 = "id"
            java.lang.String r1 = r1.getCurrencyIso4217Code
            kotlin.Pair r1 = kotlin.TuplesKt.to(r8, r1)
            kotlin.Pair[] r8 = new kotlin.Pair[r4]
            r8[r0] = r5
            r8[r2] = r1
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r8)
            r3.put(r7, r0)
            int r0 = com.appsflyer.internal.AFg1qSDK.f15604i
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.f15605w = r1
            int r0 = r0 % r4
            if (r0 != 0) goto Lb9
            return r6
        Lb9:
            throw r6
        Lba:
            int r0 = com.appsflyer.internal.AFg1qSDK.f15605w
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.f15604i = r1
            int r0 = r0 % r4
            if (r0 == 0) goto Lc6
            return r6
        Lc6:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.copydefault(java.lang.Object[]):java.lang.Object");
    }

    private final SimpleDateFormat getMediationNetwork() {
        f15605w = (f15604i + 87) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        int i10 = f15605w + 45;
        f15604i = i10 % 128;
        if (i10 % 2 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private void component2(@NotNull Map<String, ? extends Object> map) {
        getMediationNetwork(new Object[]{this, map}, -2029029470, 2029029475, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFAdRevenueData(@NotNull AFh1jSDK aFh1jSDK) {
        boolean zAreEqual;
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        if (!this.areAllFieldsValid.component1()) {
            int i10 = f15604i + 37;
            f15605w = i10 % 128;
            if (i10 % 2 == 0) {
                Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
            } else {
                Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
                monetizationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
        } else {
            AdvertisingIdData advertisingIdData = this.areAllFieldsValid.AFAdRevenueData.component2;
            if (advertisingIdData == null) {
                f15604i = (f15605w + 101) % 128;
                return;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                aFh1jSDK.getMonetizationNetwork("gaidError", advertisingIdData.gaidError);
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null) {
                f15604i = (f15605w + 121) % 128;
                if (advertisingIdData.isEnabled != null) {
                    aFh1jSDK.getMonetizationNetwork("advertiserId", str2);
                    aFh1jSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                    aFh1jSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
                }
            }
        }
        AdvertisingIdData advertisingIdData2 = this.areAllFieldsValid.AFAdRevenueData.component2;
        if (advertisingIdData2 != null) {
            f15604i = (f15605w + 45) % 128;
            zAreEqual = Intrinsics.areEqual(advertisingIdData2.retry, Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        aFh1jSDK.getMonetizationNetwork("GAID_retry", String.valueOf(zAreEqual));
        if (!CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH}).contains(aFh1jSDK.getCurrencyIso4217Code()) || (aFd1aSDK = this.toString.component4) == null) {
            return;
        }
        int i11 = f15605w + 7;
        f15604i = i11 % 128;
        if (i11 % 2 != 0) {
            Map<String, Object> monetizationNetwork3 = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork3, "");
            monetizationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getRevenue));
            int i12 = f15604i + 33;
            f15605w = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 92 / 0;
                return;
            }
            return;
        }
        Map<String, Object> monetizationNetwork4 = AFa1uSDK.getMonetizationNetwork(aFh1jSDK.getCurrencyIso4217Code);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork4, "");
        monetizationNetwork4.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getRevenue));
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMediationNetwork(@NotNull AFh1jSDK aFh1jSDK) {
        f15605w = (f15604i + 55) % 128;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map);
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getCurrencyIso4217Code(map2, aFh1jSDK.component1);
        Map<String, Object> map3 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFAdRevenueData(map3, aFh1jSDK.component1);
        Map<String, Object> map4 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        registerClient(map4);
        Map<String, Object> map5 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        afDebugLog(map5);
        Map<String, Object> map6 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1mSDK currencyIso4217Code = aFh1jSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        getMediationNetwork(new Object[]{this, map6, currencyIso4217Code}, -1926240735, 1926240745, System.identityHashCode(this));
        int i10 = f15604i + 119;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @SuppressLint({"HardwareIds"})
    private final String component1() {
        return (String) getMediationNetwork(new Object[]{this}, 969328908, -969328900, System.identityHashCode(this));
    }

    private static void areAllFieldsValid(@NotNull Map<String, Object> map) throws UnsupportedEncodingException {
        f15605w = (f15604i + 59) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(null, "\u008f\u0089\u0087\u0083\u008e", null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(C4240b4.i.G, Build.DEVICE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        f15605w = (f15604i + 21) % 128;
    }

    private final void component4(Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, -217749996, 217750002, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getRevenue(@NotNull AFh1jSDK aFh1jSDK) {
        int i10 = f15604i + 89;
        f15605w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1jSDK, "");
            Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put("open_referrer", aFh1jSDK.getMediationNetwork);
            String str = aFh1jSDK.component2;
            if (str == null || StringsKt.y0(str)) {
                return;
            }
            int i11 = f15604i + 41;
            f15605w = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("af_web_referrer", aFh1jSDK.component2);
                return;
            } else {
                map.put("af_web_referrer", aFh1jSDK.component2);
                throw null;
            }
        }
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map2 = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("open_referrer", aFh1jSDK.getMediationNetwork);
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1jSDK aFh1jSDK) throws UnsupportedEncodingException {
        f15604i = (f15605w + 1) % 128;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getCurrencyIso4217Code(map, aFh1jSDK.getMediationNetwork());
        areAllFieldsValid(map);
        getMediationNetwork(new Object[]{map}, -43428876, 43428885, (int) System.currentTimeMillis());
        getRevenue(map);
        getMediationNetwork(new Object[]{this, map, this.toString.AFAdRevenueData}, -361587280, 361587287, System.identityHashCode(this));
        i(map);
        map.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", (String) getMediationNetwork(new Object[]{this}, -1875348758, 1875348758, System.identityHashCode(this)));
        map.put("last_boot_time", Long.valueOf(areAllFieldsValid()));
        map.put("disk", (String) getMediationNetwork(new Object[0], -879088668, 879088672, (int) System.currentTimeMillis()));
        f15604i = (f15605w + 85) % 128;
    }

    private void component3(@NotNull Map<String, Object> map) {
        getMediationNetwork(new Object[]{this, map}, 1978462197, -1978462194, System.identityHashCode(this));
    }

    @NotNull
    private static String component3() {
        return (String) getMediationNetwork(new Object[0], -879088668, 879088672, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        int i10 = f15605w + 117;
        f15604i = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Object objB;
        f15604i = (f15605w + 27) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.toString.getMediationNetwork;
        if (str != null) {
            int i10 = f15604i + 25;
            f15605w = i10 % 128;
            if (i10 % 2 == 0) {
                if (map.get("af_deeplink") != null) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    try {
                        Result.Companion companion = Result.f93230c;
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        objB = Result.b(Unit.f93236a);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.f93230c;
                        objB = Result.b(kotlin.d.a(th2));
                    }
                    Throwable thG = Result.g(objB);
                    if (thG != null) {
                        f15604i = (f15605w + 123) % 128;
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thG, false, false, false, false, 120, null);
                    }
                    Result.a(objB);
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        }
        this.toString.getMediationNetwork = null;
        f15605w = (f15604i + 53) % 128;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = f15604i + 77;
        f15605w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String string = aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
            String string2 = aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
            if (string != null) {
                map.put("onelink_id", string);
            }
            if (string2 != null) {
                map.put("onelink_ver", string2);
                f15605w = (f15604i + 121) % 128;
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
        aFg1qSDK.getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
        throw null;
    }

    private static List<AFe1mSDK> copydefault() {
        f15605w = (f15604i + 103) % 128;
        List<AFe1mSDK> listListOf = CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.ADREVENUE});
        f15605w = (f15604i + 67) % 128;
        return listListOf;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map) {
        f15604i = (f15605w + 77) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String revenue = AFb1jSDK.getRevenue(this.areAllFieldsValid.getMonetizationNetwork);
        if (revenue != null) {
            map.put(com.taurusx.tax.g.e0.f66120c, revenue);
            boolean mediationNetwork = this.areAllFieldsValid.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
            Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork), "");
            if (mediationNetwork) {
                map.put("custom_install_id", Boolean.TRUE);
                return;
            }
            return;
        }
        int i10 = f15605w + 93;
        f15604i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        String[] strArr;
        f15605w = (f15604i + 15) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getMonetizationNetwork().getString("appid");
        if (string != null) {
            f15604i = (f15605w + 53) % 128;
            map.put("appid", string);
        }
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String string3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
                f15605w = (f15604i + 87) % 128;
            }
            map.put("currency", string2);
        }
        String string4 = getMonetizationNetwork().getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            map.put("isUpdate", string4);
        }
        String string5 = getMonetizationNetwork().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            int i10 = f15605w + 123;
            f15604i = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("customData", string5);
            } else {
                map.put("customData", string5);
                throw null;
            }
        }
        String string6 = getMonetizationNetwork().getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            map.put("appUserId", string6);
        }
        String string7 = getMonetizationNetwork().getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            f15604i = (f15605w + 39) % 128;
            map.put("user_emails", string7);
        }
        AFb1uSDK aFb1uSDK = this.toString.getRevenue;
        if (aFb1uSDK == null || (strArr = aFb1uSDK.getMediationNetwork) == null) {
            return;
        }
        int i11 = f15604i + 19;
        f15605w = i11 % 128;
        if (i11 % 2 == 0) {
            map.put("sharing_filter", strArr);
        } else {
            map.put("sharing_filter", strArr);
            throw null;
        }
    }

    private final String getRevenue(String str) {
        if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) || (str != null && str.length() != 0)) {
            if (str == null) {
                return null;
            }
            f15605w = (f15604i + 85) % 128;
            return str;
        }
        int i10 = f15605w + 39;
        f15604i = i10 % 128;
        if (i10 % 2 == 0) {
            copy();
            throw null;
        }
        if (!copy()) {
            return null;
        }
        String str2 = (String) getMediationNetwork(new Object[]{this}, 969328908, -969328900, System.identityHashCode(this));
        f15605w = (f15604i + 55) % 128;
        return str2;
    }

    @SuppressLint({"PrivateApi"})
    @VisibleForTesting
    @Nullable
    private static String getMediationNetwork(@Nullable String str) {
        f15605w = (f15604i + 95) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(objInvoke, "");
            String str2 = (String) objInvoke;
            int i10 = f15605w + 69;
            f15604i = i10 % 128;
            if (i10 % 2 != 0) {
                return str2;
            }
            throw null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    @Nullable
    private String getRevenue() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        return (String) getMediationNetwork(new Object[]{this}, -1875348758, 1875348758, System.identityHashCode(this));
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull String str) {
        getMediationNetwork(new Object[]{this, map, str}, 1127076864, -1127076862, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        f15604i = (f15605w + 81) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String monetizationNetwork = aFg1qSDK.component1.getMonetizationNetwork("prev_event_name", null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1qSDK.component1.getCurrencyIso4217Code("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            aFg1qSDK.component1.AFAdRevenueData("prev_event_name", str);
            aFg1qSDK.component1.getRevenue("prev_event_timestamp", System.currentTimeMillis());
            int i10 = f15604i + 59;
            f15605w = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
            return null;
        }
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, boolean z10) {
        f15605w = (f15604i + 53) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getRevenue);
        if (z10) {
            map.put("platform_extension_v2", this.getCurrencyIso4217Code.AFAdRevenueData());
            f15605w = (f15604i + 125) % 128;
        }
    }

    @Nullable
    private String AFAdRevenueData(int i10) {
        String monetizationNetwork;
        f15605w = (f15604i + 53) % 128;
        String string = getMonetizationNetwork().getString("preInstallName");
        if (string != null) {
            int i11 = f15605w + 15;
            f15604i = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 12 / 0;
            }
            return string;
        }
        if (this.component1.getRevenue("preInstallName")) {
            monetizationNetwork = this.component1.getMonetizationNetwork("preInstallName", null);
        } else {
            if (i10 <= 1) {
                int i13 = f15604i + 99;
                f15605w = i13 % 128;
                if (i13 % 2 == 0) {
                    String strEquals = equals();
                    if (strEquals == null) {
                        int i14 = f15605w + 19;
                        f15604i = i14 % 128;
                        if (i14 % 2 != 0) {
                            strEquals = getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                        } else {
                            getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                            throw null;
                        }
                    }
                    string = strEquals;
                } else {
                    equals();
                    throw null;
                }
            }
            if (string != null) {
                this.component1.AFAdRevenueData("preInstallName", string);
            }
            monetizationNetwork = string;
        }
        if (monetizationNetwork != null) {
            f15604i = (f15605w + 73) % 128;
            getMonetizationNetwork().set("preInstallName", monetizationNetwork);
        }
        return monetizationNetwork;
    }

    @Nullable
    private String getMonetizationNetwork(int i10) {
        boolean z10;
        int i11 = f15605w + 57;
        f15604i = i11 % 128;
        String strComponent2 = null;
        if (i11 % 2 == 0) {
            this.component1.getRevenue("INSTALL_STORE");
            throw null;
        }
        if (this.component1.getRevenue("INSTALL_STORE")) {
            return this.component1.getMonetizationNetwork("INSTALL_STORE", null);
        }
        if (i10 <= 1) {
            z10 = true;
        } else {
            f15604i = (f15605w + 117) % 128;
            z10 = false;
        }
        if (!z10) {
            f15605w = (f15604i + 23) % 128;
        } else {
            strComponent2 = component2();
        }
        this.component1.AFAdRevenueData("INSTALL_STORE", strComponent2);
        return strComponent2;
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        f15604i = (f15605w + 43) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            f15604i = (f15605w + 77) % 128;
            map.put("phone", str);
            f15605w = (f15604i + 1) % 128;
        }
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, @Nullable String str) {
        boolean z10;
        int i10 = f15605w + 101;
        f15604i = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null && str.length() != 0) {
                int i11 = f15604i + 17;
                f15605w = i11 % 128;
                if (i11 % 2 == 0) {
                    map.put(Constants.REFERRER, str);
                    f15605w = (f15604i + 67) % 128;
                } else {
                    map.put(Constants.REFERRER, str);
                    throw null;
                }
            }
            String monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", null);
            if (monetizationNetwork != null) {
                map.put("extraReferrers", monetizationNetwork);
            }
            String referrer = getMonetizationNetwork().getReferrer(this.component1);
            if (referrer == null || referrer.length() == 0) {
                f15605w = (f15604i + 17) % 128;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                return;
            }
            int i12 = f15605w + 67;
            f15604i = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 10 / 0;
                if (map.get(Constants.REFERRER) != null) {
                    return;
                }
            } else if (map.get(Constants.REFERRER) != null) {
                return;
            }
            map.put(Constants.REFERRER, referrer);
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        f15604i = (f15605w + 55) % 128;
        String strN_ = AFj1iSDK.N_(aFg1qSDK.getMediationNetwork.getApplicationContext().getPackageManager(), aFg1qSDK.getMediationNetwork.getApplicationContext().getPackageName());
        int i10 = f15604i + 121;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 27 / 0;
        }
        return strN_;
    }

    private static boolean getMonetizationNetwork(File file) {
        f15605w = (f15604i + 93) % 128;
        if (file == null || (!file.exists())) {
            return true;
        }
        f15604i = (f15605w + 39) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final long getCurrencyIso4217Code() {
        f15605w = (f15604i + 7) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        f15604i = (f15605w + 105) % 128;
        return jCurrentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getCurrencyIso4217Code(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r8, boolean r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "ro.product.cpu.abi"
            java.lang.String r4 = getMediationNetwork(r4)
            java.lang.String r5 = "cpu_abi"
            r3.put(r5, r4)
            java.lang.String r4 = "ro.product.cpu.abi2"
            java.lang.String r4 = getMediationNetwork(r4)
            java.lang.String r5 = "cpu_abi2"
            r3.put(r5, r4)
            java.lang.String r4 = "os.arch"
            java.lang.String r4 = getMediationNetwork(r4)
            java.lang.String r5 = "arch"
            r3.put(r5, r4)
            java.lang.String r4 = "ro.build.display.id"
            java.lang.String r4 = getMediationNetwork(r4)
            java.lang.String r5 = "build_display_id"
            r3.put(r5, r4)
            if (r9 == 0) goto L9e
            int r9 = com.appsflyer.internal.AFg1qSDK.f15605w
            int r9 = r9 + 41
            int r4 = r9 % 128
            com.appsflyer.internal.AFg1qSDK.f15604i = r4
            int r9 = r9 % r2
            java.lang.String r4 = "appsFlyerCount"
            r5 = 217750002(0xcfa99f2, float:3.8611251E-31)
            r6 = -217749996(0xfffffffff3056614, float:-1.0568937E31)
            if (r9 != 0) goto L67
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r1] = r7
            r9[r0] = r3
            int r1 = java.lang.System.identityHashCode(r7)
            getMediationNetwork(r9, r6, r5, r1)
            com.appsflyer.internal.AFc1pSDK r9 = r7.areAllFieldsValid
            com.appsflyer.internal.AFc1oSDK r9 = r9.getMonetizationNetwork
            int r9 = r9.getMediationNetwork(r4, r0)
            r0 = 5
            if (r9 > r0) goto L9e
            goto L7e
        L67:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r1] = r7
            r9[r0] = r3
            int r0 = java.lang.System.identityHashCode(r7)
            getMediationNetwork(r9, r6, r5, r0)
            com.appsflyer.internal.AFc1pSDK r9 = r7.areAllFieldsValid
            com.appsflyer.internal.AFc1oSDK r9 = r9.getMonetizationNetwork
            int r9 = r9.getMediationNetwork(r4, r1)
            if (r9 > r2) goto L9e
        L7e:
            int r9 = com.appsflyer.internal.AFg1qSDK.f15604i
            int r9 = r9 + 85
            int r0 = r9 % 128
            com.appsflyer.internal.AFg1qSDK.f15605w = r0
            int r9 = r9 % r2
            if (r9 != 0) goto L93
            com.appsflyer.internal.AFj1pSDK r9 = r7.getMonetizationNetwork
            java.util.Map r9 = r9.AFAdRevenueData()
            r3.putAll(r9)
            goto L9e
        L93:
            com.appsflyer.internal.AFj1pSDK r8 = r7.getMonetizationNetwork
            java.util.Map r8 = r8.AFAdRevenueData()
            r3.putAll(r8)
            r8 = 0
            throw r8
        L9e:
            com.appsflyer.internal.AFg1vSDK r9 = r7.component2
            android.content.Context r0 = r7.getMediationNetwork
            java.util.Map r9 = r9.getMediationNetwork(r0)
            java.lang.String r0 = "dim"
            r3.put(r0, r9)
            java.lang.String r9 = "deviceData"
            r8.put(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.getCurrencyIso4217Code(java.util.Map, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:43:0x0084). Please report as a decompilation issue!!! */
    private static String getMonetizationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        int i10 = f15605w;
        int i11 = i10 + 87;
        f15604i = i11 % 128;
        ?? r12 = i11 % 2;
        if (r12 != 0) {
            try {
                try {
                    if (file == null) {
                        int i12 = i10 + 39;
                        f15604i = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 58 / 0;
                        }
                        return null;
                    }
                    try {
                        properties = new Properties();
                        inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    } catch (FileNotFoundException unused) {
                        inputStreamReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader = null;
                    }
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                            return property;
                        } catch (Throwable th3) {
                            AFLogger.afErrorLog(th3.getMessage(), th3);
                            return property;
                        }
                    } catch (FileNotFoundException unused2) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        r12 = inputStreamReader;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            r12 = inputStreamReader;
                        }
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        r12 = inputStreamReader;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            r12 = inputStreamReader;
                        }
                        return null;
                    }
                } catch (Throwable th5) {
                    AFLogger.afErrorLog(th5.getMessage(), th5);
                    r12 = r12;
                }
            } catch (Throwable th6) {
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (Throwable th7) {
                        AFLogger.afErrorLog(th7.getMessage(), th7);
                    }
                }
                throw th6;
            }
        } else {
            throw null;
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = f15604i + 119;
        f15605w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1qSDK.hashCode.getCurrencyIso4217Code());
            int i11 = 68 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(aFg1qSDK.hashCode.getCurrencyIso4217Code());
        }
        int i12 = f15604i + 53;
        f15605w = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 1 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull AFe1mSDK aFe1mSDK) {
        getMediationNetwork(new Object[]{this, map, aFe1mSDK}, -1926240735, 1926240745, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i10, int i11) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i10));
        map.put("iaecounter", String.valueOf(i11));
        boolean z10 = true;
        if (!component4()) {
            f15604i = (f15605w + 115) % 128;
        } else {
            f15605w = (f15604i + 61) % 128;
            z10 = false;
        }
        map.put("isFirstCall", String.valueOf(z10));
        f15604i = (f15605w + 37) % 128;
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, int i10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(map, "");
        String strAreAllFieldsValid = this.areAllFieldsValid.areAllFieldsValid();
        String strAFAdRevenueData = AFAdRevenueData(this.component1, strAreAllFieldsValid);
        boolean z11 = false;
        if (strAFAdRevenueData == null || Intrinsics.areEqual(strAFAdRevenueData, strAreAllFieldsValid)) {
            z10 = false;
        } else {
            f15604i = (f15605w + 17) % 128;
            z10 = true;
        }
        if (strAFAdRevenueData == null) {
            int i11 = f15604i + 79;
            f15605w = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (strAreAllFieldsValid != null) {
                z11 = true;
            }
        }
        if (z10 || z11) {
            map.put("af_latestchannel", strAreAllFieldsValid);
        }
        String monetizationNetwork = getMonetizationNetwork(i10);
        if (monetizationNetwork != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Object lowerCase = monetizationNetwork.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String strAFAdRevenueData2 = AFAdRevenueData(i10);
        if (strAFAdRevenueData2 != null) {
            int i12 = f15604i + 11;
            f15605w = i12 % 128;
            if (i12 % 2 == 0) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                Object lowerCase2 = strAFAdRevenueData2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                map.put("af_preinstall_name", lowerCase2);
            } else {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                Object lowerCase3 = strAFAdRevenueData2.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                map.put("af_preinstall_name", lowerCase3);
                throw null;
            }
        } else {
            f15604i = (f15605w + 77) % 128;
        }
        String strComponent2 = component2();
        if (strComponent2 != null) {
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            Object lowerCase4 = strComponent2.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_currentstore", lowerCase4);
        }
    }

    @NotNull
    private String getCurrencyIso4217Code(@NotNull SimpleDateFormat simpleDateFormat, int i10) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", null);
        if (monetizationNetwork == null) {
            int i11 = f15604i + 125;
            f15605w = i11 % 128;
            if (i11 % 2 == 0 ? i10 > 1 : i10 > 0) {
                monetizationNetwork = "";
            } else {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                String str = simpleDateFormat.format(new Date());
                f15605w = (f15604i + 121) % 128;
                monetizationNetwork = str;
            }
            this.component1.AFAdRevenueData("appsFlyerFirstInstall", monetizationNetwork);
            f15604i = (f15605w + 59) % 128;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private void getCurrencyIso4217Code(@NotNull AFh1jSDK aFh1jSDK, @Nullable String str, @Nullable String str2, @Nullable AFb1rSDK aFb1rSDK) {
        f15604i = (f15605w + 53) % 128;
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Map<String, Object> map = aFh1jSDK.getCurrencyIso4217Code;
        if (aFh1jSDK.getCurrencyIso4217Code() == AFe1mSDK.CONVERSION) {
            f15604i = (f15605w + 13) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            equals(map);
            copy(map);
            toString(map);
            AFa1zSDK.getMonetizationNetwork(this.equals, this.areAllFieldsValid);
            f15604i = (f15605w + 3) % 128;
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        copydefault(map);
        getMediationNetwork(new Object[]{this, map}, 1978462197, -1978462194, System.identityHashCode(this));
        getMediationNetwork(new Object[]{this, map}, -2029029470, 2029029475, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        AFAdRevenueData(map, str);
        AFInAppEventParameterName(map);
        if (aFb1rSDK != null) {
            int i10 = f15604i + 9;
            f15605w = i10 % 128;
            if (i10 % 2 == 0) {
                aFb1rSDK.getMonetizationNetwork(map);
            } else {
                aFb1rSDK.getMonetizationNetwork(map);
                int i11 = 18 / 0;
            }
        }
    }

    private static String AFAdRevenueData(AFc1oSDK aFc1oSDK, String str) {
        f15605w = (f15604i + 77) % 128;
        String monetizationNetwork = aFc1oSDK.getMonetizationNetwork("CACHED_CHANNEL", null);
        if (monetizationNetwork != null) {
            f15604i = (f15605w + 27) % 128;
            return monetizationNetwork;
        }
        aFc1oSDK.AFAdRevenueData("CACHED_CHANNEL", str);
        return str;
    }

    private static File AFAdRevenueData(String str) {
        if (str != null) {
            try {
                if (StringsKt.v1(str).toString().length() > 0) {
                    return new File(StringsKt.v1(str).toString());
                }
                f15604i = (f15605w + 3) % 128;
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }
        f15605w = (f15604i + 5) % 128;
        return null;
    }

    private static void AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        String str = aFh1jSDK.component4;
        if (str != null) {
            map.put(C4240b4.i.f42633j0, str);
            Map map2 = aFh1jSDK.AFAdRevenueData;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    @NotNull
    public final Long AFAdRevenueData() {
        return (Long) getMediationNetwork(new Object[]{this}, -1521351773, 1521351785, System.identityHashCode(this));
    }

    private final String getCurrencyIso4217Code(String str) {
        f15605w = (f15604i + 63) % 128;
        String monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork(str);
        int i10 = f15604i + 3;
        f15605w = i10 % 128;
        if (i10 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @Nullable String str) {
        getMediationNetwork(new Object[]{this, map, str}, -361587280, 361587287, System.identityHashCode(this));
    }
}
