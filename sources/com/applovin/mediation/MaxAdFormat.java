package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w3;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import com.taurusx.tax.w.s.w;
import com.vungle.ads.internal.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11667b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat(w.f67531f, "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat(MobileFuseNativeAdKt.AD_TYPE, LogConstants.KEY_NATIVE);

    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    private MaxAdFormat(String str, String str2) {
        this.f11666a = str;
        this.f11667b = str2;
    }

    @Nullable
    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_APP_OPEN) || str.equalsIgnoreCase(FirebaseAnalytics.Event.APP_OPEN)) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("reward")) {
            return REWARDED;
        }
        o.h("AppLovinSdk", "Unknown ad format: " + str);
        return null;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f11667b;
    }

    public String getLabel() {
        return this.f11666a;
    }

    public AppLovinSdkUtils.Size getSize() {
        return this == BANNER ? new AppLovinSdkUtils.Size(320, 50) : this == LEADER ? new AppLovinSdkUtils.Size(728, 90) : this == MREC ? new AppLovinSdkUtils.Size(300, 250) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f11666a + "'}";
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i10, Context context) {
        return (this == BANNER || this == LEADER) ? w3.a(i10, this, context) : getSize();
    }
}
