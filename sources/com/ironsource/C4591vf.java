package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4591vf implements LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4295e8.a().b(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4295e8.a().c(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4295e8 c4295e8A = C4295e8.a();
        Gf gf2 = Gf.f41012a;
        c4295e8A.a(gf2.a(error), gf2.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4295e8.a().f(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public /* synthetic */ void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        j6.a.d(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4295e8.a().a(Gf.f41012a.a(error));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4295e8.a().e(Gf.f41012a.a(adInfo));
    }
}
