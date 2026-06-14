package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class p extends AbstractC4437a<InterstitialAdListener> implements InterstitialSmashListener {
    public p(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.INTERSTITIAL, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f43755a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f43755a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected boolean b(JSONObject jSONObject) {
        return this.f43755a.isInterstitialReady(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void e(JSONObject jSONObject) {
        this.f43755a.showInterstitial(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(Map map) {
        r4.b.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(Map map) {
        r4.b.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.b.c(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        onInterstitialAdOpened(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((InterstitialAdListener) this.f43756b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map map) {
        r4.b.f(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected IronSource.a b() {
        return IronSource.a.INTERSTITIAL;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((InterstitialAdListener) this.f43756b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((InterstitialAdListener) this.f43756b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f43756b.get() != null) {
            ((InterstitialAdListener) this.f43756b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((InterstitialAdListener) this.f43756b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f43756b.get() != null) {
            ((InterstitialAdListener) this.f43756b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdVisible(Map map) {
        r4.b.h(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(IronSourceError ironSourceError, Map map) {
        r4.b.i(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(Map map) {
        r4.b.j(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((InterstitialAdListener) this.f43756b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        this.f43755a.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject) {
        this.f43755a.destroyInterstitialAd(jSONObject);
    }

    protected boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }
}
