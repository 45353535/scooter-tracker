package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4523rf implements LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4544t2.a().b(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public /* synthetic */ void onAdCollapsed(LevelPlayAdInfo levelPlayAdInfo) {
        i6.a.b(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public /* synthetic */ void onAdDisplayFailed(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError) {
        i6.a.c(this, levelPlayAdInfo, levelPlayAdError);
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4544t2.a().f(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public /* synthetic */ void onAdExpanded(LevelPlayAdInfo levelPlayAdInfo) {
        i6.a.e(this, levelPlayAdInfo);
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4544t2.a().c(Gf.f41012a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4544t2.a().a(Gf.f41012a.a(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4544t2.a().d(Gf.f41012a.a(adInfo));
    }
}
