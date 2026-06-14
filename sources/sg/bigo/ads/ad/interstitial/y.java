package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.a.b;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.ad.interstitial.b.a;
import sg.bigo.ads.ad.interstitial.e;
import sg.bigo.ads.ad.interstitial.f.b;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes4.dex */
public class y extends sg.bigo.ads.ad.interstitial.a implements a.InterfaceC1224a, VideoController.a {
    public final sg.bigo.ads.ad.interstitial.b.a G;
    public boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private boolean O;
    private boolean P;
    private Runnable Q;
    private Runnable R;
    private int S;

    @Nullable
    private sg.bigo.ads.ad.interstitial.c.a T;
    private final AtomicBoolean U;
    private boolean V;
    private volatile boolean W;
    private final Runnable X;
    private final b Y;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.y$18, reason: invalid class name */
    final class AnonymousClass18 extends sg.bigo.ads.common.utils.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f101844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass18(long j10, View view) {
            super(j10, 1000L);
            this.f101844a = view;
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a() {
            y yVar = y.this;
            yVar.a(yVar.f100560u, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.18.1
                @Override // java.lang.Runnable
                public final void run() {
                    y.e(y.this);
                    AnonymousClass18.this.f101844a.setVisibility(0);
                    c.a(AnonymousClass18.this.f101844a, new b.d() { // from class: sg.bigo.ads.ad.interstitial.y.18.1.1
                        @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            AnonymousClass18 anonymousClass18 = AnonymousClass18.this;
                            if (y.this.E == null || anonymousClass18.f101844a.getTop() <= 0 || y.this.E.getBottom() <= AnonymousClass18.this.f101844a.getTop()) {
                                return;
                            }
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) y.this.E.getLayoutParams();
                            layoutParams.addRule(8, 0);
                            layoutParams.addRule(2, R.id.inter_ad_info);
                            y.this.E.setLayoutParams(layoutParams);
                        }
                    });
                    y.this.G();
                    y.this.aL();
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a(long j10) {
        }
    }

    class a implements sg.bigo.ads.ad.banner.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f101866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f101867c = 9;

        public a(int i10) {
            this.f101866b = i10;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            if (y.this.e_() == 5 || y.this.e_() == 1 || y.this.e_() == 7 || y.this.e_() == 8) {
                y.this.e(true);
            }
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(String str) {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
            ((s) y.this.f101384y).H().a(iVar, this.f101866b, this.f101867c, dVar);
        }
    }

    final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<View> f101869b;

        private b() {
            this.f101869b = new ArrayList();
        }

        @MainThread
        final void a() {
            if (y.this.D != null) {
                Iterator<View> it = this.f101869b.iterator();
                while (it.hasNext()) {
                    y.this.D.removeView(it.next());
                }
            }
        }

        /* synthetic */ b(y yVar, byte b10) {
            this();
        }

        @MainThread
        final void a(View view) {
            this.f101869b.add(view);
        }
    }

