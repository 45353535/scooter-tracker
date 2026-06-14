package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceData;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public class L6 implements Runnable {
    public static final String M = "sdkVersion";
    public static final String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private Context K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41242a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41243b = "bundleId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41244c = "advertisingId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41245d = C4240b4.j.M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41246e = "appKey";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f41247f = Ya.f42169o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f41248g = DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f41249h = "connectionType";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f41250i = "rawConnectionType";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f41251j = "language";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f41252k = "deviceOEM";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f41253l = "deviceModel";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f41254m = C4240b4.j.f42700r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41255n = Ya.f42172r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f41256o = Ya.f42173s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f41257p = "battery";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f41258q = "gmtMinutesOffset";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f41259r = "appVersion";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f41260s = JsonStorageKeyNames.SESSION_ID_KEY;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f41261t = "pluginType";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f41262u = "pluginVersion";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f41263v = "plugin_fw_v";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f41264w = Ya.f42175u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f41265x = Ya.f42174t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f41266y = N6.f41367a1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f41267z = Ya.f42177w;
    private final String A = "mcc";
    private final String B = "mnc";
    private final String C = "icc";
    private final String D = "tz";
    private final String E = "auid";
    private final String F = "userLat";
    private final String G = "publisherAPI";
    private final String H = "missingDependencies";
    private final String I = "missingManifest";
    private final String J = "other";
    private final InterfaceC4634y7 L = Ib.U().i();

    private L6() {
    }

    private Map<String, Object> a() {
        boolean z10;
        String str;
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.d());
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            map.put("bundleId", strE);
            String strB = B1.b(this.K, strE);
            if (!TextUtils.isEmpty(strB)) {
                map.put("appVersion", strB);
            }
        }
        map.put("appKey", c());
        String strI = this.L.I(this.K);
        String strB2 = this.L.b(this.K);
        boolean z11 = false;
        if (TextUtils.isEmpty(strI)) {
            strI = this.L.M(this.K);
            z10 = true;
            str = !TextUtils.isEmpty(strI) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z10 = false;
        }
        if (!TextUtils.isEmpty(strI)) {
            map.put("advertisingId", strI);
            map.put(Ya.f42174t, str);
        }
        if (!TextUtils.isEmpty(strB2)) {
            z11 = Boolean.parseBoolean(strB2);
            map.put(C4240b4.j.M, Boolean.valueOf(z11));
        }
        if (z10 || z11) {
            map.put(N, a(strB2));
        }
        map.put(Ya.f42169o, h());
        if (!TextUtils.isEmpty(b())) {
            map.put(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, b());
        }
        String strA = IronSourceUtils.a(this.K);
        if (!TextUtils.isEmpty(strA)) {
            map.put("connectionType", strA);
        }
        String strD = Y3.d(this.K);
        if (!TextUtils.isEmpty(strD)) {
            map.put("rawConnectionType", strD);
        }
        map.put("sdkVersion", r());
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            map.put("language", strL);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            map.put("deviceOEM", strG);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            map.put("deviceModel", strF);
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            map.put(C4240b4.j.f42700r, strN);
        }
        map.put(Ya.f42173s, Long.valueOf(k()));
        map.put(Ya.f42172r, Long.valueOf(i()));
        map.put("battery", Integer.valueOf(d()));
        int iJ = j();
        if (a(iJ)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iJ));
        }
        String strP = p();
        if (!TextUtils.isEmpty(strP)) {
            map.put("pluginType", strP);
        }
        String strQ = q();
        if (!TextUtils.isEmpty(strQ)) {
            map.put("pluginVersion", strQ);
        }
        String strO = o();
        if (!TextUtils.isEmpty(strO)) {
            map.put("plugin_fw_v", strO);
        }
        String strValueOf = String.valueOf(this.L.p());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put(Ya.f42175u, strValueOf);
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            map.put(N6.f41367a1, strM);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.c(this.K));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put(Ya.f42177w, strValueOf2);
        }
        String strD2 = this.L.d(this.K);
        if (!TextUtils.isEmpty(strD2)) {
            map.put("auid", strD2);
        }
        map.put("mcc", Integer.valueOf(X3.b(this.K)));
        map.put("mnc", Integer.valueOf(X3.c(this.K)));
        String strG2 = this.L.G(this.K);
        if (!TextUtils.isEmpty(strG2)) {
            map.put("icc", strG2);
        }
        String strD3 = this.L.d();
        if (!TextUtils.isEmpty(strD3)) {
            map.put("tz", strD3);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    private String c() {
        return com.ironsource.mediationsdk.r.m().n();
    }

    private int d() {
        try {
            Intent intentRegisterReceiver = this.K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f41242a + ":getBatteryLevel()", e10);
        }
        return -1;
    }

    private String e() {
        try {
            return this.K.getPackageName();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    private String h() {
        return "Android";
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f41242a + ":getGmtMinutesOffset()", e10);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    private String m() {
        return com.ironsource.mediationsdk.r.m().p();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.K.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!networkOperatorName.equals("")) {
                    return networkOperatorName;
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f41242a + ":getMobileCarrier()", e10);
        }
        return "";
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e10);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e10);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e10);
            return "";
        }
    }

    private String r() {
        return LevelPlay.getSdkVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            K6.a().a(a());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e10);
        }
    }

    public L6(Context context) {
        this.K = context.getApplicationContext();
    }

    private boolean a(int i10) {
        return i10 <= P && i10 >= Q && i10 % 15 == 0;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!X4.f42026a.b()) {
            return "publisherAPI";
        }
        if (this.L.g(this.K)) {
            return Boolean.parseBoolean(str) ? "userLat" : "other";
        }
        return "missingManifest";
    }
}
