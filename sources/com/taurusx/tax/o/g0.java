package com.taurusx.tax.o;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.iab.omid.library.taurusx.ScriptInjector;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.i;
import com.taurusx.tax.o.m0;
import com.taurusx.tax.t.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class g0 extends com.taurusx.tax.t.z implements m0.z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f66431k = "MraidView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f66432a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebViewClient f66433c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f66434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f66435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f66436g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f66437i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f66438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect f66439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m0 f66440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f66441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f66442p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f66443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f66444t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DisplayMetrics f66445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.taurusx.tax.o.t f66446w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f66447y;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            z.InterfaceC0815z interfaceC0815z = g0.this.mWebViewListener;
            if (interfaceC0815z != null) {
                interfaceC0815z.w(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            LogUtil.d("taurusx", "WebView onPageFinished");
            if (g0.this.f66441o) {
                return;
            }
            g0.this.o();
            g0.this.m();
            g0.this.f();
            g0.this.f66447y.v();
            g0 g0Var = g0.this;
            g0Var.z(a0.z(g0Var.f66432a));
            g0.this.a();
            if (g0.this.getMraidListener() != null) {
                g0.this.getMraidListener().y(g0.this);
            }
            g0 g0Var2 = g0.this;
            g0Var2.f66444t = g0Var2.getVisibility() == 0;
            g0 g0Var3 = g0.this;
            g0Var3.z(h0.z(g0Var3.f66444t));
            g0.this.f66441o = true;
            z.InterfaceC0815z interfaceC0815z = g0.this.mWebViewListener;
            if (interfaceC0815z != null) {
                interfaceC0815z.z();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            LogUtil.d("taurusx", "WebView received error: " + i10 + ", description: " + str + ", failingUrl: " + str2);
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && str.endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", g0.this.getContext().getAssets().open("taurusx_mraid.js"));
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            z.InterfaceC0815z interfaceC0815z = g0.this.mWebViewListener;
            return interfaceC0815z != null ? interfaceC0815z.z(webView, str) : super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            LogUtil.d(g0.f66431k, "url: " + str);
            String scheme = Uri.parse(str).getScheme();
            z.InterfaceC0815z interfaceC0815z = g0.this.mWebViewListener;
            if (interfaceC0815z != null && interfaceC0815z.z(str)) {
                return true;
            }
            if (!"mraid".equals(scheme)) {
                return false;
            }
            g0.this.z(URI.create(str));
            return true;
        }

        public /* synthetic */ a(g0 g0Var, z zVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            LogUtil.d("taurusx", "WebView received error, request:" + webResourceRequest.getUrl() + ", error: " + webResourceError.getErrorCode() + TokenBuilder.TOKEN_DELIMITER + ((Object) webResourceError.getDescription()));
        }
    }

    public enum c {
        ENABLED,
        DISABLED
    }

    public enum f {
        INLINE,
        INTERSTITIAL
    }

    public interface g {
        void z(g0 g0Var);
    }

    public final class m {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f66451w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f66453z;

        public m() {
        }

        public /* synthetic */ m(g0 g0Var, z zVar) {
            this();
        }
    }

    public enum n {
        ALWAYS_VISIBLE,
        ALWAYS_HIDDEN,
        AD_CONTROLLED
    }

    public interface o {
        void w(g0 g0Var);

        void y(g0 g0Var);

        void z(g0 g0Var);

        void z(g0 g0Var, p pVar);

        void z(g0 g0Var, com.taurusx.tax.w.s.z zVar);
    }

    public enum p {
        LOADING,
        DEFAULT,
        EXPANDED,
        RESIZED,
        HIDDEN
    }

    public static class s {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public t f66456w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public g f66457y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public o f66458z;
    }

    public interface t {
        void z(g0 g0Var, boolean z10);
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ View f66460z;

        public w(View view) {
            this.f66460z = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            this.f66460z.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            int width = this.f66460z.getWidth();
            int height = this.f66460z.getHeight();
            int i12 = width + i10;
            int i13 = height + i11;
            g0.this.f66435f = new Rect(i10, i11, i12, i13);
            g0.this.f66439m = new Rect(i10, i11, i12, i13);
            g0.this.t();
            g0.this.g();
        }
    }

    public static class y implements o {
        @Override // com.taurusx.tax.o.g0.o
        public void w(g0 g0Var) {
        }

        @Override // com.taurusx.tax.o.g0.o
        public void y(g0 g0Var) {
        }

        @Override // com.taurusx.tax.o.g0.o
        public void z(g0 g0Var) {
        }

        @Override // com.taurusx.tax.o.g0.o
        public void z(g0 g0Var, p pVar) {
        }

        @Override // com.taurusx.tax.o.g0.o
        public void z(g0 g0Var, com.taurusx.tax.w.s.z zVar) {
        }
    }

    public class z implements View.OnTouchListener {
        public z() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            g0.this.f66440n.z(view, motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public g0(Context context, boolean z10) {
        this(context, c.ENABLED, n.AD_CONTROLLED, f.INLINE);
        this.f66438l = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        c();
        m mVar = this.f66442p;
        int i10 = mVar.f66453z;
        int i11 = mVar.f66451w;
        LogUtil.d(f66431k, "setMaxSize " + i10 + "x" + i11);
        w("mraid.setMaxSize(" + com.taurusx.tax.o.o.z(i10, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(i11, this.f66436g) + ");");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        s();
        m mVar = this.f66437i;
        int i10 = mVar.f66453z;
        int i11 = mVar.f66451w;
        LogUtil.d(f66431k, "setScreenSize " + i10 + "x" + i11);
        w("mraid.setScreenSize(" + com.taurusx.tax.o.o.z(i10, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(i11, this.f66436g) + ");");
    }

    @Override // com.taurusx.tax.t.z, android.webkit.WebView
    public void destroy() {
        q qVar = this.f66447y;
        if (qVar != null) {
            qVar.s();
        }
        super.destroy();
    }

    public void g() {
        Rect rect = this.f66439m;
        int i10 = rect.left;
        int i11 = rect.top;
        int iWidth = rect.width();
        int iHeight = this.f66439m.height();
        LogUtil.d(f66431k, "setDefaultPosition [" + i10 + StringUtils.COMMA + i11 + "] (" + iWidth + "x" + iHeight + ")");
        w("mraid.setDefaultPosition(" + com.taurusx.tax.o.o.z(i10, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(i11, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(iWidth, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(iHeight, this.f66436g) + ");");
    }

    public com.taurusx.tax.o.t getBrowserController() {
        return this.f66446w;
    }

    public q getDisplayController() {
        return this.f66447y;
    }

    public boolean getIsVisible() {
        return this.f66444t;
    }

    public o getMraidListener() {
        return this.f66434e.f66458z;
    }

    @Deprecated
    public WebViewClient getMraidWebViewClient() {
        return this.f66433c;
    }

    public t getOnCloseButtonStateChangeListener() {
        return this.f66434e.f66456w;
    }

    public g getOnOpenListener() {
        return this.f66434e.f66457y;
    }

    @Override // com.taurusx.tax.t.z
    public void loadHtmlResponse(String str) {
        z(str, "file:///taurusx");
    }

    @Override // com.taurusx.tax.t.z
    public void loadHtmlResponseWithBaseUrl(String str, String str2) {
        z(str, str2);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (str == null) {
            return;
        }
        super.loadUrl(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        z.InterfaceC0815z interfaceC0815z = this.mWebViewListener;
        if (interfaceC0815z != null) {
            interfaceC0815z.w();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = i10 == 0;
        if (z10 != this.f66444t) {
            this.f66444t = z10;
            if (this.f66441o) {
                z(h0.z(z10));
            }
        }
    }

    @Deprecated
    public void setHasFiredReadyEvent(boolean z10) {
        this.f66441o = z10;
    }

    @Deprecated
    public void setMraidDisplayController(q qVar) {
        this.f66447y = qVar;
    }

    public void setMraidListener(o oVar) {
        this.f66434e.f66458z = oVar;
    }

    public void setOnCloseButtonStateChange(t tVar) {
        this.f66434e.f66456w = tVar;
    }

    public void setOnOpenListener(g gVar) {
        this.f66434e.f66457y = gVar;
    }

    private void c() {
        m mVar = this.f66437i;
        int i10 = mVar.f66453z;
        int i11 = mVar.f66451w;
        LogUtil.d(f66431k, "calculateMaxSize max size " + i10 + "x" + i11);
        m mVar2 = this.f66442p;
        if (i10 == mVar2.f66453z && i11 == mVar2.f66451w) {
            return;
        }
        mVar2.f66453z = i10;
        mVar2.f66451w = i11;
    }

    private void n() {
        if (this.f66434e.f66458z != null) {
            this.f66434e.f66458z.w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        post(new w(this));
    }

    private void s() {
        boolean z10 = getResources().getConfiguration().orientation == 1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("calculateScreenSize orientation ");
        sb2.append(z10 ? "portrait" : "landscape");
        LogUtil.d(f66431k, sb2.toString());
        DisplayMetrics displayMetrics = this.f66445v;
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        LogUtil.d(f66431k, "calculateScreenSize screen size " + i10 + "x" + i11);
        m mVar = this.f66437i;
        if (i10 == mVar.f66453z && i11 == mVar.f66451w) {
            return;
        }
        mVar.f66453z = i10;
        mVar.f66451w = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Rect rect = this.f66435f;
        int i10 = rect.left;
        int i11 = rect.top;
        int iWidth = rect.width();
        int iHeight = this.f66435f.height();
        LogUtil.d(f66431k, "setCurrentPosition [" + i10 + StringUtils.COMMA + i11 + "] (" + iWidth + "x" + iHeight + ")");
        w("mraid.setCurrentPosition(" + com.taurusx.tax.o.o.z(i10, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(i11, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(iWidth, this.f66436g) + StringUtils.COMMA + com.taurusx.tax.o.o.z(iHeight, this.f66436g) + ");");
    }

    public void a() {
        w("window.mraidbridge.fireReadyEvent();");
    }

    public g0(Context context, c cVar, n nVar, f fVar) {
        super(context);
        this.f66435f = new Rect();
        this.f66439m = new Rect();
        z zVar = null;
        this.f66442p = new m(this, zVar);
        this.f66437i = new m(this, zVar);
        this.f66436g = context;
        this.f66432a = fVar;
        m0 m0Var = new m0(context, this);
        this.f66440n = m0Var;
        m0Var.z(this);
        this.f66444t = getVisibility() == 0;
        this.f66445v = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(this.f66445v);
        z(cVar, nVar);
    }

    @Override // com.taurusx.tax.o.m0.z
    public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        this.f66443s = true;
        if (getMraidListener() != null) {
            getMraidListener().z(this, zVar);
        }
        z.InterfaceC0815z interfaceC0815z = this.mWebViewListener;
        if (interfaceC0815z != null) {
            interfaceC0815z.w(zVar, aVar);
        }
    }

    @Override // com.taurusx.tax.o.m0.z
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        z.InterfaceC0815z interfaceC0815z = this.mWebViewListener;
        if (interfaceC0815z != null) {
            interfaceC0815z.z(zVar, aVar);
        }
    }

    @Override // com.taurusx.tax.o.m0.z
    public void z() {
        this.f66443s = false;
    }

    private void z(c cVar, n nVar) {
        setScrollContainer(false);
        setBackgroundColor(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOnTouchListener(new z());
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        this.f66446w = new com.taurusx.tax.o.t(this);
        this.f66447y = new q(this, cVar, nVar);
        a aVar = new a(this, null);
        this.f66433c = aVar;
        setWebViewClient(aVar);
        this.f66434e = new s();
    }

    @Override // com.taurusx.tax.o.m0.z
    public boolean w() {
        return this.f66443s;
    }

    public void w(String str) {
        if (str != null) {
            super.loadUrl("javascript:" + str);
        }
    }

    public void w(ViewGroup viewGroup, com.taurusx.tax.o.a aVar) {
        int i10 = aVar.f66413z;
        int i11 = aVar.f66411w;
        int iApplyDimension = (int) TypedValue.applyDimension(1, i10, this.f66445v);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, i11, this.f66445v);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = i11;
        viewGroup.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        layoutParams2.width = iApplyDimension;
        layoutParams2.height = iApplyDimension2;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams2).addRule(13);
        } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        setLayoutParams(layoutParams2);
    }

    public void z(String str, String str2) {
        if (str == null) {
            return;
        }
        if (!str.contains("<html>")) {
            str = "<html><head></head><body style='margin:0;padding:0;'>" + str + "</body></html>";
        }
        if (this.f66438l) {
            str = ScriptInjector.injectScriptContentIntoHtml(com.taurusx.tax.s.w.z(this.f66436g), str);
        }
        loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
    }

    public void z(b0 b0Var) {
        String str = "{" + b0Var.toString() + "}";
        w("window.mraidbridge.fireChangeEvent(" + str + ");");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fire change: ");
        sb2.append(str);
        LogUtil.d(f66431k, sb2.toString());
    }

    public void z(ArrayList<b0> arrayList) {
        String string = arrayList.toString();
        if (string.length() < 2) {
            return;
        }
        String str = "{" + string.substring(1, string.length() - 1) + "}";
        w("window.mraidbridge.fireChangeEvent(" + str + ");");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fire changes: ");
        sb2.append(str);
        LogUtil.d(f66431k, sb2.toString());
    }

    public void z(i.w wVar, String str) {
        w("window.mraidbridge.fireErrorEvent('" + wVar.z() + "', '" + str + "');");
    }

    public void z(String str) {
        w("window.mraidbridge.nativeCallComplete('" + str + "');");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(URI uri) {
        String host = uri.getHost();
        com.taurusx.tax.o.g gVarZ = i.z(host, j0.y(uri.toString()), this);
        if (gVarZ == null) {
            z(host);
            return false;
        }
        if (gVarZ.z(this.f66432a) && !w()) {
            return false;
        }
        gVarZ.z();
        z(host);
        return true;
    }

    public void z(ViewGroup viewGroup) {
        int iWidth = this.f66439m.width();
        int iHeight = this.f66439m.height();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = iHeight;
        viewGroup.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        layoutParams2.width = iWidth;
        layoutParams2.height = iHeight;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams2).addRule(13);
        } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        setLayoutParams(layoutParams2);
    }

    public void z(ViewGroup viewGroup, com.taurusx.tax.o.a aVar) {
        if (viewGroup == null) {
            return;
        }
        int i10 = aVar.f66413z;
        int i11 = aVar.f66411w;
        int i12 = aVar.f66412y;
        int i13 = aVar.f66408c;
        int iApplyDimension = (int) TypedValue.applyDimension(1, i10, this.f66445v);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, i11, this.f66445v);
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, i12, this.f66445v);
        int iApplyDimension4 = (int) TypedValue.applyDimension(1, i13, this.f66445v);
        Rect rect = this.f66439m;
        int i14 = rect.left + iApplyDimension3;
        int i15 = rect.top + iApplyDimension4;
        if (viewGroup.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.leftMargin = iApplyDimension3;
            layoutParams.topMargin = iApplyDimension4;
            viewGroup.setLayoutParams(layoutParams);
        } else if (viewGroup.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams2.leftMargin = iApplyDimension3;
            layoutParams2.topMargin = iApplyDimension4;
            viewGroup.setLayoutParams(layoutParams2);
        } else if (viewGroup.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams3.leftMargin = iApplyDimension3;
            layoutParams3.topMargin = iApplyDimension4;
            viewGroup.setLayoutParams(layoutParams3);
        }
        Rect rect2 = this.f66435f;
        if (i14 == rect2.left && i15 == rect2.top && iApplyDimension == rect2.width() && iApplyDimension2 == this.f66435f.height()) {
            return;
        }
        Rect rect3 = this.f66435f;
        rect3.left = i14;
        rect3.top = i15;
        rect3.right = i14 + iApplyDimension;
        rect3.bottom = i15 + iApplyDimension2;
        t();
    }
}
