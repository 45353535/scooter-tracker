package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.f1;
import com.fyber.inneractive.sdk.util.o0;
import com.fyber.inneractive.sdk.util.v;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class FyberReportAdActivity extends InneractiveBaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static com.fyber.inneractive.sdk.flow.h f20110f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebView f20111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20114e;

    public static Intent createIntent(Context context, String str, String str2, Long l10) {
        Intent intent = new Intent(context, (Class<?>) FyberReportAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString("advertiser_domain", str);
        bundle.putString("dsp_name", str2);
        bundle.putString("dsp_id", l10 != null ? Long.toString(l10.longValue()) : null);
        intent.putExtras(bundle);
        return intent;
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new o0(webView).run();
    }

    public static com.fyber.inneractive.sdk.flow.h getAdReporter() {
        return f20110f;
    }

    public static void start(Context context, com.fyber.inneractive.sdk.flow.h hVar, String str, String str2, Long l10) {
        f20110f = hVar;
        try {
            context.startActivity(createIntent(context, str, str2, l10));
        } catch (Exception e10) {
            IAlog.a("failed starting fyber report ad activity", e10, new Object[0]);
        }
    }

    public final FrameLayout a() {
        WebView webView;
        FrameLayout frameLayout = new FrameLayout(this);
        try {
            webView = new WebView(IAConfigManager.O.f20316v.a());
            webView.setWebViewClient(new a(this));
            webView.setId(R.id.ia_inneractive_webview_report_ad);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(webView);
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(this.f20112c)) {
                map.put("advertiser_domain", this.f20112c);
            }
            if (!TextUtils.isEmpty(this.f20113d)) {
                map.put("dsp_name", this.f20113d);
            }
            if (!TextUtils.isEmpty(this.f20114e)) {
                map.put("dsp_id", this.f20114e);
            }
            webView.loadUrl(f1.a("https://cdn2.inner-active.mobi/client/fyber-i-icon/index.html", map));
        } catch (Exception unused) {
            IAlog.b("failed creating webivew for report ad", new Object[0]);
            finish();
            webView = null;
        }
        this.f20111b = webView;
        frameLayout.addView(webView, -1, -1);
        return frameLayout;
    }

    public String getAdDomain() {
        return this.f20112c;
    }

    public String getAdNetwork() {
        return this.f20113d;
    }

    public String getAdNetworkId() {
        return this.f20114e;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.f20112c = extras.getString("advertiser_domain");
                this.f20113d = extras.getString("dsp_name");
                this.f20114e = extras.getString("dsp_id");
            }
            setContentView(a());
        } catch (Exception e10) {
            IAlog.a("failed creating fyber report ad activity", e10, new Object[0]);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        WebView webView = this.f20111b;
        if (webView != null) {
            webView.removeAllViews();
            v.a(this.f20111b);
            this.f20111b.destroy();
            this.f20111b = null;
        }
        f20110f = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }
}
