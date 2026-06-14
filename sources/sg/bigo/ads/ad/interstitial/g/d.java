package sg.bigo.ads.ad.interstitial.g;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.a.a.b;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.a.b.c;
import sg.bigo.ads.ad.interstitial.f.b;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public class d extends sg.bigo.ads.ad.interstitial.a implements sg.bigo.ads.ad.interstitial.g.a {
    protected sg.bigo.ads.ad.interstitial.a G;
    protected sg.bigo.ads.ad.b.a.a.b H;
    protected int I;
    protected int J;
    protected boolean K;
    private sg.bigo.ads.ad.interstitial.c.a O;
    private c P;
    private TextView Q;
    private boolean R;
    private int S;
    private int T;
    private int U;
    private ViewGroup V;
    private sg.bigo.ads.ad.b.b W;
    private m X;
    private boolean Y;
    private final ValueCallback<Double> Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private final AdCountDownButton.b f101329aa;

    static class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f101332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f101333b = 14;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.ad.b.b f101334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f101335d;

        public a(d dVar, sg.bigo.ads.ad.b.b bVar, int i10) {
            this.f101332a = i10;
            this.f101334c = bVar;
            this.f101335d = dVar;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            d dVar = this.f101335d;
            if (dVar != null) {
                dVar.a(true, true);
            }
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(String str) {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(i iVar, sg.bigo.ads.api.core.d dVar) {
            sg.bigo.ads.ad.b.b bVar = this.f101334c;
            if (bVar != null) {
                bVar.a(iVar, this.f101332a, this.f101333b, dVar);
            }
        }
    }

    static class b implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private sg.bigo.ads.ad.b.b f101336a;

        public b(sg.bigo.ads.ad.b.b bVar) {
            this.f101336a = bVar;
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.c.a
        public final void a(i iVar, sg.bigo.ads.api.core.d dVar) {
            sg.bigo.ads.ad.b.b bVar = this.f101336a;
            if (bVar != null) {
                bVar.a(iVar, 15, 13, dVar);
            }
        }
    }

    protected d(@NonNull Activity activity) {
        super(activity);
        this.I = 0;
        this.J = 1;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.K = false;
        this.U = 0;
        this.Z = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.g.d.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d10) {
                c cVar;
                int i10;
                Double d11 = d10;
                if (d.this.P != null) {
                    if (d11.doubleValue() <= 3.0d) {
                        cVar = d.this.P;
                        i10 = 0;
                    } else {
                        cVar = d.this.P;
                        i10 = 1;
                    }
                    cVar.setStyleType$2563266(i10);
                }
            }
        };
        this.f101329aa = new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.interstitial.g.d.2
            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
            public final void a() {
                d dVar = d.this;
                dVar.K = true;
                dVar.aq();
            }
        };
    }

    private boolean ar() {
        Pair<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.interstitial.a> pairAo = ao();
        if (pairAo == null) {
            return false;
        }
        sg.bigo.ads.ad.b.b bVar = (sg.bigo.ads.ad.b.b) pairAo.first;
        sg.bigo.ads.ad.interstitial.a aVar = (sg.bigo.ads.ad.interstitial.a) pairAo.second;
        if (bVar == null || aVar == null) {
            return false;
        }
        at();
        ViewGroup viewGroup = this.f101385z;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.X = ((sg.bigo.ads.core.a.a) bVar.f()).e();
        ((s) this.f101384y).a(bVar);
        aVar.C = bVar;
        this.I++;
        aVar.T();
        this.G = aVar;
        if (1 == this.I) {
            A();
        }
        return true;
    }

    private int as() {
        m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        if (mVar == null) {
            return 15;
        }
        if (this.R) {
            return mVar.a("multi_ads_endpage.force_staying_time", 3);
        }
        sg.bigo.ads.ad.b.b bVar = this.W;
        return bVar != null ? ((sg.bigo.ads.core.a.a) bVar.f()).e().a("endpage.force_staying_time", 3) : mVar.a("multi_ads.force_staying_time", 15);
    }

    private void at() {
        sg.bigo.ads.ad.interstitial.a aVar = this.G;
        if (aVar != null) {
            aVar.F();
            this.G = null;
        }
        sg.bigo.ads.ad.b.a.a.b bVar = this.H;
        if (bVar != null) {
            bVar.H();
        }
    }

    private boolean au() {
        m mVar;
        b.a aVar;
        T t10;
        sg.bigo.ads.ad.b.b bVar = this.W;
        if (bVar != null && (t10 = this.f101384y) != 0) {
            ((s) t10).c(bVar);
        }
        sg.bigo.ads.ad.b.a.a.b bVar2 = this.H;
        int i10 = Integer.MAX_VALUE;
        sg.bigo.ads.ad.b.b bVar3 = null;
        for (Map.Entry<sg.bigo.ads.ad.b.b, b.a> entry : bVar2.L.entrySet()) {
            sg.bigo.ads.ad.b.b key = entry.getKey();
            m mVarE = ((sg.bigo.ads.core.a.a) key.f()).e();
            if (mVarE != null && !entry.getValue().f100186e && entry.getValue().f100182a && 1 == mVarE.a("endpage.is_endpage") && 1 == mVarE.a("endpage.ep_sprt") && entry.getValue().f100184c < i10) {
                i10 = entry.getValue().f100184c;
                bVar3 = key;
            }
        }
        if (bVar3 != null && (aVar = bVar2.L.get(bVar3)) != null) {
            aVar.f100186e = true;
        }
        this.W = bVar3;
        if (bVar3 != null || ((mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c) != null && 1 == mVar.a("multi_ads_endpage.is_endpage", 1) && !this.R)) {
            sg.bigo.ads.ad.b.b bVar4 = this.W;
            if (bVar4 != null) {
                sg.bigo.ads.ad.interstitial.c.a aVarA = sg.bigo.ads.ad.interstitial.c.a.a(bVar4, ((sg.bigo.ads.core.a.a) bVar4.f()).e(), null, null, false);
                this.O = aVarA;
                if (aVarA != null) {
                    av();
                    if (this.V != null) {
                        at();
                        A();
                        this.O.a(this, this.V, ai());
                        ap();
                        return true;
                    }
                }
            } else {
                sg.bigo.ads.ad.b.a.a.b bVar5 = this.H;
                if (bVar5.S > 0 && bVar5.O.get() == bVar5.S) {
                    sg.bigo.ads.ad.interstitial.c.a aVarA2 = sg.bigo.ads.ad.interstitial.c.a.a(this.H, ((sg.bigo.ads.ad.interstitial.a) this).f100542c, null, null, false);
                    this.O = aVarA2;
                    if (aVarA2 != null) {
                        av();
                        if (this.V != null) {
                            this.R = true;
                            this.K = false;
                            A();
                            this.O.a(this, this.V, ai());
                            at();
                            ap();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void av() {
        ViewStub viewStub;
        if (this.V != null || (viewStub = (ViewStub) p(R.id.bigo_ad_native_ad_view_stub)) == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.bigo_ad_activity_interstitial_multi_owner_native);
        this.V = (ViewGroup) viewStub.inflate();
    }

    private Map<String, Integer> aw() {
        HashMap map = new HashMap();
        for (sg.bigo.ads.ad.b.b bVar : this.H.L.keySet()) {
            map.put(((sg.bigo.ads.core.a.a) bVar.f()).r(), 1);
            if (((sg.bigo.ads.core.a.a) bVar.f()).e() != null && 1 == ((sg.bigo.ads.core.a.a) bVar.f()).e().a("endpage.is_endpage", 1) && ((sg.bigo.ads.core.a.a) bVar.f()).e().a("endpage.ep_sprt", 0) == 0) {
                map.put(((sg.bigo.ads.core.a.a) bVar.f()).r(), 2);
            }
        }
        return map;
    }

    private boolean ax() {
        return this.H.I instanceof sg.bigo.ads.ad.b.a.a.d;
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
        int iAs = as();
        if (iAs <= 0) {
            iAs = 10;
        }
        if (this.R || this.W != null) {
            this.A.b(iAs, this.f101329aa);
        } else {
            this.A.a(iAs, this.f101329aa);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        this.H = null;
        this.W = null;
        super.F();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void J() {
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int S() {
        return R.layout.bigo_ad_one2n_activity_interstitial;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        sg.bigo.ads.ad.b.b bVarH = ((s) this.f101384y).H();
        if (!(bVarH instanceof sg.bigo.ads.ad.b.a.a.b)) {
            aG();
            return;
        }
        this.H = (sg.bigo.ads.ad.b.a.a.b) bVarH;
        m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        if (mVar != null) {
            this.S = mVar.a("multi_ads.n_tips", 0);
            this.J = ((sg.bigo.ads.ad.interstitial.a) this).f100542c.a("multi_ads.switch_type", 1);
        }
        int i10 = this.S;
        if (i10 == 2) {
            FrameLayout frameLayout = (FrameLayout) p(R.id.inter_container);
            if (frameLayout != null && this.S != 0) {
                this.P = new c(this.L);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(frameLayout.getContext(), 2));
                int iA = sg.bigo.ads.common.utils.e.a(frameLayout.getContext(), 12);
                layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(frameLayout.getContext(), 7);
                layoutParams.leftMargin = iA;
                layoutParams.rightMargin = iA;
                layoutParams.gravity = 48;
                frameLayout.addView(this.P, layoutParams);
                this.P.setTotalNum(aw());
            }
        } else if (i10 == 1) {
            TextView textView = new TextView(this.L);
            this.Q = textView;
            textView.setTextSize(12.0f);
            this.Q.setTextColor(q.b("#CCFFFFFF", -1));
            this.Q.setShadowLayer(2.0f, 0.0f, 2.0f, ViewCompat.MEASURED_STATE_MASK);
            ViewGroup viewGroup = (ViewGroup) p(R.id.bigo_ad_close_progress_container);
            if (viewGroup != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 7);
                viewGroup.addView(this.Q, 0, marginLayoutParams);
            }
        }
        if (ar()) {
            return;
        }
        aG();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        return 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Z() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final ValueCallback<Double> a() {
        return this.Z;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void aa() {
        super.aa();
        f(0);
        z();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        sg.bigo.ads.ad.b.a.a.b bVar = this.H;
        if (bVar == null) {
            return true;
        }
        sg.bigo.ads.ad.b.b bVar2 = bVar.I;
        if (bVar2 instanceof sg.bigo.ads.ad.b.a.a.d) {
            return ((sg.bigo.ads.ad.b.a.a.d) bVar2).P;
        }
        return true;
    }

    protected Pair<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.interstitial.a> ao() {
        sg.bigo.ads.ad.b.b bVarG = this.H.G();
        if (bVarG == null) {
            return null;
        }
        Object eVar = bVarG instanceof sg.bigo.ads.ad.b.a.d ? new e(this.L, this) : bVarG instanceof sg.bigo.ads.ad.b.a.e ? new f(this.L, this) : null;
        if (eVar == null) {
            return null;
        }
        return new Pair<>(bVarG, eVar);
    }

    protected void ap() {
    }

    protected void aq() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final w b() {
        w wVar = new w();
        wVar.f101802b = 0;
        return wVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final View c() {
        sg.bigo.ads.ad.b.b bVar;
        Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> pairB;
        T t10 = this.f101384y;
        if (t10 == 0 || (bVar = this.W) == null || (pairB = ((s) t10).b(bVar)) == null) {
            return null;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar2 = (sg.bigo.ads.ad.interstitial.a.b) pairB.first;
        if (bVar2.f100654a && bVar2.b() && !bVar2.f100655b) {
            bVar2.a(1);
            bVar2.a(new a(this, this.W, 13));
            return bVar2.f100659f.f100599i;
        }
        if (!bVar2.b()) {
            bVar2.f100659f.f();
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = (sg.bigo.ads.ad.interstitial.a.a) pairB.second;
        if (aVar.f100586a && aVar.b()) {
            aVar.a(1);
            aVar.a(new a(this, this.W, 15));
            aVar.a(new b(this.W));
            return aVar.a();
        }
        if (aVar.b()) {
            return null;
        }
        aVar.f();
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void c_() {
        this.Y = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final boolean d_() {
        return this.Y;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z10) {
        return a(z10, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void g() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.ad.interstitial.a aVar = this.G;
        if (aVar instanceof f) {
            ((f) aVar).g();
        } else if (aVar instanceof e) {
            ((e) aVar).g();
        } else {
            super.g();
        }
        sg.bigo.ads.ad.interstitial.c.a aVar2 = this.O;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void i() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.b();
        }
        sg.bigo.ads.ad.interstitial.a aVar = this.G;
        if (aVar instanceof f) {
            ((f) aVar).i();
        } else if (aVar instanceof e) {
            ((e) aVar).i();
        } else {
            super.i();
        }
        sg.bigo.ads.ad.interstitial.c.a aVar2 = this.O;
        if (aVar2 != null) {
            aVar2.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void q() {
        String str;
        sg.bigo.ads.ad.b.b bVar = this.W;
        if (bVar != null) {
            this.X = ((sg.bigo.ads.core.a.a) bVar.f()).e();
        }
        m mVar = this.X;
        if (mVar == null || this.A == null) {
            super.q();
            return;
        }
        if (this.R) {
            str = "multi_ads_endpage.close_button_style";
        } else {
            int i10 = this.U;
            str = (i10 == 11 || i10 == 12) ? "endpage.close_button_style" : "video_play_page.close_button_style";
        }
        r.a(mVar.a(str, 1), this.A);
    }

    private void i(boolean z10) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || this.K) {
            return;
        }
        adCountDownButton.f100521e = z10;
        if (!z10) {
            adCountDownButton.g();
            return;
        }
        adCountDownButton.f100524h.setVisibility(0);
        adCountDownButton.f100523g.setVisibility(0);
        adCountDownButton.f();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void a(int i10) {
        sg.bigo.ads.ad.b.b bVar;
        this.U = i10;
        if (i10 == 11) {
            this.Z.onReceiveValue(Double.valueOf(1.0d));
        }
        sg.bigo.ads.ad.b.a.a.b bVar2 = this.H;
        int iIncrementAndGet = bVar2.T.incrementAndGet();
        Iterator<sg.bigo.ads.ad.b.b> it = bVar2.L.keySet().iterator();
        while (it.hasNext()) {
            ((sg.bigo.ads.core.a.a) it.next().f()).o(iIncrementAndGet);
        }
        if (i10 == 12 || i10 == 13) {
            c cVar = this.P;
            if (cVar != null) {
                cVar.setVisibility(8);
            }
            TextView textView = this.Q;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            c cVar2 = this.P;
            if (cVar2 != null && (bVar = this.H.I) != null) {
                this.T++;
                String strR = ((sg.bigo.ads.core.a.a) bVar.f()).r();
                int i11 = this.T;
                if (cVar2.f101320a.containsKey(strR)) {
                    if (cVar2.f101323d == null) {
                        cVar2.f101323d = strR;
                        cVar2.f101322c.remove(strR);
                        cVar2.f101322c.add(0, strR);
                    }
                    for (String str : cVar2.f101322c) {
                        Integer num = cVar2.f101320a.get(str);
                        int iMin = Math.min(i11, num == null ? 0 : num.intValue());
                        cVar2.f101321b.put(str, Integer.valueOf(iMin));
                        i11 -= iMin;
                    }
                    cVar2.invalidate();
                }
            } else if (this.Q != null) {
                this.Q.setText(String.format(Locale.US, "Ad %d of %d", Integer.valueOf(this.I), Integer.valueOf(this.H.S)));
            }
        }
        q();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f100519c) {
            return;
        }
        i(false);
        if (this.I <= 1 || i10 != 0) {
            return;
        }
        this.A.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void a(int i10, int i11) {
        sg.bigo.ads.ad.interstitial.a aVar;
        AdCountDownButton adCountDownButton;
        AdCountDownButton adCountDownButton2;
        if (this.R) {
            return;
        }
        i(true);
        if (this.J == 2 && i11 == 2 && 1 == this.I && (adCountDownButton2 = this.A) != null && !adCountDownButton2.f100519c && (i10 == 11 || (!ax() && (!this.G.L() || this.G.M())))) {
            this.A.b();
        }
        if (this.J == 2 && i11 == 1 && (aVar = this.G) != null && ((!aVar.L() || this.G.M()) && ax() && (adCountDownButton = this.A) != null && !adCountDownButton.f100519c)) {
            ((sg.bigo.ads.ad.b.a.a.d) this.H.I).P = false;
            if (1 == this.I) {
                adCountDownButton.b();
            }
        }
        if (this.J == 1) {
            if (i10 == 11) {
                a(true, true);
                return;
            }
            if (i10 == 0) {
                sg.bigo.ads.ad.interstitial.a aVar2 = this.G;
                if (aVar2 == null || !aVar2.L() || this.G.M()) {
                    if (ax() && i11 == 1) {
                        a(true, true);
                    } else {
                        if (ax() || i11 != 2) {
                            return;
                        }
                        a(true, true);
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void a(boolean z10, int i10, int i11, int i12, i iVar, sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.ad.interstitial.q qVar) {
    }

    protected boolean a(boolean z10, boolean z11) {
        if (this.R) {
            return true;
        }
        if (this.K && (!z11 || this.I == this.H.S)) {
            return !au();
        }
        b.InterfaceC1241b interfaceC1241b = this.G;
        if (!(interfaceC1241b instanceof sg.bigo.ads.ad.interstitial.g.b) || ((sg.bigo.ads.ad.interstitial.g.b) interfaceC1241b).a()) {
            return this.I == this.H.S ? !au() : (ar() || au()) ? false : true;
        }
        return false;
    }
}
