package com.mbridge.msdk.advanced.signal;

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
public class NativeAdvancedExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f46401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f46402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f46403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f46405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f46406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f46407j;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeAdvancedExpandDialog.this.dismiss();
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
            NativeAdvancedExpandDialog.this.c();
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
            NativeAdvancedExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            NativeAdvancedExpandDialog.this.a();
        }
    }

    class d implements DialogInterface.OnDismissListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NativeAdvancedExpandDialog.this.f46406i != null) {
                NativeAdvancedExpandDialog.this.f46406i.a(false);
            }
            NativeAdvancedExpandDialog.this.f46402e.loadDataWithBaseURL(null, "", "text/html", D5.N, null);
            NativeAdvancedExpandDialog.this.f46401d.removeView(NativeAdvancedExpandDialog.this.f46402e);
            NativeAdvancedExpandDialog.this.f46402e.release();
            NativeAdvancedExpandDialog.this.f46402e = null;
            NativeAdvancedExpandDialog.this.f46406i = null;
        }
    }

    class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            NativeAdvancedExpandDialog.this.dismiss();
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
                if (NativeAdvancedExpandDialog.this.f46402e == null || System.currentTimeMillis() - NativeAdvancedExpandDialog.this.f46402e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f46632d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) NativeAdvancedExpandDialog.this.f46405h.get(0), NativeAdvancedExpandDialog.this.f46402e.getUrl(), com.mbridge.msdk.click.utils.a.f46629a)) {
                    q0.b("NativeAdvancedExpandDialog", str);
                    if (NativeAdvancedExpandDialog.this.f46405h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (NativeAdvancedExpandDialog.this.f46406i != null) {
                        NativeAdvancedExpandDialog.this.f46406i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("NativeAdvancedExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                NativeAdvancedExpandDialog.this.f46403f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("NativeAdvancedExpandDialog", "useCustomClose", th2);
            }
        }
    }

    public NativeAdvancedExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.advanced.middle.a aVar) {
        super(context);
        this.f46398a = "NativeAdvancedExpandDialog";
        this.f46407j = new e();
        if (bundle != null) {
            this.f46399b = bundle.getString("url");
            this.f46400c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f46406i = aVar;
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
        this.f46404g = str;
        this.f46405h = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f46401d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f46402e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f46401d.addView(this.f46402e);
        TextView textView = new TextView(getContext());
        this.f46403f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f46403f.setLayoutParams(layoutParams);
        this.f46403f.setVisibility(this.f46400c ? 4 : 0);
        this.f46403f.setOnClickListener(new a());
        this.f46401d.addView(this.f46403f);
        setContentView(this.f46401d);
        a();
        this.f46402e.setWebViewListener(new b());
        this.f46402e.setObject(this.f46407j);
        this.f46402e.loadUrl(this.f46399b);
        List<CampaignEx> list = this.f46405h;
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = this.f46405h.get(0);
            if (campaignEx != null) {
                b1.a(this.f46402e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f46401d.addView(mBAdChoice, layoutParams2);
            }
        }
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f46404g, 296);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f46401d.getResources().getDisplayMetrics());
            this.f46401d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
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
            map.put("placementType", "inline");
            map.put("state", "expanded");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            this.f46402e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f46402e, r0[0], r0[1], r11.getWidth(), this.f46402e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f46402e, r0[0], r0[1], r5.getWidth(), this.f46402e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f46402e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f46402e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f46402e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f46402e);
        } catch (Throwable th2) {
            q0.b("NativeAdvancedExpandDialog", "notifyMraid", th2);
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
