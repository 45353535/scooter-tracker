package io.bidmachine.ads.networks.nast;

import androidx.annotation.NonNull;
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
import od.d;
import od.l;

/* JADX INFO: loaded from: classes12.dex */
public class NastAdapter extends HeaderBiddingAdapter {

    @NonNull
    public static final String ADAPTER_SDK_VERSION_NAME = "1.0";

    @NonNull
    public static final String ADAPTER_VERSION_NAME = "3.5.0.1";

    @NonNull
    public static final String KEY = "nast";

    public NastAdapter() {
        super(KEY, ADAPTER_SDK_VERSION_NAME, "3.5.0.1", 1, new AdsType[]{AdsType.Native});
    }

    @Override // io.bidmachine.NetworkAdapter
    public l createNativeAd() {
        return new NastNative();
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
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        networkInitializationCallback.onSuccess();
    }
}
