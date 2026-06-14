package net.pubnative.lite.sdk.vpaid;

import android.content.Context;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;
import net.pubnative.lite.sdk.vpaid.helpers.FileLoader;
import net.pubnative.lite.sdk.vpaid.utils.FileUtils;
import net.pubnative.lite.sdk.vpaid.utils.Utils;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseVideoAd extends BaseVideoAdInternal {
    private static final String LOG_TAG = "BaseVideoAd";

    BaseVideoAd(Context context, Ad ad2, boolean z10, boolean z11, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener) {
        super(context, ad2, z10, z11, impressionListener, adCloseButtonListener);
    }

    public static /* synthetic */ void l(BaseVideoAd baseVideoAd, IntegrationType integrationType) {
        baseVideoAd.getClass();
        String str = LOG_TAG;
        Logger.d(str, "Start loading ad");
        if (baseVideoAd.getAdState() == 201 || baseVideoAd.getAdState() == 202) {
            Logger.d(str, "Ad already loading or showing");
            return;
        }
        EventTracker.clear();
        baseVideoAd.setAdState(201);
        baseVideoAd.initAdLoadingStartTime();
        baseVideoAd.startFetcherTimer();
        FileUtils.deleteExpiredFiles(baseVideoAd.getContext());
        if (baseVideoAd.isReady()) {
            Logger.d(str, "Ad already loaded");
            baseVideoAd.onAdLoadSuccessInternal();
        } else if (Utils.isOnline(baseVideoAd.getContext())) {
            baseVideoAd.proceedLoad(integrationType);
        } else {
            baseVideoAd.onAdLoadFailInternal(new PlayerInfo("No connection"));
        }
    }

    public void clearCache() {
        FileUtils.clearCache(getContext());
    }

    public void destroy() {
        Logger.d(LOG_TAG, "Ad will be destroyed");
        setReady();
        stopExpirationTimer();
        stopFetcherTimer();
        setAdState(200);
        cancelFetcher();
        releaseAdController();
        getViewabilityAdSession().stopAdSession();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public abstract void dismiss();

    public boolean isLoading() {
        return getAdState() == 201;
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public boolean isReady() {
        return super.isReady();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public boolean isRewarded() {
        return super.isRewarded();
    }

    public boolean isShowing() {
        return getAdState() == 202;
    }

    public void load(final IntegrationType integrationType) {
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseVideoAd.l(this.f96056b, integrationType);
            }
        });
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public void setAdCloseButtonListener(CloseButtonListener closeButtonListener) {
        super.setAdCloseButtonListener(closeButtonListener);
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public void setAdListener(VideoAdListener videoAdListener) {
        super.setAdListener(videoAdListener);
    }

    public void setDebugMode(boolean z10) {
        Utils.setDebugMode(z10);
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public void setRewarded(boolean z10) {
        super.setRewarded(z10);
    }

    public void useMobileNetworkForCaching(boolean z10) {
        FileLoader.setUseMobileNetworkForCaching(z10);
    }
}