    protected y(@NonNull Activity activity) {
        super(activity);
        this.I = false;
        this.J = true;
        this.K = 1;
        this.O = false;
        this.P = false;
        this.S = 9;
        this.G = new sg.bigo.ads.ad.interstitial.b.a();
        this.U = new AtomicBoolean(false);
        this.V = true;
        this.X = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.11
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) y.this.f101384y)) {
                    return;
                }
                y.this.m(5);
                y.k(y.this);
            }
        };
        this.Y = new b(this, (byte) 0);
    }

    private void aI() {
        sg.bigo.ads.ad.interstitial.a.a aVarAs;
        if (this.f101384y == 0 || !aJ() || (aVarAs = as()) == null) {
            return;
        }
        aVarAs.a(new a(15));
        aVarAs.a(new c.a() { // from class: sg.bigo.ads.ad.interstitial.y.21
            @Override // sg.bigo.ads.ad.interstitial.a.b.c.a
            public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
                ((s) y.this.f101384y).H().a(iVar, 15, 9, dVar);
            }
        });
        sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "begin to preload EndPageCompanion resource : ".concat(String.valueOf(aVarAs)));
        aVarAs.a(this.L);
    }

    private boolean aJ() {
        return L() || this.f100555p.get();
    }

    private void aK() {
        aj().a();
        sg.bigo.ads.common.utils.n nVar = this.f100560u;
        if (nVar != null) {
            nVar.b();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f100561v;
        if (nVar2 != null) {
            nVar2.b();
        }
        if (this.U.get()) {
            c(this.f100560u, this.f100561v, aj());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aL() {
        if (aj() instanceof sg.bigo.ads.ad.interstitial.d.a) {
            return;
        }
        boolean z10 = this.O;
        if (!z10 && !this.f100543d && this.K == 1) {
            this.f100550k.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) y.this.f101384y)) {
                        return;
                    }
                    y.this.aM();
                }
            }, ((long) ((sg.bigo.ads.ad.interstitial.a) this).f100541b.a("interstitial_video_style.video_play_page.cta_animation_show_wait_time")) * 1000);
            return;
        }
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        if (mVar == null || z10 || !this.f100543d || !mVar.c("video_play_page.is_cta_show_animation")) {
            return;
        }
        aM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aM() {
        View viewFindViewById;
        if ((aj() instanceof sg.bigo.ads.ad.interstitial.d.a) || this.D == null || e_() != 0 || !this.I || (viewFindViewById = this.D.findViewById(R.id.inter_btn_cta_layout)) == null) {
            return;
        }
        c.e(viewFindViewById);
        this.O = true;
    }

    private void aN() {
        View viewFindViewById;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_layout_end_page)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    private int aO() {
        sg.bigo.ads.api.a.m mVar;
        if (aH()) {
            if (this.f100543d && (mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c) != null) {
                iA = mVar.a("endpage.ad_component_layout");
            }
            return iA != 2 ? R.layout.bigo_ad_activity_interstitial_rich_video_end_landscape : R.layout.bigo_ad_activity_interstitial_rich_video_end_landscape_2;
        }
        if (this.P) {
            return R.layout.bigo_ad_activity_interstitial_rich_video_end;
        }
        iA = this.f100543d ? ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("endpage.ad_component_layout") : 1;
        return iA != 2 ? iA != 3 ? iA != 4 ? R.layout.bigo_ad_activity_interstitial_rich_video_end : R.layout.bigo_ad_activity_interstitial_rich_video_end_4 : R.layout.bigo_ad_activity_interstitial_rich_video_end_3 : R.layout.bigo_ad_activity_interstitial_rich_video_end_2;
    }

    private void aP() {
        View viewFindViewById;
        aj().f();
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        if (this.I) {
            View viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
            if (viewFindViewById2 != null) {
                this.I = false;
                c.a(viewFindViewById2);
            }
            View viewFindViewById3 = this.D.findViewById(R.id.inter_ad_info_new);
            if (viewFindViewById3 != null) {
                this.I = false;
                c.a(viewFindViewById3);
            }
            View viewFindViewById4 = this.D.findViewById(R.id.inter_ad_info_down);
            if (viewFindViewById4 != null) {
                this.I = false;
                c.a(viewFindViewById4);
            }
        }
        if (!this.J || (viewFindViewById = this.D.findViewById(R.id.inter_media_container)) == null) {
            return;
        }
        this.J = false;
        c.c(viewFindViewById);
        MediaView mediaView = (MediaView) viewFindViewById.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.c();
        }
    }

    static /* synthetic */ boolean e(y yVar) {
        yVar.I = true;
        return true;
    }

    static /* synthetic */ int g(y yVar) {
        yVar.S = 8;
        return 8;
    }

    private void k(boolean z10) {
        View viewA;
        int iB;
        TextView textView;
        sg.bigo.ads.api.a.m mVar;
        int i10;
        boolean z11;
        boolean z12 = false;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.inter_layout_playable_loading);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.10
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.api.a.m mVar2;
                String str;
                y yVar = y.this;
                if (yVar.f100543d) {
                    mVar2 = ((sg.bigo.ads.ad.interstitial.a) yVar).f100542c;
                    str = "endpage.close_click_seconds";
                } else {
                    mVar2 = ((sg.bigo.ads.ad.interstitial.a) yVar).f100541b;
                    str = "interstitial_video_style.endpage.impression_close_seconds";
                }
                y.this.a(((long) mVar2.a(str)) * 1000);
                AdCountDownButton adCountDownButton = y.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.e();
                }
            }
        };
        sg.bigo.ads.ad.interstitial.c.a aVar = this.T;
        if (aVar != null) {
            viewA = aVar.a(this, this.D, ai());
            runnable.run();
        } else {
            ViewGroup viewGroup2 = this.D;
            int i11 = R.id.inter_end_page;
            View viewFindViewById2 = viewGroup2.findViewById(i11);
            if (viewFindViewById2 == null) {
                Context context = this.D.getContext();
                int iAO = aO();
                ViewGroup viewGroup3 = this.D;
                sg.bigo.ads.common.utils.a.a(context, iAO, viewGroup3, viewGroup3 != null);
            }
            View viewFindViewById3 = this.D.findViewById(R.id.inter_layout_end_page);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            if (viewFindViewById2 == null) {
                View viewFindViewById4 = this.D.findViewById(i11);
                View viewFindViewById5 = this.D.findViewById(R.id.inter_end_page_image);
                if (viewFindViewById4 != null && viewFindViewById3 != null) {
                    int i12 = this.f100543d ? 9 : 4;
                    t tVarAj = aj();
                    ViewGroup viewGroup4 = this.D;
                    int iAi = ai();
                    sg.bigo.ads.api.a.m mVar2 = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
                    tVarAj.a(viewGroup4, viewFindViewById3, iAi, i12, mVar2 == null ? 0 : mVar2.a("endpage.click_type"), viewFindViewById3);
                    View view = viewFindViewById5 == null ? viewFindViewById4 : viewFindViewById5;
                    View view2 = viewFindViewById5 == null ? viewFindViewById3 : viewFindViewById4;
                    view.setTag(5);
                    view2.setTag(9);
                    a(view, view2);
                    TextView textView2 = (TextView) viewFindViewById4.findViewById(R.id.inter_advertiser);
                    TextView textView3 = (TextView) viewFindViewById4.findViewById(R.id.inter_ad_label);
                    if (TextUtils.isEmpty(this.f100551l)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(this.f100551l);
                        textView3.setText(R.string.bigo_ad_tag);
                    }
                    c.d(viewFindViewById4);
                    View viewFindViewById6 = viewFindViewById4.findViewById(R.id.inter_btn_cta);
                    boolean z13 = !this.f100543d || ((sg.bigo.ads.ad.interstitial.a) this).f100542c.c("endpage.is_cta_show_animation");
                    if (z13 && viewFindViewById6 != null) {
                        if (this.f100543d) {
                            viewFindViewById6.setBackgroundColor(this.f100553n);
                        }
                        c.e(viewFindViewById6);
                    }
                    runnable.run();
                    sg.bigo.ads.ad.interstitial.e.c cVar = this.f100558s;
                    if (cVar != null) {
                        cVar.a((ViewGroup) viewFindViewById3, 1);
                    }
                    if (aH()) {
                        Context context2 = viewFindViewById4.getContext();
                        if (!TextUtils.isEmpty(this.f100551l) && textView3 != null && context2 != null) {
                            textView3.setText(this.f100551l + " · " + context2.getString(R.string.bigo_ad_tag));
                        }
                        View viewFindViewById7 = viewFindViewById4.findViewById(R.id.inter_btn_end_page_cta_layout);
                        if (z13 && viewFindViewById7 != null) {
                            if (viewFindViewById6 != null) {
                                viewFindViewById6.clearAnimation();
                            }
                            c.e(viewFindViewById7);
                        }
                        if (this.f100543d && (textView = (TextView) viewFindViewById4.findViewById(R.id.inter_company)) != null) {
                            textView.setTextColor(this.f100553n);
                        }
                        d dVar = new d();
                        TextView textView4 = (TextView) viewFindViewById4.findViewById(R.id.inter_title);
                        if (textView4 != null) {
                            dVar.b(textView4);
                        }
                        TextView textView5 = (TextView) viewFindViewById4.findViewById(R.id.inter_description);
                        if (textView5 != null) {
                            dVar.b(textView5);
                        }
                        sg.bigo.ads.api.a.m mVar3 = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
                        if (mVar3 != null) {
                            int iA = mVar3.a("video_play_page.background_colour");
                            if (iA == 1) {
                                iB = -1;
                            } else if (iA == 2) {
                                iB = ViewCompat.MEASURED_STATE_MASK;
                            } else if (iA == 4) {
                                iB = this.f100552m;
                            } else if (iA == 5) {
                                aj().a(this.D);
                            } else {
                                iB = sg.bigo.ads.common.utils.q.b("#262E33", -7829368);
                            }
                            dVar.a(iB);
                        }
                        IconListView iconListView = (IconListView) viewFindViewById4.findViewById(R.id.inter_iconlist_download_msg_list);
                        if (this.f100549j != null && iconListView != null) {
                            iconListView.setThemeWhite(dVar.f100904c == d.f100902a);
                            iconListView.a(this.f100549j);
                            iconListView.setVisibility(0);
                        }
                    }
                }
            }
            viewA = viewFindViewById3;
        }
        if (((s) this.f101384y).H().C() != null) {
            ((s) this.f101384y).H().C().bringToFront();
        }
        if (!z10 || viewA == null || (mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c) == null) {
            return;
        }
        int iA2 = this.f100543d ? mVar.a("endpage.below_area_dp") : 0;
        if (this.f100543d && ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("endpage.below_area_clickable") == 1) {
            i10 = iA2;
            z11 = true;
        } else {
            i10 = iA2;
            z11 = false;
        }
        int iA3 = this.f100543d ? ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("endpage.up_area_dp") : 0;
        if (this.f100543d && ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("endpage.up_area_clickable") == 1) {
            z12 = true;
        }
        a(viewA, i10, z11, iA3, z12, 9, ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("video_play_page.click_type"));
    }

    private int q(int i10) {
        sg.bigo.ads.ad.interstitial.a.a aVarAs;
        sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "try to show end page view.");
        if (!Q() && az() && (aVarAs = as()) != null) {
            if (aVarAs.f100586a && aVarAs.b()) {
                sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "[VastCompanion] companion resource is available and ready.");
                View viewA = aVarAs.a();
                if (viewA != null) {
                    if ((viewA instanceof ViewGroup) && !((sg.bigo.ads.ad.interstitial.a) this).f100541b.c("interstitial_video_style.endpage.is_global_click")) {
                        viewA.setOnClickListener(null);
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "[VastCompanion] show companion end page view.");
                    a(aVarAs, viewA);
                    return 7;
                }
            }
            if (!aVarAs.b()) {
                aVarAs.f();
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "show video end page view.");
        if (!Q() && this.f100555p.get()) {
            r(i10);
            return 1;
        }
        this.P = false;
        k(true);
        return 1;
    }

    private void r(int i10) {
        String str;
        if (androidx.activity.s.a(((s) this.f101384y).f())) {
            sg.bigo.ads.core.a.a aVarF = ((s) this.f101384y).f();
            sg.bigo.ads.common.view.c cVarC = ((s) this.f101384y).H().C();
            if (aVarF.bh() == null || this.D == null) {
                sg.bigo.ads.ad.interstitial.a.b bVarAt = at();
                if (Q() || bVarAt == null || !bVarAt.b()) {
                    this.P = true;
                    k(true);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "video is not ready, endpage show HTML for backup.");
                aVarF.j(3);
                a(i10, bVarAt);
                if (cVarC != null) {
                    cVarC.bringToFront();
                    return;
                }
                return;
            }
            ImageView imageView = new ImageView(this.D.getContext());
            imageView.setImageBitmap((Bitmap) aVarF.bh().first);
            sg.bigo.ads.common.utils.u.a(imageView, this.D, new FrameLayout.LayoutParams(-1, -1, 17), -1);
            imageView.setTag(15);
            this.D.setTag(20);
            a(imageView, this.D);
            sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
            if (mVar != null) {
                str = "endpage.close_click_seconds";
            } else {
                mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100541b;
                str = "interstitial_video_style.endpage.impression_close_seconds";
            }
            a(((long) mVar.a(str)) * 1000);
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            if (cVarC != null) {
                cVarC.bringToFront();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    @Override // sg.bigo.ads.ad.interstitial.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void A() {
        /*
            r7 = this;
            super.A()
            int r0 = r7.e_()
            if (r0 != 0) goto L7e
            sg.bigo.ads.ad.interstitial.b.a r2 = r7.G
            boolean r0 = r2.a()
            if (r0 == 0) goto L7e
            boolean r0 = r2.f100686i
            if (r0 == 0) goto L7e
            sg.bigo.ads.common.utils.n r0 = r2.f100683f
            if (r0 == 0) goto L1c
            r0.b()
        L1c:
            long r0 = r2.f100685h
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2e
            boolean r0 = r2.a()
            if (r0 == 0) goto L2e
            long r0 = r2.f100685h
        L2c:
            r3 = r0
            goto L6d
        L2e:
            sg.bigo.ads.ad.b.b r0 = r2.f100678a
            if (r0 == 0) goto L39
            sg.bigo.ads.api.core.b r0 = r0.f()
            sg.bigo.ads.core.a.a r0 = (sg.bigo.ads.core.a.a) r0
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L55
            sg.bigo.ads.api.core.m r1 = r0.aV()
            if (r1 == 0) goto L45
            long r5 = r1.f102209c
            goto L46
        L45:
            r5 = r3
        L46:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4c
            r3 = r5
            goto L6d
        L4c:
            long r0 = r0.aU()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L55
            goto L2c
        L55:
            sg.bigo.ads.ad.interstitial.w r0 = r2.f100679b
            if (r0 == 0) goto L5c
            int r0 = r0.f101803c
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 >= 0) goto L68
            sg.bigo.ads.common.utils.r r0 = sg.bigo.ads.common.utils.r.f102828a
            r1 = 15
            long r0 = r0.a(r1)
            goto L2c
        L68:
            long r0 = (long) r0
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            goto L2c
        L6d:
            sg.bigo.ads.ad.interstitial.b.a$3 r1 = new sg.bigo.ads.ad.interstitial.b.a$3
            sg.bigo.ads.common.utils.r r0 = sg.bigo.ads.common.utils.r.f102828a
            r5 = 1
            long r5 = r0.a(r5)
            r1.<init>(r3, r5)
            r2.f100683f = r1
            r1.c()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.y.A():void");
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void E() {
        this.f100544e = true;
        sg.bigo.ads.ad.b.b bVarH = ((s) this.f101384y).H();
        boolean z10 = bVarH != null && bVarH.f100349p == 22;
        if (this.f100543d || e_() != 0 || z10) {
            super.E();
        } else {
            m(3);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        aE();
        Runnable runnable = this.Q;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(runnable);
        }
        Runnable runnable2 = this.R;
        if (runnable2 != null) {
            sg.bigo.ads.common.n.d.a(runnable2);
        }
        super.F();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected void J() {
        int i10;
        boolean z10;
        sg.bigo.ads.common.utils.n nVar = this.f100562w;
        if (nVar != null) {
            nVar.b();
            this.f100562w = null;
        }
        sg.bigo.ads.core.a.a aVarF = ((s) this.f101384y).f();
        if (!this.f100555p.get()) {
            i10 = this.f100547h.f101810j;
            z10 = false;
        } else {
            if (aVarF.bh() != null) {
                return;
            }
            i10 = this.f100547h.f101814n;
            z10 = true;
        }
        a(aVarF, z10, i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected int Y() {
        int iN = n();
        if (!aH()) {
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
                case 10:
                case 11:
                case 12:
                default:
                    return R.layout.bigo_ad_activity_interstitial_rich_video;
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
            }
        }
        T t10 = this.f101384y;
        sg.bigo.ads.core.a.a aVar = null;
        if (t10 != 0 && ((s) t10).H() != null) {
            aVar = (sg.bigo.ads.core.a.a) ((s) this.f101384y).H().f();
        }
        boolean z10 = false;
        if (aVar != null) {
            sg.bigo.ads.api.core.m mVarAV = aVar.aV();
            Activity activity = this.L;
            if (mVarAV != null && activity != null && (mVarAV.f102207a * 1.0f) / mVarAV.f102208b == (activity.getResources().getDisplayMetrics().widthPixels * 1.0f) / sg.bigo.ads.common.utils.e.c(activity)) {
                z10 = true;
            }
        }
        if (iN == 1) {
            return z10 ? R.layout.bigo_ad_activity_interstitial_style_landscape_1_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_1;
        }
        if (iN != 3) {
            return iN != 4 ? iN != 5 ? z10 ? R.layout.bigo_ad_activity_interstitial_style_landscape_2_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_2 : R.layout.bigo_ad_activity_interstitial_percent_warning_landscape : z10 ? R.layout.bigo_ad_activity_interstitial_style_landscape_4_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_4;
        }
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        if (mVar == null) {
            mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100541b;
        }
        if (mVar != null && aVar != null) {
            int iA = mVar.a("video_play_page.gp_element");
            if ((!TextUtils.isEmpty(aVar.n()) || (iA != 0 && iA != 1 && iA != 4)) && this.f100549j != null) {
                return R.layout.bigo_ad_activity_interstitial_style_landscape_3;
            }
        }
        return R.layout.bigo_ad_activity_interstitial_style_landscape_3_no_gp_element;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final boolean Z() {
        return this.f100543d;
    }

    protected final void aA() {
        if (e_() != 0 || this.W) {
            return;
        }
        this.f100550k.postDelayed(this.X, 5000L);
        this.W = true;
    }

    protected final void aB() {
        sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "midpage is shown when video ready, all timer paused");
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            sg.bigo.ads.common.utils.n nVar = adCountDownButton.f100518b;
            if (nVar != null) {
                nVar.b();
            }
            adCountDownButton.f100519c = true;
            adCountDownButton.f100520d = true;
            adCountDownButton.a(true);
        }
        VideoController videoControllerAk = ak();
        sg.bigo.ads.common.utils.n nVar2 = this.f100560u;
        if (nVar2 != null) {
            nVar2.d();
        }
        sg.bigo.ads.common.utils.n nVar3 = this.f100562w;
        if (nVar3 != null) {
            nVar3.d();
        }
        sg.bigo.ads.common.utils.n nVar4 = this.f100563x;
        if (nVar4 != null) {
            nVar4.d();
        }
        sg.bigo.ads.common.utils.n nVar5 = this.f100561v;
        if (nVar5 != null) {
            nVar5.d();
        }
        if (videoControllerAk == null || !videoControllerAk.isPlaying()) {
            return;
        }
        videoControllerAk.pause();
    }

    protected final void aC() {
        if (this.W) {
            this.f100550k.removeCallbacks(this.X);
            this.W = false;
        }
    }

    @NonNull
    protected LandingPageStyleConfig aD() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        if (mVar == null || !this.f100543d) {
            mVar = null;
        }
        int iA = sg.bigo.ads.ad.interstitial.c.a.a(mVar);
        int iB = sg.bigo.ads.ad.interstitial.c.a.b(mVar);
        int iA2 = sg.bigo.ads.ad.interstitial.c.a.a(this.T, mVar) ? aj().f101740i : 0;
        if (iA2 == 0) {
            iA2 = r.a(this.C, 0);
        }
        int i10 = iA2;
        int measuredHeight = 0;
        Class<? extends sg.bigo.ads.controller.landing.d> clsI = sg.bigo.ads.ad.interstitial.a.i(iA);
        ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        return new LandingPageStyleConfig(clsI, 1, iA, iB, measuredHeight, i10, 0.8f);
    }

    protected void aE() {
        T t10 = this.f101384y;
        if (t10 != 0) {
            s sVar = (s) t10;
            sg.bigo.ads.ad.interstitial.a.b bVar = sVar.C;
            if (bVar != null) {
                bVar.e();
                sVar.C = null;
            }
            s sVar2 = (s) this.f101384y;
            sg.bigo.ads.ad.interstitial.a.a aVar = sVar2.D;
            if (aVar != null) {
                aVar.e();
                sVar2.D = null;
            }
        }
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
            aj().f101103b = new e.a() { // from class: sg.bigo.ads.ad.interstitial.y.2
                @Override // sg.bigo.ads.ad.interstitial.e.a
                public final boolean a(Runnable runnable) {
                    y yVar = y.this;
                    return yVar.a(yVar.aj(), runnable);
                }
            };
            p pVar = this.f100557r;
            if (pVar != null) {
                pVar.C = new p.c() { // from class: sg.bigo.ads.ad.interstitial.y.3
                    @Override // sg.bigo.ads.ad.interstitial.p.c
                    public final boolean a(Runnable runnable) {
                        y yVar = y.this;
                        return yVar.a(yVar.f100557r, runnable);
                    }
                };
            }
            this.U.set(true);
            a(this.f100563x, this.f100557r, this.G, this.f100560u, this.f100561v, aj());
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    protected int ai() {
        return this.f100555p.get() ? 3 : 1;
    }

    protected boolean ao() {
        sg.bigo.ads.ad.interstitial.h.a aVar = this.f100559t;
        if (aVar == null || !aVar.d()) {
            return sg.bigo.ads.ad.interstitial.c.a.a(this.T, this.f100543d ? ((sg.bigo.ads.ad.interstitial.a) this).f100542c : null);
        }
        return true;
    }

    protected final void ap() {
        aj().a(this.D);
    }

    public final void aq() {
        sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "begin to Load backup HTML events called");
        if (az() || !aJ()) {
            return;
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.19
            @Override // java.lang.Runnable
            public final void run() {
                T t10 = y.this.f101384y;
                if (t10 != 0) {
                    ((sg.bigo.ads.core.a.a) ((s) t10).H().f()).d(3);
                    y.this.a(((s) y.this.f101384y).M());
                }
            }
        });
    }

    protected final void ar() {
        if (this.f101384y == 0 || !aJ()) {
            return;
        }
        a(at());
        aI();
    }

    protected sg.bigo.ads.ad.interstitial.a.a as() {
        T t10 = this.f101384y;
        if (t10 == 0) {
            return null;
        }
        return ((s) t10).D;
    }

    protected sg.bigo.ads.ad.interstitial.a.b at() {
        T t10 = this.f101384y;
        if (t10 == 0) {
            return null;
        }
        return ((s) t10).C;
    }

    public final int au() {
        switch (e_()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return 9;
            case 2:
            case 9:
                return 10;
            case 3:
            default:
                return 8;
            case 10:
                return 11;
        }
    }

    public final void av() {
        if (this.H || this.f100544e || this.f100547h == null || !aw()) {
            return;
        }
        this.f100544e = true;
        sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "auto click.");
        ((s) this.f101384y).H().a((sg.bigo.ads.common.i) null, 8, 22);
    }

    protected boolean aw() {
        return this.f100547h.f101810j == 3;
    }

    @Override // sg.bigo.ads.ad.interstitial.b.a.InterfaceC1224a
    public final void ax() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f100519c) {
            return;
        }
        adCountDownButton.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.b.a.InterfaceC1224a
    public final void ay() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f100519c) {
            return;
        }
        adCountDownButton.b();
    }

    protected boolean az() {
        sg.bigo.ads.api.a.m mVar;
        sg.bigo.ads.ad.interstitial.c.a aVar;
        sg.bigo.ads.api.a.m mVar2;
        if (this.f101384y == 0) {
            return false;
        }
        return (aH() && this.f100543d && (mVar2 = ((sg.bigo.ads.ad.interstitial.a) this).f100542c) != null && mVar2.a("endpage.ad_component_layout") == 3) || !this.f100543d || ((mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c) != null && mVar.a("endpage.ad_component_layout") == 5) || ((aVar = this.T) != null && aVar.g());
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    protected w b() {
        w wVar = new w();
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        if (mVar == null) {
            this.f100543d = false;
            wVar.f101810j = 1;
            wVar.f101811k = -1;
            wVar.f101801a = ((sg.bigo.ads.ad.interstitial.a) this).f100541b.c("interstitial_video_style.video_play_page.is_global_click");
            wVar.f101802b = ((sg.bigo.ads.ad.interstitial.a) this).f100541b.a("interstitial_video_style.video_play_page.impression_close_seconds");
            wVar.f101803c = ((sg.bigo.ads.ad.interstitial.a) this).f100541b.a("interstitial_video_style.video_play_page.close_click_seconds");
            wVar.f101804d = ((sg.bigo.ads.ad.interstitial.a) this).f100541b.c("interstitial_video_style.video_play_page.is_jump_layer");
            wVar.f101805e = ((sg.bigo.ads.ad.interstitial.a) this).f100541b.a("interstitial_video_style.layer.impression_layer_close_seconds");
            return wVar;
        }
        this.f100543d = true;
        wVar.f101806f = mVar.c("video_play_page.media_view_clickable_switch");
        wVar.f101808h = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.c("video_play_page.ad_component_clickable_switch");
        wVar.f101807g = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.c("video_play_page.other_space_clickable_switch");
        wVar.f101809i = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("video_play_page.click_type");
        wVar.f101812l = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.c("layer.other_space_clickable_switch");
        wVar.f101813m = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("layer.click_type");
        wVar.f101801a = false;
        wVar.f101802b = 0;
        wVar.f101803c = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("video_play_page.force_staying_time");
        wVar.f101804d = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.c("layer.is_show_layer");
        wVar.f101805e = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("layer.force_staying_time");
        wVar.f101810j = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("video_play_page.auto_click");
        wVar.f101811k = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("video_play_page.auto_click_new", -1);
        wVar.f101814n = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("video_play_page.time_for_auto_click", -1);
        wVar.f101815o = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("video_play_page.time_for_show_backup", -1);
        return wVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public final void d(int i10) {
        super.d(i10);
        if (e_() != 0) {
            aK();
            c(this.f100560u, this.f100561v, aj());
        }
        if (this.U.compareAndSet(true, false)) {
            b(this.f100563x, this.f100557r, this.G, this.f100560u, this.f100561v, aj());
            if (this.G.f100681d) {
                c(this.f100560u, this.f100561v, aj());
            }
            e();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void f(int i10) {
        ViewGroup viewGroup;
        super.f(i10);
        if (i10 != 9 || L() || (viewGroup = this.D) == null) {
            return;
        }
        viewGroup.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.9
            @Override // java.lang.Runnable
            public final void run() {
                if (y.this.L.isFinishing()) {
                    return;
                }
                y.this.i();
            }
        }, 50L);
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void l() {
        super.l();
        sg.bigo.ads.ad.interstitial.b.a aVar = this.G;
        sg.bigo.ads.ad.b.b bVarH = ((s) this.f101384y).H();
        w wVar = this.f100547h;
        sg.bigo.ads.api.a.m mVar = this.f100543d ? ((sg.bigo.ads.ad.interstitial.a) this).f100542c : null;
        aVar.f100678a = bVarH;
        aVar.f100679b = wVar;
        aVar.f100680c = mVar != null ? mVar.a("video_play_page.countdown_way", 1) : 1;
        this.G.f100684g = this;
        if (this.C == null || !this.f100543d || ((sg.bigo.ads.ad.interstitial.a) this).f100542c == null) {
            return;
        }
        if ((L() || this.f100555p.get()) && !M()) {
            this.T = sg.bigo.ads.ad.interstitial.c.a.a(this.C, ((sg.bigo.ads.ad.interstitial.a) this).f100542c, ((s) this.f101384y).G(), this.f100558s, aH());
        }
    }

    public void m(int i10) {
        View viewFindViewById;
        x();
        b(!this.f100555p.get());
        final sg.bigo.ads.ad.interstitial.a.b bVarAt = at();
        if (!Q() && L() && az() && bVarAt != null && !bVarAt.f100655b && bVarAt.f100654a) {
            if (bVarAt.b()) {
                a(i10, bVarAt);
                return;
            }
            if (sg.bigo.ads.api.a.i.f102116a.p().a()) {
                Runnable runnable = this.R;
                if (runnable == null) {
                    runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            sg.bigo.ads.common.n.d.a(y.this.Q);
                            bVarAt.a(this);
                            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.7.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                    y.this.a(7, bVarAt);
                                }
                            });
                        }
                    };
                    this.R = runnable;
                }
                bVarAt.f100656c = runnable;
                int iB = sg.bigo.ads.api.a.i.f102116a.p().b();
                if (this.D != null && e_() == 0 && e_() == 10) {
                    f(4);
                    aP();
                    k(false);
                    B();
                    ViewGroup viewGroup = this.D;
                    if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.inter_layout_playable_loading)) != null) {
                        viewFindViewById.setVisibility(0);
                        int i11 = iB > 0 ? iB : 1;
                        Runnable runnable2 = this.Q;
                        if (runnable2 == null) {
                            runnable2 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.8

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                final /* synthetic */ int f101862b = 7;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) y.this.f101384y)) {
                                        return;
                                    }
                                    if (y.this.R != null) {
                                        bVarAt.a(y.this.R);
                                    }
                                    y.this.n(this.f101862b);
                                }
                            };
                            this.Q = runnable2;
                        }
                        sg.bigo.ads.common.n.d.a(2, runnable2, ((long) i11) * 1000);
                    }
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) this.f101384y).f(), e_(), 7);
                    return;
                }
            } else if (a(i10, bVarAt)) {
                return;
            }
        }
        n(i10);
    }

    protected final void n(int i10) {
        if (this.D == null) {
            return;
        }
        if (e_() != 0 && e_() != 10 && e_() != 4) {
            sg.bigo.ads.common.t.a.a(0, "RichInterstitialVideoActivityImpl", "end page can be shown but current page is not main or playable loading or mid page.");
            return;
        }
        if (!L() && !this.f100555p.get()) {
            C();
            return;
        }
        this.Y.a();
        aP();
        f(q(i10));
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) this.f101384y).f(), e_(), i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected final void t() {
        final VideoController videoController;
        Button button;
        super.t();
        final sg.bigo.ads.ad.b.b bVar = this.C;
        if (bVar == null || (videoController = bVar.getVideoController()) == null) {
            return;
        }
        t tVarAj = aj();
        final boolean zN = tVarAj instanceof sg.bigo.ads.ad.interstitial.d.a ? ((sg.bigo.ads.ad.interstitial.d.a) tVarAj).n() : false;
        this.E = (Button) p(R.id.inter_btn_mute);
        if (!this.f100555p.get() && (button = this.E) != null && !zN) {
            button.setVisibility(0);
            j(videoController.isMuted());
            this.E.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.y.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    videoController.mute(!r2.isMuted());
                }
            });
        }
        videoController.setVideoLifeCallback(new a.c(new VideoController.b() { // from class: sg.bigo.ads.ad.interstitial.y.12
            @Override // sg.bigo.ads.api.VideoController.b
            public final void a() {
                y.this.aA();
            }

            @Override // sg.bigo.ads.api.VideoController.b
            public final void b() {
                y.this.aC();
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onMuteChange(boolean z10) {
                y.this.j(z10);
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoEnd() {
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPause() {
                p pVar = y.this.f100557r;
                if (pVar != null) {
                    pVar.d();
                }
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPlay() {
                p pVar = y.this.f100557r;
                if (pVar != null) {
                    pVar.c();
                }
                if (y.this.e_() == 10) {
                    y.this.aB();
                }
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoStart() {
                Context context;
                int i10;
                if (y.this.f100555p.compareAndSet(true, false)) {
                    AdCountDownButton adCountDownButton = y.this.A;
                    if (adCountDownButton != null) {
                        adCountDownButton.e();
                        y.this.A.setTakeoverTickEvent(true);
                        y yVar = y.this;
                        yVar.G.f100686i = true;
                        yVar.A();
                    }
                    videoController.notifyPlayViewRegister();
                    y.this.J();
                    sg.bigo.ads.common.utils.n nVar = y.this.f100563x;
                    if (nVar != null) {
                        nVar.b();
                        y.this.f100563x = null;
                    }
                    y yVar2 = y.this;
                    if (yVar2.f100556q) {
                        sg.bigo.ads.common.utils.n nVar2 = yVar2.f100560u;
                        if (nVar2 != null) {
                            nVar2.c();
                        }
                        sg.bigo.ads.common.utils.n nVar3 = y.this.f100561v;
                        if (nVar3 != null) {
                            nVar3.c();
                        }
                    }
                    Button button2 = y.this.E;
                    if (button2 != null && !zN) {
                        button2.setVisibility(0);
                    }
                    y yVar3 = y.this;
                    if (yVar3.D != null) {
                        final t tVarAj2 = yVar3.aj();
                        y yVar4 = y.this;
                        ViewGroup viewGroup = yVar4.D;
                        int iAi = yVar4.ai();
                        b.d popPage = tVarAj2.f101734c.getPopPage();
                        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.inter_icon);
                        if (imageView != null && !tVarAj2.f101734c.hasIcon()) {
                            String strA = popPage == null ? "" : popPage.a();
                            if (sg.bigo.ads.common.utils.q.a((CharSequence) strA) || !URLUtil.isNetworkUrl(strA)) {
                                if (iAi == 2) {
                                    context = imageView.getContext();
                                    i10 = R.drawable.bigo_ad_icon_default;
                                } else if (iAi == 1) {
                                    tVarAj2.a(imageView);
                                } else if (iAi == 3) {
                                    context = imageView.getContext();
                                    i10 = R.drawable.bigo_ad_icon_novideo_default;
                                }
                                imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, i10));
                            } else {
                                sg.bigo.ads.common.p.e.a(tVarAj2.f101734c.f100335b.f102178e, strA, ((sg.bigo.ads.core.a.a) tVarAj2.f101734c.f()).al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.t.10
                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(int i11, @NonNull String str, String str2) {
                                    }

                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                                        imageView.setImageBitmap(bitmap);
                                    }
                                });
                            }
                        }
                        y.this.K();
                    }
                    y.this.j(videoController.isMuted());
                    Button button3 = y.this.E;
                    if (button3 != null) {
                        button3.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.y.12.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                videoController.mute(!r2.isMuted());
                            }
                        });
                    }
                }
                if ((bVar instanceof sg.bigo.ads.ad.b.c) && (y.this.N() || y.this.O())) {
                    ((sg.bigo.ads.ad.b.c) bVar).K = true;
                }
                t tVarAj3 = y.this.aj();
                tVarAj3.d();
                if (tVarAj3 instanceof sg.bigo.ads.ad.interstitial.d.a) {
                    ((sg.bigo.ads.ad.interstitial.d.a) tVarAj3).p();
                }
                if (y.this.T != null) {
                    y.this.T.c(y.this);
                }
                y yVar5 = y.this;
                sg.bigo.ads.ad.interstitial.h.a aVar = yVar5.f100559t;
                if (aVar != null) {
                    aVar.c(yVar5);
                }
            }
        }) { // from class: sg.bigo.ads.ad.interstitial.b.a.1
            public AnonymousClass1(VideoController.b bVar2) {
                super(bVar2, (byte) 0);
            }

            @Override // sg.bigo.ads.ad.interstitial.b.a.c, sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoEnd() {
                a aVar = a.this;
                aVar.f100681d = true;
                a.a(aVar);
                super.onVideoEnd();
            }

            @Override // sg.bigo.ads.ad.interstitial.b.a.c, sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPause() {
                a.this.b(true);
                super.onVideoPause();
            }

            @Override // sg.bigo.ads.ad.interstitial.b.a.c, sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPlay() {
                a.this.a(true);
                super.onVideoPlay();
            }
        });
        videoController.setLoadHTMLCallback(new VideoController.c() { // from class: sg.bigo.ads.ad.interstitial.y.15
            @Override // sg.bigo.ads.api.VideoController.c
            public final void a() {
                y.this.aq();
            }
        });
        videoController.setProgressChangeListener(new a.b(new VideoController.d() { // from class: sg.bigo.ads.ad.interstitial.y.16
            @Override // sg.bigo.ads.api.VideoController.d
            public final void a(int i10, int i11) {
                t tVarAj2 = y.this.aj();
                tVarAj2.d();
                if (tVarAj2 instanceof sg.bigo.ads.ad.interstitial.d.a) {
                    ((sg.bigo.ads.ad.interstitial.d.a) tVarAj2).p();
                }
                if (y.this.T != null) {
                    y.this.T.c(y.this);
                }
                y yVar = y.this;
                sg.bigo.ads.ad.interstitial.h.a aVar = yVar.f100559t;
                if (aVar != null) {
                    aVar.c(yVar);
                }
                if (!y.this.O) {
                    y yVar2 = y.this;
                    if (!yVar2.f100543d && yVar2.K == 2 && i10 / i11 >= ((sg.bigo.ads.ad.interstitial.a) y.this).f100541b.b("interstitial_video_style.video_play_page.cta_animation_show_wait_progress")) {
                        y.this.aM();
                    }
                }
                y yVar3 = y.this;
                if (((sg.bigo.ads.ad.interstitial.a) yVar3).f100542c == null || yVar3.O) {
                    return;
                }
                y yVar4 = y.this;
                if (yVar4.f100543d && ((sg.bigo.ads.ad.interstitial.a) yVar4).f100542c.c("video_play_page.is_cta_show_animation")) {
                    y.this.aM();
                }
            }
        }) { // from class: sg.bigo.ads.ad.interstitial.b.a.2
            public AnonymousClass2(VideoController.d dVar) {
                super(dVar, (byte) 0);
            }

            @Override // sg.bigo.ads.ad.interstitial.b.a.b, sg.bigo.ads.api.VideoController.d
            public final void a(int i10, int i11) {
                a aVar = a.this;
                if (aVar.f100684g != null && !aVar.a()) {
                    a.this.f100684g.b(i11 - i10);
                }
                super.a(i10, i11);
            }
        });
        videoController.setBackupLoadCallback(this);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public void u() {
        p pVar;
        if (((sg.bigo.ads.core.a.a) ((s) this.f101384y).B.f()).bb() && (pVar = this.f100557r) != null && pVar.f101589y.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.14
            @Override // java.lang.Runnable
            public final void run() {
                y.this.m(1);
            }
        })) {
            sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "backup image show mid_page success");
        } else {
            m(4);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected boolean v() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        int iA = mVar != null ? this.f100543d ? mVar.a("video_play_page.ad_component_layout") : 1 : 0;
        return (iA == 6 || iA == 7) ? !aH() : iA == 8;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected void z() {
        super.z();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(true);
            this.A.setTakeoverTickEvent(!this.f100555p.get());
            this.G.f100686i = true ^ this.f100555p.get();
            if (N()) {
                k(R.drawable.bigo_ad_ic_close);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(boolean z10) {
        Button button = this.E;
        if (button != null) {
            button.setBackgroundResource(z10 ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute);
        }
    }

    static /* synthetic */ boolean k(y yVar) {
        yVar.W = false;
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.c.a
    public final LandingPageStyleConfig a(Context context, String str, int i10, boolean z10) {
        LandingPageStyleConfig landingPageStyleConfigAD;
        if (e_() != 1) {
            return super.a(context, str, i10, z10);
        }
        if (z10) {
            sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
            if (mVar == null || !this.f100543d) {
                mVar = null;
            }
            int iA = sg.bigo.ads.ad.interstitial.c.a.a(mVar);
            if (sg.bigo.ads.ad.interstitial.a.j(iA)) {
                iA = 0;
            }
            int i11 = iA;
            landingPageStyleConfigAD = new LandingPageStyleConfig(sg.bigo.ads.ad.interstitial.a.i(i11), 1, i11, sg.bigo.ads.ad.interstitial.c.a.b(mVar), 0, 0, 0.0f);
        } else {
            landingPageStyleConfigAD = aD();
        }
        sg.bigo.ads.ad.interstitial.f.b.a(landingPageStyleConfigAD);
        return landingPageStyleConfigAD;
    }

    @Override // sg.bigo.ads.ad.interstitial.b.a.InterfaceC1224a
    public final void b(long j10) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.a(j10);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected final void c(boolean z10) {
        super.c(z10);
        this.f100556q = z10;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void g() {
        VideoController videoControllerAk;
        super.g();
        int iE_ = e_();
        if (iE_ != 10 && (!this.f100555p.get() || ((sg.bigo.ads.core.a.a) ((s) this.f101384y).H().f()).bh() != null)) {
            sg.bigo.ads.common.utils.n nVar = this.f100560u;
            if (nVar != null && nVar.e()) {
                this.f100560u.c();
            }
            sg.bigo.ads.common.utils.n nVar2 = this.f100561v;
            if (nVar2 != null && nVar2.e()) {
                this.f100561v.c();
            }
        }
        sg.bigo.ads.ad.interstitial.a.b bVarAt = at();
        if (bVarAt != null) {
            bVarAt.f100659f.c();
        }
        sg.bigo.ads.ad.interstitial.c.a aVar = this.T;
        if (aVar != null) {
            aVar.b();
        }
        this.G.a(false);
        if ((iE_ == 0 || iE_ == 3) && (videoControllerAk = ak()) != null && videoControllerAk.isPaused() && this.V) {
            videoControllerAk.play();
            this.V = false;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.common.utils.n nVar3 = this.f100563x;
        if (nVar3 != null && nVar3.e()) {
            this.f100563x.c();
        }
        sg.bigo.ads.common.utils.n nVar4 = this.f100562w;
        if (nVar4 == null || !nVar4.e()) {
            return;
        }
        this.f100562w.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void i() {
        super.i();
        sg.bigo.ads.common.utils.n nVar = this.f100560u;
        if (nVar != null) {
            nVar.d();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f100561v;
        if (nVar2 != null) {
            nVar2.d();
        }
        sg.bigo.ads.common.utils.n nVar3 = this.f100562w;
        if (nVar3 != null) {
            nVar3.d();
        }
        sg.bigo.ads.common.utils.n nVar4 = this.f100563x;
        if (nVar4 != null) {
            nVar4.d();
        }
        sg.bigo.ads.ad.interstitial.a.b bVarAt = at();
        if (bVarAt != null) {
            bVarAt.f100659f.d();
        }
        sg.bigo.ads.ad.interstitial.c.a aVar = this.T;
        if (aVar != null) {
            aVar.c();
        }
        boolean z10 = false;
        this.G.b(false);
        VideoController videoControllerAk = ak();
        if (videoControllerAk != null && videoControllerAk.isPlaying()) {
            z10 = true;
        }
        this.V = z10;
        if (z10) {
            videoControllerAk.pause();
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f100519c) {
            return;
        }
        adCountDownButton.b();
    }

    protected void l(int i10) {
        sg.bigo.ads.api.a.m mVar;
        String str;
        RoundedFrameLayout roundedFrameLayout;
        if (aj() instanceof sg.bigo.ads.ad.interstitial.d.a) {
            return;
        }
        e(i10);
        View viewFindViewById = this.D.findViewById(R.id.inter_ad_info);
        if (viewFindViewById != null) {
            int i11 = p().f101341a;
            if (i11 > 0) {
                Context context = viewFindViewById.getContext();
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
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
                this.I = true;
                aL();
                return;
            }
            if (this.f100543d) {
                mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
                str = "video_play_page.ad_component_show_time";
            } else {
                mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100541b;
                str = "interstitial_video_style.video_play_page.impression_ad_seconds";
            }
            this.f100560u = new AnonymousClass18(((long) mVar.a(str)) * 1000, viewFindViewById);
        }
    }

    private void a(View view, View view2) {
        sg.bigo.ads.api.a.m mVar;
        if (this.D == null) {
            return;
        }
        if (!this.f100543d && ((sg.bigo.ads.ad.interstitial.a) this).f100541b.c("interstitial_video_style.endpage.is_global_click")) {
            ViewGroup viewGroup = this.D;
            if (viewGroup != null) {
                viewGroup.setTag(11);
                a(this.D, 4, ((s) this.f101384y).H(), 0);
                return;
            }
            return;
        }
        if (!this.f100543d || (mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c) == null) {
            return;
        }
        if (mVar.c("endpage.media_view_clickable_switch")) {
            a(view, 9, ((s) this.f101384y).H(), ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("endpage.click_type"));
        } else {
            a(view, 9, q.F, 0);
        }
        if (((sg.bigo.ads.ad.interstitial.a) this).f100542c.c("endpage.other_space_clickable_switch")) {
            a(view2, 9, ((s) this.f101384y).H(), ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("endpage.click_type"));
        } else {
            a(view2, 9, q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void b(String str) {
        aC();
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.13
            @Override // java.lang.Runnable
            public final void run() {
                y.this.m(4);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected boolean f(boolean z10) {
        p pVar;
        T t10;
        sg.bigo.ads.api.a.m mVar;
        String str;
        int iE_ = e_();
        if (!L() && !this.f100555p.get() && iE_ == 0) {
            aK();
            x();
            b(true);
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            p pVar2 = this.f100557r;
            if (pVar2 != null && (pVar2.f101589y.a() || this.f100557r.D)) {
                return false;
            }
            i();
            return !C();
        }
        if (iE_ == 0 || iE_ == 10) {
            aK();
            if (iE_ != 10 && (pVar = this.f100557r) != null && (pVar.f101589y.a() || this.f100557r.D)) {
                f(10);
                return false;
            }
            if (M()) {
                return true;
            }
            m(2);
            return false;
        }
        if (iE_ == 5) {
            boolean zC = C();
            AdCountDownButton adCountDownButton2 = this.A;
            if (adCountDownButton2 != null) {
                adCountDownButton2.e();
                if (!zC) {
                    if (this.f100543d) {
                        mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
                        str = "endpage.close_click_seconds";
                    } else {
                        mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100541b;
                        str = "interstitial_video_style.endpage.impression_close_seconds";
                    }
                    a(((long) mVar.a(str)) * 1000);
                }
            }
            if (zC && (t10 = this.f101384y) != 0) {
                sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) t10).f(), 9, this.S);
                return false;
            }
        }
        if (iE_ != 1 && iE_ != 7) {
            return z10;
        }
        boolean zC2 = C();
        if (zC2) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) this.f101384y).f(), 9, 10);
        }
        return z10 && !zC2;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void g(@LayoutRes int i10) {
        View viewFindViewById;
        super.g(i10);
        if (this.D == null) {
            return;
        }
        if (ao() && (L() || this.f100555p.get())) {
            aj().i();
        }
        a(az());
        K();
        this.K = ((sg.bigo.ads.ad.interstitial.a) this).f100541b.a("interstitial_video_style.video_play_page.cta_animation_show_way");
        l(i10);
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) ((s) this.f101384y).H().f();
        if (az()) {
            ar();
        } else if (this.f100555p.get() && aVar.bi()) {
            aq();
        }
        if (this.f100555p.get() && aVar.bh() == null) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.17
                @Override // java.lang.Runnable
                public final void run() {
                    p pVar = y.this.f100557r;
                    if (pVar != null) {
                        pVar.d();
                    }
                }
            });
            if (!aH() || (viewFindViewById = this.D.findViewById(R.id.inter_ad_info)) == null) {
                return;
            }
            viewFindViewById.setVisibility(0);
            return;
        }
        sg.bigo.ads.common.utils.n nVar = this.f100560u;
        if (nVar != null) {
            nVar.c();
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f100561v;
        if (nVar2 != null) {
            nVar2.c();
        }
    }

    @CallSuper
    public void i(boolean z10) {
        sg.bigo.ads.common.t.a.a(0, 4, "RichInterstitialVideoActivityImpl", "backup image loaded when show default backup style, so cancel this timer, isVideoReady=".concat(String.valueOf(z10)));
        sg.bigo.ads.common.utils.n nVar = this.f100563x;
        if (nVar != null) {
            nVar.b();
            this.f100563x = null;
        }
        sg.bigo.ads.common.utils.n nVar2 = this.f100562w;
        if (nVar2 != null) {
            nVar2.b();
            this.f100562w = null;
        }
    }

    private void a(@NonNull sg.bigo.ads.ad.interstitial.a.a aVar, @NonNull View view) {
        sg.bigo.ads.api.a.m mVar;
        String str;
        ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            int i10 = R.layout.bigo_ad_activity_interstitial_rich_video_empty_end;
            ViewGroup viewGroup2 = this.D;
            sg.bigo.ads.common.utils.a.a(context, i10, viewGroup2, viewGroup2 != null);
            ViewGroup viewGroup3 = (ViewGroup) this.D.findViewById(R.id.inter_layout_end_page);
            if (viewGroup3 == null) {
                sg.bigo.ads.common.t.a.a(0, "RichInterstitialVideoActivityImpl", "playContainer is null.");
                return;
            }
            sg.bigo.ads.ad.interstitial.e.c cVar = this.f100558s;
            if (cVar != null) {
                cVar.a(viewGroup3, 8);
            }
            sg.bigo.ads.common.utils.u.a(view, (ViewGroup) viewGroup3.findViewById(R.id.inter_end_page), new FrameLayout.LayoutParams(-1, -1, 17), -1);
            view.setTag(20);
            this.D.setTag(20);
            a(view, this.D);
            aVar.a(1);
            if (this.f100543d) {
                mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
                str = "endpage.close_click_seconds";
            } else {
                mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100541b;
                str = "interstitial_video_style.endpage.impression_close_seconds";
            }
            a(((long) mVar.a(str)) * 1000);
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            if (((s) this.f101384y).H().C() != null) {
                ((s) this.f101384y).H().C().bringToFront();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(sg.bigo.ads.ad.interstitial.a.b bVar) {
        if (bVar == null || !aJ()) {
            return;
        }
        bVar.f100657d = new b.InterfaceC1222b() { // from class: sg.bigo.ads.ad.interstitial.y.20
            @Override // sg.bigo.ads.ad.interstitial.a.b.InterfaceC1222b
            public final void a() {
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.20.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdCountDownButton adCountDownButton;
                        if (y.this.e_() != 5 || (adCountDownButton = y.this.A) == null || adCountDownButton.getVisibility() == 0) {
                            return;
                        }
                        y.g(y.this);
                        y.this.A();
                    }
                });
            }
        };
        bVar.a(new a(13));
        sg.bigo.ads.common.t.a.a(0, 3, "RichInterstitialVideoActivityImpl", "begin to preload PlayableResource resource : ".concat(String.valueOf(bVar)));
        bVar.a(this.L);
    }

    protected void a(sg.bigo.ads.core.a.a aVar, boolean z10, int i10) {
        long jA;
        if (z10) {
            int iA = w.a(i10);
            if (iA == 0) {
                sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "fill strategy config no auto click, so return");
                return;
            }
            jA = sg.bigo.ads.common.utils.r.f102828a.a(iA);
        } else {
            long jAL = aVar.aL();
            sg.bigo.ads.common.utils.r rVar = sg.bigo.ads.common.utils.r.f102828a;
            if (jAL <= rVar.a(5)) {
                sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Video", "Video duration is less than 5s，can't trigger auto click");
                return;
            }
            int i11 = this.f100547h.f101810j;
            if (i11 == 5) {
                sg.bigo.ads.api.core.m mVarAV = aVar.aV();
                long jAU = mVarAV != null ? mVarAV.f102209c : 0L;
                if (jAU <= 0) {
                    jAU = aVar.aU();
                }
                sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
                jA = Math.max(0L, jAU - (((long) (mVar != null ? mVar.a("video_play_page.auto_click_sec") : 0)) * 1000));
            } else if (i11 == 2) {
                jA = rVar.a(5);
            } else {
                if (i11 != 4) {
                    return;
                }
                sg.bigo.ads.api.a.m mVar2 = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
                jA = rVar.a(mVar2 != null ? mVar2.a("video_play_page.auto_click_sec") : 0);
            }
        }
        if (jA == 0) {
            jA = 500;
        }
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(jA) { // from class: sg.bigo.ads.ad.interstitial.y.4
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                y yVar = y.this;
                if (yVar.H || yVar.f100544e) {
                    return;
                }
                yVar.f100544e = true;
                ((s) yVar.f101384y).H().a((sg.bigo.ads.common.i) null, y.this.au(), 22);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.f100562w = nVar;
        nVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(boolean z10, boolean z11) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        if (z11 && e_() == 0) {
            if (O()) {
                k(R.drawable.bigo_ad_ic_close);
            }
            if (this instanceof sg.bigo.ads.ad.interstitial.g.b) {
                ((sg.bigo.ads.ad.interstitial.g.b) this).a(0);
            }
            a(this.G, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.6
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.av();
                    p pVar = y.this.f100557r;
                    if (pVar != null) {
                        if (pVar.D) {
                            return;
                        }
                        if (y.this.f100557r.f101589y.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                y.this.m(1);
                            }
                        })) {
                            return;
                        }
                    }
                    y.this.m(1);
                }
            });
        }
    }

    protected final boolean a(int i10, @NonNull sg.bigo.ads.ad.interstitial.a.b bVar) {
        View view = bVar.f100659f.f100599i;
        if (!bVar.b()) {
            sg.bigo.ads.common.t.a.a(0, "RichInterstitialVideoActivityImpl", "playableAdCompanion is not ResourceReady");
            bVar.f100659f.f();
            return false;
        }
        if (this.D == null) {
            sg.bigo.ads.common.t.a.a(0, "RichInterstitialVideoActivityImpl", "nativeAdView == null.");
            return false;
        }
        if (view == null) {
            sg.bigo.ads.common.t.a.a(0, "RichInterstitialVideoActivityImpl", "playableView == null.");
            return false;
        }
        if (e_() != 0 && e_() != 10 && e_() != 4) {
            sg.bigo.ads.common.t.a.a(0, "RichInterstitialVideoActivityImpl", "playable page can be shown but current page is not main or playable loading or mid page.");
            return false;
        }
        f(5);
        aP();
        aN();
        Context context = this.D.getContext();
        int i11 = R.layout.bigo_ad_activity_interstitial_rich_video_empty_end;
        ViewGroup viewGroup = this.D;
        sg.bigo.ads.common.utils.a.a(context, i11, viewGroup, viewGroup != null);
        ViewGroup viewGroup2 = (ViewGroup) this.D.findViewById(R.id.inter_layout_end_page);
        if (viewGroup2 == null) {
            sg.bigo.ads.common.t.a.a(0, "RichInterstitialVideoActivityImpl", "playContainer is null.");
            return false;
        }
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f100558s;
        if (cVar != null) {
            cVar.a(viewGroup2, 4);
        }
        sg.bigo.ads.common.utils.u.a(view, (ViewGroup) viewGroup2.findViewById(R.id.inter_end_page), new FrameLayout.LayoutParams(-1, -1, 17), -1);
        view.setTag(19);
        this.D.setTag(19);
        a(view, this.D);
        if (this.A != null) {
            sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
            a(((long) (mVar != null ? mVar.a("endpage.close_click_seconds") : sg.bigo.ads.api.a.i.f102116a.p().c())) * 1000);
            this.A.e();
        }
        this.Y.a(view);
        bVar.a(1);
        if (((s) this.f101384y).H().C() != null) {
            ((s) this.f101384y).H().C().bringToFront();
        }
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) ((s) this.f101384y).f(), e_(), i10);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public final boolean a(@NonNull MotionEvent motionEvent, @Nullable b.a aVar, int i10) {
        Object objAj = aj();
        if ((objAj instanceof sg.bigo.ads.ad.interstitial.f.c) && (objAj instanceof sg.bigo.ads.ad.interstitial.d.a)) {
            sg.bigo.ads.ad.interstitial.d.a aVar2 = (sg.bigo.ads.ad.interstitial.d.a) objAj;
            sg.bigo.ads.ad.interstitial.f.c cVar = (sg.bigo.ads.ad.interstitial.f.c) objAj;
            if (cVar.K() && !cVar.L()) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                Button buttonM = aVar2.m();
                if (buttonM != null && sg.bigo.ads.common.utils.u.b(buttonM, rawX, rawY)) {
                    if (motionEvent.getAction() == 1) {
                        buttonM.performClick();
                    }
                    return true;
                }
                MediaView mediaViewL = aVar2.l();
                MediaView.a aVarB = mediaViewL != null ? mediaViewL.b() : null;
                if (aVarB != null && aVarB.a() && sg.bigo.ads.common.utils.u.b(mediaViewL, rawX, rawY)) {
                    if (motionEvent.getAction() == 1) {
                        aVarB.b();
                    }
                    return true;
                }
            }
        }
        return super.a(motionEvent, aVar, i10);
    }
}
