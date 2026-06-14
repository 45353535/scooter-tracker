package com.appodeal.ads.adapters.admobmediation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.adapters.admobmediation.customevent.b;
import com.appodeal.ads.adapters.admobmediation.customevent.q;
import com.appodeal.ads.adapters.admobmediation.customevent.s;
import com.appodeal.ads.adapters.admobmediation.customevent.u;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class AppodealCustomEvent extends Adapter {
    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String[] strArrSplit = Appodeal.getVersion().split("\\.");
        return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = Appodeal.getVersion().split("\\.");
        return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt("0") + (Integer.parseInt(strArrSplit[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        initializationCompleteCallback.onInitializationSucceeded();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new b().a(mediationBannerAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new q().a(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        new s().a(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new u().a(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }
}
