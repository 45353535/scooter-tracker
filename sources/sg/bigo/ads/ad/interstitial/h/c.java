package sg.bigo.ads.ad.interstitial.h;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public class c extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected View f101372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected TextView f101373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected View f101374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected RoundedImageView f101375v;

    protected c(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, @NonNull p pVar) {
        super(bVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected void a(int i10, boolean z10, boolean z11) {
        super.a(i10, z10, z11);
        sg.bigo.ads.ad.b.a.a(this.f101375v, 5);
        RoundedImageView roundedImageView = this.f101375v;
        if (roundedImageView != null) {
            if (z10) {
                sg.bigo.ads.ad.b.a.a(this.f101348j, roundedImageView, 10, this.f101780f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(this.f101348j, roundedImageView, 10, q.F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected void d(@NonNull final q qVar) {
        ViewGroup viewGroup = this.f101349k;
        if (viewGroup == null) {
            return;
        }
        this.f101372s = viewGroup.findViewById(R.id.inter_click_guide_container);
        this.f101374u = this.f101349k.findViewById(R.id.inter_click_guide_image_layout);
        this.f101375v = (RoundedImageView) this.f101349k.findViewById(R.id.inter_click_guide_image_background);
        this.f101375v.setCornerRadius(e.a(this.f101349k.getContext(), 8));
        this.f101375v.setBackgroundColor(654311423);
        u.a(this.f101374u, new u.a() { // from class: sg.bigo.ads.ad.interstitial.h.c.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(@NonNull Rect rect) {
                c.this.a(qVar, rect);
            }
        });
        l().a(this.f101373t, null);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected final void e(@NonNull q qVar) {
        super.e(qVar);
        RoundedImageView roundedImageView = this.f101351m;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(e.a(roundedImageView.getContext(), 8));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected void f(@NonNull q qVar) {
        super.f(qVar);
        l().a(this.f101352n);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected int h() {
        return R.layout.bigo_ad_view_click_guide_2;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected final void k() {
        super.k();
        l().a(this.f101350l);
    }

    @NonNull
    protected sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f100665d;
    }

    protected void a(@NonNull q qVar, @NonNull Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f101352n.getLayoutParams();
        layoutParams.addRule(12, 0);
        layoutParams.addRule(3, this.f101374u.getId());
        this.f101352n.requestLayout();
        p pVarB = b(qVar);
        int iA = e.a(this.f101374u.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i10 = iA * 2;
        int i11 = iWidth - i10;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f101374u.getLayoutParams();
        layoutParams2.addRule(2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f101351m.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f101375v.getLayoutParams();
        p pVarA = p.a(pVarB.f102604b, pVarB.f102605c, iWidth, iHeight - i10);
        p pVarA2 = p.a(pVarB.f102604b, pVarB.f102605c, i11, iHeight);
        if (pVarA.a(pVarA2)) {
            layoutParams2.width = pVarA.f102604b;
            layoutParams2.height = pVarA.f102605c + i10;
            marginLayoutParams.topMargin = iA;
            marginLayoutParams.bottomMargin = iA;
            marginLayoutParams2.leftMargin = iA;
            marginLayoutParams2.rightMargin = iA;
        } else {
            layoutParams2.width = pVarA2.f102604b + i10;
            layoutParams2.height = pVarA2.f102605c;
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams2.topMargin = iA;
            marginLayoutParams2.bottomMargin = iA;
        }
        this.f101351m.requestLayout();
        this.f101375v.requestLayout();
        this.f101374u.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        sg.bigo.ads.core.a.a aVar;
        sg.bigo.ads.ad.b.b bVar = this.f101780f;
        if (bVar == null || (aVar = (sg.bigo.ads.core.a.a) bVar.f()) == null) {
            return true;
        }
        return aVar.aR();
    }
}
