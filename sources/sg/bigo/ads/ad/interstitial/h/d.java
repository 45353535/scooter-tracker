package sg.bigo.ads.ad.interstitial.h;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f101378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f101379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private IconListView f101380y;

    protected d(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, p pVar) {
        super(bVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.c, sg.bigo.ads.ad.interstitial.h.a
    protected final void a(int i10, boolean z10, boolean z11) {
        super.a(i10, z10, z11);
        m mVar = this.f101781g;
        boolean z12 = true;
        if (mVar != null && mVar.a("layer.ad_component_clickable_switch") != 1) {
            z12 = false;
        }
        View view = this.f101372s;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            ViewGroup viewGroup = this.f101348j;
            if (z12) {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f101372s, 8, this.f101780f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f101372s, 8, q.F, 0);
            }
        }
        IconListView iconListView = this.f101380y;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i11 = 0; items != null && i11 < items.size(); i11++) {
                IconListView.a aVar = items.get(i11);
                sg.bigo.ads.ad.b.a.a(aVar.f101499d, 26);
                sg.bigo.ads.ad.b.a.a(this.f101348j, aVar.f101499d, 8, this.f101780f, i10);
                sg.bigo.ads.ad.b.a.a(aVar.f101502g, 26);
                sg.bigo.ads.ad.b.a.a(this.f101348j, aVar.f101502g, 8, this.f101780f, i10);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.h.c, sg.bigo.ads.ad.interstitial.h.a
    protected final void d(@NonNull q qVar) {
        IconListView iconListView;
        int i10;
        super.d(qVar);
        ViewGroup viewGroup = this.f101349k;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        this.f101379x = textView;
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f100662a;
        bVar.a(null, textView);
        IconListView iconListView2 = (IconListView) this.f101349k.findViewById(R.id.inter_download_msg);
        this.f101380y = iconListView2;
        iconListView2.a(((a) this).f101347i);
        if (k.a((Collection) this.f101380y.getItems())) {
            iconListView = this.f101380y;
            i10 = 8;
        } else {
            iconListView = this.f101380y;
            i10 = 0;
        }
        iconListView.setVisibility(i10);
        int iA = e.a(this.f101349k.getContext(), 16);
        View view = this.f101372s;
        if (view != null) {
            float f10 = iA;
            view.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, (Rect) null, -1));
            bVar.b(this.f101372s);
        }
        a(qVar, this.f101375v);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.c, sg.bigo.ads.ad.interstitial.h.a
    protected final void f(@NonNull q qVar) {
        super.f(qVar);
        ViewGroup viewGroup = this.f101349k;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_company);
            this.f101378w = textView;
            if (textView != null) {
                textView.setTextColor(g(qVar));
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.h.c, sg.bigo.ads.ad.interstitial.h.a
    protected final int h() {
        return R.layout.bigo_ad_view_click_guide_3;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.c
    @NonNull
    protected final sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f100662a;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.c
    protected final void a(@NonNull q qVar, @NonNull Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f101380y.getLayoutParams();
        layoutParams.addRule(3, this.f101374u.getId());
        layoutParams.addRule(2, 0);
        this.f101380y.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f101352n.getLayoutParams();
        layoutParams2.addRule(12, 0);
        layoutParams2.addRule(3, (k.a((Collection) this.f101380y.getItems()) ? this.f101374u : this.f101380y).getId());
        this.f101352n.requestLayout();
        p pVarB = b(qVar);
        int iA = e.a(this.f101374u.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f101374u.getLayoutParams();
        layoutParams3.addRule(2, 0);
        int i10 = p.b(pVarB.f102604b, pVarB.f102605c, iWidth).f102605c;
        if (i10 <= iHeight) {
            layoutParams3.height = i10;
        } else {
            int i11 = iA * 2;
            layoutParams3.height = p.a(pVarB.f102604b, pVarB.f102605c, iWidth - i11, iHeight - i11).f102605c + i11;
            ((ViewGroup.MarginLayoutParams) this.f101351m.getLayoutParams()).setMargins(iA, iA, iA, iA);
            this.f101351m.requestLayout();
        }
        this.f101374u.requestLayout();
    }
}
