package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.A1;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k7 {

    class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f9180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f9181c;

        a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
            this.f9179a = str;
            this.f9180b = aVar;
            this.f9181c = kVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f9179a, null);
                t2.c(this.f9180b.e(), this.f9180b.g(), this.f9180b.i());
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                t2.a(this.f9180b.e(), this.f9180b.g(), this.f9180b.i());
                this.f9181c.e().b(this);
            }
        }
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        return b(uri, null, context, kVar);
    }

    public static void c(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String strEmptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        String strEmptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String strEmptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", strEmptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", strEmptyIfNull2, mapHashMap);
        CollectionUtils.putStringIfValid("details", strEmptyIfNull3, mapHashMap);
        if (bVar != null) {
            mapHashMap.putAll(f2.a((AppLovinAdImpl) bVar));
            mapHashMap.putAll(f2.a(bVar));
        }
        kVar.D().d(d2.Z0, mapHashMap);
    }

    public static boolean a(Uri uri, String str, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        boolean z10 = false;
        String strDefaultIfEmpty = null;
        if (uri == null) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return false;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            strDefaultIfEmpty = StringUtils.defaultIfEmpty(str, a(intent, uri, bVar, context));
            intent.setPackage(strDefaultIfEmpty);
            kVar.m0().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Unable to open \"" + uri + "\".", th2);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", uri.toString());
            mapHashMap.put("name", strDefaultIfEmpty);
            if (bVar != null) {
                mapHashMap.putAll(f2.a((AppLovinAdImpl) bVar));
                mapHashMap.putAll(f2.a(bVar));
            }
            if (com.taurusx.tax.g.f0.f66126w.equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) kVar.A().N().get("ps_version"), mapHashMap);
            }
            kVar.D().a("UriUtils", "openUri", th2, mapHashMap);
        }
        if (!z10) {
            kVar.m0().resumeForClick();
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent(z10 ? "com.applovin.external_redirect_success" : "com.applovin.external_redirect_failure"), CollectionUtils.map("url", uri));
        return z10;
    }

    public static boolean b(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        return a(uri, null, bVar, context, kVar);
    }

    public static void b(Uri uri, final com.applovin.impl.sdk.ad.b bVar, final com.applovin.impl.sdk.k kVar) {
        final String queryParameter = uri.getQueryParameter("url");
        if (!StringUtils.isValidString(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find resource URL to preload from query parameters");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), CollectionUtils.map("error", "Invalid URL"));
            return;
        }
        if (bVar == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Cannot preload resource: ad is null");
            }
            Map map = CollectionUtils.map("error", "Invalid ad reference");
            map.put(DownloadModel.RESOURCE_URL, queryParameter);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map);
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("UriUtils", "Attempting to preload resource: " + queryParameter);
        }
        kVar.q0().a((i5) new r6(kVar, false, "preloadResource", new Runnable() { // from class: com.applovin.impl.lb
            @Override // java.lang.Runnable
            public final void run() {
                k7.a(kVar, queryParameter, bVar);
            }
        }), d6.b.CACHING);
    }

    private static String a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (!"market".equals(intent.getScheme()) && !com.taurusx.tax.g.f0.f66126w.equals(uri.getHost())) {
            if ("https".equals(intent.getScheme()) && bVar != null) {
                if (bVar.c1()) {
                    String strJ = com.applovin.impl.sdk.l.J();
                    if (a(strJ, context)) {
                        return strJ;
                    }
                }
                for (String str : bVar.N()) {
                    if (a(str, context)) {
                        return str;
                    }
                }
            }
            return null;
        }
        if (Boolean.FALSE.equals(a(context))) {
            return "com.android.vending";
        }
        return null;
    }

    private static boolean a(String str, Context context) {
        return (TextUtils.isEmpty(str) || context.getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    public static boolean a(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && "com.applovin.sdk".equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        com.applovin.impl.adview.b bVarF = aVar.f();
        String queryParameter = uri.getQueryParameter("n");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find url to load from query in original uri");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return;
        }
        a5 a5VarP0 = kVar.p0();
        z4 z4Var = z4.T;
        String queryParameter2 = (String) a5VarP0.a(z4Var, null);
        if (uri.getQueryParameterNames().contains("browser")) {
            queryParameter2 = uri.getQueryParameter("browser");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = null;
            }
            if (Boolean.parseBoolean(uri.getQueryParameter("retain_browser"))) {
                kVar.p0().b(z4Var, queryParameter2);
            }
        }
        String queryParameter3 = uri.getQueryParameter("load_type");
        if (A1.f40170e.equalsIgnoreCase(queryParameter3)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Loading new page externally: " + queryParameter);
            }
            a(queryParameter, queryParameter2, aVar, kVar);
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter3)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Loading new page in WebView: " + queryParameter);
            }
            bVarF.loadUrl(queryParameter);
            String queryParameter4 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter4)) {
                bVarF.setBackgroundColor(Color.parseColor(queryParameter4));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter3)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Loading new page in slide-up webview: " + queryParameter);
            }
            kVar.e().a(new a(queryParameter, aVar, kVar));
            Intent intent = new Intent(com.applovin.impl.sdk.k.o(), (Class<?>) AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.i0());
            intent.setFlags(268435456);
            com.applovin.impl.sdk.k.o().startActivity(intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter3)) {
            aVar.a(aVar.g(), aVar.i(), null, bVarF.getAndClearLastClickEvent());
            if (aVar.h() != null) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Loading new page in Custom Tabs: " + queryParameter);
                }
                kVar.z().a(Uri.parse(queryParameter), aVar, kVar.u0());
                return;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Custom Tabs not supported, loading new page externally: " + queryParameter);
            }
            a(queryParameter, queryParameter2, aVar, kVar);
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            kVar.f0().e(com.applovin.impl.sdk.network.d.b().d(StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode())).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar, String str, com.applovin.impl.sdk.ad.b bVar) {
        com.applovin.impl.sdk.ad.b bVar2;
        try {
            com.applovin.impl.sdk.m mVarG = kVar.G();
            Context contextO = com.applovin.impl.sdk.k.o();
            bVar2 = bVar;
            try {
                String strA = mVarG.a(com.applovin.impl.sdk.k.o(), str, bVar.getCachePrefix(), bVar.S(), true, mVarG.a(str, bVar2), null, f2.a((AppLovinAdImpl) bVar2));
                if (strA != null) {
                    String string = Uri.fromFile(mVarG.a(strA, contextO)).toString();
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("UriUtils", "Successfully cached resource at: " + string);
                    }
                    Map map = CollectionUtils.map(DownloadModel.RESOURCE_URL, str);
                    map.put("cached_url", string);
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_success"), map);
                    return;
                }
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().k("UriUtils", "Failed to cache resource: " + str);
                }
                Map map2 = CollectionUtils.map("error", "Failed to cache resource");
                map2.put(DownloadModel.RESOURCE_URL, str);
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map2);
            } catch (Throwable th2) {
                th = th2;
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Exception while caching resource", th);
                }
                Map map3 = CollectionUtils.map("url", str);
                map3.putAll(f2.a((AppLovinAdImpl) bVar2));
                map3.putAll(f2.a(bVar2));
                kVar.D().a("UriUtils", "handlePreload", th, map3);
                Map map4 = CollectionUtils.map("error", "Internal error while caching");
                map4.put(DownloadModel.RESOURCE_URL, str);
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map4);
            }
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar) {
        Uri uri2;
        com.applovin.impl.sdk.ad.b bVar2;
        com.applovin.impl.sdk.k kVar2;
        Throwable th2;
        j7 j7Var = new j7();
        Context contextA = a(uri.getQueryParameter("context_source"), appLovinAdView, kVar);
        Intent intent = null;
        try {
            j7Var.f(uri.getQueryParameter("identifier")).d(uri.getQueryParameter("action")).a(uri.getQueryParameter("data"), uri.getQueryParameter("type")).b(uri.getQueryParameter("flags")).e(uri.getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS)).a(uri.getQueryParameter("categories")).a(uri.getQueryParameter("clip_data_uri"), uri.getQueryParameter("clip_data_mime_type"), uri.getQueryParameter("clip_data_label")).h(uri.getQueryParameter("source_bounds")).b(uri.getQueryParameter("component"), uri.getQueryParameter("class_name"), uri.getQueryParameter("package")).g(uri.getQueryParameter("selector_action"));
            if (!(contextA instanceof Activity)) {
                j7Var.b(String.valueOf(268435456));
            }
            Intent intentC = Boolean.parseBoolean(uri.getQueryParameter("use_chooser")) ? j7Var.c(uri.getQueryParameter("chooser_title")) : j7Var.a();
            try {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Attempting to launch intent with configuration:\n" + a(intentC));
                }
                if (intentC.resolveActivity(contextA.getPackageManager()) != null) {
                    contextA.startActivity(intentC);
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("UriUtils", "Successfully launched intent");
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_success"), null);
                    kVar.g().d(d2.f8559a0, a(intentC, uri, bVar));
                    return;
                }
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("UriUtils", "No activity found to handle the intent");
                }
                uri2 = uri;
                bVar2 = bVar;
                kVar2 = kVar;
                try {
                    a("noActivityToHandleIntent", null, uri2, a(intentC, uri, bVar), bVar2, contextA, kVar2);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    intent = intentC;
                    kVar2.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar2.O().a("UriUtils", "Exception while launching intent", th2);
                    }
                    a("intentLaunchException", th2, uri2, a(intent, uri2, bVar2), bVar2, contextA, kVar2);
                }
            } catch (Throwable th4) {
                th = th4;
                uri2 = uri;
                bVar2 = bVar;
                kVar2 = kVar;
            }
        } catch (Throwable th5) {
            uri2 = uri;
            bVar2 = bVar;
            kVar2 = kVar;
            th2 = th5;
        }
    }

    private static Context a(String str, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar) {
        if ("application".equalsIgnoreCase(str)) {
            return com.applovin.impl.sdk.k.o();
        }
        if ("activity".equalsIgnoreCase(str)) {
            Activity activityB = e8.b(appLovinAdView, kVar);
            if (activityB != null) {
                return activityB;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().k("UriUtils", "Could not retrieve the activity context. Falling back to view context.");
            }
        }
        return appLovinAdView.getContext();
    }

    private static void a(String str, Throwable th2, Uri uri, Map map, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_failure"), null);
        HashMap map2 = new HashMap(map);
        if (th2 != null) {
            kVar.D().a("UriUtils", "launchCustomIntent", th2, map);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), map2);
        }
        CollectionUtils.putStringIfValid("source", str, map2);
        kVar.g().d(d2.f8561b0, map2);
        a(uri, bVar, context, kVar);
    }

    private static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("fallback_url");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find fallback URL to open from query parameters");
                return;
            }
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("UriUtils", "Opening fallback URL: " + queryParameter);
        }
        b(Uri.parse(queryParameter), bVar, context, kVar);
    }

    private static Map a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar) {
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("details", a(intent), mapA);
        return mapA;
    }

    private static String a(Intent intent) {
        if (intent == null) {
            return "Intent not available";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Identifier: ");
        sb2.append(o0.i() ? intent.getIdentifier() : null);
        sb2.append("\nAction: ");
        sb2.append(intent.getAction());
        sb2.append("\nData: ");
        sb2.append(intent.getData());
        sb2.append("\nType: ");
        sb2.append(intent.getType());
        sb2.append("\nFlags: ");
        sb2.append(intent.getFlags());
        sb2.append("\nExtras: ");
        sb2.append(intent.getExtras());
        sb2.append("\nCategories: ");
        sb2.append(intent.getCategories());
        sb2.append("\nClipData: ");
        sb2.append(intent.getClipData());
        sb2.append("\nSourceBounds: ");
        sb2.append(intent.getSourceBounds());
        sb2.append("\nComponent: ");
        sb2.append(component != null ? component.flattenToString() : intent.getPackage());
        sb2.append("\nSelector: ");
        sb2.append(intent.getSelector());
        return sb2.toString();
    }

    private static void a(String str, String str2, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        a(Uri.parse(str), str2, aVar.g(), aVar.f().getContext(), kVar);
        t2.b(aVar.e(), aVar.g(), aVar.i());
    }

    public static Boolean a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = true;
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.TRUE;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
