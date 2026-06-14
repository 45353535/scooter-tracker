package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.common.base.Ascii;
import com.ironsource.sdk.controller.f;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.i;
import sg.bigo.ads.core.g.d;
import sg.bigo.ads.core.g.e;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends sg.bigo.ads.core.h.b implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    e f104289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    a f104290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f104291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f104292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    sg.bigo.ads.common.ac.a f104293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    AtomicBoolean f104294f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f104295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f f104296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f104297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f104298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f104299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f104300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final i f104301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f104302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f104303s;

    public interface a {
        void a();
    }

    public b(Context context, String str, int i10, int i11, @NonNull f fVar, @Nullable String str2, int i12, t tVar) {
        super(context);
        this.f104301q = new i();
        this.f104294f = new AtomicBoolean(false);
        this.f104303s = true;
        this.f104295k = str;
        this.f104299o = i10;
        this.f104300p = i11;
        this.f104296l = fVar;
        this.f104297m = str2;
        this.f104298n = i12;
        this.f104292d = tVar;
        this.f104302r = new AtomicBoolean(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        this.f104293e = new sg.bigo.ads.common.ac.a(getContext());
        setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.g.a.b.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.f104294f.set(false);
                b.this.f104293e.onTouchEvent(motionEvent);
                return false;
            }
        });
        setWebViewClient(new c(str) { // from class: sg.bigo.ads.core.g.a.b.2
            @Override // sg.bigo.ads.core.g.a.c, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                b bVar = b.this;
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                a aVar = bVar.f104290b;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(@NonNull WebView webView, @NonNull String str3) {
                super.onPageFinished(webView, str3);
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "onPageFinished: ".concat(String.valueOf(str3)));
                if (b.this.f104302r.compareAndSet(false, true)) {
                    final b bVar = b.this;
                    final ValueCallback<String> valueCallback = new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.2.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str4) {
                            String str5 = str4;
                            b.this.f104292d.b(1);
                            b.this.f104292d.f102225a = str5 != null ? str5 : "";
                            StringBuilder sb2 = new StringBuilder("handshakeVersion: ");
                            if (str5 == null) {
                                str5 = "";
                            }
                            sb2.append(str5);
                            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", sb2.toString());
                        }
                    };
                    bVar.f104292d.a(1);
                    bVar.evaluateJavascript("window.vpaidwrapper.handshakeVersion('2.0')", new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.6
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str4) {
                            valueCallback.onReceiveValue(str4);
                        }
                    });
                    b.this.b();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(@NonNull WebView webView, int i13, @NonNull String str3, @NonNull String str4) {
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Error: ".concat(String.valueOf(str3)));
                super.onReceivedError(webView, i13, str3, str4);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(@NonNull WebView webView, String str3) {
                sg.bigo.ads.common.ac.a aVar;
                b bVar = b.this;
                try {
                    Uri uri = Uri.parse(str3);
                    if (uri != null) {
                        String scheme = uri.getScheme();
                        String host = uri.getHost();
                        if (host != null) {
                            if (MRAIDNativeFeature.VPAID.equals(scheme) || (aVar = bVar.f104293e) == null || !aVar.f102283a.f102286a) {
                                HashMap map = new HashMap();
                                for (String str4 : uri.getQueryParameterNames()) {
                                    map.put(str4, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str4)));
                                }
                                byte b10 = -1;
                                switch (host.hashCode()) {
                                    case -1657484168:
                                        if (host.equals("onAdSkippableStateChange")) {
                                            b10 = 0;
                                        }
                                        break;
                                    case -1633535831:
                                        if (host.equals("onAdVideoStart")) {
                                            b10 = 1;
                                        }
                                        break;
                                    case -1354015358:
                                        if (host.equals("onAdLog")) {
                                            b10 = 2;
                                        }
                                        break;
                                    case -1347047775:
                                        if (host.equals("onAdVideoMidpoint")) {
                                            b10 = 3;
                                        }
                                        break;
                                    case -1160015669:
                                        if (host.equals("onAdExpandedChange")) {
                                            b10 = 4;
                                        }
                                        break;
                                    case -742226534:
                                        if (host.equals("onAdVideoFirstQuartile")) {
                                            b10 = 5;
                                        }
                                        break;
                                    case -609164954:
                                        if (host.equals("onAdDurationChange")) {
                                            b10 = 6;
                                        }
                                        break;
                                    case -560906938:
                                        if (host.equals("onStartAd")) {
                                            b10 = 7;
                                        }
                                        break;
                                    case -307657838:
                                        if (host.equals("onAdVideoComplete")) {
                                            b10 = 8;
                                        }
                                        break;
                                    case -164095715:
                                        if (host.equals("onAdClickThru")) {
                                            b10 = 9;
                                        }
                                        break;
                                    case 98253676:
                                        if (host.equals("onAdPlaying")) {
                                            b10 = 10;
                                        }
                                        break;
                                    case 116028939:
                                        if (host.equals("onAdImpression")) {
                                            b10 = Ascii.VT;
                                        }
                                        break;
                                    case 159970502:
                                        if (host.equals(TelemetryAdLifecycleEvent.AD_ERROR)) {
                                            b10 = Ascii.FF;
                                        }
                                        break;
                                    case 183427630:
                                        if (host.equals("onAdUserAcceptInvitation")) {
                                            b10 = 13;
                                        }
                                        break;
                                    case 590531255:
                                        if (host.equals("onAdLinearChange")) {
                                            b10 = Ascii.SO;
                                        }
                                        break;
                                    case 652779159:
                                        if (host.equals("VPAIDCreativeError")) {
                                            b10 = Ascii.SI;
                                        }
                                        break;
                                    case 861234439:
                                        if (host.equals("onAdLoaded")) {
                                            b10 = Ascii.DLE;
                                        }
                                        break;
                                    case 963431984:
                                        if (host.equals("onAdPaused")) {
                                            b10 = 17;
                                        }
                                        break;
                                    case 1497850049:
                                        if (host.equals("onSkipAd")) {
                                            b10 = Ascii.DC2;
                                        }
                                        break;
                                    case 1506340484:
                                        if (host.equals("onStopAd")) {
                                            b10 = 19;
                                        }
                                        break;
                                    case 1648218545:
                                        if (host.equals("onAdRemainingTimeChange")) {
                                            b10 = Ascii.DC4;
                                        }
                                        break;
                                    case 1654690129:
                                        if (host.equals("onAdVideoThirdQuartile")) {
                                            b10 = Ascii.NAK;
                                        }
                                        break;
                                    case 1697251091:
                                        if (host.equals("onAdSizeChange")) {
                                            b10 = Ascii.SYN;
                                        }
                                        break;
                                    case 1701669456:
                                        if (host.equals("onAdInteraction")) {
                                            b10 = Ascii.ETB;
                                        }
                                        break;
                                    case 2014353132:
                                        if (host.equals("onAdVolumeChange")) {
                                            b10 = Ascii.CAN;
                                        }
                                        break;
                                    case 2047444747:
                                        if (host.equals("onAdUserMinimize")) {
                                            b10 = Ascii.EM;
                                        }
                                        break;
                                    case 2114403499:
                                        if (host.equals("onAdUserClose")) {
                                            b10 = Ascii.SUB;
                                        }
                                        break;
                                }
                                switch (b10) {
                                    case 0:
                                        e eVar = bVar.f104289a;
                                        if (eVar != null) {
                                            eVar.g();
                                        }
                                        break;
                                    case 1:
                                        bVar.f104292d.b(3);
                                        e eVar2 = bVar.f104289a;
                                        if (eVar2 != null) {
                                            eVar2.b();
                                        }
                                        break;
                                    case 2:
                                        e eVar3 = bVar.f104289a;
                                        if (eVar3 != null) {
                                            eVar3.b((String) map.get(PglCryptUtils.KEY_MESSAGE));
                                        }
                                        break;
                                    case 3:
                                        e eVar4 = bVar.f104289a;
                                        if (eVar4 != null) {
                                            eVar4.d();
                                        }
                                        break;
                                    case 4:
                                        e eVar5 = bVar.f104289a;
                                        if (eVar5 != null) {
                                            eVar5.a(d.c((String) map.get("expanded")));
                                        }
                                        break;
                                    case 5:
                                        e eVar6 = bVar.f104289a;
                                        if (eVar6 != null) {
                                            eVar6.c();
                                        }
                                        break;
                                    case 6:
                                        e eVar7 = bVar.f104289a;
                                        if (eVar7 != null) {
                                            eVar7.a((int) d.b((String) map.get("duration")));
                                        }
                                        break;
                                    case 7:
                                        e eVar8 = bVar.f104289a;
                                        if (eVar8 != null) {
                                            eVar8.j();
                                        }
                                        break;
                                    case 8:
                                        e eVar9 = bVar.f104289a;
                                        if (eVar9 != null) {
                                            eVar9.f();
                                        }
                                        break;
                                    case 9:
                                        bVar.f104292d.a((String) map.get("url"), (String) map.get("id"), d.c((String) map.get("playerHandles")));
                                        if (bVar.f104289a != null && bVar.f104294f.compareAndSet(false, true)) {
                                            bVar.f104289a.a((String) map.get("url"), (String) map.get("id"), d.c((String) map.get("playerHandles")));
                                        }
                                        break;
                                    case 10:
                                        e eVar10 = bVar.f104289a;
                                        if (eVar10 != null) {
                                            eVar10.i();
                                        }
                                        break;
                                    case 11:
                                        bVar.f104292d.b(4);
                                        e eVar11 = bVar.f104289a;
                                        if (eVar11 != null) {
                                            eVar11.a();
                                        }
                                        break;
                                    case 12:
                                        sg.bigo.ads.common.n.d.a(bVar.f104291c);
                                        e eVar12 = bVar.f104289a;
                                        if (eVar12 != null) {
                                            eVar12.a((String) map.get(PglCryptUtils.KEY_MESSAGE));
                                        }
                                        break;
                                    case 13:
                                        e eVar13 = bVar.f104289a;
                                        if (eVar13 != null) {
                                            eVar13.n();
                                        }
                                        break;
                                    case 14:
                                        e eVar14 = bVar.f104289a;
                                        if (eVar14 != null) {
                                            eVar14.b(d.c((String) map.get("adLinear")));
                                        }
                                        break;
                                    case 15:
                                        sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "VPAID error, command=" + ((String) map.get(f.b.f45113g)) + ", message=" + ((String) map.get(NotificationCompat.CATEGORY_MESSAGE)) + ", try to rePrepareAd.");
                                        bVar.b();
                                        break;
                                    case 16:
                                        sg.bigo.ads.common.n.d.a(bVar.f104291c);
                                        bVar.f104292d.b(2);
                                        e eVar15 = bVar.f104289a;
                                        if (eVar15 != null) {
                                            eVar15.h();
                                        }
                                        break;
                                    case 17:
                                        e eVar16 = bVar.f104289a;
                                        if (eVar16 != null) {
                                            eVar16.m();
                                        }
                                        break;
                                    case 18:
                                        e eVar17 = bVar.f104289a;
                                        if (eVar17 != null) {
                                            eVar17.l();
                                        }
                                        break;
                                    case 19:
                                        e eVar18 = bVar.f104289a;
                                        if (eVar18 != null) {
                                            eVar18.k();
                                        }
                                        break;
                                    case 20:
                                        e eVar19 = bVar.f104289a;
                                        if (eVar19 != null) {
                                            eVar19.b((int) d.b((String) map.get("remaining")));
                                        }
                                        break;
                                    case 21:
                                        e eVar20 = bVar.f104289a;
                                        if (eVar20 != null) {
                                            eVar20.e();
                                        }
                                        break;
                                    case 22:
                                        e eVar21 = bVar.f104289a;
                                        if (eVar21 != null) {
                                            eVar21.a(d.a((String) map.get(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)), d.a((String) map.get("h")));
                                        }
                                        break;
                                    case 23:
                                        e eVar22 = bVar.f104289a;
                                        if (eVar22 != null) {
                                            eVar22.c((String) map.get("id"));
                                        }
                                        break;
                                    case 24:
                                        e eVar23 = bVar.f104289a;
                                        if (eVar23 != null) {
                                            eVar23.a(d.a((String) map.get("volume")));
                                        }
                                        break;
                                    case 25:
                                        e eVar24 = bVar.f104289a;
                                        if (eVar24 != null) {
                                            eVar24.o();
                                        }
                                        break;
                                    case 26:
                                        e eVar25 = bVar.f104289a;
                                        if (eVar25 != null) {
                                            eVar25.p();
                                        }
                                        break;
                                }
                                bVar.a("window.vpaidwrapper.nativeCallComplete(" + JSONObject.quote(host) + ")");
                            } else if (bVar.f104289a != null && bVar.f104294f.compareAndSet(false, true)) {
                                bVar.f104292d.a(str3, "", false);
                                bVar.f104289a.a(str3, "", false);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
        });
        setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.g.a.b.3
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        });
        sg.bigo.ads.common.n.d.a(this.f104291c);
        if (this.f104291c == null) {
            this.f104291c = new Runnable() { // from class: sg.bigo.ads.core.g.a.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f104289a != null) {
                        b.this.f104289a.a("vpaid prepare timeout");
                    }
                }
            };
        }
        sg.bigo.ads.common.n.d.a(3, this.f104291c, 15000L);
        loadDataWithBaseURL("http://127.0.0.1/", "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>VPAID AD</title>\n    <script>\n        window.onload = function() {\n            tryToPrepareAd();\n        }\n\n        document.onreadystatechange = function() {\n            tryToPrepareAd();\n        }\n\n        function tryToPrepareAd() {\n            if (document.readyState != \"complete\") {\n                return;\n            }\n\n            if (window.vpaidwrapper && window.vpaidwrapper.isVPAIDCreativeReady()) {\n                return;\n            }\n\n            window.vpaidframe = document.getElementById(\"vpaid-iframe\");\n            if (window.vpaidframe) {\n                var fn = window.vpaidframe.contentWindow['getVPAIDAd'];\n                var vpaidDiv = document.getElementById(\"vpaid-container\");\n                var vpaidframeDoc = window.vpaidframe.contentDocument || window.vpaidframe.contentWindow.document;\n                var slot = vpaidframeDoc.getElementById(\"slot\");\n                var videoSlot = document.getElementById(\"video-slot\");\n                var vpaidwrapper;\n                if (fn && typeof fn == 'function') {\n                    vpaidwrapper = new VPAIDWrapper(fn(), vpaidDiv, slot, videoSlot)\n                } else {\n                    vpaidwrapper = new VPAIDWrapper();\n                }\n                window.vpaidwrapper = vpaidwrapper;\n            }\n        }\n    </script>\n    <script src=\"vpaid.js\" type=\"text/javascript\"></script>\n</head>\n\n<body style=\"display: flex; justify-content: center; align-items: center;\">\n<div id=\"ad-container\">\n    <video height=\"100%\" id=\"video-slot\" muted playsinline width=\"100%\"></video>\n</div>\n<div id=\"vpaid-container\"\n     style=\"position: absolute; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none;\">\n    <iframe frameborder=\"0\" height=\"100%\" id=\"vpaid-iframe\" marginheight=\"0\" marginwidth=\"0\"\n            scrolling=\"no\"\n            src=\"vpaid_iframe.html\"\n            style=\"margin: 0px; padding: 0px; border: none;\"\n            width=\"100%\"></iframe>\n</div>\n</body>\n</html>", "text/html", "UTF-8", null);
        setLayoutParams((i12 == 1 || i12 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Nullable
    private String b(@NonNull String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        evaluateJavascript(str, new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                countDownLatch.countDown();
                strArr[0] = str2;
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        return strArr[0];
    }

    @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebChromeClient(null);
        setWebViewClient(null);
    }

    @Override // sg.bigo.ads.core.h.e, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.f104301q.f102538b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f104301q.f102537a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return this.f104303s && super.dispatchTouchEvent(motionEvent);
    }

    public final String getAdCompanions() {
        return b("window.vpaidwrapper.getAdCompanions()");
    }

    public final int getAdDuration() {
        return (int) d.b(b("window.vpaidwrapper.getAdDuration()"));
    }

    public final boolean getAdExpanded() {
        return d.c(b("window.vpaidwrapper.getAdExpanded()"));
    }

    public final int getAdHeight() {
        return d.a(b("window.vpaidwrapper.getAdHeight()"));
    }

    public final boolean getAdIcons() {
        return d.c(b("window.vpaidwrapper.getAdIcons()"));
    }

    public final boolean getAdLinear() {
        return d.c(b("window.vpaidwrapper.getAdLinear()"));
    }

    public final int getAdRemainingTime() {
        return (int) d.b(b("window.vpaidwrapper.getAdRemainingTime()"));
    }

    public final boolean getAdSkippableState() {
        return d.c(b("window.vpaidwrapper.getAdSkippableState()"));
    }

    public final float getAdVolume() {
        return d.b(b("window.vpaidwrapper.getAdVolume()"));
    }

    public final int getAdWidth() {
        return d.a(b("window.vpaidwrapper.getAdWidth()"));
    }

    @NonNull
    public final i getClickPoints() {
        return this.f104301q;
    }

    @Nullable
    public final e getVPAIDEvenListener() {
        return this.f104289a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r0 != 4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[PHI: r0 r3
  0x009f: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:36:0x00af, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r3v6 int) = (r3v5 int), (r3v8 int) binds: [B:36:0x00af, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.b.onMeasure(int, int):void");
    }

    public final void setAdVolume(float f10) {
        a("window.vpaidwrapper.setAdVolume(" + f10 + ")");
    }

    public final void setOnRenderProcessGoneListener(@Nullable a aVar) {
        this.f104290b = aVar;
    }

    public final void setVPAIDClickable(boolean z10) {
        this.f104303s = z10;
    }

    public final void setVPAIDEvenListener(@Nullable e eVar) {
        this.f104289a = eVar;
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        a("window.vpaidwrapper.pauseAd()");
    }

    private void a(int i10, int i11) {
        t tVar = this.f104292d;
        if (tVar == null || !tVar.f102234j) {
            return;
        }
        a("window.vpaidwrapper.resizeAd(" + sg.bigo.ads.common.utils.e.c(getContext(), i10) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), i11) + ", " + JSONObject.quote(this.f104296l.f104319d) + ")");
    }

    public final void b() {
        a("tryToPrepareAd()");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f104297m;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt("AdParameters", str);
        } catch (JSONException unused) {
        }
        this.f104292d.a(2);
        a("window.vpaidwrapper.initAd(" + sg.bigo.ads.common.utils.e.c(getContext(), measuredWidth) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), measuredHeight) + ", " + JSONObject.quote(this.f104296l.f104319d) + ", -1, " + jSONObject + ")");
    }

    private void b(int i10, int i11) {
        setMeasuredDimension(i10, i11);
        a(i10, i11);
    }

    public final void a(@NonNull String str) {
        if (!this.f104302r.get()) {
            sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Injecting Javascript into VPAID WebView error, creative no ready:\n\t".concat(String.valueOf(str)));
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", "Injecting Javascript into VPAID WebView:\n\t".concat(String.valueOf(str)));
            loadUrl("javascript:".concat(String.valueOf(str)));
        }
    }
}
