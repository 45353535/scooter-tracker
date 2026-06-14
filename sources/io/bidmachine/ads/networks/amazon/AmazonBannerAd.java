package io.bidmachine.ads.networks.amazon;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdView;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.h;
import od.e;
import od.f;
import od.g;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class AmazonBannerAd extends e {

    @Nullable
    private DTBAdView dtbAdView;

    @Nullable
    private Listener listener;

    /* JADX INFO: Access modifiers changed from: private */
    static final class Listener extends AmazonBaseAdListener<f> implements DTBAdBannerListener {
        Listener(@NonNull f fVar) {
            super(fVar);
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdClosed(View view) {
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdLoaded(View view) {
            getCallback().onAdLoaded(view);
        }
    }

    AmazonBannerAd() {
    }

    public static /* synthetic */ void a(AmazonBannerAd amazonBannerAd, f fVar, ContextProvider contextProvider, AmazonParams amazonParams) {
        amazonBannerAd.getClass();
        try {
            amazonBannerAd.listener = new Listener(fVar);
            DTBAdView dTBAdView = new DTBAdView(contextProvider.getApplicationContext(), amazonBannerAd.listener);
            amazonBannerAd.dtbAdView = dTBAdView;
            dTBAdView.fetchAd(amazonParams.bidInfo);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            fVar.onAdLoadFailed(ae.a.l("Exception loading Amazon banner object", th2));
        }
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        this.dtbAdView = null;
    }

    @Override // od.b
    public void load(@NonNull final ContextProvider contextProvider, @NonNull final f fVar, @NonNull g gVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        final AmazonParams amazonParams = new AmazonParams(kVar);
        if (amazonParams.isValid(fVar)) {
            fVar.setVisibilitySource(io.bidmachine.core.k.BidMachine);
            h.U(new Runnable() { // from class: io.bidmachine.ads.networks.amazon.a
                @Override // java.lang.Runnable
                public final void run() {
                    AmazonBannerAd.a(this.f79207b, fVar, contextProvider, amazonParams);
                }
            });
        }
    }
}
