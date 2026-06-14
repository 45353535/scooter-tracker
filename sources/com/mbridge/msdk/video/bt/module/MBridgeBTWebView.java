package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.video.signal.impl.k;
import com.taurusx.tax.g.f0;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f52234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f52235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f52236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f52237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f52238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f52239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f52240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f52241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private WebView f52242x;

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTWebView.this.f52242x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f52110n);
                    jSONObject.put("id", MBridgeBTWebView.this.f52115d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f52242x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f52242x, "onClicked", MBridgeBTWebView.this.f52115d);
                }
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeBTWebView.this.close();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WindVaneWebView windVaneWebView = MBridgeBTWebView.this.webView;
                if (windVaneWebView != null) {
                    windVaneWebView.clearWebView();
                    MBridgeBTWebView.this.webView.release();
                }
                MBridgeBTWebView.this.f52234p = null;
                MBridgeBTWebView.this.f52235q = null;
                MBridgeBTWebView.this.f52236r = null;
                if (MBridgeBTWebView.this.f52242x != null) {
                    MBridgeBTWebView.this.f52242x = null;
                }
            } catch (Throwable th2) {
                q0.a(BTBaseView.TAG, th2.getMessage());
            }
        }
    }

    public MBridgeBTWebView(Context context) {
        super(context);
        this.f52237s = false;
        this.f52239u = false;
    }

    private void setIntentFilter(com.mbridge.msdk.mbsignalcommon.base.c cVar) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(cVar);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f52110n);
                jSONObject2.put("id", this.f52115d);
                jSONObject2.put(C4240b4.i.f42633j0, str);
                jSONObject2.put("data", jSONObject);
                f.a().a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "broadcast", this.f52115d);
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        WebView webView = this.f52242x;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f52115d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    public List<CampaignEx> getCampaigns() {
        return this.f52241w;
    }

    public String getFilePath() {
        return this.f52235q;
    }

    public String getFileURL() {
        return this.f52234p;
    }

    public String getHtml() {
        return this.f52236r;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f52113b;
    }

    public com.mbridge.msdk.videocommon.setting.c getRewardUnitSetting() {
        return this.f52240v;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.webView = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        k kVar = new k(null, this.f52113b, this.f52241w);
        this.jsCommon = kVar;
        kVar.setUnitId(this.f52114c);
        if (com.mbridge.msdk.util.b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        this.webView.setObject(this.jsCommon);
        this.webView.setMraidObject(this);
        this.webView.setWebViewListener(new a());
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new b());
        try {
            ImageView imageView = new ImageView(getContext());
            this.f52238t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f52238t.setLayoutParams(layoutParams);
            this.f52238t.setVisibility(this.f52237s ? 4 : 8);
            CampaignEx campaignEx = this.f52113b;
            if (campaignEx != null && campaignEx.isMraid()) {
                this.f52238t.setVisibility(4);
            }
            this.f52238t.setOnClickListener(new c());
            addView(this.f52238t);
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void onBackPressed() {
        if (this.webView != null) {
            com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "onSystemBackPressed", this.f52115d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.f52115d);
                f.a().a((WebView) this.webView, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f52239u) {
            return;
        }
        this.f52239u = true;
        try {
            if (this.webView != null) {
                com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "onSystemDestory", this.f52115d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new d(), 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        try {
            String clickURL = this.f52113b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f52113b.setClickURL(str);
                reportOpen(str);
            }
            this.f52113b.setClickTempSource(2);
            this.f52113b.setClickType(2);
            this.f52113b.setTriggerClickSource(2);
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), this.f52114c);
            aVar.a(this);
            aVar.a(this.f52113b);
            this.f52113b.setClickURL(clickURL);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f52234p)) {
            this.webView.loadUrl(this.f52234p);
        } else if (!TextUtils.isEmpty(this.f52235q)) {
            this.webView.loadUrl(this.f52235q);
        } else {
            if (TextUtils.isEmpty(this.f52236r)) {
                return;
            }
            this.webView.loadDataWithBaseURL("", this.f52236r, "text/html", "UTF-8", null);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f52114c, str, this.f52113b.isBidCampaign());
            }
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f52241w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f52242x = webView;
    }

    public void setFilePath(String str) {
        this.f52235q = str;
    }

    public void setFileURL(String str) {
        this.f52234p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zContains = str.contains(f0.f66126w);
        setWebviewClickable(!zContains);
        if (zContains) {
            setIntentFilter(new com.mbridge.msdk.mbsignalcommon.base.c());
        }
    }

    public void setHtml(String str) {
        this.f52236r = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        this.f52240v = cVar;
    }

    public void setTempTypeForMetrics(int i10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setTempTypeForMetrics(i10);
        }
    }

    public void setWebViewLocalRequestId(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setLocalRequestId(str);
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z10);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            this.f52238t.setVisibility(z10 ? 4 : 0);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage());
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.webView.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.webView.goForward();
        return true;
    }

    public void webviewLoad(int i10) {
        if (this.jsCommon == null) {
            this.jsCommon = new k(null, this.f52113b, this.f52241w);
        }
        CampaignEx campaignEx = this.f52113b;
        if (campaignEx != null) {
            this.jsCommon.c(campaignEx);
        } else {
            List<CampaignEx> list = this.f52241w;
            if (list != null && list.size() > 0) {
                this.jsCommon.a(this.f52241w);
                if (this.f52241w.size() == 1) {
                    this.jsCommon.c(this.f52241w.get(0));
                }
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.f52240v;
        if (cVar != null) {
            this.jsCommon.setRewardUnitSetting(cVar);
        }
        this.jsCommon.setUnitId(this.f52114c);
        this.jsCommon.c(this.f52115d);
        if (com.mbridge.msdk.util.b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i10 == 1) {
            this.jsCommon.r();
        }
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.jsCommon);
        }
        CampaignEx campaignEx2 = this.f52113b;
        if (campaignEx2 != null && campaignEx2.isMraid()) {
            this.f52238t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52237s = false;
        this.f52239u = false;
    }

    class a extends com.mbridge.msdk.mbsignalcommon.listener.a {
        a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj) {
            super.a(obj);
            try {
                k kVar = MBridgeBTWebView.this.jsCommon;
                String strEncodeToString = "";
                String strC = kVar != null ? kVar.c() : "";
                if (TextUtils.isEmpty(strC)) {
                    q0.a("RVWindVaneWebView", "getEndScreenInfo failed");
                } else {
                    strEncodeToString = Base64.encodeToString(strC.getBytes(), 2);
                    q0.a("RVWindVaneWebView", "getEndScreenInfo success");
                }
                f.a().b(obj, strEncodeToString);
            } catch (Throwable th2) {
                q0.a("RVWindVaneWebView", th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (MBridgeBTWebView.this.f52242x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f52115d);
                    jSONObject.put("code", BTBaseView.f52110n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f52115d);
                    jSONObject2.put("result", 1);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f52242x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f52242x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
            f.a().a(MBridgeBTWebView.this.webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            if (MBridgeBTWebView.this.f52242x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f52115d);
                    jSONObject.put("code", BTBaseView.f52110n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f52115d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f52242x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f52242x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (MBridgeBTWebView.this.f52242x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f52115d);
                    jSONObject.put("code", BTBaseView.f52110n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f52115d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", sslError.toString());
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f52242x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f52242x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
        }
    }
}
