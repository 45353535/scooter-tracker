package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.taurusx.tax.g.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ToolBar f49723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ToolBar f49724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ProgressBar f49725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f49726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f49727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f49728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f49729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected BaseWebView f49730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.OnClickListener f49731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f49732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f49733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f49734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f49735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f49736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WebViewClient f49737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f49738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f49739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f49741u;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f49736p + "ms");
            if (CommonWebView.this.f49739s != null) {
                CommonWebView.this.f49740t = false;
                CommonWebView.this.f49739s.a(CommonWebView.this.f49738r);
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f49725e.setVisible(true);
            CommonWebView.this.f49725e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
            }
            return true;
        }
    }

    class c extends WebChromeClient {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.f49725e.setVisible(false);
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f49725e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f49730j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f49724d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f49730j.canGoBack()) {
                        CommonWebView.this.f49730j.goBack();
                    }
                    CommonWebView.this.f49724d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f49730j.canGoBack());
                    if (CommonWebView.this.f49731k != null) {
                        CommonWebView.this.f49731k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f49724d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f49730j.canGoForward()) {
                        CommonWebView.this.f49730j.goForward();
                    }
                    CommonWebView.this.f49724d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f49730j.canGoForward());
                    if (CommonWebView.this.f49732l != null) {
                        CommonWebView.this.f49732l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f49724d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f49730j.canGoBack());
                    CommonWebView.this.f49724d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f49730j.canGoForward());
                    CommonWebView.this.f49730j.reload();
                    if (CommonWebView.this.f49733m != null) {
                        CommonWebView.this.f49733m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f49727g != null) {
                        CommonWebView.this.f49727g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f49734n != null) {
                        CommonWebView.this.f49734n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f49730j.getUrl());
                }
            }
        }
    }

    class e extends WebViewClient {
        e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f49724d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f49724d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    class f extends WebViewClient {
        f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (u0.a.b(str)) {
                u0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    class g extends WebViewClient {
        g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f49740t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f49738r = str;
            if (CommonWebView.this.f49740t) {
                return;
            }
            CommonWebView.this.f49740t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f49740t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f49738r = str;
            if (CommonWebView.this.f49740t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f49740t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    public interface h {
        void a();
    }

    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f49741u = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f49729i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f49728h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f49723c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f49724d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f49730j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f49730j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f49723c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f49724d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f49723c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f49726f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f49726f, layoutParams);
        this.f49721a = v0.a(getContext(), 40.0f);
        this.f49722b = v0.a(getContext(), 40.0f);
        this.f49728h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f49729i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f49730j == null) {
                this.f49730j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f49730j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f49730j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f49728h);
            this.f49730j.setWebChromeClient(this.f49729i);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            q0.b("CommonWebView", "webview is error", th2);
        }
        this.f49726f.addView(this.f49730j);
    }

    public void loadUrl(String str) {
        this.f49730j.loadUrl(str);
        if (this.f49737q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f49731k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f49732l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f49734n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f49733m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f49729i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f49728h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f49723c.getParent()).removeView(this.f49723c);
        this.f49726f.addView(this.f49723c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f49723c.getParent()).removeView(this.f49723c);
        addView(this.f49723c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f49727g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f49736p = i10;
        if (this.f49735o == null) {
            this.f49735o = new Handler(Looper.getMainLooper());
        }
        if (this.f49737q == null) {
            g gVar = new g();
            this.f49737q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f49739s = iVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.f49723c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f49723c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f49724d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f49723c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f49725e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f49725e);
        this.f49725e.initResource(true);
    }

    private void b() {
        if (this.f49724d != null) {
            return;
        }
        this.f49724d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f49722b);
        layoutParams.bottomMargin = 0;
        this.f49724d.setLayoutParams(layoutParams);
        this.f49724d.setBackgroundColor(-1);
        this.f49724d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f49724d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f49735o.postDelayed(this.f49741u, this.f49736p);
    }

    public void setToolBarTitle(String str) {
        this.f49723c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49741u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f49723c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f49723c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f49721a);
            layoutParams.addRule(10);
            this.f49723c.setLayoutParams(layoutParams);
            this.f49726f.addView(this.f49723c);
            return;
        }
        this.f49723c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f49721a));
        addView(this.f49723c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f49741u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th2) {
            q0.b("CommonWebView", th2.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
            if (uri.getScheme().equals(n.f66171o)) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    str2 = uri2.getPackage();
                } catch (Throwable th3) {
                    q0.b("CommonWebView", th3.getMessage());
                }
                if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    uri2.setFlags(268435456);
                    getContext().startActivity(uri2);
                    return true;
                }
                try {
                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                } catch (Throwable th4) {
                    q0.b("CommonWebView", th4.getMessage());
                }
                q0.b("CommonWebView", th2.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                q0.b("CommonWebView", "openDeepLink");
                return true;
            }
            if (!TextUtils.isEmpty(str)) {
                return !(str.startsWith("http") || str.startsWith("https"));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f49735o.removeCallbacks(this.f49741u);
    }
}
