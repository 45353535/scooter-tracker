package org.bidon.yandex.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterstitialAdLoader f97889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RewardedAdLoader f97890b;

    public static final class a implements InterstitialAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterstitialAdLoadListener f97891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterstitialAdLoader f97892b;

        a(InterstitialAdLoadListener interstitialAdLoadListener, InterstitialAdLoader interstitialAdLoader) {
            this.f97891a = interstitialAdLoadListener;
            this.f97892b = interstitialAdLoader;
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public void onAdFailedToLoad(AdRequestError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f97891a.onAdFailedToLoad(error);
            this.f97892b.setAdLoadListener(null);
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public void onAdLoaded(InterstitialAd interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            this.f97891a.onAdLoaded(interstitialAd);
            this.f97892b.setAdLoadListener(null);
        }
    }

    public static final class b implements RewardedAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RewardedAdLoadListener f97893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RewardedAdLoader f97894b;

        b(RewardedAdLoadListener rewardedAdLoadListener, RewardedAdLoader rewardedAdLoader) {
            this.f97893a = rewardedAdLoadListener;
            this.f97894b = rewardedAdLoader;
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdFailedToLoad(AdRequestError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f97893a.onAdFailedToLoad(error);
            this.f97894b.setAdLoadListener(null);
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdLoaded(RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            this.f97893a.onAdLoaded(rewarded);
            this.f97894b.setAdLoadListener(null);
        }
    }

    private final InterstitialAdLoader c(Context context) {
        InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(context);
        this.f97889a = interstitialAdLoader;
        return interstitialAdLoader;
    }

    private final RewardedAdLoader d(Context context) {
        RewardedAdLoader rewardedAdLoader = new RewardedAdLoader(context);
        this.f97890b = rewardedAdLoader;
        return rewardedAdLoader;
    }

    @Override // org.bidon.yandex.impl.g
    public void a(Context context, AdRequestConfiguration adRequestConfiguration, InterstitialAdLoadListener adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        InterstitialAdLoader interstitialAdLoaderC = this.f97889a;
        if (interstitialAdLoaderC == null) {
            interstitialAdLoaderC = c(context);
        }
        interstitialAdLoaderC.setAdLoadListener(new a(adLoadListener, interstitialAdLoaderC));
        interstitialAdLoaderC.loadAd(adRequestConfiguration);
    }

    @Override // org.bidon.yandex.impl.g
    public void b(Context context, AdRequestConfiguration adRequestConfiguration, RewardedAdLoadListener adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        RewardedAdLoader rewardedAdLoaderD = this.f97890b;
        if (rewardedAdLoaderD == null) {
            rewardedAdLoaderD = d(context);
        }
        rewardedAdLoaderD.setAdLoadListener(new b(adLoadListener, rewardedAdLoaderD));
        rewardedAdLoaderD.loadAd(adRequestConfiguration);
    }
}
