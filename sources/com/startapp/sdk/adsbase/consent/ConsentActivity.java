package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.vi;
import java.net.URI;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ConsentActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f64028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f64030c;

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f64028a;
        if (webView == null) {
            this.f64030c = true;
            super.onBackPressed();
            return;
        }
        String url = webView.getUrl();
        String str = this.f64029b;
        if (str != null && url != null && url.contains(str)) {
            this.f64028a.loadUrl("javascript:startappBackPressed();");
        } else if (this.f64028a.canGoBack()) {
            this.f64028a.goBack();
        } else {
            this.f64030c = true;
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setFitsSystemWindows(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        String dataString = getIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            try {
                URI uri = new URI(dataString);
                this.f64029b = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null).toString();
                WebView webViewC = ((tk) com.startapp.sdk.components.a.a(this).f64175b.a()).c();
                this.f64028a = webViewC;
                webViewC.setWebViewClient(new a(this));
                this.f64028a.getSettings().setJavaScriptEnabled(true);
                this.f64028a.setHorizontalScrollBarEnabled(false);
                this.f64028a.setVerticalScrollBarEnabled(false);
                this.f64028a.getSettings().setTextZoom(100);
                this.f64028a.loadUrl(dataString);
                this.f64028a.setBackgroundColor(0);
                this.f64028a.setLayerType(1, null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                relativeLayout.addView(this.f64028a, layoutParams2);
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        setContentView(relativeLayout, layoutParams);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        super.onStop();
        ConsentConfig consentConfigR = MetaData.E().r();
        if (!this.f64030c && consentConfigR != null && consentConfigR.k()) {
            WeakHashMap weakHashMap = vi.f65408a;
            if (((g6) com.startapp.sdk.components.a.a(this).f64193t.a()).b() && vi.c(this)) {
                g9 g9Var = new g9(h9.f64609d);
                g9Var.f64553d = "ConsentActivityHasBeenCovered";
                g9Var.a();
                finish();
                try {
                    startActivity(getIntent());
                } catch (Throwable th2) {
                    g9.a(th2);
                }
            }
        }
        h6 h6Var = (h6) com.startapp.sdk.components.a.a(this).f64183j.a();
        h6Var.f64604e = false;
        if (h6.a(4)) {
            g9 g9Var2 = new g9(h9.f64609d);
            g9Var2.f64553d = "CNS.closed";
            g9Var2.f64554e = String.valueOf(System.currentTimeMillis());
            g9Var2.a();
        }
        Intent intent = h6Var.f64603d;
        if (intent != null) {
            try {
                h6Var.f64600a.startActivity(intent);
            } catch (Throwable th3) {
                if (h6.a(8)) {
                    g9.a(th3);
                }
            }
        }
    }
}
