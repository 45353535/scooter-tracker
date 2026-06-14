package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public class g extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected View f100810o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected RoundedImageView f100811p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected TextView f100812q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected TextView f100813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Button f100814s;

    public g(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void a(double d10) {
        TextView textView;
        int i10;
        if (d10 <= 3.0d) {
            textView = this.f100730l;
            if (textView == null) {
                return;
            } else {
                i10 = sg.bigo.ads.ad.interstitial.d.f100903b;
            }
        } else {
            textView = this.f100730l;
            if (textView == null) {
                return;
            } else {
                i10 = sg.bigo.ads.ad.interstitial.d.f100902a;
            }
        }
        textView.setTextColor(sg.bigo.ads.common.w.b.a(i10, 0.6f));
    }

    protected final void b(Runnable runnable) {
        super.a(runnable);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void d(sg.bigo.ads.ad.interstitial.q qVar) {
        ViewGroup viewGroup = this.f100729k;
        if (viewGroup == null) {
            return;
        }
        this.f100810o = viewGroup.findViewById(R.id.inter_end_page);
        l();
        this.f100812q = (TextView) this.f100729k.findViewById(R.id.inter_title);
        this.f100813r = (TextView) this.f100729k.findViewById(R.id.inter_description);
        this.f100811p = (RoundedImageView) this.f100729k.findViewById(R.id.inter_icon);
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f100662a;
        bVar.a(this.f100812q, this.f100813r);
        bVar.a(this.f100811p);
        a(f(qVar));
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_14_15;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f101780f.f()).i();
        TextView textView = (TextView) this.f100729k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    protected void l() {
        if (this.f100810o != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 16);
            this.f100810o.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -1));
            sg.bigo.ads.ad.interstitial.b.f100662a.b(this.f100810o);
        }
    }

    protected void m() {
        if (this.f100814s == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.f100814s);
    }

    protected void a(int i10) {
        Button button = (Button) this.f100729k.findViewById(R.id.inter_btn_cta);
        this.f100814s = button;
        if (button != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 8);
            this.f100814s.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, i10));
            sg.bigo.ads.ad.interstitial.d.a(this.f100814s, sg.bigo.ads.common.w.b.a(i10));
            sg.bigo.ads.ad.interstitial.b.f100662a.a(this.f100814s);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void a(int i10, boolean z10, boolean z11) {
        sg.bigo.ads.ad.b.a.a(this.f100810o, 5);
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100810o, 4, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100810o, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.f100729k, 9);
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100729k, 4, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100729k, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void a(final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.g.1
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
                g.this.m();
            }
        };
        if (this.f100729k == null) {
            runnable2.run();
        } else {
            sg.bigo.ads.common.utils.u.c(this.f100810o, 0, 0);
            this.f100729k.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new b.a() { // from class: sg.bigo.ads.ad.interstitial.c.g.2.1
                        @Override // sg.bigo.ads.common.utils.b.a
                        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
                            if (transitionValues.view == g.this.f100810o) {
                                Rect rect = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                                transitionValues.values.put("android:changeBounds:bounds", new Rect(rect.centerX(), rect.centerY(), rect.centerX(), rect.centerY()));
                            }
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(g.this.f100729k, transitionSet);
                    ViewGroup viewGroup = g.this.f100729k;
                    b.d dVar = new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.g.2.2
                        @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            super.onAnimationEnd(animation);
                            runnable2.run();
                        }
                    };
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setAnimationListener(dVar);
                    viewGroup.startAnimation(alphaAnimation);
                    sg.bigo.ads.common.utils.u.c(g.this.f100810o, -1, -2);
                }
            });
        }
    }
}
