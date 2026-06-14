package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.banner.e;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes4.dex */
public class NativeBannerAdLoader extends AbstractAdLoader<Ad, NativeBannerAdRequest> {

    public static class Builder implements AdLoader.Builder<Ad, Builder, NativeBannerAdLoader> {
        private AdLoadListener<BannerAd> mBannerAdLoader;
        private String mExt;
        private AdLoadListener<NativeAd> mNativeAdLoader;

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public AdLoadListener<Ad> createMixAdLoadListener() {
            return new AdLoadListener<Ad>() { // from class: sg.bigo.ads.api.NativeBannerAdLoader.Builder.1
                @Override // sg.bigo.ads.api.AdLoadListener
                public final void onAdLoaded(@NonNull Ad ad2) {
                    AdLoadListener adLoadListener;
                    Ad ad3;
                    if ((ad2 instanceof NativeAd) && Builder.this.mNativeAdLoader != null) {
                        adLoadListener = Builder.this.mNativeAdLoader;
                        ad3 = (NativeAd) ad2;
                    } else {
                        if (!(ad2 instanceof BannerAd) || Builder.this.mBannerAdLoader == null) {
                            return;
                        }
                        adLoadListener = Builder.this.mBannerAdLoader;
                        ad3 = (BannerAd) ad2;
                    }
                    adLoadListener.onAdLoaded(ad3);
                }

                @Override // sg.bigo.ads.api.AdLoadListener
                public final void onError(@NonNull AdError adError) {
                    AdLoadListener adLoadListener;
                    if (Builder.this.mNativeAdLoader != null) {
                        adLoadListener = Builder.this.mNativeAdLoader;
                    } else if (Builder.this.mBannerAdLoader == null) {
                        return;
                    } else {
                        adLoadListener = Builder.this.mBannerAdLoader;
                    }
                    adLoadListener.onError(adError);
                }
            };
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        @Deprecated
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(@Nullable AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<Ad>) adLoadListener);
        }

        public Builder withBannerAdLoadListener(@Nullable AdLoadListener<BannerAd> adLoadListener) {
            this.mBannerAdLoader = adLoadListener;
            return this;
        }

        public Builder withNativeAdLoadListener(@Nullable AdLoadListener<NativeAd> adLoadListener) {
            this.mNativeAdLoader = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public NativeBannerAdLoader build() {
            return new NativeBannerAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        @Deprecated
        public Builder withAdLoadListener(@Nullable AdLoadListener<Ad> adLoadListener) {
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public NativeBannerAdLoader(Builder builder) {
        super(builder.createMixAdLoadListener(), builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final Ad a(f fVar) {
        int iX = fVar.f102174a.x();
        return (iX == 2 || fVar.f102174a.w() == 3) ? new e(fVar) : iX == 1 ? sg.bigo.ads.ad.b.a.a(fVar) : super.a(fVar);
    }
}
