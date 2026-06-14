package com.mbridge.msdk.splash.signal;

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
public class SplashExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f50870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f50871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f50872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f50873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f50874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.a f50875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f50876j;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
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
            SplashExpandDialog.this.c();
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
            SplashExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            SplashExpandDialog.this.a();
        }
    }

    class d implements DialogInterface.OnDismissListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.f50875i != null) {
                SplashExpandDialog.this.f50875i.a(false);
                SplashExpandDialog.this.f50875i.close();
            }
            SplashExpandDialog.this.f50871e.loadDataWithBaseURL(null, "", "text/html", D5.N, null);
            SplashExpandDialog.this.f50870d.removeView(SplashExpandDialog.this.f50871e);
            SplashExpandDialog.this.f50871e.release();
            SplashExpandDialog.this.f50871e = null;
            SplashExpandDialog.this.f50875i = null;
        }
    }

    class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            SplashExpandDialog.this.dismiss();
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
                if (SplashExpandDialog.this.f50871e == null || System.currentTimeMillis() - SplashExpandDialog.this.f50871e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f46632d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) SplashExpandDialog.this.f50874h.get(0), SplashExpandDialog.this.f50871e.getUrl(), com.mbridge.msdk.click.utils.a.f46629a)) {
                    q0.b("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f50874h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f50875i != null) {
                        SplashExpandDialog.this.f50875i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("SplashExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                SplashExpandDialog.this.f50872f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("SplashExpandDialog", "useCustomClose", th2);
            }
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.splash.middle.a aVar) {
        super(context);
        this.f50867a = "SplashExpandDialog";
        this.f50876j = new e();
        if (bundle != null) {
            this.f50868b = bundle.getString("url");
            this.f50869c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f50875i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
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
        this.f50873g = str;
        this.f50874h = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f50870d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f50871e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f50870d.addView(this.f50871e);
        TextView textView = new TextView(getContext());
        this.f50872f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f50872f.setLayoutParams(layoutParams);
        this.f50872f.setVisibility(this.f50869c ? 4 : 0);
        this.f50872f.setOnClickListener(new a());
        this.f50870d.addView(this.f50872f);
        setContentView(this.f50870d);
        a();
        this.f50871e.setWebViewListener(new b());
        this.f50871e.setObject(this.f50876j);
        this.f50871e.loadUrl(this.f50868b);
        List<CampaignEx> list = this.f50874h;
        if (list != null && !list.isEmpty()) {
            CampaignEx campaignEx = this.f50874h.get(0);
            if (campaignEx != null) {
                b1.a(this.f50871e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f50870d.addView(mBAdChoice, layoutParams2);
            }
        }
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f50873g, 297);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f50870d.getResources().getDisplayMetrics());
            this.f50870d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
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
            this.f50871e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f50871e, r0[0], r0[1], r11.getWidth(), this.f50871e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f50871e, r0[0], r0[1], r5.getWidth(), this.f50871e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f50871e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f50871e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f50871e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f50871e);
        } catch (Throwable th2) {
            q0.b("SplashExpandDialog", "notifyMraid", th2);
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
