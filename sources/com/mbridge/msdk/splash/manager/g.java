package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50799b;

    class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f50800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f50801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f50803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f50804e;

        a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j10) {
            this.f50800a = cVar;
            this.f50801b = mBSplashView;
            this.f50802c = campaignEx;
            this.f50803d = str;
            this.f50804e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            c cVar = this.f50800a;
            if (cVar != null) {
                cVar.a(i10);
            }
            if (i10 == 1) {
                g.this.f50798a = true;
                this.f50801b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50802c, this.f50803d, "", this.f50804e, 1);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f50803d, this.f50802c);
                return;
            }
            g.this.f50798a = false;
            this.f50801b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "readyState 2", this.f50803d, this.f50802c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50802c, this.f50803d, "readyState 2", this.f50804e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.f50800a;
            if (cVar != null) {
                cVar.a();
            }
            g.this.f50799b = true;
            if (!this.f50802c.isHasMBTplMark()) {
                this.f50801b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f50803d, this.f50802c);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50802c, this.f50803d, "", this.f50804e, 1);
            }
            com.mbridge.msdk.splash.signal.c.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            c cVar = this.f50800a;
            if (cVar != null) {
                cVar.onError(str);
            }
            g.this.b();
            this.f50801b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error code:" + i10 + str, this.f50803d, this.f50802c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50802c, this.f50803d, "error code:" + i10 + str, this.f50804e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.f50800a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            g.this.b();
            this.f50801b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error url:" + sslError.getUrl(), this.f50803d, this.f50802c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50802c, this.f50803d, "error url:" + sslError.getUrl(), this.f50804e, 3);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f50806a = new g(null);
    }

    public interface c {
        void a();

        void a(int i10);

        void onError(String str);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f50809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f50811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f50812f;

        public void a(String str) {
            this.f50810d = str;
        }

        public void b(String str) {
            this.f50807a = str;
        }

        public String c() {
            return this.f50810d;
        }

        public String d() {
            return this.f50807a;
        }

        public String e() {
            return this.f50808b;
        }

        public boolean f() {
            return this.f50811e;
        }

        public CampaignEx a() {
            return this.f50809c;
        }

        public int b() {
            return this.f50812f;
        }

        public void c(String str) {
            this.f50808b = str;
        }

        public void a(CampaignEx campaignEx) {
            this.f50809c = campaignEx;
        }

        public void a(boolean z10) {
            this.f50811e = z10;
        }

        public void a(int i10) {
            this.f50812f = i10;
        }
    }

    /* synthetic */ g(a aVar) {
        this();
    }

    private g() {
        this.f50798a = false;
        this.f50799b = false;
    }

    public static g a() {
        return b.f50806a;
    }

    public void b() {
        this.f50798a = false;
        this.f50799b = false;
    }

    public void a(MBSplashView mBSplashView, d dVar, c cVar) {
        String requestId;
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String strE = dVar.e();
        String strD = dVar.d();
        CampaignEx campaignExA = dVar.a();
        String strC = dVar.c();
        boolean zF = dVar.f();
        int iB = dVar.b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.b bVar = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), strD, strE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExA);
        bVar.a(arrayList);
        bVar.a(zF ? 1 : 0);
        bVar.b(iB);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        if (TextUtils.isEmpty(campaignExA.getRequestId())) {
            requestId = campaignExA.getRequestIdNotice();
        } else {
            requestId = campaignExA.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        q0.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f50798a || this.f50799b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.report.a.b(strE, campaignExA);
        long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, campaignExA, strE, jCurrentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(strC);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignExA, strE, "webview had destory", jCurrentTimeMillis, 3);
        }
    }
}
