package com.taurusx.tax.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.log.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class MraidBrowser extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66374a = "extra_url";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f66375n = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66376s = "MraidBrowser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageButton f66377c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageButton f66378o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageButton f66379w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageButton f66380y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public WebView f66381z;

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MraidBrowser.this.f66381z.canGoForward()) {
                MraidBrowser.this.f66381z.goForward();
            }
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MraidBrowser.this.f66381z.reload();
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MraidBrowser.this.finish();
        }
    }

    public class w extends WebChromeClient {
        public w() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            Activity activity = (Activity) webView.getContext();
            activity.setTitle("Loading...");
            activity.setProgress(i10 * 100);
            if (i10 == 100) {
                activity.setTitle(webView.getUrl());
            }
        }
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MraidBrowser.this.f66381z.canGoBack()) {
                MraidBrowser.this.f66381z.goBack();
            }
        }
    }

    public class z extends WebViewClient {
        public z() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MraidBrowser.this.f66379w.setImageDrawable(webView.canGoBack() ? com.taurusx.tax.o.s.LEFT_ARROW.decodeImage(MraidBrowser.this) : com.taurusx.tax.o.s.UNLEFT_ARROW.decodeImage(MraidBrowser.this));
            MraidBrowser.this.f66380y.setImageDrawable(webView.canGoForward() ? com.taurusx.tax.o.s.RIGHT_ARROW.decodeImage(MraidBrowser.this) : com.taurusx.tax.o.s.UNRIGHT_ARROW.decodeImage(MraidBrowser.this));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            MraidBrowser.this.f66380y.setImageDrawable(com.taurusx.tax.o.s.UNRIGHT_ARROW.decodeImage(MraidBrowser.this));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            Toast.makeText((Activity) webView.getContext(), "MRAID error: " + str, 0).show();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null) {
                return false;
            }
            String host = Uri.parse(str).getHost();
            if ((str.startsWith("http:") || str.startsWith("https:")) && !f0.f66126w.equals(host) && !f0.f66128z.equals(host)) {
                return false;
            }
            try {
                MraidBrowser.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException unused) {
                LogUtil.w(MraidBrowser.f66376s, "Unable to start activity for " + str + ". Ensure that your phone can handle this intent.");
            }
            MraidBrowser.this.finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        setContentView(w());
        z(getIntent());
        y();
        z();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
    }

    private View w() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(relativeLayout);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setBackgroundDrawable(com.taurusx.tax.o.s.BACKGROUND.decodeImage(this));
        relativeLayout.addView(linearLayout2);
        this.f66379w = z(com.taurusx.tax.o.s.LEFT_ARROW.decodeImage(this));
        this.f66380y = z(com.taurusx.tax.o.s.RIGHT_ARROW.decodeImage(this));
        this.f66377c = z(com.taurusx.tax.o.s.REFRESH.decodeImage(this));
        this.f66378o = z(com.taurusx.tax.o.s.CLOSE.decodeImage(this));
        linearLayout2.addView(this.f66379w);
        linearLayout2.addView(this.f66380y);
        linearLayout2.addView(this.f66377c);
        linearLayout2.addView(this.f66378o);
        this.f66381z = new WebView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f66381z.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f66381z);
        return linearLayout;
    }

    private void y() {
        this.f66379w.setBackgroundColor(0);
        this.f66379w.setOnClickListener(new y());
        this.f66380y.setBackgroundColor(0);
        this.f66380y.setOnClickListener(new c());
        this.f66377c.setBackgroundColor(0);
        this.f66377c.setOnClickListener(new o());
        this.f66378o.setBackgroundColor(0);
        this.f66378o.setOnClickListener(new s());
    }

    private void z(Intent intent) {
        WebSettings settings = this.f66381z.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        this.f66381z.loadUrl(intent.getStringExtra(f66374a));
        this.f66381z.setWebViewClient(new z());
        this.f66381z.setWebChromeClient(new w());
    }

    private void z() {
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    private ImageButton z(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
