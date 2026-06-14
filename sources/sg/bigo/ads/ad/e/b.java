package sg.bigo.ads.ad.e;

import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.b.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends o implements RewardVideoAd {
    private RewardAdInteractionListener E;

    public b(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return a.class;
    }

    final void G() {
        sg.bigo.ads.core.d.b.b(this.f100335b.f102174a, this);
        RewardAdInteractionListener rewardAdInteractionListener = this.E;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdRewarded();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k
    public final void b(@NonNull d.a<InterstitialAd> aVar) {
        super.b(aVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        this.E = null;
    }

    @Override // sg.bigo.ads.api.RewardVideoAd
    public final void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) rewardAdInteractionListener);
        this.E = rewardAdInteractionListener;
    }
}
