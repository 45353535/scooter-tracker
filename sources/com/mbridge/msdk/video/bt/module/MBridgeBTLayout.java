package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.bt.component.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeBTLayout extends BTBaseView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private WebView f52187p;

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f52187p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f52110n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put(C4240b4.i.f42633j0, str);
                jSONObject2.put("data", jSONObject);
                f.a().a(this.f52187p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a(this.f52187p, "broadcast", getInstanceId());
            }
        }
    }

    public WebView getBtWebView() {
        return this.f52187p;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
    }

    public void notifyEvent(String str) {
        WebView webView = this.f52187p;
        if (webView != null) {
            BTBaseView.a(webView, str, this.f52115d);
        }
    }

    public void onBackPressed() {
        if (this.f52187p != null) {
            d.c().a(this.f52187p, "onSystemBackPressed", this.f52115d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f52187p != null) {
            try {
                CampaignEx campaignEx = this.f52113b;
                if (campaignEx == null || !campaignEx.isDynamicView()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", "landscape");
                    } else {
                        jSONObject.put("orientation", "portrait");
                    }
                    jSONObject.put("instanceId", this.f52115d);
                    f.a().a(this.f52187p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    public void setWebView(WebView webView) {
        this.f52187p = webView;
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
