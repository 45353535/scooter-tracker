package com.bytedance.sdk.component.tvp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.tvp.qdl;
import com.bytedance.sdk.component.utils.uw;
import com.bytedance.sdk.component.utils.vu;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.taurusx.tax.y.z.w.s;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends FrameLayout {

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static mml f16674ag;
    private boolean aaj;
    private mzz ax;
    private boolean bch;
    private View bjy;
    private float bqt;
    private uw ekw;
    private com.bytedance.sdk.component.tvp.mml exc;
    private boolean exu;
    private AtomicBoolean fco;
    private long fs;
    private AtomicBoolean gy;
    private AttributeSet hkc;
    private Context hzv;
    private List<String> jl;
    private float jpc;
    private qdl.InterfaceC0236qdl jtx;
    private boolean jyq;
    private ud kdv;
    private float koa;
    private boolean ljh;
    public int lnr;
    private com.bytedance.sdk.component.tvp.ud.qdl mml;
    private JSONObject mo;
    private AtomicBoolean mrf;
    private String mzz;
    private long om;
    private boolean oth;
    public int qdl;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private int f16675rc;
    private volatile WebView rdp;
    private long rq;
    private long to;
    private float tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public int f16676ud;
    private WebViewClient uw;
    private float vu;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    private long f16677wc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f16678wd;
    private lnr xmv;
    private com.bytedance.sdk.component.tvp.qdl yt;

    public enum lnr {
        ADS(b.JSON_KEY_ADS),
        ADS_V3("ads_v3"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT(N6.f41375d0),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String exu;

        lnr(String str) {
            this.exu = str;
        }
    }

    public interface mml {
        WebView createWebView(Context context, AttributeSet attributeSet, int i10, lnr lnrVar);
    }

    public interface mzz {
    }

    public static class qdl extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.tvp.mo.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public interface ud {
    }

    public mo(Context context, lnr lnrVar) {
        this(qdl(context), false, lnrVar);
    }

    private void aaj() {
        try {
            WebSettings settings = this.rdp.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void exc() {
        if (this.rdp == null) {
            return;
        }
        try {
            this.rdp.removeJavascriptInterface("searchBoxJavaBridge_");
            this.rdp.removeJavascriptInterface("accessibility");
            this.rdp.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private void jyq() {
        if (this.ekw == null) {
            this.gy.set(false);
            this.ekw = new uw(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.tvp.mo.1
        };
        this.gy.set(true);
    }

    private static void lnr(Context context) {
    }

    private static Context qdl(Context context) {
        return context;
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(mml mmlVar) {
        f16674ag = mmlVar;
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.rdp.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.rdp.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bjy() {
        if (this.rdp == null) {
            return;
        }
        try {
            this.rdp.onPause();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.rdp == null) {
            return;
        }
        try {
            this.rdp.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void exu() {
        if (this.rdp != null) {
            this.rdp.onResume();
        }
    }

    public void fs() {
        try {
            this.rdp.goForward();
        } catch (Throwable unused) {
        }
    }

    public View getArbitrageLoadingView() {
        return this.bjy;
    }

    public int getContentHeight() {
        if (this.rdp == null) {
            return 0;
        }
        try {
            return this.rdp.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.f16677wc;
    }

    public long getLandingPageClickEnd() {
        return this.om;
    }

    public com.bytedance.sdk.component.tvp.ud.qdl getMaterialMeta() {
        return this.mml;
    }

    public String getOriginalUrl() {
        String url;
        if (this.rdp == null) {
            return null;
        }
        try {
            String originalUrl = this.rdp.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.rdp.getUrl()) != null) {
                if (url.startsWith(AdPayload.FILE_SCHEME)) {
                    return url;
                }
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.rdp == null) {
            return 0;
        }
        try {
            return this.rdp.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public lnr getScene() {
        return this.xmv;
    }

    public String getUrl() {
        if (this.rdp == null) {
            return null;
        }
        try {
            return this.rdp.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.rdp == null) {
            return "";
        }
        try {
            return this.rdp.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.rdp;
    }

    public WebViewClient getWebViewClient() {
        return this.uw;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean i_() {
        return this.aaj;
    }

    public void jl() {
        try {
            this.rdp.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void jpc() {
        try {
            this.rdp.reload();
        } catch (Throwable unused) {
        }
    }

    public void jtx() {
        if (this.rdp == null) {
            return;
        }
        lnr lnrVar = this.xmv;
        if (lnrVar != lnr.ADS && lnrVar != lnr.ADS_V3) {
            vu.qdl(this);
        } else {
            try {
                this.rdp.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public boolean mml() {
        return this.ljh;
    }

    public void mo() {
        if (this.rdp != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.rdp.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.rdp, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void mzz() {
        try {
            if (this.rdp == null) {
                this.rdp = qdl(this.hkc, 0);
            }
            mo();
            ud(qdl(this.hzv));
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.fco.set(true);
        if (!this.mrf.get() || this.gy.get()) {
            return;
        }
        jyq();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.fco.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentQdl;
        try {
            qdl(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.exu && (viewParentQdl = qdl(this)) != null) {
                viewParentQdl.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void rdp() {
        try {
            this.rdp.clearHistory();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.rdp.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public boolean rq() {
        if (this.rdp == null) {
            return false;
        }
        try {
            return this.rdp.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.rdp.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.rdp.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.rdp.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.rdp.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.rdp.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.f16675rc = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.rdp.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.koa = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.rdp.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.rdp.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.rdp.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.rdp.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.rdp.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.exu = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.rdp.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.rdp.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.f16678wd = z10;
    }

    public void setLandingPageClickBegin(long j10) {
        this.f16677wc = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.om = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.rdp.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.rdp.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.rdp.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z10) {
        this.aaj = z10;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.tvp.ud.qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.rdp.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.rdp.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(ud udVar) {
        this.kdv = udVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.rdp.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z10) {
        this.bch = z10;
    }

    public void setPreFinish(boolean z10) {
        this.oth = z10;
    }

    public void setPreProgressHundred(boolean z10) {
        this.ljh = z10;
    }

    public void setPreStart(boolean z10) {
        this.jyq = z10;
    }

    public void setRecycler(boolean z10) {
        if (this.rdp == null || !(this.rdp instanceof com.bytedance.sdk.component.tvp.mzz)) {
            return;
        }
        ((com.bytedance.sdk.component.tvp.mzz) this.rdp).setRecycler(z10);
    }

    public void setShakeValue(float f10) {
        this.bqt = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.rdp.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.mzz = str;
        com.bytedance.sdk.component.tvp.qdl qdlVar = this.yt;
        if (qdlVar != null) {
            qdlVar.qdl(str);
        }
        com.bytedance.sdk.component.tvp.mml mmlVar = this.exc;
        if (mmlVar != null) {
            mmlVar.qdl(str);
        }
    }

    public void setTouchStateListener(mzz mzzVar) {
        this.ax = mzzVar;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.rdp.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.rdp.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.rdp.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.rdp.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.rdp = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof mzz) {
                setTouchStateListener((mzz) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new qdl();
            }
            this.uw = webViewClient;
            this.rdp.setWebViewClient(new wd(this.jtx, webViewClient, this.jl));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.vu = f10;
    }

    public void to() {
        try {
            this.rdp.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean tvp() {
        if (this.rdp == null) {
            return false;
        }
        try {
            return this.rdp.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean ud() {
        return this.jyq;
    }

    public void wd() {
        try {
            this.rdp.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void yt() {
        try {
            this.rdp.clearView();
        } catch (Throwable unused) {
        }
    }

    public mo(Context context, boolean z10, lnr lnrVar) {
        super(qdl(context));
        this.jpc = 0.0f;
        this.tvp = 0.0f;
        this.to = 0L;
        this.rq = 0L;
        this.fs = 0L;
        this.exu = false;
        this.bqt = 20.0f;
        this.vu = 50.0f;
        this.fco = new AtomicBoolean();
        this.mrf = new AtomicBoolean();
        this.gy = new AtomicBoolean();
        this.hzv = context;
        this.xmv = lnrVar;
        if (z10) {
            return;
        }
        try {
            this.rdp = qdl((AttributeSet) null, 0);
            mo();
        } catch (Throwable unused) {
        }
        ud(qdl(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.rdp.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase(C4240b4.i.f42616b)) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void ud(Context context) {
        lnr(context);
        aaj();
        exc();
    }

    @Override // android.view.View
    public String getTag() {
        return this.mzz;
    }

    public boolean lnr() {
        return this.oth;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void qdl(boolean z10, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z10 && this.rdp != null && (this.rdp instanceof com.bytedance.sdk.component.tvp.mzz)) {
            this.yt = new com.bytedance.sdk.component.tvp.qdl(this.hzv, i10, i11, list, i12);
            this.jl = list2;
            if (!TextUtils.isEmpty(this.mzz)) {
                this.yt.qdl(this.mzz);
            }
            ((com.bytedance.sdk.component.tvp.mzz) this.rdp).setTouchListenerProxy(this.yt);
            this.jtx = this.yt.qdl();
        }
    }

    private static boolean lnr(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean ud(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void qdl(int i10, long j10) {
        if (this.rdp == null || !(this.rdp instanceof com.bytedance.sdk.component.tvp.mzz)) {
            return;
        }
        this.exc = new com.bytedance.sdk.component.tvp.mml(this.hzv, this.yt, i10, j10, this);
        if (!TextUtils.isEmpty(this.mzz)) {
            this.exc.qdl(this.mzz);
        }
        ((com.bytedance.sdk.component.tvp.mzz) this.rdp).setTouchListenerProxy(this.exc);
    }

    public void qdl(boolean z10, View view) {
        if (z10) {
            this.bjy = view;
            view.setVisibility(8);
            View view2 = this.bjy;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.bjy, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView qdl(AttributeSet attributeSet, int i10) {
        mml mmlVar = f16674ag;
        if (mmlVar != null) {
            return mmlVar.createWebView(getContext(), attributeSet, i10, this.xmv);
        }
        if (attributeSet == null) {
            return new WebView(qdl(this.hzv));
        }
        return new WebView(qdl(this.hzv), attributeSet);
    }

    @TargetApi(19)
    public void qdl(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.rdp.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void qdl(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.rdp.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void qdl(boolean z10) {
        try {
            this.rdp.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ViewParent qdl(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (ud(view2) || lnr(view2)) ? parent : qdl(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void qdl(Object obj, String str) {
        try {
            this.rdp.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void qdl(MotionEvent motionEvent) {
        if (!this.f16678wd || this.mml == null) {
            return;
        }
        if ((this.mzz == null && this.mo == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.jpc = motionEvent.getRawX();
                this.tvp = motionEvent.getRawY();
                this.to = System.currentTimeMillis();
                this.mo = new JSONObject();
                if (this.rdp != null) {
                    this.f16677wc = this.to;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.mo.put("start_x", String.valueOf(this.jpc));
                this.mo.put("start_y", String.valueOf(this.tvp));
                this.mo.put("offset_x", String.valueOf(motionEvent.getRawX() - this.jpc));
                this.mo.put("offset_y", String.valueOf(motionEvent.getRawY() - this.tvp));
                this.mo.put("url", String.valueOf(getUrl()));
                this.mo.put(s.z.f67720z, "");
                this.rq = System.currentTimeMillis();
                if (this.rdp != null) {
                    this.om = this.rq;
                }
                this.mo.put("down_time", this.to);
                this.mo.put("up_time", this.rq);
                if (com.bytedance.sdk.component.tvp.qdl.qdl.qdl().ud() != null) {
                    long j10 = this.fs;
                    long j11 = this.to;
                    if (j10 != j11) {
                        this.fs = j11;
                        com.bytedance.sdk.component.tvp.qdl.qdl.qdl().ud().qdl(this.mml, this.mzz, "in_web_click", this.mo, this.rq - this.to);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
