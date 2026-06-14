package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.k;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.h4;
import com.applovin.impl.l2;
import com.applovin.impl.n1;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.v2;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f8256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f8257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f8258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f8259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f8260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f8261g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f8263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CustomTabsSession f8265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f8266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f8267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f8268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WebView f8269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f8270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Runnable f8271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f8272r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f8262h = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f8273s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f8274t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f f8275u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f8276v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f8277w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f8278x = new AtomicBoolean();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f8279y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f8280z = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    class C0165a extends t4 {
        C0165a() {
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    public interface b {
        void a(a aVar);
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f8268n != null) {
                a.this.f8268n.setVisibility(8);
            }
        }

        /* synthetic */ c(a aVar, C0165a c0165a) {
            this();
        }
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        class C0166a implements k.a {
            C0166a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f8268n.addView(a.this.f8270p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.o unused = a.this.f8259e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f8259e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f8273s != null) {
                if (a.this.f8268n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f8273s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.this.C, a.this.f8273s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f8257c.g().a(d2.F, a.this.f8273s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f8259e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f8259e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f8273s.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                a.b(a.this.f8268n, a.this.f8273s.getSize());
                if (a.this.f8270p != null) {
                    e8.c(a.this.f8270p);
                    a.this.f8270p = null;
                }
                c2 c2Var = new c2(a.this.f8262h, a.this.f8257c);
                if (c2Var.c()) {
                    a.this.f8270p = new k(c2Var, a.this.f8255a);
                    a.this.f8270p.a(new C0166a());
                }
                a.this.f8268n.setAdHtmlLoaded(false);
                a.this.f8268n.a(a.this.f8273s);
                if (a.this.f8273s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f8280z) {
                    return;
                }
                a.this.f8273s.setHasShown(true);
            }
        }

        /* synthetic */ d(a aVar, C0165a c0165a) {
            this();
        }
    }

    static class e implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f8285a;

        e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f8285a = aVar;
        }

        private a a() {
            return this.f8285a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i10);
            }
        }
    }

    private void E() {
        if (this.f8259e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", "Destroying...");
        }
        o8.b(this.f8268n);
        this.f8268n = null;
        o8.b(this.f8269o);
        this.f8269o = null;
        this.f8265k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f8280z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f8273s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!n7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.f8257c);
        v2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.f8273s.P0()) {
            int iC = this.f8257c.p().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f8268n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f8268n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (n7.a(this.f8263i)) {
            if (((Boolean) this.f8257c.a(x4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f8257c.a(x4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f8257c.a(x4.G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f8257c.a(x4.H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f8261g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f8273s != null && this.f8273s.r0()) {
            com.applovin.impl.g.a(this.f8268n, this.f8257c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f8279y) {
            if (this.f8273s == null || !this.f8273s.Z0()) {
                t2.b(this.B, this.f8273s);
            }
            if (this.f8273s != null && this.f8273s.isOpenMeasurementEnabled() && n7.a(this.f8273s.getSize())) {
                this.f8273s.getAdEventTracker().f();
            }
            if (this.f8268n != null && this.f8275u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8259e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8259e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f8279y || this.f8280z) {
            return;
        }
        this.f8280z = true;
    }

    public void F() {
        if (this.f8279y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f8277w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f8280z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8372b.t();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void w() {
        if ((this.f8255a instanceof n1) && this.f8273s != null && this.f8273s.K() == b.EnumC0180b.DISMISS) {
            ((n1) this.f8255a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f8275u != null || this.f8276v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", "Ad: " + this.f8273s + " closed.");
        }
        a(this.f8272r);
        t2.b(this.B, this.f8273s);
        this.f8273s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension2;
        layoutParams.height = iApplyDimension;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f8368b.r();
            }
        });
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f8268n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f8256b == null || (bVar = this.f8268n) == null || bVar.getParent() != null) {
            return;
        }
        this.f8256b.addView(this.f8268n);
        b(this.f8268n, this.f8273s.getSize());
        if (this.f8273s.isOpenMeasurementEnabled()) {
            this.f8273s.getAdEventTracker().a((View) this.f8268n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f8268n != null && this.f8275u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f8275u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8259e.a("AppLovinAdView", "Detaching expanded ad: " + this.f8275u.b());
            }
            this.f8276v = this.f8275u;
            this.f8275u = null;
            a(this.f8263i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f8276v;
        if (fVar == null && this.f8275u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f8276v.dismiss();
            this.f8276v = null;
        } else {
            aVarB = this.f8275u.b();
            this.f8275u.dismiss();
            this.f8275u = null;
        }
        t2.a(this.C, aVarB, (AppLovinAdView) this.f8256b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f8268n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f8273s;
    }

    public CustomTabsSession h() {
        return this.f8265k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f8256b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f8257c;
    }

    public AppLovinAdSize k() {
        return this.f8263i;
    }

    public String l() {
        return this.f8264j;
    }

    public void u() {
        if (this.f8257c == null || this.f8267m == null || this.f8255a == null || !this.f8279y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f8258d.loadNextAd(this.f8264j, this.f8263i, this.f8267m);
        }
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f8362b.s();
            }
        });
    }

    public void c(int i10) {
        String strA = e8.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b("javascript:al_onWindowVisibilityChanged( " + strA + " );");
    }

    private void d(String str, Map map) {
        a(o8.d(str, map));
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(o8.c(str, map));
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f8257c = kVar;
            this.f8258d = kVar.k();
            this.f8259e = kVar.O();
            this.f8260f = AppLovinCommunicator.getInstance(context);
            this.f8263i = appLovinAdSize;
            this.f8264j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f8255a = context;
            this.f8256b = appLovinAdView;
            this.f8266l = new com.applovin.impl.adview.c(this, kVar);
            C0165a c0165a = null;
            this.f8272r = new c(this, c0165a);
            this.f8271q = new d(this, c0165a);
            this.f8267m = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.adview.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f8369b.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f8273s.getAdEventTracker().c(webView);
        k kVar = this.f8270p;
        if (kVar != null && kVar.a()) {
            f4 adEventTracker = this.f8273s.getAdEventTracker();
            k kVar2 = this.f8270p;
            adEventTracker.b(webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f8273s.getAdEventTracker().a((View) webView);
        }
        this.f8273s.getAdEventTracker().h();
        this.f8273s.getAdEventTracker().g();
    }

    protected void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f8266l, this.f8257c, this.f8255a);
            this.f8268n = bVar;
            bVar.setBackgroundColor(0);
            this.f8268n.setWillNotCacheDrawing(false);
            this.f8256b.setBackgroundColor(0);
            this.f8256b.addView(this.f8268n);
            b(this.f8268n, appLovinAdSize);
            if (!this.f8279y) {
                a(this.f8272r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8286b.o();
                }
            });
            this.f8279y = true;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th2);
            this.f8257c.D().a("AppLovinAdView", "initAdWebView", th2);
            this.f8278x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f8275u == null && (this.f8273s instanceof com.applovin.impl.sdk.ad.a) && this.f8268n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f8273s;
            Context context = this.f8255a;
            Activity activityB = context instanceof Activity ? (Activity) context : e8.b(this.f8268n, this.f8257c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f8256b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f8268n);
                }
                f fVar = new f(aVar2, this.f8268n, activityB, this.f8257c);
                this.f8275u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.z
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f8376b.a(dialogInterface);
                    }
                });
                this.f8275u.show();
                t2.c(this.C, this.f8273s, (AppLovinAdView) this.f8256b);
                if (this.f8273s.isOpenMeasurementEnabled()) {
                    this.f8273s.getAdEventTracker().a((View) this.f8275u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriE1 = aVar2.e1();
            if (uriE1 != null) {
                aVar = this;
                this.f8258d.trackAndLaunchClick(aVar2, i(), aVar, uriE1, motionEvent);
            } else {
                aVar = this;
            }
            aVar.f8268n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                u();
            }
        }
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f8280z) {
                c(appLovinAd);
            } else {
                this.f8277w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8259e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8317b.a(appLovinAd);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f8262h.put(str, obj);
    }

    public void a(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8259e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            n7.b(appLovinAd, this.f8257c);
            if (this.f8279y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f8257c.g().d(d2.C, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) n7.a(appLovinAd, this.f8257c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    t2.a(this.B, "Unable to retrieve the loaded ad");
                    Map mapA2 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f8257c.g().d(d2.F, mapA2);
                    return;
                }
                if (bVar == this.f8273s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f8257c.a(x4.I1)).booleanValue()) {
                        if (this.B instanceof l2) {
                            t2.a(this.B, "Attempting to show ad again");
                        } else if (!n7.c(this.f8257c)) {
                            this.f8257c.g().a(d2.S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f8257c.g().a(d2.F, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8259e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                t2.b(this.B, this.f8273s);
                if (this.f8273s != null && this.f8273s.isOpenMeasurementEnabled()) {
                    this.f8273s.getAdEventTracker().f();
                }
                this.f8277w.set(null);
                this.f8274t = null;
                this.f8273s = bVar;
                if (this.f8273s.isCustomTabsEnabled()) {
                    this.f8265k = this.f8257c.z().a(this);
                    this.f8257c.z().b(this.f8273s.getCustomTabsWarmupUrls(), this.f8265k);
                }
                if (!this.f8280z && n7.a(this.f8263i)) {
                    this.f8257c.k().trackImpression(bVar);
                }
                if (this.f8275u != null) {
                    c();
                }
                a(this.f8271q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        if (!this.f8280z) {
            a(this.f8272r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f8370b.a(i10);
            }
        });
    }

    private void b(String str) {
        if (((Boolean) this.f8257c.a(x4.E1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(o8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f8273s != null && this.f8273s.w0() && this.f8269o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f8257c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8257c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f8255a);
            this.f8269o = webView;
            webView.setWebViewClient(new C0165a());
            this.f8269o.getSettings().setJavaScriptEnabled(true);
            this.f8269o.loadDataWithBaseURL((String) this.f8257c.a(x4.f11339i7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void a(final WebView webView, String str) {
        if (this.f8273s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.p
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.f8257c.a(x4.f11470y6)).booleanValue() || (str != null && str.startsWith(this.f8273s.k()))) {
            try {
                if (this.f8273s != this.f8274t) {
                    this.f8274t = this.f8273s;
                    x();
                    this.f8268n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f8257c.y().d(this.f8273s);
                        if (this.f8273s.s0()) {
                            this.f8257c.g().a(d2.E, this.f8273s, CollectionUtils.hashMap("details", f2.b(this.f8273s)));
                        } else {
                            this.f8257c.g().a(d2.D, this.f8273s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f8273s.z())));
                            t2.a(this.B, this.f8273s);
                        }
                        if (this.f8273s.Q0()) {
                            String str2 = (String) this.f8257c.p0().a(z4.T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f8268n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f8268n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f8273s.s0()) {
                            this.f8268n.a("javascript:al_onAdRestored( '" + this.f8273s.X() + "' );");
                        }
                    }
                    if ((this.f8273s instanceof com.applovin.impl.sdk.ad.a) && this.f8273s.isOpenMeasurementEnabled()) {
                        this.f8257c.q0().a(new r6(this.f8257c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f8366b.b(webView);
                            }
                        }), d6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th2);
                com.applovin.impl.sdk.k kVar = this.f8257c;
                if (kVar != null) {
                    kVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th2);
                }
            }
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f8364b.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f8363b.p();
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f8258d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (com.applovin.impl.sdk.o.a()) {
                aVar.f8259e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        t2.a(aVar.D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f8278x.compareAndSet(true, false)) {
            a(this.f8263i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th2.getMessage());
            com.applovin.impl.sdk.k kVar = this.f8257c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadedCallback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th2);
            com.applovin.impl.sdk.k kVar = this.f8257c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th2);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f8261g = bVar;
    }

    private void a(String str, Map map) {
        a(o8.a(str, map));
    }

    private void a(String str) {
        if (this.f8273s == null || this.f8268n == null || !n7.a(this.f8273s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f8268n.a(str);
    }

    public void a(Uri uri) {
        if (this.f8273s == null || !this.f8273s.w0()) {
            return;
        }
        if (this.f8269o == null) {
            this.f8257c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8257c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter(com.taurusx.tax.w.s.s.I);
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f8257c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8257c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f8373b.a(queryParameter2, queryParameter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.f8257c.a(x4.Q2)).booleanValue()) {
            o8.a(this.f8269o, str3, this.f8257c);
        } else {
            o8.a(this.f8269o, str3);
        }
    }
}
