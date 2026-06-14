package com.mbridge.msdk.mbbanner.common.communication;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.D5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BannerExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f49286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f49287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f49288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f49290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.a f49291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f49292j;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BannerExpandDialog.this.dismiss();
        }
    }

    class b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        class a implements ValueCallback<String> {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new a());
            BannerExpandDialog.this.c();
        }
    }

    class c implements com.mbridge.msdk.foundation.feedback.a {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BannerExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BannerExpandDialog.this.a();
        }
    }

    class d implements DialogInterface.OnDismissListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (BannerExpandDialog.this.f49291i != null) {
                BannerExpandDialog.this.f49291i.a(false);
            }
            BannerExpandDialog.this.f49287e.loadDataWithBaseURL(null, "", "text/html", D5.N, null);
            BannerExpandDialog.this.f49286d.removeView(BannerExpandDialog.this.f49287e);
            BannerExpandDialog.this.f49287e.release();
            BannerExpandDialog.this.f49287e = null;
            BannerExpandDialog.this.f49291i = null;
        }
    }

    class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            BannerExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void expand(String str, boolean z10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (BannerExpandDialog.this.f49287e == null || System.currentTimeMillis() - BannerExpandDialog.this.f49287e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f46632d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) BannerExpandDialog.this.f49290h.get(0), BannerExpandDialog.this.f49287e.getUrl(), com.mbridge.msdk.click.utils.a.f46629a)) {
                    q0.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f49290h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f49291i != null) {
                        BannerExpandDialog.this.f49291i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                BannerExpandDialog.this.f49288f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "useCustomClose", th2);
            }
        }
    }

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        super(context);
        this.f49283a = "BannerExpandDialog";
        this.f49292j = new e();
        if (bundle != null) {
            this.f49284b = bundle.getString("url");
            this.f49285c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f49291i = aVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        b();
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f49289g = str;
        this.f49290h = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f49286d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f49287e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f49286d.addView(this.f49287e);
        TextView textView = new TextView(getContext());
        this.f49288f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f49288f.setLayoutParams(layoutParams);
        this.f49288f.setVisibility(this.f49285c ? 4 : 0);
        this.f49288f.setOnClickListener(new a());
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f49289g, 296);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f49286d.getResources().getDisplayMetrics());
            this.f49286d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f49286d.addView(this.f49288f);
        setContentView(this.f49286d);
        a();
        this.f49287e.setWebViewListener(new b());
        this.f49287e.setObject(this.f49292j);
        this.f49287e.loadUrl(this.f49284b);
        List<CampaignEx> list = this.f49290h;
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = this.f49290h.get(0);
            if (campaignEx != null) {
                b1.a(this.f49287e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f49286d.addView(mBAdChoice, layoutParams2);
            }
        }
        setOnDismissListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            int i10 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? "landscape" : i10 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "expanded");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            this.f49287e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f49287e, r0[0], r0[1], r11.getWidth(), this.f49287e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49287e, r0[0], r0[1], r5.getWidth(), this.f49287e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f49287e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49287e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49287e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f49287e);
        } catch (Throwable th2) {
            q0.b("BannerExpandDialog", "notifyMraid", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }
}
