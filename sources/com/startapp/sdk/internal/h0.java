package com.startapp.sdk.internal;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C4240b4;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f64592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ProgressDialog f64593b;

    public static void a(String str, String str2, String str3, Context context, TrackingParams trackingParams) {
        if (vi.d(str3)) {
            StringBuilder sb2 = new StringBuilder(str3);
            String strA = a(str3, (String) null);
            if (strA != null) {
                sb2.append(g.a(g.c(strA)));
            }
            if (trackingParams != null) {
                sb2.append(trackingParams.e());
            }
            str3 = sb2.toString();
        }
        ji.a(context, str3, null);
        Intent intentB = vi.b(context, str);
        if (intentB != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    intentB.putExtra(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (intentB != null) {
            try {
                context.startActivity(intentB);
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
        }
        return false;
    }

    public static String c(Context context) {
        ApplicationInfo applicationInfo;
        try {
            return context.getResources().getString(context.getApplicationInfo().labelRes);
        } catch (Throwable unused) {
            PackageManager packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            } catch (Throwable unused2) {
                applicationInfo = null;
            }
            return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Welcome!");
        }
    }

    public static void d(Context context) {
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            WeakHashMap weakHashMap = vi.f65408a;
            vi.a(activity, activity.getResources().getConfiguration().orientation, false);
        }
        ProgressDialog progressDialog = f64593b;
        if (progressDialog != null) {
            synchronized (progressDialog) {
                try {
                    ProgressDialog progressDialog2 = f64593b;
                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                        try {
                            f64593b.cancel();
                        } catch (Throwable th2) {
                            g9.a(th2);
                        }
                        f64593b = null;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        r2.setPackage(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.h0.b(android.content.Context, java.lang.String):void");
    }

    public static void a(String[] strArr, String str, int i10, String str2, JSONObject jSONObject) {
        try {
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            if (analyticsConfigH != null && analyticsConfigH.m() && jSONObject != null) {
                g9 g9Var = new g9(h9.f64609d);
                g9Var.f64553d = "viewability_info";
                g9Var.f64558i = str2;
                g9Var.f64554e = vi.b(jSONObject.toString());
                g9Var.a();
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        try {
            String str3 = "Dropped impression because " + str2;
            if (jSONObject != null) {
                str3 = str3 + ", view hierarchy: " + jSONObject.toString(2);
            }
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(6, "StartAppSDK", str3);
        } catch (Throwable th3) {
            g9.a(th3);
        }
        a(strArr, str, i10, str2);
    }

    public static void a(String[] strArr, String str, int i10, String str2) {
        TrackingParams trackingParamsA = new TrackingParams(str).a(i10).a(str2);
        if (strArr != null && strArr.length != 0) {
            for (String string : strArr) {
                if (string != null && string.length() > 0) {
                    g9 g9Var = new g9(h9.f64615j);
                    if (vi.d(string)) {
                        StringBuilder sb2 = new StringBuilder(string);
                        String strA = a(string, (String) null);
                        if (strA != null) {
                            sb2.append(g.a(g.c(strA)));
                        }
                        sb2.append(trackingParamsA.e());
                        string = sb2.toString();
                    }
                    g9Var.f64554e = string;
                    g9Var.a();
                }
            }
            return;
        }
        g9 g9Var2 = new g9(h9.f64610e);
        g9Var2.f64553d = "Non-impression without trackingUrls";
        g9Var2.f64558i = str2;
        g9Var2.f64554e = vi.a(trackingParamsA.d());
        g9Var2.a();
    }

    public static boolean b(Context context) {
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        if (((com.startapp.sdk.common.advertisingid.b) aVarA.f64181h.a()).a().f64844c) {
            return false;
        }
        long j10 = ((vf) aVarA.G.a()).getLong("shared_prefs_CookieFeatureTS", 0L);
        return j10 == 0 || (((long) AdsCommonMetaData.k().e()) * SignalManager.TWENTY_FOUR_HOURS_MILLIS) + j10 <= System.currentTimeMillis();
    }

    public static ArrayList a(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int i11 = i10 + 5;
            arrayList2.add(i0.f64665e + "?" + TextUtils.join(C4240b4.j.f42670c, arrayList.subList(i10, Math.min(i11, arrayList.size()))) + "&isShown=false" + "&appPresence=".concat(str));
            i10 = i11;
        }
        return arrayList2;
    }

    public static void a(Context context, String str, String[] strArr, TrackingParams trackingParams, boolean z10, boolean z11) {
        Pair pairA = a(context, strArr, str, trackingParams, z11);
        String str2 = (String) pairA.first;
        String str3 = (String) pairA.second;
        try {
            if (AdsCommonMetaData.k().J() || TextUtils.isEmpty(str2)) {
                str = g.a(str, str3);
            }
            if (MetaData.E().i0() && z10) {
                a(context, str);
                return;
            }
            if (TextUtils.isEmpty(str2) && b(context)) {
                uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ufVarEdit.a("shared_prefs_CookieFeatureTS", Long.valueOf(jCurrentTimeMillis));
                ufVarEdit.f65346a.putLong("shared_prefs_CookieFeatureTS", jCurrentTimeMillis);
                ufVarEdit.apply();
                b(context, str + "&cki=1");
                return;
            }
            b(context, str);
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    public static void a(Context context, String str, String[] strArr, String str2, TrackingParams trackingParams, long j10, long j11, boolean z10, Boolean bool, boolean z11, Runnable runnable) {
        String strA;
        if (AdsCommonMetaData.k().K()) {
            Pair pairA = a(context, strArr, str, trackingParams, z11);
            String str3 = (String) pairA.first;
            String str4 = (String) pairA.second;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (!AdsCommonMetaData.k().J() && !TextUtils.isEmpty(str3)) {
                strA = "";
            } else {
                strA = g.a(g.c(str4));
            }
            sb2.append(strA);
            String string = sb2.toString();
            Intent intent = new Intent("com.startapp.android.OnClickCallback");
            intent.putExtra("dParam", str4);
            zb.a(context).a(intent);
            if (a(string)) {
                if (str2 != null && !str2.isEmpty()) {
                    Locale locale = Locale.ROOT;
                    if (!string.toLowerCase(locale).contains(str2.toLowerCase(locale))) {
                        g9 g9Var = new g9(h9.f64610e);
                        g9Var.f64553d = "Wrong package reached";
                        g9Var.f64554e = "Expected: " + str2 + ", Link: " + string;
                        g9Var.f64556g = str4;
                        g9Var.a();
                    }
                }
                b(context, string);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                WeakHashMap weakHashMap = vi.f65408a;
                vi.a(activity, activity.getResources().getConfiguration().orientation, true);
            }
            try {
                WebView webViewC = ((tk) com.startapp.sdk.components.a.a(context).f64175b.a()).c();
                if (f64593b == null) {
                    int i10 = Build.VERSION.SDK_INT;
                    ProgressDialog progressDialog = new ProgressDialog(context, R.style.Theme.DeviceDefault.Dialog.Alert);
                    f64593b = progressDialog;
                    progressDialog.setTitle((CharSequence) null);
                    f64593b.setMessage("Loading....");
                    f64593b.setIndeterminate(false);
                    f64593b.setCancelable(false);
                    f64593b.setOnCancelListener(new g0(webViewC));
                    if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                        f64593b.show();
                    } else if (!(context instanceof Activity) && Settings.canDrawOverlays(context) && f64593b.getWindow() != null) {
                        if (i10 >= 26) {
                            f64593b.getWindow().setType(2038);
                        } else {
                            f64593b.getWindow().setType(2003);
                        }
                        f64593b.show();
                    }
                }
                webViewC.getSettings().setJavaScriptEnabled(true);
                webViewC.setWebChromeClient(new WebChromeClient());
                webViewC.setWebViewClient(new od(context, com.startapp.sdk.components.a.a(context).G, com.startapp.sdk.components.a.a(context).D, new Handler(Looper.getMainLooper()), j10, j11, z10, bool, string, str2, str4, runnable));
                webViewC.loadUrl(string);
                return;
            } catch (Throwable th2) {
                g9.a(th2);
                b(context, string);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        a(context, str, strArr, trackingParams, z10, z11);
    }

    public static Pair a(Context context, String[] strArr, String str, TrackingParams trackingParams, boolean z10) {
        String strA;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2)) {
                    a(context, str2, trackingParams);
                }
            }
        }
        jh jhVar = ih.f64695a;
        jhVar.f64784l = true;
        jhVar.f64776d = true;
        String str3 = null;
        if (z10 || strArr == null) {
            strA = null;
        } else {
            try {
                strA = null;
                for (String str4 : strArr) {
                    try {
                        strA = a(str, str4);
                        if (strA != null || vi.d(str4)) {
                            str3 = str4;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        g9.a(th);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        return new Pair(str3, strA);
    }

    public static void a(Context context, String str, TrackingParams trackingParams) {
        String string;
        if (context == null) {
            return;
        }
        if (str != null && str.length() > 0) {
            if (vi.d(str)) {
                StringBuilder sb2 = new StringBuilder(str);
                String strA = a(str, (String) null);
                if (strA != null) {
                    sb2.append(g.a(g.c(strA)));
                }
                if (trackingParams != null) {
                    sb2.append(trackingParams.e());
                }
                string = sb2.toString();
            } else {
                string = str;
            }
            ji.a(context, string, null);
        }
        vi.a(4, context, TextUtils.isEmpty(str) ? "Closed Ad" : "Clicked Ad");
    }

    public static boolean a(String str) {
        return str.startsWith("market") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        if (!a(str)) {
            WeakHashMap weakHashMap = vi.f65408a;
            try {
                if (MetaData.E().o() && ((vf) com.startapp.sdk.components.a.a(context).G.a()).getBoolean("chromeTabs", false)) {
                    n2.a(context, str, true);
                    return;
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
            Intent intent = new Intent(context, (Class<?>) OverlayActivity.class);
            intent.addFlags(524288);
            intent.addFlags(32768);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            intent.putExtra("placement", AdPreferences.Placement.INAPP_BROWSER.getIndex());
            intent.putExtra("activityShouldLockOrientation", false);
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable th3) {
                g9.a(th3);
                return;
            }
        }
        b(context, str);
    }

    public static String a(String str, String str2) {
        if (str2 != null) {
            try {
                if (!str2.equals("")) {
                    str = str2;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("[?&]d=");
        if (strArrSplit.length >= 2) {
            return strArrSplit[1].split("[?&]")[0];
        }
        return null;
    }

    public static String a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i10 = 0; i10 < 8; i10++) {
            if (stackTrace[i10].getMethodName().compareTo("doHome") == 0) {
                return "home";
            }
            if (stackTrace[i10].getMethodName().compareTo("onBackPressed") == 0) {
                jh jhVar = ih.f64695a;
                Activity activity = jhVar.f64783k;
                if (!(activity != null ? activity.isTaskRoot() : true)) {
                    return "interstitial";
                }
                jhVar.f64775c = false;
                jhVar.f64777e = true;
                return "back";
            }
        }
        return "interstitial";
    }

    public static boolean a(Context context) {
        if (AdsCommonMetaData.k().a()) {
            return b(context);
        }
        return false;
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                runnable.run();
                return;
            }
            Handler handler = f64592a;
            if (handler == null) {
                handler = new Handler(mainLooper);
                f64592a = handler;
            }
            handler.post(runnable);
        }
    }

    public static String a(BannerBase bannerBase) {
        View view = bannerBase;
        StringBuilder sb2 = null;
        String name = null;
        while (view != null) {
            if (name == null) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        name = null;
                        break;
                    }
                    if (context instanceof Activity) {
                        name = context.getClass().getName();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            int id2 = view.getId();
            if (id2 != -1 && id2 != 0) {
                try {
                    String resourceEntryName = view.getResources().getResourceEntryName(id2);
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    } else {
                        sb2.insert(0, "/");
                    }
                    sb2.insert(0, resourceEntryName);
                } catch (Resources.NotFoundException unused) {
                }
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        Pair pair = new Pair(name, sb2 != null ? sb2.toString() : null);
        return a(bannerBase.getContext().getPackageName(), bannerBase.getClass().getName(), (String) pair.first, (String) pair.second);
    }

    public static String a(String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.ROOT;
        sb2.append(String.format(locale, "10%08x", Integer.valueOf((str + str2).hashCode())));
        sb2.append(str3 != null ? String.format(locale, "ac%08x", Integer.valueOf(str3.hashCode())) : "");
        sb2.append(str4 != null ? String.format(locale, "b1%08x", Integer.valueOf(str4.hashCode())) : "");
        return sb2.toString();
    }
}
