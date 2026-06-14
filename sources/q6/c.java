package q6;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes11.dex */
public class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f98727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f98728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f98729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AdView f98730j;

    public c(Context context, RelativeLayout relativeLayout, p6.a aVar, m6.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.g gVar) {
        super(context, cVar, aVar, dVar);
        this.f98727g = relativeLayout;
        this.f98728h = i10;
        this.f98729i = i11;
        this.f98730j = new AdView(this.f98721b);
        this.f98724e = new d(gVar, this);
    }

    @Override // q6.a
    protected void b(AdRequest adRequest, m6.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f98727g;
        if (relativeLayout == null || (adView = this.f98730j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f98730j.setAdSize(new AdSize(this.f98728h, this.f98729i));
        this.f98730j.setAdUnitId(this.f98722c.b());
        this.f98730j.setAdListener(((d) this.f98724e).d());
        this.f98730j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f98727g;
        if (relativeLayout == null || (adView = this.f98730j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
