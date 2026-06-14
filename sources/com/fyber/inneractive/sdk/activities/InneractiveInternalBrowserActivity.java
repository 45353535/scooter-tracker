package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o0;
import com.fyber.inneractive.sdk.util.v;
import com.ironsource.D5;
import com.taurusx.tax.mraid.MraidBrowser;
import java.net.URLDecoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f20124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static InternalBrowserListener f20125k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f20126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f20128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f20129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageButton f20130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageButton f20131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f20132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f20133i;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, com.fyber.inneractive.sdk.click.b bVar) {
        r rVar;
        x xVar = inneractiveInternalBrowserActivity.f20126b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f21035a : null;
        com.fyber.inneractive.sdk.response.e eVarB = xVar != null ? xVar.b() : null;
        x xVar2 = inneractiveInternalBrowserActivity.f20126b;
        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f21037c) == null) ? null : rVar.b();
        u uVar = u.FYBER_SUCCESS_CLICK;
        w wVar = new w(eVarB);
        wVar.f21418c = uVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        long j10 = bVar.f20253e;
        if (j10 != 0) {
            Object objValueOf = Long.valueOf(j10);
            try {
                jSONObject.put("time_passed", objValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", objValueOf);
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (com.fyber.inneractive.sdk.click.j jVar : bVar.f20254f) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("url", jVar.f20271a);
                jSONObject2.put("success", jVar.f20272b);
                jSONObject2.put("opened_by", jVar.f20273c);
                jSONObject2.put("reason", jVar.f20274d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        Object obj = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.f("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new o0(webView).run();
    }

    public static void setHtmlExtra(String str) {
        f20124j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f20125k = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = f20125k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.f20127c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.f20127c)) != null) {
                this.f20126b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.f20129e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f20129e);
            this.f20129e.setWebChromeClient(new e(this));
            String stringExtra2 = intent.getStringExtra(MraidBrowser.f66374a);
            if (!TextUtils.isEmpty(f20124j)) {
                String str = f20124j + "<title>DigitalTurbine Internal Browser</title>";
                f20124j = str;
                this.f20129e.loadDataWithBaseURL(stringExtra2, str, "text/html", "UTF-8", null);
            } else if (TextUtils.isEmpty(stringExtra2)) {
                IAlog.f("Empty url", new Object[0]);
                finish();
            } else if (!h0.d(stringExtra2)) {
                this.f20129e.loadUrl(stringExtra2);
            } else if (h0.c(stringExtra2)) {
                try {
                    stringExtra2 = URLDecoder.decode(stringExtra2, D5.N);
                    this.f20129e.loadUrl(stringExtra2);
                } catch (Exception unused) {
                    IAlog.f("Failed to open Url: %s", stringExtra2);
                    finish();
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                    InternalBrowserListener internalBrowserListener = f20125k;
                    if (internalBrowserListener != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                } catch (ActivityNotFoundException unused2) {
                    IAlog.f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                }
                finish();
            }
            this.f20130f.setBackgroundColor(0);
            this.f20130f.setOnClickListener(new i(this));
            this.f20130f.setContentDescription("IABackButton");
            this.f20131g.setBackgroundColor(0);
            this.f20131g.setOnClickListener(new j(this));
            this.f20131g.setContentDescription("IAForwardButton");
            this.f20132h.setBackgroundColor(0);
            this.f20132h.setOnClickListener(new k(this));
            this.f20132h.setContentDescription("IARefreshButton");
            this.f20133i.setBackgroundColor(0);
            this.f20133i.setOnClickListener(new l(this));
            this.f20133i.setContentDescription("IACloseButton");
            com.fyber.inneractive.sdk.util.o.a();
            com.fyber.inneractive.sdk.util.o.f();
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.f20128d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f20129e;
        if (webView != null) {
            webView.removeAllViews();
            v.a(this.f20129e);
            this.f20129e.destroy();
            this.f20129e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.fyber.inneractive.sdk.util.o.g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.util.o.f();
    }

    public final LinearLayout a() {
        this.f20128d = new LinearLayout(this);
        this.f20128d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f20128d.setOrientation(1);
        this.f20128d.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f20128d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        com.fyber.inneractive.sdk.util.o.a(linearLayout, com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f20130f = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_left_arrow));
        this.f20131g = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_right_arrow));
        this.f20132h = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_refresh));
        this.f20133i = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_close));
        linearLayout.addView(this.f20130f);
        linearLayout.addView(this.f20131g);
        linearLayout.addView(this.f20132h);
        linearLayout.addView(this.f20133i);
        WebView webView = new WebView(IAConfigManager.O.f20316v.a());
        this.f20129e = webView;
        webView.setWebViewClient(new f(this));
        this.f20129e.setId(R.id.ia_inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f20129e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f20129e);
        return this.f20128d;
    }

    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        Resources resources = getResources();
        int i10 = R.integer.ia_ib_button_size_dp;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.fyber.inneractive.sdk.util.o.b(resources.getInteger(i10)), com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(i10)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
