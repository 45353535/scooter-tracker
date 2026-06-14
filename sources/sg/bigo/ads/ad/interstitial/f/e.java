package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.graphics.PointF;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f.b;
import sg.bigo.ads.common.h;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes4.dex */
public class e extends d {
    private final a F;
    private final a G;
    private final AtomicBoolean H;
    private boolean I;
    private final b.a J;
    private boolean K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final b f101244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f101245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f101246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f101247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f101248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final int f101249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected RoundedFrameLayout f101250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f101251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected View f101252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected LinearLayout f101253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected ImageView f101254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected TextView f101255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected RelativeLayout f101256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ImageView f101257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected ImageView f101258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected ImageView f101259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected ImageView f101260r;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$10, reason: invalid class name */
    final class AnonymousClass10 implements ValueCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f101262a;

        AnonymousClass10(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f101262a = marginLayoutParams;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Integer num) {
            this.f101262a.topMargin = num.intValue();
            e.this.f101250h.requestLayout();
            e.this.f101250h.getMeasuredWidth();
            e eVar = e.this;
            eVar.f(eVar.f101245c - this.f101262a.topMargin);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$2, reason: invalid class name */
    final class AnonymousClass2 implements ValueCallback<Void> {
        AnonymousClass2() {
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Void r12) {
            e.e(e.this);
        }
    }

    class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f101275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f101276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f101277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f101278e;

        private a() {
            this.f101275b = ViewConfiguration.get(e.this.L).getScaledTouchSlop();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
            /*
                r2 = this;
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                boolean r3 = r3.f()
                r0 = 0
                if (r3 != 0) goto L9b
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                java.util.concurrent.atomic.AtomicBoolean r3 = sg.bigo.ads.ad.interstitial.f.e.c(r3)
                boolean r3 = r3.get()
                if (r3 != 0) goto L17
                goto L9b
            L17:
                int r3 = r4.getAction()
                r1 = 1
                if (r3 == 0) goto L6b
                if (r3 == r1) goto L39
                r0 = 2
                if (r3 == r0) goto L28
                r4 = 3
                if (r3 == r4) goto L65
                goto L9a
            L28:
                float r3 = r4.getRawY()
                int r3 = (int) r3
                int r4 = r2.f101278e
                int r4 = r3 - r4
                r2.f101278e = r3
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                r3.c(r4)
                goto L9a
            L39:
                float r3 = r4.getRawX()
                float r4 = r4.getRawY()
                float r0 = r2.f101276c
                float r0 = r0 - r3
                float r3 = java.lang.Math.abs(r0)
                int r0 = r2.f101275b
                float r0 = (float) r0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 >= 0) goto L65
                float r3 = r2.f101277d
                float r3 = r3 - r4
                float r3 = java.lang.Math.abs(r3)
                int r4 = r2.f101275b
                float r4 = (float) r4
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L65
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                int r4 = r3.f101247e
                sg.bigo.ads.ad.interstitial.f.e.c(r3, r4)
                goto L9a
            L65:
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                r3.g()
                goto L9a
            L6b:
                float r3 = r4.getRawX()
                r2.f101276c = r3
                float r3 = r4.getRawY()
                r2.f101277d = r3
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                boolean r3 = r3.f()
                if (r3 == 0) goto L85
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                sg.bigo.ads.ad.interstitial.f.b r3 = r3.f101244b
                if (r3 != 0) goto L92
            L85:
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                r3.f()
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                boolean r3 = sg.bigo.ads.ad.interstitial.f.e.g(r3)
                if (r3 != 0) goto L93
            L92:
                return r0
            L93:
                float r3 = r4.getRawY()
                int r3 = (int) r3
                r2.f101278e = r3
            L9a:
                return r1
            L9b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.f.e.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }

        /* synthetic */ a(e eVar, byte b10) {
            this();
        }
    }

    public e(@NonNull Activity activity) {
        b bVar;
        int i10;
        super(activity);
        this.H = new AtomicBoolean(true);
        byte b10 = 0;
        this.I = false;
        this.J = new b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.1
            @Override // sg.bigo.ads.ad.interstitial.f.b.a
            public final boolean a() {
                if (e.this.u()) {
                    return false;
                }
                e.this.d(0);
                return true;
            }
        };
        this.K = true;
        LandingPageStyleConfig landingPageStyleConfig = ((d) this).f101236a;
        if (landingPageStyleConfig != null) {
            int i11 = landingPageStyleConfig.f103721a;
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    bVar = new b(landingPageStyleConfig.f103723c, i11, landingPageStyleConfig.f103725e, landingPageStyleConfig.f103726f);
                    break;
                default:
                    bVar = new b(0, 1, landingPageStyleConfig.f103725e, landingPageStyleConfig.f103726f);
                    break;
            }
        } else {
            bVar = null;
        }
        this.f101244b = bVar;
        int iA = sg.bigo.ads.common.utils.e.a(this.L, 20);
        this.f101246d = iA;
        LandingPageStyleConfig landingPageStyleConfig2 = ((d) this).f101236a;
        this.f101245c = ((landingPageStyleConfig2 == null || (i10 = landingPageStyleConfig2.f103724d) <= 0) ? sg.bigo.ads.common.utils.e.c(this.L) - sg.bigo.ads.common.utils.e.a(this.L, 48) : i10) - iA;
        this.f101247e = 0;
        this.f101248f = (int) (this.f101245c * (1.0f - (bVar != null ? bVar.e() : 1.0f)));
        this.f101249g = sg.bigo.ads.common.utils.e.a(activity, 3);
        this.F = new a(this, b10);
        this.G = new a(this, b10);
        activity.setTheme(R.style.LandingPageStyle);
        aF();
        Window window = this.L.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = this.f101245c;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        activity.overridePendingTransition(0, 0);
    }

    private boolean x() {
        WebView webView = this.B;
        if (webView == null) {
            return false;
        }
        return webView.canGoForward();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage;
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ah() {
        super.ah();
        this.L.overridePendingTransition(0, 0);
        b bVar = this.f101244b;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        String host;
        ImageView imageView;
        super.b();
        this.f101250h = (RoundedFrameLayout) p(R.id.inter_landpage_webview_page);
        this.f101251i = (RelativeLayout) p(R.id.inter_webview_top_bar);
        this.f101253k = (LinearLayout) p(R.id.inter_webview_top_action_bar);
        this.f101254l = (ImageView) p(R.id.inter_webview_open);
        this.f101255m = (TextView) p(R.id.inter_webview_host);
        this.f101260r = (ImageView) p(R.id.inter_webview_safe);
        this.f101252j = p(R.id.inter_webview_top_indicator);
        this.f101256n = (RelativeLayout) p(R.id.inter_webview_bottom_bar);
        this.f101257o = (ImageView) p(R.id.inter_webview_forward);
        this.f101258p = (ImageView) p(R.id.inter_webview_copy);
        this.f101259q = (ImageView) p(R.id.inter_webview_refresh);
        this.f101254l.setOnClickListener(this);
        this.f101257o.setOnClickListener(this);
        this.f101258p.setOnClickListener(this);
        this.f101259q.setOnClickListener(this);
        View viewP = p(R.id.inter_webview_top_middle);
        int i10 = 8;
        this.f101254l.setVisibility(c() ? 8 : 0);
        this.f101257o.setVisibility(c() ? 8 : 0);
        this.f101258p.setVisibility(c() ? 8 : 0);
        this.f101259q.setVisibility(c() ? 8 : 0);
        this.f101256n.setVisibility(c() ? 8 : 0);
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setVisibility(c() ? 8 : 0);
        }
        View view = this.f101252j;
        if (view != null) {
            view.setVisibility(c() ? 8 : 0);
        }
        if (viewP != null) {
            viewP.setVisibility(c() ? 8 : 0);
        }
        b bVar = this.f101244b;
        if (bVar != null) {
            this.f101251i.setLayoutDirection(bVar.f() ? 1 : 0);
        }
        this.f101253k.setLayoutDirection(this.f101251i.getLayoutDirection());
        this.f104357z.setLayoutDirection(0);
        this.f101254l.setLayoutDirection(0);
        this.f104356y.setLayoutDirection(0);
        this.f104355x.setLayoutDirection(0);
        this.f101255m.setLayoutDirection(0);
        this.f104355x.setMaxLines(1);
        float fA = sg.bigo.ads.common.utils.e.a(this.L, 16);
        this.f101250h.a(fA, fA, 0.0f, 0.0f);
        this.f104355x.setVisibility(8);
        this.f101255m.setVisibility(8);
        String str = this.C;
        boolean zIsHttpsUrl = URLUtil.isHttpsUrl(str);
        try {
            host = Uri.parse(str).getHost();
        } catch (Exception unused) {
            host = "";
        }
        this.f101255m.setText(host);
        if (q.a((CharSequence) host)) {
            this.f101255m.setVisibility(8);
            imageView = this.f101260r;
        } else {
            this.f101255m.setVisibility(0);
            imageView = this.f101260r;
            if (zIsHttpsUrl) {
                i10 = 0;
            }
        }
        imageView.setVisibility(i10);
        this.f101251i.setOnTouchListener(this.G);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f101250h.getLayoutParams();
        b bVar2 = this.f101244b;
        if (bVar2 != null) {
            marginLayoutParams.topMargin = bVar2.g() ? this.f101247e : this.f101248f;
        }
        this.f101250h.requestLayout();
        u.a(this.f101250h, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.f.e.7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.d(e.this);
            }
        });
        b bVar3 = this.f101244b;
        if ((bVar3 == null || bVar3.d() != 0) && !c()) {
            Drawable progressDrawable = this.f104356y.getProgressDrawable();
            if (progressDrawable instanceof LayerDrawable) {
                Drawable drawable = ((ClipDrawable) ((LayerDrawable) progressDrawable).findDrawableByLayerId(android.R.id.progress)).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    b bVar4 = this.f101244b;
                    gradientDrawable.setColors(new int[]{bVar4 != null ? bVar4.d() : -1, -1312769});
                }
            }
        }
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d() {
        super.d();
        b bVar = this.f101244b;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e() {
        super.e();
        b bVar = this.f101244b;
        if (bVar != null) {
            bVar.b();
        }
    }

    protected final void g() {
        float f10 = ((ViewGroup.MarginLayoutParams) this.f101250h.getLayoutParams()).topMargin;
        int i10 = this.f101248f;
        if (f10 <= i10 * 0.8f) {
            i10 = 0;
        }
        g(i10);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.api.b.h
    public final int h() {
        b bVar = this.f101244b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f101233c;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, android.view.View.OnClickListener
    public void onClick(View view) {
        WebView webView;
        super.onClick(view);
        if (view == this.f101254l) {
            sg.bigo.ads.core.landing.a.a(this.L, this.C, (JSONArray) null);
            return;
        }
        if (view == this.f101257o) {
            WebView webView2 = this.B;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.B.goForward();
            return;
        }
        if (view == this.f101258p) {
            if (sg.bigo.ads.common.utils.c.g(this.L, this.C)) {
                Activity activity = this.L;
                Toast.makeText(activity, sg.bigo.ads.common.utils.a.a(activity, R.string.bigo_ad_link_copied, new Object[0]), 0).show();
                return;
            }
            return;
        }
        if (view != this.f101259q || (webView = this.B) == null) {
            return;
        }
        webView.reload();
    }

    static /* synthetic */ void d(e eVar) {
        if (eVar.H.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((eVar.f101245c - ((ViewGroup.MarginLayoutParams) eVar.f101250h.getLayoutParams()).topMargin) * 1.5f) / eVar.f101249g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.4
                @Override // sg.bigo.ads.common.a.a
                public final void a(float f10, float f11, int i10, int i11) {
                    e.this.f((int) (i11 - f11));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    e.this.H.set(true);
                }
            };
            aVar.setDuration(jAbs);
            eVar.f101250h.startAnimation(aVar);
        }
    }

    static /* synthetic */ boolean e(e eVar) {
        eVar.K = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i10) {
        View view;
        int i11 = this.f101245c;
        int i12 = i11 - this.f101248f;
        int i13 = this.f101246d;
        if (i10 == i11 && (view = this.f101252j) != null && !this.I) {
            this.I = true;
            view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new b.a());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(e.this.f101250h, transitionSet);
                    e.this.f101252j.setVisibility(8);
                }
            }, 500L);
        }
        b bVar = this.f101244b;
        if (bVar != null) {
            bVar.a(i10, i12, i11, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        int iMax = Math.max(this.f101247e, Math.min(this.f101248f, i10));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f101250h.getLayoutParams();
        if (marginLayoutParams.topMargin == iMax) {
            return;
        }
        long jAbs = (long) Math.abs(((iMax - r1) * 2.0f) / this.f101249g);
        this.K = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.8
            @Override // sg.bigo.ads.common.utils.b.a
            public final void a(Object obj, Object obj2) {
                RoundedFrameLayout roundedFrameLayout = e.this.f101250h;
                if (obj == roundedFrameLayout && (obj2 instanceof PointF)) {
                    PointF pointF = (PointF) obj2;
                    roundedFrameLayout.getMeasuredWidth();
                    float f10 = pointF.x;
                    e.this.f((int) (r2.f101245c - pointF.y));
                }
            }
        });
        transitionSet.setDuration(jAbs);
        transitionSet.addListener((Transition.TransitionListener) new h() { // from class: sg.bigo.ads.ad.interstitial.f.e.9
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                super.onTransitionEnd(transition);
                e.e(e.this);
            }
        });
        TransitionManager.beginDelayedTransition(this.f101250h, transitionSet);
        marginLayoutParams.topMargin = iMax;
        this.f101250h.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str) {
        super.a(str);
        this.A.setEnabled(v());
        this.f101257o.setEnabled(x());
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(final int i10) {
        sg.bigo.ads.api.core.d dVar = this.E;
        if (dVar != null && dVar.f102160d == 4) {
            super.b(i10);
            return;
        }
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.6
            @Override // java.lang.Runnable
            public final void run() {
                e.super.b(i10);
            }
        };
        if (this.H.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((this.f101245c - ((ViewGroup.MarginLayoutParams) this.f101250h.getLayoutParams()).topMargin) * 1.5f) / this.f101249g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0.0f, 1.0f);
                }

                @Override // sg.bigo.ads.common.a.a
                public final void a(float f10, float f11, int i11, int i12) {
                    e.this.f((int) (i12 - f11));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            };
            aVar.setFillAfter(true);
            aVar.setDuration(jAbs);
            this.f101250h.startAnimation(aVar);
        }
    }

    protected final void c(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f101250h.getLayoutParams();
        int iMin = Math.min(Math.max(this.f101247e, marginLayoutParams.topMargin + i10), this.f101248f);
        marginLayoutParams.topMargin = iMin;
        this.f101250h.requestLayout();
        this.f101250h.getMeasuredWidth();
        f(this.f101245c - iMin);
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str, boolean z10) {
        super.a(str, z10);
        this.A.setEnabled(v());
        this.f101257o.setEnabled(x());
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(String str) {
        super.b(str);
        TextView textView = this.f104355x;
        if (textView != null) {
            textView.setVisibility(q.a((CharSequence) str) ? 8 : 0);
        }
    }

    protected final boolean f() {
        return ((ViewGroup.MarginLayoutParams) this.f101250h.getLayoutParams()).topMargin <= this.f101247e;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean a(MotionEvent motionEvent) {
        return this.F.onTouch(this.B, motionEvent);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean b(MotionEvent motionEvent) {
        b bVar = this.f101244b;
        return bVar != null ? bVar.a(motionEvent, this.J) || super.b(motionEvent) : super.b(motionEvent);
    }
}
