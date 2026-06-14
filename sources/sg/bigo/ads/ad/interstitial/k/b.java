package sg.bigo.ads.ad.interstitial.k;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.d.w;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f101416c;

    protected b(@NonNull Activity activity) {
        super(activity);
    }

    private w b() {
        if (this.f101416c == null) {
            this.f101416c = sg.bigo.ads.ad.interstitial.d.a.a(this.C, ((a) this).f101412b, 0);
        }
        return this.f101416c;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean U() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a, sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        return R.layout.bigo_ad_activity_popup_vpaid;
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g(int i10) {
        super.g(i10);
        b().a(p(R.id.inter_container), p(R.id.media_layout));
        b().g(this.D);
    }
}
