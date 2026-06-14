package sg.bigo.ads.ad.interstitial.d;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.d.a;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public class b extends sg.bigo.ads.ad.interstitial.d.a implements sg.bigo.ads.ad.interstitial.f.c {

    @Nullable
    protected ViewGroup A;

    @Nullable
    protected Button B;

    @Nullable
    protected RoundedFrameLayout C;

    @Nullable
    protected MediaView D;

    @Nullable
    protected TextView E;

    @Nullable
    protected TextView F;

    @Nullable
    protected Button G;

    @Nullable
    protected Button H;

    @Nullable
    protected RoundedImageView I;
    protected int J;
    protected int K;
    protected boolean L;
    private int M;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected RelativeLayout f100950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    protected RealtimeBlurLinearLayout f100951y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected ViewGroup f100952z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.b$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100962a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.b.values().length];
            f100962a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.b.f100662a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100962a[sg.bigo.ads.ad.interstitial.b.f100664c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100962a[sg.bigo.ads.ad.interstitial.b.f100663b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100962a[sg.bigo.ads.ad.interstitial.b.f100666e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100962a[sg.bigo.ads.ad.interstitial.b.f100665d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RequiresApi(api = 19)
    protected class a extends b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RectF f100964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RectF f100965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RectF f100966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f100967e = Float.NaN;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private RectF f100968f;

        protected a() {
        }

        @Override // sg.bigo.ads.common.utils.b.a
        @CallSuper
        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
            if (transitionValues.view == b.this.f100951y) {
                Rect rect = (Rect) transitionValues.values.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                b bVar = b.this;
                Rect rect3 = new Rect(sg.bigo.ads.common.utils.u.a(bVar.B, bVar.J));
                this.f100964b = new RectF(rect3);
                if (rect3.intersect(rect2)) {
                    this.f100965c = new RectF(rect);
                    this.f100966d = new RectF(rect2);
                    this.f100967e = b.this.B.getTranslationY();
                    this.f100968f = new RectF(rect2);
                }
            }
        }

        @Override // sg.bigo.ads.common.utils.b.a
        public final void a(Object obj, Object obj2) {
            if (obj != b.this.f100951y || this.f100965c == null || this.f100966d == null || this.f100968f == null || this.f100964b == null || !(obj2 instanceof PointF) || Float.isNaN(this.f100967e)) {
                return;
            }
            PointF pointF = (PointF) obj2;
            if (this.f100965c.centerX() != this.f100966d.centerX()) {
                b.this.B.setTranslationY(this.f100967e - (Math.abs(this.f100968f.top - this.f100964b.bottom) * (Math.abs(pointF.x - this.f100965c.left) / Math.abs(this.f100966d.left - this.f100965c.left))));
            } else {
                this.f100968f.offsetTo(pointF.x, pointF.y);
                if (new RectF(this.f100964b).intersect(this.f100968f)) {
                    b.this.B.setTranslationY((this.f100967e + this.f100968f.top) - this.f100964b.bottom);
                }
            }
        }
    }

    public b(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.K = -1;
        this.L = false;
    }

    private boolean M() {
        return ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f101734c.f()).aR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sg.bigo.ads.common.p b(int i10, int i11, int i12, int i13) {
        sg.bigo.ads.common.p pVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f101734c);
        if (pVarA.a(i10, i11)) {
            this.C.setCornerRadius(0.0f);
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            pVar = new sg.bigo.ads.common.p(i10, i11);
        } else {
            this.C.setCornerRadius(sg.bigo.ads.common.utils.e.a(r2.getContext(), 8));
            marginLayoutParams.setMargins(i12, i13, i12, i13);
            sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarA.f102604b, pVarA.f102605c, i10 - (i12 * 2), i11 - (i13 * 2));
            int i14 = pVarA2.f102604b;
            marginLayoutParams.width = i14;
            int i15 = pVarA2.f102605c;
            marginLayoutParams.height = i15;
            pVar = new sg.bigo.ads.common.p(i14, i15);
        }
        sg.bigo.ads.common.utils.u.c(this.D, -1, -1);
        this.C.setLayoutParams(marginLayoutParams);
        return pVar;
    }

    protected void A() {
        B();
    }

    public final void B() {
        if (v()) {
            Button button = this.G;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
            }
            Button button2 = this.H;
            if (button2 != null) {
                sg.bigo.ads.ad.interstitial.c.e(button2);
            }
        }
    }

    protected final void C() {
        Button button;
        if (this.f100916q == null || (button = this.B) == null || button.getVisibility() != 0) {
            return;
        }
        float translationY = this.B.getTranslationY();
        RectF rectF = new RectF(sg.bigo.ads.common.utils.u.a(this.B, this.J));
        rectF.offset(0.0f, -translationY);
        float f10 = rectF.top;
        RectF rectF2 = new RectF(sg.bigo.ads.common.utils.u.a(this.f100921v, 0));
        float f11 = rectF2.top;
        if (rectF2.intersect(rectF)) {
            rectF.offset(0.0f, f11 - rectF.bottom);
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f100951y;
        if (realtimeBlurLinearLayout != null && realtimeBlurLinearLayout.getVisibility() == 0) {
            RectF rectF3 = new RectF(sg.bigo.ads.common.utils.u.a(this.f100951y, 0));
            float f12 = rectF3.top;
            if (rectF3.intersect(rectF)) {
                rectF.offset(0.0f, f12 - rectF.bottom);
            }
        }
        float f13 = rectF.top;
        if (f13 != f10) {
            this.B.setTranslationY(f13 - f10);
        } else {
            this.B.setTranslationY(0.0f);
        }
    }

    protected final void D() {
        sg.bigo.ads.common.utils.u.a(this.C, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.C();
            }
        });
    }

    protected void E() {
        if (this.f100951y == null) {
            return;
        }
        final int iY = y();
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f100951y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(iY > 0);
                    }
                });
            }
        };
        if (iY == 0) {
            runnable.run();
        } else {
            a(iY, runnable);
        }
    }

    protected void F() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f100951y;
        if (realtimeBlurLinearLayout == null || this.f100916q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -(this.f100916q.getMeasuredHeight() - sg.bigo.ads.common.utils.u.a(this.f100916q, this.f100951y).y);
            this.f100951y.requestLayout();
        }
    }

    protected void G() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f100951y;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.M;
            this.f100951y.requestLayout();
        }
    }

    protected void H() {
        sg.bigo.ads.ad.interstitial.w wVar = this.f100918s;
        int i10 = wVar != null ? wVar.f101809i : 0;
        View viewFindViewById = this.f100916q.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.interstitial.w wVar2 = this.f100918s;
        if (wVar2 == null || !wVar2.f101807g) {
            MediaView mediaView = this.D;
            if (mediaView != null) {
                mediaView.setOtherClickAreaClick(false);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.f100916q, viewFindViewById, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        } else {
            MediaView mediaView2 = this.D;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(true);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.f100916q, viewFindViewById, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, i10);
            }
        }
        sg.bigo.ads.ad.interstitial.w wVar3 = this.f100918s;
        boolean z10 = wVar3 != null && wVar3.f101806f;
        MediaView mediaView3 = this.D;
        if (mediaView3 != null) {
            sg.bigo.ads.ad.b.a.a(this.f100916q, mediaView3, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, i10);
            this.D.setMediaAreaClickable(z10);
            this.D.b().a(!z10);
        }
        sg.bigo.ads.ad.interstitial.w wVar4 = this.f100918s;
        boolean z11 = wVar4 != null && wVar4.f101808h;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f100951y;
        if (realtimeBlurLinearLayout != null) {
            sg.bigo.ads.ad.b.a.a(realtimeBlurLinearLayout, 18);
            ViewGroup viewGroup = this.f100916q;
            if (z11) {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f100951y, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, this.f100918s.f101809i);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f100951y, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int I() {
        if (this.K == -1) {
            sg.bigo.ads.api.a.m mVar = this.f100919t;
            this.K = mVar != null ? mVar.a("video_play_page.webview_layout") : 0;
        }
        int i10 = this.K;
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i10;
            default:
                return 0;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int J() {
        return sg.bigo.ads.ad.interstitial.d.a.b(this.f100919t, "video_play_page.webview_force_time");
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean K() {
        int I = I();
        return I == 5 || I == 6;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean L() {
        return this.L;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        return this.C;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        return this.D;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        return this.B;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final boolean n() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    protected final void q() {
        String strI = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f101734c.f()).i();
        TextView textView = (TextView) this.f100916q.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    @Override // sg.bigo.ads.ad.interstitial.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void t() {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.d.b.t():void");
    }

    protected int z() {
        return R.id.inter_component_19;
    }

    private void b(@ColorInt int i10, @ColorInt int i11, int i12) {
        if (this.f100951y != null) {
            float f10 = i12;
            this.f100951y.setBlurStyle(new sg.bigo.ads.common.view.a.b(f10, f10, f10, f10, i10, i11, sg.bigo.ads.common.utils.e.a(r0.getContext(), 1)));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    protected final void a(double d10) {
        TextView textView;
        int i10;
        if (d10 <= 3.0d) {
            textView = this.f100921v;
            if (textView == null) {
                return;
            } else {
                i10 = sg.bigo.ads.ad.interstitial.d.f100903b;
            }
        } else {
            textView = this.f100921v;
            if (textView == null) {
                return;
            } else {
                i10 = sg.bigo.ads.ad.interstitial.d.f100902a;
            }
        }
        textView.setTextColor(sg.bigo.ads.common.w.b.a(i10, 0.6f));
    }

    private void a(@ColorInt int i10, @ColorInt int i11, int i12) {
        if (this.f100951y != null) {
            float f10 = i12;
            this.f100951y.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, i10, i11, sg.bigo.ads.common.utils.e.a(r0.getContext(), 1)));
        }
    }

    protected void b(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        float fA = sg.bigo.ads.common.utils.e.a(this.f100951y.getContext(), 8);
        Button button = (Button) this.f100951y.findViewById(R.id.inter_btn_cta_main);
        this.H = button;
        if (button != null) {
            button.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -16724924));
            bVar.a(this.H);
        }
        Button button2 = (Button) this.f100951y.findViewById(R.id.inter_btn_cta);
        this.G = button2;
        if (button2 != null) {
            button2.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, 0));
            bVar.a(this.G);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final void a(int i10, int i11, int i12, int i13) {
        if (K()) {
            if (i10 >= i12) {
                this.L = true;
                return;
            }
            this.L = false;
            if (this.f100950x != null) {
                int iMin = (i12 - Math.min(i10, i11)) + i13;
                ViewGroup.LayoutParams layoutParams = this.f100950x.getLayoutParams();
                if (iMin != layoutParams.height) {
                    layoutParams.height = iMin;
                    this.f100950x.requestLayout();
                    b(this.f100950x.getMeasuredWidth(), layoutParams.height, sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12), sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12));
                    C();
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i10, int i11, int i12, @Nullable View... viewArr) {
        super.a(viewGroup, view, i10, i11, i12, viewArr);
        H();
        sg.bigo.ads.ad.interstitial.t.a((View) this.f100916q);
    }

    protected final void a(boolean z10) {
        if (this.f100951y == null || this.f100922w) {
            return;
        }
        final a.C1234a c1234aU = u();
        Button button = this.G;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.b(button, c1234aU.f100944a);
        }
        if (z10) {
            F();
            this.f100951y.setVisibility(0);
            this.f100951y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(b.this.new a());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.b.5.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            b.this.A();
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            if (c1234aU.f100945b) {
                                b bVar = b.this;
                                bVar.a(bVar.G, new b.a());
                            }
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(b.this.f100917r, transitionSet);
                    b.this.G();
                }
            });
        } else {
            this.f100951y.setVisibility(0);
            C();
            A();
            if (c1234aU.f100945b) {
                a(this.G, new b.a());
            }
        }
    }

    protected boolean a(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        ViewGroup viewGroup;
        if (y() < 0 || (viewGroup = this.f100916q) == null) {
            return false;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(z());
        if (viewStub != null) {
            this.f100952z = (ViewGroup) viewStub.inflate();
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = (RealtimeBlurLinearLayout) this.f100916q.findViewById(R.id.inter_component_layout);
        this.f100951y = realtimeBlurLinearLayout;
        if (realtimeBlurLinearLayout == null) {
            return false;
        }
        this.I = (RoundedImageView) realtimeBlurLinearLayout.findViewById(R.id.inter_icon);
        this.E = (TextView) this.f100951y.findViewById(R.id.inter_title);
        TextView textView = (TextView) this.f100951y.findViewById(R.id.inter_description);
        this.F = textView;
        bVar.a(this.E, textView);
        bVar.a(this.I);
        sg.bigo.ads.common.utils.u.a(this.f100951y, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.E();
            }
        });
        ViewGroup.LayoutParams layoutParams = this.f100951y.getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.M = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        this.f100951y.setVisibility(4);
        this.f100951y.requestLayout();
        return true;
    }
}
