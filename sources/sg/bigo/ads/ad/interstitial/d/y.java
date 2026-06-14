package sg.bigo.ads.ad.interstitial.d;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.b;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends w {
    public y(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar) {
        super(bVar, mVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.w
    public final sg.bigo.ads.common.utils.n e(final ViewGroup viewGroup) {
        final View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.inter_ad_info) : null;
        if (viewFindViewById == null) {
            return null;
        }
        sg.bigo.ads.api.a.m mVar = ((w) this).f101095k;
        return new sg.bigo.ads.common.utils.n(mVar != null ? ((long) mVar.a("video_play_page.ad_component_show_time")) * 1000 : 0L) { // from class: sg.bigo.ads.ad.interstitial.d.y.1
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                viewFindViewById.setVisibility(0);
                sg.bigo.ads.ad.interstitial.c.a(viewFindViewById, new b.d());
                y.this.f(viewGroup);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
    }
}
