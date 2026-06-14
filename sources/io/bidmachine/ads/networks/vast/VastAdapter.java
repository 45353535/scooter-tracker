package io.bidmachine.ads.networks.vast;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import b9.r;
import c9.e;
import c9.n;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import m9.c;
import od.d;
import od.h;

/* JADX INFO: loaded from: classes12.dex */
public class VastAdapter extends HeaderBiddingAdapter {

    @NonNull
    public static final String ADAPTER_SDK_VERSION_NAME = "3.5.0";

    @NonNull
    public static final String ADAPTER_VERSION_NAME = "3.5.0.1";

    @NonNull
    public static final String KEY = "vast";

    public VastAdapter() {
        super("vast", "3.5.0", "3.5.0.1", 1, new AdsType[]{AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new VastFullScreenAd(n.NonRewarded);
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new VastFullScreenAd(n.Rewarded);
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
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        headerBiddingCollectParamsCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        c.f(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        e.d(z10 ? r.a.debug : r.a.none);
    }
}
