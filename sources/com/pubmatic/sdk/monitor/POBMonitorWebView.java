package com.pubmatic.sdk.monitor;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.AssetHelper;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBMonitorWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f62670a;
    public boolean isLoaded;

    class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f62671a;

        a(e eVar) {
            this.f62671a = eVar;
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorWebView.e
        public void a() {
            POBMonitorWebView.this.isLoaded = true;
            this.f62671a.a();
        }

        @Override // com.pubmatic.sdk.monitor.POBMonitorWebView.e
        public void b() {
            this.f62671a.b();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62673a;

        class a implements ValueCallback {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        b(String str) {
            this.f62673a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMonitorWebView.this.evaluateJavascript(String.format("pmMonitor.broadcast('%s')", this.f62673a), new a());
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f62676a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f62677a;

            a(JSONObject jSONObject) {
                this.f62677a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                POBMonitorWebView.a(c.this.f62676a, this.f62677a.optString("body", ""));
            }
        }

        /* synthetic */ c(Context context, a aVar) {
            this(context);
        }

        @JavascriptInterface
        public void nativeCall(String str) {
            JSONObject jSONObject;
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (!jSONObject2.optString("name", "").startsWith("share") || (jSONObject = jSONObject2.getJSONObject("params")) == null) {
                    return;
                }
                POBTaskHandler.getInstance().runOnMainThread(new a(jSONObject));
            } catch (JSONException e10) {
                POBLog.debug("POBMonitorWebView", e10.getLocalizedMessage(), new Object[0]);
            }
        }

        private c(Context context) {
            this.f62676a = context;
        }
    }

    private static class d extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f62679a;

        /* synthetic */ d(e eVar, a aVar) {
            this(eVar);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f62679a.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            POBLog.warn("POBMonitorWebView", "WebView Render process gone.", new Object[0]);
            this.f62679a.b();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        private d(e eVar) {
            this.f62679a = eVar;
        }
    }

    interface e {
        void a();

        void b();
    }

    public POBMonitorWebView(Context context) {
        super(context);
        this.isLoaded = false;
        this.f62670a = new ArrayList();
    }

    static void a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.setFlags(268435456);
        try {
            POBUtils.startActivity(context, intent);
        } catch (Exception e10) {
            POBLog.warn("POBMonitorWebView", "Unable to share data via intent. Error: %s", e10.getMessage());
        }
    }

    public void appendData(JSONObject jSONObject) {
        String string = jSONObject.toString();
        if (!a(string)) {
            this.f62670a.add(string);
            return;
        }
        Iterator it = this.f62670a.iterator();
        while (it.hasNext()) {
            a((String) it.next());
            it.remove();
        }
    }

    public void initWebView(e eVar) {
        getSettings().setJavaScriptEnabled(true);
        clearCache(true);
        clearHistory();
        a aVar = new a(eVar);
        a aVar2 = null;
        setWebViewClient(new d(aVar, aVar2));
        setWebChromeClient(new WebChromeClient());
        addJavascriptInterface(new c(getContext(), aVar2), "nativeBridge");
    }

    private boolean a(String str) {
        if (!this.isLoaded) {
            return false;
        }
        post(new b(str));
        return true;
    }
}
