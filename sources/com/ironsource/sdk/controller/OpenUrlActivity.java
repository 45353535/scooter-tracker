package com.ironsource.sdk.controller;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.Be;
import com.ironsource.C4240b4;
import com.ironsource.C4280da;
import com.ironsource.C4462o4;
import com.ironsource.InterfaceC4337h;
import com.ironsource.O3;
import com.ironsource.P9;
import com.ironsource.Wf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class OpenUrlActivity extends Activity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44956j = "OpenUrlActivity";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44957k = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f44958l = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f44960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressBar f44961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f44962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RelativeLayout f44963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f44964f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f44959a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f44965g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44966h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f44967i = new b();

    class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.f44965g.removeCallbacks(openUrlActivity.f44967i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.f44965g.postDelayed(openUrlActivity2.f44967i, 500L);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f44966h));
        }
    }

    private class c extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f44961c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f44961c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            v vVar;
            super.onReceivedError(webView, i10, str, str2);
            try {
                O3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.f44960b) != null) {
                        vVar.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(OpenUrlActivity.f44956j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new Be(str, C4280da.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                Wf.a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f44960b.z();
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                StringBuilder sb2 = new StringBuilder();
                if (e10 instanceof ActivityNotFoundException) {
                    sb2.append(C4240b4.c.f42545x);
                } else {
                    sb2.append(C4240b4.c.f42546y);
                }
                v vVar = OpenUrlActivity.this.f44960b;
                if (vVar != null) {
                    vVar.d(sb2.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        private c() {
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f44971a = "is_store";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String f44972b = "external_url";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String f44973c = "secondary_web_view";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f44974d = "immersive";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final String f44975e = "no activity to handle url";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final String f44976f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC4337h f44977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f44979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f44980d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f44981e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f44982f = false;

        public e(InterfaceC4337h interfaceC4337h) {
            this.f44977a = interfaceC4337h;
        }

        @NotNull
        e a(int i10) {
            this.f44978b = i10;
            return this;
        }

        @NotNull
        public e b(boolean z10) {
            this.f44980d = z10;
            return this;
        }

        @NotNull
        public e c(boolean z10) {
            this.f44981e = z10;
            return this;
        }

        @NotNull
        public e a(String str) {
            this.f44979c = str;
            return this;
        }

        @NotNull
        e a(boolean z10) {
            this.f44982f = z10;
            return this;
        }

        public Intent a(Context context) {
            Intent intentA = this.f44977a.a(context);
            intentA.putExtra("external_url", this.f44979c);
            intentA.putExtra("secondary_web_view", this.f44980d);
            intentA.putExtra("is_store", this.f44981e);
            intentA.putExtra(C4240b4.i.f42656v, this.f44982f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.f44978b);
            }
            return intentA;
        }
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f44960b;
        if (vVar != null) {
            vVar.b(false, C4240b4.i.Y);
            if (this.f44963e == null || (viewGroup = (ViewGroup) this.f44959a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f44957k) != null) {
                viewGroup.removeView(this.f44959a);
            }
            if (viewGroup.findViewById(f44958l) != null) {
                viewGroup.removeView(this.f44961c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.f44962d && (vVar = this.f44960b) != null) {
            vVar.c(C4240b4.i.f42632j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f44959a.stopLoading();
        this.f44959a.clearHistory();
        try {
            this.f44959a.loadUrl(str);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            Logger.e(f44956j, "OpenUrlActivity:: loadUrl: " + th2.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f44959a.canGoBack()) {
            this.f44959a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f44956j, "onCreate()");
        try {
            this.f44960b = (v) P9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f44964f = extras.getString("external_url");
            this.f44962d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(C4240b4.i.f42656v, false);
            this.f44966h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f44967i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f44963e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f44966h && (i10 == 25 || i10 == 24)) {
            this.f44965g.postDelayed(this.f44967i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f44966h && z10) {
            runOnUiThread(this.f44967i);
        }
    }

    private void a() {
        if (this.f44961c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f44961c = progressBar;
            progressBar.setId(f44958l);
        }
        if (findViewById(f44958l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f44961c.setLayoutParams(layoutParams);
            this.f44961c.setVisibility(4);
            this.f44963e.addView(this.f44961c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        if (this.f44959a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f44959a = webView;
            webView.setId(f44957k);
            this.f44959a.getSettings().setJavaScriptEnabled(true);
            this.f44959a.setWebViewClient(new c());
            loadUrl(this.f44964f);
        }
        if (findViewById(f44957k) == null) {
            this.f44963e.addView(this.f44959a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f44960b;
        if (vVar != null) {
            vVar.b(true, C4240b4.i.Y);
        }
    }

    private void c() {
        WebView webView = this.f44959a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }
}
