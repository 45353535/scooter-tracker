package sg.bigo.ads.ad.interstitial.i;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.i;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.h.c;
import sg.bigo.ads.core.h.d;
import sg.bigo.ads.core.h.e;

/* JADX INFO: loaded from: classes4.dex */
public class a extends i<s> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f101387c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ProgressBar f101388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    m f101389b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    sg.bigo.ads.common.ac.a f101390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f101391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f101392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f101393g;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.i.a$a, reason: collision with other inner class name */
    static class C1243a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f101397a;

        public C1243a(a aVar) {
            this.f101397a = aVar;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            ProgressBar progressBar = this.f101397a.f101388a;
            if (progressBar == null || i10 <= 5) {
                return;
            }
            if (i10 > 95) {
                i10 = 95;
            }
            progressBar.setProgress(i10);
        }
    }

    static class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f101398a;

        public b(a aVar) {
            this.f101398a = aVar;
        }

        @Override // sg.bigo.ads.core.h.d
        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            sg.bigo.ads.core.d.b.a(3002, 10105, "The render process was gone.");
            this.f101398a.aG();
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f101398a.c() <= 1) {
                a.d(this.f101398a);
            }
            if (!a.f101387c) {
                ViewGroup viewGroup = (ViewGroup) this.f101398a.p(R.id.bigo_ad_bottom_privacy_content);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else if (2 == this.f101398a.o()) {
                this.f101398a.d();
            }
            a.m();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            int i10;
            sg.bigo.ads.common.ac.a aVar;
            this.f101398a.a();
            this.f101398a.b();
            a aVar2 = this.f101398a;
            if (aVar2.N != 0 && (aVar = aVar2.f101390d) != null && aVar.a()) {
                sg.bigo.ads.api.core.d dVar = new sg.bigo.ads.api.core.d();
                dVar.f102167k = 2;
                ((s) aVar2.N).H().a(aVar2.f101390d.f102284b, dVar);
            }
            super.onPageStarted(webView, str, bitmap);
            final a aVar3 = this.f101398a;
            int i11 = 3;
            if (a.f101387c) {
                int iA = aVar3.f101389b.a("video_play_page.webview_force_time");
                i10 = (iA == 5 || iA == 6 || iA == 7 || iA == 8) ? iA - 3 : 0;
            } else {
                int iA2 = aVar3.f101389b.a("video_play_page.webview2_force_time");
                if (iA2 == 0) {
                    i11 = 0;
                } else if (iA2 == 1 || iA2 == 2 || iA2 == 3 || iA2 == 4) {
                    i11 = iA2 + 1;
                }
                i10 = i11;
            }
            AdCountDownButton adCountDownButton = aVar3.A;
            if (adCountDownButton != null) {
                if (i10 > 0) {
                    adCountDownButton.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.i.a.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.f101384y)) {
                                return;
                            }
                            a.this.A.setVisibility(0);
                        }
                    }, ((long) i10) * 1000);
                } else {
                    adCountDownButton.setVisibility(0);
                }
            }
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    protected a(@NonNull Activity activity) {
        super(activity);
        this.f101393g = false;
    }

    static /* synthetic */ boolean m() {
        f101387c = false;
        return false;
    }

    private boolean n() {
        return 1 == this.f101389b.a("video_play_page.is_loading");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o() {
        m mVar = this.f101389b;
        if (mVar == null) {
            return 1;
        }
        int iA = mVar.a("video_play_page.imp_timing", 1);
        if (1 == iA || 2 == iA) {
            return iA;
        }
        return 1;
    }

    @NonNull
    private t p() {
        return sg.bigo.ads.ad.interstitial.d.a.a(((s) this.f101384y).H());
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        e eVar = this.f101391e;
        if (eVar != null) {
            eVar.destroy();
            this.f101391e = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void T() {
        T t10;
        AdCountDownButton adCountDownButton;
        super.T();
        T t11 = this.N;
        if (t11 == 0) {
            aG();
            return;
        }
        m mVarE = ((s) t11).f().e();
        this.f101389b = mVarE;
        if (mVarE == null) {
            aG();
            return;
        }
        e eVarA = e.a(this.L);
        this.f101391e = eVarA;
        if (eVarA == null) {
            aG();
            return;
        }
        ((s) this.N).H().f100357x = false;
        f101387c = true;
        this.f101392f = p(R.id.bigo_web_loading_container);
        int iA = this.f101389b.a("video_play_page.webview_layout", 7);
        if (iA != 7 && iA != 8) {
            iA = 7;
        }
        if (7 == iA && (adCountDownButton = this.A) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) adCountDownButton.getLayoutParams();
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(this.L, 20);
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.L, 10);
        }
        b();
        a();
        e eVar = this.f101391e;
        if (eVar != null) {
            eVar.setWebViewClient(new b(this));
            this.f101391e.setWebChromeClient(new C1243a(this));
            ViewGroup viewGroup = (ViewGroup) p(R.id.inter_webview_container);
            if (viewGroup != null) {
                u.a(this.f101391e, viewGroup, new FrameLayout.LayoutParams(-1, -1), -1);
                if (1 == o()) {
                    d();
                }
                if (this.N != 0) {
                    this.f101391e.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.i.a.1
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (a.this.f101390d == null) {
                                a.this.f101390d = new sg.bigo.ads.common.ac.a(a.this.L);
                            }
                            a.this.f101390d.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) p(R.id.inter_native_ad_view);
            if (viewGroup2 != null && (t10 = this.N) != 0 && ((s) t10).H() != null) {
                TextView textView = (TextView) viewGroup2.findViewById(R.id.inter_advertiser);
                TextView textView2 = (TextView) viewGroup2.findViewById(R.id.inter_ad_label);
                String advertiser = ((s) this.N).H().getAdvertiser();
                if (textView != null && textView2 != null) {
                    boolean zIsEmpty = TextUtils.isEmpty(advertiser);
                    textView.setVisibility(zIsEmpty ? 8 : 0);
                    if (!zIsEmpty) {
                        textView.setText(advertiser);
                        textView2.setText(sg.bigo.ads.common.utils.a.a(this.L.getApplicationContext(), R.string.bigo_ad_tag, new Object[0]));
                    }
                }
            }
        }
        this.f101391e.loadUrl(((s) this.N).f().N().a());
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        return R.layout.bigo_ad_activity_interstitial_sab;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Z() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final sg.bigo.ads.ad.c af() {
        return ((s) this.f101384y).H();
    }

    protected final int c() {
        int iA = this.f101389b.a("video_play_page.loading_timing");
        if (iA == 2) {
            return 3;
        }
        if (iA != 3) {
            return iA != 4 ? 1 : 10;
        }
        return 5;
    }

    protected final void d() {
        ViewGroup viewGroup = (ViewGroup) p(R.id.inter_native_ad_view);
        if (viewGroup != null) {
            p().a(viewGroup, viewGroup, 1, 1, 0, null);
        }
    }

    protected boolean j() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void l() {
    }

    static /* synthetic */ void d(a aVar) {
        View view = aVar.f101392f;
        if (view != null) {
            aVar.f101393g = false;
            view.setVisibility(8);
        }
    }

    protected final void b() {
        if (this.A != null) {
            if (!e() || j()) {
                this.A.setVisibility(8);
            }
        }
    }

    protected boolean e() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void g(int i10) {
    }

    protected final void a() {
        View view;
        if (!this.f101393g && n()) {
            if (this.f101392f == null || this.f101388a == null) {
                View viewP = p(R.id.bigo_web_loading_container);
                this.f101392f = viewP;
                if (viewP != null) {
                    this.f101388a = (ProgressBar) viewP.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.f101392f;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.f101388a;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int iC = c();
            if (iC > 1 && (view = this.f101392f) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.i.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.f101384y)) {
                            return;
                        }
                        a.d(a.this);
                    }
                }, ((long) iC) * 1000);
            }
            this.f101393g = true;
        }
    }
}
