package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.e8;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f11821a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f11823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EventListener f11824d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f11824d = eventListener;
        this.f11822b = str;
        this.f11821a.set(false);
        WebView webView = this.f11823c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f11824d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY))) {
            o.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        k kVarA = AppLovinSdk.getInstance(getApplicationContext()).a();
        e8.a(findViewById(android.R.id.content), kVarA);
        a(kVarA);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.f11822b = stringExtra;
        }
        if (StringUtils.isValidString(this.f11822b)) {
            this.f11823c.loadUrl(this.f11822b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        WebView webViewB = n7.b(this, "WebView Activity");
        this.f11823c = webViewB;
        if (webViewB == null) {
            finish();
            return;
        }
        setContentView(webViewB);
        WebSettings settings = this.f11823c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f11823c.setVerticalScrollBarEnabled(true);
        this.f11823c.setHorizontalScrollBarEnabled(true);
        this.f11823c.setScrollBarStyle(33554432);
        this.f11823c.setWebViewClient(new a(kVar));
    }

    class a extends t4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f11825a;

        a(k kVar) {
            this.f11825a = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(k kVar) {
            if (!((Boolean) kVar.a(x4.S5)).booleanValue() || !AppLovinWebViewActivity.this.f11821a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(kVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f11822b)) {
                AppLovinWebViewActivity.this.f11823c.loadUrl(AppLovinWebViewActivity.this.f11822b);
            }
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f11823c == webView) {
                AppLovinWebViewActivity.this.f11823c.destroy();
                AppLovinWebViewActivity.this.f11823c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final k kVar = this.f11825a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11827b.a(kVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            this.f11825a.O();
            if (o.a()) {
                this.f11825a.O().a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f11824d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str2)) {
                this.f11825a.O();
                if (!o.a()) {
                    return true;
                }
                this.f11825a.O().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String queryParameter = uri.getQueryParameter(str2);
            this.f11825a.O();
            if (o.a()) {
                this.f11825a.O().a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
            }
            AppLovinWebViewActivity.this.f11824d.onReceivedEvent(queryParameter);
            return true;
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }
}
