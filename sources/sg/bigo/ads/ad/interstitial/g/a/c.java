package sg.bigo.ads.ad.interstitial.g.a;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.a.a.b;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class c extends sg.bigo.ads.ad.interstitial.a implements sg.bigo.ads.ad.interstitial.g.a {
    public static int H = 340;
    protected sg.bigo.ads.ad.b.a.a.b G;
    private LinearLayout I;
    private int J;
    private boolean K;
    private final WeakHashMap<d, View> O;
    private View P;
    private boolean Q;
    private final AdCountDownButton.b R;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.g.a.c$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<sg.bigo.ads.ad.b.b> it = c.this.G.L.keySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (c.c(it.next())) {
                    i10++;
                }
            }
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.g.a.c.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    for (Map.Entry<sg.bigo.ads.ad.b.b, b.a> entry : c.this.G.L.entrySet()) {
                        sg.bigo.ads.ad.b.b key = entry.getKey();
                        final int i11 = entry.getValue().f100185d;
                        r.a(key, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.g.a.c.3.1.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                                Bitmap bitmap2 = bitmap;
                                if (bitmap2 != null) {
                                    concurrentHashMap.put(bitmap2, Integer.valueOf(i11));
                                }
                                if (concurrentHashMap.size() == c.this.G.L.size()) {
                                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                                        Integer numA = sg.bigo.ads.common.w.b.a((Bitmap) entry2.getKey());
                                        if (numA != null) {
                                            concurrentHashMap2.put(entry2.getValue(), numA);
                                            if (concurrentHashMap2.size() >= 2) {
                                                c.a(c.this, concurrentHashMap2);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }, i10 == c.this.G.L.size() ? 0L : 800L);
        }
    }

    protected c(@NonNull Activity activity) {
        super(activity);
        this.O = new WeakHashMap<>();
        this.R = new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.interstitial.g.a.c.1
            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
            public final void a() {
                c.a(c.this);
                c.this.aq();
            }
        };
    }

    private int ar() {
        m mVar;
        String str;
        if (((sg.bigo.ads.ad.interstitial.a) this).f100542c == null) {
            return 15;
        }
        if (this.J == this.O.size()) {
            mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
            str = "multi_ads_endpage.force_staying_time";
        } else {
            mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
            str = "multi_ads.force_staying_time";
        }
        return mVar.a(str, 15);
    }

    private void as() {
        if (this.J < this.O.size()) {
            this.J++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        sg.bigo.ads.ad.b.a.a.b bVar = this.G;
        if (bVar == null || this.P == null) {
            return;
        }
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, b.a>> it = bVar.L.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().getValue().f100182a && (i10 = i10 + 1) == this.G.L.size()) {
                sg.bigo.ads.common.n.d.a(3, new AnonymousClass3());
                return;
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void A() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || ((sg.bigo.ads.ad.interstitial.a) this).f100542c == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.A.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.A);
        }
        q();
        int iAr = ar();
        if (this.J == this.O.size()) {
            this.A.b(iAr, this.R);
        } else {
            this.A.a(iAr, this.R);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void J() {
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        return R.layout.bigo_ad_activity_vertical_twins_owner;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Z() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final ValueCallback<Double> a() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // sg.bigo.ads.ad.interstitial.i
    public final void aa() {
        c cVar;
        d dVar;
        super.aa();
        sg.bigo.ads.ad.b.b bVarH = ((s) this.f101384y).H();
        if (!(bVarH instanceof sg.bigo.ads.ad.b.a.a.b)) {
            aG();
            return;
        }
        this.G = (sg.bigo.ads.ad.b.a.a.b) bVarH;
        f(0);
        z();
        W();
        this.I = (LinearLayout) p(R.id.bigo_ad_twins_sub_ad_container);
        this.P = p(R.id.bigo_ad_background_view);
        this.G.J = new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.interstitial.g.a.c.2
            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2) {
                RoundedFrameLayout roundedFrameLayout;
                NativeAd nativeAd = (NativeAd) ad2;
                Iterator it = c.this.O.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    final d dVar2 = (d) it.next();
                    if (dVar2.f101299b == nativeAd) {
                        if (dVar2.f101302e != null && (roundedFrameLayout = dVar2.f101298a) != null) {
                            roundedFrameLayout.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.g.a.d.4
                                AnonymousClass4() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    d.this.f101298a.removeView(d.this.f101302e);
                                    d.e(d.this);
                                }
                            });
                        }
                    }
                }
                c.this.at();
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
            }
        };
        if (this.I == null) {
            aG();
            return;
        }
        int i10 = this.G.S;
        int iA = sg.bigo.ads.common.utils.e.a(this.L, 16);
        int iA2 = sg.bigo.ads.common.utils.e.a(this.L, 10);
        if (sg.bigo.ads.common.utils.e.c(this.L) <= 2000) {
            H = 270;
        }
        int iA3 = sg.bigo.ads.common.utils.e.a(this.L, H);
        for (int i11 = 0; i11 < i10; i11++) {
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(this.L);
            roundedFrameLayout.setCornerRadius(iA);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iA3);
            layoutParams.leftMargin = iA2;
            layoutParams.rightMargin = iA2;
            if (i11 % 2 == 0) {
                layoutParams.topMargin = iA;
            }
            roundedFrameLayout.setLayoutParams(layoutParams);
            this.I.addView(roundedFrameLayout, 0);
            sg.bigo.ads.ad.b.b bVarE = this.G.e(i11);
            ((sg.bigo.ads.core.a.a) bVarE.f()).m(this.G.b((sg.bigo.ads.api.b.a) bVarE));
            b.a aVar = this.G.L.get(bVarE);
            boolean z10 = aVar != null ? aVar.f100182a : false;
            if (bVarE instanceof sg.bigo.ads.ad.b.c) {
                cVar = this;
                dVar = new e(this.L, cVar, roundedFrameLayout, bVarE, i11, this.P, z10);
            } else {
                cVar = this;
                dVar = new d(cVar.L, cVar, roundedFrameLayout, bVarE, i11, cVar.P, z10);
            }
            cVar.O.put(dVar, roundedFrameLayout);
            dVar.T();
            if (i11 == 0) {
                ?? F = bVarE.f();
                TextView textView = (TextView) p(R.id.inter_warning);
                if (textView != null) {
                    textView.setTag(8);
                    if (TextUtils.isEmpty(bVarE.getWarning())) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(bVarE.getWarning());
                    }
                }
                AdOptionsView adOptionsView = (AdOptionsView) p(R.id.inter_options);
                if (adOptionsView != 0) {
                    adOptionsView.setTag(4);
                    adOptionsView.a((sg.bigo.ads.api.core.b) F, F.l());
                }
                String strI = F.i();
                TextView textView2 = (TextView) p(R.id.inter_advertiser);
                TextView textView3 = (TextView) p(R.id.inter_ad_label);
                if (textView2 != null) {
                    if (TextUtils.isEmpty(strI)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(strI);
                        int iA4 = sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4);
                        int iA5 = sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1);
                        textView2.setPadding(iA4, iA5, iA4, iA5);
                    }
                    if (textView3 != null) {
                        textView3.setText(R.string.bigo_ad_tag);
                    }
                }
            }
        }
        A();
        at();
    }

    protected final int ao() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.getMillisUntilFinished() <= 0) {
            return 0;
        }
        return Math.round(this.A.getMillisUntilFinished() / 1000.0f);
    }

    protected final void ap() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.d();
            this.A = null;
        }
        sg.bigo.ads.ad.b.a.a.b bVar = this.G;
        synchronized (bVar.K) {
            try {
                Iterator<sg.bigo.ads.ad.b.b> it = bVar.L.keySet().iterator();
                while (it.hasNext()) {
                    Ad ad2 = (sg.bigo.ads.ad.b.b) it.next();
                    if ((ad2 instanceof f) && !((f) ad2).K()) {
                        ad2.destroy();
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator<d> it2 = this.O.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().F();
            it2.remove();
        }
    }

    protected void aq() {
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final View c() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void c_() {
        this.Q = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final boolean d_() {
        return this.Q;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z10) {
        if (this.J == this.O.size() && this.K) {
            return true;
        }
        if (this.J >= this.O.size()) {
            return false;
        }
        Iterator<d> it = this.O.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                as();
            }
        }
        if (this.J != this.O.size()) {
            return false;
        }
        A();
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.c();
        }
        Iterator<d> it = this.O.keySet().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        super.i();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.b();
        }
        Iterator<d> it = this.O.keySet().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void q() {
        m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        if (mVar == null || this.A == null) {
            super.q();
            return;
        }
        int iA = mVar.a("multi_ads.close_button_style", 1);
        if (this.J == this.O.size()) {
            iA = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("multi_ads_endpage.close_button_style", 1);
        }
        r.a(iA, this.A);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void a(int i10) {
        if (i10 == 11) {
            as();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final w b() {
        return new w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(sg.bigo.ads.ad.b.b bVar) {
        String strAT;
        String path;
        if (!(bVar instanceof sg.bigo.ads.ad.b.c)) {
            if (bVar != null && (strAT = ((sg.bigo.ads.core.a.a) bVar.f()).aT()) != null) {
                path = o.e(bVar.f100335b.f102178e) + File.separator + String.valueOf(strAT.hashCode());
            }
            return false;
        }
        path = Uri.parse(o.b(bVar.f100335b.f102178e, ((sg.bigo.ads.core.a.a) bVar.f()).aN())).getPath();
        return sg.bigo.ads.common.utils.f.b(path);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void a(int i10, int i11) {
    }

    protected void a(sg.bigo.ads.ad.b.b bVar) {
        q bVar2;
        if (bVar instanceof sg.bigo.ads.ad.b.a.a.c) {
            ((sg.bigo.ads.ad.b.a.a.c) bVar).I = true;
            bVar2 = new a(this.L, ao());
        } else {
            if (!(bVar instanceof sg.bigo.ads.ad.b.a.a.d)) {
                return;
            }
            ((sg.bigo.ads.ad.b.a.a.d) bVar).O = true;
            bVar2 = new b(this.L, ao());
        }
        this.G.I = bVar;
        bVar2.C = bVar;
        bVar2.T();
    }

    static /* synthetic */ void a(c cVar, final Map map) {
        if (cVar.P == null || map.size() < 2) {
            return;
        }
        cVar.P.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.g.a.c.4
            @Override // java.lang.Runnable
            public final void run() {
                Integer num = (Integer) map.get(2);
                Integer numValueOf = Integer.valueOf(ViewCompat.MEASURED_STATE_MASK);
                if (num == null) {
                    num = numValueOf;
                }
                Integer num2 = (Integer) map.get(1);
                if (num2 != null) {
                    numValueOf = num2;
                }
                View view = c.this.P;
                int i10 = R.color.black;
                int iIntValue = num.intValue();
                int iIntValue2 = numValueOf.intValue();
                try {
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i10, i10});
                    view.setBackground(gradientDrawable);
                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(500L);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.utils.b.3

                        /* JADX INFO: renamed from: a */
                        final /* synthetic */ ArgbEvaluator f102782a;

                        /* JADX INFO: renamed from: b */
                        final /* synthetic */ int f102783b;

                        /* JADX INFO: renamed from: c */
                        final /* synthetic */ int f102784c;

                        /* JADX INFO: renamed from: d */
                        final /* synthetic */ int f102785d;

                        /* JADX INFO: renamed from: e */
                        final /* synthetic */ GradientDrawable f102786e;

                        public AnonymousClass3(ArgbEvaluator argbEvaluator2, int i102, int iIntValue3, int iIntValue22, GradientDrawable gradientDrawable2) {
                            argbEvaluator = argbEvaluator2;
                            i = i102;
                            i = iIntValue3;
                            i = iIntValue22;
                            gradientDrawable = gradientDrawable2;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            gradientDrawable.setColors(new int[]{((Integer) argbEvaluator.evaluate(fFloatValue, Integer.valueOf(i), Integer.valueOf(i))).intValue(), ((Integer) argbEvaluator.evaluate(fFloatValue, Integer.valueOf(i), Integer.valueOf(i))).intValue()});
                        }
                    });
                    valueAnimatorOfFloat.start();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void a(boolean z10, int i10, int i11, int i12, i iVar, final sg.bigo.ads.ad.b.b bVar, q qVar) {
        View value;
        if (z10 || !(i12 == 35 || 1 == i10)) {
            bVar.a(iVar, i11, i12);
            return;
        }
        View view = this.O.get(qVar);
        Iterator<Map.Entry<d, View>> it = this.O.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                value = null;
                break;
            }
            Map.Entry<d, View> next = it.next();
            if (next.getKey() != qVar) {
                value = next.getValue();
                break;
            }
        }
        if (view == null || value == null) {
            a(bVar);
            ap();
            return;
        }
        b.c cVar = new b.c() { // from class: sg.bigo.ads.ad.interstitial.g.a.c.5
            @Override // sg.bigo.ads.common.utils.b.c, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                c.this.a(bVar);
                c.this.ap();
            }
        };
        View view2 = (View) new WeakReference(view).get();
        if (view2 != null) {
            view2.animate().alpha(0.0f).scaleX(1.5f).scaleY(1.5f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(new b.c() { // from class: sg.bigo.ads.common.utils.b.2
                public AnonymousClass2() {
                }

                @Override // sg.bigo.ads.common.utils.b.c, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.onAnimationEnd(animator);
                    }
                }
            }).start();
        }
        View view3 = (View) new WeakReference(value).get();
        if (view3 != null) {
            view3.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    static /* synthetic */ boolean a(c cVar) {
        cVar.K = true;
        return true;
    }
}
