package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public class ab extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f100735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected ViewGroup f100736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f100737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f100738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f100739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f100740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f100741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f100742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f100743w;

    public ab(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, 0, mVar, cVar);
        this.f100739s = false;
        this.f100739s = 1 == mVar.a("endpage.ep_sprt", 0);
        this.f100735o = mVar.a("endpage.ad_component_layout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View a(@androidx.annotation.NonNull sg.bigo.ads.ad.interstitial.q r3, @androidx.annotation.NonNull android.view.ViewGroup r4, int r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L3b
            if (r4 != 0) goto L5
            goto L3b
        L5:
            r2.f100728j = r4
            boolean r0 = r3 instanceof sg.bigo.ads.ad.interstitial.g.b
            if (r0 == 0) goto L15
            r0 = r3
            sg.bigo.ads.ad.interstitial.g.b r0 = (sg.bigo.ads.ad.interstitial.g.b) r0
            android.view.View r0 = r0.g_()
        L12:
            r2.f100742v = r0
            goto L21
        L15:
            boolean r0 = r3 instanceof sg.bigo.ads.ad.interstitial.g.a
            if (r0 == 0) goto L21
            r0 = r3
            sg.bigo.ads.ad.interstitial.g.a r0 = (sg.bigo.ads.ad.interstitial.g.a) r0
            android.view.View r0 = r0.c()
            goto L12
        L21:
            android.view.View r0 = r2.f100742v
            if (r0 == 0) goto L36
            android.view.ViewGroup r4 = r2.f100728j
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r5.<init>(r1, r1)
            r4.addView(r0, r5)
            r2.d(r3)
            android.view.View r3 = r2.f100742v
            return r3
        L36:
            android.view.View r3 = super.a(r3, r4, r5)
            return r3
        L3b:
            android.view.ViewGroup r3 = r2.f100728j
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.ab.a(sg.bigo.ads.ad.interstitial.q, android.view.ViewGroup, int):android.view.View");
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.n nVar = this.f100743w;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.f100743w.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Type inference failed for: r1v8, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void d(final sg.bigo.ads.ad.interstitial.q r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.ab.d(sg.bigo.ads.ad.interstitial.q):void");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_single_end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void i() {
        AdOptionsView adOptionsView;
        if (m() == null || this.f100729k == null) {
            return;
        }
        String strI = ((sg.bigo.ads.core.a.a) m().f()).i();
        TextView textView = (TextView) this.f100729k.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.f100729k.findViewById(R.id.inter_ad_label);
        if (textView != null && textView2 != null) {
            textView.setVisibility(8);
            if (!TextUtils.isEmpty(strI)) {
                textView2.setText(sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + strI);
            }
        }
        TextView textView3 = this.f100730l;
        if (textView3 != null) {
            textView3.setText(m().getWarning());
        }
        ViewGroup viewGroup = this.f100729k;
        if (viewGroup == null || (adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.inter_options)) == 0) {
            return;
        }
        adOptionsView.setTag(4);
        adOptionsView.a((sg.bigo.ads.api.core.b) m().f(), ((sg.bigo.ads.core.a.a) m().f()).l());
    }

    protected int l() {
        return this.f100739s ? 14 : 4;
    }

    protected sg.bigo.ads.ad.b.b m() {
        return this.f101780f;
    }

    protected ViewGroup n() {
        return null;
    }

    protected void o() {
        ViewGroup viewGroup;
        int iL;
        sg.bigo.ads.core.adview.h hVarM;
        if (this.f100740t) {
            return;
        }
        View viewFindViewWithTag = this.f100736p.findViewWithTag(9);
        if (this.f100737q && viewFindViewWithTag != null) {
            this.f100740t = true;
            viewGroup = this.f100728j;
            iL = l();
            hVarM = m();
        } else {
            if (viewFindViewWithTag == null) {
                return;
            }
            this.f100740t = true;
            viewGroup = this.f100728j;
            iL = l();
            hVarM = sg.bigo.ads.ad.interstitial.q.F;
        }
        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewWithTag, iL, hVarM, this.f100738r);
    }

    protected int p() {
        return 40;
    }

    protected int q() {
        return 142;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.n nVar = this.f100743w;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.f100743w.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void a(int i10, boolean z10, boolean z11) {
        this.f100737q = z10;
        this.f100738r = i10;
        this.f100729k.setTag(34);
        ViewGroup viewGroup = this.f100728j;
        if (z11) {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f100729k, l(), m(), this.f100738r);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f100729k, l(), sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        o();
        String str = (k() || (this instanceof ac)) ? "multi_ads_endpage.ad_component_clickable_switch" : "endpage.ad_component_clickable_switch";
        sg.bigo.ads.api.a.m mVar = this.f101781g;
        a(mVar == null || mVar.a(str) == 1);
    }

    protected static void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 16);
            RoundedImageView roundedImageView = (RoundedImageView) viewGroup.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(iA);
            }
            float f10 = iA;
            viewGroup.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, (Rect) null, -1));
            sg.bigo.ads.ad.interstitial.b.f100662a.b(viewGroup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(android.widget.Button r2, sg.bigo.ads.ad.interstitial.q r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L43
            if (r3 == 0) goto L43
            boolean r3 = r1 instanceof sg.bigo.ads.ad.interstitial.c.w
            if (r3 != 0) goto L16
            boolean r3 = r1 instanceof sg.bigo.ads.ad.interstitial.c.ac
            if (r3 == 0) goto Ld
            goto L16
        Ld:
            sg.bigo.ads.api.a.m r3 = r1.f101781g
            java.lang.String r0 = "endpage.cta_color"
        L11:
            int r3 = r3.a(r0)
            goto L1b
        L16:
            sg.bigo.ads.api.a.m r3 = r1.f101781g
            java.lang.String r0 = "multi_ads_endpage.cta_color"
            goto L11
        L1b:
            r0 = 2
            if (r3 != r0) goto L22
            r3 = -14972829(0xffffffffff1b8863, float:-2.067385E38)
            goto L3b
        L22:
            r0 = 3
            if (r3 != r0) goto L38
            sg.bigo.ads.ad.b.b r3 = r1.m()
            java.lang.Integer r0 = r3.I()
            if (r0 == 0) goto L38
            java.lang.Integer r3 = r3.I()
            int r3 = r3.intValue()
            goto L3b
        L38:
            r3 = -16736769(0xffffffffff009dff, float:-1.7096155E38)
        L3b:
            sg.bigo.ads.ad.interstitial.c.ab$1 r0 = new sg.bigo.ads.ad.interstitial.c.ab$1
            r0.<init>()
            sg.bigo.ads.ad.interstitial.d.a(r2, r3, r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.ab.a(android.widget.Button, sg.bigo.ads.ad.interstitial.q):void");
    }

    static /* synthetic */ void a(ab abVar) {
        sg.bigo.ads.api.a.m mVar;
        String str;
        sg.bigo.ads.api.a.m mVar2;
        String str2;
        ViewGroup viewGroup;
        if (abVar.k() || (abVar instanceof ac)) {
            mVar = abVar.f101781g;
            str = "multi_ads_endpage.guide_click";
        } else {
            mVar = abVar.f101781g;
            str = "endpage.guide_click";
        }
        final int iA = mVar.a(str);
        if (iA > 0) {
            if (abVar.k() || (abVar instanceof ac)) {
                mVar2 = abVar.f101781g;
                str2 = "multi_ads_endpage.guide_click_timing";
            } else {
                mVar2 = abVar.f101781g;
                str2 = "endpage.guide_click_timing";
            }
            int iA2 = mVar2.a(str2, 0);
            final ViewGroup viewGroupN = abVar.n();
            ViewGroup viewGroup2 = abVar.f100736p;
            int i10 = R.id.inter_btn_cta_layout;
            final ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(i10);
            if (viewGroupN != null) {
                viewGroup = (ViewGroup) viewGroupN.findViewById(i10);
                viewGroupN.setClipChildren(false);
            } else {
                viewGroup = null;
            }
            final ViewGroup viewGroup4 = viewGroup;
            if (viewGroup3 != null) {
                abVar.f100736p.setClipChildren(false);
                viewGroup3.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.ab.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ab.this.f101780f)) {
                            return;
                        }
                        int i11 = iA;
                        if (1 == i11) {
                            sg.bigo.ads.ad.interstitial.c.e(viewGroup3);
                            ViewGroup viewGroup5 = viewGroup4;
                            if (viewGroup5 != null) {
                                sg.bigo.ads.ad.interstitial.c.e(viewGroup5);
                                return;
                            }
                            return;
                        }
                        if (2 == i11) {
                            ab abVar2 = ab.this;
                            ab.a(abVar2, abVar2.f100736p);
                            ViewGroup viewGroup6 = viewGroupN;
                            if (viewGroup6 != null) {
                                ab.a(ab.this, viewGroup6);
                            }
                        }
                    }
                }, ((long) iA2) * 1000);
            }
        }
    }

    static /* synthetic */ void a(ab abVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) new WeakReference(viewGroup).get();
        if (viewGroup2 != null) {
            View viewA = sg.bigo.ads.common.utils.a.a(viewGroup2.getContext(), R.layout.bigo_ad_endpage_cta_click_guide, viewGroup2, false);
            if (viewA != null) {
                viewGroup2.addView(viewA);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewA.getLayoutParams();
                layoutParams.gravity = 8388693;
                layoutParams.bottomMargin = -sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 30);
                viewA.setLayoutParams(layoutParams);
                final View viewFindViewById = viewA.findViewById(R.id.click_gesture);
                final View viewFindViewById2 = viewA.findViewById(R.id.click_ripple);
                final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation.setDuration(200L);
                rotateAnimation.setStartOffset(560L);
                rotateAnimation.setFillAfter(true);
                final RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation2.setDuration(240L);
                rotateAnimation2.setFillAfter(true);
                final AnimationSet animationSet = new AnimationSet(false);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                scaleAnimation.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.5
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById2.setVisibility(4);
                    }
                });
                rotateAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.6
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById.startAnimation(rotateAnimation2);
                    }
                });
                rotateAnimation2.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.7
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById.startAnimation(rotateAnimation);
                        viewFindViewById2.setVisibility(0);
                        viewFindViewById2.startAnimation(animationSet);
                    }
                });
                viewFindViewById.startAnimation(rotateAnimation);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        a((Button) this.f100736p.findViewById(R.id.inter_btn_cta), qVar);
    }

    protected final void a(sg.bigo.ads.ad.interstitial.q qVar, final ViewGroup viewGroup, sg.bigo.ads.ad.b.b bVar) {
        a(true, false);
        if (viewGroup == null || qVar == null || bVar == null) {
            return;
        }
        final int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 16);
        final RoundedImageView roundedImageView = new RoundedImageView(viewGroup.getContext());
        roundedImageView.setCornerRadius(iA);
        final int iA2 = roundedImageView.getContext().getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), p());
        final int iA3 = sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), q());
        roundedImageView.setLayoutParams(new FrameLayout.LayoutParams(iA2, iA3));
        roundedImageView.setTag(9);
        sg.bigo.ads.ad.interstitial.r.a(bVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.ab.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    return;
                }
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                if (width < iA2 || height < iA3) {
                    roundedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    sg.bigo.ads.common.utils.d.a(roundedImageView.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.ab.4.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewGroup.getContext());
                            roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, iA3));
                            roundedFrameLayout.setCornerRadius(iA);
                            sg.bigo.ads.common.utils.u.a(roundedFrameLayout, viewGroup, null, -1);
                            RoundedImageView roundedImageView2 = new RoundedImageView(viewGroup.getContext());
                            roundedImageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, iA3));
                            roundedImageView2.setImageBitmap(bitmap3);
                            roundedImageView2.setCornerRadius(iA);
                            roundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            roundedImageView2.setTag(9);
                            sg.bigo.ads.common.utils.u.a(roundedImageView2, roundedFrameLayout, null, -1);
                            int iA4 = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 10);
                            roundedImageView.setImageBitmap(bitmap2);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) roundedImageView.getLayoutParams();
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            layoutParams.gravity = 17;
                            layoutParams.setMargins(iA4, iA4, iA4, iA4);
                            roundedImageView.setLayoutParams(layoutParams);
                            sg.bigo.ads.common.utils.u.a(roundedImageView, roundedFrameLayout, null, -1);
                            ab.this.o();
                        }
                    });
                } else {
                    roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    sg.bigo.ads.common.utils.u.a(roundedImageView, viewGroup, null, -1);
                    roundedImageView.setImageBitmap(bitmap2);
                    ab.this.o();
                }
            }
        });
    }

    protected void a(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int iL;
        sg.bigo.ads.core.adview.h hVarM;
        int i10;
        if (this.f100741u) {
            return;
        }
        this.f100741u = true;
        if (z10) {
            viewGroup = this.f100728j;
            viewGroup2 = this.f100736p;
            iL = l();
            hVarM = m();
            i10 = this.f100738r;
        } else {
            viewGroup = this.f100728j;
            viewGroup2 = this.f100736p;
            iL = l();
            hVarM = sg.bigo.ads.ad.interstitial.q.F;
            i10 = 0;
        }
        sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, iL, hVarM, i10);
    }

    protected void a(boolean z10, boolean z11) {
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        if (!this.f100739s) {
            return super.a(qVar, viewGroup, view, aVar, i10, i11, i12, viewArr);
        }
        View view2 = this.f100736p;
        if (view2 == null) {
            view2 = this.f100742v;
        }
        return super.a(this.f101780f, qVar, viewGroup, view2, aVar, i10, l(), i12, viewArr);
    }
}
