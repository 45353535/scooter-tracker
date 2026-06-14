package com.taurusx.tax.t.y;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C4240b4;
import com.taurusx.tax.R;
import com.taurusx.tax.t.z;
import com.taurusx.tax.w.s.s;
import java.net.URLEncoder;
import org.json.JSONObject;
import z5.a;

/* JADX INFO: loaded from: classes11.dex */
public class z extends com.taurusx.tax.t.y.w {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66588t = "AdTuneAlert";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f66589a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f66590c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f66591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FrameLayout f66592o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f66593s;

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z.this.z();
        }
    }

    public class y implements z.InterfaceC0815z {
        public y() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ WebResourceResponse z(WebView webView, String str) {
            return a.b(this, webView, str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ void w(WebView webView, String str) {
            a.a(this, webView, str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            a.c(this, zVar, aVar);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public boolean z(String str) {
            Log.d(z.f66588t, "onJump: url = " + str);
            if (TextUtils.equals(str, "taurusx://adoClosed")) {
                z.this.z();
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (!str.startsWith("http://") && !str.startsWith(DtbConstants.HTTPS)) {
                return false;
            }
            try {
                Activity activityY = z.this.y();
                if (activityY == null) {
                    return false;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                activityY.startActivity(intent);
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.t.y.z$z, reason: collision with other inner class name */
    public class ViewOnClickListenerC0814z implements View.OnClickListener {
        public ViewOnClickListenerC0814z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z.this.z();
        }
    }

    public z(@NonNull Activity activity) {
        super(activity);
    }

    @Override // com.taurusx.tax.t.y.w, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s sVar = this.f66589a;
        if (sVar != null) {
            sVar.o();
        }
    }

    @Override // com.taurusx.tax.t.y.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z(getContext());
        this.f66590c.setOnClickListener(new ViewOnClickListenerC0814z());
        this.f66593s.setOnClickListener(new w());
    }

    @Override // com.taurusx.tax.t.y.w, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s sVar = this.f66589a;
        if (sVar != null) {
            sVar.y();
        }
    }

    public z z(s sVar) {
        this.f66589a = sVar;
        return this;
    }

    public z z(String str) {
        this.f66591n = str;
        return this;
    }

    @Override // com.taurusx.tax.t.y.w
    public View z(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.taurusx_dialog_adtune_layout, (ViewGroup) null);
        this.f66590c = viewInflate;
        this.f66592o = (FrameLayout) viewInflate.findViewById(R.id.adtune_webview_container);
        this.f66593s = this.f66590c.findViewById(R.id.adtune_close_btn);
        return this.f66590c;
    }

    private void z(Context context) {
        String strEncode;
        JSONObject jSONObjectZ;
        com.taurusx.tax.t.w wVar = new com.taurusx.tax.t.w(context);
        this.f66592o.addView(wVar, new FrameLayout.LayoutParams(-1, -1));
        wVar.setWebViewListener(new y());
        if (TextUtils.isEmpty(this.f66591n)) {
            return;
        }
        try {
            jSONObjectZ = com.taurusx.tax.w.z.t().a().z(y());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (jSONObjectZ != null) {
            strEncode = URLEncoder.encode(jSONObjectZ.toString(), "UTF-8");
        } else {
            strEncode = "";
        }
        if (!TextUtils.isEmpty(strEncode)) {
            this.f66591n += (this.f66591n.contains("?") ? C4240b4.j.f42670c : "?");
            this.f66591n += "device_info=";
            this.f66591n += strEncode;
        }
        wVar.loadUrl(this.f66591n);
    }
}
