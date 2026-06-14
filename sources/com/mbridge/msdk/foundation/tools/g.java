package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f48991a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f48992b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f48993c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f48994d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f48995e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f48996f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f48997g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f48998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f48999i;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49000a;

        a(Context context) {
            this.f49000a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    int i10 = AdvertisingIdClient.f25284a;
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f49000a);
                    g.a(advertisingIdInfo.getId());
                    g.f48994d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f49000a, advertisingIdInfo.getId(), g.f48994d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f49000a);
                        g.a(bVarA.a());
                        g.f48994d = bVarA.b() ? 1 : 0;
                        g.b(this.f49000a, bVarA.a(), g.f48994d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th2) {
                    q0.b("DomainSameDiTool", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f48992b) ? "" : f48992b;
        }
        if (!TextUtils.isEmpty(f48992b)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f48994d == 0 ? f48992b : "" : f48992b;
        }
        if (!f48993c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f48993c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f48991a) ? "" : f48991a;
        }
        if (!TextUtils.isEmpty(f48991a)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f48994d == 0 ? f48991a : "" : f48991a;
        }
        m0.k();
        if (!f48993c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f48993c = true;
        }
        return TextUtils.isEmpty(f48991a) ? "" : f48991a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f48997g) && !f48996f) {
            b();
        }
        return f48997g;
    }

    public static int a() {
        return f48994d;
    }

    public static void a(int i10) {
        f48994d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f48996f) {
            return f48995e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f48997g = string2;
                    f48995e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("DomainSameDiTool", th2.getMessage());
        }
        f48996f = true;
        return f48995e;
    }

    public static void a(String str) {
        f48992b = k0.b(str);
        f48991a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f48998h = false;
        }
        if (f48999i) {
            return f48998h;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f48998h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f48998h = true;
        }
        f48999i = true;
        return f48998h;
    }
}
