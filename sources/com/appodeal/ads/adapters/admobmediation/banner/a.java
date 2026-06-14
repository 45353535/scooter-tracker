package com.appodeal.ads.adapters.admobmediation.banner;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdView f11920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnifiedBannerCallback f11921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11922f;

    public a(AdView adView, UnifiedBannerCallback unifiedBannerCallback, int i10) {
        this.f11920d = adView;
        this.f11921e = unifiedBannerCallback;
        this.f11922f = i10;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f11921e.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onAdFailedToLoad(error);
        this.f11921e.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f11921e.onAdLoadFailed(UnifiedAdmobNetwork.mapError(error));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        ResponseInfo responseInfo = this.f11920d.getResponseInfo();
        ImpressionLevelData impressionLevelDataA = responseInfo != null ? com.appodeal.ads.adapters.admobmediation.a.a(responseInfo) : null;
        if (impressionLevelDataA != null) {
            AdView adView = this.f11920d;
            adView.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11921e, adView.getResponseInfo()));
            this.f11921e.onAdLoaded(this.f11920d, this.f11922f, impressionLevelDataA);
        } else {
            UnifiedBannerCallback unifiedBannerCallback = this.f11921e;
            LoadingError error = LoadingError.NoFill;
            Intrinsics.checkNotNullParameter(unifiedBannerCallback, "<this>");
            Intrinsics.checkNotNullParameter(error, "error");
            unifiedBannerCallback.printError("Admob Mediation - custom event price limit reached", Integer.valueOf(error.getCode()));
            unifiedBannerCallback.onAdLoadFailed(error);
        }
    }
}
