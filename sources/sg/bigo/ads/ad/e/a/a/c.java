package sg.bigo.ads.ad.e.a.a;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.b.a.a.d;
import sg.bigo.ads.ad.e.h;

/* JADX INFO: loaded from: classes4.dex */
public class c extends sg.bigo.ads.ad.interstitial.g.a.c {
    private boolean I;

    protected c(@NonNull Activity activity) {
        super(activity);
        this.I = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a.c
    public final void a(sg.bigo.ads.ad.b.b bVar) {
        if (bVar instanceof sg.bigo.ads.ad.b.a.a.c) {
            ((sg.bigo.ads.ad.b.a.a.c) bVar).I = true;
            a aVar = new a(this.L, ao(), this.I);
            ((sg.bigo.ads.ad.interstitial.g.a.c) this).G.I = bVar;
            aVar.C = bVar;
            aVar.T();
            return;
        }
        if (bVar instanceof d) {
            ((d) bVar).O = true;
            b bVar2 = new b(this.L, ao(), this.I);
            ((sg.bigo.ads.ad.interstitial.g.a.c) this).G.I = bVar;
            bVar2.C = bVar;
            bVar2.T();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a.c
    public final void aq() {
        if (this.I) {
            return;
        }
        T t10 = this.f101384y;
        if (t10 instanceof h) {
            this.I = true;
            ((h) t10).N();
        }
    }
}
