package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.listener.b;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.videocommon.download.d;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    private String P;

    class a extends b {
        a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            String str;
            super.a(webView, i10);
            q0.b("MBridgeAlertWebview", "readyState  :  " + i10);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            if (mBridgeAlertWebview.f52582u) {
                return;
            }
            boolean z10 = i10 == 1;
            mBridgeAlertWebview.f52581t = z10;
            if (z10) {
                str = "readyState state is " + i10;
            } else {
                str = "";
            }
            String str2 = str;
            MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview2.f52526a, mBridgeAlertWebview2.f52527b, mBridgeAlertWebview2.P, MBridgeAlertWebview.this.unitId, i10, str2, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("MBridgeAlertWebview", "finish+" + str);
            f.a().a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("MBridgeAlertWebview", "onReceivedError");
            if (MBridgeAlertWebview.this.f52582u) {
                return;
            }
            q0.a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview.f52526a, mBridgeAlertWebview.f52527b, mBridgeAlertWebview.P, MBridgeAlertWebview.this.unitId, 2, str, 1);
            MBridgeAlertWebview.this.f52582u = true;
        }
    }

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected String getURL() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        String strC = com.mbridge.msdk.videocommon.setting.b.b().a(c.n().b(), this.unitId, false).c();
        this.P = strC;
        return !TextUtils.isEmpty(strC) ? d.a().a(this.P) : "";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f52530e || this.f52527b == null || TextUtils.isEmpty(url)) {
            this.notifyListener.a(101, "");
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f52527b);
        aVar.a(this.f52527b.getAppName());
        this.f52577p.setDownloadListener(aVar);
        this.f52577p.setCampaignId(this.f52527b.getId());
        setCloseVisible(8);
        this.f52577p.setApiManagerJSFactory(bVar);
        this.f52577p.setWebViewListener(new a());
        setHtmlSource(com.mbridge.msdk.videocommon.download.f.a().a(url));
        this.f52581t = false;
        if (TextUtils.isEmpty(this.f52580s)) {
            q0.a(MBridgeBaseView.TAG, "load url:" + url);
            this.f52577p.loadUrl(url);
        } else {
            q0.a(MBridgeBaseView.TAG, "load html...");
            this.f52577p.loadDataWithBaseURL(url, this.f52580s, "text/html", "UTF-8", null);
        }
        this.f52577p.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f52575n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        j.a(this.f52526a, this.f52527b, this.P, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
