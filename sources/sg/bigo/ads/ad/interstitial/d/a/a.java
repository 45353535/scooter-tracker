package sg.bigo.ads.ad.interstitial.d.a;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends sg.bigo.ads.ad.interstitial.d.b {
    public a(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    public final void A() {
        m mVar;
        int iA;
        if (!v() || ((sg.bigo.ads.ad.interstitial.d.b) this).f100951y == null || (mVar = this.f100919t) == null || (iA = mVar.a("video_play_page.guide_click_timing", 0)) < 0) {
            return;
        }
        ((sg.bigo.ads.ad.interstitial.d.b) this).f100951y.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.B();
            }
        }, ((long) iA) * 1000);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final boolean v() {
        m mVar = this.f100919t;
        if (mVar != null) {
            return mVar.c("video_play_page.guide_click");
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final int y() {
        m mVar = this.f100919t;
        if (mVar != null) {
            return mVar.a("video_play_page.ad_component_show_time", 0);
        }
        return 0;
    }
}
