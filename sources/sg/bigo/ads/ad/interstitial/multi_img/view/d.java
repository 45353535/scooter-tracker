package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.FixContentFrameLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<T extends View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f101522b = 300;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f101523c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f101524d = u.f101779e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f101525e = -188383023;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f101526a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Context f101527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.c f101528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f101529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f101530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RoundedFrameLayout f101531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FixContentFrameLayout f101532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final T f101533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdImageView f101534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f101535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f101536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap f101537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f101538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f101539r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ValueAnimator f101541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ValueAnimator f101542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f101543v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f101540s = false;

    public interface a {
        void a();

        void b();
    }

    public d(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, boolean z10, int i10, int i11, @LayoutRes int i12, @IdRes int i13, @IdRes int i14, @IdRes int i15) {
        this.f101527f = context;
        this.f101526a = z10;
        this.f101530i = i11;
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) sg.bigo.ads.common.utils.a.a(context, i12, null, false);
        this.f101531j = roundedFrameLayout;
        this.f101532k = (FixContentFrameLayout) roundedFrameLayout.findViewById(i13);
        this.f101533l = (T) roundedFrameLayout.findViewById(i14);
        this.f101534m = (AdImageView) roundedFrameLayout.findViewById(i15);
        a(cVar);
        a(i10);
        this.f101538q = f101524d;
        sg.bigo.ads.common.utils.u.a(roundedFrameLayout, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.this.f101543v = SystemClock.elapsedRealtime();
            }
        });
        roundedFrameLayout.setTag(f101525e, this);
    }

    public final boolean c(int i10) {
        return this.f101540s ? i10 == 5 : i10 == 4;
    }

    public final boolean d(int i10) {
        return this.f101540s ? i10 == 4 : i10 == 3;
    }

    public final void b(final int i10) {
        if (a()) {
            this.f101534m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.5
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.f101534m.setBackgroundColor(i10);
                }
            });
        }
    }

    public final void a(int i10) {
        int i11;
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 4) {
                if (i10 == 1) {
                    i11 = -1;
                } else if (i10 != 2) {
                    i10 = 3;
                } else {
                    i11 = ViewCompat.MEASURED_STATE_MASK;
                }
            }
            this.f101529h = i10;
        }
        i11 = 0;
        b(i11);
        this.f101529h = i10;
    }

    protected final void b(Bitmap bitmap) {
        a aVar;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = ((this.f101543v > 0L ? 1 : (this.f101543v == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - this.f101543v : 0L) > f101522b;
        if (c(this.f101530i) || c(this.f101529h)) {
            this.f101537p = sg.bigo.ads.common.utils.d.b(this.f101527f, bitmap);
            if (c(this.f101530i)) {
                this.f101536o = sg.bigo.ads.common.w.b.a(this.f101537p, ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.f101536o = ViewCompat.MEASURED_STATE_MASK;
            }
            final b.a aVar2 = new b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.2
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f101523c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    if (d.this.f101539r != null) {
                        d.this.f101539r.b();
                    }
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i10) {
                    d.this.f101538q = i10;
                    d dVar = d.this;
                    if (dVar.c(dVar.f101529h)) {
                        d dVar2 = d.this;
                        d.a(dVar2, dVar2.f101537p, d.this.f101538q);
                    }
                    if (d.this.f101539r != null) {
                        d.this.f101539r.a();
                    }
                    return super.a(i10);
                }
            };
            if (z12) {
                ValueAnimator valueAnimator = this.f101542u;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, f101524d);
                this.f101542u = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                this.f101542u.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            int iIntValue = ((Integer) animatedValue).intValue();
                            b.a aVar3 = aVar2;
                            if (aVar3 != null) {
                                aVar3.a(iIntValue);
                            }
                        }
                    }
                });
                this.f101542u.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        b.a aVar3 = aVar2;
                        if (aVar3 != null) {
                            aVar3.b(d.f101524d);
                        }
                    }
                });
                if (aVar2.a() >= 0) {
                    this.f101542u.setDuration(aVar2.a());
                }
                this.f101542u.start();
            } else {
                aVar2.a(f101524d);
                aVar2.b(f101524d);
            }
            z11 = true;
        }
        if (d(this.f101530i) || d(this.f101529h)) {
            int iA = sg.bigo.ads.common.w.b.a(bitmap, ViewCompat.MEASURED_STATE_MASK);
            final b.a aVar3 = new b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.3
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f101523c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    if (d.this.f101539r != null) {
                        d.this.f101539r.b();
                    }
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i10) {
                    d.this.f101535n = i10;
                    d dVar = d.this;
                    if (dVar.d(dVar.f101529h)) {
                        d dVar2 = d.this;
                        dVar2.b(dVar2.f101535n);
                    }
                    if (d.this.f101539r != null) {
                        d.this.f101539r.a();
                    }
                    return super.a(i10);
                }
            };
            if (z12) {
                ValueAnimator valueAnimator2 = this.f101541t;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f101541t = sg.bigo.ads.common.w.b.a(this.f101534m, iA, new b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.8
                    @Override // sg.bigo.ads.common.w.b.a
                    public final long a() {
                        b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            return aVar4.a();
                        }
                        return -1L;
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i10) {
                        b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            aVar4.b(i10);
                        }
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final boolean a(int i10) {
                        b.a aVar4 = aVar3;
                        if (aVar4 == null) {
                            return true;
                        }
                        aVar4.a(i10);
                        return true;
                    }
                });
            } else {
                aVar3.a(iA);
                aVar3.b(iA);
            }
        } else {
            z10 = z11;
        }
        if (z10 || (aVar = this.f101539r) == null) {
            return;
        }
        aVar.b();
    }

    public final void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        FixContentFrameLayout.a aVar = (FixContentFrameLayout.a) this.f101533l.getLayoutParams();
        if (aVar.f102868a == i10 || aVar.f102869b == i11) {
            return;
        }
        aVar.f102868a = i10;
        aVar.f102869b = i11;
        this.f101533l.setLayoutParams(aVar);
    }

    public final void a(sg.bigo.ads.ad.interstitial.multi_img.c cVar) {
        FixContentFrameLayout fixContentFrameLayout;
        boolean z10;
        this.f101528g = cVar;
        if (a()) {
            int iA = e.a(this.f101527f, 12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f101532k.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = iA;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            layoutParams.bottomMargin = iA;
            layoutParams.height = -2;
            layoutParams.width = -2;
            this.f101532k.setLayoutParams(layoutParams);
            fixContentFrameLayout = this.f101532k;
            z10 = true;
        } else {
            fixContentFrameLayout = this.f101532k;
            z10 = false;
        }
        fixContentFrameLayout.setFixContent(z10);
    }

    static /* synthetic */ void a(d dVar, final Bitmap bitmap, final int i10) {
        if (dVar.a()) {
            dVar.f101534m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(d.this.f101534m.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i10);
                    d.this.f101534m.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    d.this.f101534m.setImageDrawable(bitmapDrawable);
                }
            });
        }
    }

    public boolean a() {
        return this.f101526a;
    }
}
