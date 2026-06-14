package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.e.c;
import sg.bigo.ads.ad.interstitial.f.b;
import sg.bigo.ads.ad.interstitial.h;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.e.a;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.YandexWarningTextView;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends q implements c.a, b.InterfaceC1241b {
    private final List<Integer> G;

    @NonNull
    private final l H;
    private final WeakHashMap<Object, Integer> I;
    private final Map<Integer, WeakHashMap<Object, Runnable>> J;
    private final a.AbstractC1257a K;
    private boolean O;
    private Runnable P;
    private int Q;
    private int R;
    private final Runnable S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    protected View f100540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.m f100541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    protected sg.bigo.ads.api.a.m f100542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f100543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f100544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f100545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f100546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f100547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    protected sg.bigo.ads.ad.interstitial.multi_img.b f100548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected f f100549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Handler f100550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f100551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f100552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f100553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f100554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected AtomicBoolean f100555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f100556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public p f100557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    protected sg.bigo.ads.ad.interstitial.e.c f100558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    protected sg.bigo.ads.ad.interstitial.h.a f100559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected sg.bigo.ads.common.utils.n f100560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected sg.bigo.ads.common.utils.n f100561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected sg.bigo.ads.common.utils.n f100562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected sg.bigo.ads.common.utils.n f100563x;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a$2, reason: invalid class name */
    final class AnonymousClass2 extends sg.bigo.ads.common.utils.n {
        AnonymousClass2(long j10) {
            super(j10, 1000L);
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a() {
            a aVar = a.this;
            aVar.a(aVar.f100561v, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup = a.this.D;
                    if (viewGroup != null) {
                        Context context = viewGroup.getContext();
                        int i10 = R.layout.bigo_ad_view_slide_gesture;
                        ViewGroup viewGroup2 = a.this.D;
                        sg.bigo.ads.common.utils.a.a(context, i10, viewGroup2, viewGroup2 != null);
                        View viewFindViewById = a.this.D.findViewById(R.id.inter_slide_gesture_contain);
                        a aVar2 = a.this;
                        aVar2.f100540a = aVar2.D.findViewById(R.id.inter_slide_gesture);
                        View view = a.this.f100540a;
                        if (view == null) {
                            return;
                        }
                        view.setTag(16);
                        t tVarAj = a.this.aj();
                        a aVar3 = a.this;
                        tVarAj.a(aVar3.D, viewFindViewById, aVar3.ai(), 8, 0, a.this.f100540a);
                        a.this.y();
                        final View view2 = a.this.f100540a;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(300L);
                        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation2.setDuration(200L);
                        alphaAnimation2.setStartOffset(200L);
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 160.0f, 0.0f);
                        translateAnimation.setDuration(300L);
                        final AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.9

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ View f100724a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ AlphaAnimation f100725b;

                            AnonymousClass9(final View view22, final AlphaAnimation alphaAnimation22) {
                                view = view22;
                                alphaAnimation = alphaAnimation22;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                view.startAnimation(alphaAnimation);
                            }
                        });
                        alphaAnimation22.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.10

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ AnimationSet f100693a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ View f100694b;

                            AnonymousClass10(final AnimationSet animationSet2, final View view22) {
                                animationSet = animationSet2;
                                view = view22;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                animationSet.setStartOffset(200L);
                                view.startAnimation(animationSet);
                            }
                        });
                        view22.startAnimation(animationSet2);
                        a.this.f100540a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.f101384y)) {
                                    return;
                                }
                                a.this.x();
                            }
                        }, 5000L);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a(long j10) {
        }
    }

    protected a(@NonNull Activity activity) {
        super(activity);
        this.G = new ArrayList();
        this.f100543d = false;
        this.f100544e = false;
        this.f100545f = false;
        this.f100546g = false;
        this.f100550k = new Handler(Looper.getMainLooper());
        this.f100552m = 0;
        this.f100553n = 0;
        this.f100554o = 0;
        this.f100555p = new AtomicBoolean(false);
        this.f100556q = true;
        this.H = new l();
        this.I = new WeakHashMap<>();
        this.J = new HashMap();
        this.K = new a.AbstractC1257a() { // from class: sg.bigo.ads.ad.interstitial.a.1
            @Override // sg.bigo.ads.common.e.a.AbstractC1257a
            public final void a(boolean z10) {
                a.this.c(z10);
            }
        };
        this.O = false;
        this.P = null;
        this.Q = 0;
        this.R = 0;
        this.S = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.A();
            }
        };
        sg.bigo.ads.ad.interstitial.f.b.f101231a = new WeakReference<>(this);
    }

    static /* synthetic */ double a(int i10, int i11, int i12, int i13) {
        return Math.max(Math.abs(i10 - i12), Math.abs(i11 - i13));
    }

    private boolean ao() {
        if (!this.O) {
            return true;
        }
        if (e_() == 0) {
            return !j() || k();
        }
        return false;
    }

    private void ap() {
        t tVarAj = aj();
        if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.a) {
            if (tVarAj instanceof sg.bigo.ads.ad.interstitial.d.m) {
                ((sg.bigo.ads.ad.interstitial.d.m) tVarAj).a(this, this.D, this.f100547h, this.f100548i, this.f100549j);
            } else {
                ((sg.bigo.ads.ad.interstitial.d.a) tVarAj).a(this, this.D, this.f100547h, this.f100542c, this.f100549j);
            }
            p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void aq() {
        ViewGroup viewGroup;
        final View viewFindViewById;
        Bitmap bitmapA;
        if (!aH() || (viewGroup = this.D) == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_ad_info_card_right_bottom)) == null) {
            return;
        }
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.inter_star);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.bigo_ad_info_card_background);
        if (imageView != null && viewFindViewById2 != 0) {
            f fVar = this.f100549j;
            String creativeId = fVar != null ? fVar.f101207c : "";
            if (this.C != null && sg.bigo.ads.common.utils.q.a((CharSequence) creativeId)) {
                creativeId = this.C.getCreativeId();
            }
            float fA = (sg.bigo.ads.ad.b.e.a(creativeId, 4) * 0.5f) + 3.5f;
            d dVar = new d();
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.inter_title);
            TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.inter_description);
            if (textView != null) {
                dVar.b(textView);
            }
            if (textView2 != null) {
                dVar.b(textView2);
            }
            sg.bigo.ads.api.a.m mVar = this.f100542c;
            int iA = mVar != null ? mVar.a("video_play_page.card_background_colour") : -1;
            if (iA == 1) {
                bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
                viewFindViewById2.setBackgroundColor(-1);
                dVar.a(-1);
            } else {
                if (iA == 2) {
                    viewFindViewById2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    dVar.a(ViewCompat.MEASURED_STATE_MASK);
                } else {
                    sg.bigo.ads.ad.interstitial.e.b bVar = new sg.bigo.ads.ad.interstitial.e.b(sg.bigo.ads.common.utils.e.a(imageView.getContext(), 12), 0.0f, new sg.bigo.ads.ad.interstitial.e.a.b() { // from class: sg.bigo.ads.ad.interstitial.a.13
                    }.c());
                    Drawable drawableA = bVar.a();
                    if (drawableA != null) {
                        viewFindViewById2.setBackground(drawableA);
                    } else if (viewFindViewById2 instanceof sg.bigo.ads.common.view.a.c) {
                        ((sg.bigo.ads.common.view.a.c) viewFindViewById2).setBlurStyle(bVar);
                    }
                }
                bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half_white);
            }
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                imageView.setVisibility(0);
            }
        }
        viewFindViewById.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.14
            @Override // java.lang.Runnable
            public final void run() {
                AnimationSet animationSet = new AnimationSet(true);
                Interpolator interpolatorA = sg.bigo.ads.common.utils.b.a(2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(interpolatorA);
                animationSet.addAnimation(alphaAnimation);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 1.0f, 1, 1.0f);
                scaleAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(interpolatorA);
                animationSet.addAnimation(scaleAnimation);
                viewFindViewById.startAnimation(animationSet);
            }
        });
    }

    private void ar() {
        ViewGroup viewGroup;
        sg.bigo.ads.api.a.m mVar;
        if ((aj() instanceof sg.bigo.ads.ad.interstitial.d.a) || (viewGroup = this.D) == null) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.inter_download_msg);
        if (viewFindViewById != null) {
            f fVar = this.f100549j;
            if (fVar == null || !fVar.f101208d) {
                viewFindViewById.setVisibility(8);
                return;
            }
            Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
            if (button != null) {
                button.setText(R.string.bigo_ad_cta_download_default);
            }
            aj().a(viewGroup, viewFindViewById, ai(), 8, this.f100547h.f101809i, new View[0]);
        }
        if (aH()) {
            IconListView iconListView = (IconListView) viewGroup.findViewById(R.id.inter_iconlist_download_msg_list);
            if (this.f100549j == null || iconListView == null) {
                return;
            }
            boolean z10 = true;
            if (aH() && P() && (mVar = this.f100542c) != null) {
                int iA = mVar.a("video_play_page.background_colour");
                if (!aH() ? iA == 1 : iA == 1) {
                    z10 = false;
                }
            }
            iconListView.setThemeWhite(z10);
            iconListView.a(this.f100549j);
            iconListView.setVisibility(0);
        }
    }

    private void as() {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
        TextView textView = (TextView) this.D.findViewById(R.id.inter_company);
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        if (mVar != null) {
            int iA = mVar.a("video_play_page.cta_color");
            int iA2 = this.f100542c.a("endpage.cta_color");
            int iA3 = this.f100542c.a("layer.cta_color");
            this.f100552m = r.a(((s) this.f101384y).H(), iA, null);
            this.f100553n = r.a(((s) this.f101384y).H(), iA2, null);
            this.f100554o = r.a(((s) this.f101384y).H(), iA3, null);
            if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
                if (button != null) {
                    button.setBackgroundColor(this.f100552m);
                }
                if (textView != null) {
                    textView.setTextColor(this.f100552m);
                }
            }
        }
        if (!P() || this.f100542c == null) {
            return;
        }
        View viewFindViewById = this.D.findViewById(R.id.inter_media_container);
        int iA4 = this.f100542c.a("video_play_page.background_colour");
        if (aH()) {
            if (iA4 != 4 && iA4 != 5) {
                return;
            }
        } else if (iA4 != 3 && iA4 != 4) {
            return;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#66000000", -7829368));
            TextView textView2 = (TextView) this.D.findViewById(R.id.inter_warning);
            if (textView2 != null) {
                textView2.setTextColor(sg.bigo.ads.common.utils.q.b("#66FFFFFF", -1));
            }
        }
    }

    @NonNull
    private LandingPageStyleConfig at() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        if (mVar == null || !this.f100543d) {
            mVar = null;
        }
        int iA = sg.bigo.ads.ad.interstitial.h.a.a(mVar);
        int iB = sg.bigo.ads.ad.interstitial.h.a.b(mVar);
        sg.bigo.ads.ad.interstitial.h.a aVar = this.f100559t;
        int iA2 = (aVar == null || !aVar.d()) ? 0 : aj().f101740i;
        if (iA2 == 0) {
            iA2 = r.a(this.C, 0);
        }
        int i10 = iA2;
        int measuredHeight = 0;
        Class<? extends sg.bigo.ads.controller.landing.d> clsI = i(iA);
        ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        return new LandingPageStyleConfig(clsI, 9, iA, iB, measuredHeight, i10, 0.8f);
    }

    private boolean au() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        return mVar != null && mVar.c("layer.is_show_layer");
    }

    private void av() {
        ViewGroup viewGroup;
        if (!P() || (viewGroup = this.D) == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_description);
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        int i10 = (mVar != null ? mVar.a("video_play_page.background_colour") : -1) == 1 ? ViewCompat.MEASURED_STATE_MASK : -1;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        if (textView2 != null) {
            textView2.setTextColor(i10);
        }
    }

    protected static Class<? extends sg.bigo.ads.controller.landing.d> i(int i10) {
        return i10 == 0 ? sg.bigo.ads.ad.interstitial.f.d.class : (7 == i10 || 8 == i10) ? sg.bigo.ads.ad.interstitial.f.a.class : sg.bigo.ads.ad.interstitial.f.e.class;
    }

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
            int i10 = this.f100547h.f101803c;
            int iB = (i10 >= 0 || ((s) this.f101384y).f().x() == 4) ? i10 : 0;
            if (((s) this.f101384y).B()) {
                sg.bigo.ads.core.a.a aVarI = ((s) this.f101384y).f();
                if (this.f100555p.get() && aVarI.bh() == null) {
                    iB = w.b(this.f100547h.f101815o);
                }
            }
            this.A.a(iB, (AdCountDownButton.b) null);
        }
    }

    protected final void B() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.getVisibility() != 0) {
            return;
        }
        this.A.clearAnimation();
        this.A.setVisibility(4);
    }

    protected boolean C() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        sg.bigo.ads.api.a.m mVar;
        int i10;
        View view;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13 = R.layout.bigo_ad_view_click_guide;
        if (aH()) {
            sg.bigo.ads.api.a.m mVar2 = this.f100542c;
            iA = mVar2 != null ? mVar2.a("layer.guided_click") : -1;
            if (iA == 1) {
                i13 = R.layout.bigo_ad_view_click_guide_landscape_1;
            } else if (iA == 3) {
                i13 = R.layout.bigo_ad_view_click_guide_landscape_3;
            } else {
                i13 = R.layout.bigo_ad_view_click_guide_landscape_2;
                iA = 2;
            }
        }
        if (this.D == null || e_() == 2 || e_() == 8 || !this.f100547h.f101804d) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.h.a aVar = this.f100559t;
        if (aVar != null) {
            viewFindViewById = aVar.a(this, this.D, ai(), new u.a() { // from class: sg.bigo.ads.ad.interstitial.a.4
                @Override // sg.bigo.ads.ad.interstitial.u.a
                public final void a(View view2) {
                    a.this.a(view2);
                }
            });
        } else {
            Context context = this.D.getContext();
            ViewGroup viewGroup = this.D;
            sg.bigo.ads.common.utils.a.a(context, i13, viewGroup, viewGroup != null);
            View viewFindViewById4 = this.D.findViewById(R.id.inter_click_guide_container);
            if (viewFindViewById4 != null) {
                aj().a(this.D, viewFindViewById4, ai(), 10, this.f100547h.f101813m, viewFindViewById4);
                viewFindViewById4.setTag(12);
                Button button = (Button) viewFindViewById4.findViewById(R.id.inter_btn_cta);
                if (button != null) {
                    button.setTag(17);
                }
                viewFindViewById4.findViewById(R.id.inter_icon).setTag(17);
                if (this.f100543d) {
                    if (button != null) {
                        button.setBackgroundColor(this.f100554o);
                    }
                    if (this.f100547h.f101812l) {
                        a(viewFindViewById4, 10, ((s) this.f101384y).H(), this.f100547h.f101813m);
                    } else {
                        a(viewFindViewById4, 10, q.F, 0);
                    }
                } else {
                    a(viewFindViewById4, 5, ((s) this.f101384y).H(), this.f100547h.f101813m);
                }
                c.b(viewFindViewById4);
                int i14 = R.id.inter_click_guide;
                View viewFindViewById5 = viewFindViewById4.findViewById(i14);
                View viewFindViewById6 = viewFindViewById4.findViewById(R.id.inter_click_ripple);
                if (viewFindViewById5 != null && viewFindViewById6 != null) {
                    c.a(viewFindViewById5, viewFindViewById6);
                }
                if (iA == 1 && (viewFindViewById3 = viewFindViewById4.findViewById(R.id.inter_btn_cta_layout)) != null) {
                    c.e(viewFindViewById3);
                } else if (iA == 3 && (viewFindViewById2 = viewFindViewById4.findViewById(i14)) != null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(600L);
                    alphaAnimation.setStartOffset(1000L);
                    alphaAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -sg.bigo.ads.common.utils.e.a(viewFindViewById2.getContext(), 160));
                    translateAnimation.setDuration(600L);
                    translateAnimation.setStartOffset(1000L);
                    translateAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                    AnimationSet animationSet = new AnimationSet(false);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    alphaAnimation.setRepeatCount(Integer.MAX_VALUE);
                    alphaAnimation.setRepeatMode(1);
                    translateAnimation.setRepeatCount(Integer.MAX_VALUE);
                    translateAnimation.setRepeatMode(1);
                    viewFindViewById2.startAnimation(animationSet);
                }
            }
            viewFindViewById = this.D.findViewById(R.id.bigo_ad_layout_click_guide);
            a(viewFindViewById);
            if (viewFindViewById == null) {
                viewFindViewById = viewFindViewById4;
            }
        }
        if (viewFindViewById != null && (mVar = this.f100542c) != null) {
            int iA = this.f100543d ? mVar.a("layer.below_area_dp") : 0;
            if (this.f100543d && this.f100542c.a("layer.below_area_clickable") == 1) {
                i10 = 0;
                view = viewFindViewById;
                i11 = iA;
                z10 = true;
            } else {
                i10 = 0;
                view = viewFindViewById;
                i11 = iA;
                z10 = false;
            }
            int iA2 = this.f100543d ? this.f100542c.a("layer.up_area_dp") : i10;
            if (this.f100543d && this.f100542c.a("layer.up_area_clickable") == 1) {
                i12 = iA2;
                z11 = true;
            } else {
                int i15 = iA2;
                z11 = i10;
                i12 = i15;
            }
            a(view, i11, z10, i12, z11, 10, this.f100547h.f101813m);
        }
        f(9);
        a(((long) this.f100547h.f101805e) * 1000);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final int D() {
        int iE_ = e_();
        int iD = d();
        switch (iE_) {
            case 2:
                if (iD == 5) {
                    return 4;
                }
            case 1:
                return 2;
            case 3:
                return 3;
            case 4:
            default:
                return 1;
            case 5:
            case 6:
                return 4;
            case 7:
            case 8:
                return 5;
            case 9:
                if (iD == 1) {
                    return 2;
                }
                return iD == 5 ? 4 : 9;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void E() {
        if (I()) {
            at();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        super.F();
        this.f100550k.removeCallbacksAndMessages(null);
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f100558s;
        if (cVar != null) {
            IconAds iconAds = cVar.f101143e;
            if (iconAds != null) {
                iconAds.destroy();
            }
            sg.bigo.ads.common.utils.n nVar = cVar.f101150l;
            if (nVar != null) {
                nVar.b();
                cVar.f101150l = null;
            }
            sg.bigo.ads.common.utils.n nVar2 = cVar.f101151m;
            if (nVar2 != null) {
                nVar2.b();
                cVar.f101151m = null;
            }
            cVar.f101155q.clear();
            cVar.f101156r.clear();
            cVar.f101157s.clear();
            cVar.f101158t.clear();
            cVar.f101152n = true;
            cVar.b();
            cVar.c();
        }
        sg.bigo.ads.common.e.a.b(this.A, this.K);
    }

    protected final void G() {
        TextView textView = (TextView) this.D.findViewById(R.id.inter_advertiser);
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f100551l)) {
            textView.setVisibility(8);
            return;
        }
        if (!aH() && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(2, R.id.inter_ad_info);
            layoutParams.addRule(12, 0);
            layoutParams.leftMargin = 18;
            layoutParams.setMarginStart(18);
            layoutParams.bottomMargin = 15;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.f100551l);
        }
    }

    protected final boolean H() {
        at();
        return false;
    }

    protected final boolean I() {
        int iE_ = e_();
        return iE_ == 2 || iE_ == 6 || iE_ == 8 || iE_ == 9;
    }

    protected abstract void J();

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r0
  0x003b: PHI (r0v16 java.lang.Integer) = (r0v15 java.lang.Integer), (r0v18 java.lang.Integer) binds: [B:24:0x0050, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void K() {
        /*
            r9 = this;
            android.view.ViewGroup r0 = r9.D
            if (r0 == 0) goto Lbc
            sg.bigo.ads.api.a.m r0 = r9.f100542c
            r1 = 4
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = 2
            r4 = -1
            r5 = 1
            java.lang.String r6 = "video_play_page.background_colour"
            r7 = -7829368(0xffffffffff888888, float:NaN)
            java.lang.String r8 = "#262E33"
            if (r0 == 0) goto L64
            boolean r0 = r9.P()
            if (r0 == 0) goto L64
            sg.bigo.ads.api.a.m r0 = r9.f100542c
            int r0 = r0.a(r6)
            r6 = -100
            if (r0 != r5) goto L27
            r2 = r4
            goto L54
        L27:
            if (r0 != r3) goto L2a
            goto L54
        L2a:
            boolean r2 = r9.aH()
            r3 = 3
            if (r2 == 0) goto L48
            if (r0 != r1) goto L45
            sg.bigo.ads.ad.b.b r0 = r9.C
            java.lang.Integer r0 = sg.bigo.ads.ad.interstitial.r.a(r0)
            if (r0 == 0) goto L40
        L3b:
            int r2 = r0.intValue()
            goto L54
        L40:
            int r2 = sg.bigo.ads.common.utils.q.b(r8, r7)
            goto L54
        L45:
            if (r0 != r3) goto L53
            goto L40
        L48:
            if (r0 != r3) goto L53
            sg.bigo.ads.ad.b.b r0 = r9.C
            java.lang.Integer r0 = sg.bigo.ads.ad.interstitial.r.a(r0)
            if (r0 == 0) goto L40
            goto L3b
        L53:
            r2 = r6
        L54:
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            if (r2 == r6) goto L60
            r0.a(r1, r2)
            return
        L60:
            r0.a(r1)
            return
        L64:
            boolean r0 = r9.aH()
            if (r0 == 0) goto Lb3
            sg.bigo.ads.api.a.m r0 = r9.f100542c
            if (r0 == 0) goto Lbc
            int r0 = r0.a(r6)
            if (r0 != r5) goto L7e
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1, r4)
            return
        L7e:
            if (r0 != r3) goto L8a
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1, r2)
            return
        L8a:
            if (r0 != r1) goto L98
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            int r2 = r9.f100552m
            r0.a(r1, r2)
            return
        L98:
            r1 = 5
            if (r0 != r1) goto La5
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1)
            return
        La5:
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            int r2 = sg.bigo.ads.common.utils.q.b(r8, r7)
            r0.a(r1, r2)
            return
        Lb3:
            sg.bigo.ads.ad.interstitial.t r0 = r9.aj()
            android.view.ViewGroup r1 = r9.D
            r0.a(r1)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.K():void");
    }

    public final boolean L() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        return mVar != null && 1 == mVar.a("endpage.is_endpage", 1);
    }

    public final boolean M() {
        sg.bigo.ads.api.a.m mVar;
        return (this instanceof sg.bigo.ads.ad.interstitial.g.b) && (mVar = this.f100542c) != null && 1 == mVar.a("endpage.ep_sprt", 0);
    }

    public final boolean N() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        return (mVar == null || mVar.a("mid_page.show_time") != 0 || L() || au() || this.f100555p.get()) ? false : true;
    }

    public final boolean O() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        return (mVar == null || mVar.a("mid_page.show_time") <= 0 || L() || au() || this.f100555p.get()) ? false : true;
    }

    protected final boolean P() {
        int iY = Y();
        return iY == R.layout.bigo_ad_activity_interstitial_percent_warning || iY == R.layout.bigo_ad_activity_interstitial_percent_warning_landscape;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    @CallSuper
    public void a_(int i10) {
        this.O = true;
    }

    @NonNull
    protected abstract w b();

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public final void b_(int i10) {
        if (e_() == 0 && i10 == 0 && j() && !k() && this.O && this.B.get()) {
            g();
        }
    }

    public final int d() {
        synchronized (this.G) {
            try {
                if (this.G.size() < 2) {
                    return -1;
                }
                return this.G.get(1).intValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void e() {
        synchronized (this.J) {
            try {
                WeakHashMap<Object, Runnable> weakHashMapRemove = this.J.remove(1);
                if (!sg.bigo.ads.common.utils.k.a(weakHashMapRemove)) {
                    Iterator<Map.Entry<Object, Runnable>> it = weakHashMapRemove.entrySet().iterator();
                    while (it.hasNext()) {
                        Runnable value = it.next().getValue();
                        if (value != null) {
                            sg.bigo.ads.common.n.d.a(2, value);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int e_() {
        synchronized (this.G) {
            try {
                if (this.G.isEmpty()) {
                    return -1;
                }
                return this.G.get(0).intValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void f(int i10) {
        p pVar;
        sg.bigo.ads.ad.b.b bVar;
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f100558s;
        if (cVar != null) {
            c.a aVar = cVar.f101145g;
            if (i10 == 0) {
                aVar.f101172a = 1;
            } else if (i10 == 1) {
                aVar.f101172a = 3;
            } else if (i10 == 9) {
                aVar.f101172a = 4;
            } else if (i10 == 10) {
                aVar.f101172a = 2;
            }
        }
        synchronized (this.G) {
            synchronized (this.G) {
                this.G.remove(Integer.valueOf(i10));
            }
            this.G.add(0, Integer.valueOf(i10));
        }
        int iD = d();
        int iE_ = e_();
        if (iE_ != iD) {
            l(iD);
        }
        sg.bigo.ads.ad.b.b bVar2 = this.C;
        if (bVar2 != null) {
            bVar2.d(i10);
        }
        if (((i10 == 0) | (i10 == 1) | (i10 == 2) | (i10 == 4) | (i10 == 5) | (i10 == 6) | (i10 == 7) | (i10 == 8) | (i10 == 9)) && (bVar = this.C) != null) {
            ((sg.bigo.ads.core.a.a) bVar.f()).b(SystemClock.elapsedRealtime());
        }
        if (i10 != 0 && i10 != 10 && i10 != 3 && (pVar = this.f100557r) != null) {
            pVar.b();
        }
        switch (iE_) {
            case 0:
                sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = this.f100548i;
                if (bVar3 != null) {
                    bVar3.a(1, 1);
                }
                l lVar = this.H;
                lVar.a(lVar.f101418b);
                return;
            case 1:
                sg.bigo.ads.ad.interstitial.multi_img.b bVarG = ((s) this.f101384y).G();
                if (bVarG != null) {
                    bVarG.a(2, 1);
                }
                l lVar2 = this.H;
                lVar2.a(lVar2.f101420d);
                w wVar = this.f100547h;
                if (wVar == null || !wVar.f101804d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 2:
            case 8:
            case 9:
                k(R.drawable.bigo_ad_ic_close);
                l lVar3 = this.H;
                lVar3.a(lVar3.f101421e);
                return;
            case 3:
            case 6:
            default:
                return;
            case 4:
                l lVar4 = this.H;
                lVar4.a(lVar4.f101423g);
                return;
            case 5:
                l lVar5 = this.H;
                lVar5.a(lVar5.f101422f);
                w wVar2 = this.f100547h;
                if (wVar2 == null || !wVar2.f101804d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 7:
                l lVar6 = this.H;
                lVar6.a(lVar6.f101424h);
                w wVar3 = this.f100547h;
                if (wVar3 == null || !wVar3.f101804d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 10:
                l lVar7 = this.H;
                lVar7.a(lVar7.f101419c);
                return;
        }
    }

    protected abstract boolean f(boolean z10);

    @Override // sg.bigo.ads.ad.c.a
    public final boolean f_() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void g() {
        /*
            r3 = this;
            super.g()
            int r0 = r3.e_()
            sg.bigo.ads.ad.interstitial.p r1 = r3.f100557r
            if (r1 == 0) goto Le
            r1.c()
        Le:
            if (r0 != 0) goto L21
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f101384y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f101418b
        L1c:
            r0.b(r1, r2)
            goto L8b
        L21:
            r1 = 10
            if (r0 != r1) goto L32
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f101384y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f101419c
            goto L1c
        L32:
            r1 = 1
            if (r0 != r1) goto L42
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f101384y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f101420d
            goto L1c
        L42:
            r1 = 2
            if (r0 == r1) goto L7e
            r1 = 8
            if (r0 == r1) goto L7e
            r1 = 9
            if (r0 != r1) goto L4e
            goto L7e
        L4e:
            r1 = 5
            if (r0 != r1) goto L5e
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f101384y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f101422f
            goto L1c
        L5e:
            r1 = 4
            if (r0 != r1) goto L6e
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f101384y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f101423g
            goto L1c
        L6e:
            r1 = 7
            if (r0 != r1) goto L8b
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f101384y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f101424h
            goto L1c
        L7e:
            sg.bigo.ads.ad.interstitial.l r0 = r3.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r1 = r3.f101384y
            sg.bigo.ads.ad.interstitial.s r1 = (sg.bigo.ads.ad.interstitial.s) r1
            sg.bigo.ads.core.a.a r1 = r1.f()
            int r2 = r0.f101421e
            goto L1c
        L8b:
            sg.bigo.ads.ad.interstitial.e.c r0 = r3.f100558s
            if (r0 == 0) goto Lbe
            r1 = 0
            r0.f101152n = r1
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f101149k
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f101147i
            sg.bigo.ads.ad.interstitial.e.c.b(r1, r2)
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f101148j
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f101146h
            sg.bigo.ads.ad.interstitial.e.c.b(r1, r2)
            sg.bigo.ads.common.utils.n r1 = r0.f101150l
            if (r1 == 0) goto Laf
            boolean r1 = r1.e()
            if (r1 == 0) goto Laf
            sg.bigo.ads.common.utils.n r1 = r0.f101150l
            r1.c()
        Laf:
            sg.bigo.ads.common.utils.n r1 = r0.f101151m
            if (r1 == 0) goto Lbe
            boolean r1 = r1.e()
            if (r1 == 0) goto Lbe
            sg.bigo.ads.common.utils.n r0 = r0.f101151m
            r0.c()
        Lbe:
            sg.bigo.ads.ad.interstitial.h.a r0 = r3.f100559t
            if (r0 == 0) goto Lc5
            r0.b()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.g():void");
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected void h(int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        ((s) this.f101384y).E = this.H;
        ap();
        s();
        as();
        ar();
        t();
        w();
        f(0);
        J();
        ((s) this.f101384y).f().a(this.f100543d);
        a(this.D);
        aq();
        av();
    }

    protected final boolean j() {
        Object objAj = aj();
        if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objAj).K();
        }
        return false;
    }

    protected final boolean k() {
        if (e_() != 0 || !this.O) {
            return false;
        }
        Object objAj = aj();
        if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objAj).L();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    @CallSuper
    protected void l() {
        super.l();
        this.f100551l = ((s) this.f101384y).f().i();
        sg.bigo.ads.api.a.m mVarE = ((s) this.f101384y).f().e();
        this.f100542c = mVarE;
        if (mVarE != null) {
            this.f100543d = true;
        }
        this.f100541b = ((s) this.f101384y).f().d().q();
        this.f100547h = b();
        m();
    }

    protected void m() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        if (mVar == null || !this.f100543d) {
            sg.bigo.ads.api.a.m mVar2 = this.f100541b;
            if (mVar2 != null) {
                a(mVar2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.h.a aVarA = sg.bigo.ads.ad.interstitial.h.a.a(this.L, this.C, mVar, aH());
        this.f100559t = aVarA;
        this.f100558s = new sg.bigo.ads.ad.interstitial.e.c((s) this.f101384y, this.f100542c, aVarA);
        a(this.f100542c);
        this.C.f100356w = new WeakReference<>(this);
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    protected final int n() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        if (mVar == null) {
            return 0;
        }
        if (this.f100543d) {
            return mVar.a("video_play_page.ad_component_layout");
        }
        return 1;
    }

    protected void o() {
        this.f100557r = new p(this.L, ((s) this.f101384y).H(), ((s) this.f101384y).f(), this.f100542c, aH(), this.f100549j, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.9
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(0.0f);
                }
                a.this.f(10);
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.10
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(1.0f);
                }
                a aVar = a.this;
                aVar.f(aVar.d());
                a.this.aF();
                if (a.this.e_() == 0) {
                    a.this.g();
                }
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.11
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(false);
            }
        });
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.12
            @Override // java.lang.Runnable
            public final void run() {
                final p pVar = a.this.f100557r;
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Active mid page.");
                sg.bigo.ads.api.a.m mVar = pVar.f101568d;
                Context context = pVar.f101565a;
                if (mVar == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty style config.");
                    return;
                }
                if (context == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty context.");
                    return;
                }
                int iA = mVar.a("mid_page.show_time");
                if (iA != -1 && iA != 0 && iA != 3 && iA != 5 && iA != 10) {
                    iA = 0;
                }
                pVar.E = iA;
                if (iA == 0) {
                    pVar.f101573i = false;
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to show_time in config.");
                    return;
                }
                p.d dVar = pVar.A;
                dVar.f101701b = mVar.a("mid_page.pop_layout");
                dVar.f101700a = mVar.a("mid_page.pop_method");
                dVar.f101702c = mVar.a("mid_page.cta_color");
                p.a aVar = pVar.f101590z;
                aVar.f101683p = pVar;
                aVar.f101672e = mVar.c("mid_page.is_cta_show_animation");
                aVar.f101668a = mVar.a("mid_page.click_type");
                aVar.f101669b = mVar.c("mid_page.ad_component_clickable_switch");
                aVar.f101670c = mVar.c("mid_page.media_view_clickable_switch");
                aVar.f101671d = mVar.c("mid_page.other_space_clickable_switch");
                int iA2 = mVar.a("mid_page.below_area_dp");
                if (iA2 > 0) {
                    aVar.f101673f = sg.bigo.ads.common.utils.e.a(context, iA2);
                }
                aVar.f101674g = mVar.a("mid_page.below_area_clickable") == 1;
                int iA3 = mVar.a("mid_page.up_area_dp");
                if (iA3 > 0) {
                    aVar.f101675h = sg.bigo.ads.common.utils.e.a(context, iA3);
                }
                aVar.f101676i = mVar.a("mid_page.up_area_clickable") == 1;
                aVar.f101677j = sg.bigo.ads.common.utils.e.c(context);
                aVar.f101681n = new View(context);
                aVar.f101682o = new View(context);
                final Context context2 = pVar.f101565a;
                final sg.bigo.ads.ad.b.b bVar = pVar.f101566b;
                final sg.bigo.ads.api.core.b bVar2 = pVar.f101567c;
                if (pVar.a(context2, bVar, bVar2, pVar.f101568d)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Start render mid page.");
                    int i10 = pVar.A.f101700a;
                    ArrayList arrayList = new ArrayList();
                    if (pVar.f101579o) {
                        arrayList.add(2);
                    } else {
                        if (i10 == 1) {
                            arrayList.add(1);
                        }
                        if (i10 == 2) {
                            arrayList.add(1);
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i10 == 3) {
                            arrayList.add(2);
                        }
                        if (i10 == 4) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i10 == 5) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i10 == 6) {
                            arrayList.add(3);
                        }
                        if (i10 == 7) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i10 == 8) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(4);
                        }
                        if (i10 == 9) {
                        }
                        pVar.f101584t = arrayList;
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.3

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ Context f101644a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ sg.bigo.ads.ad.b.b f101645b;

                            /* JADX INFO: renamed from: c */
                            final /* synthetic */ sg.bigo.ads.api.core.b f101646c;

                            AnonymousClass3(final Context context22, final sg.bigo.ads.ad.b.b bVar3, final sg.bigo.ads.api.core.b bVar22) {
                                context = context22;
                                bVar = bVar3;
                                bVar = bVar22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                p.a(p.this, context, bVar, bVar);
                            }
                        });
                    }
                    arrayList.add(4);
                    pVar.f101584t = arrayList;
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.3

                        /* JADX INFO: renamed from: a */
                        final /* synthetic */ Context f101644a;

                        /* JADX INFO: renamed from: b */
                        final /* synthetic */ sg.bigo.ads.ad.b.b f101645b;

                        /* JADX INFO: renamed from: c */
                        final /* synthetic */ sg.bigo.ads.api.core.b f101646c;

                        AnonymousClass3(final Context context22, final sg.bigo.ads.ad.b.b bVar3, final sg.bigo.ads.api.core.b bVar22) {
                            context = context22;
                            bVar = bVar3;
                            bVar = bVar22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            p.a(p.this, context, bVar, bVar);
                        }
                    });
                }
                Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!p.a(p.this)) {
                            Runnable runnable2 = p.this.f101588x;
                            if (runnable2 != null) {
                                runnable2.run();
                                p.this.f101588x = null;
                            }
                            p.this.g();
                        }
                        p.b(p.this);
                    }
                };
                int i11 = pVar.E;
                if (i11 <= 0) {
                    if (i11 != -1) {
                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page can not be shown due to invalid show delay.");
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page will be shown after video completion.");
                    pVar.f101587w = runnable;
                    pVar.a();
                    return;
                }
                pVar.f101585u = ((long) i11) * 1000;
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page will be shown after " + pVar.E + "s.");
                pVar.f101586v = runnable;
                pVar.a(pVar.f101585u);
                pVar.a();
            }
        });
    }

    @NonNull
    protected final h.a p() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        boolean z12 = false;
        if (mVar != null) {
            int iA = this.f100543d ? mVar.a("video_play_page.below_area_dp") : 0;
            boolean z13 = this.f100543d && this.f100542c.a("video_play_page.below_area_clickable") == 1;
            int iA2 = this.f100543d ? this.f100542c.a("video_play_page.up_area_dp") : 0;
            if (this.f100543d && this.f100542c.a("video_play_page.up_area_clickable") == 1) {
                z12 = true;
            }
            int iA3 = this.f100542c.a("video_play_page.click_type");
            int i13 = iA2;
            boolean z14 = z12;
            int i14 = iA;
            a(this.D, i14, z13, i13, z14, 8, iA3);
            i10 = i14;
            z10 = z13;
            i11 = i13;
            z11 = z14;
            i12 = iA3;
        } else {
            i10 = 0;
            z10 = false;
            i11 = 0;
            z11 = false;
            i12 = 0;
        }
        return new h.a(i10, z10, i11, z11, i12);
    }

    protected void q() {
        sg.bigo.ads.api.a.m mVar = this.f100542c;
        if (mVar == null || !this.f100543d) {
            return;
        }
        int iA = mVar.a("video_play_page.close_button_style");
        k(iA != 2 ? iA != 3 ? iA != 4 ? iA != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
    }

    protected int r() {
        w wVar = this.f100547h;
        if (wVar == null) {
            return 0;
        }
        return w.b(wVar.f101815o);
    }

    protected void s() {
        int iR;
        if (androidx.activity.s.a(((s) this.f101384y).f()) && ((s) this.f101384y).B()) {
            final sg.bigo.ads.core.a.a aVarI = ((s) this.f101384y).f();
            this.f100555p.set(!aVarI.aZ());
            if (this.f100555p.get() && aVarI.bh() == null && (iR = r()) > 0) {
                sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) iR) * 1000) { // from class: sg.bigo.ads.ad.interstitial.a.15
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        aVarI.bc();
                        a aVar = a.this;
                        aVar.a(aVar.f100563x, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.15.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.this.u();
                            }
                        });
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j10) {
                    }
                };
                this.f100563x = nVar;
                nVar.c();
            }
        }
    }

    @CallSuper
    protected void t() {
        final YandexWarningTextView yandexWarningTextView;
        final YandexWarningTextView yandexWarningTextView2;
        ViewGroup viewGroup = this.D;
        sg.bigo.ads.ad.b.b bVar = this.C;
        if (viewGroup == null || bVar == null) {
            return;
        }
        sg.bigo.ads.api.c.b.a(aH());
        if (v() && ((s) this.f101384y).f().w() == 2) {
            sg.bigo.ads.api.c.b.a();
        }
        ViewGroup viewGroup2 = this.D;
        if (viewGroup2 != null) {
            int i10 = R.id.inter_media;
            MediaView mediaView = (MediaView) viewGroup2.findViewById(i10);
            if (mediaView != null && P()) {
                mediaView.setImageBlurBorder(false);
                final ViewGroup viewGroup3 = this.D;
                final sg.bigo.ads.ad.b.b bVar2 = this.C;
                if (viewGroup3 != null && (yandexWarningTextView = (YandexWarningTextView) viewGroup3.findViewById(R.id.inter_warning)) != null) {
                    if (bVar2 == null || ((sg.bigo.ads.core.a.a) bVar2.f()).B() == null || ((sg.bigo.ads.core.a.a) bVar2.f()).B().f() < 0) {
                        yandexWarningTextView2 = yandexWarningTextView;
                    } else {
                        final int iF = ((sg.bigo.ads.core.a.a) bVar2.f()).B().f();
                        final View viewFindViewById = viewGroup3.findViewById(R.id.inter_ad_info_exclude_warning);
                        final MediaView mediaView2 = (MediaView) viewGroup3.findViewById(i10);
                        final RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup3.findViewById(R.id.inter_media_layout);
                        float f10 = iF * 0.01f;
                        final float f11 = f10 > 0.15f ? 0.15f : f10;
                        if (viewFindViewById != null) {
                            yandexWarningTextView.setIsHorizontal(false);
                            sg.bigo.ads.common.utils.u.a(viewFindViewById, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.r.1

                                /* JADX INFO: renamed from: a */
                                final /* synthetic */ View f101708a;

                                /* JADX INFO: renamed from: b */
                                final /* synthetic */ YandexWarningTextView f101709b;

                                /* JADX INFO: renamed from: c */
                                final /* synthetic */ RoundedFrameLayout f101710c;

                                /* JADX INFO: renamed from: d */
                                final /* synthetic */ float f101711d;

                                /* JADX INFO: renamed from: e */
                                final /* synthetic */ ViewGroup f101712e;

                                /* JADX INFO: renamed from: f */
                                final /* synthetic */ sg.bigo.ads.ad.b.b f101713f;

                                /* JADX INFO: renamed from: g */
                                final /* synthetic */ MediaView f101714g;

                                /* JADX INFO: renamed from: h */
                                final /* synthetic */ int f101715h;

                                AnonymousClass1(final View viewFindViewById2, final YandexWarningTextView yandexWarningTextView3, final RoundedFrameLayout roundedFrameLayout2, final float f112, final ViewGroup viewGroup32, final sg.bigo.ads.ad.b.b bVar22, final MediaView mediaView22, final int iF2) {
                                    view = viewFindViewById2;
                                    yandexWarningTextView = yandexWarningTextView3;
                                    roundedFrameLayout = roundedFrameLayout2;
                                    f = f112;
                                    viewGroup = viewGroup32;
                                    bVar = bVar22;
                                    mediaView = mediaView22;
                                    i = iF2;
                                }

                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                    int measuredHeight = view.getMeasuredHeight();
                                    int iC = sg.bigo.ads.common.utils.e.c(view.getContext());
                                    if (measuredHeight <= 0) {
                                        measuredHeight = sg.bigo.ads.common.utils.e.a(view.getContext(), 130);
                                    }
                                    int paddingTop = yandexWarningTextView.getPaddingTop();
                                    int paddingBottom = yandexWarningTextView.getPaddingBottom();
                                    int iA = sg.bigo.ads.common.utils.e.a(yandexWarningTextView.getContext(), 16);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yandexWarningTextView.getLayoutParams();
                                    int i11 = marginLayoutParams.topMargin;
                                    if (iC < 2000) {
                                        iA *= 2;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                                    int i12 = marginLayoutParams2.topMargin;
                                    int i13 = marginLayoutParams2.bottomMargin;
                                    int i14 = marginLayoutParams2.leftMargin;
                                    int i15 = marginLayoutParams2.rightMargin;
                                    int iRound = Math.round(f * iC) + paddingBottom + paddingTop;
                                    int i16 = (((((iC - measuredHeight) - iRound) - i11) - iA) - i12) - i13;
                                    if (iC <= 1000) {
                                        i16 = iC / 2;
                                        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
                                        if (textView != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                                            marginLayoutParams3.topMargin = 0;
                                            textView.setLayoutParams(marginLayoutParams3);
                                        }
                                        ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_btn_class);
                                        if (viewGroup4 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) viewGroup4.getLayoutParams();
                                            marginLayoutParams4.topMargin = 0;
                                            viewGroup4.setLayoutParams(marginLayoutParams4);
                                        }
                                        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_title);
                                        if (textView2 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                                            marginLayoutParams5.topMargin = 0;
                                            textView2.setLayoutParams(marginLayoutParams5);
                                        }
                                    }
                                    int i17 = (view.getContext().getResources().getDisplayMetrics().widthPixels - i14) - i15;
                                    sg.bigo.ads.common.p pVarA = r.a(bVar);
                                    sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarA.f102604b, pVarA.f102605c, i17, i16);
                                    roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(r1.getContext(), 8));
                                    marginLayoutParams2.setMargins(i14, i12, i15, i13);
                                    marginLayoutParams2.height = pVarA2.f102605c;
                                    marginLayoutParams2.width = pVarA2.f102604b;
                                    sg.bigo.ads.common.utils.u.c(mediaView, -1, -1);
                                    roundedFrameLayout.setLayoutParams(marginLayoutParams2);
                                    if (i == 0) {
                                        yandexWarningTextView.setVisibility(8);
                                        return;
                                    }
                                    marginLayoutParams.height = iRound;
                                    marginLayoutParams.bottomMargin = iA;
                                    yandexWarningTextView.setLayoutParams(marginLayoutParams);
                                }
                            });
                        } else {
                            final float f12 = f112;
                            yandexWarningTextView2 = yandexWarningTextView3;
                            if (iF2 != 0) {
                                yandexWarningTextView2.setIsHorizontal(true);
                                yandexWarningTextView2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.r.2

                                    /* JADX INFO: renamed from: b */
                                    final /* synthetic */ float f101717b;

                                    /* JADX INFO: renamed from: c */
                                    final /* synthetic */ sg.bigo.ads.ad.b.b f101718c;

                                    /* JADX INFO: renamed from: d */
                                    final /* synthetic */ RoundedFrameLayout f101719d;

                                    /* JADX INFO: renamed from: e */
                                    final /* synthetic */ MediaView f101720e;

                                    AnonymousClass2(final float f122, final sg.bigo.ads.ad.b.b bVar22, final RoundedFrameLayout roundedFrameLayout2, final MediaView mediaView22) {
                                        f = f122;
                                        bVar = bVar22;
                                        roundedFrameLayout = roundedFrameLayout2;
                                        mediaView = mediaView22;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int iC = sg.bigo.ads.common.utils.e.c(yandexWarningTextView.getContext());
                                        int i11 = yandexWarningTextView.getContext().getResources().getDisplayMetrics().widthPixels;
                                        int iRound = Math.round(f * iC) + yandexWarningTextView.getPaddingBottom() + yandexWarningTextView.getPaddingTop();
                                        ViewGroup.LayoutParams layoutParams = yandexWarningTextView.getLayoutParams();
                                        int iA = sg.bigo.ads.common.utils.e.a(yandexWarningTextView.getContext(), 20);
                                        int i12 = (i11 / 2) - (iA * 3);
                                        sg.bigo.ads.common.p pVarA = r.a(bVar);
                                        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(r5.getContext(), 8));
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                                        marginLayoutParams.setMargins(iA, iA, iA, iA);
                                        if (pVarA.getHeight() <= pVarA.getWidth()) {
                                            marginLayoutParams.width = i12;
                                            marginLayoutParams.height = (int) (((pVarA.getHeight() * 1.0f) * i12) / pVarA.getWidth());
                                            sg.bigo.ads.common.utils.u.c(mediaView, -1, -1);
                                        }
                                        roundedFrameLayout.setLayoutParams(marginLayoutParams);
                                        layoutParams.height = iRound;
                                        yandexWarningTextView.setLayoutParams(layoutParams);
                                    }
                                });
                            }
                        }
                    }
                    yandexWarningTextView2.setVisibility(8);
                }
            }
        }
        aj().a(viewGroup, viewGroup, ai(), Z() ? 8 : 1, this.f100547h.f101809i, this.A);
    }

    protected void u() {
    }

    protected boolean v() {
        if (!this.f100543d) {
            return false;
        }
        switch (n()) {
            case 6:
                this.f100546g = false;
                this.f100545f = false;
                if (!aH()) {
                }
                break;
            case 7:
            case 8:
            case 9:
                this.f100546g = false;
                this.f100545f = false;
                break;
            case 10:
                this.f100546g = false;
                this.f100545f = true;
                break;
            case 11:
            case 12:
                this.f100546g = true;
                this.f100545f = false;
                break;
            default:
                this.f100546g = false;
                this.f100545f = false;
                break;
        }
        return false;
    }

    protected void w() {
        sg.bigo.ads.api.a.m mVar;
        if (this.f100543d && (mVar = this.f100542c) != null) {
            long jA = ((long) mVar.a("video_play_page.guided_click_gesture_show_time")) * 1000;
            if (jA == 0) {
                return;
            }
            this.f100561v = new AnonymousClass2(jA);
        }
    }

    protected final void x() {
        final View viewFindViewById;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_slide_gesture_contain)) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.11

            /* JADX INFO: renamed from: a */
            final /* synthetic */ View f100695a;

            AnonymousClass11(final View viewFindViewById2) {
                view = viewFindViewById2;
            }

            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                sg.bigo.ads.common.utils.u.b(view);
            }
        });
        viewFindViewById2.startAnimation(alphaAnimation);
        viewFindViewById2.setVisibility(8);
    }

    protected final void y() {
        View viewFindViewById = this.D.findViewById(R.id.inter_slide_gesture_contain);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setTag(16);
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.a.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a.this.Q = (int) motionEvent.getX();
                    a.this.R = (int) motionEvent.getY();
                } else if (action == 1 && a.a(a.this.Q, a.this.R, (int) motionEvent.getX(), (int) motionEvent.getY()) > 10.0d) {
                    a.this.x();
                    ((s) a.this.f101384y).H().a((int) motionEvent.getX(), (int) motionEvent.getY(), a.this.Q, a.this.R, 8, ((Integer) view.getTag()).intValue());
                }
                return true;
            }
        });
    }

    @CallSuper
    protected void z() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null) {
            return;
        }
        sg.bigo.ads.common.e.a.a(adCountDownButton, this.K);
    }

    protected static boolean j(int i10) {
        return (i10 == 7 || i10 == 8 || i10 == 0) ? false : true;
    }

    private void l(int i10) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVarG;
        if (i10 != 0) {
            if (i10 == 1 && (bVarG = ((s) this.f101384y).G()) != null) {
                bVarG.a(2, 2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f100548i;
        if (bVar != null) {
            bVar.a(1, 2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public final void c(int i10) {
        if (e_() == 0 && i10 == 0 && j() && !k() && this.O && !this.B.get()) {
            i();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public void d(int i10) {
        this.O = false;
        Runnable runnable = this.P;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(2, runnable);
            this.P = null;
        } else if (this.B.get()) {
            g();
        }
    }

    protected final void e(int i10) {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_ad_label);
        if (aH()) {
            if (TextUtils.isEmpty(this.f100551l) || textView2 == null || textView2.getContext() == null) {
                return;
            }
            String strA = sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]);
            if (P()) {
                textView2.setText(strA + " · " + this.f100551l);
                return;
            }
            textView2.setText(this.f100551l + " · " + strA);
            return;
        }
        if (textView == null || textView2 == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f100551l)) {
            textView.setVisibility(8);
            return;
        }
        if (!P()) {
            if (i10 != R.layout.bigo_ad_activity_interstitial_native_top) {
                textView.bringToFront();
            }
            textView.setText(this.f100551l);
            textView.setPadding(sg.bigo.ads.common.utils.e.a(this.D.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
            return;
        }
        textView.setVisibility(8);
        textView2.setText(sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + this.f100551l);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final boolean f() {
        return ao();
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    protected void g(@LayoutRes int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        ((s) this.f101384y).E = this.H;
        ap();
        q();
        s();
        as();
        ar();
        t();
        w();
        f(0);
        J();
        ((s) this.f101384y).f().a(this.f100543d);
        a(this.D);
        z();
        a(((long) this.f100547h.f101802b) * 1000);
        aq();
        av();
        o();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final boolean h() {
        return ao();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void i() {
        /*
            r4 = this;
            super.i()
            int r0 = r4.e_()
            sg.bigo.ads.ad.interstitial.p r1 = r4.f100557r
            if (r1 == 0) goto Le
            r1.d()
        Le:
            r1 = 1
            if (r0 != 0) goto L22
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f101384y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f101418b
        L1d:
            r0.a(r2, r3)
            goto L8b
        L22:
            r2 = 10
            if (r0 != r2) goto L33
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f101384y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f101419c
            goto L1d
        L33:
            if (r0 != r1) goto L42
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f101384y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f101420d
            goto L1d
        L42:
            r2 = 2
            if (r0 == r2) goto L7e
            r2 = 8
            if (r0 == r2) goto L7e
            r2 = 9
            if (r0 != r2) goto L4e
            goto L7e
        L4e:
            r2 = 5
            if (r0 != r2) goto L5e
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f101384y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f101422f
            goto L1d
        L5e:
            r2 = 4
            if (r0 != r2) goto L6e
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f101384y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f101423g
            goto L1d
        L6e:
            r2 = 7
            if (r0 != r2) goto L8b
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f101384y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f101424h
            goto L1d
        L7e:
            sg.bigo.ads.ad.interstitial.l r0 = r4.H
            T extends sg.bigo.ads.ad.interstitial.k<?> r2 = r4.f101384y
            sg.bigo.ads.ad.interstitial.s r2 = (sg.bigo.ads.ad.interstitial.s) r2
            sg.bigo.ads.core.a.a r2 = r2.f()
            int r3 = r0.f101421e
            goto L1d
        L8b:
            sg.bigo.ads.ad.interstitial.e.c r0 = r4.f100558s
            if (r0 == 0) goto Lad
            r0.f101152n = r1
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f101149k
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f101147i
            sg.bigo.ads.ad.interstitial.e.c.a(r1, r2)
            sg.bigo.ads.ad.interstitial.e.a r1 = r0.f101148j
            sg.bigo.ads.ad.interstitial.e.c$b r2 = r0.f101146h
            sg.bigo.ads.ad.interstitial.e.c.a(r1, r2)
            sg.bigo.ads.common.utils.n r1 = r0.f101150l
            if (r1 == 0) goto La6
            r1.d()
        La6:
            sg.bigo.ads.common.utils.n r0 = r0.f101151m
            if (r0 == 0) goto Lad
            r0.d()
        Lad:
            sg.bigo.ads.ad.interstitial.h.a r0 = r4.f100559t
            if (r0 == 0) goto Lb4
            r0.c()
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.i():void");
    }

    @Override // sg.bigo.ads.ad.c.a
    public LandingPageStyleConfig a(Context context, String str, int i10, boolean z10) {
        LandingPageStyleConfig landingPageStyleConfig;
        p pVar;
        sg.bigo.ads.api.a.m mVar = null;
        mVar = null;
        sg.bigo.ads.api.a.m mVar2 = null;
        LandingPageStyleConfig landingPageStyleConfigAt = null;
        mVar = null;
        if (z10) {
            int iE_ = e_();
            if (iE_ == 0) {
                t tVarAj = aj();
                sg.bigo.ads.api.a.m mVar3 = this.f100542c;
                if (mVar3 == null || !this.f100543d) {
                    mVar3 = null;
                }
                int iA = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj, mVar3);
                if (j(iA)) {
                    return null;
                }
                return new LandingPageStyleConfig(i(iA), 0, iA, sg.bigo.ads.ad.interstitial.d.a.b(tVarAj, mVar3), 0, 0, 0.0f);
            }
            if (iE_ == 9) {
                sg.bigo.ads.api.a.m mVar4 = this.f100542c;
                if (mVar4 == null || !this.f100543d) {
                    mVar4 = null;
                }
                int iA2 = sg.bigo.ads.ad.interstitial.h.a.a(mVar4);
                if (j(iA2)) {
                    return null;
                }
                return new LandingPageStyleConfig(i(iA2), 9, iA2, sg.bigo.ads.ad.interstitial.h.a.b(mVar4), 0, 0, 0.0f);
            }
            if (iE_ != 10) {
                return null;
            }
            sg.bigo.ads.api.a.m mVar5 = this.f100542c;
            if (mVar5 == null || !this.f100543d) {
                mVar5 = null;
            }
            int iA3 = sg.bigo.ads.ad.interstitial.d.a.a(mVar5, "layer.webview_layout");
            if (j(iA3)) {
                return null;
            }
            return new LandingPageStyleConfig(i(iA3), 10, iA3, sg.bigo.ads.ad.interstitial.d.a.b(mVar5, "layer.webview_force_time"), 0, 0, 0.0f);
        }
        int iE_2 = e_();
        if (iE_2 != 0) {
            if (iE_2 == 9) {
                landingPageStyleConfigAt = at();
            } else if (iE_2 == 10) {
                sg.bigo.ads.api.a.m mVar6 = this.f100542c;
                if (mVar6 != null && this.f100543d) {
                    mVar2 = mVar6;
                }
                int iA4 = sg.bigo.ads.ad.interstitial.d.a.a(mVar2, "layer.webview_layout");
                int iB = sg.bigo.ads.ad.interstitial.d.a.b(mVar2, "layer.webview_force_time");
                Class<? extends sg.bigo.ads.controller.landing.d> clsI = i(iA4);
                ViewGroup viewGroup = this.D;
                landingPageStyleConfig = new LandingPageStyleConfig(clsI, 10, iA4, iB, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, r.a(this.C, 0), 0.8f);
                if (!landingPageStyleConfig.b() && (pVar = this.f100557r) != null) {
                    pVar.e();
                }
            }
            sg.bigo.ads.ad.interstitial.f.b.a(landingPageStyleConfigAt);
            return landingPageStyleConfigAt;
        }
        t tVarAj2 = aj();
        sg.bigo.ads.api.a.m mVar7 = this.f100542c;
        if (mVar7 != null && this.f100543d) {
            mVar = mVar7;
        }
        int iA5 = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj2, mVar);
        int iB2 = sg.bigo.ads.ad.interstitial.d.a.b(tVarAj2, mVar);
        float f10 = sg.bigo.ads.ad.interstitial.d.a.a(tVarAj2) ? 0.67f : 0.8f;
        Class<? extends sg.bigo.ads.controller.landing.d> clsI2 = i(iA5);
        ViewGroup viewGroup2 = this.D;
        landingPageStyleConfig = new LandingPageStyleConfig(clsI2, 0, iA5, iB2, viewGroup2 != null ? viewGroup2.getMeasuredHeight() : 0, r.a(this.C, 0), f10);
        landingPageStyleConfigAt = landingPageStyleConfig;
        sg.bigo.ads.ad.interstitial.f.b.a(landingPageStyleConfigAt);
        return landingPageStyleConfigAt;
    }

    protected void b(boolean z10) {
        sg.bigo.ads.common.utils.n nVar;
        sg.bigo.ads.common.utils.n nVar2 = this.f100561v;
        if (nVar2 != null) {
            nVar2.b();
            this.f100561v = null;
        }
        sg.bigo.ads.common.utils.n nVar3 = this.f100560u;
        if (nVar3 != null) {
            nVar3.b();
            this.f100560u = null;
        }
        if (z10 && (nVar = this.f100562w) != null) {
            nVar.b();
            this.f100562w = null;
        }
        sg.bigo.ads.common.utils.n nVar4 = this.f100563x;
        if (nVar4 != null) {
            nVar4.b();
            this.f100563x = null;
        }
    }

    @CallSuper
    protected void c(boolean z10) {
        if (z10) {
            ac();
        } else {
            ae();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final void d(boolean z10) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || (adCountDownButton.getVisibility() == 0 && this.A.f100519c)) {
            e(z10);
        } else if (this.A.getVisibility() == 0 && this.A.f100521e) {
            e(z10);
        }
    }

    protected final void e(boolean z10) {
        if (f(z10)) {
            l(e_());
            super.d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public final void a(int i10, int i11, int i12, int i13, int i14) {
        if (e_() == e_() && i14 == 0) {
            Object objAj = aj();
            if (objAj instanceof sg.bigo.ads.ad.interstitial.f.c) {
                sg.bigo.ads.ad.interstitial.f.c cVar = (sg.bigo.ads.ad.interstitial.f.c) objAj;
                cVar.a(i10, i11, i12, i13);
                if (cVar.L() && this.O && !this.B.get()) {
                    i();
                }
            }
        }
    }

    protected final void b(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.I) {
            try {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.I.remove(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void c(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.J) {
            try {
                WeakHashMap<Object, Runnable> weakHashMap = this.J.get(1);
                if (!sg.bigo.ads.common.utils.k.a(weakHashMap)) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            weakHashMap.remove(obj);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void a(long j10) {
        if (j10 <= 0) {
            A();
            return;
        }
        B();
        this.f100550k.removeCallbacks(this.S);
        this.f100550k.postDelayed(this.S, j10);
    }

    protected final void a(View view) {
        sg.bigo.ads.ad.interstitial.e.c cVar = this.f100558s;
        if (cVar == null || !(view instanceof ViewGroup)) {
            return;
        }
        sg.bigo.ads.ad.interstitial.e.c.a(cVar.f101148j, cVar.f101146h);
        final sg.bigo.ads.ad.interstitial.e.c cVar2 = this.f100558s;
        final ViewGroup viewGroup = (ViewGroup) view;
        cVar2.f101154p = false;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) cVar2.f101139a.f(), 2);
        if (viewGroup == null) {
            cVar2.a(cVar2.f101141c, "layerView is null", 2);
            return;
        }
        if (sg.bigo.ads.ad.interstitial.e.a.b.b(cVar2.f101141c)) {
            cVar2.a(cVar2.f101141c, "config is invalid", 2);
            return;
        }
        if (!cVar2.a(2)) {
            cVar2.a(cVar2.f101141c, "icon request hasScene return false", 2);
            return;
        }
        cVar2.c();
        sg.bigo.ads.ad.interstitial.e.a aVar = cVar2.f101149k;
        if (aVar != null) {
            aVar.f101108b.d();
            sg.bigo.ads.common.utils.u.b(cVar2.f101149k.f101107a);
        }
        cVar2.f101149k = null;
        final sg.bigo.ads.ad.interstitial.e.a.c cVar3 = cVar2.f101141c;
        c.b bVar = new c.b(viewGroup, cVar3) { // from class: sg.bigo.ads.ad.interstitial.e.c.4

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ViewGroup f101166a;

            /* JADX INFO: renamed from: e */
            private boolean f101168e = false;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(final ViewGroup viewGroup2, final sg.bigo.ads.ad.interstitial.e.a.b cVar32, final ViewGroup viewGroup22) {
                super(viewGroup22, cVar32, (byte) 0);
                viewGroup = viewGroup22;
                this.f101168e = false;
            }

            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            protected final void a(sg.bigo.ads.ad.interstitial.e.a aVar2) {
                sg.bigo.ads.ad.interstitial.h.a aVar3;
                RealtimeBlurLinearLayout realtimeBlurLinearLayout;
                super.a(aVar2);
                if (!this.f101168e || (aVar3 = c.this.f101142d) == null || (realtimeBlurLinearLayout = aVar2.f101107a) == null) {
                    return;
                }
                aVar3.a(realtimeBlurLinearLayout);
            }

            /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            protected final boolean a() {
                /*
                    Method dump skipped, instruction units count: 268
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.e.c.AnonymousClass4.a():boolean");
            }
        };
        cVar2.f101147i = bVar;
        bVar.d();
    }

    protected final void a(@NonNull View view, int i10, @Nullable sg.bigo.ads.core.adview.h hVar, int i11) {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            sg.bigo.ads.common.t.a.a(0, "InterstitialNativeActivityImpl", "Failed to set ad click due to native ad view is null.");
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, view, i10, hVar, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(final android.view.View r7, int r8, boolean r9, int r10, boolean r11, int r12, int r13) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof android.widget.FrameLayout
            if (r0 != 0) goto L11
            boolean r0 = r7 instanceof android.widget.RelativeLayout
            if (r0 != 0) goto L11
            java.lang.String r7 = "Failed to update up or below area click due to unsupported view."
            r8 = 0
            java.lang.String r9 = "InterstitialNativeActivityImpl"
            sg.bigo.ads.common.t.a.a(r8, r9, r7)
            return
        L11:
            r0 = r7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.content.Context r1 = r7.getContext()
            if (r1 != 0) goto L1c
            goto Lc3
        L1c:
            r2 = -1
            if (r8 <= 0) goto L74
            android.view.View r3 = new android.view.View
            r3.<init>(r1)
            int r4 = sg.bigo.ads.R.id.bigo_ad_interstitial_below_area_click
            r3.setId(r4)
            r4 = 25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.setTag(r4)
            boolean r4 = r0 instanceof android.widget.FrameLayout
            if (r4 == 0) goto L45
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r8 = sg.bigo.ads.common.utils.e.a(r1, r8)
            r5 = 80
            r4.<init>(r2, r8, r5)
        L41:
            r0.addView(r3, r4)
            goto L58
        L45:
            boolean r4 = r0 instanceof android.widget.RelativeLayout
            if (r4 == 0) goto L58
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            int r8 = sg.bigo.ads.common.utils.e.a(r1, r8)
            r4.<init>(r2, r8)
            r8 = 12
            r4.addRule(r8)
            goto L41
        L58:
            android.view.ViewGroup r8 = r6.D
            if (r9 == 0) goto L6a
            if (r8 == 0) goto L74
            T extends sg.bigo.ads.ad.interstitial.k<?> r8 = r6.f101384y
            sg.bigo.ads.ad.interstitial.s r8 = (sg.bigo.ads.ad.interstitial.s) r8
            sg.bigo.ads.ad.b.b r8 = r8.H()
            r6.a(r3, r12, r8, r13)
            goto L74
        L6a:
            if (r8 == 0) goto L74
            sg.bigo.ads.ad.interstitial.a$6 r9 = new sg.bigo.ads.ad.interstitial.a$6
            r9.<init>()
            sg.bigo.ads.ad.b.a.a(r8, r3, r12, r9, r13)
        L74:
            if (r10 <= 0) goto Lc3
            android.view.View r8 = new android.view.View
            r8.<init>(r1)
            r9 = 24
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.setTag(r9)
            boolean r9 = r0 instanceof android.widget.FrameLayout
            if (r9 == 0) goto L95
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r10 = sg.bigo.ads.common.utils.e.a(r1, r10)
            r9.<init>(r2, r10)
        L91:
            r0.addView(r8, r9)
            goto La3
        L95:
            boolean r9 = r0 instanceof android.widget.RelativeLayout
            if (r9 == 0) goto La3
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            int r10 = sg.bigo.ads.common.utils.e.a(r1, r10)
            r9.<init>(r2, r10)
            goto L91
        La3:
            if (r11 == 0) goto Lb5
            android.view.ViewGroup r7 = r6.D
            if (r7 == 0) goto Lc3
            T extends sg.bigo.ads.ad.interstitial.k<?> r7 = r6.f101384y
            sg.bigo.ads.ad.interstitial.s r7 = (sg.bigo.ads.ad.interstitial.s) r7
            sg.bigo.ads.ad.b.b r7 = r7.H()
            r6.a(r8, r12, r7, r13)
            return
        Lb5:
            sg.bigo.ads.ad.b.b r9 = r6.C
            if (r9 == 0) goto Lc3
            android.view.ViewGroup r9 = r6.D
            sg.bigo.ads.ad.interstitial.a$7 r10 = new sg.bigo.ads.ad.interstitial.a$7
            r10.<init>()
            sg.bigo.ads.ad.b.a.a(r9, r8, r12, r10, r13)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.a(android.view.View, int, boolean, int, boolean, int, int):void");
    }

    protected void a(@NonNull ViewGroup viewGroup) {
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (this.f100547h.f101801a) {
            viewGroup.setTag(11);
            a(viewGroup, 1, ((s) this.f101384y).H(), this.f100547h.f101809i);
            if (mediaView != null) {
                mediaView.b().a(false);
                return;
            }
            return;
        }
        if (!this.f100543d) {
            a(viewGroup, 8, (sg.bigo.ads.core.adview.h) null, 0);
            return;
        }
        if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a) && mediaView != null) {
            a(mediaView, 8, ((s) this.f101384y).H(), this.f100547h.f101809i);
            if (this.f100547h.f101806f) {
                mediaView.setMediaAreaClickable(true);
                mediaView.b().a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.b().a(true);
            }
        }
        if (!(aj() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
            View viewFindViewById = viewGroup.findViewById(R.id.inter_media_container);
            if (v()) {
                viewFindViewById = viewGroup.findViewById(R.id.inter_media_layout);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setTag(9);
                if (this.f100547h.f101807g) {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(true);
                    }
                    a(viewFindViewById, 8, ((s) this.f101384y).H(), this.f100547h.f101809i);
                } else {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(false);
                    }
                    a(viewFindViewById, 8, q.F, 0);
                }
            }
        }
        if (aj() instanceof sg.bigo.ads.ad.interstitial.d.a) {
            return;
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
        if (P() && aH()) {
            viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info_inner);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setTag(18);
            if (v()) {
                viewFindViewById2 = viewGroup.findViewById(R.id.inter_media_container);
                viewFindViewById2.setTag(18);
            }
            if (this.f100547h.f101808h) {
                a(viewFindViewById2, 8, ((s) this.f101384y).H(), this.f100547h.f101809i);
            } else {
                a(viewFindViewById2, 8, q.F, 0);
            }
        }
    }

    private void a(sg.bigo.ads.api.a.m mVar) {
        if (mVar == null) {
            return;
        }
        this.f100548i = ((s) this.f101384y).F();
        sg.bigo.ads.core.a.a aVarI = ((s) this.f101384y).f();
        this.f100549j = new f(mVar.a("video_play_page.gp_element"), mVar.a("video_play_page.gp_force_time"), aVarI != null ? aVarI.n() : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r11 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        if (r11 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
    
        if (r8 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void a(boolean r11) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.a(boolean):void");
    }

    protected final void a(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.I) {
            try {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.I.put(obj, 1);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC1241b
    public boolean a(@NonNull MotionEvent motionEvent, @Nullable b.a aVar, int i10) {
        boolean zB;
        AdCountDownButton adCountDownButton = this.A;
        boolean z10 = false;
        if (adCountDownButton != null) {
            if (motionEvent == null || adCountDownButton.f100522f == null) {
                zB = false;
            } else {
                zB = sg.bigo.ads.common.utils.u.b(adCountDownButton.f100522f, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            if (zB) {
                if (motionEvent.getAction() == 1) {
                    if (aVar != null && aVar.a()) {
                        z10 = true;
                    }
                    if (z10 && this.P == null) {
                        if (this.O) {
                            this.P = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AdCountDownButton adCountDownButton2 = a.this.A;
                                    if (adCountDownButton2 != null) {
                                        adCountDownButton2.a();
                                    }
                                }
                            };
                        } else {
                            AdCountDownButton adCountDownButton2 = this.A;
                            if (adCountDownButton2 != null) {
                                adCountDownButton2.a();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    protected final boolean a(Object obj, Runnable runnable) {
        Integer num;
        if (obj == null || runnable == null) {
            return false;
        }
        synchronized (this.I) {
            num = this.I.get(obj);
        }
        if (num == null) {
            runnable.run();
            return false;
        }
        synchronized (this.J) {
            try {
                WeakHashMap<Object, Runnable> weakHashMap = this.J.get(num);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap<>();
                    this.J.put(num, weakHashMap);
                }
                weakHashMap.put(obj, runnable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
