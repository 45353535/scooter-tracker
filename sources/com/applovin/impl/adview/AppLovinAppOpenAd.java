package com.applovin.impl.adview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinInterstitialAdDialog f8244a = AppLovinInterstitialAd.create();

    public void setAdClickListener(@Nullable AppLovinAdClickListener appLovinAdClickListener) {
        this.f8244a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(@Nullable AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f8244a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(@Nullable AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f8244a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(@NonNull AppLovinAd appLovinAd) {
        this.f8244a.showAndRender(appLovinAd);
    }

    @NonNull
    public String toString() {
        return "AppLovinAppOpenAd{}";
    }
}
