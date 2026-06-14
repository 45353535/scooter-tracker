package sg.bigo.ads.ad.interstitial.c;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.d.f;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* JADX INFO: loaded from: classes4.dex */
public class z extends x {
    public z(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar) {
        super(bVar, mVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.x, sg.bigo.ads.ad.d.f
    public final void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        if (this.f100470o == null) {
            this.f100470o = new sg.bigo.ads.ad.d.d();
        }
        this.f100470o.a();
        this.f100470o.a(viewGroup, m(), aVar);
    }
}
