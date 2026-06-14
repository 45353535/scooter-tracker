package u6;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes11.dex */
public class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f105245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f105246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f105247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AdView f105248j;

    public c(Context context, RelativeLayout relativeLayout, t6.a aVar, m6.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.g gVar) {
        super(context, cVar, aVar, dVar);
        this.f105245g = relativeLayout;
        this.f105246h = i10;
        this.f105247i = i11;
        this.f105248j = new AdView(this.f105239b);
        this.f105242e = new d(gVar, this);
    }

    @Override // u6.a
    protected void b(AdRequest adRequest, m6.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f105245g;
        if (relativeLayout == null || (adView = this.f105248j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f105248j.setAdSize(new AdSize(this.f105246h, this.f105247i));
        this.f105248j.setAdUnitId(this.f105240c.b());
        this.f105248j.setAdListener(((d) this.f105242e).d());
        this.f105248j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f105245g;
        if (relativeLayout == null || (adView = this.f105248j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
