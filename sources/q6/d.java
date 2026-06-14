package q6;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes11.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.unity3d.scar.adapter.common.g f98731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f98732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdListener f98733d = new a();

    class a extends AdListener {
        a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f98731b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f98731b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f98732c.d();
            d.this.f98731b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f98731b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f98731b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f98731b.onAdOpened();
        }
    }

    public d(com.unity3d.scar.adapter.common.g gVar, c cVar) {
        this.f98731b = gVar;
        this.f98732c = cVar;
    }

    public AdListener d() {
        return this.f98733d;
    }
}
