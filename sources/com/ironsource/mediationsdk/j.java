package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.J2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class j extends AbstractC4437a<BannerAdListener> implements BannerSmashListener {
    public j(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.BANNER, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        q qVar = (q) adData.getAdUnitData().get(J2.f41153t);
        if (qVar == null) {
            IronLog.INTERNAL.error(a("Banner layout is null, cannot load banner ad"));
            if (this.f43756b.get() != null) {
                ((BannerAdListener) this.f43756b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 615, "Banner layout is null");
                return;
            }
            return;
        }
        if (num == null || num.intValue() != 1) {
            this.f43755a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), qVar.getSize(), this);
        } else {
            this.f43755a.loadBanner(jSONObject, jSONObject2, qVar.getSize(), this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected IronSource.a b() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    public void c(@NotNull JSONObject jSONObject) {
        this.f43755a.onBannerViewBound(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    public void d(@NotNull JSONObject jSONObject) {
        this.f43755a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(Map map) {
        r4.a.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(Map map) {
        r4.a.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.a.c(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        onBannerAdLoaded(view, layoutParams, new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(Map map) {
        r4.a.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(Map map) {
        r4.a.f(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        onBannerAdShown(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((BannerAdListener) this.f43756b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((BannerAdListener) this.f43756b.get()).onAdLeftApplication();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f43756b.get() != null) {
            ((BannerAdListener) this.f43756b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((BannerAdListener) this.f43756b.get()).onAdLoadSuccess(view, layoutParams, map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((BannerAdListener) this.f43756b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((BannerAdListener) this.f43756b.get()).onAdScreenPresented();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f43756b.get() != null) {
            ((BannerAdListener) this.f43756b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(IronSourceError ironSourceError, Map map) {
        r4.a.h(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(Map map) {
        r4.a.i(this, map);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject) {
        this.f43755a.destroyBanner(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC4437a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        this.f43755a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    protected boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }
}
