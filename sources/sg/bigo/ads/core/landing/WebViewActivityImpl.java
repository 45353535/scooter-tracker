package sg.bigo.ads.core.landing;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.common.e.a;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.h.c;
import sg.bigo.ads.core.h.e;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewActivityImpl extends BaseAdActivityImpl implements View.OnClickListener {

    @Nullable
    protected ImageView A;

    @Nullable
    protected WebView B;
    protected String C;
    protected long D;
    protected d E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f104347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f104348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f104349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f104350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f104351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private FileChooser f104352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a.AbstractC1257a f104353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f104354i;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    protected TextView f104355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    protected ProgressBar f104356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public ImageView f104357z;

    class CustomWebChromeClient extends c {
        private CustomWebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.f104356y != null && !webViewActivityImpl.c()) {
                WebViewActivityImpl.this.f104356y.setProgress(i10);
            }
            WebViewActivityImpl.this.a(i10);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            WebViewActivityImpl.this.b(str);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (WebViewActivityImpl.this.f104352g == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.f104352g = new FileChooser(webViewActivityImpl.L);
            }
            FileChooser fileChooser = WebViewActivityImpl.this.f104352g;
            sg.bigo.ads.common.t.a.a(0, 3, "FileChooser", "onShowFileChooser");
            ValueCallback<Uri[]> valueCallback2 = fileChooser.f104345c;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            fileChooser.f104345c = valueCallback;
            fileChooser.a(fileChooserParams.getAcceptTypes());
            return true;
        }

        @Keep
        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            if (WebViewActivityImpl.this.f104352g == null) {
                WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
                webViewActivityImpl.f104352g = new FileChooser(webViewActivityImpl.L);
            }
            WebViewActivityImpl.this.f104352g.openFileChooser(valueCallback, str, str2);
        }

        /* synthetic */ CustomWebChromeClient(WebViewActivityImpl webViewActivityImpl, byte b10) {
            this();
        }
    }

    class a extends sg.bigo.ads.core.h.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f104361b;

        private a() {
        }

        @Override // sg.bigo.ads.core.h.d
        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            sg.bigo.ads.core.d.b.a(3002, 10105, "The render process was gone.");
            WebViewActivityImpl.this.b(0);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ProgressBar progressBar = WebViewActivityImpl.this.f104356y;
            if (progressBar != null) {
                progressBar.setAlpha(0.0f);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "WebView", "onPageFinished  ".concat(String.valueOf(str)));
            WebViewActivityImpl.this.a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            boolean z10 = false;
            sg.bigo.ads.common.t.a.a(0, 3, "WebView", "onPageStarted ".concat(String.valueOf(str)));
            ProgressBar progressBar = WebViewActivityImpl.this.f104356y;
            if (progressBar != null) {
                progressBar.animate().alpha(1.0f).setDuration(100L).setListener(null);
                WebViewActivityImpl.this.f104356y.setProgress(0);
            }
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            if (webViewActivityImpl.D < 0) {
                webViewActivityImpl.D = SystemClock.elapsedRealtime();
                z10 = true;
            }
            WebViewActivityImpl.this.a(str, z10);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            sg.bigo.ads.common.t.a.b("WebView", "onReceivedError: " + i10 + " " + str);
            WebViewActivityImpl.this.a(i10, str, str2);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f104361b++;
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            return a(webView, str, !(webViewActivityImpl.D >= 0 && webViewActivityImpl.f104347b));
        }

        /* synthetic */ a(WebViewActivityImpl webViewActivityImpl, byte b10) {
            this();
        }

        private void a(WebView webView, String str) {
            onPageFinished(webView, str);
            WebViewActivityImpl.this.b(0);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
        }

        private boolean a(WebView webView, String str, boolean z10) {
            boolean zA;
            if (WebViewActivityImpl.this.f104346a) {
                return true;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "WebView", "shouldOverrideUrlLoading url= " + str + ", isRedirectOnStart=" + z10);
            if (z10 && this.f104361b > 1) {
                WebViewActivityImpl.this.c(str);
            }
            if (sg.bigo.ads.core.landing.a.a(str)) {
                boolean zA2 = a(str);
                if (zA2 && z10) {
                    a(webView, str);
                }
                return zA2;
            }
            if (str.startsWith("intent://")) {
                try {
                    Intent uri = Intent.parseUri(str, 1);
                    Uri data = uri.getData();
                    if (data != null && WebViewActivityImpl.this.a(data)) {
                        if (z10) {
                            a(webView, str);
                        }
                        return true;
                    }
                    uri.addCategory("android.intent.category.BROWSABLE");
                    uri.setComponent(null);
                    uri.setSelector(null);
                    if (WebViewActivityImpl.this.L.startActivityIfNeeded(uri, -1)) {
                        if (z10) {
                            a(webView, str);
                        }
                        return true;
                    }
                    sg.bigo.ads.common.t.a.b("WebView", "queryIntentActivities: null");
                    String stringExtra = uri.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        if (sg.bigo.ads.core.landing.a.a(stringExtra)) {
                            zA = a(stringExtra);
                            if (zA && z10) {
                                a(webView, stringExtra);
                            }
                        } else {
                            zA = false;
                        }
                        if (!zA) {
                            webView.loadUrl(stringExtra);
                        }
                        return true;
                    }
                } catch (Exception e10) {
                    sg.bigo.ads.common.t.a.a(0, "WebView", "shouldOverrideUrlLoading: " + e10.getMessage());
                }
            } else if (!URLUtil.isValidUrl(str)) {
                if (WebViewActivityImpl.this.e(str) && z10) {
                    a(webView, str);
                }
                return true;
            }
            String strD = WebViewActivityImpl.this.d(str);
            if (str.equals(strD)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(strD);
            return true;
        }

        private boolean a(String str) {
            WebViewActivityImpl.this.E = new d();
            WebViewActivityImpl webViewActivityImpl = WebViewActivityImpl.this;
            webViewActivityImpl.E.f102162f = webViewActivityImpl.f104351f;
            Uri uri = Uri.parse(str);
            Activity activity = WebViewActivityImpl.this.L;
            Activity activity2 = WebViewActivityImpl.this.L;
            WebViewActivityImpl webViewActivityImpl2 = WebViewActivityImpl.this;
            boolean zA = sg.bigo.ads.core.landing.a.a(uri, activity, activity2, webViewActivityImpl2.E, webViewActivityImpl2.f104349d, WebViewActivityImpl.this.f104350e, WebViewActivityImpl.this.f104351f);
            WebViewActivityImpl webViewActivityImpl3 = WebViewActivityImpl.this;
            webViewActivityImpl3.a(webViewActivityImpl3.E);
            return zA;
        }
    }

    class b implements View.OnTouchListener, e.a {
        private b() {
        }

        @Override // sg.bigo.ads.core.h.e.a
        public final void a(MotionEvent motionEvent) {
            onTouch(WebViewActivityImpl.this.B, motionEvent);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                WebViewActivityImpl.a(WebViewActivityImpl.this);
            }
            return WebViewActivityImpl.this.a(motionEvent);
        }

        /* synthetic */ b(WebViewActivityImpl webViewActivityImpl, byte b10) {
            this();
        }
    }

    protected WebViewActivityImpl(@NonNull Activity activity) {
        super(activity);
        this.D = -1L;
        this.f104346a = false;
        this.f104347b = false;
        this.f104348c = new AtomicBoolean(true);
        this.f104349d = false;
        this.f104350e = null;
        this.f104353h = new a.AbstractC1257a() { // from class: sg.bigo.ads.core.landing.WebViewActivityImpl.1
            @Override // sg.bigo.ads.common.e.a.AbstractC1257a
            public final void a(boolean z10) {
                if (z10) {
                    WebViewActivityImpl.this.ac();
                } else {
                    WebViewActivityImpl.this.ae();
                }
            }
        };
        this.f104354i = new b(this, (byte) 0);
        Intent intent = this.L.getIntent();
        if (intent == null) {
            this.C = "";
            return;
        }
        this.C = intent.getStringExtra("url");
        this.f104349d = intent.getBooleanExtra("try_gp_inline", false);
        this.f104350e = intent.getStringExtra("gp_inline_ad_bundle");
        this.f104351f = intent.getBooleanExtra("gp_inline_real_launch", false);
    }

    private void c(int i10) {
        if (this.B == null || !v()) {
            d(i10);
        } else {
            this.B.goBack();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void F() {
        WebView webView = this.B;
        if (webView != null) {
            sg.bigo.ads.common.e.a.b(webView, this.f104353h);
            WebView webView2 = this.B;
            if (webView2 instanceof e) {
                ((e) webView2).setOnWebViewTouchListener(null);
            } else {
                webView2.setOnTouchListener(null);
            }
            this.B.destroy();
            this.B = null;
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void T() {
        if (TextUtils.isEmpty(this.C)) {
            sg.bigo.ads.common.t.a.a(0, "WebView", "url is null.");
            b(0);
            return;
        }
        aF();
        o(a());
        try {
            b();
        } catch (RuntimeException unused) {
        }
        s();
        if (q.a((CharSequence) this.C) || e(this.C)) {
            b(0);
        } else {
            t();
        }
    }

    protected int a() {
        return R.layout.bigo_ad_activity_webview;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @Deprecated
    public final void aG() {
        d(0);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ac() {
        if (this.f104348c.compareAndSet(true, false)) {
            d();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ae() {
        if (this.f104348c.compareAndSet(false, true)) {
            e();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        c(1);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ah() {
    }

    protected void b() {
        this.f104356y = (ProgressBar) p(R.id.inter_webview_progress_bar);
        this.f104355x = (TextView) p(R.id.inter_webview_title);
        this.A = (ImageView) p(R.id.inter_webview_back);
        this.f104357z = (ImageView) p(R.id.inter_webview_close);
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.f104357z;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        WebView webViewR = r();
        this.B = webViewR;
        if (webViewR != null) {
            byte b10 = 0;
            webViewR.setWebViewClient(new a(this, b10));
            this.B.setWebChromeClient(new CustomWebChromeClient(this, b10));
            u.a(this.B, (ViewGroup) p(R.id.inter_webview_container), new ViewGroup.LayoutParams(-1, -1), -1);
            WebView webView = this.B;
            if (webView instanceof e) {
                ((e) webView).setOnWebViewTouchListener(this.f104354i);
            } else {
                webView.setOnTouchListener(this.f104354i);
            }
            sg.bigo.ads.common.e.a.a(this.B, this.f104353h);
        }
    }

    @CallSuper
    protected void e() {
        WebView webView = this.B;
        if (webView != null) {
            webView.onPause();
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            if (tag.equals(sg.bigo.ads.common.utils.a.a(this.L, R.string.bigo_ad_tag_close, new Object[0]))) {
                d(3);
            } else if (tag.equals(sg.bigo.ads.common.utils.a.a(this.L, R.string.bigo_ad_tag_back, new Object[0]))) {
                c(2);
            }
        }
    }

    @Nullable
    protected WebView r() {
        return e.a(this.L);
    }

    protected void s() {
    }

    protected void t() {
        WebView webView = this.B;
        if (webView != null) {
            webView.loadUrl(this.C);
        }
    }

    protected boolean v() {
        WebView webView = this.B;
        return webView != null && webView.canGoBack();
    }

    public void b(int i10) {
        this.f104346a = true;
        e(i10);
        WebView webView = this.B;
        if (webView != null) {
            webView.stopLoading();
        }
        super.aG();
    }

    protected void c(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "WebView", "onAutoRedirectStart url= ".concat(String.valueOf(str)));
    }

    protected String d(String str) {
        return str;
    }

    protected void e(int i10) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void g(boolean z10) {
    }

    protected void a(@IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) {
    }

    protected void b(String str) {
        TextView textView = this.f104355x;
        if (textView != null) {
            textView.setText(str);
        }
    }

    protected boolean c() {
        return false;
    }

    @CallSuper
    protected void d() {
        WebView webView = this.B;
        if (webView != null) {
            webView.onResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        return a(Uri.parse(str));
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i10, int i11, Intent intent) {
        String dataString;
        FileChooser fileChooser = this.f104352g;
        if (fileChooser != null) {
            Uri[] uriArr = (i11 != -1 || i10 != 101 || intent == null || intent.getData() == null || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)};
            ValueCallback<Uri[]> valueCallback = fileChooser.f104345c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                fileChooser.f104345c = null;
            }
        }
    }

    protected void d(int i10) {
        b(i10);
    }

    protected void a(int i10, String str, String str2) {
    }

    protected void a(String str) {
    }

    protected void a(String str, boolean z10) {
    }

    protected void a(@NonNull d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Uri uri) {
        d dVar = new d();
        this.E = dVar;
        boolean z10 = this.f104351f;
        dVar.f102162f = z10;
        Activity activity = this.L;
        boolean zA = sg.bigo.ads.core.landing.a.a(uri, activity, activity, dVar, "", this.f104349d, this.f104350e, z10);
        d dVar2 = this.E;
        if (dVar2.f102158b == 0 && dVar2.f102159c == 0 && dVar2.f102160d < 0) {
            return zA;
        }
        a(dVar2);
        return zA;
    }

    protected boolean a(MotionEvent motionEvent) {
        return false;
    }

    static /* synthetic */ boolean a(WebViewActivityImpl webViewActivityImpl) {
        webViewActivityImpl.f104347b = true;
        return true;
    }
}
