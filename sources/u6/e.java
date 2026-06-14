package u6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes11.dex */
public class e extends a implements m6.a {
    public e(Context context, t6.a aVar, m6.c cVar, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.h hVar) {
        super(context, cVar, aVar, dVar);
        this.f105242e = new f(hVar, this);
    }

    @Override // u6.a
    protected void b(AdRequest adRequest, m6.b bVar) {
        InterstitialAd.load(this.f105239b, this.f105240c.b(), adRequest, ((f) this.f105242e).e());
    }

    @Override // m6.a
    public void show(Activity activity) {
        Object obj = this.f105238a;
        if (obj != null) {
            ((InterstitialAd) obj).show(activity);
        } else {
            this.f105243f.handleError(com.unity3d.scar.adapter.common.b.a(this.f105240c));
        }
    }
}
