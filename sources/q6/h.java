package q6;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.i;

/* JADX INFO: loaded from: classes11.dex */
public class h extends q6.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f98741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f98742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RewardedAdLoadCallback f98743d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final OnUserEarnedRewardListener f98744e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FullScreenContentCallback f98745f = new c();

    class a extends RewardedAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f98742c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            h.this.f98742c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f98745f);
            h.this.f98741b.c(rewardedAd);
            m6.b bVar = h.this.f98726a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    class b implements OnUserEarnedRewardListener {
        b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            h.this.f98742c.onUserEarnedReward();
        }
    }

    class c extends FullScreenContentCallback {
        c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f98742c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f98742c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f98742c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f98742c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f98742c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f98742c = iVar;
        this.f98741b = gVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f98743d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f98744e;
    }
}
