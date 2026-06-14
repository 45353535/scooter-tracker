package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.taurusx.tax.ui.CircularProgressBar;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.e;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class x extends a {
    protected boolean G;
    public boolean H;
    private boolean I;
    private final AtomicBoolean J;
    private sg.bigo.ads.ad.interstitial.c.a K;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.x$1, reason: invalid class name */
    final class AnonymousClass1 extends sg.bigo.ads.common.utils.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f101816a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j10, View view) {
            super(j10, 1000L);
            this.f101816a = view;
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a() {
            x xVar = x.this;
            xVar.a(xVar.f100560u, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.x.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1.this.f101816a.setVisibility(0);
                    c.a(AnonymousClass1.this.f101816a, new b.d() { // from class: sg.bigo.ads.ad.interstitial.x.1.1.1
                        @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (x.this.E == null || anonymousClass1.f101816a.getTop() <= 0 || x.this.E.getBottom() <= AnonymousClass1.this.f101816a.getTop() || !(x.this.E.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                                return;
                            }
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) x.this.E.getLayoutParams();
                            layoutParams.addRule(8, 0);
                            layoutParams.addRule(2, R.id.inter_ad_info);
                            x.this.E.setLayoutParams(layoutParams);
                        }
                    });
                    x.this.G();
                    x.this.ar();
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a(long j10) {
        }
    }

    protected x(@NonNull Activity activity) {
        super(activity);
        this.I = false;
        this.G = true;
        this.J = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ar() {
        final View viewFindViewById;
        sg.bigo.ads.api.a.m mVar;
        if ((aj() instanceof sg.bigo.ads.ad.interstitial.d.a) || (viewFindViewById = this.D.findViewById(R.id.inter_btn_cta_layout)) == null) {
            return;
        }
        boolean z10 = this.f100543d;
        if (!z10 || (mVar = ((a) this).f100542c) == null) {
            if (z10) {
                return;
            }
            this.f100550k.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.x.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) x.this.f101384y)) {
                        return;
                    }
                    c.e(viewFindViewById);
                }
            }, ((long) ((a) this).f100541b.a("interstitial_image_style.main_page.cta_impression")) * 1000);
        } else if (mVar.c("video_play_page.is_cta_show_animation")) {
            c.e(viewFindViewById);
        }
    }

    private boolean as() {
        boolean zC = C();
        if (zC) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) this.f101384y).f(), 9, 2);
        }
        return zC;
    }

    private void at() {
        aj().a();
        sg.bigo.ads.common.utils.n nVar = this.f100560u;
        if (nVar != null) {
            nVar.b();
        }
        if (this.J.get()) {
            c(this.f100560u, aj());
        }
    }

    private void au() {
        if (this.D == null) {
            return;
        }
        aj().f();
        View viewFindViewById = this.D.findViewById(R.id.inter_media_container);
        if (viewFindViewById != null) {
            c.c(viewFindViewById);
            MediaView mediaView = (MediaView) viewFindViewById.findViewById(R.id.inter_media);
            if (mediaView != null) {
                mediaView.c();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected void A() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.A.setVisibility(0);
            c.b((View) this.A);
        }
        if (e_() == 0) {
            this.A.a(this.f100547h.f101803c, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.interstitial.x.6
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    p pVar = x.this.f100557r;
                    if (pVar != null) {
                        pVar.f101589y.a(null);
                    }
                    x.b(x.this);
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void E() {
        this.f100544e = true;
        super.E();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected void J() {
        long jA;
        int i10 = this.f100547h.f101810j;
        sg.bigo.ads.api.a.m mVar = ((a) this).f100542c;
        int iA = mVar != null ? mVar.a("video_play_page.auto_click_sec") : 0;
        if (i10 == 2) {
            jA = sg.bigo.ads.common.utils.r.f102828a.a(5);
        } else if (i10 == 4) {
            jA = sg.bigo.ads.common.utils.r.f102828a.a(iA);
        } else if (i10 != 5) {
            return;
        } else {
            jA = sg.bigo.ads.common.utils.r.f102828a.a(Math.max(this.f100547h.f101803c - iA, 0));
        }
        if (jA >= 0) {
            if (jA == 0) {
                jA = 500;
            }
            this.f100562w = new sg.bigo.ads.common.utils.n(jA) { // from class: sg.bigo.ads.ad.interstitial.x.3
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    x xVar = x.this;
                    if (xVar.H || xVar.f100544e) {
                        return;
                    }
                    xVar.f100544e = true;
                    ((s) xVar.f101384y).H().a((sg.bigo.ads.common.i) null, 8, 22);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected int Y() {
        if (!this.f100543d) {
            int iA = ((a) this).f100541b.a("interstitial_image_style.image_format");
            return iA == 1 ? R.layout.bigo_ad_activity_interstitial_native_top : iA == 2 ? R.layout.bigo_ad_activity_interstitial_bottom_card : R.layout.bigo_ad_activity_interstitial_native_center;
        }
        int iN = n();
        if (aH()) {
            return iN != 1 ? iN != 3 ? iN != 4 ? iN != 5 ? R.layout.bigo_ad_activity_interstitial_style_landscape_2 : R.layout.bigo_ad_activity_interstitial_percent_warning_landscape : R.layout.bigo_ad_activity_interstitial_style_landscape_4 : R.layout.bigo_ad_activity_interstitial_style_landscape_3 : R.layout.bigo_ad_activity_interstitial_style_landscape_1;
        }
        switch (iN) {
            case 2:
                return R.layout.bigo_ad_activity_interstitial_rich_video_2;
            case 3:
                return R.layout.bigo_ad_activity_interstitial_rich_video_3;
            case 4:
                return R.layout.bigo_ad_activity_interstitial_rich_video_4;
            case 5:
                return R.layout.bigo_ad_activity_interstitial_rich_video_5;
            case 6:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_6;
            case 7:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_7;
            case 8:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_8;
            case 9:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_9;
            case 10:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_10;
            case 11:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_11;
            case 12:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_12;
            case 13:
            case 18:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_13;
            case 14:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_14;
            case 15:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_15;
            case 16:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_16;
            case 17:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_17;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return R.layout.bigo_ad_activity_interstitial_rich_video_19_29;
            case 30:
                return R.layout.bigo_ad_activity_interstitial_percent_warning;
            case 31:
            case 32:
                return r.a(r.a(this.C), iN);
            default:
                return R.layout.bigo_ad_activity_interstitial_rich_video;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final boolean Z() {
        return this.f100543d;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public final void a_(int i10) {
        super.a_(i10);
        this.H = true;
        sg.bigo.ads.common.utils.n nVar = this.f100562w;
        if (nVar != null) {
            nVar.b();
            this.f100562w = null;
        }
        if (e_() == 0 && i10 == 0 && j() && !k()) {
            aj().f101103b = new e.a() { // from class: sg.bigo.ads.ad.interstitial.x.7
                @Override // sg.bigo.ads.ad.interstitial.e.a
                public final boolean a(Runnable runnable) {
                    x xVar = x.this;
                    return xVar.a(xVar.aj(), runnable);
                }
            };
            p pVar = this.f100557r;
            if (pVar != null) {
                pVar.C = new p.c() { // from class: sg.bigo.ads.ad.interstitial.x.8
                    @Override // sg.bigo.ads.ad.interstitial.p.c
                    public final boolean a(Runnable runnable) {
                        x xVar = x.this;
                        return xVar.a(xVar.f100557r, runnable);
                    }
                };
            }
            this.J.set(true);
            a(this.f100560u, aj(), this.f100557r);
        }
    }

    protected void ao() {
        MediaView mediaView;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        if (!this.G) {
            mediaView.setMediaAreaClickable(false);
        }
        if (mediaView instanceof MaximumHeightMediaView) {
            ((MaximumHeightMediaView) mediaView).setMaxHeight(sg.bigo.ads.common.utils.e.c(this.L) - sg.bigo.ads.common.utils.e.a(this.L, 292));
        }
        K();
    }

    public final boolean ap() {
        if (this.K == null || this.D == null) {
            return false;
        }
        au();
        this.K.a(this, this.D, ai());
        f(11);
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) this.f101384y).f(), 11, 2);
        return true;
    }

    protected boolean aq() {
        return this.f100547h.f101810j == 3;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    protected w b() {
        w wVar = new w();
        sg.bigo.ads.api.a.m mVar = ((a) this).f100542c;
        if (mVar == null) {
            this.f100543d = false;
            wVar.f101801a = ((a) this).f100541b.c("interstitial_image_style.main_page.is_global_click");
            wVar.f101802b = ((a) this).f100541b.a("interstitial_image_style.main_page.impression_close_seconds");
            wVar.f101803c = ((a) this).f100541b.a("interstitial_image_style.main_page.close_click_seconds");
            wVar.f101804d = ((a) this).f100541b.c("interstitial_image_style.main_page.is_jump_layer");
            wVar.f101805e = ((a) this).f100541b.a("interstitial_image_style.layer.impression_layer_close_seconds");
            wVar.f101810j = 1;
            wVar.f101811k = -1;
            return wVar;
        }
        this.f100543d = true;
        boolean zC = mVar.c("video_play_page.media_view_clickable_switch");
        wVar.f101806f = zC;
        this.G = zC;
        wVar.f101808h = ((a) this).f100542c.c("video_play_page.ad_component_clickable_switch");
        wVar.f101807g = ((a) this).f100542c.c("video_play_page.other_space_clickable_switch");
        wVar.f101809i = ((a) this).f100542c.a("video_play_page.click_type");
        wVar.f101812l = ((a) this).f100542c.c("layer.other_space_clickable_switch");
        wVar.f101813m = ((a) this).f100542c.a("layer.click_type");
        wVar.f101801a = false;
        wVar.f101802b = 0;
        wVar.f101803c = ((a) this).f100542c.a("video_play_page.force_staying_time");
        wVar.f101804d = ((a) this).f100542c.c("layer.is_show_layer");
        wVar.f101805e = ((a) this).f100542c.a("layer.force_staying_time");
        wVar.f101810j = ((a) this).f100542c.a("video_play_page.auto_click");
        wVar.f101811k = ((a) this).f100542c.a("video_play_page.auto_click_new", -1);
        if ((this instanceof sg.bigo.ads.ad.interstitial.g.b) && L() && this.C != null && !M()) {
            this.K = sg.bigo.ads.ad.interstitial.c.a.a(this.C, ((a) this).f100542c, ((s) this.f101384y).G(), this.f100558s, aH());
        }
        return wVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public final void d(int i10) {
        super.d(i10);
        if (e_() != 0) {
            at();
        }
        if (this.J.compareAndSet(true, false)) {
            b(this.f100560u, aj(), this.f100557r);
            e();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected boolean f(boolean z10) {
        p pVar;
        int iE_ = e_();
        if (iE_ != 0 && iE_ != 10) {
            return iE_ == 11 ? !as() : z10;
        }
        x();
        b(true);
        if (iE_ != 10 && (pVar = this.f100557r) != null && (pVar.f101589y.a() || this.f100557r.D)) {
            f(10);
            return false;
        }
        if (ap()) {
            return false;
        }
        return z10 && !as();
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void g() {
        super.g();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.common.utils.n nVar = this.f100560u;
        if (nVar != null && nVar.e()) {
            this.f100560u.c();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f100562w;
        if (nVar2 != null && nVar2.e()) {
            this.f100562w.c();
        }
        p pVar = this.f100557r;
        if (pVar != null) {
            pVar.c();
        }
        sg.bigo.ads.ad.interstitial.c.a aVar = this.K;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void i() {
        super.i();
        sg.bigo.ads.common.utils.n nVar = this.f100560u;
        if (nVar != null) {
            nVar.d();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f100562w;
        if (nVar2 != null) {
            nVar2.d();
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.b();
        }
        p pVar = this.f100557r;
        if (pVar != null) {
            pVar.d();
        }
        sg.bigo.ads.ad.interstitial.c.a aVar = this.K;
        if (aVar != null) {
            aVar.c();
        }
    }

    protected void l(int i10) {
        sg.bigo.ads.ad.b.b bVar;
        b.d popPage;
        sg.bigo.ads.api.a.m mVar;
        String str;
        RoundedFrameLayout roundedFrameLayout;
        if (v() || P()) {
            ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.inter_media_layout);
            TextView textView = (TextView) this.D.findViewById(R.id.inter_company);
            if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a) && this.f100546g && textView != null && (bVar = this.C) != null && (popPage = bVar.getPopPage()) != null && sg.bigo.ads.common.utils.q.a((CharSequence) popPage.f())) {
                String title = this.C.getTitle();
                if (sg.bigo.ads.common.utils.q.a((CharSequence) title)) {
                    textView.setText(R.string.bigo_ad_title_default);
                } else {
                    textView.setText(title);
                }
                textView.setVisibility(0);
            }
            if (viewGroup != null) {
                K();
                if (this.f100545f) {
                    int iA = this.L.getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.e.a(this.L, 80);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.width = iA;
                    layoutParams.height = iA;
                    viewGroup.setLayoutParams(layoutParams);
                }
                b(viewGroup);
            }
        }
        e(i10);
        View viewFindViewById = this.D.findViewById(R.id.inter_ad_info);
        if (viewFindViewById != null) {
            int i11 = p().f101341a;
            if (i11 > 0) {
                Context context = viewFindViewById.getContext();
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(context, 10);
                    marginLayoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(context, 10);
                    marginLayoutParams.bottomMargin = sg.bigo.ads.common.utils.e.a(context, i11);
                }
                View viewFindViewById2 = this.D.findViewById(R.id.inter_ad_info_background);
                if (viewFindViewById2 != null) {
                    if (viewFindViewById2 instanceof RoundedFrameLayout) {
                        roundedFrameLayout = (RoundedFrameLayout) viewFindViewById2;
                        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 16));
                    }
                } else if (viewFindViewById instanceof RoundedFrameLayout) {
                    roundedFrameLayout = (RoundedFrameLayout) viewFindViewById;
                    roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 16));
                }
            }
            if (v() || P()) {
                ar();
                return;
            }
            if (this.f100543d) {
                mVar = ((a) this).f100542c;
                str = "video_play_page.ad_component_show_time";
            } else {
                mVar = ((a) this).f100541b;
                str = "interstitial_video_style.video_play_page.impression_ad_seconds";
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(((long) mVar.a(str)) * 1000, viewFindViewById);
            this.f100560u = anonymousClass1;
            anonymousClass1.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected void z() {
        super.z();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.A.setTakeoverTickEvent(false);
        }
    }

    static /* synthetic */ void a(x xVar, ViewGroup viewGroup) {
        final MediaView mediaView;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.x.5
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) x.this.f101384y)) {
                    return;
                }
                final MediaView mediaView2 = mediaView;
                View image = mediaView2.getImage();
                final float fB = mediaView2.b(mediaView2.getHeight(), mediaView2.getWidth());
                AnimationSet animationSet = new AnimationSet(true);
                float f10 = fB * 1.5f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f10, 1.0f, f10, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(500L);
                scaleAnimation.setStartOffset(300L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(3));
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setStartOffset(300L);
                animationSet.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(alphaAnimation);
                animationSet.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.13

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ float f100698b;

                    AnonymousClass13(final float fB2) {
                        f = fB2;
                    }

                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        MediaView mediaView3 = mediaView;
                        float f11 = f;
                        View image2 = mediaView3.getImage();
                        AnimationSet animationSet2 = new AnimationSet(true);
                        float f12 = f11 * 1.5f;
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(f12, 1.0f, f12, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation2.setDuration(CircularProgressBar.E);
                        scaleAnimation2.setInterpolator(sg.bigo.ads.common.utils.b.a(3));
                        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.5f, 1.0f);
                        alphaAnimation2.setDuration(CircularProgressBar.E);
                        animationSet2.addAnimation(scaleAnimation2);
                        animationSet2.addAnimation(alphaAnimation2);
                        if (image2 != null) {
                            image2.startAnimation(animationSet2);
                        }
                    }
                });
                if (image != null) {
                    image.startAnimation(animationSet);
                }
            }
        }, 100L);
    }

    private void b(final ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.x.4
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = x.this;
                if (!xVar.f100543d || ((a) xVar).f100542c == null || sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) xVar.f101384y) || !((a) x.this).f100542c.c("video_play_page.img_animation")) {
                    return;
                }
                x.a(x.this, viewGroup);
            }
        }, 100L);
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void g(@LayoutRes int i10) {
        ViewGroup viewGroupK;
        super.g(i10);
        if (this.D == null) {
            return;
        }
        a(false);
        t tVarAj = aj();
        if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.a) {
            if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.m) {
                sg.bigo.ads.ad.interstitial.d.m mVar = (sg.bigo.ads.ad.interstitial.d.m) tVarAj;
                if (!mVar.C()) {
                    return;
                } else {
                    viewGroupK = mVar.k();
                }
            } else {
                viewGroupK = ((sg.bigo.ads.ad.interstitial.d.a) tVarAj).k();
            }
            b(viewGroupK);
            return;
        }
        ao();
        l(i10);
        sg.bigo.ads.common.utils.n nVar = this.f100561v;
        if (nVar != null) {
            nVar.c();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f100562w;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    static /* synthetic */ void b(x xVar) {
        if (!xVar.aq() || xVar.H || xVar.f100544e) {
            return;
        }
        xVar.f100544e = true;
        ((s) xVar.f101384y).H().a((sg.bigo.ads.common.i) null, 8, 22);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected final void b(boolean z10) {
        super.b(z10);
        at();
    }
}
