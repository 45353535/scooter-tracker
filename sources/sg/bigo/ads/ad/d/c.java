package sg.bigo.ads.ad.d;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.api.popup.PopupAd;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends o implements PopupAd {
    public c(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final int A() {
        return this.f100335b.f102175b.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return b.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.o
    public final n E() {
        return n.POPUP;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(Context context) {
        if (sg.bigo.ads.controller.landing.e.a(context, (Class<? extends sg.bigo.ads.controller.e.b<?>>) b.class, this)) {
            return;
        }
        a(2004, "This ad cannot be open");
    }
}
