package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f8832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f8833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f8834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f8835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f8836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected AdSession f8837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected AdEvents f8838g;

    public f4(AppLovinAdBase appLovinAdBase) {
        this.f8832a = appLovinAdBase;
        this.f8833b = appLovinAdBase.getSdk();
        this.f8834c = appLovinAdBase.getSdk().O();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + appLovinAdBase.getDspName();
        }
        this.f8835d = str;
    }

    protected abstract AdSessionConfiguration a();

    protected abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.oa
            @Override // java.lang.Runnable
            public final void run() {
                this.f10044b.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f8832a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8834c.d(this.f8835d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f8837f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8834c.k(this.f8835d, "Attempting to start session again for ad: " + this.f8832a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8834c.a(this.f8835d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f8837f = adSessionCreateAdSession;
            try {
                this.f8838g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f8837f);
                this.f8837f.start();
                this.f8836e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8834c.a(this.f8835d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8834c.a(this.f8835d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8834c.a(this.f8835d, "Failed to create session", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8838g.loaded();
    }

    protected void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ma
            @Override // java.lang.Runnable
            public final void run() {
                this.f9349b.b(webView);
            }
        });
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.qa
            @Override // java.lang.Runnable
            public final void run() {
                this.f10248b.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.pa
            @Override // java.lang.Runnable
            public final void run() {
                this.f10128b.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f8838g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f8837f.registerAdView(view);
        this.f8837f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f8837f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8834c.a(this.f8835d, "Failed to add friendly obstruction (" + h4Var + ")", th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f8837f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f8836e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8834c.a(this.f8835d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8834c.a(this.f8835d, "Failed to run operation: " + str, th2);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.na
            @Override // java.lang.Runnable
            public final void run() {
                this.f9907b.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.ka
            @Override // java.lang.Runnable
            public final void run() {
                this.f9186b.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f8836e = false;
        this.f8837f.finish();
        this.f8837f = null;
        this.f8838g = null;
    }

    protected void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.la
            @Override // java.lang.Runnable
            public final void run() {
                this.f9277b.a(str, runnable);
            }
        });
    }
}
