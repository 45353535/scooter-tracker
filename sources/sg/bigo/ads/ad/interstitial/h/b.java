package sg.bigo.ads.ad.interstitial.h;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected TextView f101370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected TextView f101371t;

    protected b(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, @NonNull p pVar) {
        super(bVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected final void d(@NonNull q qVar) {
        ViewGroup viewGroup = this.f101349k;
        if (viewGroup == null || qVar == null) {
            return;
        }
        this.f101370s = (TextView) viewGroup.findViewById(R.id.inter_title);
        this.f101371t = (TextView) this.f101349k.findViewById(R.id.inter_description);
        sg.bigo.ads.ad.interstitial.d.a(this.f101370s, -234881024);
        sg.bigo.ads.ad.interstitial.d.a(this.f101371t, -234881024);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final boolean g() {
        p pVar = ((a) this).f101346h;
        return pVar != null && pVar.f102605c > 960;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    protected final int h() {
        return R.layout.bigo_ad_view_click_guide_1;
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        return false;
    }
}
