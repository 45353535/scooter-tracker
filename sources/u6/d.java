package u6;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes11.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.unity3d.scar.adapter.common.g f105249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f105250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdListener f105251d = new a();

    class a extends AdListener {
        a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f105249b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f105249b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f105250c.d();
            d.this.f105249b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f105249b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f105249b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f105249b.onAdOpened();
        }
    }

    public d(com.unity3d.scar.adapter.common.g gVar, c cVar) {
        this.f105249b = gVar;
        this.f105250c = cVar;
    }

    public AdListener d() {
        return this.f105251d;
    }
}
