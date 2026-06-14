package q6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.i;

/* JADX INFO: loaded from: classes11.dex */
public class g extends a implements m6.a {
    public g(Context context, p6.a aVar, m6.c cVar, com.unity3d.scar.adapter.common.d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f98724e = new h(iVar, this);
    }

    @Override // q6.a
    protected void b(AdRequest adRequest, m6.b bVar) {
        RewardedAd.load(this.f98721b, this.f98722c.b(), adRequest, ((h) this.f98724e).e());
    }

    @Override // m6.a
    public void show(Activity activity) {
        Object obj = this.f98720a;
        if (obj != null) {
            ((RewardedAd) obj).show(activity, ((h) this.f98724e).f());
        } else {
            this.f98725f.handleError(com.unity3d.scar.adapter.common.b.a(this.f98722c));
        }
    }
}
