package com.applovin.mediation.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f11715a;

    public MaxAppOpenAd(@NonNull String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f11715a.logApiCall("destroy()");
        this.f11715a.destroy();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f11715a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f11715a.isReady();
        this.f11715a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f11715a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f11715a.logApiCall("loadAd()");
        this.f11715a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11715a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11715a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f11715a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f11715a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(@NonNull String str, @Nullable String str2) {
        this.f11715a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f11715a.setExtraParameter(str, str2);
    }

    public void setListener(@Nullable MaxAdListener maxAdListener) {
        this.f11715a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f11715a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(@NonNull String str, @Nullable Object obj) {
        this.f11715a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11715a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11715a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11715a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(@Nullable MaxAdRevenueListener maxAdRevenueListener) {
        this.f11715a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11715a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    @NonNull
    public String toString() {
        return "" + this.f11715a;
    }

    @Deprecated
    public MaxAppOpenAd(@NonNull String str, @NonNull Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(@Nullable String str) {
        showAd(str, null);
    }

    @Deprecated
    public MaxAppOpenAd(@NonNull String str, @NonNull AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, k.o());
    }

    public void showAd(@Nullable String str, @Nullable String str2) {
        this.f11715a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        n7.b(str2, "MaxAppOpenAd");
        this.f11715a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f11715a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}
