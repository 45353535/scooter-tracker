package com.amazon.aps.bidder.adapter;

import android.content.Context;
import com.amazon.aps.bidder.listeners.ApsBidderSDKInitializationListener;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ApsBidderAdapter {
    ApsBidderAdapterParam apsBidderAdapterParam;

    public abstract void cleanUp();

    public abstract String getAdapterSDKVersion();

    public ApsBidderAdapterParam getApsBidderAdapterParam() {
        return this.apsBidderAdapterParam;
    }

    public abstract String getBidderSDKVersion();

    public abstract Map<String, Object> getSignal();

    public abstract void initialize(Context context, ApsBidderSDKInitializationListener apsBidderSDKInitializationListener);

    public void setApsBidderAdapterParam(ApsBidderAdapterParam apsBidderAdapterParam) {
        this.apsBidderAdapterParam = apsBidderAdapterParam;
    }
}
