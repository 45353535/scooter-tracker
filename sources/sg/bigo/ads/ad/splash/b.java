package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.splash.a.c;
import sg.bigo.ads.ad.splash.a.d;
import sg.bigo.ads.ad.splash.a.e;
import sg.bigo.ads.ad.splash.a.g;
import sg.bigo.ads.ad.splash.a.h;
import sg.bigo.ads.ad.splash.a.j;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends sg.bigo.ads.ad.c<SplashAd, sg.bigo.ads.core.a.a> implements SplashAd {
    boolean A;

    @NonNull
    final c B;

    @Nullable
    public final m C;
    public final f D;
    private h E;
    private sg.bigo.ads.ad.splash.a.a F;
    private long G;

    @NonNull
    private final m H;
    private ViewGroup I;
    private AdCountDownButton J;
    private n K;
    private Runnable L;
    private Runnable M;
    private Runnable N;
    private Runnable O;
    private n P;
    private long Q;
    private long R;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g f102046y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f102047z;

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, f fVar, @NonNull m mVar, @Nullable m mVar2) {
        super(fVar);
        this.A = false;
        this.Q = 0L;
        this.R = 0L;
        this.H = mVar;
        this.C = mVar2;
        this.D = fVar;
        a((sg.bigo.ads.api.b.a) bVar);
        this.f102047z = bVar;
        c cVar = new c() { // from class: sg.bigo.ads.ad.splash.b.1
            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.AdInteractionListener
            public final void onAdClicked() {
                super.onAdClicked();
                if (b.this.E != null) {
                    b.this.E.b();
                }
            }

            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.SplashAdInteractionListener
            public final void onAdFinished() {
                super.onAdFinished();
            }

            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.AdInteractionListener
            public final void onAdImpression() {
                super.onAdImpression();
                b.this.G = SystemClock.elapsedRealtime();
                if (b.this.E != null) {
                    b.this.E.a();
                }
                b.this.A();
            }
        };
        this.B = cVar;
        bVar.setAdInteractionListener(cVar);
        int iAs = fVar.f102174a.as();
        int iA = mVar2 != null ? mVar2.a("video_play_page.interactive_method", 0) : 0;
        if (1 == iAs && iA != 0) {
            this.E = new d(fVar, mVar, mVar2, this);
            return;
        }
        if (mVar2 == null || a.b(mVar) || a.b()) {
            this.E = new sg.bigo.ads.ad.splash.a.b(fVar, mVar, mVar2, this);
            return;
        }
        int iA2 = mVar2.a("video_play_page.ad_component_layout");
        if (iA2 == 3) {
            this.E = new e(fVar, mVar, mVar2, this);
        } else if (iA2 == 4 || iA2 == 5) {
            this.E = new sg.bigo.ads.ad.splash.a.f(iA2, fVar, mVar, mVar2, this);
        } else {
            this.E = new sg.bigo.ads.ad.splash.a.b(fVar, mVar, mVar2, this);
        }
    }

    private boolean I() {
        return f().aS() && S();
    }

    private void J() {
        ViewGroup viewGroup;
        if (this.C == null || !F()) {
            return;
        }
        if (this.F == null && (viewGroup = this.I) != null) {
            this.F = new sg.bigo.ads.ad.splash.a.a(viewGroup, this, this.C);
        }
        int iA = this.C.a("endpage.endpage_timing", 0);
        if (iA >= 3) {
            int i10 = iA == 4 ? 5000 : iA == 5 ? 10000 : 3000;
            if (this.P == null && !K()) {
                this.P = new n(i10) { // from class: sg.bigo.ads.ad.splash.b.10
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        b bVar = b.this;
                        if (bVar.f100342i || bVar.K()) {
                            return;
                        }
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.this.a(8, 12);
                            }
                        });
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j10) {
                    }
                };
            }
            this.P.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        sg.bigo.ads.ad.splash.a.a aVar = this.F;
        return aVar != null && aVar.f101905c == c.a.f101954b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        g gVar = this.f102046y;
        if (gVar != null) {
            gVar.a(this.O);
            sg.bigo.ads.common.n.d.a(this.N);
            this.f102046y.c();
            this.f102046y = null;
            this.O = null;
            this.N = null;
        }
    }

    private void M() {
        int iA;
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton == null) {
            return;
        }
        adCountDownButton.e();
        m mVar = this.C;
        if (mVar == null || (iA = mVar.a("endpage.close_click_seconds", 0)) <= 0) {
            return;
        }
        this.J.clearAnimation();
        this.J.setVisibility(4);
        if (this.M == null) {
            this.M = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.D() || b.this.J.getVisibility() == 0) {
                        return;
                    }
                    b.this.J.setVisibility(0);
                    sg.bigo.ads.ad.interstitial.c.b((View) b.this.J);
                }
            };
        }
        sg.bigo.ads.common.n.d.a(2, this.M, ((long) iA) * 1000);
    }

    private boolean N() {
        m mVar = this.C;
        return (mVar == null || 1 != mVar.a("video_play_page.is_auto_close", 0) || S()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S() {
        m mVar = this.C;
        return mVar != null && 6 == mVar.a("video_play_page.ad_component_layout", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        m mVar;
        return F() && (mVar = this.C) != null && 2 == mVar.a("endpage.ad_component_layout", 1);
    }

    public final void A() {
        m mVar;
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton == null) {
            this.A = true;
            this.B.onAdFinished();
            return;
        }
        adCountDownButton.setVisibility(0);
        m mVar2 = this.C;
        a.a(this.J, mVar2 == null ? 1 : mVar2.a("video_play_page.close_button_style"));
        int iMax = Math.max(0, this.H.a("splash_duration"));
        h hVar = this.E;
        if (hVar != null && hVar.i().get() && f().bh() == null && (mVar = this.C) != null) {
            iMax = w.b(mVar.a("video_play_page.time_for_show_backup", -1));
        }
        this.K = new n(((long) iMax) * 1000) { // from class: sg.bigo.ads.ad.splash.b.5
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                if (b.this.J.f100519c) {
                    if (b.this.F() || !b.this.D()) {
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (b.this.E != null) {
                                    b.this.E.j();
                                }
                            }
                        });
                    }
                    b.this.J.e();
                }
                b bVar = b.this;
                bVar.A = true;
                bVar.B.onAdFinished();
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                b.this.J.a(j10);
            }
        };
        int iMax2 = Math.max(0, this.H.a("splash_close"));
        this.J.setWithUnit(true);
        this.J.setTakeoverTickEvent(true);
        this.J.setOnCloseListener(new AdCountDownButton.a() { // from class: sg.bigo.ads.ad.splash.b.6
            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
            public final void a() {
                if (b.this.C == null) {
                    b.this.c(8);
                } else if (b.this.F()) {
                    b.this.a(b.this.T() ? 1 == ((sg.bigo.ads.core.a.a) b.this.f102047z.f()).ad() ? 4 : 5 : 2, 2);
                } else {
                    b.this.c(8);
                }
            }

            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
            public final void a(Rect rect) {
            }
        });
        h hVar2 = this.E;
        if (hVar2 != null && hVar2.i().get() && f().bh() == null) {
            this.J.g();
        } else {
            this.J.a(iMax2, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.splash.b.7
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    b.this.A = true;
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.7.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (b.this.E != null) {
                                b.this.E.j();
                            }
                        }
                    });
                }
            });
        }
        this.K.c();
        final ViewTreeObserver viewTreeObserver = this.J.getViewTreeObserver();
        final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.ad.splash.b.8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                b bVar = b.this;
                if (bVar.f102047z.f100342i) {
                    return;
                }
                boolean zIsAttachedToWindow = bVar.J.isAttachedToWindow();
                if (z10 && zIsAttachedToWindow) {
                    b.a(b.this, true);
                    b.this.C();
                } else {
                    b.a(b.this, false);
                    b.this.B();
                }
            }
        };
        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        this.L = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
                } catch (Throwable unused) {
                }
            }
        };
    }

    public final void B() {
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.b();
        }
        n nVar = this.K;
        if (nVar != null && !nVar.e()) {
            this.K.d();
            this.Q += SystemClock.elapsedRealtime() - this.R;
        }
        if (this.f102047z.getVideoController() == null || !this.f102047z.getVideoController().isPlaying()) {
            return;
        }
        this.f102047z.getVideoController().pause();
    }

    public final void C() {
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.c();
        }
        n nVar = this.K;
        if (nVar != null && nVar.e()) {
            this.K.c();
        }
        if (this.f102047z.getVideoController() != null && this.f102047z.getVideoController().isPaused()) {
            this.f102047z.getVideoController().play();
        }
        this.R = SystemClock.elapsedRealtime();
    }

    public final boolean D() {
        ViewGroup viewGroup;
        if (!N() || (viewGroup = this.I) == null || !(viewGroup.getContext() instanceof AdSplashActivity)) {
            return false;
        }
        c(9);
        return true;
    }

    public final boolean F() {
        m mVar;
        if (a.b() || (mVar = this.C) == null || mVar.a("endpage.endpage_timing", 0) <= 0) {
            return false;
        }
        return !N() || this.C.a("endpage.close_click_seconds", 0) > 0;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    @NonNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.core.a.a f() {
        return (sg.bigo.ads.core.a.a) this.f102047z.f();
    }

    public final void H() {
        sg.bigo.ads.ad.interstitial.a.b bVar;
        g gVar = this.f102046y;
        if (gVar == null || gVar.f101989a != c.a.f101954b) {
            this.f102047z.a((i) null, 8, 22);
            return;
        }
        Context context = this.f100335b.f102178e;
        if (gVar.f101994f && (bVar = gVar.f101990b) != null) {
            bVar.f100659f.a(context, null, null);
            return;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = gVar.f101991c;
        if (aVar != null) {
            sg.bigo.ads.ad.interstitial.a.b.a aVar2 = aVar.f100587b;
            if (aVar2 instanceof sg.bigo.ads.ad.interstitial.a.a.b) {
                ((sg.bigo.ads.ad.interstitial.a.a.b) aVar2).a(context, null, null);
            } else if (aVar2 instanceof sg.bigo.ads.ad.interstitial.a.a.c) {
                ((sg.bigo.ads.ad.interstitial.a.a.c) aVar2).a(context, (i) null);
            }
        }
    }

    @Override // sg.bigo.ads.ad.c
    @NonNull
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        return (ValueType) this.f102047z.b(str, valuetype);
    }

    @Override // sg.bigo.ads.api.b.a
    public final o b_() {
        sg.bigo.ads.ad.b.b bVar = this.f102047z;
        return bVar != null ? bVar.b_() : this.f102140ac;
    }

    @Override // sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        a.f101875b = false;
        a.f101874a = false;
        super.destroyInMainThread();
        this.f102047z.destroy();
        n nVar = this.P;
        if (nVar != null) {
            nVar.b();
            this.P = null;
        }
        Runnable runnable = this.L;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.b(runnable);
            this.L = null;
        }
        Runnable runnable2 = this.M;
        if (runnable2 != null) {
            sg.bigo.ads.common.n.d.a(runnable2);
            this.M = null;
        }
        h hVar = this.E;
        if (hVar != null) {
            hVar.c();
            this.E = null;
        }
        sg.bigo.ads.ad.splash.a.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
            this.F = null;
        }
        a.a();
        L();
        this.I = null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        return this.f102047z.getCreativeId();
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        return null;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final SplashAd.Style getStyle() {
        return a.c(this.H);
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        return false;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final boolean isSkippable() {
        return this.A || isExpired() || this.f100342i;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void setAdInteractionListener(SplashAdInteractionListener splashAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) splashAdInteractionListener);
        this.B.f102076b = splashAdInteractionListener;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show() {
        a((Activity) null, true);
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void showInAdContainer(@NonNull ViewGroup viewGroup) {
        this.f102047z.c(2);
        a(viewGroup);
    }

    @Override // sg.bigo.ads.ad.c
    public final sg.bigo.ads.controller.landing.c y() {
        sg.bigo.ads.ad.b.b bVar = this.f102047z;
        return bVar != null ? bVar.y() : super.y();
    }

    public final void c(int i10) {
        this.B.onAdSkipped();
        if (this.D != null) {
            this.Q += SystemClock.elapsedRealtime() - this.R;
            sg.bigo.ads.core.d.b.a(this.D.f102174a, i10, this.G > 0 ? SystemClock.elapsedRealtime() - this.G : 0L, this.Q, this);
        }
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show(Activity activity) {
        a(activity, false);
    }

    private void b(@NonNull final ViewGroup viewGroup) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setTag("adview_background_main_tag");
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        u.a(imageView, viewGroup, null, 0);
        m mVar = this.C;
        if (mVar != null && 5 != mVar.a("video_play_page.background_colour")) {
            a.a(this.C.a("video_play_page.background_colour"), this.f102047z, viewGroup);
            return;
        }
        v vVar = new v() { // from class: sg.bigo.ads.ad.splash.b.3
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                final Bitmap bitmap = sg.bigo.ads.ad.splash.a.b.f101916j;
                if (b.this.f100342i || bitmap == null) {
                    return;
                }
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ImageView imageView2;
                        View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                        if (viewFindViewWithTag instanceof ImageView) {
                            imageView2 = (ImageView) viewFindViewWithTag;
                        } else {
                            Context context = viewGroup.getContext();
                            if (context != null) {
                                ImageView imageView3 = new ImageView(context);
                                imageView3.setTag("adview_background_main_tag");
                                imageView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                u.a(imageView3, viewGroup, null, 0);
                                imageView2 = imageView3;
                            } else {
                                imageView2 = null;
                            }
                        }
                        if (imageView2 != null) {
                            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            sg.bigo.ads.common.utils.d.a(imageView2.getContext(), bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.b.3.1.1
                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                                    Bitmap bitmap3 = bitmap2;
                                    if (bitmap3 != null) {
                                        imageView2.setImageBitmap(bitmap3);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(vVar);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10) {
        super.a(i10);
        this.f102047z.a(i10);
    }

    public final void a(int i10, int i11) {
        g gVar;
        g gVar2;
        final ViewGroup viewGroup = this.I;
        h hVar = this.E;
        if (hVar == null || viewGroup == null) {
            return;
        }
        if (this.F != null && hVar.d() == c.a.f101954b) {
            this.E.a(false, viewGroup, -1);
        }
        if (T() && (gVar2 = this.f102046y) != null && gVar2.e()) {
            g gVar3 = this.f102046y;
            if (!gVar3.f101992d) {
                gVar3.f101993e = 2;
                gVar3.a(true, viewGroup, i11);
                M();
                return;
            }
        }
        sg.bigo.ads.ad.splash.a.a aVar = this.F;
        if (aVar == null || aVar.f101905c != c.a.f101955c || ((gVar = this.f102046y) != null && gVar.f101993e == 2)) {
            c(i10);
            return;
        }
        aVar.a(true, viewGroup, i11);
        M();
        if (this.f102046y == null || !sg.bigo.ads.api.a.i.f102116a.p().a()) {
            L();
            return;
        }
        g gVar4 = this.f102046y;
        Runnable runnable = this.O;
        if (runnable == null) {
            runnable = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.11
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    if (bVar.f100342i) {
                        return;
                    }
                    sg.bigo.ads.common.n.d.a(bVar.N);
                    if (b.this.f102046y != null) {
                        b.this.f102046y.a(this);
                    }
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.11.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                            b.a(b.this, viewGroup);
                        }
                    });
                }
            };
            this.O = runnable;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar = gVar4.f101990b;
        if (bVar != null) {
            bVar.f100656c = runnable;
        }
        int iB = sg.bigo.ads.api.a.i.f102116a.p().b();
        if (iB > 0) {
            Runnable runnable2 = this.N;
            if (runnable2 == null) {
                runnable2 = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar2 = b.this;
                        if (bVar2.f100342i) {
                            return;
                        }
                        bVar2.L();
                        b.a(b.this, viewGroup);
                    }
                };
                this.N = runnable2;
            }
            sg.bigo.ads.common.n.d.a(2, runnable2, ((long) iB) * 1000);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.app.Activity] */
    private void a(Activity activity, boolean z10) {
        sg.bigo.ads.api.a.h hVar;
        if (I()) {
            this.E = new j(this.D, this.H, this.C, this);
        }
        a(activity == 0, z10);
        if (activity != 0) {
            this.f102047z.b(activity);
        }
        this.f102047z.c(1);
        this.f102047z.a(true);
        sg.bigo.ads.core.d.b.a(f());
        if (activity != 0) {
            a(1);
        }
        if (activity == 0 && (hVar = sg.bigo.ads.api.a.i.f102116a) != null && hVar.n().a(16)) {
            activity = sg.bigo.ads.common.f.b.b();
            a(2);
        }
        if (activity == 0) {
            activity = this.f100335b.f102178e;
        }
        if (activity != 0) {
            int iA = this.Y.a();
            this.Z = iA;
            sg.bigo.ads.api.b.a aVar = this.f102138aa;
            if (aVar != null) {
                aVar.g(iA);
            }
            AdSplashActivity.a(activity, this);
        }
    }

    protected final void a(@NonNull ViewGroup viewGroup) {
        g gVar;
        String str;
        if (this.E != null) {
            f fVar = this.D;
            if (fVar != null) {
                sg.bigo.ads.core.d.b.a(fVar.f102174a, this);
            }
            if (isExpired()) {
                str = "The ad is expired.";
            } else {
                if (!this.f100342i) {
                    ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_style_root, null, false);
                    u.a(viewGroup2, viewGroup, new ViewGroup.LayoutParams(-1, -1), -1);
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.bigo_ad_splash_ad_container);
                    this.I = viewGroup3;
                    this.J = (AdCountDownButton) viewGroup2.findViewById(R.id.bigo_ad_splash_btn_skip);
                    b(viewGroup3);
                    if (S() && (gVar = this.f102046y) != null && gVar.e()) {
                        g gVar2 = this.f102046y;
                        gVar2.f101993e = 1;
                        gVar2.a(true, viewGroup3, 11);
                    } else {
                        this.E.a(true, viewGroup3, -1);
                    }
                    J();
                    return;
                }
                str = "The ad is destroyed.";
            }
            b(2000, 1, str);
        }
    }

    static /* synthetic */ void a(b bVar, ViewGroup viewGroup) {
        g gVar;
        View viewFindViewById;
        sg.bigo.ads.ad.splash.a.a aVar = bVar.F;
        if (aVar != null && (viewFindViewById = aVar.f101904b.findViewById(R.id.layout_playable_loading)) != null && viewFindViewById.getVisibility() == 0) {
            viewFindViewById.setVisibility(4);
        }
        if (!bVar.T() || (gVar = bVar.f102046y) == null || !gVar.e() || bVar.f102046y.f101992d) {
            return;
        }
        sg.bigo.ads.ad.splash.a.a aVar2 = bVar.F;
        if (aVar2 != null) {
            aVar2.a(false, viewGroup, -1);
        }
        g gVar2 = bVar.f102046y;
        gVar2.f101993e = 2;
        gVar2.a(true, viewGroup, 14);
    }

    static /* synthetic */ void a(b bVar, boolean z10) {
        h hVar = bVar.E;
        if (hVar != null) {
            hVar.a(z10);
        }
        sg.bigo.ads.ad.splash.a.a aVar = bVar.F;
        if (aVar != null) {
            aVar.a(z10);
        }
        g gVar = bVar.f102046y;
        if (gVar != null) {
            gVar.a(z10);
        }
        if (!z10) {
            n nVar = bVar.P;
            if (nVar != null) {
                nVar.d();
                return;
            }
            return;
        }
        n nVar2 = bVar.P;
        if (nVar2 == null || !nVar2.e()) {
            return;
        }
        bVar.P.c();
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(@NonNull final d.a<SplashAd> aVar) {
        super.a(aVar);
        m mVar = this.C;
        if (mVar != null && mVar.a("video_play_page.background_colour") == 4) {
            this.f102047z.b(true);
        }
        this.f102047z.a(new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.splash.b.4
            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2) {
                b bVar = b.this;
                if (bVar.f100338e || bVar.f100339f) {
                    return;
                }
                aVar.a(bVar);
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.splash.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if ((b.this.S() || b.this.T()) && b.this.f102046y == null) {
                            b bVar2 = b.this;
                            m unused = bVar2.H;
                            m unused2 = b.this.C;
                            b bVar3 = b.this;
                            bVar2.f102046y = new g(bVar3, bVar3.D.f102175b, b.this.D.f102174a);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                b bVar = b.this;
                if (bVar.f100338e || bVar.f100339f) {
                    return;
                }
                if (i10 == 1006) {
                    sg.bigo.ads.controller.c.a.a(bVar.D == null ? "" : b.this.D.f102175b.l());
                }
                aVar.a(b.this, i10, i11, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                NativeAd nativeAd = (NativeAd) ad2;
                b bVar = b.this;
                if (bVar.f100338e || bVar.f100339f || !(nativeAd instanceof sg.bigo.ads.ad.b.c)) {
                    return;
                }
                if (((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.b.c) nativeAd).f()).bh() != null || z10) {
                    aVar.a(b.this);
                } else {
                    aVar.a(b.this, i10, i11, str);
                }
            }
        });
    }

    @Override // sg.bigo.ads.ad.c
    public final void a(sg.bigo.ads.controller.landing.c cVar) {
        super.a(cVar);
        sg.bigo.ads.ad.b.b bVar = this.f102047z;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        this.f102047z.a(z10, z11);
    }
}
