package com.taurusx.tax.utils.webview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.VisibleForTesting;
import com.taurusx.tax.R;
import com.taurusx.tax.g.s;

/* JADX INFO: loaded from: classes11.dex */
public class TaxBrowserActivity extends Activity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66922g = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66923n = "URL";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66924t = "tax-creative-id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66925a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageButton f66926c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageButton f66927o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f66928s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageButton f66929w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageButton f66930y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public WebView f66931z;

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TaxBrowserActivity.this.f66931z.reload();
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TaxBrowserActivity.this.finish();
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TaxBrowserActivity.this.f66931z.canGoBack()) {
                TaxBrowserActivity.this.f66931z.goBack();
            }
        }
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TaxBrowserActivity.this.f66931z.canGoForward()) {
                TaxBrowserActivity.this.f66931z.goForward();
            }
        }
    }

    public class z extends WebChromeClient {
        public z() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            TaxBrowserActivity.this.setTitle("Loading...");
            TaxBrowserActivity.this.setProgress(i10 * 100);
            if (i10 == 100) {
                TaxBrowserActivity.this.setTitle(webView.getUrl());
            }
        }
    }

    private void a() {
        this.f66928s = new s();
        t();
        z();
    }

    private void n() {
        this.f66929w.setBackgroundColor(0);
        this.f66929w.setOnClickListener(new w());
        this.f66930y.setBackgroundColor(0);
        this.f66930y.setOnClickListener(new y());
        this.f66926c.setBackgroundColor(0);
        this.f66926c.setOnClickListener(new c());
        this.f66927o.setBackgroundColor(0);
        this.f66927o.setOnClickListener(new o());
    }

    private void t() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.web_layout);
        try {
            WebView webView = new WebView(this);
            this.f66931z = webView;
            frameLayout.addView(webView);
            WebSettings settings = this.f66931z.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSavePassword(false);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowFileAccess(false);
            settings.setSavePassword(false);
            this.f66925a = getIntent().getStringExtra(f66924t);
            this.f66931z.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f66931z.removeJavascriptInterface("accessibility");
            this.f66931z.removeJavascriptInterface("accessibilityTraversal");
            this.f66931z.loadUrl(getIntent().getStringExtra(f66923n));
            this.f66931z.setWebChromeClient(new z());
        } catch (Throwable unused) {
            finish();
        }
    }

    public ImageButton c() {
        return this.f66930y;
    }

    @Override // android.app.Activity
    public void finish() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    public ImageButton o() {
        return this.f66926c;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(-1);
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        setContentView(R.layout.taurusx_activity_web_view);
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f66931z.destroy();
        this.f66931z = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        com.taurusx.tax.g.s0.w.z(this.f66931z, isFinishing());
        this.f66928s.y();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        com.taurusx.tax.g.s0.w.w(this.f66931z);
        this.f66928s.c();
    }

    public WebView s() {
        return this.f66931z;
    }

    public ImageButton w() {
        return this.f66929w;
    }

    public ImageButton y() {
        return this.f66927o;
    }

    private void z() {
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    @VisibleForTesting
    @Deprecated
    public void z(WebView webView) {
        this.f66931z = webView;
    }
}
