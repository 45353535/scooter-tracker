package io.bidmachine.ads.networks.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import b9.r;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.iab.mraid.i;
import io.bidmachine.iab.mraid.q;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class MraidAdapter extends HeaderBiddingAdapter {

    @NonNull
    public static final String ADAPTER_SDK_VERSION_NAME = "3.5.0";

    @NonNull
    public static final String ADAPTER_VERSION_NAME = "3.5.0.1";

    @NonNull
    private static final AtomicBoolean IS_JS_BRIDGE_ADDED = new AtomicBoolean(false);

    @NonNull
    public static final String KEY = "mraid";

    public MraidAdapter() {
        super("mraid", "3.5.0", "3.5.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.e createBanner() {
        return new MraidBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createInterstitial() {
        return new MraidFullScreenAd(q.Static);
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createRewarded() {
        return new MraidFullScreenAd(q.Rewarded);
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return false;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        headerBiddingCollectParamsCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        if (IS_JS_BRIDGE_ADDED.compareAndSet(false, true)) {
            z8.b.b(new z8.c());
        }
        m9.c.f(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        i.g(z10 ? r.a.debug : r.a.none);
    }
}
