package q6;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes11.dex */
public class f extends q6.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f98735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.unity3d.scar.adapter.common.h f98736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterstitialAdLoadCallback f98737d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FullScreenContentCallback f98738e = new b();

    class a extends InterstitialAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f98736c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            f.this.f98736c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(f.this.f98738e);
            f.this.f98735b.c(interstitialAd);
            m6.b bVar = f.this.f98726a;
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
            f.this.f98736c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f98736c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f98736c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f98736c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f98736c.onAdOpened();
        }
    }

    public f(com.unity3d.scar.adapter.common.h hVar, e eVar) {
        this.f98736c = hVar;
        this.f98735b = eVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f98737d;
    }
}
