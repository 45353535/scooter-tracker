package io.bidmachine;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes12.dex */
public abstract class HeaderBiddingAdapter extends NetworkAdapter {
    protected HeaderBiddingAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }

    @WorkerThread
    public final void collectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        int adapterMinDeviceApiVersion = getAdapterMinDeviceApiVersion();
        if (Build.VERSION.SDK_INT < adapterMinDeviceApiVersion) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.a("minSdkVersion is " + adapterMinDeviceApiVersion));
            return;
        }
        if (isInitialized(contextProvider)) {
            onCollectHeaderBiddingParams(contextProvider, dVar, networkAdUnit, headerBiddingAdRequestParams, headerBiddingCollectParamsCallback);
        } else {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.d());
        }
    }

    @WorkerThread
    protected abstract void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable;
}
