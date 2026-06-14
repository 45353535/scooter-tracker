package com.pubmatic.sdk.common.browser;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.R$drawable;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBAlertDialog;
import com.pubmatic.sdk.common.utility.POBDeepLinkUtil;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBInternalBrowserActivity extends Activity {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static List f62252h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f62253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f62254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f62255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ProgressBar f62256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AlertDialog f62258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewGroup f62259g;

    public interface InternalBrowserListener {
        void onBrowserDismiss();

        void onBrowserStart();

        void onExternalBrowserClick(@NonNull String str);
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInternalBrowserActivity.this.finish();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInternalBrowserActivity.this.l();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBInternalBrowserActivity.this.f62255c != null) {
                POBInternalBrowserActivity.this.f62255c.goForward();
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBInternalBrowserActivity.this.f62255c != null) {
                POBInternalBrowserActivity.this.f62255c.reload();
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInternalBrowserActivity.this.j();
        }
    }

    private class f extends WebViewClient {

        class a implements POBAlertDialog.POBDialogListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SslErrorHandler f62266a;

            a(SslErrorHandler sslErrorHandler) {
                this.f62266a = sslErrorHandler;
            }

            @Override // com.pubmatic.sdk.common.utility.POBAlertDialog.POBDialogListener
            public void onCancel(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                this.f62266a.cancel();
                if (POBInternalBrowserActivity.this.f62255c == null || POBInternalBrowserActivity.this.f62255c.copyBackForwardList().getCurrentIndex() >= 0) {
                    return;
                }
                POBInternalBrowserActivity.this.l();
            }

            @Override // com.pubmatic.sdk.common.utility.POBAlertDialog.POBDialogListener
            public void onSuccess(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                this.f62266a.proceed();
            }
        }

        private f() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (POBInternalBrowserActivity.this.f62256d != null) {
                POBInternalBrowserActivity.this.f62256d.setVisibility(8);
            }
            if (POBInternalBrowserActivity.this.f62255c != null) {
                if (POBInternalBrowserActivity.this.f62253a != null) {
                    POBInternalBrowserActivity pOBInternalBrowserActivity = POBInternalBrowserActivity.this;
                    pOBInternalBrowserActivity.a(pOBInternalBrowserActivity.f62253a, POBInternalBrowserActivity.this.f62255c.canGoBack());
                }
                if (POBInternalBrowserActivity.this.f62254b != null) {
                    POBInternalBrowserActivity pOBInternalBrowserActivity2 = POBInternalBrowserActivity.this;
                    pOBInternalBrowserActivity2.a(pOBInternalBrowserActivity2.f62254b, POBInternalBrowserActivity.this.f62255c.canGoForward());
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (POBInternalBrowserActivity.this.f62256d != null) {
                POBInternalBrowserActivity.this.f62256d.setVisibility(0);
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            ProgressBar unused = POBInternalBrowserActivity.this.f62256d;
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            POBLog.warn("POBInternalBrowserActivity", "SSL error: %s", sslError);
            if (POBInternalBrowserActivity.this.f62256d != null) {
                POBInternalBrowserActivity.this.f62256d.setVisibility(8);
            }
            String str = "Connection to this site is not secure: " + POBInternalBrowserActivity.this.b(sslError.getPrimaryError());
            if (POBInternalBrowserActivity.this.isFinishing()) {
                POBLog.warn("POBInternalBrowserActivity", "Error showing ssl error dialog as activity is finishing!", new Object[0]);
                return;
            }
            if (POBInternalBrowserActivity.this.f62258f != null) {
                if (POBInternalBrowserActivity.this.f62258f.isShowing()) {
                    return;
                }
                POBInternalBrowserActivity.this.f62258f.setMessage(str);
                POBInternalBrowserActivity.this.f62258f.show();
                return;
            }
            AlertDialog.Builder builderBuild = POBAlertDialog.build(POBInternalBrowserActivity.this, "Warning!", str, new a(sslErrorHandler));
            if (builderBuild != null) {
                try {
                    POBInternalBrowserActivity.this.f62258f = builderBuild.create();
                    POBInternalBrowserActivity.this.f62258f.show();
                } catch (Exception unused) {
                    POBLog.error("POBInternalBrowserActivity", "Error showing ssl error dialog.", new Object[0]);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            POBInternalBrowserActivity.this.h();
            POBInternalBrowserActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return Build.VERSION.SDK_INT < 24 && POBDeepLinkUtil.validateAndRedirect(POBInternalBrowserActivity.this, str);
        }

        /* synthetic */ f(POBInternalBrowserActivity pOBInternalBrowserActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return Build.VERSION.SDK_INT >= 24 && POBDeepLinkUtil.validateAndRedirect(POBInternalBrowserActivity.this, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (POBInternalBrowserActivity.this.f62256d != null) {
                POBInternalBrowserActivity.this.f62256d.setVisibility(8);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    private void i() {
        List<InternalBrowserListener> list = f62252h;
        if (list != null) {
            for (InternalBrowserListener internalBrowserListener : list) {
                if (this.f62257e == internalBrowserListener.hashCode()) {
                    internalBrowserListener.onBrowserDismiss();
                    a(internalBrowserListener);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<InternalBrowserListener> list = f62252h;
        if (list != null) {
            for (InternalBrowserListener internalBrowserListener : list) {
                if (this.f62255c != null && internalBrowserListener.hashCode() == this.f62257e) {
                    String url = this.f62255c.getUrl();
                    if (url != null) {
                        internalBrowserListener.onExternalBrowserClick(url);
                    } else {
                        POBLog.debug("POBInternalBrowserActivity", "Can't open external browser as url is not available.", new Object[0]);
                    }
                }
            }
        }
    }

    private void k() {
        List<InternalBrowserListener> list = f62252h;
        if (list != null) {
            for (InternalBrowserListener internalBrowserListener : list) {
                if (this.f62257e == internalBrowserListener.hashCode()) {
                    internalBrowserListener.onBrowserStart();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        WebView webView = this.f62255c;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.f62255c.goBack();
        }
    }

    public static void startNewActivity(@NonNull Context context, @NonNull String str, @NonNull InternalBrowserListener internalBrowserListener) {
        if (f62252h == null) {
            f62252h = new ArrayList();
        }
        f62252h.add(internalBrowserListener);
        Intent intent = new Intent(context, (Class<?>) POBInternalBrowserActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("url", str);
        intent.putExtra("listener_hash_code", internalBrowserListener.hashCode());
        try {
            POBUtils.startActivity(context, intent);
        } catch (Exception e10) {
            POBLog.error("POBInternalBrowserActivity", "Error starting internal browser activity: %s", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        l();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayoutC = c();
        if (Build.VERSION.SDK_INT >= 30) {
            POBUtils.setSystemFitWindowsForEdgeToEdge(relativeLayoutC);
        }
        setContentView(relativeLayoutC);
        this.f62259g = (ViewGroup) findViewById(R.id.content);
        this.f62257e = getIntent().getIntExtra("listener_hash_code", 0);
        a(getIntent().getStringExtra("url"));
        k();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        POBLog.debug("POBInternalBrowserActivity", "Activity on destroy called.", new Object[0]);
        h();
        AlertDialog alertDialog = this.f62258f;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f62258f = null;
        }
        super.onDestroy();
        i();
    }

    private ImageView b() {
        ImageView imageViewA = a(R$drawable.pob_ic_action_cancel);
        imageViewA.setOnClickListener(new a());
        return imageViewA;
    }

    private RelativeLayout c() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        a(relativeLayout);
        return relativeLayout;
    }

    private ImageView d() {
        ImageView imageViewA = a(R$drawable.pob_ic_action_web_site);
        imageViewA.setOnClickListener(new e());
        return imageViewA;
    }

    private ImageView e() {
        ImageView imageViewA = a(R$drawable.pob_ic_action_forward);
        this.f62254b = imageViewA;
        a(imageViewA, false);
        this.f62254b.setOnClickListener(new c());
        return this.f62254b;
    }

    private ImageView f() {
        ImageView imageViewA = a(R$drawable.pob_ic_action_refresh);
        imageViewA.setOnClickListener(new d());
        return imageViewA;
    }

    private WebView g() {
        POBWebView pOBWebViewCreateInstance = POBWebView.createInstance(POBUtils.resolveWebViewContext(this));
        if (pOBWebViewCreateInstance != null) {
            WebSettings settings = pOBWebViewCreateInstance.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setDomStorageEnabled(true);
            pOBWebViewCreateInstance.setWebViewClient(new f(this, null));
        }
        return pOBWebViewCreateInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ViewGroup viewGroup = this.f62259g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f62259g = null;
        }
        WebView webView = this.f62255c;
        if (webView != null) {
            webView.setWebViewClient(null);
            this.f62255c.destroy();
            this.f62255c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i10) {
        if (i10 == 0) {
            return "Certificate Invalid.";
        }
        if (i10 == 1) {
            return "Certificate Expired.";
        }
        if (i10 == 2) {
            return "Domain Name Mismatched.";
        }
        if (i10 == 3) {
            return "Untrusted Certificate.";
        }
        if (i10 == 4) {
            return "Invalid Date.";
        }
        if (i10 != 5) {
            return "SSL Error.";
        }
        return "Certificate Invalid.";
    }

    private void a(InternalBrowserListener internalBrowserListener) {
        List list = f62252h;
        if (list != null) {
            list.remove(internalBrowserListener);
            if (f62252h.isEmpty()) {
                f62252h = null;
            }
        }
    }

    private void a(String str) {
        if (this.f62255c != null && !POBUtils.isNullOrEmpty(str)) {
            POBLog.debug("POBInternalBrowserActivity", "Loading url in internal browser : %s", str);
            this.f62255c.loadUrl(str);
        } else {
            POBLog.warn("POBInternalBrowserActivity", "Unable to open internal browser : %s", "Invalid url");
        }
    }

    private void a(RelativeLayout relativeLayout) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, POBUtils.convertDpToPixel(40));
        layoutParams.addRule(12);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(R$id.pob_dialog_id);
        linearLayout.setBackgroundColor(-12303292);
        linearLayout.setOrientation(0);
        linearLayout.setVerticalGravity(16);
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams2.setMargins(2, 4, 2, 2);
        linearLayout.addView(b(), layoutParams2);
        linearLayout.addView(a(), layoutParams2);
        linearLayout.addView(e(), layoutParams2);
        linearLayout.addView(f(), layoutParams2);
        linearLayout.addView(d(), layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, linearLayout.getId());
        WebView webViewG = g();
        this.f62255c = webViewG;
        if (webViewG != null) {
            relativeLayout.addView(webViewG, layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(13);
            ProgressBar progressBar = new ProgressBar(this, null, R.attr.progressBarStyle);
            this.f62256d = progressBar;
            relativeLayout.addView(progressBar, layoutParams4);
            return;
        }
        finish();
    }

    private ImageView a() {
        ImageView imageViewA = a(R$drawable.pob_ic_action_back);
        this.f62253a = imageViewA;
        a(imageViewA, false);
        this.f62253a.setOnClickListener(new b());
        return this.f62253a;
    }

    private ImageView a(int i10) {
        ImageView imageView = new ImageView(this);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setImageResource(i10);
        imageView.setBackgroundColor(getResources().getColor(R.color.background_dark, getTheme()));
        imageView.setScaleType(scaleType);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ImageView imageView, boolean z10) {
        if (z10) {
            imageView.setEnabled(true);
            imageView.setImageAlpha(255);
        } else {
            imageView.setEnabled(false);
            imageView.setImageAlpha(160);
        }
    }
}
