package u6;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.i;

/* JADX INFO: loaded from: classes11.dex */
public class h extends u6.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f105259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f105260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RewardedAdLoadCallback f105261d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final OnUserEarnedRewardListener f105262e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FullScreenContentCallback f105263f = new c();

    class a extends RewardedAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f105260c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            h.this.f105260c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f105263f);
            h.this.f105259b.c(rewardedAd);
            m6.b bVar = h.this.f105244a;
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
            h.this.f105260c.onUserEarnedReward();
        }
    }

    class c extends FullScreenContentCallback {
        c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f105260c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f105260c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f105260c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f105260c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f105260c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f105260c = iVar;
        this.f105259b = gVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f105261d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f105262e;
    }
}
