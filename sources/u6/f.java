package u6;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes11.dex */
public class f extends u6.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f105253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.unity3d.scar.adapter.common.h f105254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterstitialAdLoadCallback f105255d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FullScreenContentCallback f105256e = new b();

    class a extends InterstitialAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f105254c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            f.this.f105254c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(f.this.f105256e);
            f.this.f105253b.c(interstitialAd);
            m6.b bVar = f.this.f105244a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    class b extends FullScreenContentCallback {
        b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.f105254c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f105254c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f105254c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f105254c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f105254c.onAdOpened();
        }
    }

    public f(com.unity3d.scar.adapter.common.h hVar, e eVar) {
        this.f105254c = hVar;
        this.f105253b = eVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f105255d;
    }
}
