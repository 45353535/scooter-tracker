package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: loaded from: classes10.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected j f49792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f49793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f49794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f49795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f49796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f49797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f49798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f49799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f49800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignEx f49801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f49802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f49803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f49804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f49805q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f49803o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f49803o = false;
        this.f49804p = 0.0f;
        this.f49805q = 0.0f;
    }

    public void clearWebView() {
        if (this.f49803o) {
            return;
        }
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public CampaignEx getCampaignEx() {
        return this.f49801m;
    }

    public String getCampaignId() {
        return this.f49797i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f49794f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f49800l;
    }

    public Object getMraidObject() {
        return this.f49796h;
    }

    public Object getObject() {
        return this.f49795g;
    }

    public String getRid() {
        return this.f49799k;
    }

    public b getSignalCommunication() {
        return this.f49793e;
    }

    public c getWebViewListener() {
        return this.f49798j;
    }

    public boolean isDestoryed() {
        return this.f49803o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f49804p = motionEvent.getRawX();
                    this.f49805q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f49804p;
                    float y10 = motionEvent.getY() - this.f49805q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y10 >= 0.0f || (-1.0f) * y10 <= 48) && (y10 <= 0.0f || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f49794f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f49803o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", Integer.valueOf(this.f49802n));
                if (this.f49801m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f49801m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f49795g = null;
            if (v0.b(getContext()) == 0) {
                this.f49803o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), r0 * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f49794f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f49794f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f49801m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f49797i = str;
    }

    public void setLocalRequestId(String str) {
        this.f49800l = str;
    }

    public void setMraidObject(Object obj) {
        this.f49796h = obj;
    }

    public void setObject(Object obj) {
        this.f49795g = obj;
    }

    public void setRid(String str) {
        this.f49799k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f49793e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f49802n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f49792d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f49798j = cVar;
        j jVar = this.f49792d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    protected void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f49792d == null) {
            this.f49792d = new j(this);
        }
        setWebViewChromeClient(this.f49792d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f49793e == null) {
            b hVar = new h(this.f49692a);
            this.f49793e = hVar;
            setSignalCommunication(hVar);
        }
        this.f49794f = new e(this.f49692a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49803o = false;
        this.f49804p = 0.0f;
        this.f49805q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f49803o = false;
        this.f49804p = 0.0f;
        this.f49805q = 0.0f;
    }
}
