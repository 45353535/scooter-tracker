package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11718b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f11719c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f11720d = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxRewardedAdImpl f11721a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f11721a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, k.o());
    }

    public void destroy() {
        this.f11721a.logApiCall("destroy()");
        synchronized (f11719c) {
            f11718b.remove(this.f11721a.getAdUnitId());
        }
        this.f11721a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f11721a.logApiCall("getActivity()");
        return (Activity) f11720d.get();
    }

    public String getAdUnitId() {
        return this.f11721a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f11721a.isReady();
        this.f11721a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f11721a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f11721a.logApiCall("loadAd()");
        this.f11721a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11721a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11721a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        this.f11721a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f11721a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11721a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f11721a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f11721a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f11721a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11721a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11721a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11721a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11721a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11721a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11721a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f11721a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f11720d = new WeakReference((Activity) context);
                }
                synchronized (f11719c) {
                    try {
                        Map map = f11718b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        this.f11721a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        n7.b(str2, "MaxRewardedAd");
        this.f11721a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd((String) null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        this.f11721a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ", activity=" + activity + ")");
        this.f11721a.showAd(str, str2, viewGroup, lifecycle, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f11721a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        n7.b(str2, "MaxRewardedAd");
        this.f11721a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd((String) null, viewGroup, lifecycle);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(str, (String) null, viewGroup, lifecycle);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        this.f11721a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.f11721a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }
}
