package io.bidmachine.ads.networks.pangle;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import od.e;
import od.f;
import od.g;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class PangleBannerAd extends e {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private LoadListener loadListener;

    @Nullable
    private PAGBannerAd pagBannerAd;

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.pangle.PangleBannerAd$1, reason: invalid class name */
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

    private static final class LoadListener extends PangleBaseLoadListener<f, PAGBannerAd> implements PAGBannerAdLoadListener {

        @NonNull
        private final PangleBannerAd pangleBannerAd;

        LoadListener(@NonNull PangleBannerAd pangleBannerAd, @NonNull f fVar) {
            super(fVar);
            this.pangleBannerAd = pangleBannerAd;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.bidmachine.ads.networks.pangle.PangleBaseLoadListener
        public void onAdLoadComplete(PAGBannerAd pAGBannerAd) {
            f callback = getCallback();
            View viewPrepareToShow = this.pangleBannerAd.prepareToShow(pAGBannerAd, callback);
            if (viewPrepareToShow == null) {
                callback.onAdLoadFailed(new ae.a(ae.a.f4247q, -1, "Pangle banner view is null"));
            } else {
                callback.onAdLoaded(viewPrepareToShow);
            }
        }
    }

    private static final class ShowListener extends PangleBaseShowAdListener<f> implements PAGBannerAdInteractionListener {
        ShowListener(@NonNull f fVar) {
            super(fVar);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
        }
    }

    PangleBannerAd() {
    }

    @Override // od.b
    public void onDestroy() {
        LoadListener loadListener = this.loadListener;
        if (loadListener != null) {
            loadListener.destroy();
            this.loadListener = null;
        }
        PAGBannerAd pAGBannerAd = this.pagBannerAd;
        if (pAGBannerAd != null) {
            pAGBannerAd.setAdInteractionListener(null);
            this.pagBannerAd.destroy();
            this.pagBannerAd = null;
        }
    }

    @Nullable
    View prepareToShow(@Nullable PAGBannerAd pAGBannerAd, @NonNull f fVar) {
        this.pagBannerAd = pAGBannerAd;
        if (pAGBannerAd == null) {
            return null;
        }
        pAGBannerAd.setAdInteractionListener(new ShowListener(fVar));
        return pAGBannerAd.getBannerView();
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull f fVar, @NonNull g gVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        PangleParams pangleParams = new PangleParams(kVar);
        if (pangleParams.isValid(fVar)) {
            int i10 = AnonymousClass1.$SwitchMap$io$bidmachine$banner$BannerSize[gVar.getAdRequestParameters().b().ordinal()];
            PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(i10 != 1 ? i10 != 2 ? PAGBannerSize.BANNER_W_320_H_50 : PAGBannerSize.BANNER_W_300_H_250 : PAGBannerSize.BANNER_W_728_H_90);
            pAGBannerRequest.setAdString(pangleParams.bidPayload);
            LoadListener loadListener = new LoadListener(this, fVar);
            this.loadListener = loadListener;
            PAGBannerAd.loadAd(pangleParams.slotId, pAGBannerRequest, loadListener);
        }
    }
}
