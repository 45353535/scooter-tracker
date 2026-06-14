package sg.bigo.ads.ad.interstitial.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final sg.bigo.ads.ad.interstitial.d f100772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final sg.bigo.ads.ad.interstitial.multi_img.b f100773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected ViewFlow f100774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Indicator f100775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected LinearLayout f100776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c f100777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c f100778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.a f100779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ValueCallback<Double> f100780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f100781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<Runnable> f100782y;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.c.b$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100794a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f100794a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100794a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100794a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100794a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
        this.f100780w = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.c.b.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d10) {
                Double d11 = d10;
                if (d11 != null) {
                    b.this.b(d11.doubleValue());
                }
            }
        };
        this.f100781x = new AtomicBoolean(false);
        this.f100782y = new ArrayList();
        this.f100773p = bVar2;
        this.f100772o = new sg.bigo.ads.ad.interstitial.d();
    }

    protected void g(sg.bigo.ads.ad.interstitial.q qVar) {
    }

    protected final boolean l() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f100773p;
        return bVar == null || bVar.f101451b == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    protected final void m() {
        this.f100781x.set(true);
    }

    protected final void n() {
        this.f100781x.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f100774q)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.f100774q, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.c.b.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = b.this.f100782y.iterator();
                    while (it.hasNext()) {
                        b.this.f100774q.post((Runnable) it.next());
                    }
                    b.this.f100782y.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(b.this.f100774q, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.f100782y.iterator();
        while (it.hasNext()) {
            this.f100774q.post(it.next());
        }
        this.f100782y.clear();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(final sg.bigo.ads.ad.interstitial.q qVar, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, String str, boolean z10) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(this.f100728j.getContext(), this.f100773p, cVar, e(), i10, str, z10, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                sg.bigo.ads.ad.interstitial.u.a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            aVar3.a(bitmap2);
                        }
                    }
                });
            }
        });
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f102994a = -1;
        bVar.f102995b = -1;
        bVar.f102996c = false;
        bVar.f102997d = cVar.f101470d;
        this.f100774q.addView(aVar.f101531j, bVar);
        if (this.f100779v != null) {
            aVar.f101539r = new d.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.2
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    b.this.f100779v.a(b.this.f100774q.a(aVar.f101531j));
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

    protected void b(double d10) {
        if (d10 <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.f100777t;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.f100778u;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.f100777t;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.f100778u;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void d(sg.bigo.ads.ad.interstitial.q qVar) {
        b bVar = this;
        Context context = bVar.f100728j.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = bVar.f100773p;
        List<String> listA = bVar2 != null ? bVar2.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = bVar.f100773p;
        boolean z10 = bVar3 != null && bVar3.f101454e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar = bVar3 != null ? bVar3.f101451b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = bVar3 != null ? bVar3.f101453d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(bVar.f101780f);
        bVar.f100774q = (ViewFlow) bVar.f100729k.findViewById(R.id.inter_media_ad_view_flow);
        bVar.f100775r = (Indicator) bVar.f100729k.findViewById(R.id.inter_vf_indicator);
        sg.bigo.ads.api.a.m mVar = bVar.f101781g;
        int iA = sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("endpage.background_colour") : 1);
        if (iA == 2) {
            bVar.f100729k.setBackgroundColor(bVar.f100772o.a(ViewCompat.MEASURED_STATE_MASK));
        } else if (iA == 3 || iA == 4) {
            bVar.f100729k.setBackgroundColor(bVar.f100772o.a(ViewCompat.MEASURED_STATE_MASK));
            bVar.f100779v = new sg.bigo.ads.ad.interstitial.multi_img.a(bVar.f100729k, bVar.f100774q, bVar.f100772o, iA);
        } else {
            bVar.f100729k.setBackgroundColor(bVar.f100772o.a(-1));
        }
        bVar.f100776s = (LinearLayout) bVar.f100729k.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) bVar.f101780f.getWarning())) {
            ((ViewGroup.MarginLayoutParams) bVar.f100776s.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
        }
        g(qVar);
        bVar.f100772o.a(bVar.f100780w);
        if (bVar.f100773p != null) {
            Context context2 = bVar.f100728j.getContext();
            bVar.f100774q.setDividerWidth(sg.bigo.ads.common.utils.e.a(context2, dVar.f101478f));
            bVar.f100774q.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context2, dVar.f101481i));
            bVar.f100774q.setViewStyle(dVar.f101482j);
            bVar.f100774q.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVar, bVar.f100775r, bVar.f100779v));
            int i10 = 0;
            int i11 = 0;
            while (listA != null && i11 < listA.size()) {
                String str = listA.get(i11);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    bVar.a(qVar, cVar, iA, str, ((sg.bigo.ads.core.a.a) bVar.f101780f.f()).al());
                    i10++;
                }
                i11++;
                bVar = this;
            }
            int iMax = Math.max(dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 3 - i10 : 0, 0);
            if (z10) {
                iMax = Math.max(iMax, 1);
            }
            int i12 = iMax;
            for (int i13 = 0; i13 < i12; i13++) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(qVar, cVar, iA, (String) null, false);
                sg.bigo.ads.ad.interstitial.u.a(qVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.6
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        aVarA.a(bitmap);
                    }
                });
            }
            bVar = this;
            bVar.f100774q.setMainChildSize(pVarA);
            int i14 = AnonymousClass4.f100794a[dVar.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.c.b.11
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        b.this.f101780f.a((sg.bigo.ads.common.i) null, 4, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, true);
                bVar.f100777t = cVar2;
                bVar.f100774q.setStartView(cVar2.f101518a);
                bVar.f100774q.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, false);
                bVar.f100778u = cVar3;
                bVar.f100774q.setEndView(cVar3.f101518a);
                bVar.f100774q.setOnEndViewShowListener(dVar2);
            }
            int itemCount = dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? bVar.f100774q.getItemCount() >> 1 : 0;
            bVar.f100774q.b(itemCount);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = bVar.f100779v;
            if (aVar != null) {
                aVar.b(itemCount);
            }
        }
        if (bVar.l()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar4 = bVar.f100773p;
        int iA2 = bVar4 != null ? bVar4.f101450a.a("endpage.multi_guide") : 0;
        switch (iA2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                bVar.a(iA2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.f100774q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b bVar5 = b.this;
                                if (bVar5.f100774q.f102957g) {
                                    return;
                                }
                                b.a(bVar5, 3L, 0L, 300L);
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
                bVar.f100774q.setFlipInterval((iA2 - 5) * 1000);
                bVar.f100774q.c();
                break;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void a(int r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            sg.bigo.ads.common.view.ViewFlow r0 = r7.f100774q
            java.util.List r0 = r0.getItems()
            android.view.ViewGroup r1 = r7.f100729k
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sg.bigo.ads.ad.b.a.a(r1, r2)
            sg.bigo.ads.common.view.ViewFlow r1 = r7.f100774q
            sg.bigo.ads.ad.b.a.a(r1, r2)
            r1 = 0
            r2 = 4
            if (r10 == 0) goto L2d
            android.view.ViewGroup r10 = r7.f100728j
            android.view.ViewGroup r3 = r7.f100729k
            sg.bigo.ads.ad.b.b r4 = r7.f101780f
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r8)
            android.view.ViewGroup r10 = r7.f100728j
            sg.bigo.ads.common.view.ViewFlow r3 = r7.f100774q
            sg.bigo.ads.ad.b.b r4 = r7.f101780f
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r8)
            goto L3d
        L2d:
            android.view.ViewGroup r10 = r7.f100728j
            android.view.ViewGroup r3 = r7.f100729k
            sg.bigo.ads.core.adview.h r4 = sg.bigo.ads.ad.interstitial.q.F
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r1)
            android.view.ViewGroup r10 = r7.f100728j
            sg.bigo.ads.common.view.ViewFlow r3 = r7.f100774q
            sg.bigo.ads.ad.b.a.a(r10, r3, r2, r4, r1)
        L3d:
            boolean r10 = r7.l()
            if (r10 != 0) goto L62
            sg.bigo.ads.ad.interstitial.multi_img.b r10 = r7.f100773p
            r3 = 1
            if (r10 == 0) goto L51
            sg.bigo.ads.api.a.m r10 = r10.f101450a
            java.lang.String r4 = "endpage.multi_click_type"
            int r10 = r10.a(r4)
            goto L52
        L51:
            r10 = r3
        L52:
            r4 = 2
            r5 = 3
            if (r10 == r4) goto L60
            if (r10 == r5) goto L59
            goto L62
        L59:
            if (r8 == r3) goto L5e
            if (r8 == r4) goto L5e
            goto L60
        L5e:
            r8 = r5
            goto L63
        L60:
            r3 = r1
            goto L5e
        L62:
            r3 = r1
        L63:
            java.util.Iterator r10 = r0.iterator()
        L67:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r10.next()
            android.view.View r0 = (android.view.View) r0
            int r4 = sg.bigo.ads.ad.interstitial.multi_img.view.d.f101525e
            java.lang.Object r0 = r0.getTag(r4)
            boolean r4 = r0 instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d
            if (r4 == 0) goto L67
            sg.bigo.ads.ad.interstitial.multi_img.view.d r0 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) r0
            sg.bigo.ads.common.view.RoundedFrameLayout r4 = r0.f101531j
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            sg.bigo.ads.ad.b.a.a(r4, r5)
            android.view.ViewGroup r4 = r7.f100728j
            sg.bigo.ads.common.view.RoundedFrameLayout r0 = r0.f101531j
            if (r9 == 0) goto La0
            sg.bigo.ads.ad.b.b r5 = r7.f101780f
            if (r3 == 0) goto L9c
            sg.bigo.ads.ad.interstitial.c.b$3 r6 = new sg.bigo.ads.ad.interstitial.c.b$3
            r6.<init>()
            sg.bigo.ads.ad.b.a.a(r4, r0, r2, r5, r6)
            goto L67
        L9c:
            sg.bigo.ads.ad.b.a.a(r4, r0, r2, r5, r8)
            goto L67
        La0:
            sg.bigo.ads.core.adview.h r5 = sg.bigo.ads.ad.interstitial.q.F
            sg.bigo.ads.ad.b.a.a(r4, r0, r2, r5, r1)
            goto L67
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.b.a(int, boolean, boolean):void");
    }

    static /* synthetic */ void a(b bVar, final long j10, long j11, final long j12) {
        if (j10 > 0) {
            ViewFlow viewFlow = bVar.f100774q;
            if (!viewFlow.f102957g && !viewFlow.e()) {
                bVar.f100774q.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(bVar.f100728j.getContext(), 40);
                final int scrollX = bVar.f100774q.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j12);
                valueAnimatorOfInt.setStartDelay(j11);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.b.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        b.a(b.this, j10 - 1, 300L, j12);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.c.b.8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (b.this.f100781x.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            b.this.f100782y.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    b.a(b.this, j10, 300L, j12);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            b.this.f100774q.scrollTo(scrollX + ((Integer) animatedValue).intValue(), b.this.f100774q.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        bVar.f100774q.setScrollEnabled(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, View view) {
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, final t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        return super.a(qVar, viewGroup, view, new t.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.5
            @Override // sg.bigo.ads.ad.interstitial.t.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = b.this.f101780f.getDescription();
                }
                t.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i10, i11, i12, viewArr);
    }
}
