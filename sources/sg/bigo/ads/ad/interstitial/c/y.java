package sg.bigo.ads.ad.interstitial.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends x {
    public y(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar) {
        super(bVar, mVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.x, sg.bigo.ads.ad.d.f
    public final void d(ViewGroup viewGroup) {
        View viewFindViewById;
        super.d(viewGroup);
        if (!((x) this).f100885k || viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_btn_cta)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }
}
