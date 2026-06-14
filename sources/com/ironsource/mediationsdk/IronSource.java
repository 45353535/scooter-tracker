package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.N6;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class IronSource {

    public enum a {
        REWARDED_VIDEO(N6.G0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43753a;

        a(String str) {
            this.f43753a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f43753a;
        }
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return r.m().a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        r.m().e(str);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return r.m().a(context);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return r.m().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return r.m().j(str);
    }

    public static void loadISDemandOnlyBanner(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        r.m().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(@NotNull Activity activity, String str) {
        r.m().a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(@NotNull Activity activity, String str) {
        r.m().b(activity, str);
    }

    public static void setAdRevenueData(@NotNull String str, @NotNull JSONObject jSONObject) {
        r.m().a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        r.m().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        r.m().a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(String str) {
        r.m().g(str);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        r.m().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        r.m().a(str);
    }
}
