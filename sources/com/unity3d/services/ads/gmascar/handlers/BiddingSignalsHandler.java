package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import n6.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class BiddingSignalsHandler implements b {
    private final boolean isBannerEnabled;
    private final IBiddingSignalsListener listener;

    public BiddingSignalsHandler(boolean z10, IBiddingSignalsListener iBiddingSignalsListener) {
        this.listener = iBiddingSignalsListener;
        this.isBannerEnabled = z10;
    }

    private String getSignalFromJson(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    private BiddingSignals getSignals(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return this.isBannerEnabled ? new BiddingSignals(getSignalFromJson(jSONObject, "gmaScarBiddingRewardedSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingInterstitialSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingBannerSignal")) : new BiddingSignals(getSignalFromJson(jSONObject, "gmaScarBiddingRewardedSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingInterstitialSignal"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // n6.b
    public void onSignalsCollected(String str) {
        this.listener.onSignalsReady(getSignals(str));
    }

    @Override // n6.b
    public void onSignalsCollectionFailed(String str) {
        this.listener.onSignalsFailure(str);
    }
}
