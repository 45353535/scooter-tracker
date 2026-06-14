package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.aps.ads.ApsConstants;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;
import io.bidmachine.BidMachine;

/* JADX INFO: renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
class C4467o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44559a = "IntegrationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44560b = "getNetworkSDKVersion";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44561c = "getAdapterSDKVersion";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44562d = "getAdapterVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44563e = "getVersion";

    /* JADX INFO: renamed from: com.ironsource.o9$a */
    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f44564a;

        a(Context context) {
            this.f44564a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C4467o9.f44559a, "--------------- Google Play Services --------------");
                if (!this.f44564a.getPackageManager().getApplicationInfo(this.f44564a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(C4467o9.f44559a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(C4467o9.f44559a, "Google Play Services - VERIFIED");
                String strB = com.ironsource.mediationsdk.r.m().b(this.f44564a);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                Log.i(C4467o9.f44559a, "GAID is: " + strB + " (use this for test devices)");
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                Log.e(C4467o9.f44559a, "Google Play Services - MISSING");
            }
        }
    }

    C4467o9() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(android.content.Context r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4467o9.a(android.content.Context, java.lang.String):boolean");
    }

    static void b(Context context) {
        Log.i(f44559a, "Verifying Integration:");
        c(context);
        String[] strArr = {"AppLovin", ApsConstants.UNITYLEVELPLAY_NETWORK_DATA_KEY, BidMachine.NAME, "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "Smaato", "SuperAwesome", N6.H1, "Verve", "Yandex"};
        for (int i10 = 0; i10 < 23; i10++) {
            String str = strArr[i10];
            if (a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.getClass();
                switch (lowerCase) {
                    case "vungle":
                        Log.i(f44559a, ">>>> Liftoff Monetization - VERIFIED");
                        break;
                    case "admob":
                        Log.i(f44559a, ">>>> Google (AdMob and Ad Manager) - VERIFIED");
                        break;
                    case "facebook":
                        Log.i(f44559a, ">>>> Meta - VERIFIED");
                        break;
                    default:
                        Log.i(f44559a, ">>>> " + str + " - VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.getClass();
                switch (lowerCase2) {
                    case "vungle":
                        Log.i(f44559a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case "admob":
                        Log.i(f44559a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case "facebook":
                        Log.i(f44559a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(f44559a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            }
        }
        a(context);
    }

    private static void c(Context context) {
        Log.i(f44559a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(f44559a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(f44559a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(f44559a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(f44559a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    private static void b(Object obj) {
        String str;
        try {
            Class<?> cls = obj.getClass();
            if (obj instanceof LevelPlayBaseAdapter) {
                str = f44560b;
            } else {
                str = f44561c;
            }
            Log.i(f44559a, "SDK Version - " + ((String) cls.getMethod(str, null).invoke(obj, null)));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Log.w(f44559a, "Unable to get SDK version");
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(Object obj) {
        try {
            Log.i(f44559a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f44562d : "getVersion", null).invoke(obj, null)));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Log.w(f44559a, "Unable to get adapter version");
        }
    }
}
