package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f9900a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f9904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f9905f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f9901b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f9902c = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f9906g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null && ((Boolean) kVar.a(x4.f11291d4)).booleanValue() && e()) {
            f9900a = (String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o());
        } else {
            f9900a = "";
            a5.b(z4.M, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void a(final com.applovin.impl.sdk.k kVar) {
        if (f9902c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wc
            @Override // java.lang.Runnable
            public final void run() {
                n8.d(kVar);
            }
        });
    }

    public static String b() {
        return f9905f;
    }

    public static String c() {
        return f9904e;
    }

    public static int d() {
        return f9903d;
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f9906g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f9903d = packageInfoC.versionCode;
            f9904e = packageInfoC.versionName;
            f9905f = packageInfoC.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (o0.g()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(x4.f11388o4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (f9901b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f9900a = defaultUserAgent;
                        a5.b(z4.M, f9900a, com.applovin.impl.sdk.k.o());
                    } else {
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        kVar.D().a(d2.f8562b1, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th3);
            }
            kVar.D().a("WebViewDataCollector", "collectUserAgent", th3);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f9901b) {
            zIsValidString = StringUtils.isValidString((String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f9901b) {
            str = f9900a;
        }
        return str;
    }
}
