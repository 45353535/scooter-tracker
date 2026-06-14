package com.mbridge.msdk.config.component.wei;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.ironsource.C4240b4;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(api = 23)
public class WeiCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ComponentWebView f47318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f47319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f47320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    com.mbridge.msdk.config.component.wei.monitor.b f47321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    com.mbridge.msdk.config.component.wei.monitor.a f47322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    WebMessagePort f47323r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f47313h = "1100001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f47314i = "1100002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f47315j = "1100003";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final String f47316k = "1100004";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f47317l = "SenderPortKey_";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    HashMap<String, WebMessagePort> f47324s = new HashMap<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ConcurrentLinkedQueue<com.mbridge.msdk.config.component.wei.model.a> f47325t = new ConcurrentLinkedQueue<>();

    class a implements com.mbridge.msdk.config.dynamic.baseview.webview.listener.a {
        a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageFinished(WebView webView, String str) {
            WeiCpt.this.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f47319n || weiCpt.f47320o) {
                return;
            }
            weiCpt.f47320o = true;
            weiCpt.a(weiCpt.a("905003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeiCpt.this.f47322q.b(webView);
            WeiCpt.this.f47322q.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905002", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onProgressChanged(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f47320o || weiCpt.f47319n) {
                return;
            }
            weiCpt.f47319n = true;
            weiCpt.a("905004", String.valueOf(i10), str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onRenderProcessGone(WebView webView) {
            WeiCpt.this.a("905005", "1100003", "WebView did crash");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap map = new HashMap();
            map.put("action", "redirect");
            HashMap map2 = new HashMap();
            map2.put("url", str);
            map.put("data", map2);
            HashMap map3 = new HashMap();
            map3.put("js_interaction", map);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905006", map3));
            return false;
        }
    }

    class b extends WebMessagePort.WebMessageCallback {
        b() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WeiCpt.this.a(webMessage);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebMessagePort f47328a;

        c(WebMessagePort webMessagePort) {
            this.f47328a = webMessagePort;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47328a.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str) {
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected synchronized void b(Map<String, Object> map) {
        try {
            this.f46644f = "905001";
            com.mbridge.msdk.config.component.wei.model.a aVar = new com.mbridge.msdk.config.component.wei.model.a(map);
            this.f47325t.add(aVar);
            ViewGroup viewGroupE = e();
            if (viewGroupE == null) {
                return;
            }
            if (TextUtils.isEmpty(aVar.h())) {
                this.f47318m = (ComponentWebView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, ComponentWebView.class);
            } else {
                View viewFindViewWithTag = viewGroupE.findViewWithTag(aVar.h());
                if (viewFindViewWithTag instanceof WebView) {
                    this.f47318m = (ComponentWebView) viewFindViewWithTag;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f47318m != null) {
            while (!this.f47325t.isEmpty()) {
                final com.mbridge.msdk.config.component.wei.model.a aVarPoll = this.f47325t.poll();
                if (aVarPoll != null) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.wei.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f47330b.a(aVarPoll);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (!TextUtils.isEmpty(aVar.b())) {
            String strB = aVar.b();
            strB.getClass();
            switch (strB) {
                case "forward":
                    if (this.f47318m.canGoForward()) {
                        this.f47318m.goForward();
                        break;
                    }
                    break;
                case "hide":
                    this.f47318m.setVisibility(8);
                    break;
                case "load":
                    c(aVar);
                    b(aVar);
                    break;
                case "show":
                    if (this.f47318m.getVisibility() != 0) {
                        this.f47318m.setVisibility(0);
                        break;
                    }
                    break;
                case "close":
                    if (this.f47318m.getParent() != null && (this.f47318m.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) this.f47318m.getParent()).removeView(this.f47318m);
                        break;
                    }
                    break;
                case "evaluate_js":
                    String strA = com.mbridge.msdk.config.dynamic.baseview.webview.util.a.a(aVar.c());
                    if (!TextUtils.isEmpty(strA)) {
                        d(strA);
                        break;
                    }
                    break;
                case "refresh":
                    this.f47318m.reload();
                    break;
                case "backward":
                    if (this.f47318m.canGoBack()) {
                        this.f47318m.goBack();
                        break;
                    }
                    break;
            }
        }
        if (aVar.e() == null || aVar.e().isEmpty()) {
            return;
        }
        a(this.f47318m, aVar.e());
    }

    private void c(com.mbridge.msdk.config.component.wei.model.a aVar) {
        this.f47322q = new com.mbridge.msdk.config.component.wei.monitor.a();
        this.f47321p = new com.mbridge.msdk.config.component.wei.monitor.b(aVar.a());
        this.f47318m.setWebViewEventListener(new a());
        if (aVar.i()) {
            this.f47321p.a(this.f47318m);
        }
    }

    public void d(String str) {
        try {
            ComponentWebView componentWebView = this.f47318m;
            if (componentWebView != null && !componentWebView.isDestroyed()) {
                this.f47318m.evaluateJavascript(str, new ValueCallback() { // from class: com.mbridge.msdk.config.component.wei.a
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        WeiCpt.c((String) obj);
                    }
                });
            }
        } catch (Throwable th2) {
            q0.b("WebViewComponent", th2.getMessage());
        }
    }

    private void b(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (TextUtils.isEmpty(aVar.g()) && TextUtils.isEmpty(aVar.d())) {
            if (this.f47318m.hasXmlUrl()) {
                this.f47318m.loadXMLUrl();
                return;
            } else {
                a("905004", "1100001", "Input parameter error");
                return;
            }
        }
        if (!TextUtils.isEmpty(aVar.g())) {
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                this.f47318m.loadUrl(aVar.g());
                return;
            } else {
                this.f47318m.loadUrl(strF);
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.d())) {
            return;
        }
        this.f47318m.loadDataWithBaseURL("", aVar.d(), "text/html", "UTF-8", null);
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        String str;
        String strValueOf;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = this.f46639a.get("componentConfig");
                str = "";
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get("url");
                    Object obj3 = ((Map) obj).get("html_code");
                    String strValueOf2 = obj2 instanceof String ? String.valueOf(obj2) : "";
                    strValueOf = obj3 instanceof String ? String.valueOf(obj3) : "";
                    str = strValueOf2;
                } else {
                    strValueOf = "";
                }
                Object obj4 = map.get("componentConfig");
                if (obj4 instanceof Map) {
                    Object obj5 = ((Map) obj4).get("url");
                    Object obj6 = ((Map) obj4).get("html_code");
                    if (obj5 instanceof String) {
                        String str2 = (String) obj5;
                        if (!TextUtils.isEmpty(str2)) {
                            return str2.equals(str);
                        }
                    }
                    if (obj6 instanceof String) {
                        String str3 = (String) obj6;
                        return !TextUtils.isEmpty(str3) && str3.hashCode() == strValueOf.hashCode();
                    }
                }
            } catch (Throwable th2) {
                q0.b("WebViewComponent", th2.getMessage(), th2);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    public void a(WebView webView) {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        this.f47323r = webMessagePortArrCreateWebMessageChannel[0];
        webView.postWebMessage(new WebMessage("port_ready", new WebMessagePort[]{webMessagePortArrCreateWebMessageChannel[1]}), Uri.EMPTY);
        this.f47323r.setWebMessageCallback(new b());
    }

    public void a(WebMessage webMessage) {
        if (webMessage == null) {
            return;
        }
        String data = webMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        try {
            Map<String, Object> mapA = new e().a(data);
            String strValueOf = String.valueOf(mapA.get("action"));
            String str = "SenderPortKey_" + System.currentTimeMillis() + "_" + strValueOf;
            WebMessagePort[] ports = webMessage.getPorts();
            if (ports != null && ports.length > 0) {
                this.f47324s.put(str, ports[0]);
            }
            Map<String, Object> map = new HashMap<>();
            map.put(C4240b4.i.K, this.f47318m);
            map.put("superview", this.f47318m.getParent());
            HashMap map2 = new HashMap();
            map2.put("action", strValueOf);
            map2.put("reply_name", str);
            Object obj = mapA.get("data");
            if (obj == null) {
                obj = "";
            }
            map2.put("data", obj);
            map2.put("type", "mv");
            map.put("js_interaction", map2);
            map.put("click_x", String.valueOf(this.f47318m.getxInScreen()));
            map.put("click_y", String.valueOf(this.f47318m.getyInScreen()));
            map.put("click_time", String.valueOf(this.f47318m.getClickTimeStamp()));
            a(a("905006", map));
        } catch (Throwable th2) {
            q0.b("WebViewComponent", th2.getMessage(), th2);
        }
    }

    @RequiresApi(api = 23)
    public void a(WebView webView, List<Map<String, Object>> list) {
        WebMessagePort webMessagePort;
        for (Map<String, Object> map : list) {
            try {
                String strValueOf = String.valueOf(map.get("action"));
                WebMessage webMessage = new WebMessage(new JSONObject(com.mbridge.msdk.config.component.common.util.c.a(map)).toString());
                if (this.f47324s.containsKey(strValueOf) && (webMessagePort = this.f47324s.get(strValueOf)) != null) {
                    webMessagePort.postMessage(webMessage);
                    this.f47324s.remove(strValueOf);
                    this.f47318m.postDelayed(new c(webMessagePort), 3000L);
                    return;
                } else {
                    WebMessagePort webMessagePort2 = this.f47323r;
                    if (webMessagePort2 != null) {
                        webMessagePort2.postMessage(webMessage);
                    } else {
                        webView.postWebMessage(webMessage, Uri.EMPTY);
                    }
                }
            } catch (Throwable th2) {
                q0.b("WebViewComponent", th2.getMessage(), th2);
            }
        }
    }
}
