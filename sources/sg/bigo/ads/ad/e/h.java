package sg.bigo.ads.ad.e;

import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.m;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends s implements RewardVideoAd {
    private RewardAdInteractionListener F;

    public h(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final int A() {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f100335b.f102174a;
        m mVarAV = aVar.aV();
        long jAU = mVarAV != null ? mVarAV.f102209c : 0L;
        if (jAU == 0) {
            jAU = aVar.aU();
        }
        return (int) (jAU / 1000);
    }

    @Override // sg.bigo.ads.ad.interstitial.s, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return K() ? d.class : ((s) this).B instanceof sg.bigo.ads.api.b.e ? L() ? sg.bigo.ads.ad.e.a.a.class : sg.bigo.ads.ad.e.a.a.c.class : B() ? J() ? f.class : g.class : e.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.s
    public final boolean K() {
        return (H() instanceof sg.bigo.ads.ad.b.a.g) || (H() instanceof sg.bigo.ads.ad.b.a.f);
    }

    public final void N() {
        sg.bigo.ads.core.d.b.b(this.f100335b.f102174a, this);
        RewardAdInteractionListener rewardAdInteractionListener = this.F;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdRewarded();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.s, sg.bigo.ads.ad.interstitial.k
    public final void b(@NonNull d.a<InterstitialAd> aVar) {
        super.b(aVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.s, sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        this.F = null;
    }

    @Override // sg.bigo.ads.api.RewardVideoAd
    public final void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) rewardAdInteractionListener);
        this.F = rewardAdInteractionListener;
    }
}
