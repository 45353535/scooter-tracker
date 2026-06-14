package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.C;
import com.ironsource.Ag;
import com.ironsource.B1;
import com.ironsource.Be;
import com.ironsource.C4240b4;
import com.ironsource.C4274d4;
import com.ironsource.C4280da;
import com.ironsource.C4291e4;
import com.ironsource.C4326g5;
import com.ironsource.C4331ga;
import com.ironsource.C4346h8;
import com.ironsource.C4347h9;
import com.ironsource.C4359i4;
import com.ironsource.C4371j0;
import com.ironsource.C4409l4;
import com.ironsource.C4449n8;
import com.ironsource.C4462o4;
import com.ironsource.C4500q8;
import com.ironsource.C4509r1;
import com.ironsource.C4516r8;
import com.ironsource.C4533s8;
import com.ironsource.C4584v8;
import com.ironsource.C4618x8;
import com.ironsource.C4631y4;
import com.ironsource.C4652z8;
import com.ironsource.D5;
import com.ironsource.EnumC4380j9;
import com.ironsource.H8;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4243b7;
import com.ironsource.InterfaceC4260c7;
import com.ironsource.InterfaceC4342h4;
import com.ironsource.InterfaceC4451na;
import com.ironsource.InterfaceC4496q4;
import com.ironsource.InterfaceC4518ra;
import com.ironsource.InterfaceC4529s4;
import com.ironsource.InterfaceC4543t1;
import com.ironsource.InterfaceC4546t4;
import com.ironsource.InterfaceC4563u4;
import com.ironsource.InterfaceC4580v4;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.Kb;
import com.ironsource.L;
import com.ironsource.Lc;
import com.ironsource.N6;
import com.ironsource.Nc;
import com.ironsource.Oc;
import com.ironsource.Pc;
import com.ironsource.S7;
import com.ironsource.V3;
import com.ironsource.V4;
import com.ironsource.W4;
import com.ironsource.Wf;
import com.ironsource.X1;
import com.ironsource.X3;
import com.ironsource.Xd;
import com.ironsource.Y0;
import com.ironsource.Y3;
import com.ironsource.Y6;
import com.ironsource.Yc;
import com.ironsource.Yd;
import com.ironsource.Z0;
import com.ironsource.Z4;
import com.ironsource.Zc;
import com.ironsource.dg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.om;
import com.ironsource.qk;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.m;
import com.ironsource.sdk.controller.p;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.zg;
import com.unity3d.ironsourceads.internal.services.a;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.model.AdPayload;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class v implements com.ironsource.sdk.controller.l, Lc, DownloadListener {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f45261b0 = "about:blank";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static int f45262c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static String f45263d0 = "is_store";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static String f45264e0 = "external_url";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static String f45265f0 = "secondary_web_view";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static String f45266g0 = "success";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static String f45267h0 = "fail";
    private String A;
    private com.ironsource.sdk.controller.d B;
    private dg C;
    private Z0 D;
    private W4 G;
    private com.ironsource.sdk.controller.o H;
    private com.ironsource.sdk.controller.q I;
    private com.ironsource.sdk.controller.u J;
    private com.ironsource.sdk.controller.i K;
    private com.ironsource.sdk.controller.a L;
    private com.ironsource.sdk.controller.j M;
    private C4509r1 N;
    private C4631y4 O;
    private zg P;
    private com.ironsource.sdk.controller.c Q;
    private V3 R;
    private JSONObject S;
    private l.a T;
    private l.b U;
    private C4409l4 V;
    private boolean W;
    C4291e4 Y;
    final C4331ga Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S7 f45268a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Nc f45269a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4342h4 f45270b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f45274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f45275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C4326g5 f45276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p f45278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f45279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CountDownTimer f45280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CountDownTimer f45281m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o f45285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f45286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private FrameLayout f45287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f45288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f45289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u f45290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f45291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC4580v4 f45292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC4563u4 f45293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private InterfaceC4546t4 f45294z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45271c = v.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45272d = "IronSource";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45273e = "We're sorry, some error occurred. we will investigate it";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f45282n = 50;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f45283o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f45284p = C4240b4.e.f42562b;
    private Object E = new Object();
    private boolean F = false;
    private final InterfaceC4634y7 X = Ib.U().i();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4516r8 f45296a;

        b(C4516r8 c4516r8) {
            this.f45296a = c4516r8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.Q.c("controller html - failed to download - " + this.f45296a.b());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f45298a;

        c(Context context) {
            this.f45298a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f45298a);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f45300a;

        d(Context context) {
            this.f45300a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f45300a);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4500q8.e f45302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45303b;

        e(C4500q8.e eVar, String str) {
            this.f45302a = eVar;
            this.f45303b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4529s4 interfaceC4529s4A;
            C4500q8.e eVar = this.f45302a;
            if ((eVar == C4500q8.e.RewardedVideo || eVar == C4500q8.e.Interstitial) && (interfaceC4529s4A = v.this.a(eVar)) != null) {
                interfaceC4529s4A.b(this.f45302a, this.f45303b);
            }
        }
    }

    class g implements zg {
        g() {
        }

        @Override // com.ironsource.zg
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f45307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f45308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45309c;

        h(JSONObject jSONObject, WebView webView, String str) {
            this.f45307a = jSONObject;
            this.f45308b = webView;
            this.f45309c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f45307a, this.f45308b);
            v.this.m("about:blank");
            v.this.m(this.f45309c);
        }
    }

    class i extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45311a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Q.c(C4240b4.c.f42531j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j10, long j11, int i10) {
            super(j10, j11);
            this.f45311a = i10;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f45271c, "Loading Controller Timer Finish");
            int i10 = this.f45311a;
            if (i10 == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i10 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(v.this.f45271c, "Loading Controller Timer Tick " + j10);
        }
    }

    class j implements s {
        j() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C4500q8.e eVar, V4 v42) {
            v.this.a(str, eVar, v42);
        }
    }

    class k implements s {
        k() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C4500q8.e eVar, V4 v42) {
            v.this.a(str, eVar, v42);
        }
    }

    class l implements s {
        l() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C4500q8.e eVar, V4 v42) {
            v.this.a(str, eVar, v42);
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4500q8.e f45317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4 f45318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45319c;

        m(C4500q8.e eVar, V4 v42, String str) {
            this.f45317a = eVar;
            this.f45318b = v42;
            this.f45319c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            V4 v42;
            C4500q8.e eVar = C4500q8.e.RewardedVideo;
            C4500q8.e eVar2 = this.f45317a;
            if ((eVar != eVar2 && C4500q8.e.Interstitial != eVar2 && C4500q8.e.Banner != eVar2) || (v42 = this.f45318b) == null || TextUtils.isEmpty(v42.h())) {
                return;
            }
            InterfaceC4529s4 interfaceC4529s4A = v.this.a(this.f45317a);
            Log.d(v.this.f45271c, "onAdProductInitFailed (message:" + this.f45319c + ")(" + this.f45317a + ")");
            if (interfaceC4529s4A != null) {
                interfaceC4529s4A.a(this.f45317a, this.f45318b.h(), this.f45319c);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    private class o extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new q());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = v.this.f45286r;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            v vVar = v.this;
            vVar.f45287s.removeView(vVar.f45286r);
            v vVar2 = v.this;
            vVar2.f45286r = null;
            vVar2.f45287s.setVisibility(8);
            v.this.f45288t.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.f45286r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.f45287s.addView(view);
            v vVar = v.this;
            vVar.f45286r = view;
            vVar.f45288t = customViewCallback;
            vVar.f45287s.setVisibility(0);
        }

        private o() {
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C4500q8.e f45323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f45324b;

        public p(C4500q8.e eVar, String str) {
            this.f45323a = eVar;
            this.f45324b = str;
        }

        String a() {
            return this.f45324b;
        }

        C4500q8.e b() {
            return this.f45323a;
        }
    }

    private class q extends WebViewClient {
        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.f45271c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextP = v.this.p();
            contextP.startActivity(new OpenUrlActivity.e(new k.c()).a(str).b(false).a(contextP));
            return true;
        }

        private q() {
        }
    }

    public class r {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45328b;

            a(String str, String str2) {
                this.f45327a = str;
                this.f45328b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f45327a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f45271c, "onRVShowFail(message:" + this.f45327a + ")");
                v.this.f45292x.b(this.f45328b, str);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45330a;

            b(String str) {
                this.f45330a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f45271c, "onInterstitialInitSuccess()");
                v.this.f45293y.a(C4500q8.e.Interstitial, this.f45330a, (Y0) null);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45333b;

            c(String str, String str2) {
                this.f45332a = str;
                this.f45333b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f45332a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f45271c, "onInterstitialInitFail(message:" + str + ")");
                v.this.f45293y.a(C4500q8.e.Interstitial, this.f45333b, str);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC4529s4 f45335a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4500q8.e f45336b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f45337c;

            d(InterfaceC4529s4 interfaceC4529s4, C4500q8.e eVar, String str) {
                this.f45335a = interfaceC4529s4;
                this.f45336b = eVar;
                this.f45337c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f45335a.a(this.f45336b, this.f45337c);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JSONObject f45340b;

            e(String str, JSONObject jSONObject) {
                this.f45339a = str;
                this.f45340b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f45293y.a(this.f45339a, this.f45340b);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45343b;

            f(String str, String str2) {
                this.f45342a = str;
                this.f45343b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f45342a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f45293y.a(this.f45343b, str);
            }
        }

        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45345a;

            g(String str) {
                this.f45345a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f45271c, "onBannerInitSuccess()");
                v.this.f45294z.a(C4500q8.e.Banner, this.f45345a, (Y0) null);
            }
        }

        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45348b;

            h(String str, String str2) {
                this.f45347a = str;
                this.f45348b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f45347a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f45271c, "onBannerInitFail(message:" + str + ")");
                v.this.f45294z.a(C4500q8.e.Banner, this.f45348b, str);
            }
        }

        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4346h8 f45351b;

            i(String str, C4346h8 c4346h8) {
                this.f45350a = str;
                this.f45351b = c4346h8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f45271c, "onBannerLoadSuccess()");
                v.this.f45294z.a(this.f45350a, this.f45351b);
            }
        }

        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45354b;

            j(String str, String str2) {
                this.f45353a = str;
                this.f45354b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f45271c, "onLoadBannerFail()");
                String str = this.f45353a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f45294z.c(this.f45354b, str);
            }
        }

        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        class l implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45357a;

            l(String str) {
                this.f45357a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f45357a).has(f.b.f45108b)) {
                        v.this.T.a(f.a.a(this.f45357a));
                    } else {
                        v.this.U.a(Kb.a(this.f45357a));
                    }
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    Logger.e(v.this.f45271c, "failed to parse received message");
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        class m implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4500q8.e f45359a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45360b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f45361c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ JSONObject f45362d;

            m(C4500q8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f45359a = eVar;
                this.f45360b = str;
                this.f45361c = str2;
                this.f45362d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC4529s4 interfaceC4529s4A;
                C4500q8.e eVar = this.f45359a;
                if ((eVar == C4500q8.e.Interstitial || eVar == C4500q8.e.RewardedVideo || eVar == C4500q8.e.Banner) && (interfaceC4529s4A = v.this.a(eVar)) != null) {
                    interfaceC4529s4A.a(this.f45359a, this.f45360b, this.f45361c, this.f45362d);
                }
            }
        }

        class n implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45364a;

            n(String str) {
                this.f45364a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.f45271c, "omidAPI(" + this.f45364a + ")");
                    v.this.H.a(new Yd(this.f45364a).toString(), r.this.new w());
                } catch (Exception e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f45271c, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        class o implements Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(C4240b4.f42476e);
            }
        }

        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.getSettings().setMixedContentMode(0);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$r, reason: collision with other inner class name */
        class RunnableC0478r implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f45369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Y0 f45371c;

            RunnableC0478r(int i10, String str, Y0 y02) {
                this.f45369a = i10;
                this.f45370b = str;
                this.f45371c = y02;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f45369a <= 0) {
                    v.this.f45292x.c(this.f45370b);
                } else {
                    Log.d(v.this.f45271c, "onRVInitSuccess()");
                    v.this.f45292x.a(C4500q8.e.RewardedVideo, this.f45370b, this.f45371c);
                }
            }
        }

        class s implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45373a;

            s(String str) {
                this.f45373a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.M.a(new JSONObject(this.f45373a), r.this.new w());
                } catch (Exception e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f45271c, "fileSystemAPI failed with exception " + e10.getMessage());
                }
            }
        }

        class t implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45376b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f45377c;

            t(String str, String str2, int i10) {
                this.f45375a = str;
                this.f45376b = str2;
                this.f45377c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f45375a.equalsIgnoreCase(C4500q8.e.RewardedVideo.toString())) {
                    v.this.f45292x.a(this.f45376b, this.f45377c);
                }
            }
        }

        class u implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45379a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f45380b;

            u(String str, int i10) {
                this.f45379a = str;
                this.f45380b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f45293y.onInterstitialAdRewarded(this.f45379a, this.f45380b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$v, reason: collision with other inner class name */
        class RunnableC0479v implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f45383b;

            RunnableC0479v(String str, String str2) {
                this.f45382a = str;
                this.f45383b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f45382a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f45271c, "onRVInitFail(message:" + str + ")");
                v.this.f45292x.a(C4500q8.e.RewardedVideo, this.f45383b, str);
            }
        }

        public r() {
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.f45271c, "adClicked(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d(C4240b4.i.f42638m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C4500q8.e eVarG = v.this.g(strD);
            InterfaceC4529s4 interfaceC4529s4A = v.this.a(eVarG);
            if (eVarG == null || interfaceC4529s4A == null) {
                return;
            }
            v.this.b(new d(interfaceC4529s4A, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.f45272d, "adCredited(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d(C4240b4.i.f42634k);
            int i10 = strD != null ? Integer.parseInt(strD) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            String strD2 = yd2.d(C4240b4.i.f42638m);
            if (TextUtils.isEmpty(strD2)) {
                Log.d(v.this.f45272d, "adCredited | product type is missing");
            }
            if (C4500q8.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i10);
            } else if (v.this.r(strD2)) {
                v.this.b(new t(strD2, strFetchDemandSourceId, i10));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.f45271c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Yd(str));
            Y0 y02 = new Y0(str);
            if (!y02.g()) {
                v.this.a(str, false, C4240b4.c.f42539r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = y02.d();
            if (C4500q8.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.r(strD)) {
                v.this.b(new RunnableC0478r(Integer.parseInt(y02.c()), strFetchDemandSourceId, y02));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.f45271c, "adViewAPI(" + str + ")");
                v.this.L.a(new Yd(str).toString(), new w());
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f45271c, "adViewAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            S7.f41731a.b(new Runnable() { // from class: com.ironsource.sdk.controller.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45154b.b(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f45271c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C4500q8.e eVarG;
            try {
                Logger.i(v.this.f45271c, "cleanAdInstance(" + str + ")");
                Yd yd2 = new Yd(str);
                String strD = yd2.d(C4240b4.i.f42638m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.G.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = C4280da.e().a();
                Yd yd2 = new Yd(str);
                if (!arrayListA.isEmpty()) {
                    yd2.b(C4240b4.i.f42661x0, arrayListA.toString());
                }
                v.this.a(yd2.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        void d(String str) {
            v.this.i(v.this.a(C4240b4.h.f42589e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                Logger.i(v.this.f45271c, "deleteFile(" + str + ")");
                Yd yd2 = new Yd(str);
                String strD = yd2.d(C4240b4.i.f42616b);
                String strD2 = yd2.d("path");
                if (strD2 != null && !TextUtils.isEmpty(strD)) {
                    C4652z8 c4652z8 = new C4652z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(c4652z8, v.this.A);
                    if (!c4652z8.exists()) {
                        v.this.a(str, false, C4240b4.c.f42527f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c4652z8), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, C4240b4.c.f42528g, "1");
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                Logger.i(v.this.f45271c, "deleteFolder(" + str + ")");
                String strD = new Yd(str).d("path");
                if (strD == null) {
                    v.this.a(str, false, C4240b4.c.f42528g, "1");
                    return;
                }
                C4652z8 c4652z8 = new C4652z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD));
                IronSourceStorageUtils.ensurePathSafety(c4652z8, v.this.A);
                if (!c4652z8.exists()) {
                    v.this.a(str, false, C4240b4.c.f42526e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c4652z8.getPath()), (String) null, (String) null);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.f45271c, "destroyInlineStore() called");
            try {
                a.AbstractC0843a abstractC0843aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), EnumC4380j9.f43409b.a(new Yd(str).a(C4240b4.f.f42572e, EnumC4380j9.APP_ACTIVITY.b())));
                if (abstractC0843aA instanceof a.AbstractC0843a.C0844a) {
                    v.this.a(str, false, ((a.AbstractC0843a.C0844a) abstractC0843aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.f45271c, "deviceDataAPI(" + str + ")");
                v.this.K.a(new Yd(str).toString(), new w());
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f45271c, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.i(v.this.f45271c, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            Yd yd2 = new Yd(str);
            boolean zBooleanValue = ((Boolean) yd2.b("display")).booleanValue();
            String strD = yd2.d(C4240b4.i.f42638m);
            boolean zC = yd2.c(C4240b4.i.f42654u);
            String strD2 = yd2.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            boolean zC2 = yd2.c(C4240b4.i.f42665z0);
            if (!zBooleanValue) {
                v.this.a(u.Gone);
                v.this.n();
                return;
            }
            v.this.F = yd2.c(C4240b4.i.f42656v);
            boolean zC3 = yd2.c(C4240b4.i.f42662y);
            u uVarU = v.this.u();
            u uVar = u.Display;
            if (uVarU == uVar) {
                Logger.i(v.this.f45271c, "State: " + v.this.f45290v);
                return;
            }
            v.this.a(uVar);
            Logger.i(v.this.f45271c, "State: " + v.this.f45290v);
            Context contextP = v.this.p();
            String strS = v.this.s();
            int iK = v.this.X.K(contextP);
            if (zC) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(contextP);
                hVar.addView(v.this.f45289u);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextP, (Class<?>) InterstitialActivity.class) : new Intent(contextP, (Class<?>) ControllerActivity.class);
            C4500q8.e eVar = C4500q8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strS)) {
                    strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                }
                intent.putExtra(C4240b4.i.f42638m, eVar.toString());
                v.this.D.a(eVar.ordinal());
                v.this.D.f(strFetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.f45292x.c(eVar, strFetchDemandSourceId);
                }
            } else {
                C4500q8.e eVar2 = C4500q8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strS)) {
                        strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                    }
                    intent.putExtra(C4240b4.i.f42638m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(C4240b4.i.f42665z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra(C4240b4.i.f42656v, v.this.F);
            intent.putExtra(C4240b4.i.A, strS);
            intent.putExtra(C4240b4.i.B, iK);
            v vVar = v.this;
            vVar.f45278j = new p(vVar.g(strD), strFetchDemandSourceId);
            contextP.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.i(v.this.f45271c, "dsSharedSignalsAPI(" + str + ")");
                v.this.O.a(new Yd(str).toString(), new w());
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f45271c, "dsSharedSignalsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.i(v.this.f45271c, "fileSystemAPI(" + str + ")");
            v.this.a(new s(str));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.B(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getApplicationInfo("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.f0(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = com.ironsource.sdk.controller.v.d0(r1, r5)
                com.ironsource.Yd r2 = new com.ironsource.Yd
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.v r3 = com.ironsource.sdk.controller.v.this
                java.lang.Object[] r5 = com.ironsource.sdk.controller.v.j0(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L58
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L5f
                r0 = r1
                goto L60
            L58:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5f
                goto L60
            L5f:
                r0 = 0
            L60:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L75
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.Y(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.l0(r0, r5)
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.r.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            Logger.i(v.this.f45271c, "getCachedFilesMap(" + str + ")");
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            Yd yd2 = new Yd(str);
            if (!yd2.a("path")) {
                v.this.a(str, false, C4240b4.c.f42540s, (String) null);
                return;
            }
            String str2 = (String) yd2.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.A, str2)) {
                v.this.a(str, false, C4240b4.c.f42541t, (String) null);
                return;
            }
            v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.A, str2), C4240b4.h.f42604s, C4240b4.h.f42603r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strE;
            Logger.i(v.this.f45271c, "getConnectivityInfo(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d(v.f45266g0);
            String strD2 = yd2.d(v.f45267h0);
            JSONObject jSONObject = new JSONObject();
            v vVar = v.this;
            V3 v32 = vVar.R;
            if (v32 != null) {
                jSONObject = v32.a(vVar.Z.getContext());
            }
            if (jSONObject.length() > 0) {
                strE = v.this.e(strD, jSONObject.toString());
            } else {
                strE = v.this.e(strD2, v.this.a("errMsg", C4240b4.c.A, null, null, null, null, null, null, null, false));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.f45271c, "getControllerConfig(" + str + ")");
            String strD = new Yd(str).d(v.f45266g0);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String strD;
            Logger.i(v.this.f45271c, "getMediationState(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD2 = yd2.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            String strD3 = yd2.d(C4240b4.i.f42638m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                C4500q8.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    V4 v4A = v.this.G.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C4240b4.i.f42638m, strD3);
                    jSONObject.put("demandSourceName", strD2);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (v4A == null || v4A.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObject.put("state", v4A.j());
                    }
                    a(strD, jSONObject.toString());
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.B(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getDeviceStatus("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.f0(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r5 = com.ironsource.sdk.controller.v.d0(r1, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                com.ironsource.ga r2 = r1.Z
                android.content.Context r2 = r2.getContext()
                java.lang.Object[] r1 = com.ironsource.sdk.controller.v.e0(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L4f
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L56
                r0 = r5
                goto L57
            L4f:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L56
                goto L57
            L56:
                r0 = 0
            L57:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L6c
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.Y(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.l0(r0, r5)
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.r.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.i(v.this.f45271c, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.Z.getContext();
                float fA = Z4.b(context).a(context);
                Yd yd2 = new Yd(str);
                yd2.b(C4240b4.j.P, String.valueOf(fA));
                v.this.a(yd2.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.f45271c, "getInitSummery(" + str + ")");
            Yd yd2 = new Yd(str);
            yd2.a(C4240b4.j.f42703s0, v.this.S);
            v.this.a(yd2.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C4618x8.a(Xd.f42092z, new C4533s8().a(D5.f40578y, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, C4240b4.h.X, C4240b4.h.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.f45271c, "getUserData(" + str + ")");
            Yd yd2 = new Yd(str);
            if (!yd2.a(C4240b4.i.W)) {
                v.this.a(str, false, C4240b4.c.F, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = yd2.d(C4240b4.i.W);
            v.this.i(v.this.e(strE, v.this.a(strD, C4280da.e().a(strD), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.f45271c, "iabTokenAPI(" + str + ")");
                v.this.J.a(new Yd(str).toString(), new w());
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f45271c, "iabTokenAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.f45271c, "initController(" + str + ")");
            Yd yd2 = new Yd(str);
            CountDownTimer countDownTimer = v.this.f45281m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.f45281m = null;
            }
            if (yd2.a(C4240b4.i.f42646q)) {
                String strD = yd2.d(C4240b4.i.f42646q);
                if (C4240b4.i.f42650s.equalsIgnoreCase(strD)) {
                    v vVar = v.this;
                    vVar.f45277i = true;
                    vVar.Q.d();
                } else {
                    if (C4240b4.i.f42648r.equalsIgnoreCase(strD)) {
                        v.this.Q.c();
                        return;
                    }
                    if (!C4240b4.i.f42652t.equalsIgnoreCase(strD)) {
                        Logger.i(v.this.f45271c, "No STAGE mentioned! should not get here!");
                        return;
                    }
                    String strD2 = yd2.d("errMsg");
                    v.this.Q.c("controller js failed to initialize : " + strD2);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.i(v.this.f45271c, "onAdWindowsClosed(" + str + ")");
            v.this.D.a();
            v.this.D.f(null);
            v.this.f45278j = null;
            Yd yd2 = new Yd(str);
            String strD = yd2.d(C4240b4.i.f42638m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            C4500q8.e eVarG = v.this.g(strD);
            Log.d(v.this.f45272d, "onAdClosed() with type " + eVarG);
            if (v.this.r(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.f45271c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.i(v.this.f45271c, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.i(v.this.f45271c, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.i(v.this.f45271c, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.i(v.this.f45271c, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.i(v.this.f45271c, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.i(v.this.f45271c, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.f45271c, "onInitBannerFail(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f45271c, "onInitBannerFail failed with no demand source");
                return;
            }
            W4 w42 = v.this.G;
            C4500q8.e eVar = C4500q8.e.Banner;
            V4 v4A = w42.a(eVar, strFetchDemandSourceId);
            if (v4A != null) {
                v4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new h(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f45271c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Yd(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f45271c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.r(C4500q8.e.Banner.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.f45271c, "onInitInterstitialFail(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f45271c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            W4 w42 = v.this.G;
            C4500q8.e eVar = C4500q8.e.Interstitial;
            V4 v4A = w42.a(eVar, strFetchDemandSourceId);
            if (v4A != null) {
                v4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new c(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f45271c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Yd(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f45271c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.r(C4500q8.e.Interstitial.toString())) {
                v.this.b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.f45271c, "onInitRewardedVideoFail(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            W4 w42 = v.this.G;
            C4500q8.e eVar = C4500q8.e.RewardedVideo;
            V4 v4A = w42.a(eVar, strFetchDemandSourceId);
            if (v4A != null) {
                v4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC0479v(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f45271c, "onLoadBannerFail()");
            Yd yd2 = new Yd(str);
            String strD = yd2.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.r(C4500q8.e.Banner.toString())) {
                v.this.b(new j(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f45271c, "onLoadBannerSuccess()");
            Yd yd2 = new Yd(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            String strD = yd2.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            H8 h8A = C4449n8.a().a(strD);
            if (h8A == null) {
                v.this.f45294z.c(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
                return;
            }
            if (h8A instanceof C4346h8) {
                C4346h8 c4346h8 = (C4346h8) h8A;
                if (v.this.r(C4500q8.e.Banner.toString())) {
                    v.this.b(new i(strFetchDemandSourceId, c4346h8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.f45271c, "onLoadInterstitialFail(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.r(C4500q8.e.Interstitial.toString())) {
                v.this.b(new f(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.f45271c, "onLoadInterstitialSuccess(" + str + ")");
            Yd yd2 = new Yd(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            JSONObject jSONObjectA = yd2.a();
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C4500q8.e.Interstitial.toString())) {
                v.this.b(new e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.i(v.this.f45271c, "onReceivedMessage(" + str + ")");
            S7.f41731a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.f45271c, "onShowInterstitialFail(" + str + ")");
            Yd yd2 = new Yd(str);
            final String strD = yd2.d("errMsg");
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            final boolean zR = v.this.r(C4500q8.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45162b.a(zR, strD, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.i(v.this.f45271c, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new Yd(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f45271c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            Z0 z02 = v.this.D;
            C4500q8.e eVar = C4500q8.e.Interstitial;
            z02.a(eVar.ordinal());
            v.this.D.f(strFetchDemandSourceId);
            final boolean zR = v.this.r(eVar.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45151b.a(zR, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.f45271c, "onShowRewardedVideoFail(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
            if (v.this.r(C4500q8.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.i(v.this.f45271c, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.f45271c, "onVideoStatusChanged(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d(C4240b4.i.f42638m);
            if (v.this.C == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = yd2.d("status");
            if (C4240b4.i.f42621d0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStarted();
                return;
            }
            if (C4240b4.i.f42623e0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoPaused();
                return;
            }
            if (C4240b4.i.f42625f0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoResumed();
                return;
            }
            if (C4240b4.i.f42627g0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoEnded();
                return;
            }
            if (C4240b4.i.f42629h0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStopped();
                return;
            }
            Logger.i(v.this.f45271c, "onVideoStatusChanged: unknown status: " + strD2);
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.f45271c, "openInlineStore(" + str + ")");
                Yd yd2 = new Yd(str);
                a.AbstractC0843a abstractC0843aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), new C4347h9(yd2.d("url"), yd2.d(C4240b4.f.f42570c), EnumC4380j9.f43409b.a(yd2.a(C4240b4.f.f42572e, EnumC4380j9.APP_ACTIVITY.b())), (!yd2.a(C4240b4.f.f42571d) || yd2.e(C4240b4.f.f42571d)) ? null : (JSONObject) yd2.b(C4240b4.f.f42571d)));
                if (abstractC0843aA instanceof a.AbstractC0843a.C0844a) {
                    v.this.a(str, false, ((a.AbstractC0843a.C0844a) abstractC0843aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.f45271c, "openUrl(" + str + ")");
                Yd yd2 = new Yd(str);
                p.c cVarA = new p.a(yd2.d("method"), new Pc(v.this.F, C.ENCODING_PCM_32BIT)).a(yd2.c(C4240b4.i.L0) ? v.this.Z.getContext() : v.this.p(), new Oc(yd2.d("url"), yd2.d("package_name")));
                if (cVarA instanceof p.c.a) {
                    v.this.a(str, false, ((p.c.a) cVarA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.f45271c, "permissionsAPI(" + str + ")");
                v.this.I.a(new Yd(str).toString(), new w());
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f45271c, "permissionsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            String str2;
            try {
                Logger.i(v.this.f45271c, "postAdEventNotification(" + str + ")");
                Yd yd2 = new Yd(str);
                String strD = yd2.d(C4240b4.i.f42633j0);
                try {
                    if (TextUtils.isEmpty(strD)) {
                        v.this.a(str, false, C4240b4.c.f42544w, (String) null);
                        return;
                    }
                    String strD2 = yd2.d(C4240b4.i.f42635k0);
                    String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(yd2);
                    String str3 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                    JSONObject jSONObject = (JSONObject) yd2.b(C4240b4.i.f42637l0);
                    String strD3 = yd2.d(C4240b4.i.f42638m);
                    C4500q8.e eVarG = v.this.g(strD3);
                    try {
                        if (!v.this.r(strD3)) {
                            v.this.a(str, false, C4240b4.c.f42543v, (String) null);
                            return;
                        }
                        String strE = v.this.e(str);
                        if (TextUtils.isEmpty(strE)) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            v.this.i(v.this.a(strE, v.this.a(C4240b4.i.f42638m, strD3, C4240b4.i.f42633j0, strD, "demandSourceName", strD2, "demandSourceId", str2, null, false), C4240b4.h.f42586c0, C4240b4.h.f42588d0));
                        }
                        try {
                            v.this.b(new m(eVarG, str2, strD, jSONObject));
                            return;
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Exception e12) {
                    exc = e12;
                }
            } catch (Exception e13) {
                e = e13;
            }
            exc = e;
            C4462o4.d().a(exc);
            IronLog.INTERNAL.error(exc.toString());
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.i(v.this.f45271c, "removeCloseEventHandler(" + str + ")");
            CountDownTimer countDownTimer = v.this.f45280l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            v.this.f45279k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.f45271c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.f45271c, "saveFile(" + str + ")");
                Yd yd2 = new Yd(str);
                String strD = yd2.d("path");
                String strD2 = yd2.d(C4240b4.i.f42616b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, C4240b4.c.f42528g, "1");
                    return;
                }
                C4652z8 c4652z8 = new C4652z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(c4652z8, v.this.A);
                v vVar = v.this;
                if (vVar.X.a(vVar.A) <= 0) {
                    v.this.a(str, false, C4274d4.A, (String) null);
                    return;
                }
                if (c4652z8.exists()) {
                    v.this.a(str, false, C4274d4.f42881z, (String) null);
                    return;
                }
                if (!X3.h(v.this.Z.getContext())) {
                    v.this.a(str, false, C4274d4.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.f45276h.a(c4652z8, strD2, yd2.a("connectionTimeout", 0), yd2.a("readTimeout", 0));
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.f45271c, "setBackButtonState(" + str + ")");
            C4280da.e().c(new Yd(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.f45271c, "setForceClose(" + str + ")");
            Yd yd2 = new Yd(str);
            String strD = yd2.d("width");
            String strD2 = yd2.d("height");
            v.this.f45282n = Integer.parseInt(strD);
            v.this.f45283o = Integer.parseInt(strD2);
            v.this.f45284p = yd2.d(C4240b4.i.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.i(v.this.f45271c, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.f45271c, "setOrientation(" + str + ")");
                String strD = new Yd(str).d("orientation");
                v.this.o(strD);
                v vVar = v.this;
                if (vVar.f45269a0 != null) {
                    v.this.f45269a0.onOrientationChanged(strD, vVar.X.K(vVar.Z.getContext()));
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.f45271c, "setStoreSearchKeys(" + str + ")");
            C4280da.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.f45271c, "setUserData(" + str + ")");
            Yd yd2 = new Yd(str);
            if (!yd2.a(C4240b4.i.W)) {
                v.this.a(str, false, C4240b4.c.F, (String) null);
                return;
            }
            if (!yd2.a("value")) {
                v.this.a(str, false, C4240b4.c.G, (String) null);
                return;
            }
            String strD = yd2.d(C4240b4.i.W);
            String strD2 = yd2.d("value");
            C4280da.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.this.a(strD, strD2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.i(v.this.f45271c, "setWebviewBackgroundColor(" + str + ")");
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.i(v.this.f45271c, "stillAlive(" + str + ")");
            v.this.f45270b.a();
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.B.f());
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                Logger.d(v.this.f45271c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(C4240b4.a.f42503h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                C4618x8.a(Xd.f42082p, new C4533s8().a(D5.A, e10.getMessage()).a());
                Logger.d(v.this.f45271c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        public class w implements InterfaceC4451na {
            public w() {
            }

            @Override // com.ironsource.InterfaceC4451na
            public void a(boolean z10, @NotNull String str, @NotNull String str2) {
                Yd yd2 = new Yd();
                yd2.b(z10 ? v.f45266g0 : v.f45267h0, str);
                yd2.b("data", str2);
                v.this.a(yd2.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC4451na
            public void a(boolean z10, @NotNull String str, Yd yd2) {
                yd2.b(z10 ? v.f45266g0 : v.f45267h0, str);
                v.this.a(yd2.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC4451na
            public void a(boolean z10, @NotNull String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z10 ? v.f45266g0 : v.f45267h0, str);
                    v.this.a(jSONObject.toString(), z10, (String) null, (String) null);
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    Logger.d(v.this.f45271c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        void c(String str) {
            v.this.i(v.this.a(C4240b4.h.f42587d, str, (String) null, (String) null));
        }

        boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains(X1.f42014f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                InterfaceC4543t1 interfaceC4543t1A = om.a(str);
                v vVar = v.this;
                C4509r1.a aVarA = vVar.N.a(vVar.Z.getContext(), interfaceC4543t1A);
                v.this.i(v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, int i10) {
            V4 v4A;
            v vVar = v.this;
            C4500q8.e eVar = C4500q8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (v4A = v.this.G.a(eVar, str)) != null && v4A.k()) {
                v.this.b(new u(str, i10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str) {
            if (z10) {
                v.this.f45293y.c(C4500q8.e.Interstitial, str);
                v.this.f45293y.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z10) {
            V4 v4A = v.this.G.a(C4500q8.e.Interstitial, str);
            if (v4A != null) {
                v4A.a(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str, String str2) {
            if (z10) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f45293y.d(str2, str);
            }
            a(str2, false);
        }
    }

    private interface s {
        void a(String str, C4500q8.e eVar, V4 v42);
    }

    static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f45387b;

        t() {
        }
    }

    public enum u {
        Display,
        Gone
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    private class C0480v extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(C4240b4.f42477f) && (cVar = v.this.Q) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.f45271c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = v.this.Q;
            if (cVar != null) {
                cVar.b(str);
            }
            v.this.v();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean zContains;
            Logger.i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e10) {
                C4462o4.d().a(e10);
                zContains = false;
            }
            if (zContains) {
                String str2 = AdPayload.FILE_SCHEME + v.this.A + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException e11) {
                    C4462o4.d().a(e11);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        private C0480v() {
        }
    }

    public v(Context context, W4 w42, C4291e4 c4291e4, com.ironsource.sdk.controller.c cVar, S7 s72, int i10, C4326g5 c4326g5, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        C4331ga c4331ga = new C4331ga(context, new InterfaceC4518ra.a());
        this.Z = c4331ga;
        Logger.i(this.f45271c, "C'tor");
        this.Y = c4291e4;
        this.Q = cVar;
        this.f45268a = s72;
        this.G = w42;
        a(context, c4331ga);
        this.A = str;
        this.D = new Z0();
        this.S = new JSONObject();
        this.f45276h = c4326g5;
        this.T = aVar;
        this.U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(C4240b4.a.f42504i, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.V = new C4409l4(new C4359i4(SDKUtils.getControllerUrl(), this.A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new Zc(SDKUtils.getControllerUrl())), new Function1() { // from class: com.ironsource.sdk.controller.i0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f45144b.c((C4652z8) obj);
                }
            }, c4326g5, new InterfaceC4496q4.a());
        } else {
            c4326g5.a(this);
            this.B = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.A, SDKUtils.getControllerUrl(), c4326g5);
        }
        o oVar = new o();
        this.f45285q = oVar;
        c4331ga.setWebViewClient(new C0480v());
        c4331ga.setWebChromeClient(oVar);
        Ag.a(c4331ga);
        a(c4331ga);
        c4331ga.setDownloadListener(this);
        this.R = c(context);
        b(context);
        b(i10);
        this.f45274f = str2;
        this.f45275g = str3;
        this.f45270b = qk.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        Logger.i(this.f45271c, str + " " + str4);
    }

    class f extends V3 {
        f(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.V3, com.ironsource.InterfaceC4549t7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.f45277i) {
                vVar.n(str);
            }
        }

        @Override // com.ironsource.V3, com.ironsource.InterfaceC4549t7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.f45277i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.e(jSONObject);
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.V3, com.ironsource.InterfaceC4549t7
        public void a() {
            v vVar = v.this;
            if (vVar.f45277i) {
                vVar.n("none");
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void G() {
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), "Android");
        webView.addJavascriptInterface(b(sVar), C4240b4.f42476e);
    }

    private V3 c(Context context) {
        return new f(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z10 = true;
        } else {
            V4 v4A = this.G.a(g(str), str2);
            if (v4A != null) {
                mapG = v4A.g();
                mapG.put("demandSourceName", v4A.f());
                mapG.put("demandSourceId", v4A.h());
            }
            try {
                jSONObject.put(C4240b4.i.f42638m, str);
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e11) {
                C4462o4.d().a(e11);
                IronLog.INTERNAL.error(e11.toString());
            }
            z10 = false;
        }
        if (!TextUtils.isEmpty(this.f45275g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42676f), SDKUtils.encodeString(this.f45275g));
            } catch (JSONException e12) {
                C4462o4.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
            }
        }
        if (TextUtils.isEmpty(this.f45274f)) {
            z10 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42678g), SDKUtils.encodeString(this.f45274f));
            } catch (JSONException e13) {
                C4462o4.d().a(e13);
                IronLog.INTERNAL.error(e13.toString());
            }
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    p(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e14) {
                    C4462o4.d().a(e14);
                    IronLog.INTERNAL.error(e14.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f45130b.k(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str) {
        this.Z.a(new m.b(str, q()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Logger.i(this.f45271c, "load(): " + str);
            this.Z.loadUrl(str);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            Logger.e(this.f45271c, "WebViewController::load: " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Nc nc2 = this.f45269a0;
        if (nc2 != null) {
            nc2.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f45271c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C4500q8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C4500q8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C4500q8.e.Banner.toString()) || this.f45294z == null : this.f45292x == null) : this.f45293y != null) {
            z10 = true;
        }
        if (!z10) {
            Logger.d(this.f45271c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z10;
    }

    public void A() {
        i(f(C4240b4.h.A));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            Logger.i(this.f45271c, "WebViewController: onPause() - " + th2);
        }
    }

    public void C() {
        this.C = null;
    }

    public void D() {
        this.Z.a();
        this.f45269a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            Logger.i(this.f45271c, "WebViewController: onResume() - " + th2);
        }
    }

    com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C4240b4.c.f42547z;
        }
        i(e(C4240b4.h.f42584a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(C4240b4.h.f42605t));
    }

    public void g(String str, String str2) {
        i(e(C4240b4.h.W, a(C4240b4.i.f42644p, str2, C4240b4.i.f42638m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public C4500q8.c h() {
        return C4500q8.c.Web;
    }

    public void j(String str) {
        i(e(C4240b4.f.f42577j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(String str) {
        i(e(C4240b4.h.f42608w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public zg o() {
        if (this.P == null) {
            this.P = new g();
        }
        return this.P;
    }

    public Context p() {
        return this.Y.a();
    }

    public int q() {
        return f45262c0;
    }

    public String s() {
        return this.f45291w;
    }

    public Z0 t() {
        return this.D;
    }

    public u u() {
        return this.f45290v;
    }

    public void v() {
        if (this.f45278j == null) {
            return;
        }
        n();
        C4500q8.e eVarB = this.f45278j.b();
        String strA = this.f45278j.a();
        if (r(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void w() {
        this.f45285q.onHideCustomView();
    }

    public boolean x() {
        return this.f45286r != null;
    }

    public void y() {
        i(f(C4240b4.f.f42575h));
    }

    public void z() {
        i(f(C4240b4.h.Z));
    }

    private void p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.Z.getSettings().setCacheMode(2);
        } else {
            this.Z.getSettings().setCacheMode(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        Yd yd2 = new Yd(str);
        String strD = yd2.d("color");
        String strD2 = yd2.d("adViewId");
        int color = !C4240b4.i.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 != null) {
            WebView presentingView = C4449n8.a().a(strD2).getPresentingView();
            if (presentingView != null) {
                presentingView.setBackgroundColor(color);
                return;
            }
            return;
        }
        this.Z.setBackgroundColor(color);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.W) {
            this.V.b();
            return;
        }
        this.B.a(new C4533s8());
        if (this.B.k()) {
            a(1);
        }
    }

    public void c(String str, String str2) {
        String str3;
        try {
            str3 = str;
        } catch (Exception e10) {
            e = e10;
            str3 = str;
        }
        try {
            i(e(C4240b4.h.f42601p, a(C4240b4.i.f42616b, str3, "path", b(str2), null, null, null, null, null, false)));
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            C4462o4.d().a(exc);
            b(str3, str2, exc.getMessage());
        }
    }

    public boolean h(String str) {
        try {
            if (!new Be(str, C4280da.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            Wf.a(p(), str);
            return true;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new Yd(str).d(f45266g0);
    }

    public void n(String str) {
        String strD;
        try {
            strD = Y3.d(this.Z.getContext());
            Logger.i(this.f45271c, "device status changed, connection type " + str);
            C4584v8.a(str);
            C4584v8.b(strD);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            i(e(C4240b4.h.f42609x, a("connectionType", str, "rawConnectionType", strD, null, null, null, null, null, false)));
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            C4462o4.d().a(exc);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
        }
    }

    private String d(JSONObject jSONObject) {
        Z4 z4B = Z4.b(this.Z.getContext());
        StringBuilder sb2 = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb2.append(C4240b4.j.f42698q);
            sb2.append(C4240b4.j.f42668b);
            sb2.append(sDKVersion);
            sb2.append(C4240b4.j.f42670c);
        }
        String strE = z4B.e();
        if (!TextUtils.isEmpty(strE)) {
            sb2.append(C4240b4.j.f42690m);
            sb2.append(C4240b4.j.f42668b);
            sb2.append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + StringUtils.PROCESS_POSTFIX_DELIMITER;
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            }
            sb2.append(C4240b4.j.f42670c);
            sb2.append("protocol");
            sb2.append(C4240b4.j.f42668b);
            sb2.append(str);
            sb2.append(C4240b4.j.f42670c);
            sb2.append(C4240b4.j.D);
            sb2.append(C4240b4.j.f42668b);
            sb2.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{C4240b4.j.Z, C4240b4.j.f42678g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb2.append(C4240b4.j.f42670c);
                        sb2.append("controllerConfig");
                        sb2.append(C4240b4.j.f42668b);
                        sb2.append(string);
                    }
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
            sb2.append(C4240b4.j.f42670c);
            sb2.append("debug");
            sb2.append(C4240b4.j.f42668b);
            sb2.append(q());
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4500q8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4500q8.e eVar = C4500q8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4500q8.e eVar2 = C4500q8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C4500q8.e eVar3 = C4500q8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public void o(String str) {
        this.f45291w = str;
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.f45271c, "device connection info changed: " + jSONObject.toString());
        i(e(C4240b4.h.f42610y, a(C4240b4.j.f42681h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new r()), sVar);
    }

    public void b(int i10) {
        f45262c0 = i10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(C4240b4.h.f42606u));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), Yc.e(this.Z.getContext()));
        jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42697p0), SDKUtils.encodeString(Yc.b(this.Z.getContext())));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4) {
        a(v42, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            V3 v32 = this.R;
            if (v32 == null) {
                return;
            }
            v32.b(context);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.H = oVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(V4 v42) {
        Map<String, String> mapB = v42.b();
        if (mapB != null) {
            i(e(C4240b4.h.T, SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.G.b(C4500q8.e.Interstitial, v42.h());
    }

    public FrameLayout r() {
        return this.f45289u;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.I = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.J = uVar;
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.K = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(o());
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(C4240b4.h.f42590e0, jSONObject != null ? jSONObject.toString() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(C4652z8 c4652z8) {
        this.f45276h.a(this);
        if (c4652z8 != null && c4652z8.exists()) {
            a(c4652z8);
            return null;
        }
        a(new C4652z8(C4240b4.f42477f), new C4516r8(1, "Unable to download Html file"));
        return null;
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.M = jVar;
    }

    public void a(C4509r1 c4509r1) {
        this.N = c4509r1;
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f45289u = new FrameLayout(context);
        this.f45287s = new FrameLayout(context);
        this.f45287s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f45287s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f45289u.addView(this.f45287s, layoutParams);
        this.f45289u.addView(frameLayout);
    }

    private String b(String str) {
        String str2 = this.A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public void c(String str) {
        if (str.equals(C4240b4.i.f42630i)) {
            n();
        }
        i(e(C4240b4.h.f42611z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void b(String str, String str2, String str3) {
        try {
        } catch (Exception e10) {
            e = e10;
        }
        try {
            i(e(C4240b4.h.f42602q, a(C4240b4.i.f42616b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception e11) {
            e = e11;
            C4462o4.d().a(e);
        }
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    void c(Runnable runnable) {
        S7 s72 = this.f45268a;
        if (s72 != null) {
            s72.d(runnable);
        }
    }

    public void b(boolean z10, String str) {
        i(e(C4240b4.h.V, a(C4240b4.i.K, str, null, null, null, null, null, null, C4240b4.i.f42642o, z10)));
    }

    @SuppressLint({"NewApi"})
    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    public void a(C4631y4 c4631y4) {
        this.O = c4631y4;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC4529s4 a(C4500q8.e eVar) {
        if (eVar == C4500q8.e.Interstitial) {
            return this.f45293y;
        }
        if (eVar == C4500q8.e.RewardedVideo) {
            return this.f45292x;
        }
        if (eVar == C4500q8.e.Banner) {
            return this.f45294z;
        }
        return null;
    }

    void b(Runnable runnable) {
        S7 s72 = this.f45268a;
        if (s72 != null) {
            s72.c(runnable);
        }
    }

    public void a(dg dgVar) {
        this.C = dgVar;
    }

    public void a(int i10) {
        String string;
        if (!this.W && !this.B.m()) {
            Logger.i(this.f45271c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strD = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        if (this.W) {
            string = this.V.c().toURI().toString();
        } else {
            string = this.B.g().toURI().toString();
        }
        this.f45268a.d(new h(controllerConfigAsJSONObject, this.Z, string + "?" + strD));
        this.f45281m = new i(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i10).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            V3 v32 = this.R;
            if (v32 == null) {
                return;
            }
            v32.c(context);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new Yd(str).d(f45267h0);
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        boolean z10;
        Z4 z4B = Z4.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4240b4.j.f42710z, "none");
            jSONObject.put(C4240b4.j.A, SDKUtils.translateDeviceOrientation(this.X.z(context)));
            String strD = z4B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = z4B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
                z10 = false;
            } else {
                z10 = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.i(this.f45271c, "add AID");
                    jSONObject.put("deviceIds" + C4240b4.j.f42672d + C4240b4.j.L + C4240b4.j.f42674e, SDKUtils.encodeString(advertiserId));
                }
                String limitAdTracking = SDKUtils.getLimitAdTracking();
                if (!TextUtils.isEmpty(limitAdTracking)) {
                    Logger.i(this.f45271c, "add LAT");
                    jSONObject.put(C4240b4.j.M, Boolean.parseBoolean(limitAdTracking));
                }
                String strE = z4B.e();
                if (strE != null) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42690m), SDKUtils.encodeString(strE));
                } else {
                    z10 = true;
                }
                String strF = z4B.f();
                if (strF != null) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42692n), strF.replaceAll("[^0-9/.]", ""));
                } else {
                    z10 = true;
                }
                String strF2 = z4B.f();
                if (strF2 != null) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42694o), SDKUtils.encodeString(strF2));
                }
                String strValueOf = String.valueOf(z4B.a());
                if (strValueOf != null) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42696p), strValueOf);
                } else {
                    z10 = true;
                }
                jSONObject.put(N6.f41393j0, String.valueOf(C4371j0.a()));
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42698q), SDKUtils.encodeString(sDKVersion));
                }
                if (z4B.b() != null && z4B.b().length() > 0) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42700r), SDKUtils.encodeString(z4B.b()));
                }
                String strB = Y3.b(context);
                if (strB.equals("none")) {
                    z10 = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
                }
                String strD2 = Y3.d(context);
                if (strD2 != null) {
                    jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD2));
                } else {
                    z10 = true;
                }
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42706v), Y3.e(context));
                jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42708x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
                }
                jSONObject.put(C4240b4.j.f42709y, SDKUtils.encodeString(String.valueOf(this.X.a(this.A))));
                String strValueOf2 = String.valueOf(this.X.o());
                if (TextUtils.isEmpty(strValueOf2)) {
                    z10 = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.G) + C4240b4.j.f42672d + SDKUtils.encodeString("width") + C4240b4.j.f42674e, SDKUtils.encodeString(strValueOf2));
                }
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.G) + C4240b4.j.f42672d + SDKUtils.encodeString("height") + C4240b4.j.f42674e, SDKUtils.encodeString(String.valueOf(this.X.b())));
                String strG = B1.g(this.Z.getContext());
                if (!TextUtils.isEmpty(strG)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
                }
                String strValueOf3 = String.valueOf(this.X.r());
                if (!TextUtils.isEmpty(strValueOf3)) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.K), SDKUtils.encodeString(strValueOf3));
                }
                String strValueOf4 = String.valueOf(this.X.p());
                if (!TextUtils.isEmpty(strValueOf4)) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.O), SDKUtils.encodeString(strValueOf4));
                }
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.P), Z4.b(context).a(context));
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.Y), this.X.k(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), X3.b(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), X3.c(context));
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.S), X3.f(context));
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.R), SDKUtils.encodeString(X3.g(context)));
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.V), B1.f(context));
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.X), B1.d(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(B1.b(context)));
                String strE2 = B1.e(context);
                if (!TextUtils.isEmpty(strE2)) {
                    jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42671c0), SDKUtils.encodeString(strE2));
                }
                c(jSONObject);
                jSONObject.put(SDKUtils.encodeString(C4240b4.j.f42699q0), this.X.t(context));
            } catch (JSONException e10) {
                e = e10;
                C4462o4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (JSONException e11) {
            e = e11;
            z10 = false;
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    private void a(String str, C4500q8.e eVar, V4 v42, s sVar) {
        if (TextUtils.isEmpty(str)) {
            sVar.a("Application key are missing", eVar, v42);
        } else {
            i(a(eVar, v42).f45387b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4580v4 interfaceC4580v4) {
        this.f45274f = str;
        this.f45275g = str2;
        this.f45292x = interfaceC4580v4;
        this.D.i(str);
        this.D.j(str2);
        a(str, C4500q8.e.RewardedVideo, v42, new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4563u4 interfaceC4563u4) {
        this.f45274f = str;
        this.f45275g = str2;
        this.f45293y = interfaceC4563u4;
        this.D.g(str);
        this.D.h(this.f45275g);
        a(this.f45274f, C4500q8.e.Interstitial, v42, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4563u4 interfaceC4563u4) {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.D.d(str, true);
        i(a(C4240b4.h.E, strFlatMapToJsonAsString, C4240b4.h.F, C4240b4.h.G));
    }

    private void a(V4 v42, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, v42.b()});
        if (map.containsKey("adm")) {
            this.f45270b.a(new InterfaceC4342h4.d() { // from class: com.ironsource.sdk.controller.g0
                @Override // com.ironsource.InterfaceC4342h4.d
                public final void a(InterfaceC4243b7 interfaceC4243b7) {
                    this.f45124a.a(interfaceC4243b7);
                }
            });
        }
        this.D.d(v42.h(), true);
        i(a(C4240b4.h.E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C4240b4.h.F, C4240b4.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC4243b7 interfaceC4243b7) {
        interfaceC4243b7.a(new InterfaceC4260c7() { // from class: com.ironsource.sdk.controller.j0
            @Override // com.ironsource.InterfaceC4260c7
            public final void a(Y6 y62) {
                this.f45150b.a(y62);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Y6 y62) {
        try {
            this.Q.a(y62);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Logger.e(this.f45271c, "handleLoadAd: " + e10);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4563u4 interfaceC4563u4) {
        i(a(C4500q8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4) {
        i(a(C4500q8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, v42.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        V4 v4A = this.G.a(C4500q8.e.Interstitial, str);
        return v4A != null && v4A.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, V4 v42, InterfaceC4546t4 interfaceC4546t4) {
        this.f45274f = str;
        this.f45275g = str2;
        this.f45294z = interfaceC4546t4;
        a(str, C4500q8.e.Banner, v42, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42, Map<String, String> map, InterfaceC4546t4 interfaceC4546t4) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, v42.b()});
        if (map != null) {
            i(a(C4240b4.h.N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C4240b4.h.O, C4240b4.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(V4 v42) {
        Map<String, String> mapB = v42.b();
        if (mapB != null) {
            i(a(C4240b4.h.S, SDKUtils.flatMapToJsonAsString(mapB), C4240b4.h.P, C4240b4.h.Q));
        }
        this.G.b(C4500q8.e.Banner, v42.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4546t4 interfaceC4546t4) {
        i(a(C4240b4.h.N, jSONObject.toString(), C4240b4.h.O, C4240b4.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), C4240b4.h.U, C4240b4.h.U));
    }

    private t a(C4500q8.e eVar, V4 v42) {
        t tVar = new t();
        if (eVar != C4500q8.e.RewardedVideo && eVar != C4500q8.e.Interstitial && eVar != C4500q8.e.Banner) {
            return tVar;
        }
        HashMap map = new HashMap();
        map.put(C4240b4.j.f42678g, this.f45274f);
        if (!TextUtils.isEmpty(this.f45275g)) {
            map.put(C4240b4.j.f42676f, this.f45275g);
        }
        if (v42 != null) {
            if (v42.g() != null) {
                map.putAll(v42.g());
                map.put(C4240b4.i.f42663y0, String.valueOf(L.f41219a.c(v42.h())));
            }
            map.put("demandSourceName", v42.f());
            map.put("demandSourceId", v42.h());
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C4240b4.h hVarA = C4240b4.h.a(eVar);
        String strA = a(hVarA.f42612a, strFlatMapToJsonAsString, hVarA.f42613b, hVarA.f42614c);
        tVar.f45386a = hVarA.f42612a;
        tVar.f45387b = strA;
        return tVar;
    }

    private String a(C4500q8.e eVar, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        V4 v4A = this.G.a(eVar, strFetchDemandSourceId);
        if (v4A != null) {
            if (v4A.g() != null) {
                map.putAll(v4A.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C4240b4.h hVarB = C4240b4.h.b(eVar);
        return a(hVarB.f42612a, strFlatMapToJsonAsString, hVarB.f42613b, hVarB.f42614c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C4500q8.e eVar, V4 v42) {
        if (r(eVar.toString())) {
            b(new m(eVar, v42, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4580v4 interfaceC4580v4) {
        i(a(C4500q8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    public void a(boolean z10, String str) {
        i(e(C4240b4.h.V, a(C4240b4.i.M0, str, null, null, null, null, null, null, C4240b4.i.f42642o, z10)));
    }

    public void a(int i10, boolean z10) {
        i(e(C4240b4.f.f42576i, a(C4240b4.f.f42573f, String.valueOf(i10), null, null, null, null, null, null, C4240b4.f.f42574g, z10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z10, String str2, String str3) {
        String strD = new Yd(str).d(z10 ? f45266g0 : f45267h0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    private String a(String str, String str2) {
        return a(str, str2, C4240b4.i.f42626g);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z10);
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.Lc
    public void a(C4652z8 c4652z8) {
        if (this.W && this.V.a(c4652z8)) {
            a(1);
        } else if (c4652z8.getName().contains(C4240b4.f42477f)) {
            this.B.a(new n());
        } else {
            c(c4652z8.getName(), c4652z8.getParent());
        }
    }

    @Override // com.ironsource.Lc
    public void a(C4652z8 c4652z8, C4516r8 c4516r8) {
        if (this.W && this.V.a(c4652z8)) {
            this.Q.c("controller html - failed to download - " + c4516r8.b());
            return;
        }
        if (c4652z8.getName().contains(C4240b4.f42477f)) {
            this.B.a(new a(), new b(c4516r8));
        } else {
            b(c4652z8.getName(), c4652z8.getParent(), c4516r8.b());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new d(context));
    }

    public void a(Nc nc2) {
        this.f45269a0 = nc2;
        this.Z.a(nc2);
    }

    public void a(u uVar) {
        this.f45290v = uVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        this.Z.destroy();
        C4326g5 c4326g5 = this.f45276h;
        if (c4326g5 != null) {
            c4326g5.d();
        }
        V3 v32 = this.R;
        if (v32 != null) {
            v32.b();
        }
        CountDownTimer countDownTimer = this.f45281m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new m.a(str, str2, str3, str4).a();
    }

    void a(C4500q8.e eVar, String str) {
        b(new e(eVar, str));
    }

    public void a(Z0 z02) {
        synchronized (this.E) {
            try {
                if (z02.j() && this.f45277i) {
                    Log.d(this.f45271c, "restoreState(state:" + z02 + ")");
                    int iC = z02.c();
                    if (iC != -1) {
                        C4500q8.e eVar = C4500q8.e.RewardedVideo;
                        if (iC == eVar.ordinal()) {
                            Log.d(this.f45271c, "onRVAdClosed()");
                            String strB = z02.b();
                            InterfaceC4529s4 interfaceC4529s4A = a(eVar);
                            if (interfaceC4529s4A != null && !TextUtils.isEmpty(strB)) {
                                interfaceC4529s4A.b(eVar, strB);
                            }
                        } else {
                            C4500q8.e eVar2 = C4500q8.e.Interstitial;
                            if (iC == eVar2.ordinal()) {
                                Log.d(this.f45271c, "onInterstitialAdClosed()");
                                String strB2 = z02.b();
                                InterfaceC4529s4 interfaceC4529s4A2 = a(eVar2);
                                if (interfaceC4529s4A2 != null && !TextUtils.isEmpty(strB2)) {
                                    interfaceC4529s4A2.b(eVar2, strB2);
                                }
                            }
                        }
                        z02.a(-1);
                        z02.f(null);
                    } else {
                        Log.d(this.f45271c, "No ad was opened");
                    }
                    String strD = z02.d();
                    String strF = z02.f();
                    for (V4 v42 : this.G.a(C4500q8.e.Interstitial)) {
                        if (v42.e() == 2) {
                            Log.d(this.f45271c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + v42.f() + ")");
                            a(strD, strF, v42, this.f45293y);
                        }
                    }
                    String strG = z02.g();
                    String strH = z02.h();
                    for (V4 v43 : this.G.a(C4500q8.e.RewardedVideo)) {
                        if (v43.e() == 2) {
                            String strF2 = v43.f();
                            Log.d(this.f45271c, "onRVNoMoreOffers()");
                            this.f45292x.c(strF2);
                            Log.d(this.f45271c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                            a(strG, strH, v43, this.f45292x);
                        }
                    }
                    z02.a(false);
                }
                this.D = z02;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void a(Runnable runnable) {
        S7 s72 = this.f45268a;
        if (s72 != null) {
            s72.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.Y.a(activity);
    }
}
