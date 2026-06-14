package sg.bigo.ads.ad.interstitial.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends ab {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ViewGroup f100879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final sg.bigo.ads.ad.b.a.a.b f100880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f100881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f100882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f100883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f100884y;

    public w(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, mVar, cVar);
        this.f100883x = 0;
        this.f100884y = 1;
        this.f100880u = (sg.bigo.ads.ad.b.a.a.b) bVar;
        this.f100735o = mVar.a("multi_ads_endpage.ad_component_layout");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    protected final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        a((Button) this.f100879t.findViewById(R.id.inter_btn_cta), qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void d(sg.bigo.ads.ad.interstitial.q r4) {
        /*
            r3 = this;
            super.d(r4)
            int r0 = r3.f100735o
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L41
            r1 = 3
            if (r0 == r1) goto L25
            r1 = 4
            if (r0 == r1) goto L41
            r1 = 5
            if (r0 == r1) goto L25
            android.view.ViewGroup r4 = r3.f100729k
            int r0 = sg.bigo.ads.R.id.bigo_ad_end_stub_2_half_wrap
        L16:
            android.view.View r4 = r4.findViewById(r0)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.f100879t = r4
            goto L46
        L25:
            android.view.ViewGroup r0 = r3.f100729k
            int r1 = sg.bigo.ads.R.id.bigo_ad_end_stub_2_img_wrap
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f100879t = r0
            sg.bigo.ads.ad.b.a.a.b r1 = r3.f100880u
            sg.bigo.ads.ad.b.b r1 = r1.f(r2)
            r3.a(r4, r0, r1)
            goto L46
        L41:
            android.view.ViewGroup r4 = r3.f100729k
            int r0 = sg.bigo.ads.R.id.bigo_ad_end_stub_2_all_wrap
            goto L16
        L46:
            int r4 = r3.f100735o
            if (r2 != r4) goto L62
            android.view.ViewGroup r4 = r3.f100879t
            if (r4 == 0) goto L62
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.view.ViewGroup r0 = r3.f100729k
            android.content.Context r0 = r0.getContext()
            r1 = 58
            int r0 = sg.bigo.ads.common.utils.e.a(r0, r1)
            r4.topMargin = r0
        L62:
            android.view.ViewGroup r4 = r3.f100879t
            int r0 = sg.bigo.ads.R.id.bigo_ad_inter_layout_end_page
            android.view.View r4 = r4.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            sg.bigo.ads.ad.interstitial.c.ab.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.w.d(sg.bigo.ads.ad.interstitial.q):void");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_mix_end;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final boolean k() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    protected final int l() {
        return 13;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    protected final sg.bigo.ads.ad.b.b m() {
        sg.bigo.ads.ad.b.a.a.b bVar = this.f100880u;
        if (bVar != null) {
            return bVar.f(0);
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    protected final ViewGroup n() {
        return this.f100879t;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    protected final void o() {
        ViewGroup viewGroup;
        sg.bigo.ads.core.adview.h hVarF;
        super.o();
        if (this.f100881v) {
            return;
        }
        ViewGroup viewGroup2 = this.f100879t;
        View viewFindViewWithTag = viewGroup2 != null ? viewGroup2.findViewWithTag(9) : null;
        if (this.f100737q && viewFindViewWithTag != null) {
            this.f100881v = true;
            viewGroup = this.f100728j;
            hVarF = this.f100880u.f(1);
        } else {
            if (viewFindViewWithTag == null) {
                return;
            }
            this.f100881v = true;
            viewGroup = this.f100728j;
            hVarF = sg.bigo.ads.ad.interstitial.q.F;
        }
        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewWithTag, 13, hVarF, this.f100738r);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    protected final void a(boolean z10) {
        super.a(z10);
        if (this.f100882w) {
            return;
        }
        this.f100882w = true;
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100879t, 13, this.f100880u.f(1), this.f100738r);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100879t, 13, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.u
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        sg.bigo.ads.ad.b.b bVarF = this.f100880u.f(0);
        if (bVarF != null) {
            super.a(bVarF, qVar, viewGroup, this.f100736p, aVar, i10, 13, i12, viewArr);
        } else {
            this.f100736p.setVisibility(8);
        }
        sg.bigo.ads.ad.b.b bVarF2 = this.f100880u.f(1);
        if (bVarF2 != null) {
            super.a(bVarF2, qVar, viewGroup, this.f100879t, aVar, i10, 13, i12, viewArr);
        } else {
            this.f100879t.setVisibility(8);
        }
        return true;
    }
}
