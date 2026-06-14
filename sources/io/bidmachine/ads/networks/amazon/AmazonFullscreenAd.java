package io.bidmachine.ads.networks.amazon;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.appodeal.ads.modules.common.internal.LogConstants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class AmazonFullscreenAd extends h {

    @Nullable
    private DTBAdInterstitial dtbAdInterstitial;

    @Nullable
    private Listener listener;

    /* JADX INFO: Access modifiers changed from: private */
    static final class Listener extends AmazonBaseAdListener<i> implements DTBAdInterstitialListener {
        Listener(@NonNull i iVar) {
            super(iVar);
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdClosed(View view) {
            getCallback().onAdClosed();
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdLoaded(View view) {
            getCallback().onAdLoaded();
        }

        @Override // com.amazon.device.ads.DTBAdVideoListener
        public void onVideoCompleted(View view) {
            getCallback().onAdFinished();
        }
    }

    AmazonFullscreenAd() {
    }

    public static /* synthetic */ void a(AmazonFullscreenAd amazonFullscreenAd, ContextProvider contextProvider, i iVar, AmazonParams amazonParams) {
        amazonFullscreenAd.getClass();
        try {
            Activity activity = contextProvider.getActivity();
            if (activity == null) {
                iVar.onAdLoadFailed(ae.a.i(LogConstants.MSG_ACTIVITY_IS_NULL));
                return;
            }
            amazonFullscreenAd.listener = new Listener(iVar);
            DTBAdInterstitial dTBAdInterstitial = new DTBAdInterstitial(activity, amazonFullscreenAd.listener);
            amazonFullscreenAd.dtbAdInterstitial = dTBAdInterstitial;
            dTBAdInterstitial.fetchAd(amazonParams.bidInfo);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            iVar.onAdLoadFailed(ae.a.l("Exception loading Amazon fullscreen object", th2));
        }
    }

    @Override // od.b
    public void onDestroy() {
        this.listener = null;
        this.dtbAdInterstitial = null;
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        DTBAdInterstitial dTBAdInterstitial = this.dtbAdInterstitial;
        if (dTBAdInterstitial != null) {
            dTBAdInterstitial.show();
        } else {
            iVar.onAdShowFailed(ae.a.i("Amazon fullscreen object is null"));
        }
    }

    @Override // od.b
    public void load(@NonNull final ContextProvider contextProvider, @NonNull final i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        final AmazonParams amazonParams = new AmazonParams(kVar);
        if (amazonParams.isValid(iVar)) {
            io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.amazon.b
                @Override // java.lang.Runnable
                public final void run() {
                    AmazonFullscreenAd.a(this.f79211b, contextProvider, iVar, amazonParams);
                }
            });
        }
    }
}
