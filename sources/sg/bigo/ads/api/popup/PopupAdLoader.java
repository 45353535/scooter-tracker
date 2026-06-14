package sg.bigo.ads.api.popup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.d.a;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes4.dex */
public class PopupAdLoader extends AbstractAdLoader<PopupAd, PopupAdRequest> {

    public static class Builder implements AdLoader.Builder<PopupAd, Builder, PopupAdLoader> {
        private AdLoadListener<PopupAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(@Nullable AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<PopupAd>) adLoadListener);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public PopupAdLoader build() {
            return new PopupAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<PopupAd> adLoadListener) {
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

    public PopupAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ Ad a(f fVar) {
        if (fVar.f102174a.x() != 20) {
            return (PopupAd) super.a(fVar);
        }
        if (fVar.f102174a.x() != 20) {
            return null;
        }
        int iW = fVar.f102174a.w();
        if (iW == 1 || iW == 2) {
            if (a.f100453a == null) {
                a.f100453a = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.INAdCreator", k.a.class);
            }
            k.a<?> aVar = a.f100453a;
            if (aVar != null) {
                Ad adInstance = aVar.getAdInstance(fVar);
                if (adInstance instanceof PopupAd) {
                    return (PopupAd) adInstance;
                }
            }
            return null;
        }
        if (iW != 3) {
            return null;
        }
        if (a.f100454b == null) {
            a.f100454b = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.IBAdCreator", k.a.class);
        }
        k.a<?> aVar2 = a.f100454b;
        if (aVar2 != null) {
            Ad adInstance2 = aVar2.getAdInstance(fVar);
            if (adInstance2 instanceof PopupAd) {
                return (PopupAd) adInstance2;
            }
        }
        return null;
    }
}
