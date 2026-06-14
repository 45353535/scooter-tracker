package sg.bigo.ads.ad.interstitial.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.ad.interstitial.multi_img.e;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    protected final p f101346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    protected final f f101347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ViewGroup f101348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected ViewGroup f101349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected RoundedImageView f101350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected RoundedImageView f101351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Button f101352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    protected TextView f101353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected ViewGroup f101354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected AnimationSet f101355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Rect f101356r;

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    protected a(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, p pVar) {
        super(bVar, mVar);
        this.f101346h = pVar;
        ?? F = bVar.f();
        this.f101347i = new f(mVar.a("layer.gp_element"), 0, F != 0 ? F.n() : "");
    }

    public static int a(@Nullable m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.a(mVar, "layer.webview_layout");
    }

    public static int b(@Nullable m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.b(mVar, "layer.webview_force_time");
    }

    protected abstract void d(@NonNull q qVar);

    @Override // sg.bigo.ads.ad.interstitial.u
    public final int e() {
        m mVar = this.f101781g;
        return e.a(mVar != null ? mVar.a("layer.mediaview_colour") : 3);
    }

    protected void f(@NonNull q qVar) {
        Button button = (Button) this.f101349k.findViewById(R.id.inter_btn_cta);
        this.f101352n = button;
        if (button != null) {
            int iG = g(qVar);
            float fA = sg.bigo.ads.common.utils.e.a(this.f101349k.getContext(), 8);
            this.f101352n.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, iG));
            sg.bigo.ads.ad.interstitial.d.a(this.f101352n, sg.bigo.ads.common.w.b.a(iG));
        }
    }

    protected final int g(@NonNull q qVar) {
        int i10;
        m mVar = this.f101781g;
        if (mVar == null) {
            return -16736769;
        }
        int iA = mVar.a("layer.cta_color");
        return (iA == 3 && d() && (i10 = u.a(qVar).f101740i) != 0) ? i10 : r.a(this.f101780f, iA, null);
    }

    public abstract boolean g();

    @LayoutRes
    protected abstract int h();

    @CallSuper
    protected final void i() {
        a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.h.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.f101349k.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.h.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.j();
                    }
                });
            }
        });
    }

    protected final void j() {
        ViewStub viewStub;
        View viewInflate;
        ViewStub viewStub2;
        final View viewInflate2;
        ViewGroup viewGroup;
        m mVar = this.f101781g;
        int iA = mVar != null ? mVar.a("layer.guided_click") : 2;
        if (iA == 1) {
            Button button = this.f101352n;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
                return;
            }
            return;
        }
        if (iA != 3) {
            ViewGroup viewGroup2 = this.f101349k;
            if (viewGroup2 == null || this.f101352n == null || (viewStub2 = (ViewStub) viewGroup2.findViewById(R.id.inter_gesture_zoom_layout)) == null || (viewInflate2 = viewStub2.inflate()) == null) {
                return;
            }
            viewInflate2.setAlpha(0.0f);
            sg.bigo.ads.common.e.a.a(viewInflate2, 99.0f);
            final View viewFindViewById = viewInflate2.findViewById(R.id.inter_click_guide);
            final View viewFindViewById2 = viewInflate2.findViewById(R.id.inter_click_ripple);
            if (viewFindViewById == null || viewFindViewById2 == null) {
                return;
            }
            int iA2 = sg.bigo.ads.common.utils.e.a(this.f101349k.getContext(), 50);
            viewInflate2.setPadding(iA2, iA2, 0, 0);
            Button button2 = this.f101352n;
            if (button2 != null && (viewGroup = this.f101349k) != null) {
                Point pointA = sg.bigo.ads.common.utils.u.a(viewGroup, button2);
                Rect rect = new Rect(pointA.x, pointA.y, this.f101352n.getMeasuredWidth() + pointA.x, this.f101352n.getMeasuredHeight() + pointA.y);
                Rect rect2 = new Rect(0, 0, viewFindViewById2.getLayoutParams().width, viewFindViewById2.getLayoutParams().height);
                int iCenterY = ((rect.centerY() - rect2.centerY()) + rect2.top) - iA2;
                int iCenterX = ((rect.centerX() - rect2.centerX()) + rect2.left) - iA2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate2.getLayoutParams();
                marginLayoutParams.topMargin = iCenterY;
                marginLayoutParams.leftMargin = (int) (iCenterX - (rect.width() * 0.15f));
                viewInflate2.requestLayout();
            }
            sg.bigo.ads.ad.interstitial.c.a(0, u.f101779e, 200L, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.h.a.3
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    if (num != null) {
                        viewInflate2.setAlpha((r3.intValue() * 1.0f) / u.f101779e);
                    }
                }
            }, new ValueCallback<Void>() { // from class: sg.bigo.ads.ad.interstitial.h.a.4
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Void r22) {
                    viewInflate2.setAlpha(1.0f);
                    sg.bigo.ads.ad.interstitial.c.a(viewFindViewById, viewFindViewById2);
                }
            });
            return;
        }
        ViewGroup viewGroup3 = this.f101349k;
        if (viewGroup3 == null || (viewStub = (ViewStub) viewGroup3.findViewById(R.id.inter_gesture_slide_layout)) == null || (viewInflate = viewStub.inflate()) == null) {
            return;
        }
        sg.bigo.ads.common.e.a.a(viewInflate, 99.0f);
        View viewFindViewById3 = viewInflate.findViewById(R.id.inter_click_guide);
        if (viewFindViewById3 != null) {
            viewInflate.setTag(16);
            sg.bigo.ads.ad.b.a.a(this.f101348j, viewInflate, 10, this.f101780f, 0);
            int iMax = Math.max(1300, Math.max(600, 600));
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a(-(sg.bigo.ads.common.utils.e.c(viewFindViewById3.getContext()) >> 1));
            aVar.setRepeatCount(-1);
            aVar.setInterpolator(new b.InterpolatorC1271b(iMax - 1000) { // from class: sg.bigo.ads.ad.interstitial.c.12

                /* JADX INFO: renamed from: a */
                private final Interpolator f100696a = sg.bigo.ads.common.utils.b.a(2);

                public AnonymousClass12(long j10) {
                    super(1000L, 0L, j10);
                    this.f100696a = sg.bigo.ads.common.utils.b.a(2);
                }

                @Override // sg.bigo.ads.common.utils.b.InterpolatorC1271b, android.animation.TimeInterpolator
                public final float getInterpolation(float f10) {
                    float interpolation = super.getInterpolation(f10);
                    Interpolator interpolator = this.f100696a;
                    return interpolator != null ? interpolator.getInterpolation(interpolation) : interpolation;
                }
            });
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setRepeatCount(-1);
            long j10 = iMax + AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED;
            alphaAnimation.setInterpolator(new b.InterpolatorC1271b(300L, 0L, j10));
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setInterpolator(new b.InterpolatorC1271b(300L, 0L, j10));
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setRepeatCount(-1);
            alphaAnimation2.setInterpolator(new b.InterpolatorC1271b(300L, j10, 0L));
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.setDuration(iMax);
            animationSet.setRepeatCount(-1);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(aVar);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            viewFindViewById3.startAnimation(animationSet);
            this.f101355q = animationSet;
            a(true);
        }
    }

    protected void k() {
        Context context = this.f101349k.getContext();
        RoundedImageView roundedImageView = (RoundedImageView) this.f101349k.findViewById(R.id.inter_icon);
        this.f101350l = roundedImageView;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 22));
            this.f101350l.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
            this.f101350l.setStrokeColor(134217728);
        }
    }

    public final View a(@NonNull q qVar, @NonNull ViewGroup viewGroup, int i10, @Nullable final u.a aVar) {
        if (viewGroup == null) {
            return null;
        }
        this.f101348j = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), h(), null, false);
        this.f101349k = viewGroup2;
        if (viewGroup2 == null) {
            return null;
        }
        this.f101348j.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
        this.f101349k.setBackgroundColor(-234881024);
        k();
        e(qVar);
        f(qVar);
        TextView textView = (TextView) this.f101349k.findViewById(R.id.inter_warning);
        this.f101353o = textView;
        sg.bigo.ads.ad.interstitial.d.a(textView, -234881024);
        sg.bigo.ads.common.e.a.a((View) this.f101353o, 101.0f);
        ViewGroup viewGroup3 = (ViewGroup) this.f101349k.findViewById(R.id.inter_ad_tag_layout);
        this.f101354p = viewGroup3;
        sg.bigo.ads.common.e.a.a((View) viewGroup3, 101.0f);
        d(qVar);
        sg.bigo.ads.ad.interstitial.c.a(this.f101349k, this.f101348j, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.h.a.1
            @Override // java.lang.Runnable
            public final void run() {
                u.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(a.this.f101349k);
                }
                a.this.i();
            }
        });
        int iA = this.f101781g.a("layer.click_type");
        ViewGroup viewGroup4 = this.f101348j;
        ViewGroup viewGroup5 = this.f101349k;
        a(qVar, viewGroup4, viewGroup5, null, i10, 10, iA, viewGroup5);
        TextView textView2 = this.f101353o;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        a(iA, this.f101781g.a("layer.media_view_clickable_switch") == 1, this.f101781g.a("layer.other_space_clickable_switch") == 1);
        String strI = ((sg.bigo.ads.core.a.a) this.f101780f.f()).i();
        TextView textView3 = (TextView) this.f101349k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(strI);
        }
        return this.f101349k;
    }

    protected void e(@NonNull q qVar) {
        RoundedImageView roundedImageView = (RoundedImageView) this.f101349k.findViewById(R.id.inter_click_guide_image);
        this.f101351m = roundedImageView;
        if (roundedImageView == null || qVar == null) {
            return;
        }
        roundedImageView.setTag(5);
        ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.h.a.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    a.this.f101351m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.h.a.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.f101351m.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        };
        Bitmap bitmapG = u.a(qVar).g();
        if (bitmapG != null) {
            valueCallback.onReceiveValue(bitmapG);
        } else {
            u.a(qVar, valueCallback);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean f() {
        return true;
    }

    @Nullable
    public static a a(Context context, @NonNull sg.bigo.ads.ad.b.b bVar, @Nullable m mVar, boolean z10) {
        int i10;
        int iC;
        if (mVar == null || bVar == null || z10) {
            return null;
        }
        if (context != null) {
            i10 = context.getResources().getDisplayMetrics().widthPixels;
            iC = sg.bigo.ads.common.utils.e.c(context);
        } else {
            i10 = 0;
            iC = 0;
        }
        p pVar = new p(i10, iC);
        int iA = mVar.a("layer.ad_component_layout");
        if (iA == 1) {
            return new b(bVar, mVar, pVar);
        }
        if (iA == 2) {
            return new c(bVar, mVar, pVar);
        }
        if (iA != 3) {
            return null;
        }
        return new d(bVar, mVar, pVar);
    }

    @CallSuper
    protected void a(int i10, boolean z10, boolean z11) {
        ViewGroup viewGroup = this.f101349k;
        if (viewGroup == null) {
            return;
        }
        sg.bigo.ads.ad.b.a.a(viewGroup, 12);
        sg.bigo.ads.ad.b.a.a(this.f101352n, 17);
        sg.bigo.ads.ad.b.a.a(this.f101350l, 17);
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f101348j, this.f101349k, 10, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f101348j, this.f101349k, 10, q.F, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.f101351m, 5);
        RoundedImageView roundedImageView = this.f101351m;
        if (roundedImageView != null) {
            if (z10) {
                sg.bigo.ads.ad.b.a.a(this.f101348j, roundedImageView, 10, this.f101780f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(this.f101348j, roundedImageView, 10, q.F, 0);
            }
        }
    }

    public final void a(@NonNull View view) {
        ViewGroup viewGroup = this.f101349k;
        if (viewGroup == null || view == null) {
            return;
        }
        Point pointA = sg.bigo.ads.common.utils.u.a(viewGroup, view);
        this.f101356r = new Rect(pointA.x, pointA.y, view.getMeasuredWidth() + pointA.x, view.getMeasuredHeight() + pointA.y);
        a(false);
    }

    private void a(boolean z10) {
        AnimationSet animationSet = this.f101355q;
        if (animationSet == null || this.f101356r == null) {
            return;
        }
        List<Animation> animations = animationSet.getAnimations();
        for (int i10 = 0; animations != null && i10 < animations.size(); i10++) {
            Animation animation = animations.get(i10);
            if (animation instanceof sg.bigo.ads.common.a.a) {
                sg.bigo.ads.common.a.a aVar = (sg.bigo.ads.common.a.a) animation;
                int iHeight = this.f101356r.height();
                aVar.f102258c = iHeight;
                if (z10) {
                    aVar.f102259d = iHeight;
                }
            }
        }
    }
}
