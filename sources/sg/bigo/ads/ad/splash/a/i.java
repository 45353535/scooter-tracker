package sg.bigo.ads.ad.splash.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.ad.b.a;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends sg.bigo.ads.ad.interstitial.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> f102002j = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ViewFlow f102003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Indicator f102004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    RoundedFrameLayout f102005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    sg.bigo.ads.ad.interstitial.multi_img.a f102006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    sg.bigo.ads.ad.interstitial.multi_img.view.b f102007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.ad.interstitial.multi_img.b f102008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    final w f102009i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.ad.b.b f102011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    final ViewGroup f102012m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    sg.bigo.ads.ad.interstitial.multi_img.view.c f102014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    sg.bigo.ads.ad.interstitial.multi_img.view.c f102015p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final a.InterfaceC1206a f102010k = new a.InterfaceC1206a() { // from class: sg.bigo.ads.ad.splash.a.i.1
        @Override // sg.bigo.ads.ad.b.a.InterfaceC1206a
        public final boolean a() {
            if (i.this.f102003c != null) {
                return i.this.f102003c.f102958h;
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    v f102016q = new v() { // from class: sg.bigo.ads.ad.splash.a.i.3
        @Override // sg.bigo.ads.ad.interstitial.v
        public final void a() {
            Bitmap bitmap = b.f101916j;
            boolean zAR = ((sg.bigo.ads.core.a.a) i.this.f102011l.f()).aR();
            if (bitmap != null) {
                if (zAR) {
                    synchronized (i.f102002j) {
                        i.f102002j.remove(i.this.f102007g);
                    }
                }
                i.this.f102007g.a(bitmap);
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.ad.interstitial.d f102013n = new sg.bigo.ads.ad.interstitial.d();

    /* JADX INFO: renamed from: sg.bigo.ads.ad.splash.a.i$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f102020a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f102020a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102020a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102020a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102020a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull ViewGroup viewGroup, @NonNull w wVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2) {
        this.f102011l = bVar;
        this.f102012m = viewGroup;
        this.f102008h = bVar2;
        this.f102009i = wVar;
    }

    final sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.f102008h, cVar, d(), i10, str, z10, null);
        aVar.f101540s = true;
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f102994a = -1;
        bVar.f102995b = -1;
        bVar.f102996c = false;
        bVar.f102997d = cVar.f101470d;
        this.f102003c.addView(aVar.f101531j, bVar);
        if (this.f102006f != null) {
            aVar.f101539r = new d.a() { // from class: sg.bigo.ads.ad.splash.a.i.10
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    i.this.f102006f.a(i.this.f102003c.a(aVar.f101531j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.f101539r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    final int d() {
        m mVar = this.f102008h.f101450a;
        if (mVar == null) {
            return 1;
        }
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar.a("video_play_page.mediaview_colour"));
    }

    final boolean e() {
        return this.f102008h.f101451b == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    final void f() {
        if (e()) {
            return;
        }
        int iA = this.f102008h.f101450a.a("video_play_page.multi_guide");
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.i.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.this.f102003c.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.i.8.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.f102003c.f102957g) {
                                    return;
                                }
                                i.a(i.this, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f102003c.setFlipInterval((iA - 5) * 1000);
                this.f102003c.c();
                break;
        }
    }

    static /* synthetic */ void a(i iVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = iVar.f102003c;
            if (!viewFlow.f102957g && !viewFlow.e()) {
                iVar.f102003c.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(iVar.f102012m.getContext(), 40);
                final int scrollX = iVar.f102003c.getScrollX();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.splash.a.i.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        i.a(i.this, j10 - 1, 300L, j12);
                    }
                });
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.splash.a.i.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            i.this.f102003c.scrollTo(scrollX + ((Integer) animatedValue).intValue(), i.this.f102003c.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        iVar.f102003c.setScrollEnabled(true);
    }
}
