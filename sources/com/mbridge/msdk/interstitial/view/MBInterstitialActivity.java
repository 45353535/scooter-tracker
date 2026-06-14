package com.mbridge.msdk.interstitial.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.controller.a;
import com.mbridge.msdk.mbsignalcommon.mraid.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBInterstitialActivity extends MBBaseActivity implements com.mbridge.msdk.mbsignalcommon.mraid.b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CampaignEx f49222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WindVaneWebView f49223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImageView f49224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a.d f49225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.d f49227m;
    public ProgressBar mProgressBar;
    public String mUnitid;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f49228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f49229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f49230p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.click.a f49234t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49220f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49221g = false;
    public boolean mIsMBPage = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Handler f49231q = new f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Runnable f49232r = new j();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Runnable f49233s = new k();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    class c implements NativeListener.NativeTrackingListener {
        c() {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.hideLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MBInterstitialActivity.this.hideLoading();
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.showLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(MBInterstitialActivity.this.f49223i, MBInterstitialActivity.this.f49223i.getLeft(), MBInterstitialActivity.this.f49223i.getTop(), MBInterstitialActivity.this.f49223i.getWidth(), MBInterstitialActivity.this.f49223i.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f49223i, MBInterstitialActivity.this.f49223i.getLeft(), MBInterstitialActivity.this.f49223i.getTop(), MBInterstitialActivity.this.f49223i.getWidth(), MBInterstitialActivity.this.f49223i.getHeight());
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(MBInterstitialActivity.this)).b(MBInterstitialActivity.this.f49222h.getId());
        }
    }

    class f extends Handler {
        f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBInterstitialActivity.this.finish();
        }
    }

    class i extends com.mbridge.msdk.mbsignalcommon.listener.b {
        i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            try {
                if (MBInterstitialActivity.this.f49226l) {
                    return;
                }
                MBInterstitialActivity.this.a(1, "");
                MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
                if (mBInterstitialActivity.f49232r != null && mBInterstitialActivity.f49231q != null) {
                    MBInterstitialActivity.this.f49231q.removeCallbacks(MBInterstitialActivity.this.f49232r);
                }
                if (MBInterstitialActivity.this.f49225k != null) {
                    MBInterstitialActivity.this.f49225k.c();
                }
                MBInterstitialActivity mBInterstitialActivity2 = MBInterstitialActivity.this;
                if (!mBInterstitialActivity2.mIsMBPage) {
                    mBInterstitialActivity2.f49231q.postDelayed(MBInterstitialActivity.this.f49233s, 2000L);
                }
                MBInterstitialActivity.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
                if (MBInterstitialActivity.this.f49225k != null) {
                    MBInterstitialActivity.this.f49225k.a("load page failed");
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onProgressChanged(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            try {
                MBInterstitialActivity.this.f49226l = true;
                if (MBInterstitialActivity.this.f49225k != null) {
                    MBInterstitialActivity.this.f49225k.a(str);
                }
                MBInterstitialActivity.this.a(3, str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MBInterstitialActivity.this.f49226l = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f49221g) {
                return;
            }
            MBInterstitialActivity.this.f49220f = true;
            if (MBInterstitialActivity.this.f49225k != null) {
                MBInterstitialActivity.this.f49225k.a("load page timeout");
                if (MBInterstitialActivity.this.f49223i != null) {
                    MBInterstitialActivity.this.f49223i.setVisibility(8);
                    MBInterstitialActivity.this.f49223i.setWebViewListener(null);
                    MBInterstitialActivity.this.f49223i.release();
                }
                MBInterstitialActivity.this.hideLoading();
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
            if (mBInterstitialActivity.mIsMBPage) {
                return;
            }
            if (mBInterstitialActivity.f49222h != null && MBInterstitialActivity.this.f49222h.isMraid()) {
                MBInterstitialActivity.this.m();
            }
            com.mbridge.msdk.interstitial.cache.a.a().a(MBInterstitialActivity.this.f49222h, MBInterstitialActivity.this.mUnitid);
            if (MBInterstitialActivity.this.f49220f) {
                return;
            }
            MBInterstitialActivity.this.f49221g = true;
            MBInterstitialActivity.this.hideLoading();
            MBInterstitialActivity.this.showWebView();
        }
    }

    class l implements d.b {
        l() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f49223i, d10);
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MBInterstitialActivity.this.f49223i != null && MBInterstitialActivity.this.f49222h != null) {
                    MBInterstitialActivity.this.f49223i.setVisibility(0);
                    if (MBInterstitialActivity.this.f49222h.isMraid()) {
                        MBInterstitialActivity.this.k();
                    }
                    MBInterstitialActivity.this.j();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f49223i != null) {
                MBInterstitialActivity.this.f49223i.setVisibility(8);
            }
        }
    }

    private void l() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getApplicationContext());
        CampaignEx campaignEx = this.f49222h;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f49222h.getRequestIdNotice(), this.f49222h.getId(), this.mUnitid, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f49222h.getId()), this.f49222h.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f49222h.getId());
            this.f49229o = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        List<String> pv_urls;
        try {
            com.mbridge.msdk.foundation.controller.c.n().a(this);
            if (!TextUtils.isEmpty(this.f49222h.getImpressionURL())) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx = this.f49222h;
                com.mbridge.msdk.click.a.a(contextD, campaignEx, this.mUnitid, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f46603m);
            }
            if (!TextUtils.isEmpty(this.f49222h.getOnlyImpressionURL())) {
                Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx2 = this.f49222h;
                com.mbridge.msdk.click.a.a(contextD2, campaignEx2, this.mUnitid, campaignEx2.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f46604n);
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.mUnitid, this.f49222h, "interstitial");
            e eVar = new e();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(eVar);
            } else {
                eVar.run();
            }
            CampaignEx campaignEx3 = this.f49222h;
            if (campaignEx3 == null || (pv_urls = campaignEx3.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f49222h, this.mUnitid, it.next(), false, true);
            }
        } catch (Throwable th2) {
            q0.a("MBInterstitialActivity", th2.getMessage());
        }
    }

    private void n() {
        CampaignEx campaignEx;
        this.f49224j.setOnClickListener(new h());
        if (this.f49223i == null || (campaignEx = this.f49222h) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(campaignEx);
        aVar.a(this.f49222h.getAppName());
        this.f49223i.setCampaignId(this.f49222h.getId());
        this.f49223i.setDownloadListener(aVar);
    }

    public void clickTracking() {
        try {
            if (this.f49222h != null && !a1.a(this.mUnitid)) {
                onIntersClick();
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getApplicationContext(), this.mUnitid);
                this.f49234t = aVar;
                aVar.a(new c());
                this.f49234t.a(this.f49222h);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        finish();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (!this.f49229o) {
            l();
        }
        if (this.f49230p) {
            return;
        }
        reportPlayableClosed();
    }

    public com.mbridge.msdk.setting.l getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.mUnitid);
            return lVarE == null ? com.mbridge.msdk.setting.l.h(this.mUnitid) : lVarE;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f49222h;
    }

    public void goneWebView() {
        try {
            runOnUiThread(new n());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new b());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void initView() {
        this.f49223i = (WindVaneWebView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f49224j = (ImageView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int iA = i0.a(getApplicationContext(), "mbridge_interstitial_activity", "layout");
            try {
                if (!i0.a(iA)) {
                    g();
                    f();
                    a.d dVar = this.f49225k;
                    if (dVar != null) {
                        dVar.a("not found resource");
                    }
                    finish();
                    return;
                }
                setContentView(iA);
                initView();
                e();
                com.mbridge.msdk.foundation.controller.c.n().a(this);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new g());
                this.f49222h.setCampaignUnitId(this.mUnitid);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this.f49222h);
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        e.printStackTrace();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            a.d dVar = this.f49225k;
            if (dVar != null) {
                dVar.b();
            }
            com.mbridge.msdk.click.a aVar = this.f49234t;
            if (aVar != null) {
                aVar.a(false);
                this.f49234t.a((NativeListener.NativeTrackingListener) null);
                this.f49234t.c();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar2 = this.f49227m;
            if (dVar2 != null) {
                dVar2.d();
            }
            if (!this.f49229o) {
                l();
            }
            if (com.mbridge.msdk.interstitial.controller.a.f49189r != null && !TextUtils.isEmpty(this.mUnitid)) {
                com.mbridge.msdk.interstitial.controller.a.f49189r.remove(this.mUnitid);
            }
            this.f49225k = null;
            com.mbridge.msdk.foundation.feedback.b.b().d(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void onIntersClick() {
        try {
            a.d dVar = this.f49225k;
            if (dVar != null) {
                dVar.a();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f49222h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f49223i, "false");
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f49222h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f49223i, "true");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f49222h.setClickURL(str);
            a(str);
        }
        this.f49222h.setClickTempSource(2);
        this.f49222h.setClickType(2);
        this.f49222h.setTriggerClickSource(2);
        clickTracking();
    }

    public void reportPlayableClosed() {
        if (this.f49222h != null) {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f49222h.getId(), this.f49222h.getRequestId(), this.f49222h.getRequestIdNotice(), this.mUnitid, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
            nVar.b(this.f49222h.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.mUnitid);
            this.f49230p = true;
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        int iA = v0.a(this, 10.0f);
        if (i11 <= 0) {
            i11 = iA;
        }
        if (i12 <= 0) {
            i12 = iA;
        }
        if (i13 <= 0) {
            i13 = iA;
        }
        if (i14 <= 0) {
            i14 = iA;
        }
        if (this.f49224j != null) {
            int iA2 = v0.a(this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(11);
            layoutParams.setMargins(i11, i13, i12, i14);
            this.f49224j.setLayoutParams(layoutParams);
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void showWebView() {
        runOnUiThread(new m());
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        if (z10) {
            this.f49224j.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f49224j.setImageResource(i0.a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    private void e() {
        g();
        n();
        f();
        h();
    }

    private void f() {
        try {
            if (com.mbridge.msdk.interstitial.controller.a.f49189r == null || TextUtils.isEmpty(this.mUnitid) || !com.mbridge.msdk.interstitial.controller.a.f49189r.containsKey(this.mUnitid)) {
                return;
            }
            this.f49225k = com.mbridge.msdk.interstitial.controller.a.f49189r.get(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f49222h = (CampaignEx) intent.getSerializableExtra("campaign");
        }
        CampaignEx campaignEx = this.f49222h;
        if (campaignEx != null && campaignEx.isMraid()) {
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(this);
            this.f49227m = dVar;
            dVar.c();
            this.f49227m.a(new l());
        }
        CampaignEx campaignEx2 = this.f49222h;
        if (campaignEx2 != null) {
            com.mbridge.msdk.click.c.a(this, campaignEx2.getMaitve(), this.f49222h.getMaitve_src());
        }
    }

    @SuppressLint({"NewApi"})
    private void h() {
        try {
            CampaignEx campaignEx = this.f49222h;
            if (campaignEx == null || (TextUtils.isEmpty(campaignEx.getHtmlUrl()) && !this.f49222h.isMraid())) {
                a.d dVar = this.f49225k;
                if (dVar != null) {
                    dVar.a("htmlurl is null");
                    return;
                }
                return;
            }
            q0.c("MBInterstitialActivity", "url:" + this.f49222h.getHtmlUrl());
            goneWebView();
            this.f49223i.setWebViewListener(new i());
            String htmlUrl = this.f49222h.getHtmlUrl();
            if (this.f49222h.isMraid()) {
                File file = new File(this.f49222h.getMraid());
                if (file.exists() && file.isFile() && file.canRead()) {
                    htmlUrl = "file:////" + this.f49222h.getMraid();
                }
            }
            this.f49228n = System.currentTimeMillis();
            this.f49223i.loadUrl(htmlUrl);
            this.f49231q.postDelayed(this.f49232r, 15000L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.f49222h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = i10 != 0 ? i10 != 1 ? i10 != 2 ? "UNDEFINED" : "landscape" : "portrait" : "undefined";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        float fN = m0.n(this);
        float fM = m0.m(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.heightPixels;
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", "default");
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f49223i, fN, fM);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49223i, f10, f11);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49223i, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49223i, this.f49227m.a());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49223i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.f49222h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        this.f49223i.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.n(this.f49222h.getRequestId());
            nVar.o(this.f49222h.getRequestIdNotice());
            nVar.b(this.f49222h.getId());
            nVar.b(this.f49222h.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.d(nVar, getApplicationContext(), this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        CampaignEx campaignEx = this.f49222h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
        nVar.n(this.f49222h.getRequestId());
        nVar.o(this.f49222h.getRequestIdNotice());
        nVar.b(this.f49222h.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.f49228n));
        nVar.g("");
        nVar.m(str);
        nVar.a("5");
        nVar.b(this.f49222h.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.mUnitid, this.f49222h);
    }

    class g implements com.mbridge.msdk.foundation.feedback.a {
        g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            MBInterstitialActivity.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f49223i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f49223i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f49223i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    private void a(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getApplicationContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
        }
    }
}
