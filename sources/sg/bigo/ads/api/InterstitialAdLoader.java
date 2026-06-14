package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.j;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes4.dex */
public class InterstitialAdLoader extends AbstractAdLoader<InterstitialAd, InterstitialAdRequest> {

    public static class Builder implements AdLoader.Builder<InterstitialAd, Builder, InterstitialAdLoader> {
        private AdLoadListener<InterstitialAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(@Nullable AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<InterstitialAd>) adLoadListener);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public InterstitialAdLoader build() {
            return new InterstitialAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<InterstitialAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public InterstitialAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ Ad a(f fVar) {
        if (fVar.f102174a.x() != 3 && fVar.f102174a.x() != 20) {
            return (InterstitialAd) super.a(fVar);
        }
        int iW = fVar.f102174a.w();
        if (iW == 1 || iW == 2) {
            if (j.f101399a == null) {
                j.f101399a = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.INAdCreator", k.a.class);
            }
            k.a<?> aVar = j.f101399a;
            if (aVar == null) {
                return null;
            }
            return aVar.getAdInstance(fVar);
        }
        if (iW != 3) {
            return null;
        }
        if (j.f101400b == null) {
            j.f101400b = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.IBAdCreator", k.a.class);
        }
        k.a<?> aVar2 = j.f101400b;
        if (aVar2 == null) {
            return null;
        }
        return aVar2.getAdInstance(fVar);
    }
}
