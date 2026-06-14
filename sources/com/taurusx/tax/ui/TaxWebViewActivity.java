package com.taurusx.tax.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.taurusx.tax.R;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.n0.c;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.s;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class TaxWebViewActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66910a = "ad_response_cache_key";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66911n = "ad_pid_key";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66912o = "TaxWebViewActivity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66913s = "url";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebView f66914c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f66917z = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f66915w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f66916y = null;

    public class z extends WebViewClient {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f66919z = 0;

        public z() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            int i10 = this.f66919z - 1;
            this.f66919z = i10;
            if (i10 != 0 || TaxWebViewActivity.this.f66917z) {
                return;
            }
            TaxWebViewActivity.this.f66917z = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f66919z = Math.max(this.f66919z, 1);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            LogUtil.d(TaxWebViewActivity.f66912o, "shouldOverrideUrlLoading: " + str);
            this.f66919z = this.f66919z + 1;
            if (!f0.z(webView.getContext(), webView, str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (TaxWebViewActivity.this.f66916y != null) {
                TaxWebViewActivity.this.f66916y.z(str, TaxWebViewActivity.this.f66915w);
            }
            return true;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.f66914c;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.f66914c.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        requestWindowFeature(1);
        window.setFlags(1024, 1024);
        setContentView(R.layout.taurusx_activity_web_view);
        if (!TaurusXAds.isInitialized()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        String stringExtra = "";
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("url");
                y yVarZ = z(intent);
                String stringExtra2 = intent.getStringExtra(f66911n);
                if (yVarZ != null && !TextUtils.isEmpty(stringExtra2)) {
                    this.f66916y = s.z(yVarZ);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.web_layout);
        try {
            WebView webView = new WebView(this);
            this.f66914c = webView;
            frameLayout.addView(webView);
            z(this.f66914c);
            w(this.f66914c);
            this.f66914c.setOnTouchListener(new View.OnTouchListener() { // from class: a6.c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f4136b.z(view, motionEvent);
                }
            });
            this.f66914c.setWebViewClient(new z());
            this.f66914c.loadUrl(stringExtra);
        } catch (Throwable unused) {
            finish();
        }
    }

    private void w(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT < 33) {
            settings.setAppCacheEnabled(true);
            settings.setAppCacheMaxSize(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            settings.setAppCachePath(getCacheDir().getAbsolutePath());
        }
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setAllowFileAccessFromFileURLs(false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean z(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.f66915w = true;
        return false;
    }

    private y z(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            String stringExtra = intent.getStringExtra(f66910a);
            if (TextUtils.isEmpty(stringExtra)) {
                return null;
            }
            Object objZ = c.z().z(stringExtra);
            c.z().w(stringExtra);
            if (objZ instanceof y) {
                return (y) objZ;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void z(WebView webView) {
        webView.setHorizontalScrollBarEnabled(false);
        webView.setHorizontalScrollbarOverlay(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setVerticalScrollbarOverlay(false);
        webView.requestFocus();
    }
}
