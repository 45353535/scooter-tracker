package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class B extends AbstractC4437a<RewardedVideoAdListener> implements RewardedVideoSmashListener {
    public B(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.REWARDED_VIDEO, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f43755a.loadRewardedVideoForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f43755a.loadRewardedVideo(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected boolean b(JSONObject jSONObject) {
        return this.f43755a.isRewardedVideoAvailable(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void e(JSONObject jSONObject) {
        this.f43755a.showRewardedVideo(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClicked(Map map) {
        r4.c.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClosed(Map map) {
        r4.c.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdEnded(Map map) {
        r4.c.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdRewarded(Map map) {
        r4.c.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map map) {
        r4.c.f(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdStarted(Map map) {
        r4.c.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(Map map) {
        r4.c.h(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
        onRewardedVideoAvailabilityChanged(z10, Collections.EMPTY_MAP);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.c.l(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdLoadSuccess();
        }
    }

    protected boolean b(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1058;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdEnded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdRewarded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdVisible();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10, Map<String, Object> map) {
        IronLog.INTERNAL.verbose(a("available = " + z10));
        if (this.f43756b.get() != null) {
            if (z10) {
                ((RewardedVideoAdListener) this.f43756b.get()).onAdLoadSuccess(map);
            } else {
                ((RewardedVideoAdListener) this.f43756b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, "");
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map map) {
        r4.c.j(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitSuccess(Map map) {
        r4.c.k(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdLoadFailed(b(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected IronSource.a b() {
        return IronSource.a.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((RewardedVideoAdListener) this.f43756b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        this.f43755a.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject) {
        this.f43755a.destroyRewardedVideoAd(jSONObject);
    }

    private boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1057;
    }
}
