package io.bidmachine.ads.networks.meta_audience;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import od.e;
import od.f;
import od.g;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MetaAudienceBanner extends e {

    @Nullable
    private AdView adView;

    @Nullable
    private Listener listener;

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceBanner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$banner$BannerSize;

        static {
            int[] iArr = new int[u8.e.values().length];
            $SwitchMap$io$bidmachine$banner$BannerSize = iArr;
            try {
                iArr[u8.e.Size_728x90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$banner$BannerSize[u8.e.Size_300x250.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class Listener extends BaseMetaAudienceListener<f> {
        Listener(@NonNull f fVar) {
            super(fVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            getCallback().onAdLoaded((View) ad2);
        }
    }

    MetaAudienceBanner() {
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
            this.adView = null;
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull f fVar, @NonNull g gVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(kVar);
        if (metaAudienceParams.isValid(fVar)) {
            int i10 = AnonymousClass1.$SwitchMap$io$bidmachine$banner$BannerSize[gVar.getAdRequestParameters().b().ordinal()];
            AdSize adSize = i10 != 1 ? i10 != 2 ? AdSize.BANNER_HEIGHT_50 : AdSize.RECTANGLE_HEIGHT_250 : AdSize.BANNER_HEIGHT_90;
            this.listener = new Listener(fVar);
            AdView adView = new AdView(contextProvider.getApplicationContext(), metaAudienceParams.placementId, adSize);
            this.adView = adView;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this.listener).withBid(metaAudienceParams.bidPayload).build());
        }
    }
}
