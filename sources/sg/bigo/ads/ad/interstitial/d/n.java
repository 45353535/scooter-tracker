package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.d.a;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public class n extends m {
    private LinearLayout G;
    private RoundedFrameLayout H;
    private TextView I;
    private IconListView J;
    private RoundedFrameLayout K;
    private Button L;
    private sg.bigo.ads.common.utils.n M;
    private ImageView N;
    private boolean O;
    private boolean P;
    private int Q;

    public n(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.O = false;
        this.P = false;
    }

    static /* synthetic */ void g(n nVar) {
        nVar.P = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        TransitionManager.beginDelayedTransition(nVar.f100917r, transitionSet);
        nVar.G.getMeasuredWidth();
        nVar.c(nVar.G.getMeasuredHeight());
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final boolean C() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final int D() {
        return Integer.MIN_VALUE;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final sg.bigo.ads.ad.interstitial.multi_img.c F() {
        return sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final void I() {
        if (this.P) {
            super.I();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final void J() {
        super.J();
        if (this.f100918s.f101808h) {
            sg.bigo.ads.ad.b.a.a(this.H, 18);
            sg.bigo.ads.ad.b.a.a(this.f100916q, this.H, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, this.f100918s.f101809i);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100916q, this.H, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        IconListView iconListView = this.J;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i10 = 0; items != null && i10 < items.size(); i10++) {
                IconListView.a aVar = items.get(i10);
                sg.bigo.ads.ad.b.a.a(aVar.f101499d, 26);
                sg.bigo.ads.ad.b.a.a(this.f100916q, aVar.f101499d, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, this.f100918s.f101809i);
                sg.bigo.ads.ad.b.a.a(aVar.f101502g, 26);
                sg.bigo.ads.ad.b.a.a(this.f100916q, aVar.f101502g, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, this.f100918s.f101809i);
            }
        }
        sg.bigo.ads.ad.interstitial.w wVar = this.f100918s;
        if (wVar == null || !wVar.f101807g) {
            sg.bigo.ads.ad.b.a.a(this.f100916q, this.E.f101531j, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
        } else {
            sg.bigo.ads.ad.b.a.a(this.E.f101531j, 9);
            sg.bigo.ads.ad.b.a.a(this.f100916q, this.E.f101531j, 8, ((sg.bigo.ads.ad.interstitial.t) this).f101734c, this.f100918s.f101809i);
        }
    }

    protected int L() {
        return 0;
    }

    protected int M() {
        return 0;
    }

    protected int N() {
        return 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    protected final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.n nVar = this.M;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.M.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    protected final void t() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar;
        super.t();
        this.f100921v.setTextColor(sg.bigo.ads.ad.interstitial.d.f100903b);
        ((m) this).f100985x.removeView(this.f100987z);
        this.f100987z.setCornerRadius(0.0f);
        int i10 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.G.addView(this.f100987z, 0, layoutParams);
        sg.bigo.ads.common.utils.u.a(this.G, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.n.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (n.this.O) {
                    return;
                }
                n nVar = n.this;
                nVar.G.getMeasuredWidth();
                nVar.c(n.this.G.getMeasuredHeight());
            }
        });
        this.J.a(this.f100920u);
        if (sg.bigo.ads.common.utils.k.a((Collection) this.J.getItems())) {
            this.J.setVisibility(8);
        } else {
            this.J.setVisibility(0);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.B;
        if (cVar != null) {
            cVar.a(false);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        sg.bigo.ads.ad.interstitial.multi_img.a aVar = this.D;
        if (aVar != null) {
            aVar.f101445f = false;
        }
        int iW = w();
        if (iW != 1) {
            if (iW == 2) {
                bVar = this.E;
                i10 = ViewCompat.MEASURED_STATE_MASK;
            }
            K();
            a((b.a) null, false);
        }
        bVar = this.E;
        bVar.b(sg.bigo.ads.common.w.b.b(i10));
        K();
        a((b.a) null, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    protected final int x() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final boolean z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        if (this.E == null) {
            return;
        }
        int iN = N();
        int iM = M();
        Context context = this.f100987z.getContext();
        this.E.f101532k.setCornerRadius(L());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.f101532k.getLayoutParams();
        marginLayoutParams.leftMargin = iM;
        boolean z10 = this.P;
        marginLayoutParams.topMargin = z10 ? this.Q + iN : iN;
        marginLayoutParams.rightMargin = iM;
        if (z10) {
            iN += this.Q;
        }
        marginLayoutParams.bottomMargin = iN;
        this.E.f101532k.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f100987z.getLayoutParams();
        int i11 = this.Q;
        marginLayoutParams2.topMargin = -i11;
        marginLayoutParams2.height = i10 + (i11 * 2);
        this.f100987z.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.E.f101515a.getLayoutParams();
        marginLayoutParams3.bottomMargin = this.Q + sg.bigo.ads.common.utils.e.a(context, 12);
        this.E.f101515a.setLayoutParams(marginLayoutParams3);
        RoundedFrameLayout roundedFrameLayout = this.H;
        int i12 = this.Q;
        roundedFrameLayout.a(i12, i12, 0.0f, 0.0f);
        this.H.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.H.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        layoutParams.topMargin = -this.Q;
        this.H.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final void a(int i10, boolean z10, int i11, boolean z11) {
        super.a(i10, z10, i10, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.n nVar = this.M;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.M.c();
    }

    static /* synthetic */ void c(n nVar) {
        nVar.O = true;
        nVar.P = true;
        nVar.f100916q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.3
            @Override // java.lang.Runnable
            public final void run() {
                n nVar2 = n.this;
                nVar2.G.getMeasuredWidth();
                nVar2.c(n.this.G.getMeasuredHeight());
                n.this.N.setVisibility(4);
            }
        });
        final float fA = sg.bigo.ads.common.utils.e.a(nVar.f100916q.getContext(), 252);
        final float measuredWidth = nVar.f100987z.getMeasuredWidth();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) nVar).f101734c);
        if (pVarA.a()) {
            float f10 = measuredWidth / fA;
            int i10 = pVarA.f102604b;
            int i11 = pVarA.f102605c;
            if (f10 < (i10 * 1.0f) / i11) {
                fA = ((i11 * measuredWidth) * 1.0f) / i10;
            }
        }
        nVar.f100916q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.4
            @Override // java.lang.Runnable
            public final void run() {
                n.b(n.this, (int) fA);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final void b(int i10) {
        super.b(i10);
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) Math.max(1, i10)) * 1000) { // from class: sg.bigo.ads.ad.interstitial.d.n.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                n.this.f100916q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.c(n.this);
                    }
                });
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.M = nVar;
        nVar.c();
    }

    static /* synthetic */ void b(n nVar, int i10) {
        long jA;
        sg.bigo.ads.common.utils.r rVar;
        final boolean zV = nVar.v();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.n.7
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                if (zV) {
                    sg.bigo.ads.ad.interstitial.c.e(n.this.K);
                }
                n.this.I();
            }
        });
        TransitionManager.beginDelayedTransition(nVar.f100917r, transitionSet);
        nVar.a(new b.a(), true);
        nVar.c(i10);
        sg.bigo.ads.ad.interstitial.f fVar = nVar.f100920u;
        if (fVar != null) {
            int i11 = fVar.f101206b;
            int i12 = 3;
            if (i11 == 1) {
                rVar = sg.bigo.ads.common.utils.r.f102828a;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    rVar = sg.bigo.ads.common.utils.r.f102828a;
                    i12 = 10;
                }
                jA = 0;
            } else {
                rVar = sg.bigo.ads.common.utils.r.f102828a;
                i12 = 5;
            }
            jA = rVar.a(i12);
        } else {
            jA = 0;
        }
        long jMax = Math.max(0L, jA);
        if (jMax == 0) {
            nVar.N.setVisibility(0);
        } else {
            nVar.N.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.t) n.this).f101734c)) {
                        return;
                    }
                    TransitionSet transitionSet2 = new TransitionSet();
                    transitionSet2.addTransition(new Fade());
                    TransitionManager.beginDelayedTransition(n.this.H, transitionSet2);
                    n.this.N.setVisibility(0);
                }
            }, jMax);
        }
        nVar.N.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.d.n.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.g(n.this);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final void a(sg.bigo.ads.ad.interstitial.q qVar) {
        super.a(qVar);
        this.G = (LinearLayout) this.f100916q.findViewById(R.id.inter_media_container);
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.f100916q.findViewById(R.id.inter_media_gp_container);
        this.H = roundedFrameLayout;
        this.I = (TextView) roundedFrameLayout.findViewById(R.id.inter_company);
        this.J = (IconListView) this.H.findViewById(R.id.inter_download_msg);
        RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) this.H.findViewById(R.id.inter_btn_cta_layout);
        this.K = roundedFrameLayout2;
        this.L = (Button) roundedFrameLayout2.findViewById(R.id.inter_btn_cta);
        this.N = (ImageView) this.H.findViewById(R.id.inter_gp_btn_close);
        this.Q = sg.bigo.ads.common.utils.e.a(this.f100916q.getContext(), 12);
    }

    private void a(b.a aVar, boolean z10) {
        a.C1234a c1234aU = u();
        Button button = this.L;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.a(button, c1234aU.f100944a, aVar);
        }
        TextView textView = this.I;
        if (textView != null) {
            textView.setTextColor(c1234aU.f100944a);
        }
        if (z10 && c1234aU.f100945b) {
            a(this.L, new b.a() { // from class: sg.bigo.ads.ad.interstitial.d.n.8
                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i10) {
                    super.b(i10);
                    if (n.this.I != null) {
                        n.this.I.setTextColor(i10);
                    }
                }
            });
        }
    }
}
