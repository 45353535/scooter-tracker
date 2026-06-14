package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4365ia;
import com.ironsource.C4456nf;
import com.ironsource.InterfaceC4630y3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC4437a<Listener extends AdapterAdListener> extends BaseAdAdapter<w, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, InterfaceC4630y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f43755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected WeakReference<Listener> f43756b;

    public AbstractC4437a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        super(C4456nf.a(aVar), networkSettings, uuid);
        this.f43756b = new WeakReference<>(null);
        this.f43755a = abstractAdapter;
    }

    public static AbstractC4437a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return new B(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return new p(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.BANNER) {
            return new j(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return new v(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + aVar);
        return null;
    }

    protected abstract void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    protected abstract IronSource.a b();

    protected boolean b(JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    public void c(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.InterfaceC4630y3
    public void collectBiddingData(@NotNull AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        a(C4365ia.a(adData.getConfiguration()), C4365ia.a(adData.getAdUnitData()), biddingDataCallback);
    }

    public void d(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(@NotNull AdData adData) {
        a(C4365ia.a(adData.getConfiguration()));
    }

    protected void e(JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(@NotNull AdData adData) {
        return b(C4365ia.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(@NotNull AdData adData, @NotNull Context context, @NotNull Listener listener) {
        a(adData, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(@NotNull AdData adData) {
        c(C4365ia.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(@NotNull AdData adData) {
        d(C4365ia.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull Listener listener) {
        this.f43756b = new WeakReference<>(listener);
        e(C4365ia.a(adData.getConfiguration()));
    }

    private void b(String str) {
        IronLog.INTERNAL.error(a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull ISBannerSize iSBannerSize, @NotNull Listener listener) {
        a(adData, listener);
    }

    protected void a(JSONObject jSONObject) {
        b("destroyAd");
    }

    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        b("collectBiddingData");
    }

    protected String a(String str) {
        String string = b().toString();
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        return string + " - " + str;
    }

    protected String a() {
        return a((String) null);
    }

    private void a(@NotNull AdData adData, @NotNull Listener listener) {
        this.f43756b = new WeakReference<>(listener);
        a(C4365ia.a(adData.getConfiguration()), C4365ia.a(adData.getAdUnitData()), adData);
    }
}
